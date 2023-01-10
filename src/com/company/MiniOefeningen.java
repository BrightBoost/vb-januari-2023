package com.company;

public class MiniOefeningen {

    public static void greet(String name) {
        System.out.println("Hoi " + name);
    }
    public static void main(String[] args) {
        // Schrijf een methode genaamd "greet" die een persoon begroet met hun naam. De methode moet één parameter accepteren, een string met de naam van de persoon. Bijvoorbeeld, als je de methode uitvoert met "Jane" als parameter, moet het "Hallo Jane!" printen.
        greet("Jesse");
        // Schrijf een for-loop die de getallen van 1 tot 10 tot de macht 2 print.
        for(int i = 0; i < 10; i++) {
            System.out.println(Math.pow(i, 2));
        }

        // Maak een array met de namen van 5 vrienden. Schrijf een for-each loop die de namen van de vrienden in de console afdrukt.
        String[] vrienden = {"f1", "f2", "f3", "f4", "bobby"};
        for(String vriend : vrienden) {
            System.out.println(vriend);
        }

        // Maak een class "CircusAct" die de naam van de act, het aantal artiesten en de duur van de act bevat. Voeg methoden toe die informatie over het circus en shows print. Voeg ook een methode start toe die "The show is starting!" print als de act begint. Maak ten minste 2 instanties van de class CircusAct en roep de "start" methode van elk object aan.
        CircusAct ca = new CircusAct();
        ca.setNaam("Trapeze act");
        ca.setAantalArtiesten(2);
        ca.setDuurMinuten(5);

        CircusAct ca2 = new CircusAct();
        ca2.setNaam("Clown act");
        ca2.setAantalArtiesten(1);
        ca2.setDuurMinuten(15);

        ca.start();
        ca.printActInfo();
        ca2.start();
        ca2.printActInfo();
        // Bonus: maak een class Circus en geef die een array van circusacts.
        // Bonus: maak een Artiest class, en geef CircusAct een array van artiesten
        // Bonus: in een aparte class (App bijv) maak dit aan.
    }
}
