package com.progressoft.workshop.beneficiarieslist.client.requests;

import com.progressoft.brix.domino.api.client.request.ClientServerRequest;
import com.progressoft.workshop.beneficiarieslist.shared.response.BeneficiariesListResponse;
import com.progressoft.workshop.beneficiarieslist.shared.request.BeneficiariesListRequest;
import com.progressoft.workshop.beneficiarieslist.client.presenters.BeneficiariesListPresenter;
import com.progressoft.brix.domino.api.client.annotations.Request;
import com.progressoft.brix.domino.api.client.annotations.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Request
@Path("BeneficiariesListRequest")
public class BeneficiariesListServerRequest extends ClientServerRequest<BeneficiariesListPresenter, BeneficiariesListRequest, BeneficiariesListResponse> {

    private static final Logger LOGGER= LoggerFactory.getLogger(BeneficiariesListServerRequest.class);

    @Override
    protected void process(BeneficiariesListPresenter presenter, BeneficiariesListRequest serverRequest, BeneficiariesListResponse response) {
        LOGGER.info("Message recieved from server : "+response.getServerMessage());
    }

    @Override
    public BeneficiariesListRequest buildArguments() {
        return new BeneficiariesListRequest("client message");
    }
}
