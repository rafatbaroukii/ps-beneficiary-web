package com.progressoft.brix.components.layout.shared.extension;


import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.IsWidget;
import com.progressoft.brix.domino.api.shared.extension.Context;

public interface LayoutContext extends Context {

    void addMenuItem(MenuItem menuItem);

    void setContent(Content content);

    void setHeaderText(String headerText);

    void setMenuImage(Image image);

    interface MenuItem {
    }

    interface Content {
    }

    interface Image {
        ImageResource getAsResource();
    }
}
