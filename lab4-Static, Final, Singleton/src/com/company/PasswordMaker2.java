package com.company;

import java.util.Random;

public class PasswordMaker2 {

    private final int MAGIC_NUMBER = 5;
    private String password;
    private String name;
    private static int cnt = 0;
    RandomStringGenerator str = new RandomStringGenerator(20, "qwertyuiopasdfghjklzxcvbnm");
    private final String MAGIC_STRING = str.next();
    private static PasswordMaker2 instance;

//     Task 2a) - Lazy Initialization
//
//     private static PassMaker2 instance = null;
//     private PasswordMaker2(String name) {
//            this.name = name;
//        }
//    public static PasswordMaker2 getInstance(String name) {
//        if (instance == null) {
//            instance = new PasswordMaker2(name);
//        }
//        return instance;
//    }


//     Eager Initialization
//
//    private static PasswordMaker2 instance = new PasswordMaker2();
//    private PasswordMaker2() {
//
//    }
//    public static PasswordMaker2 getInstance(String name) {
//      this.name = name;
//      return instance;
//    }



//     task 2b) - variabila instance este inițializată într-un bloc static pentru Lazy Initialization

//     private static PasswordMaker2 instance;
//     static {
//        instance = null;
//     }
//     private PasswordMaker2(String name) {
//            this.name = name;
//     }
//     public static PasswordMaker2 getInstance(String name) {
//          if (instance == null) {
//               instance = new PasswordMaker2(name);
//          }
//          return instance;
//     }

//    variabila instance este inițializată într-un bloc static pentru  Eager Initialization

//    private static PasswordMaker2 instance;
//    static {
//          instance = new PasswordMaker2();
//    }
//    private PasswordMaker2() {
//
//     }
//    public static PasswordMaker2 getInstance(String name) {
//          this.name = name;
//          return instance;
//    }

    // Task 2c) pentru Lazy Initialization am adaugat un contor

    static {
        instance = null;
    }

    private PasswordMaker2(String name) {
        this.name = name;
    }

    public static PasswordMaker2 getInstance(String name) {
        if (instance == null) {
            instance = new PasswordMaker2(name);
        }
        // Task 2c)- adaugarea unui contor
        cnt++;
        return instance;
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

    public static int getCnt() {
        return cnt;
    }

}


