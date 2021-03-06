package com.squareTriangle.client.views;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.Button;
import com.squareTriangle.client.events.CalculateEvent;

/**
 * Created by Антон on 19.02.2016.
 */
public class ButtonCalculateView extends Button {


    public ButtonCalculateView(final SimpleEventBus eventBus){

        setText("Calculate");


        addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                eventBus.fireEvent(new CalculateEvent());

            }
        });

    }



}
