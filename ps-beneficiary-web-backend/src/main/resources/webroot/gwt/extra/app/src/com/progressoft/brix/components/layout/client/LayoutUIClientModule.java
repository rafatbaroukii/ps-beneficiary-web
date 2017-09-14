package com.progressoft.brix.components.layout.client;

import com.google.gwt.core.client.EntryPoint;
import com.progressoft.brix.domino.api.client.ModuleConfigurator;
import com.progressoft.brix.domino.api.client.annotations.ClientModule;
import com.progressoft.brix.components.layout.client.ui.views.Bundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ClientModule(name="LayoutUI")
public class LayoutUIClientModule implements EntryPoint {

	private static final Logger LOGGER = LoggerFactory.getLogger(LayoutUIClientModule.class);

	public void onModuleLoad() {
		LOGGER.info("Initializing Layout frontend UI module ...");
		Bundle.INSTANCE.style().ensureInjected();
		new ModuleConfigurator().configureModule(new LayoutUIModuleConfiguration());
	}
}
