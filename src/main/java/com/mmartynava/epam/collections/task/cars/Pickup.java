package com.mmartynava.epam.collections.task.cars;

public class Pickup extends Car {
    public Pickup(int price, int fuelConsumption, int speed) {
        super(price, fuelConsumption, speed);
    }

    @Override
    public String toString() {
        return "Пикап" + super.toString();
    }
}