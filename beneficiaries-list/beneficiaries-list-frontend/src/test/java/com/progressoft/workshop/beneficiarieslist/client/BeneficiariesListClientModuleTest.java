package com.progressoft.workshop.beneficiarieslist.client;

import com.google.gwtmockito.GwtMockitoTestRunner;
import com.progressoft.brix.domino.api.client.annotations.ClientModule;
import com.progressoft.brix.domino.api.client.extension.Contributions;
import com.progressoft.brix.domino.test.api.client.ClientContext;
import com.progressoft.brix.domino.test.api.client.DominoTestClient;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenterSpy;
import com.progressoft.workshop.beneficiarieslist.client.requests.BeneficiariesListServerRequest;
import com.progressoft.workshop.beneficiarieslist.client.views.FakeBeneficiariesListView;
import com.progressoft.workshop.beneficiarieslist.shared.response.BeneficiariesListResponse;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;
import com.progressoft.workshop.layout.shared.extension.LayoutExtensionPoint;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

@ClientModule(name = "TestBeneficiariesList")
@RunWith(GwtMockitoTestRunner.class)
public class BeneficiariesListClientModuleTest {

    private BeneficiariesListPresenterSpy presenterSpy;
    private FakeBeneficiariesListView fakeView;
    private ClientContext clientContext;
    private FakeLayoutContext layoutContext;
    private List<BeneficiaryInfo> beneficiaries;


    @Before
    public void setUp() {
        presenterSpy = new BeneficiariesListPresenterSpy();
        layoutContext = new FakeLayoutContext();

        prepareBeneficiariesList();

        DominoTestClient.useModules(new BeneficiariesListModuleConfiguration(), new TestBeneficiariesListModuleConfiguration())
                .replacePresenter(BeneficiariesListPresenter.class, presenterSpy)
                .viewOf(BeneficiariesListPresenter.class, view -> fakeView = (FakeBeneficiariesListView) view)
                .onStartCompleted(this::onDominoStarted)
                .start();
    }

    private void onDominoStarted(ClientContext clientContext) {
        this.clientContext = clientContext;
        fakingBeneficiariesListRequest();
        applyLayoutContributions();
    }

    private void prepareBeneficiariesList() {
        beneficiaries = Arrays.asList(makeBeneficiaryInfo("name", "cif", "JOR"), makeBeneficiaryInfo("other name", "other cif", "USA"));
    }

    private BeneficiaryInfo makeBeneficiaryInfo(String name, String cif, String country) {
        BeneficiaryInfo info = new BeneficiaryInfo();
        info.name = name;
        info.cif = cif;
        info.alpha3Code = country;
        return info;
    }

    private void fakingBeneficiariesListRequest() {
        BeneficiariesListResponse response = new BeneficiariesListResponse();
        response.setBeneficiaries(beneficiaries);
        clientContext.forRequest(new BeneficiariesListServerRequest().getKey()).returnResponse(response);
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

    @Test
    public void givenLayoutContextReceived_whenViewIsShown_thenBeneficieriesResponseShouldBeRecevied() throws Exception {
        assertThat(presenterSpy.beneficiariesList).containsAll(beneficiaries);
    }

    @Test
    public void givenBeneficiariesResponseReceived_thenItemsShouldBeAddedToTheView() throws Exception {
        assertThat(fakeView.beneficiaries).size().isEqualTo(beneficiaries.size());
        assertThat(fakeView.beneficiaries).containsAll(beneficiaries);
    }
}

