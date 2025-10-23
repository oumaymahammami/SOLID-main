package com.directi.training.dip.tp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderImpl implements Reader
{
    private String fileName;
    public FileReaderImpl(String fileName) { this.fileName = fileName; }

    @Override
    public String read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        reader.close();
        return sb.toString();
    }
}
