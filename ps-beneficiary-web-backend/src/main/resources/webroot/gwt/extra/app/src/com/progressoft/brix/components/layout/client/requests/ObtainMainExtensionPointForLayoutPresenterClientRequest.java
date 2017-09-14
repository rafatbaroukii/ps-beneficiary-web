package com.progressoft.brix.components.layout.client.requests;

import com.progressoft.brix.domino.api.client.request.ClientRequest;
import com.progressoft.brix.domino.api.client.annotations.Request;
import com.progressoft.brix.components.layout.client.presenters.LayoutPresenter;
import com.progressoft.brix.domino.api.shared.extension.MainExtensionPoint;

@Request
public class ObtainMainExtensionPointForLayoutPresenterClientRequest extends ClientRequest<LayoutPresenter>{

	private MainExtensionPoint extensionPoint;

	public ObtainMainExtensionPointForLayoutPresenterClientRequest(MainExtensionPoint extensionPoint){

		this.extensionPoint=extensionPoint;
	}

	@Override
	protected void process(LayoutPresenter presenter){

			presenter.contributeToMainModule(extensionPoint.context());
	}
}