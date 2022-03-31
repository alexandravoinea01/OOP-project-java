package repositories.organizationRepositories;

import entities.organization.Service;
import repositories.GenericRepository;

import java.util.ArrayList;

public class ServiceRepository implements GenericRepository<Service> {
    private ArrayList<Service> services = new ArrayList<Service>();

    @Override
    public void add(Service entity) {
        services.add(entity);
    }

    @Override
    public Service get(int id) {
        return services.get(id);
    }

    @Override
    public void update(Service entity, Service newEntity) {
        for (int i=0; i<services.size(); i++)
            if (services.get(i) == entity) {
                services.set(i, newEntity);
                return;
            }
    }

    @Override
    public void delete(Service entity) {
        services.remove(entity);
    }

    @Override
    public int getSize() {
        return services.size();
    }
}
