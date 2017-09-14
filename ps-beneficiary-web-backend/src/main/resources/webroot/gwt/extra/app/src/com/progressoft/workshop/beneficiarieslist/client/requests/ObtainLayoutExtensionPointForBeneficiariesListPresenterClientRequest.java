package com.progressoft.workshop.beneficiarieslist.client.requests;

import com.progressoft.brix.domino.api.client.request.ClientRequest;
import com.progressoft.brix.domino.api.client.annotations.Request;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.brix.components.layout.shared.extension.LayoutExtensionPoint;

@Request
public class ObtainLayoutExtensionPointForBeneficiariesListPresenterClientRequest extends ClientRequest<BeneficiariesListPresenter>{

	private LayoutExtensionPoint extensionPoint;

	public ObtainLayoutExtensionPointForBeneficiariesListPresenterClientRequest(LayoutExtensionPoint extensionPoint){

		this.extensionPoint=extensionPoint;
	}

	@Override
	protected void process(BeneficiariesListPresenter presenter){

			presenter.contributeToLayoutModule(extensionPoint.context());
	}
}