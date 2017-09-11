package com.progressoft.workshop.beneficiarieslist.client.presenters;

import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;
import com.progressoft.workshop.layout.shared.extension.LayoutContext;

import java.util.List;

public class BeneficiariesListPresenterSpy extends DefaultBeneficiariesListPresenter {

    private LayoutContext layoutContext;
    public List<BeneficiaryInfo> beneficiariesList;

    @Override
    public void contributeToLayoutModule(LayoutContext context) {
        super.contributeToLayoutModule(context);
        this.layoutContext = context;
    }

    @Override
    public void onBeneficiariesListReceived(List<BeneficiaryInfo> beneficiaries) {
        super.onBeneficiariesListReceived(beneficiaries);
        beneficiariesList = beneficiaries;
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
