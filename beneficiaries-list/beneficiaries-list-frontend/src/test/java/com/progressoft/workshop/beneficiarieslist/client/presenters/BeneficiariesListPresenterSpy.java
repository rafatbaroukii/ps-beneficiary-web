package com.progressoft.workshop.beneficiarieslist.client.presenters;

import com.progressoft.workshop.beneficiarieslist.client.presenters.DefaultBeneficiariesListPresenter;
import com.progressoft.brix.domino.api.shared.extension.MainContext;
import com.progressoft.workshop.layout.shared.extension.LayoutContext;

public class BeneficiariesListPresenterSpy extends DefaultBeneficiariesListPresenter{

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

    public void setLayoutContext(LayoutContext layoutContext) {
        this.layoutContext = layoutContext;
    }
}
