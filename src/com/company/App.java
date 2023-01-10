package com.company;

public class App {
    public static void main(String[] args) {

        Persoon p = new Persoon();
        p.naam = "Jesse";
        p.baan = "Requirements engineer";
        p.leeftijd = 25;

        Persoon p2 = new Persoon();
        p2.naam = "Stavros";
        p2.baan = "Requirements engineer";
        p2.leeftijd = 25;

        Persoon p3 = new Persoon();
        p3.naam = "Nicole";
        p3.baan = "medewerker klantenservice";
        p3.leeftijd = 26;

        Hond h1 = new Hond();
        h1.naam = "Ted";
        h1.kleur = "zwartbruin";
        h1.hangOren = true;
        h1.aantalPoten = 4;
        Persoon[] personen = {p2, p3};
        h1.baasje = personen;
        h1.zit();

        Hond h2 = new Hond();
        h2.naam = "Donny";
        h2.kleur = "witbruin";
        h2.hangOren = true;
        h2.aantalPoten = 4;
        Persoon[] jesseArr = {p};
        h2.baasje = jesseArr;
        h2.zit();

        Hond h3 = new Hond();
        h3.naam = "Bobby";
        h3.kleur = "bruin";
        h3.aantalPoten = 4;
        h3.hangOren = true;
        h3.zit();


    }
}
