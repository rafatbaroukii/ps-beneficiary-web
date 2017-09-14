package com.progressoft.workshop.beneficiarieslist.client.requests;

import com.progressoft.brix.domino.api.client.annotations.Path;
import com.progressoft.brix.domino.api.client.annotations.Request;
import com.progressoft.brix.domino.api.client.request.ClientServerRequest;
import com.progressoft.brix.domino.api.shared.request.FailedServerResponse;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.shared.request.BeneficiaryListRequest;
import com.progressoft.workshop.beneficiarieslist.shared.response.BeneficiaryListResponse;
import org.fusesource.restygwt.client.FailedResponseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.HttpMethod;

@Request
@Path(value = "/api/beneficiaries", method = HttpMethod.GET)
public class BeneficiaryListServerRequest extends ClientServerRequest<BeneficiariesListPresenter, BeneficiaryListRequest, BeneficiaryListResponse> {

    private static final Logger LOGGER= LoggerFactory.getLogger(BeneficiaryListServerRequest.class);

    @Override
    protected void process(BeneficiariesListPresenter presenter, BeneficiaryListRequest serverRequest, BeneficiaryListResponse response) {
        presenter.onBeneficiariesListReceived(response.getBeneficiaries());
    }

    @Override
    public void processFailed(BeneficiariesListPresenter presenter, BeneficiaryListRequest serverArgs,
                              FailedServerResponse failedResponse) {
        final FailedResponseException error = (FailedResponseException) failedResponse.getError();
    }

    @Override
    public BeneficiaryListRequest buildArguments() {
        return new BeneficiaryListRequest();
    }
}
