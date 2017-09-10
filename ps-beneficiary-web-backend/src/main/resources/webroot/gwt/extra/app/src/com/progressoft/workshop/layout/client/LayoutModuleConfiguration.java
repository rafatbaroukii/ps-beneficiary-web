package com.progressoft.workshop.layout.client;

import com.progressoft.brix.domino.api.client.ModuleConfiguration;
import com.progressoft.brix.domino.api.client.mvp.PresenterRegistry;
import com.progressoft.brix.domino.api.client.mvp.presenter.LazyPresenterLoader;
import com.progressoft.brix.domino.api.client.mvp.presenter.Presentable;
import com.progressoft.workshop.layout.client.presenters.LayoutPresenter;
import com.progressoft.workshop.layout.client.presenters.DefaultLayoutPresenter;
import com.progressoft.brix.domino.api.client.request.RequestRegistry;
import com.progressoft.workshop.layout.client.requests.LayoutServerRequest;
import com.progressoft.workshop.layout.client.requests.ObtainMainExtensionPointForLayoutPresenterClientRequest;
import com.progressoft.brix.domino.api.client.extension.ContributionsRegistry;
import com.progressoft.workshop.layout.client.contributions.LayoutPresenterContributionToMainExtensionPoint;
import com.progressoft.brix.domino.api.shared.extension.MainExtensionPoint;
import com.progressoft.brix.domino.api.client.request.RequestRestSendersRegistry;
import com.progressoft.brix.domino.api.client.request.LazyRequestRestSenderLoader;
import com.progressoft.brix.domino.api.client.request.RequestRestSender;
import com.progressoft.workshop.layout.client.requests.LayoutServerRequestSender;

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

		registry.registerRequest(LayoutServerRequest.class.getCanonicalName(), LayoutPresenter.class.getCanonicalName());
		registry.registerRequest(ObtainMainExtensionPointForLayoutPresenterClientRequest.class.getCanonicalName(), LayoutPresenter.class.getCanonicalName());
	}

	@Override
	public void registerContributions(ContributionsRegistry registry){

		registry.registerContribution(MainExtensionPoint.class, new LayoutPresenterContributionToMainExtensionPoint());
	}

	@Override
	public void registerRequestRestSenders(RequestRestSendersRegistry registry){

		registry.registerRequestRestSender(LayoutServerRequest.class.getCanonicalName(),
				new LazyRequestRestSenderLoader() {
					@Override
					protected RequestRestSender make() {
						return new LayoutServerRequestSender();
					}
				});
	}
}