package com.progressoft.workshop.beneficiarieslist.client.presenters;

import com.progressoft.brix.components.layout.shared.extension.LayoutContext;

public class BeneficiariesListPresenterSpy extends DefaultBeneficiariesListPresenter {

    private LayoutContext layoutContext;

    @Override
    public void contributeToLayoutModule(LayoutContext context) {
        super.contributeToLayoutModule(context);
        this.layoutContext=context;
    }

    @Override
    protected String getConcrete() {
        return DefaultBeneficiariesListPresenter.class.getCanonicalName();
    }

    public LayoutContext getLayoutContext() {
        return layoutContext;
    }

}
