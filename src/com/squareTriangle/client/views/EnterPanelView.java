package com.squareTriangle.client.views;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.regexp.shared.RegExp;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.util.regexfilter.RegexFilter;
import com.squareTriangle.client.events.AddRowEvent;
import com.squareTriangle.client.events.CalculateEvent;
import com.squareTriangle.client.events.CalculateEventHandler;



/**
 * Created by Антон on 19.02.2016.
 */
public class EnterPanelView extends VerticalPanel {

    private HorizontalPanel buttonPanel = new HorizontalPanel();
    private Label header = new Label("Enter sides of triangle");
    private TextBox aText = new TextBox();
    private TextBox bText = new TextBox();
    private TextBox cText = new TextBox();
    private Label aLabel = new Label("A:");
    private Label bLabel = new Label("B:");
    private Label cLabel = new Label("C:");
    private Label errorLabel = new Label("Use only numbers!");
    private HorizontalPanel aPanel = new HorizontalPanel();
    private HorizontalPanel bPanel = new HorizontalPanel();
    private HorizontalPanel cPanel = new HorizontalPanel();



    public EnterPanelView(final SimpleEventBus eventBus){

        create(eventBus);


        eventBus.addHandler(CalculateEvent.TYPE, new CalculateEventHandler() {

            @Override
            public void calculate(CalculateEvent calculateEvent) {


                doValidate(eventBus);

            }
        });

    }




    public boolean validate(String number){



        String regexDecimal = "^-?\\d*\\.\\d+$";
        String regexInteger = "^-?\\d+$";
        String regexDouble = regexDecimal + "|" + regexInteger;
        RegExp regExp = RegExp.compile(regexDouble);
        return regExp.test(number);
    }


    public void doValidate(final SimpleEventBus eventBus){

        if (!validate(aText.getText().trim())||!validate(bText.getText().trim())||!validate(cText.getText().trim())) {


            if (!validate(aText.getText().trim())) {

                aText.setStyleName("label-error", true);
                errorLabel.setVisible(true);

            }

            if (!validate(bText.getText().trim())) {

                bText.setStyleName("label-error", true);
                errorLabel.setVisible(true);

            }

            if (!validate(cText.getText().trim())) {

                cText.setStyleName("label-error", true);
                errorLabel.setVisible(true);

            }

        }

        else {

            aText.removeStyleName("label-error");
            bText.removeStyleName("label-error");
            cText.removeStyleName("label-error");
            errorLabel.setVisible(false);
            eventBus.fireEvent(new AddRowEvent(Double.parseDouble(aText.getText().trim()),
                    Double.parseDouble(bText.getText().trim()),
                    Double.parseDouble(cText.getText().trim())));

        }



    }










    private void create(SimpleEventBus eventBus){

        errorLabel.setVisible(false);
        errorLabel.setStyleName("label-error");

        buttonPanel.add(new ButtonCalculateView(eventBus));
        buttonPanel.add(new ButtonClosePopUpView(eventBus));

        aPanel.add(aLabel);
        aPanel.add(aText);

        bPanel.add(bLabel);
        bPanel.add(bText);

        cPanel.add(cLabel);
        cPanel.add(cText);


        add(header);
        add(errorLabel);
        add(aPanel);
        add(bPanel);
        add(cPanel);
        add(buttonPanel);
    }




}
