package repositories.organizationRepositories;

import entities.organization.Supplier;
import repositories.GenericRepository;

import java.util.ArrayList;

public class SupplierRepository implements GenericRepository<Supplier> {
    private static ArrayList<Supplier> suppliers = new ArrayList<Supplier>();

    @Override
    public void add(Supplier entity) {
        suppliers.add(entity);
    }

    @Override
    public Supplier get(int id) {
        return suppliers.get(id);
    }

    @Override
    public void update(Supplier entity, Supplier newEntity) {
        for (int i=0; i<suppliers.size(); i++)
            if (suppliers.get(i) == entity) {
                suppliers.set(i, newEntity);
                return;
            }
    }

    @Override
    public void delete(Supplier entity) {
        suppliers.remove(entity);
    }

    @Override
    public int getSize() {
        return suppliers.size();
    }
}
