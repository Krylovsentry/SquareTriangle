package com.squareTriangle.client.views;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.squareTriangle.client.events.AddRowEvent;
import com.squareTriangle.client.events.AddRowEventHandler;

/**
 * Created by Антон on 19.02.2016.
 */
public class EnterTextLabelView extends HorizontalPanel {





    public EnterTextLabelView(SimpleEventBus eventBus, String labelName){

        add(new Label(labelName));
        add(new TextBox());


        eventBus.addHandler(AddRowEvent.TYPE, new AddRowEventHandler() {
            @Override
            public void addRow(AddRowEvent addRowEvent) {



            }
        });


    }



}
