package com.progressoft.workshop.layout.client.ui.views;

public class Templated_Layout_InnerHtmlImpl implements com.progressoft.workshop.layout.client.ui.views.Templated_Layout.InnerHtml {
  
  public com.google.gwt.safehtml.shared.SafeHtml value() {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<style is=\"custom-style\">    html, body {        height: 100vh;      }      body {        margin: 0;        font-family: 'Roboto', 'Noto', sans-serif;        background-color: #666;      }      app-header-layout {        position: absolute;        top: 0px;        right: 0px;        bottom: 0px;        left: 0px;        background-color: #eee;        overflow: hidden;        box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);      }      app-header-layout #contentContainer{        margin-top :64px !important;      }      app-header {        background-color: #4285f4;        color: #fff;      }      paper-icon-button {        --paper-icon-button-ink-color: white;      }      .contentContainer{        padding-top : 5px;      }      #contentContainer{        margin-top :64px !important;      }    </style> <app-header-layout has-scrolling-region>  <app-header data-element=\"header\" slot=\"header\" effects=\"waterfall\" fixed style=\"height: 64px\">   <app-toolbar>    <div main-title>    Drive title qqqqqqqqq   </div>   </app-toolbar>  </app-header>  <div data-element=\"contentContainer\" class=\"fit contentContainer\"></div> </app-header-layout>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
