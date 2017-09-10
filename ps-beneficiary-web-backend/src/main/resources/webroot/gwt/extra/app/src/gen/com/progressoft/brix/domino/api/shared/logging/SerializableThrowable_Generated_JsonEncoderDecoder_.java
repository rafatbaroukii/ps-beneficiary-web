package com.progressoft.brix.domino.api.shared.logging;

public class SerializableThrowable_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.progressoft.brix.domino.api.shared.logging.SerializableThrowable> {
  
  public static final SerializableThrowable_Generated_JsonEncoderDecoder_ INSTANCE = new SerializableThrowable_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.progressoft.brix.domino.api.shared.logging.SerializableThrowable value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.progressoft.brix.domino.api.shared.logging.SerializableThrowable parseValue = (com.progressoft.brix.domino.api.shared.logging.SerializableThrowable)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.type), rc, "type");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.message), rc, "message");
    isNotNullValuePut(com.progressoft.brix.domino.api.shared.logging.SerializableThrowable_Generated_JsonEncoderDecoder_.INSTANCE.encode(parseValue.cause), rc, "cause");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toJSON(parseValue.stackTrace, com.progressoft.brix.domino.api.shared.logging.SerializableStackTraceElement_Generated_JsonEncoderDecoder_.INSTANCE), rc, "stackTrace");
    return rc;
  }
  
  public com.progressoft.brix.domino.api.shared.logging.SerializableThrowable decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.progressoft.brix.domino.api.shared.logging.SerializableThrowable rc = new com.progressoft.brix.domino.api.shared.logging.SerializableThrowable();
    rc.type= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("type")),null);
    rc.message= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("message")),null);
    rc.cause= getValueToSet(com.progressoft.brix.domino.api.shared.logging.SerializableThrowable_Generated_JsonEncoderDecoder_.INSTANCE.decode(object.get("cause")),null);
    rc.stackTrace= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toArray(object.get("stackTrace"), com.progressoft.brix.domino.api.shared.logging.SerializableStackTraceElement_Generated_JsonEncoderDecoder_.INSTANCE, new com.progressoft.brix.domino.api.shared.logging.SerializableStackTraceElement[org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.getSize(object.get("stackTrace"))]),null);
    return rc;
  }
  
}
