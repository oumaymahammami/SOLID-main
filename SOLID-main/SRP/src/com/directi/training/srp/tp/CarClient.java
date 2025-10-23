package com.directi.training.srp.tp;

import java.util.List;
import java.util.logging.Logger;

public class CarClient {
    private static final Logger LOGGER = Logger.getLogger(CarClient.class.getName());

    public static void main(String[] args) {
        CarRepository repo = new CarRepository();
        CarService service = new CarService();

        List<Car> cars = repo.getAllCars();
        LOGGER.info("Cars: " + CarFormatter.getCarsNames(cars));

        Car best = service.getBestCar(cars);
        LOGGER.info("Best: " + (best != null ? best.getBrand() + " " + best.getModel() : "none"));
    }
}
