package com.squareTriangle.client.events;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by Антон on 18.02.2016.
 */
public class DeleteRowEvent extends GwtEvent<DeleteRowEventHandler> {

    //переменная TYPE, которая определяет тип события
    public static Type<DeleteRowEventHandler> TYPE = new Type<DeleteRowEventHandler>();




    //возвращает тип события
    @Override
    public Type<DeleteRowEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(DeleteRowEventHandler handler) {

        handler.deleteRow(this);

    }
}
