package com.squareTriangle.client.views;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.FlexTable;
import com.squareTriangle.client.events.AddRowEvent;
import com.squareTriangle.client.events.AddRowEventHandler;
import com.squareTriangle.client.events.ClickRowEvent;
import com.squareTriangle.client.events.ClosePopUpEvent;

/**
 * Created by Антон on 19.02.2016.
 */
public class TableView extends FlexTable {


    public TableView(final SimpleEventBus eventBus){


        setText(0,0,"A");
        setText(0,1,"B");
        setText(0,2,"C");
        setText(0,3,"Result");


        addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {



                final int row = getCellForEvent(event).getRowIndex();
                eventBus.fireEvent(new ClickRowEvent(row));


            }
        });


        eventBus.addHandler(AddRowEvent.TYPE, new AddRowEventHandler() {
            @Override
            public void addRow(AddRowEvent addRowEvent) {



                int row = getRowCount();
                setText(row,0,addRowEvent.getA());
                setText(row,1,addRowEvent.getB());
                setText(row,2,addRowEvent.getC());
                setText(row,3,addRowEvent.getSquare());

                eventBus.fireEvent(new ClosePopUpEvent());


            }
        });



    }



}
