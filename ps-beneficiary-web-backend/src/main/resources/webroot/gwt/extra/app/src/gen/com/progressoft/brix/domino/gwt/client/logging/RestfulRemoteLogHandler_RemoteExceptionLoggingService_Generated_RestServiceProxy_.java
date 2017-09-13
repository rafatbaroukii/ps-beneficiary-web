package com.progressoft.brix.domino.gwt.client.logging;

public class RestfulRemoteLogHandler_RemoteExceptionLoggingService_Generated_RestServiceProxy_ implements com.progressoft.brix.domino.gwt.client.logging.RestfulRemoteLogHandler.RemoteExceptionLoggingService, org.fusesource.restygwt.client.RestServiceProxy {
  private org.fusesource.restygwt.client.Resource resource = null;
  
  public void setResource(org.fusesource.restygwt.client.Resource resource) {
    this.resource = resource;
  }
  public org.fusesource.restygwt.client.Resource getResource() {
    if (this.resource == null) {
      String serviceRoot = org.fusesource.restygwt.client.Defaults.getServiceRoot();
      this.resource = new org.fusesource.restygwt.client.Resource(serviceRoot);
    }
    return this.resource;
  }
  private org.fusesource.restygwt.client.Dispatcher dispatcher = null;
  
  public void setDispatcher(org.fusesource.restygwt.client.Dispatcher dispatcher) {
    this.dispatcher = dispatcher;
  }
  
  public org.fusesource.restygwt.client.Dispatcher getDispatcher() {
    return this.dispatcher;
  }
  public void send(com.progressoft.brix.domino.api.shared.logging.SerializableLogRecord record, org.fusesource.restygwt.client.MethodCallback<java.lang.Void> callback) {
    final com.progressoft.brix.domino.api.shared.logging.SerializableLogRecord final_record = record;
    final org.fusesource.restygwt.client.Method __method =
    getResource()
    .resolve("/service/remoteLogging")
    .post();
    __method.setDispatcher(this.dispatcher);
    __method.header(org.fusesource.restygwt.client.Resource.HEADER_ACCEPT, "application/json");
    __method.header(org.fusesource.restygwt.client.Resource.HEADER_CONTENT_TYPE, "application/json");
    __method.json(com.progressoft.brix.domino.api.shared.logging.SerializableLogRecord_Generated_JsonEncoderDecoder_.INSTANCE.encode(record));
    try {
      __method.send(new org.fusesource.restygwt.client.AbstractRequestCallback<java.lang.Void>(__method, callback) {
        protected java.lang.Void parseResult() throws Exception {
          return (java.lang.Void) null;
        }
      });
    } catch (com.google.gwt.http.client.RequestException __e) {
      callback.onFailure(__method,__e);
    }
  }
}
