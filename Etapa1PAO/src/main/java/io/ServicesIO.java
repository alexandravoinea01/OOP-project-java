package io;

import entities.organization.Service;
import repositories.organizationRepositories.ServiceRepository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ServicesIO implements GenericIO{
    private static ServicesIO instance;

    private ServicesIO(){}

    public static ServicesIO getInstance() {
        if (instance == null)
            instance = new ServicesIO();
        return instance;
    }

    ServiceRepository serviceRepository = new ServiceRepository();

    @Override
    public void read() throws IOException {
        Scanner sc = new Scanner(new File("src\\main\\resources\\services.csv"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] values = line.split(",");
            Service service = new Service(values[0], Float.parseFloat(values[1]));
            serviceRepository.add(service);
        }
        sc.close();
    }

    @Override
    public void write() throws IOException {
        String[][] services = {
                {"Nails", "25"},
                {"Hairstyle", "35"},
                {"Massage", "70"},
                {"Haircut", "30"},
        };
        File csvFile = new File("src\\main\\resources\\services.csv");
        FileWriter fileWriter = new FileWriter(csvFile);
        for (String[] data : services) {
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
