package com.progressoft.workshop.beneficiarieslist.shared.request;

import com.progressoft.brix.domino.api.shared.request.ServerRequest;

public class BeneficiariesListRequest extends ServerRequest {

    private String message;

    public BeneficiariesListRequest() {
    }

    public BeneficiariesListRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
