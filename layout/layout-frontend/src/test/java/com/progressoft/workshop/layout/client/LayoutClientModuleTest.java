package com.progressoft.workshop.layout.client;

import com.google.gwtmockito.GwtMockitoTestRunner;
import com.progressoft.brix.domino.api.client.annotations.ClientModule;
import com.progressoft.brix.domino.test.api.client.ClientContext;
import com.progressoft.brix.domino.test.api.client.DominoTestClient;
import com.progressoft.workshop.layout.client.contributions.FakeLayoutContribution;
import com.progressoft.workshop.layout.client.presenters.LayoutPresenter;
import com.progressoft.workshop.layout.client.presenters.LayoutPresenterSpy;
import com.progressoft.workshop.layout.client.views.FakeLayoutView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.progressoft.workshop.layout.shared.extension.LayoutContext.Content;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

@ClientModule(name = "TestLayout")
@RunWith(GwtMockitoTestRunner.class)
public class LayoutClientModuleTest {

    private LayoutPresenterSpy presenterSpy;
    private FakeLayoutView fakeView;
    private ClientContext clientContext;
    private FakeLayoutContribution fakeContribution;

    @Before
    public void setUp() {
        presenterSpy = new LayoutPresenterSpy();
        DominoTestClient.useModules(new LayoutModuleConfiguration(), new TestLayoutModuleConfiguration())
                .replacePresenter(LayoutPresenter.class, presenterSpy)
                .viewOf(LayoutPresenter.class, view -> fakeView = (FakeLayoutView) view)
                .contributionOf(FakeLayoutContribution.class, contribution -> this.fakeContribution = contribution)
                .onStartCompleted(clientContext -> this.clientContext = clientContext)
                .start();
    }

    @Test
    public void givenLayoutModule_whenContributingToMainExtensionPoint_thenShouldReceiveMainContext() {
        assertNotNull(presenterSpy.getMainContext());
    }

    @Test
    public void givenLayoutModule_whenMainContextReceived_thenTheViewShouldBeShown() throws Exception {
        assertThat(fakeView.isShown()).isTrue();
    }

    @Test
    public void givenLayoutModule_whenViewIsShown_thenLayoutContributionsShouldBeApplied() throws Exception {
        assertThat(fakeContribution.getContext()).isNotNull();
    }

    @Test
    public void givenLayoutContext_whenSettingTheContent_thenTheContentShouldBeSetInTheView() throws Exception {
        Content content = () -> null;
        fakeContribution.getContext().setContent(content);
        assertThat(fakeView.getContent()).isEqualTo(content);
    }
}
