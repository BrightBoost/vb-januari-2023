package com.company.exceptions;

import com.company.finalkeyword.Car;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FunWithExceptions {
    public static void main(String[] args) {
        divide(3, 0);
        Car c = new Car();
        if(c.merk != null) {
            System.out.println(c.merk.toLowerCase());
        }

        try {
            FileReader fr = new FileReader("blabla.txt");
            int ch = 0;
            while((ch = fr.read()) != -1) {
                System.out.println((char)ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("en door");
    }

    public static void divide(int a, int b) {
        if(b != 0) {
            System.out.println(a / b);
        }
    }

}
