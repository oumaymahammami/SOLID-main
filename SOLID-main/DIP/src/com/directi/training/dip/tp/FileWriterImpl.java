package com.directi.training.dip.tp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterImpl implements Writer
{
    private String fileName;
    public FileWriterImpl(String fileName) { this.fileName = fileName; }

    @Override
    public void write(String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(data);
        writer.close();
    }
}

