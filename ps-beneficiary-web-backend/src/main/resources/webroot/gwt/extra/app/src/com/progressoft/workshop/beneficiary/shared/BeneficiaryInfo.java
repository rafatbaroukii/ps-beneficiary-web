package com.progressoft.workshop.beneficiary.shared;

import com.progressoft.workshop.account.shared.AccountInfo;
import com.progressoft.workshop.agreement.shared.AgreementInfo;

import java.util.List;

public final class BeneficiaryInfo {
    public String name;
    public String cif;
    public String alpha3Code;
    public List<AccountInfo> accounts;
    public List<AgreementInfo> agreements;

    public BeneficiaryInfo() {
    }

    public BeneficiaryInfo(String name, String cif, String alpha3Code, List<AccountInfo> accounts, List<AgreementInfo> agreements) {
        this.name = name;
        this.cif = cif;
        this.alpha3Code = alpha3Code;
        this.accounts = accounts;
        this.agreements = agreements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BeneficiaryInfo that = (BeneficiaryInfo) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (cif != null ? !cif.equals(that.cif) : that.cif != null) return false;
        if (alpha3Code != null ? !alpha3Code.equals(that.alpha3Code) : that.alpha3Code != null) return false;
        if (accounts != null ? !accounts.equals(that.accounts) : that.accounts != null) return false;
        return agreements != null ? agreements.equals(that.agreements) : that.agreements == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (cif != null ? cif.hashCode() : 0);
        result = 31 * result + (alpha3Code != null ? alpha3Code.hashCode() : 0);
        result = 31 * result + (accounts != null ? accounts.hashCode() : 0);
        result = 31 * result + (agreements != null ? agreements.hashCode() : 0);
        return result;
    }
}
