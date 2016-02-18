package com.squareTriangle.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.squareTriangle.client.presenter.Presenter;
import com.squareTriangle.client.presenter.TrianglePresenter;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class SquareTriangle implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {


        SimpleEventBus eventBus = new SimpleEventBus();


    }
}
