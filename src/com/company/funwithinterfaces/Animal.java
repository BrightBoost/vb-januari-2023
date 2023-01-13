package com.company.funwithinterfaces;

public class Animal {
    private String naam;
    private String kleur;
    private String geluid;

    public void beweeg() {
        System.out.println("standaard voortbeweeg methode, move move");
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

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}
