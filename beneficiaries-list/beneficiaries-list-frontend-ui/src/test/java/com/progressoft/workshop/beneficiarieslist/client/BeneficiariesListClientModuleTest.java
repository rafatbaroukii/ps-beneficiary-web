package com.progressoft.workshop.beneficiarieslist.client;

import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwtmockito.GwtMockitoTestRunner;
import com.google.gwtmockito.WithClassesToStub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;

import static org.junit.Assert.*;

import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenterSpy;
import com.progressoft.workshop.beneficiarieslist.client.views.BeneficiariesListViewSpy;

import com.progressoft.brix.domino.test.api.client.DominoTestClient;

@RunWith(GwtMockitoTestRunner.class)
@WithClassesToStub(RootPanel.class)
public class BeneficiariesListClientModuleTest{

    private BeneficiariesListPresenterSpy presenterSpy;
    private BeneficiariesListViewSpy viewSpy;

    @Before
    public void setUp() {
        presenterSpy = new BeneficiariesListPresenterSpy();
        viewSpy = new BeneficiariesListViewSpy();
        DominoTestClient.useModules(new BeneficiariesListModuleConfiguration(), new BeneficiariesListUIModuleConfiguration())
                .replacePresenter(BeneficiariesListPresenter.class, presenterSpy)
                .replaceView(BeneficiariesListPresenter.class, viewSpy)
                .start();
    }

    @Test
    public void nothing() throws Exception {

    }
}
