package com.company;

import java.util.Locale;

public class MethodOefeningen {

    public static void printUpperLower(String txt) {
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
    }

    public static int addTwoNrs(int nr1, int nr2) {
        int result = nr1 + nr2;
        System.out.println(nr1 + " + " + nr2 + " = " + result);
        return result;
    }
    public static void main(String[] args) {
        // basis
        // schrijf een method om een text input in uppercase en in lowercase te printen
        printUpperLower("blablaBla");

        // schrijf een method om twee getallen op te tellen, print de som die uitgevoerd is (bijv 4+ 5 = 9)
        addTwoNrs(4, 5);

        // extra
        // schrijf een methode om te bepalen of een woord langer is dan 10 letters, als het langer is dan 10 letters dan print je in uppercase, anders in lowercase
        // schrijf een methode om twee getallen (input) door elkaar te delen, als het tweede getal 0 is, geef dan een foutmelding
        // schrijf een methode die een naam en een getal als input neemt, groet de naam zo vaak als het getal

    }
}
