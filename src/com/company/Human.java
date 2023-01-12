package com.company;

// opdracht met scope en static
// maak een class Human aan
// geef deze 3 fields / properties waaronder naam
// waar kun je deze fields gebruiken?

// geef deze een static field totalPopulation
// waar kun je deze static field gebruiken?

// maak een methode greet aan, die een Human als input neemt
// in die methode, groet de input Human bij naam
// in de methode, maak een int x = 5 aan - waar is deze te bereiken

// maak een static methode die print hoeveel mensen er zijn
// welke fields kun je in deze methode gebruiken?

public class Human {
    private String naam;
    private String favGreeting;
    private int leeftijd;
    private static int totalPopulation = 0;

    public void greet(Human h) {
        int x = 5;//alleen in deze methode
        System.out.println(favGreeting + " " + h.getNaam() + ". Ik ben " + naam);
    }

    public static void printPopulation() {
        System.out.println("Er zijn aantal mensen: " + totalPopulation);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
        totalPopulation++;
    }

    public String getFavGreeting() {
        return favGreeting;
    }

    public void setFavGreeting(String favGreeting) {
        this.favGreeting = favGreeting;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
}
