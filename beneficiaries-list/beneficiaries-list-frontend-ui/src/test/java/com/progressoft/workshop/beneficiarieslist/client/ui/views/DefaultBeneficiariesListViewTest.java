package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwtmockito.GwtMockitoTestRunner;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListView;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;
import elemental2.dom.*;
import jsinterop.base.Js;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(GwtMockitoTestRunner.class)
public class DefaultBeneficiariesListViewTest{

    @Test
    public void nothing() throws Exception {
        HTMLDocument htmlDocument=new HTMLDocument();
        htmlDocument.body.appendChild(new Node());
        htmlDocument.domain="some domian";
        assertThat(htmlDocument.domain).isEqualTo("some domian");
//        DefaultBeneficiariesListView view = new DefaultBeneficiariesListView();
    }
}