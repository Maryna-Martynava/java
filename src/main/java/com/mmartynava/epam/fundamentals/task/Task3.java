package com.mmartynava.epam.fundamentals.task;

import java.util.concurrent.ThreadLocalRandom;

//  Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class Task3 {
    public static void main(String[] args) {

        String str = new String();

        for (int i = 0; i < 10; i++) {
            str += ThreadLocalRandom.current().nextInt(1, 20) + " ";
        }
        for (int i = 0; i < 10; i++) {
            str += "\n" + ThreadLocalRandom.current().nextInt(30, 50);
        }

        System.out.println(str);
    }

}

