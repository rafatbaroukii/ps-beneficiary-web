package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenBundle {
  private static DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenCss_style() {
      public java.lang.String container() {
        return "CD2ODVC-d-a";
      }
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return (".CD2ODVC-d-c h4{margin-top:30px!important}.CD2ODVC-d-b{border:1px solid #cecece!important;padding-top:50px!important}.CD2ODVC-d-a{margin-top:14px!important}");
      }
      public java.lang.String listItems() {
        return "CD2ODVC-d-b";
      }
      public java.lang.String title() {
        return "CD2ODVC-d-c";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
