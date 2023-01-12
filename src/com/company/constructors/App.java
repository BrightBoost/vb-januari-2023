package com.company.constructors;

public class App {
    public static void main(String[] args) {
        User user = new User("Jesse", "jesse@jesse.nl");
        System.out.println(user.getEmail());
        User u1 = new User();
    }
}
