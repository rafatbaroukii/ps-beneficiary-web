package com.progressoft.workshop.beneficiarieslist.client.presenters;

import com.progressoft.brix.components.layout.shared.extension.LayoutContext;
import com.progressoft.brix.domino.api.client.annotations.Presenter;
import com.progressoft.brix.domino.api.client.mvp.presenter.BaseClientPresenter;
import com.progressoft.workshop.beneficiarieslist.client.requests.BeneficiaryListServerRequest;
import com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListView;
import com.progressoft.brix.domino.api.shared.extension.MainContext;
import com.progressoft.workshop.beneficiarieslist.shared.extension.BeneficiariesListContext;
import com.progressoft.workshop.beneficiarieslist.shared.extension.BeneficiariesListExtensionPoint;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Presenter
public class DefaultBeneficiariesListPresenter extends BaseClientPresenter<BeneficiariesListView> implements BeneficiariesListPresenter {

    private static final Logger LOGGER=LoggerFactory.getLogger(DefaultBeneficiariesListPresenter.class);
    private ListContext context;

    @Override
    public void contributeToLayoutModule(LayoutContext context) {
        context.setContent(view);
        new BeneficiaryListServerRequest().send();
    }

    public DefaultBeneficiariesListPresenter() {
        context=new ListContext(this);
    }

    @Override
    public void addActionItem(BeneficiariesListContext.ActionItem actionItem) {
        view.addActionItem(actionItem);
    }

    @Override
    public void initView(BeneficiariesListView view) {
        view.onSelectBeneficiary(context::select);
        view.onDeselectBeneficiary(context::deselect);
        view.onOpenBeneficiary(context::onOpenBeneficiary);
    }


    @Override
    public void onBeneficiariesListReceived(List<BeneficiaryInfo> beneficiaries) {
        beneficiaries.forEach(b-> view.addBeneficiary(b));
        applyContributions(BeneficiariesListExtensionPoint.class, () -> context);
    }
}