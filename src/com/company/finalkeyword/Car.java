package com.company.finalkeyword;

public class Car extends Vehicle {
    // mag niet, want Car heeft een FINAL methode start, die kan niet overschreven worden
//    public void start() {
//        System.out.println("start car");
//    }
    final int nrOfWheels = 4;
    int aantalEigenaren;

    public void nonStatic() {
        System.out.println(aantalEigenaren);
    }

    public static void main(String[] args) {
        final Car c = new Car(); // c is final, cannot be assigned a new car object
        System.out.println(c.nrOfWheels);
        c.aantalEigenaren = 9;
        c.nonStatic();
        // c = new Car(); // mag geen nieuw object toegewezen worden
        // c.x = 5; // variable die final is kan niet overschreven worden met nieuwe waarde
    }
}
