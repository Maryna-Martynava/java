package com.mmartynava.epam.fundamentals.optional.task1;

import java.util.Scanner;

public class OptionalTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Input %d element: ", i);
            arr[i] = scan.nextInt();
        }
        for (int elem : arr) {
            if (isDistinct(elem)) {
                System.out.println(elem);
                System.exit(0);
            }
        }
    }

    private static boolean isDistinct(int x) {
        String s = String.valueOf(x);
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }
}
