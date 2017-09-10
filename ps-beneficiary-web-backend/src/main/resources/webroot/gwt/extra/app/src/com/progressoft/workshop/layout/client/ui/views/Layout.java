package com.progressoft.workshop.layout.client.ui.views;

import com.vaadin.polymer.app.AppDrawerElement;
import com.vaadin.polymer.app.AppHeaderElement;
import elemental2.dom.HTMLElement;
import jsinterop.base.Js;
import org.jboss.gwt.elemento.core.IsElement;
import org.jboss.gwt.elemento.template.DataElement;
import org.jboss.gwt.elemento.template.Templated;

@Templated(value = "layout.html#rootDiv")
abstract class Layout implements IsElement<HTMLElement> {

    @DataElement
    public HTMLElement header;

    @DataElement
    public HTMLElement drawer;


    public static Layout create(){
        return new Templated_Layout();
    }

    public AppHeaderElement getHeader() {
        return Js.cast(header);
    }

    public AppDrawerElement getDrawer() {
        return Js.cast(drawer);
    }
}
