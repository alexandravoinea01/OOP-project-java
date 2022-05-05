package services;

import entities.organization.Supplier;
import repositories.organizationRepositories.SupplierRepository;

import java.util.ArrayList;

public class SupplierService {
    private SupplierRepository supplierRepository = new SupplierRepository();

    public ArrayList<Supplier> listSuppliers() {
        ArrayList<Supplier> suppliers = new ArrayList<>();
        for (int i=0; i<supplierRepository.getSize(); i++){
            suppliers.add(supplierRepository.get(i));
        }
        return suppliers;
    }
}
