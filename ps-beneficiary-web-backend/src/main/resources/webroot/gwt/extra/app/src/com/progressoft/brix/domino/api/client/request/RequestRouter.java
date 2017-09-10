package com.progressoft.brix.domino.api.client.request;


@FunctionalInterface
public interface RequestRouter<R extends Request> {
    void routeRequest(R request);
}
