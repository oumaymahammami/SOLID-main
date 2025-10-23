package com.directi.training.srp.tp;

public class Car {
    private final String id;
    private final String model;
    private final String brand;

    public Car(String id, String model, String brand) {
        this.id = id;
        this.model = model;
        this.brand = brand;
    }

    public String getId() { return id; }
    public String getModel() { return model; }
    public String getBrand() { return brand; }
}

