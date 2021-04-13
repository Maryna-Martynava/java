package com.mmartynava.epam.fundamentals.optional.task2;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask {

    public static void main(String[] args) {
        int width = new Scanner(System.in).nextInt();
        int hight = new Scanner(System.in).nextInt();
        int[][] matrix = new int[width][hight];
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = (int) (Math.random() * 200 - 100);
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        sort(matrix);

        printArray(width, hight, matrix);
    }

    public static void sort(int[][] matrix) {
        Arrays.asList(matrix).forEach(Arrays::sort);
    }

    private static void printArray(int width, int hight, int[][] matrix) {
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}













