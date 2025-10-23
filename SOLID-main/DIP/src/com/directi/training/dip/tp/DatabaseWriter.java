package com.directi.training.dip.tp;

import java.io.IOException;
import com.directi.training.dip.exercise.MyDatabase;

// Écriture dans la base de données
public class DatabaseWriter implements Writer
{
    private MyDatabase database = new MyDatabase();

    @Override
    public void write(String data) throws IOException {
        database.write(data);
    }
}

