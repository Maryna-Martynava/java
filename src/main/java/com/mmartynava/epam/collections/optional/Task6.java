package com.mmartynava.epam.collections.optional;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.

public class Task6 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("data/input.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}