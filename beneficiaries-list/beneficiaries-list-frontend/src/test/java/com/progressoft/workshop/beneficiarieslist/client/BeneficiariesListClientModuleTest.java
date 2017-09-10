package com.progressoft.workshop.beneficiarieslist.client;

import com.google.gwtmockito.GwtMockitoTestRunner;
import com.progressoft.brix.domino.api.client.annotations.ClientModule;
import com.progressoft.brix.domino.api.client.extension.Contributions;
import com.progressoft.brix.domino.test.api.client.ClientContext;
import com.progressoft.brix.domino.test.api.client.DominoTestClient;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenterSpy;
import com.progressoft.workshop.beneficiarieslist.client.views.FakeBeneficiariesListView;
import com.progressoft.workshop.layout.shared.extension.LayoutExtensionPoint;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

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
                .onStartCompleted(clientContext -> {
                    this.clientContext = clientContext;
                    applyLayoutContributions();
                })
                .start();
    }

    private void applyLayoutContributions() {
        Contributions.apply(LayoutExtensionPoint.class, () -> layoutContext);
    }

    @Test
    public void givenBeneficiariesListModule_whenContributingToLayoutExtensionPoint_thenShouldReceiveLayoutContext() {
        assertNotNull(presenterSpy.getLayoutContext());
    }

    @Test
    public void givenModule_whenLayoutContextRecieved_thenShouldSetTheViewAsLayoutContent() throws Exception {
        assertThat(layoutContext.content).isEqualTo(fakeView);
    }
}
