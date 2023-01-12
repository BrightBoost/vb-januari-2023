package com.company.OOP;

public class App {
    public static void main(String[] args) {
        AdminUser adminUser = new AdminUser();
        adminUser.setUsername("Admin");
        System.out.println(adminUser.getUsername());

        BasicUser basicUser = new BasicUser();
        basicUser.setUsername("Maaike123");
        System.out.println(basicUser.getUsername());
    }
}
