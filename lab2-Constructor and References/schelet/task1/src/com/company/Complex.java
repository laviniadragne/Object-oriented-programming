package com.company;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(){
        this(0, 0);
    }

    // copy constructor
    public Complex(Complex number){
        this.real = number.real;
        this.imaginary = number.imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex number){
        this.real += number.real;
        this.imaginary += number.imaginary;
    }

    public void showNumber(){
        System.out.println(this.getReal() + " + " + this.getImaginary() + " * i" + "\n");
    }

}
