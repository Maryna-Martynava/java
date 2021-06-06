package com.mmartynava.epam.collections.task;

import com.mmartynava.epam.collections.task.cars.Cabriolet;
import com.mmartynava.epam.collections.task.cars.Car;
import com.mmartynava.epam.collections.task.cars.Pickup;
import com.mmartynava.epam.collections.task.cars.Sedan;

import java.util.Scanner;

public class TaxiStation {

    private Car[] taxiStation;

    private int index = 0;

    private int price = 0;

    Scanner scanner = new Scanner(System.in);

    public TaxiStation(int n) {
        this.taxiStation = new Car[n];
    }

    public void addCar(){
        if(index<taxiStation.length){
            System.out.println("Выберите автомобиль \n");
            System.out.println("1)Седан ");
            System.out.println("2)Кабриолет ");
            System.out.println("3)Пикап \n");
            System.out.print("Введите номер автомобиля: ");
            int number = scanner.nextInt();

            switch (number){
                case 1:
                    taxiStation[index] = new Sedan(9_000,7,220);
                    price += taxiStation[index].getPrice();
                    index++;
                    break;
                case 2:
                    taxiStation[index] = new Cabriolet(200_000, 15,395);
                    price += taxiStation[index].getPrice();
                    index++;
                    break;
                case 3:
                    taxiStation[index] = new Pickup(25_000,20,195);
                    price += taxiStation[index].getPrice();
                    index++;
                    break;
                default:
                    System.out.println("Введено не верное число!!");
            }
        } else System.out.println("В таксопарке уже максимальное количество автомобилей!");

        System.out.println();

    }

    public int getPrice() {
        return price;
    }

    public void sortCarFuelConsumption(){
        for (int j=0; j<index-1;j++){
            for(int i=j+1; i<index;i++){
                if(taxiStation[i].getFuelConsumption()<taxiStation[j].getFuelConsumption()){
                    Car a = taxiStation[j];
                    taxiStation[j]=taxiStation[i];
                    taxiStation[i]=a;
                }
            }
        }
    }

    public void printCars() {
        for (int i=0; i<index;i++) {
            System.out.println(taxiStation[i].toString());
        }
        System.out.println();
    }

    public void findCarWithGivenRangeSpeed(){
        int min, max;
        System.out.print("Введите минимальную скорость автомобиля: ");
        min=scanner.nextInt();
        System.out.print("Введите максимальную скорость автомобиля: ");
        max=scanner.nextInt();
        for (int i=0; i<index;i++) {
            if(taxiStation[i].getSpeed()>=min && taxiStation[i].getSpeed()<=max){
                System.out.println(taxiStation[i].toString());
            }
        }

        System.out.println();

    }
}