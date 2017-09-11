package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;

import javax.annotation.Generated;

/*
 * WARNING! This class is generated. Do not modify.
 */
@Generated("org.jboss.gwt.elemento.processor.TemplatedProcessor")
public final class Templated_BeneficiariesList extends BeneficiariesList {

    static interface InnerHtml extends SafeHtmlTemplates {
        @Template("<table>  <colgroup>   <col name=\"name\" width=\"150px\">   <col name=\"cif\" width=\"150px\">   <col name=\"role\" flex>  </colgroup> </table>")
        SafeHtml value();
    }

    private final static InnerHtml INNER_HTML = GWT.create(InnerHtml.class);
    private final HTMLElement templated_beneficiarieslist_root_element;

 public Templated_BeneficiariesList() {

        this.templated_beneficiarieslist_root_element = (HTMLElement)DomGlobal.document.createElement("vaadin-grid");
        this.templated_beneficiarieslist_root_element.setAttribute("visible-rows", "8");
        this.templated_beneficiarieslist_root_element.setAttribute("selection-mode", "multi");
        this.templated_beneficiarieslist_root_element.innerHTML = INNER_HTML.value().asString();

    }

    @Override
    public HTMLElement asElement() {
        return templated_beneficiarieslist_root_element;
    }
}
