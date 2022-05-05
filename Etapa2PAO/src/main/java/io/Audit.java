package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class Audit {
    private static Audit instance;
    private File csvFile = new File("src\\main\\resources\\audit.csv");
    private FileWriter fileWriter = new FileWriter(csvFile);
    private Audit() throws IOException {}

    public static Audit getInstance() throws IOException {
        if (instance == null)
            instance = new Audit();
        return instance;
    }

    public void writeActions(String action) throws IOException {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        StringBuilder line = new StringBuilder();
        line.append(action);
        line.append(",");
        line.append(timestamp);
        line.append("\n");
        fileWriter.write(line.toString());
    }

    public void closeFileWriter() throws IOException {
        fileWriter.close();
    }

}
