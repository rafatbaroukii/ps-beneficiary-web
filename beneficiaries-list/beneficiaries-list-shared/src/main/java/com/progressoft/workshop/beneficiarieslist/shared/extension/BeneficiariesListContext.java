package com.progressoft.workshop.beneficiarieslist.shared.extension;


import com.progressoft.brix.domino.api.shared.extension.Context;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;

import java.util.Set;

public interface BeneficiariesListContext extends Context {

    Set<BeneficiaryInfo> selectedBeneficiaries();

    void addOpenBeneficiaryListener(OpenBeneficiaryListener listener);

    void removeOpenBeneficiaryListener(OpenBeneficiaryListener listener);

    void addSelectionChangedListener(SelectionChangedListener listener);

    void removeSelectionChangedListener(SelectionChangedListener listener);

    void addActionItem(ActionItem actionItem);

    @FunctionalInterface
    interface OpenBeneficiaryListener{
        void onOpenBeneficiary(BeneficiaryInfo beneficiaryInfo);
    }

    interface SelectionChangedListener {
        void onSelectionChanged();
    }

    interface ActionItem{}
}
