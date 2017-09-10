package com.progressoft.workshop.layout.shared.extension;

import com.progressoft.brix.domino.api.shared.extension.Context;

public interface LayoutContext extends Context {
    void setContent(Content content);

    interface Content {
    }
}
