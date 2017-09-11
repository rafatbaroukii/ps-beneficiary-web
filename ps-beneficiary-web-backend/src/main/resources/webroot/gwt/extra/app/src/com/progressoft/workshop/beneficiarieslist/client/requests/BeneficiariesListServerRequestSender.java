package com.progressoft.workshop.beneficiarieslist.client.requests;

import com.google.gwt.core.client.GWT;
import com.progressoft.brix.domino.api.client.request.RequestRestSender;
import com.progressoft.brix.domino.api.client.request.ServerRequestCallBack;
import com.progressoft.workshop.beneficiarieslist.client.requests.BeneficiariesListServerRequest;
import com.progressoft.workshop.beneficiarieslist.shared.request.BeneficiariesListRequest;
import com.progressoft.workshop.beneficiarieslist.shared.response.BeneficiariesListResponse;
import com.progressoft.brix.domino.api.client.annotations.RequestSender;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import static java.util.Objects.*;
import org.fusesource.restygwt.client.*;
import com.progressoft.brix.domino.api.client.ServiceRootMatcher;

@RequestSender(value = BeneficiariesListServerRequest.class)
public class BeneficiariesListServerRequestSender implements RequestRestSender<BeneficiariesListRequest>{

	public static final String PATH="/api/beneficiaries";
	public interface BeneficiariesListServerRequestService extends RestService {
        @GET
        @Path(PATH)
        @Produces(MediaType.APPLICATION_JSON)
        void send(BeneficiariesListRequest request, MethodCallback<BeneficiariesListResponse> callback);
    }

	private BeneficiariesListServerRequestService service = GWT.create(BeneficiariesListServerRequestService.class);

	@Override
	public void send(BeneficiariesListRequest request, ServerRequestCallBack callBack){

			((RestServiceProxy)service).setResource(new Resource(ServiceRootMatcher.matchedServiceRoot(PATH)));

			service.send(request, new MethodCallback<BeneficiariesListResponse>() {
		@Override
		public void onFailure(Method method, Throwable throwable) {
			callBack.onFailure(throwable);
		}

		@Override
		public void onSuccess(Method method, BeneficiariesListResponse response) {

			callBack.onSuccess(response);
		}
	});
	}
}