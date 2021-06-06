package com.mmartynava.epam.collections.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Занести стихотворение в список. Провести сортировку по возрастанию длин строк.

public class Task4 {
    private static final String POEM =
            "Two roads diverged in a yellow wood,\n"+
                    "And sorry I could not travel both\n"+
                    "And be one traveler, long I stood\n"+
                    "And looked down one as far as I could\n"+
                    "To where it bent in the undergrowth.\n";

    private static final Comparator<String> LINE_LENGTH_COMPARATOR = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    public static void main(String[] args) {
        List<String> lines = Arrays.asList(POEM.split("\n"));
        System.out.println(lines);

        Collections.sort(lines, LINE_LENGTH_COMPARATOR);
        System.out.println(lines);
    }
}