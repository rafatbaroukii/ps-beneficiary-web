package com.progressoft.brix.domino.api.shared.logging;

public class SerializableStackTraceElement_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.progressoft.brix.domino.api.shared.logging.SerializableStackTraceElement> {
  
  public static final SerializableStackTraceElement_Generated_JsonEncoderDecoder_ INSTANCE = new SerializableStackTraceElement_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.progressoft.brix.domino.api.shared.logging.SerializableStackTraceElement value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.progressoft.brix.domino.api.shared.logging.SerializableStackTraceElement parseValue = (com.progressoft.brix.domino.api.shared.logging.SerializableStackTraceElement)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.className), rc, "className");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.fileName), rc, "fileName");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.methodName), rc, "methodName");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.INT.encode(parseValue.lineNumber), rc, "lineNumber");
    return rc;
  }
  
  public com.progressoft.brix.domino.api.shared.logging.SerializableStackTraceElement decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.progressoft.brix.domino.api.shared.logging.SerializableStackTraceElement rc = new com.progressoft.brix.domino.api.shared.logging.SerializableStackTraceElement();
    rc.className= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("className")),null);
    rc.fileName= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("fileName")),null);
    rc.methodName= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("methodName")),null);
    rc.lineNumber= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.INT.decode(object.get("lineNumber")),0);
    return rc;
  }
  
}
