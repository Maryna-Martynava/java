package com.mmartynava.epam.collections.task.cars;

public class Car {

    private int price;

    private int fuelConsumption;

    private int speed;

    public Car(int price, int fuelConsumption, int speed) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "---" +
                "Цена=" + price +
                "$, Расход топлива=" + fuelConsumption +
                "л/100км, Скорость=" + speed +
                "км/час";
    }
}