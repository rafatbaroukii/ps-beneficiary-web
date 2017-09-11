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
        @Template("<style is=\"custom-style\">    html, body {      margin: 0;      font-family: 'Roboto', 'Noto', sans-serif;      -webkit-font-smoothing: antialiased;      background: #f1f1f1;      max-height: 368px;    }    app-toolbar {      background-color: #4285f4;      color: #fff;    }    paper-icon-button {      --paper-icon-button-ink-color: white;    }    paper-icon-button + [main-title] {      margin-left: 24px;    }    paper-progress {      display: block;      width: 100%;      --paper-progress-active-color: rgba(255, 255, 255, 0.5);      --paper-progress-container-color: transparent;    }    app-header {      @apply --layout-fixed-top;      color: #fff;      --app-header-background-rear-layer: {        background-color: #ef6c00;      };    }    app-drawer {      --app-drawer-scrim-background: rgba(0, 0, 100, 0.8);      --app-drawer-content-container: {        background-color: #B0BEC5;      }    }    .contentContainer{        margin-top: 64px !important;    }    </style> <app-header reveals data-element=\"header\">  <app-toolbar>   <div main-title>   Beneficiary  </div>  </app-toolbar> </app-header> <div class=\"contentContainer\" data-element=\"contentContainer\"> </div>")
        SafeHtml value();
    }

    private final static InnerHtml INNER_HTML = GWT.create(InnerHtml.class);
    private final HTMLElement templated_layout_root_element;

 public Templated_Layout() {

        this.templated_layout_root_element = (HTMLElement)DomGlobal.document.createElement("div");
        this.templated_layout_root_element.innerHTML = INNER_HTML.value().asString();

        if (this.header == null) {
            this.header = TemplateUtil.<com.vaadin.polymer.app.AppHeaderElement>resolveElementAs(templated_layout_root_element, "header");
        } else {
            TemplateUtil.replaceElement(templated_layout_root_element, "header", header);
        }
        if (this.contentContainer == null) {
            this.contentContainer = TemplateUtil.<elemental2.dom.HTMLDivElement>resolveElementAs(templated_layout_root_element, "contentContainer");
        } else {
            TemplateUtil.replaceElement(templated_layout_root_element, "contentContainer", contentContainer);
        }
    }

    @Override
    public HTMLElement asElement() {
        return templated_layout_root_element;
    }
}
