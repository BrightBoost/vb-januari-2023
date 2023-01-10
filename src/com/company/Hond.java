package com.company;

public class Hond {

    // maak de properties private
    // maak getters en setters
    // zorg dat je CarApp / App nog werkt
    private String naam;
    private String kleur;
    private int aantalPoten;
    private double lengteStaart;
    private boolean hangOren;
    private Persoon[] baasje;

    // getter voor naam
    public String getNaam() {
        return naam;
    }

    // setter voor naam
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public int getAantalPoten() {
        return aantalPoten;
    }

    public void setAantalPoten(int aantalPoten) {
        this.aantalPoten = aantalPoten;
    }

    public double getLengteStaart() {
        return lengteStaart;
    }

    public void setLengteStaart(double lengteStaart) {
        this.lengteStaart = lengteStaart;
    }

    public boolean isHangOren() {
        return hangOren;
    }

    public void setHangOren(boolean hangOren) {
        this.hangOren = hangOren;
    }

    public Persoon[] getBaasje() {
        return baasje;
    }

    public void setBaasje(Persoon[] baasje) {
        this.baasje = baasje;
    }

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
