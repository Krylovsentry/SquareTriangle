package com.squareTriangle.client.events;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by Антон on 19.02.2016.
 */
public class CalculateEvent extends GwtEvent<CalculateEventHandler> {

    public static Type<CalculateEventHandler> TYPE = new Type<CalculateEventHandler>();

    @Override
    public Type<CalculateEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(CalculateEventHandler handler) {

        handler.calculate(this);

    }
}
