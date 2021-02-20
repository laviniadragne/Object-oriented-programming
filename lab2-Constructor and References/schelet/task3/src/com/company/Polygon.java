package com.company;

public class Polygon {
    private Point[] puncte;


    public Polygon(int n){

        puncte = new Point[n];
        int i;
        for(i = 0; i < n; i++) {
            this.puncte[i] = new Point(0, 0);
        }
    }
    public Polygon(float v[]){
        this(v.length / 2);
        int i;
        for(i = 0; i < v.length - 1; i = i + 2){
            this.puncte[i/2].changeCoords(v[i], v[i + 1]);
        }
    }
    public void showPolygon(){
        int i;
        for(i = 0; i < this.puncte.length; i++){
            this.puncte[i].showPoint();
        }
    }

}
