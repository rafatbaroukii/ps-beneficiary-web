package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import org.jboss.gwt.elemento.core.IsElement;
import org.jboss.gwt.elemento.template.DataElement;
import org.jboss.gwt.elemento.template.Templated;

import javax.annotation.PostConstruct;

@Templated("beneficiary-card.html")
public abstract class BeneficiaryCard implements IsElement<HTMLElement> {

    @DataElement
    HTMLDivElement name;

    @DataElement
    HTMLDivElement cif;

    @DataElement
    HTMLDivElement country;

    abstract BeneficiaryInfo beneficiaryInfo();

    @PostConstruct
    public void init() {
        name.textContent = beneficiaryInfo().name;
        cif.textContent = beneficiaryInfo().cif;
        country.textContent = beneficiaryInfo().alpha3Code;
    }

    public static BeneficiaryCard create(BeneficiaryInfo beneficiaryInfo) {
        return new Templated_BeneficiaryCard(beneficiaryInfo);
    }
}
