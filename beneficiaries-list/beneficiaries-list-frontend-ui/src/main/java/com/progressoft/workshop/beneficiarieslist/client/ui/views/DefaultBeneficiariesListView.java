package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;

import com.progressoft.brix.domino.api.client.annotations.UiView;

import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListView;

@UiView(presentable = BeneficiariesListPresenter.class)
public class DefaultBeneficiariesListView extends Composite implements BeneficiariesListView{

    interface DefaultBeneficiariesListViewUiBinder extends UiBinder<HTMLPanel, DefaultBeneficiariesListView> {
    }

    private static DefaultBeneficiariesListViewUiBinder ourUiBinder = GWT.create(DefaultBeneficiariesListViewUiBinder.class);

    @UiField
    DivElement mainDiv;

    public DefaultBeneficiariesListView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @Override
    public IsWidget get() {
        return this;
    }
}