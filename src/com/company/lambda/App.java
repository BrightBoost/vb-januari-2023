package com.company.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        Printable doc = new Document("I love Java!");
        doc.print();

        // anonieme implementatie interface
        Printable anoniem = new Printable() {
            @Override
            public void print() {
                System.out.println("anonieme implementatie van de interface");
            }
        };

        anoniem.print();

        // lambda, werkt alleen voor functional interfaces (interface met exact 1 abstracte methode)
        Printable p = () -> System.out.println("lambda implementatie");
        p.print();

        Printer p1 = (s) -> System.out.println(s.toUpperCase());
        p1.print("hoi Stavros");

        Calculator c = (a, b) -> a + b;
        double result = c.calc(4, 5);
        System.out.println("Het resultaat: " + result);

        // voorbeeld van gebruik lambdas
        List<String> list = new ArrayList<>();
        list.add("NBlanla");
        list.add("Blala");
        list.add("Blabla");

        list.forEach(s -> System.out.println(s));
    }
}
