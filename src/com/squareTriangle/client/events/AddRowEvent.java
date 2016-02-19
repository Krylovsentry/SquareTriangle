package com.squareTriangle.client.events;


import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by Антон on 18.02.2016.
 */
public class AddRowEvent extends GwtEvent<AddRowEventHandler>{

    public static Type<AddRowEventHandler> TYPE = new Type<AddRowEventHandler>();

    private double a,b,c,square;

    public AddRowEvent(double a, double b, double c){

        this.a = a;
        this.b = b;
        this.c = c;
        setSquare();

    }

    public void setSquare(){

        //calc the perimeter
        double p = (a+b+c)/2;

        //calc the square
        this.square = Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }


    @Override
    public Type<AddRowEventHandler> getAssociatedType() {

        return TYPE;
    }

    @Override
    protected void dispatch(AddRowEventHandler handler) {

        handler.addRow(this);

    }


    public String getA(){

        return String.valueOf(a);

    }

    public String getB() {
        return String.valueOf(b);
    }

    public String getC() {
        return String.valueOf(c);
    }

    public String getSquare(){

        return String.valueOf(square);

    }



}
