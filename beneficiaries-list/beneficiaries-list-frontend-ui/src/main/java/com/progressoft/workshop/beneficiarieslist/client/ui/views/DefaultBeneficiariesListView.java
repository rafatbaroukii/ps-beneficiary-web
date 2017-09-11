package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListView;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import jsinterop.base.Js;

@UiView(presentable = BeneficiariesListPresenter.class)
public class DefaultBeneficiariesListView implements BeneficiariesListView<HTMLElement> {

    private BeneficiariesList beneficiariesList = BeneficiariesList.create();
    private BeneficiariesCardListing beneficiariesCardListing = BeneficiariesCardListing.create();

    public DefaultBeneficiariesListView() {
//        get().style.height= CSSProperties.HeightUnionType.of("100%");
//        get().setItems(new Array<JsBeneficiary>());
    }

    @Override
    public HTMLDivElement get() {
        return Js.cast(beneficiariesCardListing.asElement());
    }

    @Override
    public void addBeneficiary(BeneficiaryInfo beneficiaryInfo) {
        JsBeneficiary jsBeneficiary = new JsBeneficiary();
        jsBeneficiary.name = beneficiaryInfo.name;
        jsBeneficiary.cif = beneficiaryInfo.cif;
        jsBeneficiary.country = beneficiaryInfo.alpha3Code;

        BeneficiaryCard beneficiaryCard = BeneficiaryCard.create(beneficiaryInfo);
        get().appendChild(beneficiaryCard.asElement());
//        get().appendChild()
//        Array<JsBeneficiary> items = Js.cast(get().getItems());
//        items.push(jsBeneficiary);
    }
}