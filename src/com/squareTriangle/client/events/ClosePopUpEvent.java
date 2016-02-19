package com.squareTriangle.client.events;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by Антон on 19.02.2016.
 */
public class ClosePopUpEvent extends GwtEvent<ClosePopUpEventHandler> {

    public static Type<ClosePopUpEventHandler> TYPE = new Type<ClosePopUpEventHandler>();

    @Override
    public Type<ClosePopUpEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ClosePopUpEventHandler handler) {

        handler.closePopUp(this);


    }
}
