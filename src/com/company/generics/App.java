package com.company.generics;

public class App {
    public static void main(String[] args) {
        Tas<Chihuahua> chihuahuaTas = new Tas<>();
        Chihuahua brutus = new Chihuahua();
        chihuahuaTas.vulTas(brutus);

        Tas<Laptop> laptopTas = new Tas<>();
        Laptop laptop = new Laptop();
        laptopTas.vulTas(laptop);

    }
}
