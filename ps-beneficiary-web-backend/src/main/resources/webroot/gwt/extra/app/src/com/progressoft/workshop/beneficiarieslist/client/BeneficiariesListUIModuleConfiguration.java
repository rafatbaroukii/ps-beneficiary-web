package com.progressoft.workshop.beneficiarieslist.client;

import com.progressoft.brix.domino.api.client.ModuleConfiguration;
import com.progressoft.brix.domino.api.client.mvp.ViewRegistry;
import com.progressoft.brix.domino.api.client.mvp.view.LazyViewLoader;
import com.progressoft.brix.domino.api.client.mvp.view.View;
import com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;

public class BeneficiariesListUIModuleConfiguration implements ModuleConfiguration{

	@Override
	public void registerViews(ViewRegistry registry){

		registry.registerView(new LazyViewLoader(BeneficiariesListPresenter.class.getCanonicalName()) {
			@Override
			protected View make() {
				return new DefaultBeneficiariesListView();
			}
		});
	}
}