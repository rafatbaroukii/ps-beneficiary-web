package com.progressoft.brix.components.layout.client;

import com.progressoft.brix.domino.api.client.ModuleConfiguration;
import com.progressoft.brix.domino.api.client.mvp.ViewRegistry;
import com.progressoft.brix.domino.api.client.mvp.view.LazyViewLoader;
import com.progressoft.brix.domino.api.client.mvp.view.View;
import com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView;
import com.progressoft.brix.components.layout.client.presenters.LayoutPresenter;

public class LayoutUIModuleConfiguration implements ModuleConfiguration{

	@Override
	public void registerViews(ViewRegistry registry){

		registry.registerView(new LazyViewLoader(LayoutPresenter.class.getCanonicalName()) {
			@Override
			protected View make() {
				return new DefaultLayoutView();
			}
		});
	}
}