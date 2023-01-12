package com.company.OOP;

public class BasicUser extends User {


// als ik geen constructor toevoeg, voegt Java de default constructor toe
// de default constructor heeft geen parameters
// de eerste aanroep van de default constructor is de default constructor van de parent
// als de parent geen default constructor heeft, kom je in de knoei
//    public BasicUser() {
//        super();
//    }


    public BasicUser(String mail, String username, String userId) {
        super(mail, username, userId);
    }

    @Override
    public void logSignIn() {
        System.out.println("UserId: " + getUserId());
    }

}

