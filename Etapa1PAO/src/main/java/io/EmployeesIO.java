package io;

import entities.employees.Employee;
import repositories.employeesRepositories.EmployeeRepository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeesIO implements GenericIO{
    private static EmployeesIO instance;

    private EmployeesIO(){}

    public static EmployeesIO getInstance() {
        if (instance == null)
            instance = new EmployeesIO();
        return instance;
    }

    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void read() throws IOException {
        Scanner sc = new Scanner(new File("src\\main\\resources\\employees.csv"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] values = line.split(",");
            Employee employee = new Employee(values[0], Float.parseFloat(values[1]), Double.parseDouble(values[2]), values[3]);
            employeeRepository.add(employee);
        }
        sc.close();
    }

    @Override
    public void write() throws IOException{
        String[][] employees = {
                {"Voinea Alexandra", "10", "4000", "Manager"},
                {"Popescu Maria", "8.5", "2000", "Hairstylist"},
        };
        File csvFile = new File("src\\main\\resources\\employees.csv");
        FileWriter fileWriter = new FileWriter(csvFile);
        for (String[] data : employees) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                line.append(data[i]);
                if (i != data.length - 1) {
                    line.append(',');
                }
            }
            line.append("\n");
            fileWriter.write(line.toString());
        }
        fileWriter.close();
    }
}
