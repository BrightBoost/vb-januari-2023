package com.company;

public class Hond {
    String naam;
    String kleur;
    int aantalPoten;
    double lengteStaart;
    boolean hangOren;
    Persoon[] baasje;

    // non static draait om de instantie / het object
    public void zit() {
        System.out.println(naam + " gaat braaf zitten");
    }

    // static is voor de class, niet instantie
    public static void statistiekenHonden() {
        System.out.println("Hier heb je geen instantie voor nodig");
    }

    // twee functies:
    // start auto >> berichtje dat de auto start
    // stop auto >> print berichtje dat de auto stopt
}
