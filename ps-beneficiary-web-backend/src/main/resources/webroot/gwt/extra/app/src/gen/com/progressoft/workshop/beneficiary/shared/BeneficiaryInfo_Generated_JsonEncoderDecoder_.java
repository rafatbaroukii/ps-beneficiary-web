package com.progressoft.workshop.beneficiary.shared;

public class BeneficiaryInfo_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo> {
  
  public static final BeneficiaryInfo_Generated_JsonEncoderDecoder_ INSTANCE = new BeneficiaryInfo_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo parseValue = (com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.name), rc, "name");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.cif), rc, "cif");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.alpha3Code), rc, "alpha3Code");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toJSON(parseValue.accounts, com.progressoft.workshop.account.shared.AccountInfo_Generated_JsonEncoderDecoder_.INSTANCE), rc, "accounts");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toJSON(parseValue.agreements, com.progressoft.workshop.agreement.shared.AgreementInfo_Generated_JsonEncoderDecoder_.INSTANCE), rc, "agreements");
    return rc;
  }
  
  public com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo rc = new com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo();
    rc.name= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("name")),null);
    rc.cif= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("cif")),null);
    rc.alpha3Code= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("alpha3Code")),null);
    rc.accounts= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toList(object.get("accounts"), com.progressoft.workshop.account.shared.AccountInfo_Generated_JsonEncoderDecoder_.INSTANCE),null);
    rc.agreements= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toList(object.get("agreements"), com.progressoft.workshop.agreement.shared.AgreementInfo_Generated_JsonEncoderDecoder_.INSTANCE),null);
    return rc;
  }
  
}
