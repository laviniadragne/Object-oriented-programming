package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point punct = new Point(1, 5);
        punct.changeCoords(3, 4);
        System.out.println("Task a)");
        punct.showPoint();


        float v[] = {1, 2, 3, 4, 5, 6};
        Polygon poli = new Polygon(v);
        System.out.println("Task b)");
        poli.showPolygon();
    }
}
