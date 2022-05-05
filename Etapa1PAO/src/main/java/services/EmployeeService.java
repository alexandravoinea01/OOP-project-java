package services;

import entities.employees.Employee;
import repositories.employeesRepositories.EmployeeRepository;

import java.util.ArrayList;

public class EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    public void addNewEmployee(String name, float rating, double salary, String specialization) {
        Employee employee = new Employee(name, rating, salary, specialization);
        employeeRepository.add(employee);
    }

    public Employee showDetails(int id) {
        return employeeRepository.get(id);
    }

    public void deleteEmployee(int id) {
        Employee employee = employeeRepository.get(id);
        employeeRepository.delete(employee);
    }

    public ArrayList<Employee> listEmployees() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (int i=0; i<employeeRepository.getSize(); i++) {
            employees.add(employeeRepository.get(i));
        }
        return employees;
    }

    public ArrayList<Employee> employeesWithRatingOver(float over) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (int i=0; i<employeeRepository.getSize(); i++) {
            if (employeeRepository.get(i).getRating() > over)
                employees.add(employeeRepository.get(i));
        }
        return employees;
    }

    public void updateEmployee(int id, String name, float rating, double salary, String specialization) {
        Employee oldEmployee = employeeRepository.get(id);
        Employee newEmployee = new Employee(name, rating, salary, specialization);
        employeeRepository.update(oldEmployee, newEmployee);
    }
}
