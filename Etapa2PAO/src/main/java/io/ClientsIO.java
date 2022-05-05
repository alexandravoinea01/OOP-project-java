package io;

import entities.clients.Client;
import repositories.clientsRepositories.ClientRepository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ClientsIO implements GenericIO{
    private static ClientsIO instance;

    private ClientsIO(){}

    public static ClientsIO getInstance() {
        if (instance == null)
            instance = new ClientsIO();
        return instance;
    }

    ClientRepository clientRepository = new ClientRepository();

    @Override
    public void read() throws IOException {
        Scanner sc = new Scanner(new File("src\\main\\resources\\clients.csv"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] values = line.split(",");
            Client client = new Client(values[0], Integer.parseInt(values[1]), values[2], values[3]);
            clientRepository.add(client);
        }
        sc.close();
    }

    @Override
    public void write() throws IOException {
        String[][] clients = {
                {"John Doe", "20", "Male", "raducanu@mail.com"},
                {"Test", "35", "Female", "test@test.com"}
        };
        File csvFile = new File("src\\main\\resources\\clients.csv");
        FileWriter fileWriter = new FileWriter(csvFile);
        for (String[] data : clients) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                line.append(data[i]);
                if (i != data.length - 1) {
                    line.append(',');
                }
            }
            line.append("\n");
            fileWriter.write(line.toString());
        }
        fileWriter.close();
    }
}
