package entities.employees;

public class Employee {
    protected String name;
    protected float rating;
    protected double salary;
    protected String specialization;

    public Employee() {
        this.name = "";
        this.rating = 0;
        this.salary = 0;
        this.specialization = "";
    }

    public Employee(String name, float rating, double salary, String specialization) {
        this.name = name;
        this.rating = rating;
        this.salary = salary;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
