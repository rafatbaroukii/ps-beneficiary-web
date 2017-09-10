package com.progressoft.brix.domino.gwt.client.history;

import com.progressoft.brix.domino.api.client.ClientApp;
import com.progressoft.brix.domino.api.shared.history.AppHistory;
import com.progressoft.brix.domino.api.shared.history.HistoryToken;
import com.progressoft.brix.domino.api.shared.history.TokenFilter;
import elemental2.dom.DomGlobal;
import elemental2.dom.PopStateEvent;
import jsinterop.base.Js;

import java.util.HashSet;
import java.util.Set;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class StateHistory implements AppHistory {

    private Set<HistoryListener> listeners = new HashSet<>();
    private final History history = Js.cast(DomGlobal.self.history);

    public StateHistory() {
        DomGlobal.self.addEventListener("popstate", event -> {
            PopStateEvent popStateEvent=Js.cast(event);
            JsState state=Js.cast(popStateEvent.state);
            if (nonNull(state))
                inform(state.historyToken, state.title, state.data);
        });
    }

    private void inform(String token, String title, String stateJson) {
        listeners.stream().filter(l -> l.tokenFilter.filter(token))
                .forEach(l -> ClientApp.make().getAsyncRunner().runAsync(() ->
                        l.listener.onPopState(new DominoHistoryState(token, title, stateJson))));
    }

    @Override
    public DirectState listen(StateListener listener) {
        return listen(TokenFilter.any(), listener);
    }

    @Override
    public DirectState listen(TokenFilter tokenFilter, StateListener listener) {
        listeners.add(new HistoryListener(listener, tokenFilter));
        return new DominoDirectState(tokenFilter, currentState());
    }

    @Override
    public void back() {
        history.back();
    }

    @Override
    public void forward() {
        history.forward();
    }

    @Override
    public void pushState(String token, String title, String data) {
        if (nonNull(currentToken().value()) && !currentToken().value().equals(token))
            history.pushState(JsState.state(token, title, data), title, "/" + token);
    }

    @Override
    public void replaceState(String token, String title, String data) {
        history.replaceState(
                JsState.state(token, data), title, "/" + token);
    }

    @Override
    public StateHistoryToken currentToken() {
        return new StateHistoryToken(windowToken());
    }

    @Override
    public void fireCurrentStateHistory() {
        fireState(windowToken(), stateData(windowState()));
    }

    private void fireState(String token, String state) {
        replaceState(token, windowTitle(), state);
        inform(token, windowTitle(), state);
    }

    private State windowState() {
        return (State) DomGlobal.self.history.state;
    }

    private String windowTitle() {
        return DomGlobal.document.title;
    }

    private String windowToken() {
       Location location= Js.cast(DomGlobal.location);
        return location.getPathname().substring(1) + location.getSearch();
    }

    private State currentState() {
        return new DominoHistoryState(windowToken(), windowTitle(), stateData(windowState()));
    }

    private String stateData(State state) {
        return isNull(state) ? "" : state.data();
    }

    private class HistoryListener {
        private final StateListener listener;

        private final TokenFilter tokenFilter;

        private HistoryListener(StateListener listener,
                                TokenFilter tokenFilter) {
            this.listener = listener;
            this.tokenFilter = tokenFilter;
        }
    }

    private class DominoHistoryState implements State {

        private final HistoryToken token;
        private final String data;
        private final String title;

        public DominoHistoryState(String token, String title, String data) {
            this.token = new StateHistoryToken(token);
            this.data = data;
            this.title = title;
        }

        @Override
        public HistoryToken token() {
            return this.token;
        }

        @Override
        public String data() {
            return this.data;
        }

        @Override
        public String title() {
            return this.title;
        }
    }
}
