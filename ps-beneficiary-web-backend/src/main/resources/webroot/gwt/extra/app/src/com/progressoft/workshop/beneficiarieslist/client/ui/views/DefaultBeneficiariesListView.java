package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListView;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;
import com.vaadin.polymer.vaadin.VaadinGridElement;
import elemental2.core.Array;
import jsinterop.base.Js;

@UiView(presentable = BeneficiariesListPresenter.class)
public class DefaultBeneficiariesListView implements BeneficiariesListView<VaadinGridElement> {

    private BeneficiariesList beneficiariesList = BeneficiariesList.create();

    public DefaultBeneficiariesListView() {

    }

    @Override
    public VaadinGridElement get() {
        return Js.cast(beneficiariesList.asElement());
    }

    @Override
    public void addBeneficiary(BeneficiaryInfo beneficiaryInfo) {
        JsBeneficiary jsBeneficiary = new JsBeneficiary();
        jsBeneficiary.name = beneficiaryInfo.name;
        jsBeneficiary.cif = beneficiaryInfo.cif;
        jsBeneficiary.country = beneficiaryInfo.alpha3Code;

        Array<JsBeneficiary> items = (Array<JsBeneficiary>) get().getItems();
        items.push(jsBeneficiary);
    }
}