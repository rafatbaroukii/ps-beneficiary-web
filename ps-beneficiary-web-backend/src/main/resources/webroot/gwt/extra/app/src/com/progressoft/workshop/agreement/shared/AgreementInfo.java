package com.progressoft.workshop.agreement.shared;

import java.math.BigDecimal;

public class AgreementInfo implements ViewableAgreement {

    private long effectiveDate;
    private long expiryDate;
    private String currencyCode;
    private BigDecimal amount;

    public AgreementInfo() {
    }

    public AgreementInfo(long effectiveDate, long expiryDate, String currencyCode, BigDecimal amount) {
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
        this.currencyCode = currencyCode;
        this.amount = amount;
    }

    public AgreementInfo(ViewableAgreement viewableAgreement) {
        this.effectiveDate=viewableAgreement.getEffectiveDate();
        this.expiryDate=viewableAgreement.getExpiryDate();
        this.currencyCode=viewableAgreement.getCurrencyCode();
        this.amount=viewableAgreement.getAmount();
    }

    @Override
    public long getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(long effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Override
    public long getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(long expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgreementInfo that = (AgreementInfo) o;

        if (effectiveDate!=that.effectiveDate || expiryDate != that.expiryDate)
            return false;
        if (currencyCode != null ? !currencyCode.equals(that.currencyCode) : that.currencyCode != null) return false;
        return amount != null ? amount.equals(that.amount) : that.amount == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (effectiveDate ^ (effectiveDate >>> 32));
        result = 31 * result + (int) (expiryDate ^ (expiryDate >>> 32));
        result = 31 * result + (currencyCode != null ? currencyCode.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

}
