package com.progressoft.brix.components.layout.client;

import com.progressoft.brix.domino.api.client.ModuleConfiguration;
import com.progressoft.brix.domino.api.client.mvp.PresenterRegistry;
import com.progressoft.brix.domino.api.client.mvp.presenter.LazyPresenterLoader;
import com.progressoft.brix.domino.api.client.mvp.presenter.Presentable;
import com.progressoft.brix.components.layout.client.presenters.LayoutPresenter;
import com.progressoft.brix.components.layout.client.presenters.DefaultLayoutPresenter;
import com.progressoft.brix.domino.api.client.request.RequestRegistry;
import com.progressoft.brix.components.layout.client.requests.ObtainMainExtensionPointForLayoutPresenterClientRequest;
import com.progressoft.brix.domino.api.client.extension.ContributionsRegistry;
import com.progressoft.brix.components.layout.client.contributions.LayoutPresenterContributionToMainExtensionPoint;
import com.progressoft.brix.domino.api.shared.extension.MainExtensionPoint;

public class LayoutModuleConfiguration implements ModuleConfiguration{

	@Override
	public void registerPresenters(PresenterRegistry registry){

		registry.registerPresenter(new LazyPresenterLoader(LayoutPresenter.class.getCanonicalName(), DefaultLayoutPresenter.class.getCanonicalName()) {
			@Override
			protected Presentable make() {
				return new DefaultLayoutPresenter();
			}
		});
	}

	@Override
	public void registerRequests(RequestRegistry registry){

		registry.registerRequest(ObtainMainExtensionPointForLayoutPresenterClientRequest.class.getCanonicalName(), LayoutPresenter.class.getCanonicalName());
	}

	@Override
	public void registerContributions(ContributionsRegistry registry){

		registry.registerContribution(MainExtensionPoint.class, new LayoutPresenterContributionToMainExtensionPoint());
	}
}