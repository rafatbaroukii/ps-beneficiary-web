package com.progressoft.workshop.beneficiarieslist.client;

import com.google.gwt.core.client.EntryPoint;
import com.progressoft.brix.domino.api.client.ModuleConfigurator;
import com.progressoft.brix.domino.api.client.annotations.ClientModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ClientModule(name="BeneficiariesListUI")
public class BeneficiariesListUIClientModule implements EntryPoint {

	private static final Logger LOGGER = LoggerFactory.getLogger(BeneficiariesListUIClientModule.class);

	public void onModuleLoad() {
		LOGGER.info("Initializing BeneficiariesList client UI module ...");
		new ModuleConfigurator().configureModule(new BeneficiariesListUIModuleConfiguration());
	}
}
