package com.progressoft.workshop.beneficiarieslist.client;

import com.progressoft.workshop.layout.shared.extension.LayoutContext;

public class FakeLayoutContext implements LayoutContext{
    public Content content;

    @Override
    public void setContent(Content content) {
        this.content = content;
    }
}
