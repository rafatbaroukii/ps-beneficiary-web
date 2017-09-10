package com.progressoft.workshop.beneficiarieslist.client;

import com.google.gwt.core.client.EntryPoint;
import com.progressoft.brix.domino.api.client.ModuleConfigurator;
import com.progressoft.brix.domino.api.client.annotations.ClientModule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ClientModule(name="BeneficiariesList")
public class BeneficiariesListClientModule implements EntryPoint {

	private static final Logger LOGGER = LoggerFactory.getLogger(BeneficiariesListClientModule.class);

	public void onModuleLoad() {
		LOGGER.info("Initializing BeneficiariesList client module ...");
		new ModuleConfigurator().configureModule(new BeneficiariesListModuleConfiguration());
	}
}
