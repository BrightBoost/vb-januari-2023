package com.company;

import com.company.finalkeyword.Car;

import java.util.*;


public class WorkingWithCollections {
    public static void main(String[] args) {
        List<String> talen = new ArrayList<>();
        talen.add("Java");
        talen.add("Python");
        talen.add("JavaScript");

        List<Integer> ints = new ArrayList<>();
        int x = 4;
        ints.add(Integer.valueOf(1));
        ints.add(3);
        ints.add(x);
        ints.remove(1);
        ints.add(1, 19);
        System.out.println(ints);


        List<String> words = new ArrayList<>(List.of("bla", "blabla", "blablabla"));
        System.out.println(words);
        words.remove("bla");


        // maak een lijst met liedjes of films of gerechten (etc)
        List<String> films = new ArrayList<>();
        // voeg er 4 items aan toe
        films.add("film1");
        films.add("film2");
        films.add("film3");
        films.add("film4");
        // sout
        System.out.println(films);
        // verwijder het tweede item
        films.remove(1);
        // of films.remove("film2");

        // vervang het laatste item door een andere
        films.add(films.size() - 1, "transformers");
        films.remove(films.size() - 2);
        System.out.println(films);

        System.out.println(ints);

        String[] arr = {"Java", "Python", "JavaScript"};

        System.out.println(talen);
        System.out.println(arr);

        // set
        Set<String> hobbies = new HashSet<>();
        hobbies.add("coderen");
        hobbies.add("puzzelen");
        hobbies.add("programmeren");
        hobbies.add("coderen");
        System.out.println(hobbies);

        for(String hobby : hobbies) {
            System.out.println(hobby);
        }

        Set<Hond> honden = new HashSet<>();
        honden.add(new Hond());
        Hond h = new Hond();
        h.setHangOren(true);
        h.setNaam("Donny");
        honden.add(h);
        honden.remove(h);

        // map
        Map<String, Integer> cursisten = new HashMap<>();
        cursisten.put("Jesse", 25);
        cursisten.put("Stavros", 25);
        cursisten.put("Maaike", 25);
        cursisten.put("Stavros", 30);

        // set opdracht
        // maak een set van Cars
        Set<Car> cars = new HashSet<>();

        // Voeg drie cars aan de set toe
        Car c = new Car();
        c.aantalEigenaren = 3;
        c.merk = "fiat";
        cars.add(c);

        Car c2 = new Car();
        c.aantalEigenaren = 13;
        c.merk = "peugeot";
        cars.add(c2);

        // print het merk van de auto's in de set
        for(Car car : cars) {
            System.out.println(car.merk);
        }

        // verwijder de auto die je als eerst toevoegde
        cars.remove(c);

        // map opdracht
        // maak een map met key string en value auto
        Map<String, Car> wagenpark = new HashMap<>();

        // koppel een medewerkernummer (string) aan een auto (car)
        // voeg 3 medewerkers/auto's toe

        wagenpark.put("123", c);
        wagenpark.put("1234", c2);

        // verander de auto van de eerste medewerker in de lijst
        wagenpark.put("123", c2);

        System.out.println(wagenpark);



//        Hond h = new Hond();
//        Object oo = new Hond();
//        System.out.println(h);
//
//        String s = "bla";
//        String s1 = "bla";
//        System.out.println(s.equals(s1));
    }
}
