package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.vaadin.polymer.vaadin.VaadinGridElement;
import org.jboss.gwt.elemento.core.IsElement;
import org.jboss.gwt.elemento.template.Templated;

@Templated("beneficiaries-list.html")
abstract class BeneficiariesList implements IsElement<VaadinGridElement>{

    public static BeneficiariesList create(){
        return new Templated_BeneficiariesList();
    }

}
