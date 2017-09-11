package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import elemental2.dom.HTMLElement;
import org.jboss.gwt.elemento.core.IsElement;
import org.jboss.gwt.elemento.template.Templated;

@Templated("beneficiaries-list.html")
abstract class BeneficiariesList implements IsElement<HTMLElement> {

    public static BeneficiariesList create() {
        return new Templated_BeneficiariesList();
    }

}
