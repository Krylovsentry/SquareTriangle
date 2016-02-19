package com.squareTriangle.client.views;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.Button;
import com.squareTriangle.client.events.AddRowEvent;
import com.squareTriangle.client.events.ShowPopUpEvent;

/**
 * Created by Антон on 18.02.2016.
 */
public class ButtonShowPopUpView extends Button {



    public ButtonShowPopUpView(final SimpleEventBus eventBus, String text){


        setText(text);

        addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                eventBus.fireEvent(new ShowPopUpEvent());

            }
        });



    }


}
