package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import elemental2.dom.HTMLElement;
import org.jboss.gwt.elemento.core.IsElement;
import org.jboss.gwt.elemento.template.Templated;

@Templated("beneficiaries-card-listing.html")
public abstract class BeneficiariesCardListing implements IsElement<HTMLElement> {

    public static BeneficiariesCardListing create() {
        return new Templated_BeneficiariesCardListing();
    }
}
