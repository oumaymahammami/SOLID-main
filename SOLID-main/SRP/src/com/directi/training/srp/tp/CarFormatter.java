package com.directi.training.srp.tp;

import java.util.List;

public final class CarFormatter {
    private CarFormatter() { }

    public static String getCarsNames(List<Car> cars) {
        if (cars == null || cars.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand()).append(" ").append(car.getModel()).append(", ");
        }
        if (sb.length() >= 2) sb.setLength(sb.length() - 2);
        return sb.toString();
    }
}

