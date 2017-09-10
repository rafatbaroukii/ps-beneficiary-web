package com.progressoft.workshop.beneficiarieslist.shared.response;

import com.progressoft.brix.domino.api.shared.request.ServerResponse;

public class BeneficiariesListResponse extends ServerResponse {

    private String serverMessage;

    public BeneficiariesListResponse() {
    }

    public BeneficiariesListResponse(String serverMessage) {
        this.serverMessage = serverMessage;
    }

    public String getServerMessage() {
        return serverMessage;
    }

    public void setServerMessage(String serverMessage) {
        this.serverMessage = serverMessage;
    }
}
