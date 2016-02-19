package com.squareTriangle.client.views;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.squareTriangle.client.events.ClickRowEvent;
import com.squareTriangle.client.events.ClickRowEventHandler;
import com.squareTriangle.client.events.ClosePopUpEvent;
import com.squareTriangle.client.events.ClosePopUpEventHandler;

/**
 * Created by Антон on 19.02.2016.
 */
public class PopUpDeleteRow extends PopupPanel {

    private HorizontalPanel buttonPanel = new HorizontalPanel();
    private Label header = new Label("Are you sure?");
    private VerticalPanel mainPanel = new VerticalPanel();
    private ButtonRemoveView buttonRemoveView;
    private int row;

    public PopUpDeleteRow(final SimpleEventBus eventBus, final TableView tableView){
        super(true,true);





        setGlassEnabled(true);
        center();
        hide();

        eventBus.addHandler(ClickRowEvent.TYPE, new ClickRowEventHandler() {
            @Override
            public void clickRow(ClickRowEvent clickRowEvent) {


                clear();
                row = clickRowEvent.getRow();
                buttonRemoveView = new ButtonRemoveView(eventBus,tableView,row);
                create(eventBus);
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



    private void create(SimpleEventBus eventBus) {





        buttonPanel.add(buttonRemoveView);
        buttonPanel.add(new ButtonClosePopUpView(eventBus));


        mainPanel.add(header);
        mainPanel.add(buttonPanel);

        setWidget(mainPanel);

    }


    public void clear(){

        buttonPanel.clear();
        mainPanel.clear();

    }



}
