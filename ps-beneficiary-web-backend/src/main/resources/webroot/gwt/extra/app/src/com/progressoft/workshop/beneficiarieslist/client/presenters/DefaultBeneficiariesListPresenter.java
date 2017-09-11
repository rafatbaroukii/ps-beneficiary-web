package com.progressoft.workshop.beneficiarieslist.client.presenters;

import com.progressoft.brix.domino.api.client.annotations.Presenter;
import com.progressoft.brix.domino.api.client.mvp.presenter.BaseClientPresenter;
import com.progressoft.workshop.beneficiarieslist.client.requests.BeneficiariesListServerRequest;
import com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListView;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;
import com.progressoft.workshop.layout.shared.extension.LayoutContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Presenter
public class DefaultBeneficiariesListPresenter extends BaseClientPresenter<BeneficiariesListView> implements BeneficiariesListPresenter {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultBeneficiariesListPresenter.class);

    @Override
    public void contributeToLayoutModule(LayoutContext context) {
        context.setContent(view);
        new BeneficiariesListServerRequest().send();
    }

    @Override
    public void onBeneficiariesListReceived(List<BeneficiaryInfo> beneficiaries) {
        beneficiaries.forEach(view::addBeneficiary);
    }
}