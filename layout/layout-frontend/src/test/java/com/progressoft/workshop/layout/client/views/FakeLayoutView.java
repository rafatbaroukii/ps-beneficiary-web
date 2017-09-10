package com.progressoft.workshop.layout.client.views;

import com.google.gwt.user.client.ui.IsWidget;
import com.progressoft.workshop.layout.client.views.LayoutView;
import com.progressoft.workshop.layout.client.presenters.LayoutPresenter;
import com.progressoft.brix.domino.api.client.annotations.UiView;

@UiView(presentable=LayoutPresenter.class)
public class FakeLayoutView implements LayoutView {

    @Override
    public IsWidget get() {
        return null;
    }
}
