package com.progressoft.workshop.beneficiarieslist.client.ui.views;

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
public final class Templated_BeneficiariesCardListing extends BeneficiariesCardListing {

    static interface InnerHtml extends SafeHtmlTemplates {
        @Template("<style is=\"custom-style\">        paper-scroll-header-panel {            @apply(--layout-fit);            @apply(--layout-vertical);            @apply(--paper-font-common-base);            margin-top: 50px;        }        iron-list {         --iron-list-items-container: {            margin : 0px 5px 0px 5px;        };            background-color: var(--paper-grey-200, #eee);            padding-bottom: 16px;        }        .item {            @apply(--layout-horizontal);            padding: 20px;            border-radius: 0px;            background-color: white;            border : 1px solid #e2e2e2;            border-bottom : 1px solid #bbb;            margin : 5px 0px 5px 0px;        }        .avatar {            height: 40px;            width: 40px;            border-radius: 20px;            box-sizing: border-box;            background-color: #DDD;        }        .pad {            padding: 0 16px;            @apply(--layout-flex);            @apply(--layout-vertical);        }        .primary {            font-size: 16px;            font-weight: bold;        }        .secondary {            font-size: 14px;        }        .dim {            color: gray;        }    </style> <app-toolbar>  <div main-title>  Drive title </div> </app-toolbar> <iron-list as=\"item\" data-element=\"list\" scroll-offset=\"2\" scroll-target=\"html\">  <template>   <div>    <li class=\"item\">     <div class=\"pad\">      <div class=\"primary\">      [[item.name]]     </div>      <div class=\"secondary\">      [[item.cif]]     </div>      <div class=\"secondary dim\">      [[item.country]]     </div>     </div>     <iron-icon icon=\"menu\" /> </li>   </div>  </template> </iron-list>")
        SafeHtml value();
    }

    private final static InnerHtml INNER_HTML = GWT.create(InnerHtml.class);
    private final HTMLElement templated_beneficiariescardlisting_root_element;

 public Templated_BeneficiariesCardListing() {

        this.templated_beneficiariescardlisting_root_element = (HTMLElement)DomGlobal.document.createElement("div");
        this.templated_beneficiariescardlisting_root_element.setAttribute("id", "mainContainer");
        this.templated_beneficiariescardlisting_root_element.setAttribute("style", "overflow-y: auto");
        this.templated_beneficiariescardlisting_root_element.innerHTML = INNER_HTML.value().asString();

        if (this.list == null) {
            this.list = TemplateUtil.<com.vaadin.polymer.iron.IronListElement>resolveElementAs(templated_beneficiariescardlisting_root_element, "list");
        } else {
            TemplateUtil.replaceElement(templated_beneficiariescardlisting_root_element, "list", list);
        }
        init();
    }

    @Override
    public HTMLElement asElement() {
        return templated_beneficiariescardlisting_root_element;
    }
}
