package repositories.employeesRepositories;

import entities.employees.Hairstylist;
import repositories.GenericRepository;

import java.util.ArrayList;

public class HairstylistRepository implements GenericRepository<Hairstylist> {
    private ArrayList<Hairstylist> hairstylists = new ArrayList<Hairstylist>();

    @Override
    public void add(Hairstylist entity) {
        hairstylists.add(entity);
    }

    @Override
    public Hairstylist get(int id) {
        return hairstylists.get(id);
    }

    @Override
    public void update(Hairstylist entity, Hairstylist newEntity) {
        for (int i=0; i<hairstylists.size(); i++)
            if (hairstylists.get(i) == entity) {
                hairstylists.set(i, newEntity);
                return;
            }
    }

    @Override
    public void delete(Hairstylist entity) {
        hairstylists.remove(entity);
    }

    @Override
    public int getSize() {
        return hairstylists.size();
    }
}
