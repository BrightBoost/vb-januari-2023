package com.company;

public class ShortCircuit {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        // && and || are called the short circuit operator, if it knows whether the expression is true of false after the first part, it's not going to look at the other half
        if(x == 1 & y++ < 10) {
            System.out.println("In the if.");
        }
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        calc(x++);
        System.out.println("x: " + x);
        calc(++x);
        System.out.println("x: " + x);
    }

    public static void calc(int i) {
        System.out.println(i * 5);
    }
}
