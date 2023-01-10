package com.company;

public class AccountApp {
    public static void main(String[] args) {
        AccountHolder ah = new AccountHolder();
        ah.setNaam("Bobby");

        Account ac = new Account();
        ac.setAccountHolder(ah);
        ac.setBalance(100);
        ac.accountInfo();
        ac.withdraw(4);
        ac.accountInfo();
    }
}
