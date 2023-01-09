package com.company;

public class OefeningIf {
    public static void langOfKort(String woord) {
        if(woord.length() > 10) {
            System.out.println(woord.toUpperCase());
        } else {
            System.out.println(woord.toLowerCase());
        }
    }

    public static double bepaalTicketPrijs(int leeftijd) {
        if(leeftijd < 3) {
            System.out.println("Kaartje is gratis");
            return 0.0;
        } else if(leeftijd < 12 || leeftijd >= 65) {
            System.out.println("Kaartje is 5 euro");
            return 5.0;
        } else {
            System.out.println("Kaartje is 8 euro");
            return 8.0;
        }
    }

    public static void main(String[] args) {
        // basis
        // schrijf een methode om te bepalen of een woord langer is dan 10 letters, als het langer is dan 10 letters dan print je in uppercase, anders in lowercase
        langOfKort("blabla");
        langOfKort("blablablabla");

        // schrijf een methode om te bepalen wat een ticketkaartje kost: kinderen onder de 3 gratis, kinderen 3-11 5 euro, leeftijd 12-65 8 euro, daarboven 5 euro
        bepaalTicketPrijs(1);
        bepaalTicketPrijs(5);
        bepaalTicketPrijs(41);
        bepaalTicketPrijs(65);
    }
}
