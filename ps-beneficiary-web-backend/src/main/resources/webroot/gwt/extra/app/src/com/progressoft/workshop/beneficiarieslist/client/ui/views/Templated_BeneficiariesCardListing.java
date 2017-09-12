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
        @Template("<style is=\"custom-style\">        paper-scroll-header-panel {            @apply(--layout-fit);            @apply(--layout-vertical);            @apply(--paper-font-common-base);            margin-top: 50px;        }        iron-list {            background-color: var(--paper-grey-200, #eee);            padding-bottom: 16px;            padding-top : 5px;            flex: 1 1 auto;        }        .item {            @apply(--layout-horizontal);            margin: 16px 16px 0 16px;            padding: 20px;            border-radius: 8px;            background-color: white;            border: 1px solid #ddd;        }        .avatar {            height: 40px;            width: 40px;            border-radius: 20px;            box-sizing: border-box;            background-color: #DDD;        }        .pad {            padding: 0 16px;            @apply(--layout-flex);            @apply(--layout-vertical);        }        .primary {            font-size: 16px;            font-weight: bold;        }        .secondary {            font-size: 14px;        }        .dim {            color: gray;        }    </style> <iron-list as=\"item\" data-element=\"list\">  <template>   <div>    <div class=\"item\">     <div class=\"pad\">      <div class=\"primary\">      [[item.name]]     </div>      <div class=\"secondary\">      [[item.cif]]     </div>      <div class=\"secondary dim\">      [[item.country]]     </div>     </div>     <iron-icon icon=\"star\" />    </div>   </div>  </template> </iron-list>")
        SafeHtml value();
    }

    private final static InnerHtml INNER_HTML = GWT.create(InnerHtml.class);
    private final HTMLElement templated_beneficiariescardlisting_root_element;

 public Templated_BeneficiariesCardListing() {

        this.templated_beneficiariescardlisting_root_element = (HTMLElement)DomGlobal.document.createElement("div");
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
