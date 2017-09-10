package com.progressoft.workshop.layout.client;

import com.google.gwt.core.client.EntryPoint;
import com.progressoft.brix.domino.api.client.ModuleConfigurator;
import com.progressoft.brix.domino.api.client.annotations.ClientModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ClientModule(name="LayoutUI")
public class LayoutUIClientModule implements EntryPoint {

	private static final Logger LOGGER = LoggerFactory.getLogger(LayoutUIClientModule.class);

	public void onModuleLoad() {

//		Polymer.importHref(AppDrawerElement.SRC);

		LOGGER.info("Initializing Layout client UI module ...");
		new ModuleConfigurator().configureModule(new LayoutUIModuleConfiguration());
	}
}