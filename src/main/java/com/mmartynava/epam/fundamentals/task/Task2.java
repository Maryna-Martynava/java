package com.mmartynava.epam.fundamentals.task;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        Collections.reverse(Arrays.asList(args));
        System.out.println("Reversed array: " + Arrays.toString(args));
    }
}

