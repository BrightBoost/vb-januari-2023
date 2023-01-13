package com.company;


public class MainApp {
    public static void main(String[] args) {
        Colors lievelingskleur = Colors.BLAUW;

        for(Colors color : Colors.values()) {
            System.out.println(color);
            System.out.println(color.getI());
        }
        // == alleen voor primitives (int, double, boolean etc)

        if(lievelingskleur.equals(Colors.BLAUW)) {
            System.out.println("oh wat leuk");
        }

        if(lievelingskleur.getI() > 2) {
            System.out.println("weekend");
        }

        if(lievelingskleur.isMooi()) {
            System.out.println("mooi!");
        }



    }
}
