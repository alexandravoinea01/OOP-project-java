package services;

import entities.organization.Service;
import repositories.organizationRepositories.ServiceRepository;

import java.util.ArrayList;

public class ServiceService {
    private ServiceRepository serviceRepository = new ServiceRepository();

    public void addNewService(String name, float price) {
        Service service = new Service(name, price);
        serviceRepository.add(service);
    }

    public ArrayList<Service> listServices() {
        ArrayList<Service> services = new ArrayList<Service>();
        for (int i=0; i<serviceRepository.getSize(); i++) {
            services.add(serviceRepository.get(i));
        }
        return services;
    }
}
