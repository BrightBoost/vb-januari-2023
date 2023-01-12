package com.company.OOP;

public class BasicUser extends User {

    @Override
    public void logSignIn() {
        System.out.println("UserId: " + getUserId());
    }

}
