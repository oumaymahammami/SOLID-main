package com.directi.training.dip.tp;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {

        Reader fileReader = new FileReaderImpl("beforeEncryption.txt");
        Writer fileWriter = new FileWriterImpl("afterEncryption.txt");
        EncodingModule fileEncoder = new EncodingModule(fileReader, fileWriter);
        fileEncoder.encode();


        Reader networkReader = new NetworkReader("http://myfirstappwith.appspot.com/index.html");
        Writer dbWriter = new DatabaseWriter();
        EncodingModule networkEncoder = new EncodingModule(networkReader, dbWriter);
        networkEncoder.encode();
    }
}
