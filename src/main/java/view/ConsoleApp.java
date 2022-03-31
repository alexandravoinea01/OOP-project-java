package view;

import entities.clients.Client;
import entities.employees.Employee;
import services.ClientService;
import services.EmployeeService;

import java.util.Scanner;

public class ConsoleApp {
    private Scanner s = new Scanner(System.in);
    private EmployeeService employeeService = new EmployeeService();
    private ClientService clientService = new ClientService();

    public static void main(String args[]) {
        ConsoleApp app = new ConsoleApp();
        while (true) {
            app.showMenu();
            int option = app.readOption();
            app.execute(option);
        }
    }

    private void showMenu() {
        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println("0. Exit");
        System.out.println("1. See all employees");
        System.out.println("2. See more about an employee");
        System.out.println("3. Add an employee");
        System.out.println("4. Delete an employee");
        System.out.println("5. Filter employees by rating");
        System.out.println("6. Edit employee");
        System.out.println("7. See all clients");
        System.out.println("8. Add a client");
        System.out.println("9. Edit client");
        System.out.println("10. Delete client");
        System.out.println();

    }

    private int readOption() {
        try {
            int option = s.nextInt();
            if (option >= 0 && option <= 10)
                return option;
        }
        catch (Exception e) {
            System.out.println("Invalid option, please try again");
        }
        return readOption();
    }

    private void execute(int option) {
        switch (option) {
            case 0:
                System.exit(0);
            case 1:
                seeEmployees();
                break;
            case 2:
                seeDetails();
                break;
            case 3:
                addEmployee();
                break;
            case 4:
                deleteEmployee();
                break;
            case 5:
                filterEmployeesByRating();
                break;
            case 6:
                editEmployee();
                break;
            case 7:
                seeClients();
                break;
            case 8:
                addClient();
                break;
            case 9:
                editClient();
                break;
            case 10:
                deleteClient();
                break;
        }
    }

    private void seeEmployees() {
        for (Employee e : employeeService.listEmployees()) {
            System.out.println("ID: " + (employeeService.listEmployees().indexOf(e) + 1));
            System.out.println("Name: " + e.getName());
            System.out.println();
        }
    }

    private void seeDetails() {
        System.out.println("Insert the id of the employee you want to edit:");
        int id = s.nextInt();
        Employee e = employeeService.showDetails(id - 1);
        System.out.println("ID: " + (id + 1));
        System.out.println("Name: " + e.getName());
        System.out.println("Rating: " + e.getRating());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Specialization: " + e.getSpecialization());
        System.out.println();
    }

    private void addEmployee() {
        System.out.print("Name: ");
        String names = s.nextLine();
        String name = s.nextLine();
        System.out.print("Specialization: ");
        String specialization = s.nextLine();
        System.out.print("Rating: ");
        float rating = s.nextFloat();
        while (rating < 1 || rating > 10) {
            System.out.println("Invalid rating, please enter a value from 1 to 10");
            rating = s.nextFloat();
        }
        System.out.print("Salary: ");
        double salary = s.nextDouble();
        employeeService.addNewEmployee(name, rating, salary, specialization);
    }

    private void deleteEmployee() {
        System.out.println("Insert the id of the employee you want to delete: ");
        int id = s.nextInt();
        if (id <= employeeService.listEmployees().size() && id >= 1)
            employeeService.deleteEmployee(id-1);
        else {
            System.out.println("The employee doesn't exist, try again");
            deleteEmployee();
        }
    }

    private void filterEmployeesByRating() {
        System.out.println("Insert the minimum rating for the employees you want to see: ");
        float rating = s.nextFloat();
        while (rating < 1 || rating > 10) {
            System.out.println("Invalid rating, please enter a value from 1 to 10");
            rating = s.nextFloat();
        }
        for (Employee e : employeeService.employeesWithRatingOver(rating)){
            System.out.println(e.getName() + " (" + e.getRating() + ").");
        }
    }

    private void editEmployee() {
        System.out.print("Insert the id of the employee you want to edit: ");
        int id = s.nextInt();
        System.out.print("Name: ");
        String names = s.nextLine();
        String name = s.nextLine();
        System.out.print("Specialization: ");
        String specialization = s.nextLine();
        System.out.print("Rating: ");
        float rating = s.nextFloat();
        while (rating < 1 || rating > 10) {
            System.out.println("Invalid rating, please enter a value from 1 to 10");
            rating = s.nextFloat();
        }
        System.out.print("Salary: ");
        double salary = s.nextDouble();
        employeeService.updateEmployee(id - 1, name, rating, salary, specialization);
    }

    private void seeClients() {
        for (Client c : clientService.listClients()) {
            System.out.println("Name: " + c.getName());
            System.out.println("Age: " + c.getAge());
            System.out.println("Sex: " + c.getSex());
            System.out.println("Mail: " + c.getMail());
            System.out.println();
        }
    }

    private void addClient() {
        System.out.print("Name: ");
        String names = s.nextLine();
        String name = s.nextLine();
        System.out.print("Sex: ");
        String sex = s.nextLine();
        System.out.print("Age: ");
        int age = s.nextInt();
        System.out.print("Mail: ");
        String mails = s.nextLine();
        String mail = s.nextLine();
        clientService.addNewClient(name, age, sex, mail);
    }

    private void editClient() {
        System.out.print("Insert the id of the client you want to edit: ");
        int id = s.nextInt();
        System.out.print("Name: ");
        String names = s.nextLine();
        String name = s.nextLine();
        System.out.print("Sex: ");
        String sex = s.nextLine();
        System.out.print("Age: ");
        int age = s.nextInt();
        System.out.print("Mail: ");
        String mails = s.nextLine();
        String mail = s.nextLine();
        clientService.updateClient(id - 1, name, age, sex, mail);
    }

    private void deleteClient() {
        System.out.println("Insert the id of the client you want to delete: ");
        int id = s.nextInt();
        if (id <= clientService.listClients().size() && id >= 1)
            clientService.deleteClient(id-1);
        else {
            System.out.println("The client doesn't exist, try again");
            deleteClient();
        }
    }
}
