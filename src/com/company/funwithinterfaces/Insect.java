package com.company.funwithinterfaces;

public class Insect extends Animal implements Roofdier, Prooidier {

    @Override
    public void runAndHide() {
        System.out.println("Vlieg/kruip weg insect");
    }

    @Override
    public void catchAndEat(Prooidier prooidier) {
        System.out.println("Hmm een soortgenoot");
    }
}
