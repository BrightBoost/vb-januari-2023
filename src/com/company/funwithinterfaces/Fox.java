package com.company.funwithinterfaces;

import java.util.Random;

public class Fox extends Animal implements Roofdier, Prooidier {

    private int succesPercentage;

    public int getSuccesPercentage() {
        return succesPercentage;
    }

    public void setSuccesPercentage(int succesPercentage) {
        this.succesPercentage = succesPercentage;
    }

    @Override
    public void runAndHide() {
        System.out.println("Snel, het vossenhol in");
    }

    @Override
    public void catchAndEat(Prooidier prooidier) {
        Random random = new Random();

        if(random.nextDouble()*100 > succesPercentage) {
            prooidier.runAndHide();
            System.out.println("De prooi is ontsnapt");
        } else {
            System.out.println("Pak de prooi met de bek en schud tot ie eetbaar is ");
        }
    }
}
