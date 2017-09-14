package com.progressoft.workshop.beneficiarieslist.client.presenters;

import com.progressoft.brix.components.layout.shared.extension.LayoutContext;
import com.progressoft.brix.components.layout.shared.extension.LayoutExtensionPoint;
import com.progressoft.brix.domino.api.client.mvp.presenter.Presentable;
import com.progressoft.brix.domino.api.shared.extension.MainExtensionPoint;
import com.progressoft.brix.domino.api.shared.extension.MainContext;
import com.progressoft.brix.domino.api.client.annotations.InjectContext;

public interface BeneficiariesListPresenter extends Presentable{

    @InjectContext(extensionPoint=LayoutExtensionPoint.class)
    void contributeToLayoutModule(LayoutContext context);
}