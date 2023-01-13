package com.company.generics;

public class Tas<T>{
    private T inhoud;


    public void vulTas(T t) {

    }

    public T leegTas() {
        return inhoud;
    }

    public T getInhoud() {
        return inhoud;
    }

    public void setInhoud(T inhoud) {
        this.inhoud = inhoud;
    }
}
