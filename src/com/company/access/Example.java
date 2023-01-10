package com.company.access;

public class Example {
    // meest toegankelijk
    public int x = 5;

    // op een na toegankelijkst
    protected int i = 5;

    // default access, alleen vanuit package
    int z = 6;

    // minst toegankelijk, alleen vanuit klas
    private int y = 3;

    public static void main(String[] args) {
        Example e = new Example();
        System.out.println(e.y);
        System.out.println(e.x);
    }

}
