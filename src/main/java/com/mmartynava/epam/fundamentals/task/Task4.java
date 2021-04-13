package com.mmartynava.epam.fundamentals.task;
public class Task4 {
    public static void main(String[] args) {
        int num = 0;
        int n = 1;
        for(int i=0; i<args.length; i++){
            num+= Integer.parseInt(args[i]);
        }
        for(int i=0; i<args.length; i++){
            n*= Integer.parseInt(args[i]);
        }
        System.out.println("The sum is " + num);
        System.out.println("The sum is " + n);
    }
}