package com.company.OOP;

public class Dog extends Animal {
    @Override
    public void maakGeluid() {
        System.out.println(getNaam() + " zegt: " + getGeluid());
    }
}
