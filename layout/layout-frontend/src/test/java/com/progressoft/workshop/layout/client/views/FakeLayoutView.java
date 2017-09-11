package com.progressoft.workshop.layout.client.views;

import com.google.gwt.user.client.ui.IsWidget;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.workshop.layout.client.presenters.LayoutPresenter;
import com.progressoft.workshop.layout.shared.extension.LayoutContext;

@UiView(presentable = LayoutPresenter.class)
public class FakeLayoutView implements LayoutView {

    private boolean shown;
    private LayoutContext.Content content;

    @Override
    public void show() {
        shown = true;
    }

    @Override
    public void setContent(LayoutContext.Content content) {
        this.content = content;
    }

    public boolean isShown() {
        return shown;
    }

    public LayoutContext.Content getContent() {
        return content;
    }
}
