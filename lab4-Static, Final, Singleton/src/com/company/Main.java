package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Task 1
        System.out.println("Task1:");
        PasswordMaker pass_make = new PasswordMaker("Parola");
        System.out.println(pass_make.getPassword());

        // Task 2
        // Lazy Initialization si Eager Initialization
        PasswordMaker2 pass_make2 = PasswordMaker2.getInstance("Parola");
        System.out.println("Task2c:");
        System.out.println(pass_make2.getCnt());

        // Task 3 si 4
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i;
        for(i = 0; i < 10; i++) {
            arr.add(i, i);
        }
        MyImmutableArray arr1 = new MyImmutableArray(arr);
        System.out.println("Task 3 si 4:");

        System.out.println(arr1.getArray());
        arr1.getArray().set(1, 5);
        System.out.println(arr1.getArray());
    }
}
