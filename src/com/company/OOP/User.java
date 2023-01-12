package com.company.OOP;

public class User {
    private String mail;
    private String username;
    private String userId;

    public User(String mail, String username, String userId) {
        this.mail = mail;
        this.username = username;
        this.userId = userId;
    }

    // methode log sign in te maken, deze logt mail, username en userid
    public void logSignIn() {
        System.out.println("Mail: " + mail + " Username: " + username + " UserId: " + userId);
    }

    // overschrijf deze methode in admin door een speciale admincode extra te loggen (sysout)
    // overschrijf deze methode in basicuser door enkel userId te loggen
    // in app, roep deze methodes aan

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
