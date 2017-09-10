package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ExternalTextResource;
import com.google.gwt.resources.client.ImageResource;

public interface BeneficiariesListBundle extends ClientBundle{

    interface Style extends CssResource {
        String BeneficiariesList();
    }

    @Source("css/BeneficiariesList.gss")
    Style style();

    @Source("text/welcome.txt")
    ExternalTextResource welcome();

}