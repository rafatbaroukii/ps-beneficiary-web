package com.progressoft.workshop.beneficiarieslist.shared.response;

import com.progressoft.brix.domino.api.shared.request.ServerResponse;
import com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo;

import java.util.List;

public class BeneficiaryListResponse extends ServerResponse {

    private List<BeneficiaryInfo> beneficiaries;

    public BeneficiaryListResponse() {
    }

    public List<BeneficiaryInfo> getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(List<BeneficiaryInfo> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }
}
