package com.progressoft.workshop.layout.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.IsWidget;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.workshop.layout.client.presenters.LayoutPresenter;
import com.progressoft.workshop.layout.client.views.LayoutView;
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import jsinterop.base.Js;
import org.jboss.gwt.elemento.core.Elements;

import static com.progressoft.workshop.layout.shared.extension.LayoutContext.Content;

@UiView(presentable = LayoutPresenter.class)
public class DefaultLayoutView implements LayoutView {

    private Layout layout = Layout.create();

    @Override
    public void setContent(Content content) {
        layout.contentContainer.appendChild(Js.cast(content.get()));
    }

    @Override
    public void show() {
        DomGlobal.document.body.appendChild(layout.asElement());
    }
}