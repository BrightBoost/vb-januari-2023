package com.company.OOP;

public class AdminUser extends User {
    private BasicUser[] basicUsers;


    public BasicUser[] getBasicUsers() {
        return basicUsers;
    }

    public void setBasicUsers(BasicUser[] basicUsers) {
        this.basicUsers = basicUsers;
    }
}
