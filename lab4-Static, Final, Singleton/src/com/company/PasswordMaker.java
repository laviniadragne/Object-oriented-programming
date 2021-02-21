package com.company;

import java.util.Random;

public class PasswordMaker {

    private final int MAGIC_NUMBER = 5;
    private String password;
    private String name;
    RandomStringGenerator str = new RandomStringGenerator(20,"qwertyuiopasdfghjklzxcvbnm");
    private final String MAGIC_STRING = str.next();

    public PasswordMaker(String name) {
        this.name = name;
    }

    public String getPassword(){

        RandomStringGenerator a = new RandomStringGenerator(10, MAGIC_STRING);
        String alfabet = a.next();
        RandomStringGenerator s = new RandomStringGenerator(MAGIC_NUMBER, alfabet);
        password = s.next();
        Random ran = new Random();
        String s1 = Integer.toString((name.length()) + ran.nextInt(101));
        return password + s1;
    }


}


