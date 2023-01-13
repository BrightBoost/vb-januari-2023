package com.company.funwithinterfaces;

public class Bird extends Animal implements Prooidier, Roofdier {

    @Override
    public void runAndHide() {
        System.out.println("Fladder fladder, vlieg weg");
    }

    @Override
    public void catchAndEat(Prooidier prooidier) {
        System.out.println("Val aan met vleugels en eet met bekje");
    }
}
