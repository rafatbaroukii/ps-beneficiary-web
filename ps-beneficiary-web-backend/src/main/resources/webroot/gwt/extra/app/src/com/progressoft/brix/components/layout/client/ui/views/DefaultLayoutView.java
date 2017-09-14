package com.progressoft.brix.components.layout.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.progressoft.brix.components.layout.client.presenters.LayoutPresenter;
import com.progressoft.brix.components.layout.client.views.LayoutView;
import com.progressoft.brix.components.layout.shared.extension.LayoutContext;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import gwt.material.design.addins.client.sideprofile.MaterialSideProfile;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialNavBrand;
import gwt.material.design.client.ui.MaterialSideNavPush;
import jsinterop.base.Js;

@UiView(presentable = LayoutPresenter.class)
public class DefaultLayoutView extends Composite implements LayoutView {

    interface DefaultLayoutViewUiBinder extends UiBinder<HTMLPanel, DefaultLayoutView> {
    }

    private static DefaultLayoutViewUiBinder ourUiBinder = GWT.create(DefaultLayoutViewUiBinder.class);

    @UiField
    MaterialSideNavPush menuPanel;

    @UiField
    MaterialContainer contentPanel;

    @UiField
    MaterialNavBrand navBrand;

    @UiField
    MaterialSideProfile menuProfile;

    public DefaultLayoutView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @Override
    public void show() {
        RootPanel.get().add(this);
    }

    @Override
    public void addMenuItem(LayoutContext.MenuItem menuItem) {
        menuPanel.add(Js.cast(menuItem));
    }

    @Override
    public void setContent(LayoutContext.Content content) {
        contentPanel.clear();
        contentPanel.add(Js.cast(content));
    }

    @Override
    public void setHeader(String headerText) {
        navBrand.setText(new SafeHtmlBuilder().appendEscaped(headerText).toSafeHtml().asString());
    }

    @Override
    public void setMenuImage(LayoutContext.Image image) {
        menuProfile.setResource(image.getAsResource());
    }
}