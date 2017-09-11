package com.progressoft.workshop.account.shared;

public class AccountInfo {
    public String iban;
    public String isoCode;
    public boolean active;

    public AccountInfo() {
    }

    public AccountInfo(String iban, String isoCode, boolean active) {
        this.iban = iban;
        this.isoCode = isoCode;
        this.active = active;
    }

    public AccountInfo(AccountInfo accountInfo) {
        this.iban = accountInfo.iban;
        this.isoCode = accountInfo.isoCode;
        this.active = accountInfo.active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountInfo that = (AccountInfo) o;

        if (active != that.active) return false;
        if (iban != null ? !iban.equals(that.iban) : that.iban != null) return false;
        return isoCode != null ? isoCode.equals(that.isoCode) : that.isoCode == null;
    }

    @Override
    public int hashCode() {
        int result = iban != null ? iban.hashCode() : 0;
        result = 31 * result + (isoCode != null ? isoCode.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        return result;
    }
}
