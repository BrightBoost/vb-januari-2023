package com.company.funwithinterfaces;

public class Bear extends Animal implements Roofdier {
    @Override
    public void catchAndEat(Prooidier prooidier) {
        System.out.println("Balou lust de prooi wel");
    }
}
