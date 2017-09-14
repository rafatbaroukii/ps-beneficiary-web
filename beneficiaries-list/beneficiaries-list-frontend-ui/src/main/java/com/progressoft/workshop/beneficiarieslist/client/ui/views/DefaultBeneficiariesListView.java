package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListView;
import com.progressoft.workshop.beneficiarieslist.shared.extension.BeneficiariesListContext;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;
import gwt.material.design.client.ui.MaterialCollection;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;
import jsinterop.base.Js;

@UiView(presentable = BeneficiariesListPresenter.class)
public class DefaultBeneficiariesListView extends Composite implements BeneficiariesListView {

    private BeneficiarySelectionHandler openHandler;
    private BeneficiarySelectionHandler selectHandler;
    private BeneficiarySelectionHandler deselectHandler;

    @UiField
    MaterialCollection beneficiaries;

    @UiField
    MaterialRow actionPanel;

    interface DefaultBeneficiariesListViewUiBinder extends UiBinder<MaterialPanel, DefaultBeneficiariesListView> {
    }

    private static DefaultBeneficiariesListViewUiBinder ourUiBinder = GWT.create(DefaultBeneficiariesListViewUiBinder.class);

    @Override
    public void onOpenBeneficiary(BeneficiarySelectionHandler openHandler) {
        this.openHandler = openHandler;
    }

    @Override
    public void addActionItem(BeneficiariesListContext.ActionItem actionItem) {
        actionPanel.add(Js.cast(actionItem));
    }

    @Override
    public void addBeneficiary(BeneficiaryInfo beneficiaryInfo) {

        final BeneficiaryItem beneficiaryItem = new BeneficiaryItem(beneficiaryInfo, selectHandler, deselectHandler, openHandler);

        beneficiaries.add(beneficiaryItem);
    }

    @Override
    public void onSelectBeneficiary(BeneficiarySelectionHandler beneficiarySelectionHandler) {
        selectHandler = beneficiarySelectionHandler;
    }

    @Override
    public void onDeselectBeneficiary(BeneficiarySelectionHandler beneficiarySelectionHandler) {
        deselectHandler = beneficiarySelectionHandler;
    }

    public DefaultBeneficiariesListView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}