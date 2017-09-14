package com.progressoft.workshop.beneficiarieslist.client.views;

import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.shared.extension.BeneficiariesListContext;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;

@UiView(presentable=BeneficiariesListPresenter.class)
public class FakeBeneficiariesListView implements BeneficiariesListView {

    @Override
    public void addBeneficiary(BeneficiaryInfo beneficiaryInfo) {

    }

    @Override
    public void onSelectBeneficiary(BeneficiarySelectionHandler beneficiarySelectionHandler) {

    }

    @Override
    public void onDeselectBeneficiary(BeneficiarySelectionHandler beneficiarySelectionHandler) {

    }

    @Override
    public void onOpenBeneficiary(BeneficiarySelectionHandler beneficiarySelectionHandler) {

    }

    @Override
    public void addActionItem(BeneficiariesListContext.ActionItem actionItem) {

    }
}
