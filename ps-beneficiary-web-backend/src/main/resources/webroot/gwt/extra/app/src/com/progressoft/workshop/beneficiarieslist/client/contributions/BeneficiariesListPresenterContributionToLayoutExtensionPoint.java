package com.progressoft.workshop.beneficiarieslist.client.contributions;

import com.progressoft.brix.domino.api.client.annotations.Contribute;
import com.progressoft.brix.domino.api.client.annotations.AutoRequest;
import com.progressoft.brix.domino.api.shared.extension.Contribution;
import com.progressoft.brix.components.layout.shared.extension.LayoutExtensionPoint;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.requests.ObtainLayoutExtensionPointForBeneficiariesListPresenterClientRequest;

@Contribute
@AutoRequest(presenters={BeneficiariesListPresenter.class}, method="contributeToLayoutModule")
public class BeneficiariesListPresenterContributionToLayoutExtensionPoint implements Contribution<LayoutExtensionPoint>{

	@Override
	public void contribute(LayoutExtensionPoint extensionPoint){

			new ObtainLayoutExtensionPointForBeneficiariesListPresenterClientRequest(extensionPoint).send();
	}
}