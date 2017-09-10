package com.progressoft.workshop.layout.client.ui.views;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.IsWidget;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.workshop.layout.client.presenters.LayoutPresenter;
import com.progressoft.workshop.layout.client.views.LayoutView;
import com.progressoft.workshop.layout.shared.extension.LayoutContext;
import com.vaadin.polymer.vaadin.Selection;
import elemental2.core.Array;
import elemental2.dom.DomGlobal;
import org.jboss.gwt.elemento.core.Elements;

import java.util.logging.Logger;

@UiView(presentable = LayoutPresenter.class)
public class DefaultLayoutView implements LayoutView {

    private static final Logger LOGGER = Logger.getLogger(DefaultLayoutView.class.getName());

    private Layout layout = Layout.create();

    @Override
    public void setContent(LayoutContext.Content content) {
        layout.setContent(content);
    }

    @Override
    public void show() {
        DomGlobal.document.body.appendChild(layout.asElement());
        Array<Test> items = new Array<>();
        Test test = new Test();
        test.name = "ahmad";
        test.surname = "ahmad";
        test.role = "ahmad";
        items.push(test);

        Test test1 = new Test();
        test1.name = "rafat";
        test1.surname = "rafat";
        test1.role = "rafat";
        items.push(test1);

        Test test3 = new Test();
        test3.name = "rafat";
        test3.surname = "rafat";
        test3.role = "rafat";
        items.push(test3);
        layout.appgrid.setItems(items);
    }

    @Override
    public IsWidget get() {
        return Elements.asWidget(layout);
    }
}