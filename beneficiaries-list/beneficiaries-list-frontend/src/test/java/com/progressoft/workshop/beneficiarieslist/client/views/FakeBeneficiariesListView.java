package com.progressoft.workshop.beneficiarieslist.client.views;

import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;

import java.util.ArrayList;
import java.util.List;

@UiView(presentable = BeneficiariesListPresenter.class)
public class FakeBeneficiariesListView implements BeneficiariesListView {

    public List<BeneficiaryInfo> beneficiaries = new ArrayList<>();

    @Override
    public Object get() {
        return null;
    }

    @Override
    public void addBeneficiary(BeneficiaryInfo beneficiaryInfo) {
        beneficiaries.add(beneficiaryInfo);
    }
}
