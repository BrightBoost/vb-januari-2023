package com.company;

public class LoopsVoorbeelden {
    public static void main(String[] args) {
        for(int i = 0; i < 12; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        int[] arr = {0, 1, 3, 4, 1 ,75};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[] fruits = {"grapefruit", "appel", "banaan", "bessen"};
        System.out.println(fruits);
        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

    }
}
