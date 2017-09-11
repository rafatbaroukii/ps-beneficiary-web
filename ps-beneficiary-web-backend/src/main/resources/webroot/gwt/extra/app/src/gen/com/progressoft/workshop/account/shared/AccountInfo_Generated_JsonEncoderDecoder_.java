package com.progressoft.workshop.account.shared;

public class AccountInfo_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.progressoft.workshop.account.shared.AccountInfo> {
  
  public static final AccountInfo_Generated_JsonEncoderDecoder_ INSTANCE = new AccountInfo_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.progressoft.workshop.account.shared.AccountInfo value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.progressoft.workshop.account.shared.AccountInfo parseValue = (com.progressoft.workshop.account.shared.AccountInfo)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.iban), rc, "iban");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.isoCode), rc, "isoCode");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BOOLEAN.encode(parseValue.active), rc, "active");
    return rc;
  }
  
  public com.progressoft.workshop.account.shared.AccountInfo decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.progressoft.workshop.account.shared.AccountInfo rc = new com.progressoft.workshop.account.shared.AccountInfo();
    rc.iban= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("iban")),null);
    rc.isoCode= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("isoCode")),null);
    rc.active= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BOOLEAN.decode(object.get("active")),false);
    return rc;
  }
  
}
