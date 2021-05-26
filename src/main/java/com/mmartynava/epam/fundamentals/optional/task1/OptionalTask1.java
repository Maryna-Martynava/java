package com.mmartynava.epam.fundamentals.optional.task1;

import java.util.Scanner;

//Ввести n чисел с консоли.
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class OptionalTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите числа:");
        String line = scan.nextLine();
        String longNumber = "", shortNumber = line;
        for (String s : line.split(" ")) {
            if (s.length() > longNumber.length()) longNumber = s;
            if (s.length() < shortNumber.length()) shortNumber = s;
        }
        System.out.println("Самое длинное число: '" + longNumber + "'");
        System.out.println("Длина: " + longNumber.length());
        System.out.println("Самое короткое число: '" + shortNumber + "'");
        System.out.println("Длина: " + shortNumber.length());
    }
}
