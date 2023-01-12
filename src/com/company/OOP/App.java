package com.company.OOP;

import java.time.LocalDateTime;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
//        Animal animal = new Animal(); // mag niet, want class Animal is abstract
        Animal minoes = new Cat();
        AdminUser adminUser = new AdminUser();
        adminUser.setUsername("Admin");
        adminUser.setAdminCode("1234");
        adminUser.setUserId("Admin1");
        adminUser.setMail("admin@volksbank.nl");
        System.out.println(adminUser.getUsername());
        adminUser.logSignIn();

        BasicUser basicUser = new BasicUser();
        basicUser.setUsername("Maaike123");
        System.out.println(basicUser.getUsername());
        basicUser.setUserId("User1");
        basicUser.logSignIn();

        if(basicUser.getMail() != null) {
            System.out.println(basicUser.getMail().toLowerCase());
        } else {
            System.out.println("WARNING: get mail is null voor user met id: " + basicUser.getUserId() + " date:" + LocalDateTime.now());
        }
    }
}
