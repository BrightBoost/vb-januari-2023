package com.company;

public class EnumApp {
    public static void main(String[] args) {
        WeekDagen lievelingsdag = WeekDagen.ZATERDAG;

        if(lievelingsdag.equals(WeekDagen.ZATERDAG) || lievelingsdag.equals(WeekDagen.ZONDAG)) {
            System.out.println("Het is weekend!");
        } else {
            System.out.println("Het is geen weekend");
        }

        if(lievelingsdag.getDagNr() > 5) {
            System.out.println("Het is weekend!");
        } else {
            System.out.println("Het is geen weekend");
        }
    }
}
