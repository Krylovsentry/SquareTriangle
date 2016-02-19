package com.squareTriangle.client.events;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by Антон on 19.02.2016.
 */
public class ClickRowEvent extends GwtEvent<ClickRowEventHandler> {

    private int row;
    public static Type<ClickRowEventHandler> TYPE = new Type<ClickRowEventHandler>();

    public ClickRowEvent(int row){

        this.row = row;

    }


    @Override
    public Type<ClickRowEventHandler> getAssociatedType() {

        return TYPE;

    }

    @Override
    protected void dispatch(ClickRowEventHandler handler) {

        handler.clickRow(this);


    }


    public int getRow() {
        return row;
    }
}
