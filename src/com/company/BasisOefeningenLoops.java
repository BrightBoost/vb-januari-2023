package com.company;

public class BasisOefeningenLoops {
    public static void main(String[] args) {
        // Schrijf een for-loop die telt van 20 tot en met 30, en elk getal afdrukt op een nieuwe regel.
        for(int i = 20; i <= 30; i++) {
            System.out.println(i);
        }

        // Schrijf een while-loop die van 10 tot en met 1 aftelt, en elk getal afdrukt op een nieuwe regel.
        int teller = 11;
        while(teller > 1) {
            teller--;
            System.out.println(teller);
        }

        // Schrijf een for-loop die door een array van integers gaat, en de som van de integers afdrukt.
        int sum = 0;
        int[] getallen = {1, 2, 3, 4, 5};
        for(int getal : getallen) {
            sum = sum + getal;
        }
        System.out.println(sum);

        // Schrijf een for-loop die de tafel van 7 afdrukt van 1 tot en met 10.
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " * 7 = " + i * 7);
        }

        // Schrijf een for-loop die een gegeven string omgekeerd afdrukt (bijvoorbeeld: "Hallo" wordt "ollaH")
        String hi = "Hallo hoe gaat het?";
        for(int i = hi.length() - 1; i >= 0; i--) {
            System.out.print(hi.charAt(i));
        }

        System.out.println();

        char[] charArr = hi.toCharArray();
        String nieuwString = "";
        for(char c : charArr) {
            nieuwString = c + nieuwString;
        }
        System.out.println(nieuwString);
    }
}
