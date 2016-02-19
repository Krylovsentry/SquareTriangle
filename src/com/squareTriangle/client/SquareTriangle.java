package com.squareTriangle.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.*;
import com.squareTriangle.client.views.PopUpAddRowView;
import com.squareTriangle.client.views.ButtonShowPopUpView;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class SquareTriangle implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {


        SimpleEventBus eventBus = new SimpleEventBus();


        PopUpAddRowView popUpAddRowView = new PopUpAddRowView(eventBus);
        RootPanel.get().add(new ButtonShowPopUpView(eventBus,"Calculate"));



    }
}
