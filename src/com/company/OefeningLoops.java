package com.company;

public class OefeningLoops {
    public static void main(String[] args) {
        // maak een methode die een getal als input neemt en vervolgens een getallenreeks van 0 naar het inputgetal afdrukt naar de console
        maakGetallenReeks(20, "alles");
        maakGetallenReeks(20, "even");
        maakGetallenReeks(20, "oneven");

        // breid de methode uit met een parameter voor het printen van alle getallen, alleen de even, en alleen de oneven (gebruik een if statement)
        // maak een methode die een array van hobbies als input neemt, en vervolgens voor iedere hobby print "oh wat leuk, xxx" (bijv oh wat leuk, coderen)
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
}
