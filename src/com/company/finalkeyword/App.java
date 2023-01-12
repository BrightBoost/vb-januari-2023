package com.company.finalkeyword;

public class App {
    public static void main(String[] args) {
        School.printDoel();
        School s = new School();
        s.setOnderwijsmethode("Algemeen");
        System.out.println(s.getOnderwijsmethode());

        School s1 = new School();
        s1.setOnderwijsmethode("Vrije school");
        System.out.println(s1.getOnderwijsmethode());
    }
}
