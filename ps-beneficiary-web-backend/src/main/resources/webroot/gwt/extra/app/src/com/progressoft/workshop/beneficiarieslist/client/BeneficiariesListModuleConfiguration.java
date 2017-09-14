package com.progressoft.workshop.beneficiarieslist.client;

import com.progressoft.brix.domino.api.client.ModuleConfiguration;
import com.progressoft.brix.domino.api.client.mvp.PresenterRegistry;
import com.progressoft.brix.domino.api.client.mvp.presenter.LazyPresenterLoader;
import com.progressoft.brix.domino.api.client.mvp.presenter.Presentable;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.presenters.DefaultBeneficiariesListPresenter;
import com.progressoft.brix.domino.api.client.request.RequestRegistry;
import com.progressoft.workshop.beneficiarieslist.client.requests.BeneficiariesListServerRequest;
import com.progressoft.workshop.beneficiarieslist.client.requests.ObtainLayoutExtensionPointForBeneficiariesListPresenterClientRequest;
import com.progressoft.brix.domino.api.client.extension.ContributionsRegistry;
import com.progressoft.workshop.beneficiarieslist.client.contributions.BeneficiariesListPresenterContributionToLayoutExtensionPoint;
import com.progressoft.brix.components.layout.shared.extension.LayoutExtensionPoint;
import com.progressoft.brix.domino.api.client.request.RequestRestSendersRegistry;
import com.progressoft.brix.domino.api.client.request.LazyRequestRestSenderLoader;
import com.progressoft.brix.domino.api.client.request.RequestRestSender;
import com.progressoft.workshop.beneficiarieslist.client.requests.BeneficiariesListServerRequestSender;

public class BeneficiariesListModuleConfiguration implements ModuleConfiguration{

	@Override
	public void registerPresenters(PresenterRegistry registry){

		registry.registerPresenter(new LazyPresenterLoader(BeneficiariesListPresenter.class.getCanonicalName(), DefaultBeneficiariesListPresenter.class.getCanonicalName()) {
			@Override
			protected Presentable make() {
				return new DefaultBeneficiariesListPresenter();
			}
		});
	}

	@Override
	public void registerRequests(RequestRegistry registry){

		registry.registerRequest(BeneficiariesListServerRequest.class.getCanonicalName(), BeneficiariesListPresenter.class.getCanonicalName());
		registry.registerRequest(ObtainLayoutExtensionPointForBeneficiariesListPresenterClientRequest.class.getCanonicalName(), BeneficiariesListPresenter.class.getCanonicalName());
	}

	@Override
	public void registerContributions(ContributionsRegistry registry){

		registry.registerContribution(LayoutExtensionPoint.class, new BeneficiariesListPresenterContributionToLayoutExtensionPoint());
	}

	@Override
	public void registerRequestRestSenders(RequestRestSendersRegistry registry){

		registry.registerRequestRestSender(BeneficiariesListServerRequest.class.getCanonicalName(),
				new LazyRequestRestSenderLoader() {
					@Override
					protected RequestRestSender make() {
						return new BeneficiariesListServerRequestSender();
					}
				});
	}
}