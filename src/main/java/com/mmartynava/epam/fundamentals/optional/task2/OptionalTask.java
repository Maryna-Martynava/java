package com.mmartynava.epam.fundamentals.optional.task2;

import java.util.Arrays;
import java.util.Scanner;

//Ввести с консоли n - размерность матрицы a [n] [n].
//Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
//Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

public class OptionalTask {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        int width = new Scanner(System.in).nextInt();
        System.out.println("Enter the number of columns: ");
        int hight = new Scanner(System.in).nextInt();
        if(width!=hight){
           throw new ArrayIndexOutOfBoundsException("Matrix is not square");
        }
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












