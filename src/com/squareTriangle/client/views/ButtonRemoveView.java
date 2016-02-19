package com.squareTriangle.client.views;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.Button;
import com.squareTriangle.client.events.ClosePopUpEvent;

/**
 * Created by Антон on 19.02.2016.
 */
public class ButtonRemoveView  extends Button{



    public ButtonRemoveView(final SimpleEventBus eventBus, final TableView tableView, final int row){
        setText("Remove");




        addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                tableView.removeRow(row);
                eventBus.fireEvent(new ClosePopUpEvent());

            }
        });






    }




}
