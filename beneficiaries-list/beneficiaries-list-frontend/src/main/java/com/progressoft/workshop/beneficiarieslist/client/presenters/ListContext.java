package com.progressoft.workshop.beneficiarieslist.client.presenters;

import com.progressoft.brix.domino.api.client.ClientApp;
import com.progressoft.workshop.beneficiarieslist.shared.extension.BeneficiariesListContext;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;

import java.util.HashSet;
import java.util.Set;

public class ListContext implements BeneficiariesListContext {
    private final BeneficiariesListPresenter presenter;
    private Set<BeneficiaryInfo> selectedBeneficiaries=new HashSet<>();
    private Set<com.progressoft.workshop.beneficiarieslist.shared.extension.BeneficiariesListContext.OpenBeneficiaryListener> openListeners=new HashSet<>();
    private Set<SelectionChangedListener> selectionListeners=new HashSet<>();

    public ListContext(BeneficiariesListPresenter presenter) {
        this.presenter = presenter;
    }

    void select(BeneficiaryInfo beneficiaryInfo){
        selectedBeneficiaries.add(beneficiaryInfo);
        onSelectionChanged();
    }

    void deselect(BeneficiaryInfo beneficiaryInfo){
        selectedBeneficiaries.remove(beneficiaryInfo);
        onSelectionChanged();
    }

    private void onSelectionChanged() {
        selectionListeners.forEach(l -> ClientApp.make().getAsyncRunner().runAsync(
                l::onSelectionChanged));
    }

    void onOpenBeneficiary(BeneficiaryInfo beneficiaryInfo){
        openListeners.forEach(l -> ClientApp.make().getAsyncRunner().runAsync(
                () -> l.onOpenBeneficiary(beneficiaryInfo)));
    }

    @Override
    public Set<BeneficiaryInfo> selectedBeneficiaries(){
        return new HashSet<>(selectedBeneficiaries);
    }

    @Override
    public void addOpenBeneficiaryListener(OpenBeneficiaryListener listener){
        openListeners.add(listener);
    }

    @Override
    public void removeOpenBeneficiaryListener(OpenBeneficiaryListener listener){
        openListeners.remove(listener);
    }


    @Override
    public void addSelectionChangedListener(SelectionChangedListener listener) {
        selectionListeners.add(listener);
    }

    @Override
    public void removeSelectionChangedListener(SelectionChangedListener listener) {
        selectionListeners.remove(listener);
    }

    @Override
    public void addActionItem(ActionItem actionItem){
        presenter.addActionItem(actionItem);
    }

}
