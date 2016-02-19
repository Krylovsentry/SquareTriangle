package com.squareTriangle.client.views;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PopupPanel;
import com.squareTriangle.client.events.ShowPopUpEvent;
import com.squareTriangle.client.events.ShowPopUpEventHandler;

/**
 * Created by Антон on 19.02.2016.
 */
public class PopUpAddRowView extends PopupPanel {


    public PopUpAddRowView(final SimpleEventBus eventBus){

        super(true,true);
        center();
        setGlassEnabled(true);
        hide();






        eventBus.addHandler(ShowPopUpEvent.TYPE, new ShowPopUpEventHandler() {

            @Override
            public void showPopUp(ShowPopUpEvent showPopUpEvent) {

                show();

            }
        });



    }


}
