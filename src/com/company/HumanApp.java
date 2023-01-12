package com.company;

public class HumanApp {
    public static void main(String[] args) {
        Human.printPopulation();

        Human h1 = new Human();
        h1.setFavGreeting("Bonjour");
        h1.setNaam("Jesse");

        Human.printPopulation();

        Human h2 = new Human();
        h2.setFavGreeting("Hey");
        h2.setNaam("Stavros");

        h1.printPopulation();


        Human h3 = new Human();
        h3.setNaam("Maaike");
        h3.setFavGreeting("Hoi");

        Human.printPopulation();

        h1.greet(h2);
        h2.greet(h3);
        h3.greet(h1);

    }
}
