package com.company;

public enum WeekDagen {
    MAANDAG(1), DINSDAG(2), WOENSDAG(3), DONDERDAG(4), VRIJDAG(5), ZATERDAG(6), ZONDAG(7);

    private int dagNr;

    public int getDagNr() {
        return dagNr;
    }

    WeekDagen(int dagNr) {
        this.dagNr = dagNr;
    }
}
