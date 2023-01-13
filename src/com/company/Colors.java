package com.company;

public enum Colors {
    PAARS(1, true), BLAUW(2, false), GROEN(3, true);

    private int i;
    private boolean mooi;

    public int getI() {
        return i;
    }

    public boolean isMooi() {
        return mooi;
    }

    Colors(int i, boolean mooi) {
        System.out.println("Hoe vaak print dit?");
        this.i = i;
        this.mooi = mooi;
    }

    // maak een enum voor de dagen van de week
    // maak een aparte class EnumApp
    // maak een variable voor je lievelingsdag
    // in een if/else bepaal of dit wel of niet een weekenddag is
    // geef de enums een waarde en gebruik deze in een tweede if die weekenddag bepaalt
    // bonus: gebruik een switch
}
