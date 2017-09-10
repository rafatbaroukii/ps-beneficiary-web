package com.progressoft.workshop.beneficiarieslist.client.presenters;

public class BeneficiariesListPresenterSpy extends DefaultBeneficiariesListPresenter{


    @Override
    protected String getConcrete() {
        return DefaultBeneficiariesListPresenter.class.getCanonicalName();
    }
}
