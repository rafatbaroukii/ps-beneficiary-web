package com.progressoft.workshop.beneficiarieslist.client.views;

import com.progressoft.brix.components.layout.shared.extension.LayoutContext;
import com.progressoft.brix.domino.api.client.mvp.view.View;
import com.progressoft.workshop.beneficiarieslist.shared.extension.BeneficiariesListContext;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;

public interface BeneficiariesListView extends View, LayoutContext.Content {

    void addBeneficiary(BeneficiaryInfo beneficiaryInfo);

    void onSelectBeneficiary(BeneficiarySelectionHandler beneficiarySelectionHandler);

    void onDeselectBeneficiary(BeneficiarySelectionHandler beneficiarySelectionHandler);

    void onOpenBeneficiary(BeneficiarySelectionHandler beneficiarySelectionHandler);

    void addActionItem(BeneficiariesListContext.ActionItem actionItem);

    @FunctionalInterface
    interface BeneficiarySelectionHandler {
        void onSelectionChanged(BeneficiaryInfo beneficiaryInfo);
    }
}