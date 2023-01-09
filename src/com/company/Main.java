package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // primitives
        // type naam = inhoud;
        int nrOfWheels = 400;
        char firstChar = 'A'; // char tussen enkele
        double weight = 13.7;
        boolean yes = true;

        byte kleinsteGetallen = 23; //-127 tot 128
        long groteGetallen = 12345678900L;
        float kleineKommaGetallen = 1.2f;
        short kleineGetallen = 32000; // -32500 tot 32500 (circa)

        System.out.println(nrOfWheels);

        // casting - veranderen van het type
        // groot naar klein opslaan -> cast nodig
        // klein naar groot opslaan -> geen expliciete cast nodig
        kleinsteGetallen  = (byte) nrOfWheels;
        System.out.println(firstChar);
        nrOfWheels = kleineGetallen;

    }
}
