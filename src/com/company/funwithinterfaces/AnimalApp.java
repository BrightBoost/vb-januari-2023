package com.company.funwithinterfaces;

public class AnimalApp {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setNaam("stampertje");

        Fox f = new Fox();
        f.setSuccesPercentage(50);
        f.catchAndEat(rabbit);

        // we gaan voertuig klasses maken
        // maak een voertuig, auto, boot, fiets, waterfiets, amfibievoertuig
        // allemaal hebben ze een method beweeg
        // de watervoertuigen hebben een method vaar, deze komt uit de interface watervoertuig
        // zorg dat de watervoertuigen de interface "watervoertuig" implementeren

    }
}
