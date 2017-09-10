package com.progressoft.workshop.layout.client.ui.views;

import com.progressoft.workshop.layout.shared.extension.LayoutContext;
import com.vaadin.polymer.app.AppHeaderElement;
import com.vaadin.polymer.vaadin.VaadinGridElement;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import jsinterop.base.Js;
import org.jboss.gwt.elemento.core.IsElement;
import org.jboss.gwt.elemento.template.DataElement;
import org.jboss.gwt.elemento.template.Templated;

@Templated(value = "layout.html#rootDiv")
abstract class Layout implements IsElement<HTMLElement> {

    @DataElement
    public AppHeaderElement header;

    @DataElement
    public HTMLDivElement contentDiv;


    public static Layout create() {
        return new Templated_Layout();
    }

    public void setContent(LayoutContext.Content isWidget) {
        contentDiv.appendChild(Js.cast(isWidget));
    }
}
