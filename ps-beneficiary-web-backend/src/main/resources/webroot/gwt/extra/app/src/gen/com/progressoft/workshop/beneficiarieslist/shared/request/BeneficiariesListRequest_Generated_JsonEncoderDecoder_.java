package com.progressoft.workshop.beneficiarieslist.shared.request;

public class BeneficiariesListRequest_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.progressoft.workshop.beneficiarieslist.shared.request.BeneficiariesListRequest> {
  
  public static final BeneficiariesListRequest_Generated_JsonEncoderDecoder_ INSTANCE = new BeneficiariesListRequest_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.progressoft.workshop.beneficiarieslist.shared.request.BeneficiariesListRequest value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.progressoft.workshop.beneficiarieslist.shared.request.BeneficiariesListRequest parseValue = (com.progressoft.workshop.beneficiarieslist.shared.request.BeneficiariesListRequest)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getMessage()), rc, "message");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getRequestKey()), rc, "requestKey");
    return rc;
  }
  
  public com.progressoft.workshop.beneficiarieslist.shared.request.BeneficiariesListRequest decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.progressoft.workshop.beneficiarieslist.shared.request.BeneficiariesListRequest rc = new com.progressoft.workshop.beneficiarieslist.shared.request.BeneficiariesListRequest();
    rc.setMessage(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("message")), null));
    rc.setRequestKey(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("requestKey")), null));
    return rc;
  }
  
}
