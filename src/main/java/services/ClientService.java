package services;

import entities.clients.Client;
import repositories.clientsRepositories.ClientRepository;

import java.util.ArrayList;

public class ClientService {
    private ClientRepository clientRepository = new ClientRepository();

    public void addNewClient(String name, int age, String sex, String mail) {
        Client client = new Client(name, age, sex, mail);
        clientRepository.add(client);
    }

    public ArrayList<Client> listClients() {
        ArrayList<Client> clients = new ArrayList<Client>();
        for (int i=0; i< clientRepository.getSize(); i++) {
            if (clientRepository.get(i) != null) {
                clients.add(clientRepository.get(i));
            }
        }
        return clients;
    }

    public void updateClient(int id, String name, int age, String sex, String mail) {
        Client oldClient = clientRepository.get(id);
        Client newClient = new Client(name, age, sex, mail);
        clientRepository.update(oldClient, newClient);
    }

    public void deleteClient(int id) {
        Client client = clientRepository.get(id);
        clientRepository.delete(client);
    }
}
