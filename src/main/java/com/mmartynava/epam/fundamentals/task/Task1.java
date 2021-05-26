package com.mmartynava.epam.fundamentals.task;

import java.util.Scanner;

// Приветствовать любого пользователя при вводе его имени через командную строку.

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(String.format("Hello, %s!", name));
        in.close();
    }
}
