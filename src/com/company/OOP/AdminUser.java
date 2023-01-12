package com.company.OOP;

public class AdminUser extends User {
    private BasicUser[] basicUsers;
    private String adminCode;

    public AdminUser() {
        super("", "", "");
    }

    @Override
    public void logSignIn() {
        super.logSignIn();
        System.out.println("Admincode: " + adminCode);
    }
    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public BasicUser[] getBasicUsers() {
        return basicUsers;
    }

    public void setBasicUsers(BasicUser[] basicUsers) {
        this.basicUsers = basicUsers;
    }
}
