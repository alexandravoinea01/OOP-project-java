package io;

import java.io.IOException;
import java.text.ParseException;

public interface GenericIO {
    public void read() throws IOException, ParseException;
    public void write() throws IOException;
}
