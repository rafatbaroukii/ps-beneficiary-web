package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListView;
import gwt.material.design.client.ui.MaterialPanel;

@UiView(presentable = BeneficiariesListPresenter.class)
public class DefaultBeneficiariesListView extends Composite implements BeneficiariesListView {

    interface DefaultBeneficiariesListViewUiBinder extends UiBinder<MaterialPanel, DefaultBeneficiariesListView> {
    }

    private static DefaultBeneficiariesListViewUiBinder ourUiBinder = GWT.create(DefaultBeneficiariesListViewUiBinder.class);

    public DefaultBeneficiariesListView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}