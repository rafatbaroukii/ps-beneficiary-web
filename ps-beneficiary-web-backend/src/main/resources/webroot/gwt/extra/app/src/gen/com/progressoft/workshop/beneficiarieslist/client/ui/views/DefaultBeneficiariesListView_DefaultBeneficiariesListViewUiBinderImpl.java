// .ui.xml template last modified: 1505381911000
package com.progressoft.workshop.beneficiarieslist.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import gwt.material.design.client.ui.MaterialPanel;

public class DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl implements UiBinder<gwt.material.design.client.ui.MaterialPanel, com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView>, com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView.DefaultBeneficiariesListViewUiBinder {


  public gwt.material.design.client.ui.MaterialPanel createAndBindUi(final com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView owner) {


    return new Widgets(owner).get_f_MaterialPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView owner;


    public Widgets(final com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenBundle) GWT.create(com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for bundle called 0 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.progressoft.workshop.beneficiarieslist.client.ui.views.BeneficiariesListBundle get_bundle() {
      return build_bundle();
    }
    private com.progressoft.workshop.beneficiarieslist.client.ui.views.BeneficiariesListBundle build_bundle() {
      // Creation section.
      final com.progressoft.workshop.beneficiarieslist.client.ui.views.BeneficiariesListBundle bundle = (com.progressoft.workshop.beneficiarieslist.client.ui.views.BeneficiariesListBundle) GWT.create(com.progressoft.workshop.beneficiarieslist.client.ui.views.BeneficiariesListBundle.class);
      // Setup section.

      return bundle;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenCss_style style;
    private com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.progressoft.workshop.beneficiarieslist.client.ui.views.DefaultBeneficiariesListView_DefaultBeneficiariesListViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_MaterialPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private gwt.material.design.client.ui.MaterialPanel get_f_MaterialPanel1() {
      return build_f_MaterialPanel1();
    }
    private gwt.material.design.client.ui.MaterialPanel build_f_MaterialPanel1() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialPanel f_MaterialPanel1 = (gwt.material.design.client.ui.MaterialPanel) GWT.create(gwt.material.design.client.ui.MaterialPanel.class);
      // Setup section.
      f_MaterialPanel1.add(get_f_MaterialRow2());
      f_MaterialPanel1.add(get_actionPanel());
      f_MaterialPanel1.add(get_f_MaterialContainer4());

      return f_MaterialPanel1;
    }

    /**
     * Getter for f_MaterialRow2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialRow get_f_MaterialRow2() {
      return build_f_MaterialRow2();
    }
    private gwt.material.design.client.ui.MaterialRow build_f_MaterialRow2() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialRow f_MaterialRow2 = (gwt.material.design.client.ui.MaterialRow) GWT.create(gwt.material.design.client.ui.MaterialRow.class);
      // Setup section.
      f_MaterialRow2.add(get_f_MaterialTitle3());
      f_MaterialRow2.setMarginTop(0);

      return f_MaterialRow2;
    }

    /**
     * Getter for f_MaterialTitle3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialTitle get_f_MaterialTitle3() {
      return build_f_MaterialTitle3();
    }
    private gwt.material.design.client.ui.MaterialTitle build_f_MaterialTitle3() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialTitle f_MaterialTitle3 = (gwt.material.design.client.ui.MaterialTitle) GWT.create(gwt.material.design.client.ui.MaterialTitle.class);
      // Setup section.
      f_MaterialTitle3.addStyleName("" + get_style().title() + "");
      f_MaterialTitle3.setTitle("Beneficiaries");

      return f_MaterialTitle3;
    }

    /**
     * Getter for actionPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialRow get_actionPanel() {
      return build_actionPanel();
    }
    private gwt.material.design.client.ui.MaterialRow build_actionPanel() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialRow actionPanel = (gwt.material.design.client.ui.MaterialRow) GWT.create(gwt.material.design.client.ui.MaterialRow.class);
      // Setup section.

      return actionPanel;
    }

    /**
     * Getter for f_MaterialContainer4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialContainer get_f_MaterialContainer4() {
      return build_f_MaterialContainer4();
    }
    private gwt.material.design.client.ui.MaterialContainer build_f_MaterialContainer4() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialContainer f_MaterialContainer4 = (gwt.material.design.client.ui.MaterialContainer) GWT.create(gwt.material.design.client.ui.MaterialContainer.class);
      // Setup section.
      f_MaterialContainer4.add(get_f_subheader$MaterialSubHeaderContainer5());
      f_MaterialContainer4.setMargin(5);

      return f_MaterialContainer4;
    }

    /**
     * Getter for f_subheader$MaterialSubHeaderContainer5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.addins.client.subheader.MaterialSubHeaderContainer get_f_subheader$MaterialSubHeaderContainer5() {
      return build_f_subheader$MaterialSubHeaderContainer5();
    }
    private gwt.material.design.addins.client.subheader.MaterialSubHeaderContainer build_f_subheader$MaterialSubHeaderContainer5() {
      // Creation section.
      final gwt.material.design.addins.client.subheader.MaterialSubHeaderContainer f_subheader$MaterialSubHeaderContainer5 = (gwt.material.design.addins.client.subheader.MaterialSubHeaderContainer) GWT.create(gwt.material.design.addins.client.subheader.MaterialSubHeaderContainer.class);
      // Setup section.
      f_subheader$MaterialSubHeaderContainer5.add(get_f_subheader$MaterialSubHeader6());
      f_subheader$MaterialSubHeaderContainer5.add(get_beneficiaries());
      f_subheader$MaterialSubHeaderContainer5.addStyleName("" + get_style().listItems() + "");
      f_subheader$MaterialSubHeaderContainer5.setShadow(0);
      f_subheader$MaterialSubHeaderContainer5.setGrid("l12 m6 s12");
      f_subheader$MaterialSubHeaderContainer5.setType(gwt.material.design.addins.client.subheader.constants.SubHeaderType.PINNED);
      f_subheader$MaterialSubHeaderContainer5.setHeight("500px");

      return f_subheader$MaterialSubHeaderContainer5;
    }

    /**
     * Getter for f_subheader$MaterialSubHeader6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.addins.client.subheader.MaterialSubHeader get_f_subheader$MaterialSubHeader6() {
      return build_f_subheader$MaterialSubHeader6();
    }
    private gwt.material.design.addins.client.subheader.MaterialSubHeader build_f_subheader$MaterialSubHeader6() {
      // Creation section.
      final gwt.material.design.addins.client.subheader.MaterialSubHeader f_subheader$MaterialSubHeader6 = (gwt.material.design.addins.client.subheader.MaterialSubHeader) GWT.create(gwt.material.design.addins.client.subheader.MaterialSubHeader.class);
      // Setup section.
      f_subheader$MaterialSubHeader6.setBackgroundColor(gwt.material.design.client.constants.Color.LIGHT_BLUE_DARKEN_3);
      f_subheader$MaterialSubHeader6.setText("Beneficiaris list");
      f_subheader$MaterialSubHeader6.setTextColor(gwt.material.design.client.constants.Color.WHITE);

      return f_subheader$MaterialSubHeader6;
    }

    /**
     * Getter for beneficiaries called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialContainer get_beneficiaries() {
      return build_beneficiaries();
    }
    private gwt.material.design.client.ui.MaterialContainer build_beneficiaries() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialContainer beneficiaries = (gwt.material.design.client.ui.MaterialContainer) GWT.create(gwt.material.design.client.ui.MaterialContainer.class);
      // Setup section.
      beneficiaries.addStyleName("" + get_style().container() + "");

      return beneficiaries;
    }
  }
}
