package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BeneficiariesListBundle_default_InlineClientBundleGenerator implements com.progressoft.workshop.beneficiarieslist.client.ui.views.BeneficiariesListBundle {
  private static BeneficiariesListBundle_default_InlineClientBundleGenerator _instance0 = new BeneficiariesListBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.progressoft.workshop.beneficiarieslist.client.ui.views.BeneficiariesListBundle.Style() {
      public java.lang.String BeneficiariesList() {
        return "CD2ODVC-b-a";
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
        return (".CD2ODVC-b-a{background-color:blue}");
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.progressoft.workshop.beneficiarieslist.client.ui.views.BeneficiariesListBundle.Style get() {
      return style;
    }
  }
  public com.progressoft.workshop.beneficiarieslist.client.ui.views.BeneficiariesListBundle.Style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.progressoft.workshop.beneficiarieslist.client.ui.views.BeneficiariesListBundle.Style style;
  
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
      case 'style': return this.@com.progressoft.workshop.beneficiarieslist.client.ui.views.BeneficiariesListBundle::style()();
    }
    return null;
  }-*/;
}
