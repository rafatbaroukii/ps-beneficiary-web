package com.progressoft.workshop.layout.client.requests;

import com.google.gwt.core.client.GWT;
import com.progressoft.brix.domino.api.client.request.RequestRestSender;
import com.progressoft.brix.domino.api.client.request.ServerRequestCallBack;
import com.progressoft.workshop.layout.client.requests.LayoutServerRequest;
import com.progressoft.workshop.layout.shared.request.LayoutRequest;
import com.progressoft.workshop.layout.shared.response.LayoutResponse;
import com.progressoft.brix.domino.api.client.annotations.RequestSender;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import static java.util.Objects.*;
import org.fusesource.restygwt.client.*;
import com.progressoft.brix.domino.api.client.ServiceRootMatcher;

@RequestSender(value = LayoutServerRequest.class)
public class LayoutServerRequestSender implements RequestRestSender<LayoutRequest>{

	public static final String PATH="LayoutRequest";
	public interface LayoutServerRequestService extends RestService {
        @POST
        @Path(PATH)
        @Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
        void send(LayoutRequest request, MethodCallback<LayoutResponse> callback);
    }

	private LayoutServerRequestService service = GWT.create(LayoutServerRequestService.class);

	@Override
	public void send(LayoutRequest request, ServerRequestCallBack callBack){

			((RestServiceProxy)service).setResource(new Resource(ServiceRootMatcher.matchedServiceRoot(PATH)));

			service.send(request, new MethodCallback<LayoutResponse>() {
		@Override
		public void onFailure(Method method, Throwable throwable) {
			callBack.onFailure(throwable);
		}

		@Override
		public void onSuccess(Method method, LayoutResponse response) {

			callBack.onSuccess(response);
		}
	});
	}
}