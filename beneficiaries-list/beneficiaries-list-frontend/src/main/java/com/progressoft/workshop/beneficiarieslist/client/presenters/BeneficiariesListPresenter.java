package com.progressoft.workshop.beneficiarieslist.client.presenters;

import com.progressoft.brix.components.layout.shared.extension.LayoutContext;
import com.progressoft.brix.components.layout.shared.extension.LayoutExtensionPoint;
import com.progressoft.brix.domino.api.client.mvp.presenter.Presentable;
import com.progressoft.brix.domino.api.shared.extension.MainExtensionPoint;
import com.progressoft.brix.domino.api.shared.extension.MainContext;
import com.progressoft.brix.domino.api.client.annotations.InjectContext;
import com.progressoft.workshop.beneficiarieslist.shared.extension.BeneficiariesListContext;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;

import java.util.List;

import static com.progressoft.workshop.beneficiarieslist.shared.extension.BeneficiariesListContext.*;

public interface BeneficiariesListPresenter extends Presentable{

    @InjectContext(extensionPoint=LayoutExtensionPoint.class)
    void contributeToLayoutModule(LayoutContext context);

    void onBeneficiariesListReceived(List<BeneficiaryInfo> beneficiaries);

    void addActionItem(ActionItem actionItem);
}