package com.company;

import java.util.Optional;
import java.util.Random;

public class DealingWithNull {
    public static void main(String[] args) {
//        Account account = getRandomAccount();
//        if(account != null) {
//            System.out.println(getRandomAccount().getBalance());
//        }

        Optional<Account> accountOptional = getRandomAccount();

    }

    // vrij nutteloze methode, enkel voor demonstreren optional
    public static Optional<Account> getRandomAccount() {
        Random r = new Random();
        if(r.nextDouble() > 0.9) {
            return null;
        } else {
            Account a = new Account();
            a.setAccountHolder(new AccountHolder());
            a.setBalance(10000 * r.nextDouble());
            return Optional.of(a);
        }
    }
}
