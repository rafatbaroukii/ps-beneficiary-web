package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.google.gwt.user.client.ui.IsWidget;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListView;
import org.jboss.gwt.elemento.core.Elements;

@UiView(presentable = BeneficiariesListPresenter.class)
public class DefaultBeneficiariesListView implements BeneficiariesListView{

    private BeneficiariesList beneficiariesList=BeneficiariesList.create();

    public DefaultBeneficiariesListView() {

    }

    @Override
    public IsWidget get() {
        return Elements.asWidget(beneficiariesList);
    }
}