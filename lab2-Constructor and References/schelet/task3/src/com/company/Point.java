package com.company;

public class Point {
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(){
    }
    public void changeCoords(float x, float y){
        this.setX(x);
        this.setY(y);
    }

    public void showPoint(){
        System.out.println("(" + this.getX() + " , "  + this.getY() + ")" + "\n");
    }

}
