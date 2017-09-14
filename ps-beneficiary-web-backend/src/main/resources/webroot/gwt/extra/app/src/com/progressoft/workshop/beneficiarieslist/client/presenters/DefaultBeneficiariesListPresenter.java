package com.progressoft.workshop.beneficiarieslist.client.presenters;

import com.progressoft.brix.components.layout.shared.extension.LayoutContext;
import com.progressoft.brix.domino.api.client.annotations.Presenter;
import com.progressoft.brix.domino.api.client.mvp.presenter.BaseClientPresenter;
import com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListView;
import com.progressoft.brix.domino.api.shared.extension.MainContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Presenter
public class DefaultBeneficiariesListPresenter extends BaseClientPresenter<BeneficiariesListView> implements BeneficiariesListPresenter {

    private static final Logger LOGGER=LoggerFactory.getLogger(DefaultBeneficiariesListPresenter.class);

    @Override
    public void contributeToLayoutModule(LayoutContext context) {
        context.setContent(view);
    }
}