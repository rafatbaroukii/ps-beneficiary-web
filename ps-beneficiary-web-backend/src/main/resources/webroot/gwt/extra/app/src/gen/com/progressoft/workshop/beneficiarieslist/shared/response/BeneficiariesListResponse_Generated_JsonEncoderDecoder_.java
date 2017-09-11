package com.progressoft.workshop.beneficiarieslist.shared.response;

public class BeneficiariesListResponse_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.progressoft.workshop.beneficiarieslist.shared.response.BeneficiariesListResponse> {
  
  public static final BeneficiariesListResponse_Generated_JsonEncoderDecoder_ INSTANCE = new BeneficiariesListResponse_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.progressoft.workshop.beneficiarieslist.shared.response.BeneficiariesListResponse value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.progressoft.workshop.beneficiarieslist.shared.response.BeneficiariesListResponse parseValue = (com.progressoft.workshop.beneficiarieslist.shared.response.BeneficiariesListResponse)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toJSON(parseValue.getBeneficiaries(), com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo_Generated_JsonEncoderDecoder_.INSTANCE), rc, "beneficiaries");
    return rc;
  }
  
  public com.progressoft.workshop.beneficiarieslist.shared.response.BeneficiariesListResponse decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.progressoft.workshop.beneficiarieslist.shared.response.BeneficiariesListResponse rc = new com.progressoft.workshop.beneficiarieslist.shared.response.BeneficiariesListResponse();
    rc.setBeneficiaries(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toList(object.get("beneficiaries"), com.progressoft.workshop.beneficiary.shared.BeneficiaryInfo_Generated_JsonEncoderDecoder_.INSTANCE), null));
    return rc;
  }
  
}
