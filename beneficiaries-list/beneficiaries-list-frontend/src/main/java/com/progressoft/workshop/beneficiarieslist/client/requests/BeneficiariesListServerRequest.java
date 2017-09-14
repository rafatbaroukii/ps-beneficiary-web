package com.progressoft.workshop.beneficiarieslist.client.requests;

import com.progressoft.brix.domino.api.client.annotations.Path;
import com.progressoft.brix.domino.api.client.annotations.Request;
import com.progressoft.brix.domino.api.client.request.ClientServerRequest;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.workshop.beneficiarieslist.shared.request.BeneficiariesListRequest;
import com.progressoft.workshop.beneficiarieslist.shared.response.BeneficiariesListResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.HttpMethod;


@Request
@Path(value = "", method = HttpMethod.GET)
public class BeneficiariesListServerRequest extends ClientServerRequest<BeneficiariesListPresenter, BeneficiariesListRequest, BeneficiariesListResponse> {

    private String sample="<p>Sample</p>";

    private static final Logger LOGGER = LoggerFactory.getLogger(BeneficiariesListServerRequest.class);

    @Override
    protected void process(BeneficiariesListPresenter presenter, BeneficiariesListRequest serverRequest, BeneficiariesListResponse response) {
        presenter.onBeneficiariesListReceived(response.getBeneficiaries());
    }

    @Override
    public BeneficiariesListRequest buildArguments() {
        return new BeneficiariesListRequest("client message");
    }
}
