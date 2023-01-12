package com.company.OOP;

public class AnimalApp {
    public static void main(String[] args) {
        Cat c = new Cat(); // polymorphism
        c.setNaam("Daisy");
        c.setGeluid("miauw");
        System.out.println(c.getNaam());
        c.maakGeluid();

        Dog d = new Dog();
        d.setNaam("Bobby");
        d.setGeluid("woef");
        System.out.println(d.getNaam());
        d.maakGeluid();
    }

}
