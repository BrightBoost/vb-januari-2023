package com.company;

public enum Colors {
    PAARS(1), BLAUW(2), GROEN(3);

    private int i;

    public int getI() {
        return i;
    }

    Colors(int i) {
        System.out.println("Hoe vaak print dit?");
        this.i = i;
    }

    // maak een enum voor de dagen van de week
    // maak een aparte class EnumApp
    // maak een variable voor je lievelingsdag
    // in een if/else bepaal of dit wel of niet een weekenddag is
    // geef de enums een waarde en gebruik deze in een tweede if die weekenddag bepaalt
    // bonus: gebruik een switch
}
