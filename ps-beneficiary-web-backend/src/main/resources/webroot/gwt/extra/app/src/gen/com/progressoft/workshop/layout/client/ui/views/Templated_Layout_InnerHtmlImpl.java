package com.progressoft.workshop.layout.client.ui.views;

public class Templated_Layout_InnerHtmlImpl implements com.progressoft.workshop.layout.client.ui.views.Templated_Layout.InnerHtml {
  
  public com.google.gwt.safehtml.shared.SafeHtml value() {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<app-header reveals data-element=\"header\">  <app-toolbar>   <paper-icon-button icon=\"menu\" onclick=\"drawer.toggle()\"></paper-icon-button>   <div main-title>   My app  </div>   <paper-icon-button icon=\"delete\"></paper-icon-button>   <paper-icon-button icon=\"search\"></paper-icon-button>   <paper-icon-button icon=\"close\"></paper-icon-button>  </app-toolbar> </app-header> <app-drawer id=\"drawer\" swipe-open data-element=\"drawer\"></app-drawer>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
