package repositories.employeesRepositories;

import entities.employees.Employee;
import repositories.GenericRepository;

import java.util.ArrayList;

public class EmployeeRepository implements GenericRepository<Employee> {
    private static ArrayList<Employee> employees = new ArrayList<Employee>();

    @Override
    public void add(Employee entity) {
        employees.add(entity);
    }

    @Override
    public Employee get(int id) {
        return employees.get(id);
    }

    @Override
    public void update(Employee entity, Employee newEntity) {
        for (int i=0; i<employees.size(); i++)
            if (employees.get(i) == entity) {
                employees.set(i, newEntity);
                return;
            }
    }

    @Override
    public void delete(Employee entity) {
        employees.remove(entity);
    }

    @Override
    public int getSize() {
        return employees.size();
    }
}
