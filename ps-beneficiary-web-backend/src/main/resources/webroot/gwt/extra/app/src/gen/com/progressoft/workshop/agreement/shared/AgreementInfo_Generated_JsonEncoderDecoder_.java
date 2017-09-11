package com.progressoft.workshop.agreement.shared;

public class AgreementInfo_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.progressoft.workshop.agreement.shared.AgreementInfo> {
  
  public static final AgreementInfo_Generated_JsonEncoderDecoder_ INSTANCE = new AgreementInfo_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.progressoft.workshop.agreement.shared.AgreementInfo value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.progressoft.workshop.agreement.shared.AgreementInfo parseValue = (com.progressoft.workshop.agreement.shared.AgreementInfo)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.LONG.encode(parseValue.getEffectiveDate()), rc, "effectiveDate");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.LONG.encode(parseValue.getExpiryDate()), rc, "expiryDate");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getCurrencyCode()), rc, "currencyCode");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BIG_DECIMAL.encode(parseValue.getAmount()), rc, "amount");
    return rc;
  }
  
  public com.progressoft.workshop.agreement.shared.AgreementInfo decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.progressoft.workshop.agreement.shared.AgreementInfo rc = new com.progressoft.workshop.agreement.shared.AgreementInfo();
    rc.setEffectiveDate(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.LONG.decode(object.get("effectiveDate")), 0L));
    rc.setExpiryDate(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.LONG.decode(object.get("expiryDate")), 0L));
    rc.setCurrencyCode(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("currencyCode")), null));
    rc.setAmount(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BIG_DECIMAL.decode(object.get("amount")), null));
    return rc;
  }
  
}
