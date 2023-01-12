package com.company;

public class Scope {
    int y = 2; // geen lokale variable, dit is een field
    static int z = 4;

    public static void main(String[] args) {
        int x = 3; // lokale variabele
        System.out.println(x);
        if(x < 4) {
            String s = "blabla";
            System.out.println(s);
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        Scope scope = new Scope();
        scope.y = 34;
        scope.z = 1;

        Scope scope1 = new Scope();
        //scope1.y = 45;
        scope1.z = 8;
        Scope.z = 39;
        System.out.println(scope.y + " " + scope1.y);
        System.out.println(scope.z + " " + scope1.z);
        getFive();
    }

    public static int getFive() {
//        System.out.println(x);
        return 5;
    }

    // opdracht met scope en static
    // maak een class Human aan
    // geef deze 3 fields / properties waaronder naam
    // waar kun je deze fields gebruiken?

    // geef deze een static field totalPopulation
    // waar kun je deze static field gebruiken?

    // maak een methode greet aan, die een Human als input neemt
    // in die methode, groet de input Human bij naam
    // in de methode, maak een int x = 5 aan - waar is deze te bereiken

    // maak een static methode die print hoeveel mensen er zijn
    // welke fields kun je in deze methode gebruiken?
}
