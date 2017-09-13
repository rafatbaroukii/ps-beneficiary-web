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
        @Template("<style is=\"custom-style\">    html, body {        height: 100vh;      }      body {        margin: 0;        font-family: 'Roboto', 'Noto', sans-serif;        background-color: #666;      }      app-header-layout {        position: absolute;        top: 0px;        right: 0px;        bottom: 0px;        left: 0px;        background-color: #eee;        overflow: hidden;        box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);      }      app-header-layout #contentContainer{        margin-top :64px !important;      }      app-header {        background-color: #4285f4;        color: #fff;      }      paper-icon-button {        --paper-icon-button-ink-color: white;      }      .contentContainer{        padding-top : 5px;      }      #contentContainer{        margin-top :64px !important;      }    </style> <app-header-layout has-scrolling-region>  <app-header data-element=\"header\" slot=\"header\" effects=\"waterfall\" fixed style=\"height: 64px\">   <app-toolbar>    <div main-title>    Drive title qqqqqqqqq   </div>   </app-toolbar>  </app-header>  <div data-element=\"contentContainer\" class=\"fit contentContainer\"></div> </app-header-layout>")
        SafeHtml value();
    }

    private final static InnerHtml INNER_HTML = GWT.create(InnerHtml.class);
    private final HTMLElement templated_layout_root_element;

 public Templated_Layout() {

        this.templated_layout_root_element = (HTMLElement)DomGlobal.document.createElement("div");
        this.templated_layout_root_element.setAttribute("id", "rootDiv");
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
