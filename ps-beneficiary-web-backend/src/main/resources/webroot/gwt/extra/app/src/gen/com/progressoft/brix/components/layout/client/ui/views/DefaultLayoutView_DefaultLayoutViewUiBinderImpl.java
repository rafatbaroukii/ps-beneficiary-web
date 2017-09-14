// .ui.xml template last modified: 1505381869000
package com.progressoft.brix.components.layout.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class DefaultLayoutView_DefaultLayoutViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView>, com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView.DefaultLayoutViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span>")
    SafeHtml html1(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView owner;


    public Widgets(final com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenBundle) GWT.create(com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for bundle called 0 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.progressoft.brix.components.layout.client.ui.views.LayoutBundle get_bundle() {
      return build_bundle();
    }
    private com.progressoft.brix.components.layout.client.ui.views.LayoutBundle build_bundle() {
      // Creation section.
      final com.progressoft.brix.components.layout.client.ui.views.LayoutBundle bundle = (com.progressoft.brix.components.layout.client.ui.views.LayoutBundle) GWT.create(com.progressoft.brix.components.layout.client.ui.views.LayoutBundle.class);
      // Setup section.

      return bundle;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenCss_style style;
    private com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.progressoft.brix.components.layout.client.ui.views.DefaultLayoutView_DefaultLayoutViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();
        get_domId1Element().get();
        get_domId2Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_f_MaterialHeader2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_menuPanel(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_contentPanel(), get_domId2Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for f_MaterialHeader2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialHeader get_f_MaterialHeader2() {
      return build_f_MaterialHeader2();
    }
    private gwt.material.design.client.ui.MaterialHeader build_f_MaterialHeader2() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialHeader f_MaterialHeader2 = (gwt.material.design.client.ui.MaterialHeader) GWT.create(gwt.material.design.client.ui.MaterialHeader.class);
      // Setup section.
      f_MaterialHeader2.add(get_navBar());
      f_MaterialHeader2.setTop(0);

      return f_MaterialHeader2;
    }

    /**
     * Getter for navBar called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialNavBar get_navBar() {
      return build_navBar();
    }
    private gwt.material.design.client.ui.MaterialNavBar build_navBar() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavBar navBar = (gwt.material.design.client.ui.MaterialNavBar) GWT.create(gwt.material.design.client.ui.MaterialNavBar.class);
      // Setup section.
      navBar.add(get_navBrand());
      navBar.setBackgroundColor(gwt.material.design.client.constants.Color.LIGHT_BLUE_DARKEN_4);
      navBar.setShadow(1);
      navBar.setPaddingLeft(20);
      navBar.setActivates("sideNav");

      return navBar;
    }

    /**
     * Getter for navBrand called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialNavBrand get_navBrand() {
      return build_navBrand();
    }
    private gwt.material.design.client.ui.MaterialNavBrand build_navBrand() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavBrand navBrand = (gwt.material.design.client.ui.MaterialNavBrand) GWT.create(gwt.material.design.client.ui.MaterialNavBrand.class);
      // Setup section.

      this.owner.navBrand = navBrand;

      return navBrand;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.

      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for menuPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialSideNavPush get_menuPanel() {
      return build_menuPanel();
    }
    private gwt.material.design.client.ui.MaterialSideNavPush build_menuPanel() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialSideNavPush menuPanel = (gwt.material.design.client.ui.MaterialSideNavPush) GWT.create(gwt.material.design.client.ui.MaterialSideNavPush.class);
      // Setup section.
      menuPanel.add(get_menuProfile());
      menuPanel.setShadow(1);
      menuPanel.setId("sideNav");
      menuPanel.setWithHeader(false);

      this.owner.menuPanel = menuPanel;

      return menuPanel;
    }

    /**
     * Getter for menuProfile called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.addins.client.sideprofile.MaterialSideProfile get_menuProfile() {
      return build_menuProfile();
    }
    private gwt.material.design.addins.client.sideprofile.MaterialSideProfile build_menuProfile() {
      // Creation section.
      final gwt.material.design.addins.client.sideprofile.MaterialSideProfile menuProfile = (gwt.material.design.addins.client.sideprofile.MaterialSideProfile) GWT.create(gwt.material.design.addins.client.sideprofile.MaterialSideProfile.class);
      // Setup section.
      menuProfile.add(get_f_MaterialImage3());
      menuProfile.add(get_f_MaterialLabel4());
      menuProfile.add(get_f_MaterialLink5());
      menuProfile.addStyleName("" + get_style().profile() + "");

      this.owner.menuProfile = menuProfile;

      return menuProfile;
    }

    /**
     * Getter for f_MaterialImage3 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialImage get_f_MaterialImage3() {
      return build_f_MaterialImage3();
    }
    private gwt.material.design.client.ui.MaterialImage build_f_MaterialImage3() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialImage f_MaterialImage3 = (gwt.material.design.client.ui.MaterialImage) GWT.create(gwt.material.design.client.ui.MaterialImage.class);
      // Setup section.
      f_MaterialImage3.addStyleName("" + get_style().logo() + "");
      f_MaterialImage3.setShadow(3);

      return f_MaterialImage3;
    }

    /**
     * Getter for f_MaterialLabel4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel4() {
      return build_f_MaterialLabel4();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel4() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel4 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel4.setTextColor(gwt.material.design.client.constants.Color.WHITE);

      return f_MaterialLabel4;
    }

    /**
     * Getter for f_MaterialLink5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink5() {
      return build_f_MaterialLink5();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink5() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink5 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink5.setTextColor(gwt.material.design.client.constants.Color.WHITE);

      return f_MaterialLink5;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId2;
    }

    /**
     * Getter for contentPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialContainer get_contentPanel() {
      return build_contentPanel();
    }
    private gwt.material.design.client.ui.MaterialContainer build_contentPanel() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialContainer contentPanel = (gwt.material.design.client.ui.MaterialContainer) GWT.create(gwt.material.design.client.ui.MaterialContainer.class);
      // Setup section.
      contentPanel.setFontSize("0.8em");
      contentPanel.setPaddingTop(65);

      this.owner.contentPanel = contentPanel;

      return contentPanel;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.

      return domId2Element;
    }
  }
}
