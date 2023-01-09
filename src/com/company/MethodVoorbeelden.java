package com.company;

public class MethodVoorbeelden {
    public static String greetName(String name) {
        System.out.println("Hi " + name);
        return "bye";
    }

    public static void main(String[] args) {
        String d = greetName("Jesse");
        int x = 5;
        greetName("Stavros");
    }
}
