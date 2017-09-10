package com.progressoft.brix.domino.api.shared.logging;

public class SerializableLogRecord_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.progressoft.brix.domino.api.shared.logging.SerializableLogRecord> {
  
  public static final SerializableLogRecord_Generated_JsonEncoderDecoder_ INSTANCE = new SerializableLogRecord_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.progressoft.brix.domino.api.shared.logging.SerializableLogRecord value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.progressoft.brix.domino.api.shared.logging.SerializableLogRecord parseValue = (com.progressoft.brix.domino.api.shared.logging.SerializableLogRecord)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.level), rc, "level");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.message), rc, "message");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.LONG.encode(parseValue.millis), rc, "millis");
    isNotNullValuePut(com.progressoft.brix.domino.api.shared.logging.SerializableThrowable_Generated_JsonEncoderDecoder_.INSTANCE.encode(parseValue.thrown), rc, "thrown");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.loggerName), rc, "loggerName");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.permutationStrongName), rc, "permutationStrongName");
    return rc;
  }
  
  public com.progressoft.brix.domino.api.shared.logging.SerializableLogRecord decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.progressoft.brix.domino.api.shared.logging.SerializableLogRecord rc = new com.progressoft.brix.domino.api.shared.logging.SerializableLogRecord();
    rc.level= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("level")),null);
    rc.message= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("message")),null);
    rc.millis= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.LONG.decode(object.get("millis")),0L);
    rc.thrown= getValueToSet(com.progressoft.brix.domino.api.shared.logging.SerializableThrowable_Generated_JsonEncoderDecoder_.INSTANCE.decode(object.get("thrown")),null);
    rc.loggerName= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("loggerName")),null);
    rc.permutationStrongName= getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("permutationStrongName")),null);
    return rc;
  }
  
}
