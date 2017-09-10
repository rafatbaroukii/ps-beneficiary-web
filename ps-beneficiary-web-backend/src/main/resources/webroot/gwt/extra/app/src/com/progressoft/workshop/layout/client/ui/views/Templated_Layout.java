package com.progressoft.workshop.layout.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.jboss.gwt.elemento.template.TemplateUtil;

import javax.annotation.Generated;

/*
 * WARNING! This class is generated. Do not modify.
 */
@Generated("org.jboss.gwt.elemento.processor.TemplatedProcessor")
public final class Templated_Layout extends Layout {

    static interface InnerHtml extends SafeHtmlTemplates {
        @Template("<app-header reveals data-element=\"header\">  <app-toolbar>   <paper-icon-button icon=\"menu\" onclick=\"drawer.toggle()\"></paper-icon-button>   <div main-title>   My app  </div>   <paper-icon-button icon=\"delete\"></paper-icon-button>   <paper-icon-button icon=\"search\"></paper-icon-button>   <paper-icon-button icon=\"close\"></paper-icon-button>  </app-toolbar> </app-header> <app-drawer id=\"drawer\" swipe-open data-element=\"drawer\"></app-drawer>")
        SafeHtml value();
    }

    private final static InnerHtml INNER_HTML = GWT.create(InnerHtml.class);
    private final HTMLElement templated_layout_root_element;

 public Templated_Layout() {

        this.templated_layout_root_element = (HTMLElement)DomGlobal.document.createElement("div");
        this.templated_layout_root_element.innerHTML = INNER_HTML.value().asString();

        if (this.header == null) {
            this.header = TemplateUtil.resolveElement(templated_layout_root_element, "header");
        } else {
            TemplateUtil.replaceElement(templated_layout_root_element, "header", header);
        }
        if (this.drawer == null) {
            this.drawer = TemplateUtil.resolveElement(templated_layout_root_element, "drawer");
        } else {
            TemplateUtil.replaceElement(templated_layout_root_element, "drawer", drawer);
        }
    }

    @Override
    public HTMLElement asElement() {
        return templated_layout_root_element;
    }
}
