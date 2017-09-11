package com.progressoft.workshop.beneficiarieslist.client.views;

import com.progressoft.brix.domino.api.client.mvp.view.View;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;

import static com.progressoft.workshop.layout.shared.extension.LayoutContext.Content;

public interface BeneficiariesListView<T> extends View, Content<T> {
    void addBeneficiary(BeneficiaryInfo beneficiaryInfo);
}