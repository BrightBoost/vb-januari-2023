package com.company.finalkeyword;

public class School {
    private String onderwijsmethode;

    public String getOnderwijsmethode() {
        return onderwijsmethode;
    }

    public void setOnderwijsmethode(String onderwijsmethode) {
        this.onderwijsmethode = onderwijsmethode;
    }

    public static void printDoel() {
        System.out.println("Iets leren");
        School s = new School();
        s.setOnderwijsmethode("blabla");
        System.out.println(s.getOnderwijsmethode());
    }
}
