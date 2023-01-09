package com.company;

public class VoorbeeldIf {
    public static void main(String[] args) {
        printVerkeerslicht("rood");
        System.out.println(beoordeelCijfer(6));
        System.out.println(beoordeelCijfer(4));
        System.out.println(beoordeelCijfer(8));
        System.out.println(beoordeelCijfer(10));

    }

    public static String beoordeelCijfer(int cijfer) {
        if(cijfer <= 5) {
            return "Oei";
        } else if(cijfer > 5 && cijfer <= 6) {
            return "Hmm";
        } else if(cijfer > 6 && cijfer <= 7) {
            return "Ok, gehaald";
        } else if(cijfer > 7 && cijfer <= 8) {
            return "Netjes";
        } else if(cijfer > 8 && cijfer <= 9) {
            return "Wow";
        } else if(cijfer > 9) {
            return "Je hebt te lang geleerd.";
        }
        return "Huh";
    }

    public static void printVerkeerslicht(String kleur) {
        if (kleur.equals("groen")) {
            System.out.println("Je mag rijden.");
        } else if(kleur.equals("oranje")) {
            System.out.println("Stop als je nog ver genoeg weg bent.");
        } else {
            System.out.println("Je moet stoppen.");
            System.out.println("Het licht is niet groen.");
        }
    }
}
