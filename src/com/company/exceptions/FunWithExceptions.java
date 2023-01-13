package com.company.exceptions;

import com.company.finalkeyword.Car;

import java.io.*;

public class FunWithExceptions {
    public static void main(String[] args) {
        divide(3, 0);
        Car c = new Car();
        if(c.merk != null) {
            System.out.println(c.merk.toLowerCase());
        }

        try {
            FileReader fr = new FileReader("blabla.txt");
            FileWriter fw = new FileWriter("out.txt", true);
            int ch;
            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
                fw.write((char)ch);
            }
            fw.close();
            fr.close();
            System.out.println();
        } catch (FileNotFoundException  e) {
            System.out.println("woops file not found");
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
