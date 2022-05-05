package io;

import entities.organization.Supplier;
import repositories.organizationRepositories.SupplierRepository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SupplierIO implements GenericIO {
    private static SupplierIO instance;

    private SupplierIO() {}

    public static SupplierIO getInstance() {
        if (instance == null)
            instance = new SupplierIO();
        return instance;
    }

    SupplierRepository supplierRepository = new SupplierRepository();

    @Override
    public void read() throws IOException, ParseException {
        Scanner sc = new Scanner(new File("src\\main\\resources\\suppliers.csv"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] values = line.split(",");
            Date startDate = new SimpleDateFormat("dd.MM.yyyy").parse(values[1]);
            Date endDate = new SimpleDateFormat("dd.MM.yyyy").parse(values[2]);
            String[] materials = values[3].split(" ");
            Supplier supplier = new Supplier(values[0], startDate, endDate, materials);
            supplierRepository.add(supplier);
        }
        sc.close();
    }

    @Override
    public void write() throws IOException {
        String[][] suppliers = {
                {"Supplier1", "11.11.2011", "20.03.2017", "dyes nail-polish"},
                {"Supplier2", "12.12.2012", "13.10.2014", "combs scissors"},

        };
        File csvFile = new File("src\\main\\resources\\suppliers.csv");
        FileWriter fileWriter = new FileWriter(csvFile);
        for (String[] data : suppliers) {
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
