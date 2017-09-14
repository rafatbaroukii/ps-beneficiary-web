package com.progressoft.brix.components.layout.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenBundle {
  private static DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (".CD2ODVC-c-a{margin-bottom:16px;border-radius:0!important;border-top-left-radius:5px!important;border-bottom-left-radius:5px!important;width:auto!important}.CD2ODVC-c-b{padding-right:0!important}") : (".CD2ODVC-c-a{margin-bottom:16px;border-radius:0!important;border-top-right-radius:5px!important;border-bottom-right-radius:5px!important;width:auto!important}.CD2ODVC-c-b{padding-left:0!important}");
      }
      public java.lang.String logo() {
        return "CD2ODVC-c-a";
      }
      public java.lang.String profile() {
        return "CD2ODVC-c-b";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
