package com.company;

public class CircusAct {
    private String naam;
    private int aantalArtiesten;
    private int duurMinuten;

    public void printActInfo() {
        System.out.println(naam + " heeft " + aantalArtiesten + " artiesten. En duurt " + duurMinuten + " minuten.");
    }

    public void start() {
        System.out.println(naam + " begint!");
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getAantalArtiesten() {
        return aantalArtiesten;
    }

    public void setAantalArtiesten(int aantalArtiesten) {
        this.aantalArtiesten = aantalArtiesten;
    }

    public int getDuurMinuten() {
        return duurMinuten;
    }

    public void setDuurMinuten(int duurMinuten) {
        this.duurMinuten = duurMinuten;
    }
}
