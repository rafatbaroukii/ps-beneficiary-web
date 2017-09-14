package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.*;

import static com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListView.BeneficiarySelectionHandler;

public class BeneficiaryItem extends Composite {

    private  BeneficiaryInfo beneficiaryInfo;
    private  BeneficiarySelectionHandler selectHandler;
    private  BeneficiarySelectionHandler deselectHandler;
    private  BeneficiarySelectionHandler openHandler;

    interface BeneficiaryItemUiBinder extends UiBinder<MaterialCollectionItem, BeneficiaryItem> {
    }

    private static BeneficiaryItemUiBinder ourUiBinder = GWT.create(BeneficiaryItemUiBinder.class);

    @UiField
    MaterialLabel name;

    @UiField
    MaterialLabel cif;

    @UiField
    MaterialLabel country;

    @UiField
    MaterialCheckBox selector;

    @UiField
    MaterialIcon statusIcon;

    public BeneficiaryItem(BeneficiaryInfo beneficiaryInfo,
                           BeneficiarySelectionHandler selectHandler,
                           BeneficiarySelectionHandler deselectHandler,
                           BeneficiarySelectionHandler openHandler) {
        this.beneficiaryInfo = beneficiaryInfo;
        this.selectHandler = selectHandler;
        this.deselectHandler = deselectHandler;
        this.openHandler = openHandler;
        initWidget(ourUiBinder.createAndBindUi(this));

        name.setText(beneficiaryInfo.name);
        cif.setText(beneficiaryInfo.cif);
        country.setText(beneficiaryInfo.alpha3Code);

        statusIcon.setIconType(beneficiaryInfo.active? IconType.ASSIGNMENT_TURNED_IN: IconType.ASSIGNMENT_LATE);
        statusIcon.setBackgroundColor(beneficiaryInfo.active? Color.GREEN: Color.AMBER_DARKEN_3);

    }

    @UiHandler({"name", "cif", "country"})
    public void onOpenItem(ClickEvent event){
        this.openHandler.onSelectionChanged(this.beneficiaryInfo);
    }

    @UiHandler("selector")
    void onChange(ValueChangeEvent<Boolean> event){
        if(event.getValue())
            select();
        else
            deselect();
    }

    private void deselect() {
        deselectHandler.onSelectionChanged(this.beneficiaryInfo);
    }

    private void select() {
        selectHandler.onSelectionChanged(this.beneficiaryInfo);
    }


}