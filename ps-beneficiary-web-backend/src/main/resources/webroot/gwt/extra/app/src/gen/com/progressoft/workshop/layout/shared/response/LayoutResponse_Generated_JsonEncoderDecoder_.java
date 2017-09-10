package com.progressoft.workshop.layout.shared.response;

public class LayoutResponse_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.progressoft.workshop.layout.shared.response.LayoutResponse> {
  
  public static final LayoutResponse_Generated_JsonEncoderDecoder_ INSTANCE = new LayoutResponse_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.progressoft.workshop.layout.shared.response.LayoutResponse value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.progressoft.workshop.layout.shared.response.LayoutResponse parseValue = (com.progressoft.workshop.layout.shared.response.LayoutResponse)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getServerMessage()), rc, "serverMessage");
    return rc;
  }
  
  public com.progressoft.workshop.layout.shared.response.LayoutResponse decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.progressoft.workshop.layout.shared.response.LayoutResponse rc = new com.progressoft.workshop.layout.shared.response.LayoutResponse();
    rc.setServerMessage(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("serverMessage")), null));
    return rc;
  }
  
}
