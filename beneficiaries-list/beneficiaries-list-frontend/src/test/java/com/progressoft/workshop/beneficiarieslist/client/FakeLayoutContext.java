package com.progressoft.workshop.beneficiarieslist.client;

import com.progressoft.brix.components.layout.shared.extension.LayoutContext;

public class FakeLayoutContext implements LayoutContext {
    private Content content;

    @Override
    public void addMenuItem(MenuItem menuItem) {

    }

    @Override
    public void setContent(Content content) {
        this.content = content;
    }

    @Override
    public void setHeaderText(String headerText) {

    }

    @Override
    public void setMenuImage(Image image) {

    }

    public Content getContent() {
        return content;
    }
}
