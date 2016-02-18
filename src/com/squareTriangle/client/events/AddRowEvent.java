package com.squareTriangle.client.events;


import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by Антон on 18.02.2016.
 */
public class AddRowEvent extends GwtEvent<AddRowEventHandler>{

    public static Type<AddRowEventHandler> TYPE = new Type<AddRowEventHandler>();



    @Override
    public Type<AddRowEventHandler> getAssociatedType() {

        return TYPE;
    }

    @Override
    protected void dispatch(AddRowEventHandler handler) {

        handler.addRow(this);

    }
}
