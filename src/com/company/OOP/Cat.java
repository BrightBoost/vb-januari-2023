package com.company.OOP;

public class Cat extends Animal {
    @Override
    public void maakGeluid() {
        for(int i = 0; i < 3; i++) {
            System.out.println(getGeluid());
        }
    }
}
