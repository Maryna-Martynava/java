package com.mmartynava.epam.collections.task;

import java.util.Scanner;

public class LaunchCars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число автомобилей в Таксопарке:");
        int n = scanner.nextInt();

        if (n > 0) {

            TaxiStation taxiStation = new TaxiStation(n);

            while (true) {
                System.out.println("Меню таксопарка:");
                System.out.println("1) Добавить автомобиль");
                System.out.println("2) Вывести список автомобилей");
                System.out.println("3) Отсортировать автомобили по расходу топлива и вывести");
                System.out.println("4) Вывести общую стоимость автопарка");
                System.out.println("5) Найти автомобили соответствующие заданному диапазону параметров скорости");
                System.out.println("0) Закрыть програму");
                System.out.print("Введите число: ");
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println();
                        taxiStation.addCar();
                        break;
                    case 2:
                        System.out.println();
                        taxiStation.printCars();
                        break;
                    case 3:
                        System.out.println();
                        taxiStation.sortCarFuelConsumption();
                        taxiStation.printCars();
                        break;
                    case 4:
                        System.out.println("\nСтоимость автопарка: " + taxiStation.getPrice() + "$" + "\n");
                        break;
                    case 5:
                        System.out.println();
                        taxiStation.findCarWithGivenRangeSpeed();
                        break;
                    case 0:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Введено не верное число!");
                }

            }
        } else System.out.println("Количество автомобилей не может быть отрицательным или нулевым!");
    }

}
