package com.progressoft.workshop.layout.client.views;

import com.progressoft.brix.domino.api.client.mvp.view.View;
import com.progressoft.workshop.layout.shared.extension.LayoutContext;

public interface LayoutView extends View {
    void show();

    void setContent(LayoutContext.Content content);
}