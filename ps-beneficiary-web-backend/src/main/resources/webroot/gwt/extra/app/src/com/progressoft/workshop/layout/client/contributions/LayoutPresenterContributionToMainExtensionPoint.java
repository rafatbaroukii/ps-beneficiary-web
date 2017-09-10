package com.progressoft.workshop.layout.client.contributions;

import com.progressoft.brix.domino.api.client.annotations.Contribute;
import com.progressoft.brix.domino.api.client.annotations.AutoRequest;
import com.progressoft.brix.domino.api.shared.extension.Contribution;
import com.progressoft.brix.domino.api.shared.extension.MainExtensionPoint;
import com.progressoft.workshop.layout.client.presenters.LayoutPresenter;
import com.progressoft.workshop.layout.client.requests.ObtainMainExtensionPointForLayoutPresenterClientRequest;

@Contribute
@AutoRequest(presenters={LayoutPresenter.class}, method="contributeToMainModule")
public class LayoutPresenterContributionToMainExtensionPoint implements Contribution<MainExtensionPoint>{

	@Override
	public void contribute(MainExtensionPoint extensionPoint){

			new ObtainMainExtensionPointForLayoutPresenterClientRequest(extensionPoint).send();
	}
}