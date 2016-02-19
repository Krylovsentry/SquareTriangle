package com.squareTriangle.client.events;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by Антон on 19.02.2016.
 */
public class ShowPopUpEvent extends GwtEvent<ShowPopUpEventHandler> {

    public static Type<ShowPopUpEventHandler> TYPE = new Type<ShowPopUpEventHandler>();


    @Override
    public Type<ShowPopUpEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ShowPopUpEventHandler handler) {

        handler.showPopUp(this);

    }
}
