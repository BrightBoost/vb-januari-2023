package com.company;

public class OefeningTypes {

    public static void main(String[] args) {
        // maak een variable voor aantal stuks
        int aantal = 4;
        // maak een variable voor beschrijving
        String beschrijving = "Mooie HDMI kabel";
        // maak een variable voor verzekerd verzenden ja / nee
        boolean verzekerd = false;
        // maak een variable voor telefoonnr
        String telefoonnr = "0612345678";
        // maak een variable voor prijs (normaal nooit met primitive, nu wel)
        double prijs = 4.5;
        // maak een variable voor productid
        long id = 4L;

        // binair vs decimal problems
        for(double i = 1; i < 25; i++) {
            i = i + 0.001;
            System.out.println(i);
        }
    }
}
