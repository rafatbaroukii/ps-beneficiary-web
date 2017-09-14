package com.progressoft.workshop.beneficiarieslist.client;

import com.google.gwtmockito.GwtMockitoTestRunner;
import com.progressoft.brix.components.layout.shared.extension.LayoutExtensionPoint;
import com.progressoft.brix.domino.api.client.annotations.ClientModule;
import com.progressoft.brix.domino.api.client.extension.Contributions;
import com.progressoft.brix.domino.test.api.client.ClientContext;
import com.progressoft.brix.domino.test.api.client.DominoTestClient;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenterSpy;
import com.progressoft.workshop.beneficiarieslist.client.views.FakeBeneficiariesListView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;


@ClientModule(name = "TestBeneficiariesList")
@RunWith(GwtMockitoTestRunner.class)
public class BeneficiariesListClientModuleTest {

    private BeneficiariesListPresenterSpy presenterSpy;
    private FakeBeneficiariesListView fakeView;
    private ClientContext clientContext;
    private FakeLayoutContext layoutContext;

    @Before
    public void setUp() {
        presenterSpy = new BeneficiariesListPresenterSpy();
        layoutContext = new FakeLayoutContext();
        DominoTestClient.useModules(new BeneficiariesListModuleConfiguration(), new TestBeneficiariesListModuleConfiguration())
                .replacePresenter(BeneficiariesListPresenter.class, presenterSpy)
                .viewOf(BeneficiariesListPresenter.class, view -> fakeView = (FakeBeneficiariesListView) view)
                .onStartCompleted(this::onStartCompleted)
                .start();
    }

    private void onStartCompleted(ClientContext clientContext) {
        this.clientContext = clientContext;
        applyLayoutContribution();
    }

    private void applyLayoutContribution() {
        Contributions.apply(LayoutExtensionPoint.class, () -> layoutContext);
    }

    @Test
    public void givenModule_whenContributingToLayoutExtensionPoint_LayoutContextShouldBeReceived() throws Exception {
        assertThat(presenterSpy.getLayoutContext()).isNotNull();
    }

    @Test
    public void givenModule_whenLayoutContextReceived_thenViewShouldBeSetAsContent() throws Exception {
        assertThat(layoutContext.getContent()).isEqualTo(fakeView);
    }
}
