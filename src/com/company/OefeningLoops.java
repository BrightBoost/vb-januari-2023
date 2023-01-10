package com.company;

public class OefeningLoops {
    public static void main(String[] args) {
        // maak een methode die een getal als input neemt en vervolgens een getallenreeks van 0 naar het inputgetal afdrukt naar de console
        // breid de methode uit met een parameter voor het printen van alle getallen, alleen de even, en alleen de oneven (gebruik een if statement)
        maakGetallenReeks(20, "alles");
        maakGetallenReeks(20, "even");
        maakGetallenReeks(20, "oneven");

        // maak een methode die een array van hobbies als input neemt, en vervolgens voor iedere hobby print "oh wat leuk, xxx" (bijv oh wat leuk, coderen)
        String[] bezigheden = {"Java coderen", "C# coderen", "PHP coderen"};
        printHobbies(bezigheden);

        // maak een methode die true of false teruggeeft. Als input neemt ie een array met getallen, als het getal 3 aanwezig is, geeft ie true terug, als het getal 3 niet aanwezig is geeft ie false terug. Implementeer dit met een while loop. Begin met een boolean notFound aan te maken en die zetten we op true. Als 3 gevonden is, zetten we notFound op false.
        // maak een tweede printhobbies methode (noem deze iets anders als je deze naam al hebt), implementeer deze met een foreach loop
    }

    public static void maakGetallenReeks(int max, String modus) {
        int i = 0;
        int ophoging = 1;

        if(modus.equals("even")) {
           ophoging = 2;
        } else if(modus.equals("oneven")) {
            i = 1;
            ophoging = 2;
        }

        for(int teller = i; teller <= max; teller = teller + ophoging) {
            System.out.println(teller);
        }

    }

    public static void printHobbies(String[] hobbies) {
        for(int i = 0; i < hobbies.length; i++) {
            System.out.println("Oh leuk, " + hobbies[i]);
        }
    }
}
