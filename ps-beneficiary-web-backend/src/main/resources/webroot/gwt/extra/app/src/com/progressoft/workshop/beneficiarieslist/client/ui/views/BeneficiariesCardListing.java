package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.vaadin.polymer.iron.IronListElement;
import elemental2.core.Array;
import elemental2.dom.CSSProperties;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import org.jboss.gwt.elemento.core.IsElement;
import org.jboss.gwt.elemento.template.DataElement;
import org.jboss.gwt.elemento.template.Templated;

import javax.annotation.PostConstruct;

@Templated("beneficiaries-card-listing.html")
public abstract class BeneficiariesCardListing implements IsElement<HTMLElement> {

    @DataElement
    IronListElement list;

    @PostConstruct
    void init(){
        list.setItems(new Array<JsBeneficiary>());
    }

    public static BeneficiariesCardListing create() {
        return new Templated_BeneficiariesCardListing();
    }
}
