package com.progressoft.workshop.layout.client.ui.views;

import com.vaadin.polymer.app.AppHeaderElement;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import org.jboss.gwt.elemento.core.IsElement;
import org.jboss.gwt.elemento.template.DataElement;
import org.jboss.gwt.elemento.template.Templated;

@Templated(value = "layout.html#rootDiv")
abstract class Layout implements IsElement<HTMLElement> {

    @DataElement
    AppHeaderElement header;

    @DataElement
    HTMLDivElement contentContainer;

    public static Layout create() {
        return new Templated_Layout();
    }

}
