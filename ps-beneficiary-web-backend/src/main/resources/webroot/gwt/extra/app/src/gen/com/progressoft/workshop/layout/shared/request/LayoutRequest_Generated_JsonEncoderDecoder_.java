package com.progressoft.workshop.layout.shared.request;

public class LayoutRequest_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.progressoft.workshop.layout.shared.request.LayoutRequest> {
  
  public static final LayoutRequest_Generated_JsonEncoderDecoder_ INSTANCE = new LayoutRequest_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.progressoft.workshop.layout.shared.request.LayoutRequest value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.progressoft.workshop.layout.shared.request.LayoutRequest parseValue = (com.progressoft.workshop.layout.shared.request.LayoutRequest)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getMessage()), rc, "message");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getRequestKey()), rc, "requestKey");
    return rc;
  }
  
  public com.progressoft.workshop.layout.shared.request.LayoutRequest decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.progressoft.workshop.layout.shared.request.LayoutRequest rc = new com.progressoft.workshop.layout.shared.request.LayoutRequest();
    rc.setMessage(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("message")), null));
    rc.setRequestKey(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("requestKey")), null));
    return rc;
  }
  
}
