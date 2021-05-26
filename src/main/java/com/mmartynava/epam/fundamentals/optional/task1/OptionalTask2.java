package com.mmartynava.epam.fundamentals.optional.task1;
import java.util.Arrays;
import java.util.Scanner;

//Ввести n чисел с консоли.
//Вывести числа в порядке возрастания (убывания) значений их длины.

public class OptionalTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Input %d element: ", i);
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Элементы в обратном порядке");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}


