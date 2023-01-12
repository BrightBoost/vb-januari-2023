package com.company.OOP;

public abstract class Animal {
    // maak een class Animal
    // geef deze twee properties die alle dieren overeenkomstig hebben

    // maak een class Dog
    // maak een class Cat
    // laat deze twee classes erven van Animal

    // in een aparte class (app bijv), maak zowel een hond als een kat aan en zet en print de properties
    private String naam;
    private String geluid;
    private String kleur;

    public void maakGeluid() {
        System.out.println(geluid);
    }

    public abstract void eat();

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getGeluid() {
        return geluid;
    }

    public void setGeluid(String geluid) {
        this.geluid = geluid;
    }
}
