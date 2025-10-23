package com.directi.training.srp.tp;

import java.util.List;

public class CarService {
    public Car getBestCar(List<Car> cars) {
        if (cars == null || cars.isEmpty()) {
            return null;
        }
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
