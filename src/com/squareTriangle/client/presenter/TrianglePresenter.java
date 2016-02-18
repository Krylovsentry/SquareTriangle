package com.squareTriangle.client.presenter;

import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by Антон on 18.02.2016.
 */
public class TrianglePresenter implements Presenter {

    Display view;

    public interface Display {

        public void clear();


        public Widget asWidget();


    }


    @Override
    public void bind() {

    }

    @Override
    public void go(Panel panel) {

        panel.add(view.asWidget());

    }
}
