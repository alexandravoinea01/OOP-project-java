package repositories.clientsRepositories;

import entities.clients.Client;
import entities.clients.LoyalClient;
import repositories.GenericRepository;

import java.util.Arrays;

public class LoyalClientRepository implements GenericRepository<LoyalClient> {
    LoyalClient[] loyalClients = new LoyalClient[10];

    @Override
    public void add(LoyalClient entity) {
        for (int i=0; i<loyalClients.length; i++) {
            if (loyalClients[i] == null) {
                loyalClients[i] = entity;
                return;
            }
        }

        LoyalClient[] newloyalClients = Arrays.<LoyalClient, LoyalClient>copyOf(loyalClients, 5+loyalClients.length, LoyalClient[].class);
        newloyalClients[loyalClients.length] = entity;
        loyalClients = newloyalClients;
    }

    @Override
    public LoyalClient get(int id) {
        return loyalClients[id];
    }

    @Override
    public void update(LoyalClient entity, LoyalClient newEntity) {
        for (int i=0; i<loyalClients.length; i++)
            if (loyalClients[i] == entity) {
                loyalClients[i] = newEntity;
                return;
            }
    }

    @Override
    public void delete(LoyalClient entity) {
        for (int i=0; i<loyalClients.length; i++)
            if (loyalClients[i] == entity) {
                loyalClients[i] = null;
                return;
            }
    }

    @Override
    public int getSize() {
        return loyalClients.length;
    }
}
