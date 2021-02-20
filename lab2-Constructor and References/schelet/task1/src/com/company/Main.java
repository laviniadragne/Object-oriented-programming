package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // cerinta a)
        Complex number = new Complex(5, 5);
        Complex zero_num = new Complex();
        Complex copy_num = new Complex(number);

        // cerinta b)
        number.setReal(2);
        number.setImaginary(3);

        // cerinta c)
        number.addWithComplex(copy_num);

        // cerinta d)
        copy_num.showNumber();
        number.showNumber();
        zero_num.showNumber();
    }
}
