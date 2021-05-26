package com.mmartynava.epam.fundamentals.optional.task1;
import java.util.Scanner;

//Ввести n чисел с консоли.
//Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

public class OptionalTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double avg = 0;
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Input %d element: ", i);
            arr[i] = scan.nextLine();
        }
        for (String s : arr) {
            avg += s.length();
        }
        if (arr.length > 0) avg /= arr.length;
        System.out.printf("Средняя длина введенных чисел: %.2f", avg);
        System.out.println("\nЧисла с длиной больше среднего:");
        for (String s : arr) {
            if (s.length() > avg) System.out.println(s + " Длина: " + s.length());
        }
        System.out.println("Числа с длиной меньше среднего:");
        for (String s : arr) {
            if (s.length() < avg) System.out.println(s + " Длина: " + s.length());
        }
    }
}