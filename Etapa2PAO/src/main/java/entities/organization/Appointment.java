package entities.organization;

import entities.clients.Client;
import entities.employees.Employee;

import java.util.Date;

public class Appointment {
    private Client client;
    private Date date = new Date();
    private Service service;
    private Employee employee;

    public Appointment() {
        this.client = new Client();
        this.service = new Service();
        this.employee = new Employee();
    }

    public Appointment(Client client, Date date, Service service, Employee employee) {
        this.client = client;
        this.date = date;
        this.service = service;
        this.employee = employee;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
