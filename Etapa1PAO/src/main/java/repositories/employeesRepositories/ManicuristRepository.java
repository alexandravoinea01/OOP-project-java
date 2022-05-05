package repositories.employeesRepositories;

import entities.employees.Manicurist;
import repositories.GenericRepository;

import java.util.ArrayList;

public class ManicuristRepository implements GenericRepository<Manicurist> {
    private ArrayList<Manicurist> manicurists = new ArrayList<Manicurist>();

    @Override
    public void add(Manicurist entity) {
        manicurists.add(entity);
    }

    @Override
    public Manicurist get(int id) {
        return manicurists.get(id);
    }

    @Override
    public void update(Manicurist entity, Manicurist newEntity) {
        for (int i=0; i<manicurists.size(); i++)
            if (manicurists.get(i) == entity) {
                manicurists.set(i, newEntity);
                return;
            }
    }

    @Override
    public void delete(Manicurist entity) {
        manicurists.remove(entity);
    }

    @Override
    public int getSize() {
        return manicurists.size();
    }
}
