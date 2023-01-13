package com.company;

import java.util.ArrayList;
import java.util.List;


public class WorkingWithCollections {
    public static void main(String[] args) {
        List<String> talen = new ArrayList<>();
        talen.add("Java");
        talen.add("Python");
        talen.add("JavaScript");

        List<Integer> ints = new ArrayList<>();
        int x = 4;
        ints.add(Integer.valueOf(3));
        ints.add(3);
        ints.add(x);

        // maak een lijst met liedjes of films of gerechten (etc)
        // voeg er 4 items aan toe
        // verwijder het tweede item
        // vervang het laatste item door een andere

        System.out.println(ints);

        String[] arr = {"Java", "Python", "JavaScript"};

        System.out.println(talen);
        System.out.println(arr);


//        Hond h = new Hond();
//        Object oo = new Hond();
//        System.out.println(h);
//
//        String s = "bla";
//        String s1 = "bla";
//        System.out.println(s.equals(s1));
    }
}
