package com.squareTriangle.client;

/**
 * Created by Антон on 18.02.2016.
 */
public class Triangle {

    private double a,b,c,square;

    public Triangle(double a, double b, double c){


        this.a = a;
        this.b = b;
        this.c = c;

        //calc the perimeter
        double p = (a+b+c)/2;

        //calc the square
        this.square = Math.sqrt(p*(p-a)*(p-b)*(p-c));


    }



    public double getA(){
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getSquare() {
        return square;
    }
}
