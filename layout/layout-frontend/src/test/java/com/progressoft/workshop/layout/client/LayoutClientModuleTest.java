package com.progressoft.workshop.layout.client;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import com.google.gwtmockito.GwtMockitoTestRunner;

import com.progressoft.brix.domino.api.client.annotations.ClientModule;
import com.progressoft.brix.domino.test.api.client.DominoTestClient;
import com.progressoft.brix.domino.test.api.client.ClientContext;
import com.progressoft.brix.domino.api.shared.request.FailedServerResponse;
import com.progressoft.workshop.layout.client.presenters.LayoutPresenter;
import com.progressoft.workshop.layout.client.requests.LayoutServerRequest;
import com.progressoft.workshop.layout.shared.request.LayoutRequest;
import com.progressoft.workshop.layout.shared.response.LayoutResponse;
import com.progressoft.workshop.layout.client.presenters.LayoutPresenterSpy;
import com.progressoft.workshop.layout.client.views.FakeLayoutView;

@ClientModule(name="TestLayout")
@RunWith(GwtMockitoTestRunner.class)
public class LayoutClientModuleTest{

    private LayoutPresenterSpy presenterSpy;
    private FakeLayoutView fakeView;
    private ClientContext clientContext;

    @Before
    public void setUp() {
//        presenterSpy = new LayoutPresenterSpy();
//        DominoTestClient.useModules(new LayoutModuleConfiguration(), new TestLayoutModuleConfiguration())
//            .replacePresenter(LayoutPresenter.class, presenterSpy)
//            .viewOf(LayoutPresenter.class, view -> fakeView= (FakeLayoutView) view)
//            .onStartCompleted(clientContext -> this.clientContext = clientContext)
//            .start();
    }

    @Test
    public void nothing() throws Exception {

    }

    //    @Test
//    public void givenLayoutModule_whenContributingToMainExtensionPoint_thenShouldReceiveMainContext() {
//        assertNotNull(presenterSpy.getMainContext());
//    }
//
//    @Test
//    public void givenLayoutClientModule_whenLayoutServerRequestIsSent_thenServerMessageShouldBeRecieved() {
//        clientContext.forRequest(new LayoutServerRequest().getKey()).returnResponse(new LayoutResponse("Server message"));
//        new LayoutServerRequest(){
//            @Override
//            protected void process(LayoutPresenter presenter, LayoutRequest serverArgs, LayoutResponse response) {
//                super.process(presenter, serverArgs, response);
//                assertEquals("Server message",response.getServerMessage());
//            }
//
//            @Override
//            public void processFailed(LayoutPresenter presenter, LayoutRequest serverArgs,
//                FailedServerResponse failedResponse) {
//                fail(failedResponse.getError().getMessage());
//            }
//
//            @Override
//            public String getKey() {
//                return LayoutServerRequest.class.getCanonicalName();
//            }
//        }.send();
//    }
}
