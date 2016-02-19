package com.squareTriangle.client.views;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.*;
import com.squareTriangle.client.events.ClosePopUpEvent;
import com.squareTriangle.client.events.ClosePopUpEventHandler;
import com.squareTriangle.client.events.ShowPopUpEvent;
import com.squareTriangle.client.events.ShowPopUpEventHandler;

/**
 * Created by Антон on 19.02.2016.
 */
public class PopUpAddRowView extends PopupPanel {


    public PopUpAddRowView(final SimpleEventBus eventBus){

        super(true,true);


        setWidget(new EnterPanelView(eventBus));

        center();
        setGlassEnabled(true);
        hide();

        eventBus.addHandler(ShowPopUpEvent.TYPE, new ShowPopUpEventHandler() {

            @Override
            public void showPopUp(ShowPopUpEvent showPopUpEvent) {
                show();
            }
        });


        eventBus.addHandler(ClosePopUpEvent.TYPE, new ClosePopUpEventHandler() {
            @Override
            public void closePopUp(ClosePopUpEvent closePopUpEvent) {
                hide();
            }
        });



    }


}
