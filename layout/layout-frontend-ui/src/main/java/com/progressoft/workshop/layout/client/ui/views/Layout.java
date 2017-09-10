package com.progressoft.workshop.layout.client.ui.views;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.client.Window;
import com.progressoft.workshop.layout.shared.extension.LayoutContext;
import com.vaadin.polymer.app.AppHeaderElement;
import com.vaadin.polymer.vaadin.VaadinComboBoxElement;
import com.vaadin.polymer.vaadin.VaadinGridElement;
import elemental2.core.Array;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import jsinterop.base.Js;
import org.jboss.gwt.elemento.core.IsElement;
import org.jboss.gwt.elemento.template.DataElement;
import org.jboss.gwt.elemento.template.Templated;

@Templated(value = "layout.html#rootDiv")
abstract class Layout implements IsElement<HTMLElement> {

    @DataElement
    AppHeaderElement header;

    @DataElement
    HTMLDivElement contentDiv;

    @DataElement
    VaadinGridElement appgrid;

    public static Layout create() {
        return new Templated_Layout();
    }

    public void setContent(LayoutContext.Content isWidget) {
        contentDiv.appendChild(Js.cast(isWidget));

//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("name", new JSONString("ahmad"));
//
//        Test test= JavaScriptObject.createObject().cast();
//
//        test.name="ahmd";
//
//        Array<JavaScriptObject> array = new Array<>();
//        array.push(test);
//
//        grid.setItems(array);
//
//        Window.alert("asdasd");
    }
}
