package repositories.clientsRepositories;

import entities.clients.Client;
import repositories.GenericRepository;

import java.util.Arrays;

public class ClientRepository implements GenericRepository<Client> {

    private static Client[] clients = new Client[10];

    @Override
    public void add(Client entity) {
        for (int i=0; i<clients.length; i++) {
            if (clients[i] == null) {
                clients[i] = entity;
                return;
            }
        }

        Client[] newclients = Arrays.<Client, Client>copyOf(clients, 5+clients.length, Client[].class);
        newclients[clients.length] = entity;
        clients = newclients;
    }

    @Override
    public Client get(int id) {
        return clients[id];
    }

    @Override
    public void update(Client entity, Client newEntity) {
        for (int i=0; i<clients.length; i++)
            if (clients[i] == entity) {
                clients[i] = newEntity;
                return;
            }
    }

    @Override
    public void delete(Client entity) {
        for (int i=0; i<clients.length; i++)
            if (clients[i] == entity) {
                clients[i] = null;
                return;
            }
    }

    @Override
    public int getSize() {
        return clients.length;
    }
}
