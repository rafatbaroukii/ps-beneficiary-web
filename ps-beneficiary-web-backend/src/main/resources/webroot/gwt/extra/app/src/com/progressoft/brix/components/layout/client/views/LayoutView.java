package com.progressoft.brix.components.layout.client.views;

import com.progressoft.brix.components.layout.shared.extension.LayoutContext.MenuItem;
import com.progressoft.brix.domino.api.client.mvp.view.View;

import static com.progressoft.brix.components.layout.shared.extension.LayoutContext.Content;
import static com.progressoft.brix.components.layout.shared.extension.LayoutContext.Image;

public interface LayoutView extends View {
    void show();

    void addMenuItem(MenuItem menuItem);

    void setContent(Content content);

    void setHeader(String headerText);

    void setMenuImage(Image image);
}