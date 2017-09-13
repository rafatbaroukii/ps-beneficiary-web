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
        final Array<JsBeneficiary> items = new Array<>();

        JsBeneficiary beneficiary=new JsBeneficiary();
        beneficiary.name="xxx";
        beneficiary.cif="eee";
        beneficiary.country="JOR";
        items.push(beneficiary);
        list.setItems(items);
    }

    public static BeneficiariesCardListing create() {
        return new Templated_BeneficiariesCardListing();
    }
}
