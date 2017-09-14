package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface BeneficiariesListBundle extends ClientBundle{

    interface Style extends CssResource {
        String BeneficiariesList();
    }

    @Source("css/BeneficiariesList.gss")
    Style style();
}