package com.company.lambda.streamexplanation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = { new Employee("Stavros", "Software developer"),
                new Employee("Nicole", "Klant specialist"),
                new Employee("Maaike", "Kletskous"),
                new Employee("Piet", "Directeur"),
                new Employee("Henk", "Hulp"),
                new Employee("Jose", "Instructeur"),
                new Employee("Jim", "Stagiair")

        };

        long totaal = Arrays.stream(employees).count();
        System.out.println(totaal);

        long aantalSoftwareDevs = Arrays.stream(employees).filter(e -> e.getJob().equals("Software developer")).count();
        System.out.println(aantalSoftwareDevs);

        Arrays.stream(employees)
                .map(e -> e.getName().substring(0, 3))
                .forEach(l -> System.out.println(l));

        // print voor iedere employee de rol
        // tel de namen korter dan 5 letters
        // filter de stream op naam korter dan 5 letters, print voor de rollen
        // zet een stream van employees om in het aantal letters van hun job, som het totaal aantal letters
    }
}
