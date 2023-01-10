package com.company;

public class Account {
    private AccountHolder accountHolder;
    private double balance;

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance += amount; // balance = balance + amount
    }

    public void accountInfo() {
        System.out.println(accountHolder.getNaam() + " heeft saldo: " + balance);
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // geef account een AccountHolder (maak deze aan)
    // maak een accountholder en geef deze een naam
    // geef account een balance
    // geef een methode voor withdraw and deposit
    // maak een method die de properties van de account print: naam heeft x balance
    // gebruik private voor properties en werk met getters and setters
    // ga naar een losse Java class, maak een main method en creer een account en roep de methods aan

}
