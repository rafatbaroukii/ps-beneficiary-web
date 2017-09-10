package com.progressoft.workshop.layout.client.contributions;

import com.progressoft.brix.domino.api.client.annotations.Contribute;
import com.progressoft.brix.domino.api.shared.extension.Contribution;
import com.progressoft.workshop.layout.shared.extension.LayoutContext;
import com.progressoft.workshop.layout.shared.extension.LayoutExtensionPoint;

@Contribute
public class FakeLayoutContribution implements Contribution<LayoutExtensionPoint> {
    private LayoutContext context;

    public LayoutContext getContext() {
        return context;
    }

    @Override
    public void contribute(LayoutExtensionPoint extensionPoint) {
        context = extensionPoint.context();
    }
}
