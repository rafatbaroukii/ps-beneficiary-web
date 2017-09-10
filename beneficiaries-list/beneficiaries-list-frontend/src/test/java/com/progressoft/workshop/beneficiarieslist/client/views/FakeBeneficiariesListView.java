package com.progressoft.workshop.beneficiarieslist.client.views;

import com.google.gwt.user.client.ui.IsWidget;
import com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListView;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.brix.domino.api.client.annotations.UiView;

@UiView(presentable=BeneficiariesListPresenter.class)
public class FakeBeneficiariesListView implements BeneficiariesListView {

    public boolean revealed;

    @Override
    public IsWidget get() {
        return null;
    }
}
