package com.progressoft.brix.components.layout.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LayoutBundle_default_InlineClientBundleGenerator implements com.progressoft.brix.components.layout.client.ui.views.LayoutBundle {
  private static LayoutBundle_default_InlineClientBundleGenerator _instance0 = new LayoutBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.progressoft.brix.components.layout.client.ui.views.LayoutBundle.Style() {
      public java.lang.String Layout() {
        return "CD2ODVC-a-a";
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
        return (".CD2ODVC-a-a{background-color:blue}");
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.progressoft.brix.components.layout.client.ui.views.LayoutBundle.Style get() {
      return style;
    }
  }
  public com.progressoft.brix.components.layout.client.ui.views.LayoutBundle.Style style() {
    return styleInitializer.get();
  }
  private void welcomeInitializer() {
    welcome = new com.google.gwt.resources.client.impl.ExternalTextResourcePrototype(
      "welcome",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalTextUrl),
      externalTextCache, 
      0
    );
  }
  private static class welcomeInitializer {
    static {
      _instance0.welcomeInitializer();
    }
    static com.google.gwt.resources.client.ExternalTextResource get() {
      return welcome;
    }
  }
  public com.google.gwt.resources.client.ExternalTextResource welcome() {
    return welcomeInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.progressoft.brix.components.layout.client.ui.views.LayoutBundle.Style style;
  private static final java.lang.String externalTextUrl = GWT.getModuleBaseForStaticFiles() + "A4866AF2AC9474B9C0DE46B3B6AF8005.cache.txt";
  private static final com.google.gwt.resources.client.TextResource[] externalTextCache = new com.google.gwt.resources.client.TextResource[1];
  private static com.google.gwt.resources.client.ExternalTextResource welcome;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
      welcome(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
        resourceMap.put("welcome", welcome());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.progressoft.brix.components.layout.client.ui.views.LayoutBundle::style()();
      case 'welcome': return this.@com.progressoft.brix.components.layout.client.ui.views.LayoutBundle::welcome()();
    }
    return null;
  }-*/;
}
