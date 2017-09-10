package com.progressoft.workshop.layout.client.requests;

public class LayoutServerRequestSender_LayoutServerRequestService_Generated_RestServiceProxy_ implements com.progressoft.workshop.layout.client.requests.LayoutServerRequestSender.LayoutServerRequestService, org.fusesource.restygwt.client.RestServiceProxy {
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
  public void send(com.progressoft.workshop.layout.shared.request.LayoutRequest request, org.fusesource.restygwt.client.MethodCallback<com.progressoft.workshop.layout.shared.response.LayoutResponse> callback) {
    final com.progressoft.workshop.layout.shared.request.LayoutRequest final_request = request;
    final org.fusesource.restygwt.client.Method __method =
    getResource()
    .resolve("LayoutRequest")
    .post();
    __method.setDispatcher(this.dispatcher);
    __method.header(org.fusesource.restygwt.client.Resource.HEADER_ACCEPT, "application/json");
    __method.header(org.fusesource.restygwt.client.Resource.HEADER_CONTENT_TYPE, "application/json");
    __method.json(com.progressoft.workshop.layout.shared.request.LayoutRequest_Generated_JsonEncoderDecoder_.INSTANCE.encode(request));
    try {
      __method.send(new org.fusesource.restygwt.client.AbstractRequestCallback<com.progressoft.workshop.layout.shared.response.LayoutResponse>(__method, callback) {
        protected com.progressoft.workshop.layout.shared.response.LayoutResponse parseResult() throws Exception {
          try {
            return com.progressoft.workshop.layout.shared.response.LayoutResponse_Generated_JsonEncoderDecoder_.INSTANCE.decode(com.google.gwt.json.client.JSONParser.parse(__method.getResponse().getText()));
          } catch (Throwable __e) {
            throw new org.fusesource.restygwt.client.ResponseFormatException("Response was NOT a valid JSON document", __e);
          }
        }
      });
    } catch (com.google.gwt.http.client.RequestException __e) {
      callback.onFailure(__method,__e);
    }
  }
}
