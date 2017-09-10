package com.progressoft.workshop.layout.client.ui.views;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.IsWidget;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.workshop.layout.client.presenters.LayoutPresenter;
import com.progressoft.workshop.layout.client.views.LayoutView;
import elemental2.dom.DomGlobal;
import jsinterop.base.Js;
import org.jboss.gwt.elemento.core.Elements;

@UiView(presentable = LayoutPresenter.class)
public class DefaultLayoutView implements LayoutView {


    Layout layout;

    public DefaultLayoutView() {
        layout = Layout.create();
        DomGlobal.document.body.appendChild(Js.cast(layout.asElement()));
    }

    @Override
    public IsWidget get() {
        return Elements.asWidget(layout);
    }
}