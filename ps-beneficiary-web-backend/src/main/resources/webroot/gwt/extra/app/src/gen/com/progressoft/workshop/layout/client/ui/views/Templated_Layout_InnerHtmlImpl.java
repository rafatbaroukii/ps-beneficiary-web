package com.progressoft.workshop.layout.client.ui.views;

public class Templated_Layout_InnerHtmlImpl implements com.progressoft.workshop.layout.client.ui.views.Templated_Layout.InnerHtml {
  
  public com.google.gwt.safehtml.shared.SafeHtml value() {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<style is=\"custom-style\">    html, body {      margin: 0;      font-family: 'Roboto', 'Noto', sans-serif;      -webkit-font-smoothing: antialiased;      background: #f1f1f1;      max-height: 368px;    }    app-toolbar {      background-color: #4285f4;      color: #fff;    }    paper-icon-button {      --paper-icon-button-ink-color: white;    }    paper-icon-button + [main-title] {      margin-left: 24px;    }    paper-progress {      display: block;      width: 100%;      --paper-progress-active-color: rgba(255, 255, 255, 0.5);      --paper-progress-container-color: transparent;    }    app-header {      @apply --layout-fixed-top;      color: #fff;      --app-header-background-rear-layer: {        background-color: #ef6c00;      };    }    app-drawer {      --app-drawer-scrim-background: rgba(0, 0, 100, 0.8);      --app-drawer-content-container: {        background-color: #B0BEC5;      }    }    .contentContainer{        margin-top: 64px !important;    }    </style> <app-header reveals data-element=\"header\">  <app-toolbar>   <div main-title>   Beneficiary  </div>  </app-toolbar> </app-header> <div class=\"contentContainer\" data-element=\"contentContainer\"> </div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
