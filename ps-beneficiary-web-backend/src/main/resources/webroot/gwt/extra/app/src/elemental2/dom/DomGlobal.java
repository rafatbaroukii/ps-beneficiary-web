/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package elemental2.dom;

import elemental2.core.Array;
import elemental2.core.Transferable;
import elemental2.promise.Promise;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(isNative = true, name = "window", namespace = JsPackage.GLOBAL)
public class DomGlobal {
  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface FetchInputUnionType {
    @JsOverlay
    static FetchInputUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default Request asRequest() {
      return Js.cast(this);
    }

    @JsOverlay
    default String asString() {
      return Js.cast(this);
    }

    @JsOverlay
    default boolean isRequest() {
      return (Object) this instanceof Request;
    }

    @JsOverlay
    default boolean isString() {
      return (Object) this instanceof String;
    }
  }

  @JsFunction
  public interface MozRequestAnimationFrameCallbackFn {
    Object onInvoke(double p0);
  }

  @JsFunction
  public interface MsRequestAnimationFrameCallbackFn {
    Object onInvoke(double p0);
  }

  @JsFunction
  public interface ORequestAnimationFrameCallbackFn {
    Object onInvoke(double p0);
  }

  @JsFunction
  public interface OpenDatabaseCallbackFn {
    Object onInvoke(Database p0);
  }

  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface OpenDatabaseCallbackUnionType {
    @JsOverlay
    static OpenDatabaseCallbackUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default DatabaseCallback asDatabaseCallback() {
      return Js.cast(this);
    }

    @JsOverlay
    default OpenDatabaseCallbackFn asOpenDatabaseCallbackFn() {
      return Js.cast(this);
    }

    @JsOverlay
    default boolean isOpenDatabaseCallbackFn() {
      return (Object) this instanceof OpenDatabaseCallbackFn;
    }
  }

  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface PostMessageTargetOriginOrPortsOrTransferUnionType {
    @JsOverlay
    static PostMessageTargetOriginOrPortsOrTransferUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default Array asArray() {
      return Js.cast(this);
    }

    @JsOverlay
    default String asString() {
      return Js.cast(this);
    }

    @JsOverlay
    default boolean isArray() {
      return (Object) this instanceof Array;
    }

    @JsOverlay
    default boolean isString() {
      return (Object) this instanceof String;
    }
  }

  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface PostMessageTargetOriginOrTransferUnionType {
    @JsOverlay
    static PostMessageTargetOriginOrTransferUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default String asString() {
      return Js.cast(this);
    }

    @JsOverlay
    default Transferable[] asTransferableArray() {
      return Js.cast(this);
    }

    @JsOverlay
    default boolean isString() {
      return (Object) this instanceof String;
    }

    @JsOverlay
    default boolean isTransferableArray() {
      return (Object) this instanceof Object[];
    }
  }

  @JsFunction
  public interface RequestAnimationFrameCallbackFn {
    Object onInvoke(double p0);
  }

  @JsFunction
  public interface SetImmediateCallbackFn {
    Object onInvoke();
  }

  @JsFunction
  public interface SetIntervalCallbackFn {
    void onInvoke(Object... p0);
  }

  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface SetIntervalCallbackUnionType {
    @JsOverlay
    static SetIntervalCallbackUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default SetIntervalCallbackFn asSetIntervalCallbackFn() {
      return Js.cast(this);
    }

    @JsOverlay
    default String asString() {
      return Js.cast(this);
    }

    @JsOverlay
    default boolean isSetIntervalCallbackFn() {
      return (Object) this instanceof SetIntervalCallbackFn;
    }

    @JsOverlay
    default boolean isString() {
      return (Object) this instanceof String;
    }
  }

  @JsFunction
  public interface SetTimeoutCallbackFn {
    void onInvoke(Object... p0);
  }

  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface SetTimeoutCallbackUnionType {
    @JsOverlay
    static SetTimeoutCallbackUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default SetTimeoutCallbackFn asSetTimeoutCallbackFn() {
      return Js.cast(this);
    }

    @JsOverlay
    default String asString() {
      return Js.cast(this);
    }

    @JsOverlay
    default boolean isSetTimeoutCallbackFn() {
      return (Object) this instanceof SetTimeoutCallbackFn;
    }

    @JsOverlay
    default boolean isString() {
      return (Object) this instanceof String;
    }
  }

  @JsFunction
  public interface WebkitRequestAnimationFrameCallbackFn {
    Object onInvoke(double p0);
  }

  public static CSSInterface CSS;
  public static DOMApplicationCache applicationCache;
  public static Console console;
  public static CustomElementRegistry customElements;
  @JsOverlay public static final HTMLDocument document = DomGlobal__Constants.document;
  @JsOverlay public static final Location location = DomGlobal__Constants.location;
  @JsOverlay public static final Navigator navigator = DomGlobal__Constants.navigator;
  public static Performance performance;
  @JsOverlay public static final Screen screen = DomGlobal__Constants.screen;
  @JsOverlay public static final Window self = DomGlobal__Constants.self;
  @JsOverlay public static final Window top = DomGlobal__Constants.top;
  public static Window window;

  public static native void alert(Object message);

  public static native void cancelAnimationFrame(double handle);

  public static native void cancelRequestAnimationFrame(double handle);

  public static native void clearImmediate(double immediateID);

  public static native void clearInterval(double intervalID);

  public static native void clearTimeout(double timeoutID);

  public static native boolean confirm(Object message);

  public static native void dump(Object x);

  public static native Promise<Response> fetch(FetchInputUnionType input, RequestInit init);

  public static native Promise<Response> fetch(FetchInputUnionType input);

  @JsOverlay
  public static final Promise<Response> fetch(Request input, RequestInit init) {
    return fetch(Js.<FetchInputUnionType>uncheckedCast(input), init);
  }

  @JsOverlay
  public static final Promise<Response> fetch(Request input) {
    return fetch(Js.<FetchInputUnionType>uncheckedCast(input));
  }

  @JsOverlay
  public static final Promise<Response> fetch(String input, RequestInit init) {
    return fetch(Js.<FetchInputUnionType>uncheckedCast(input), init);
  }

  @JsOverlay
  public static final Promise<Response> fetch(String input) {
    return fetch(Js.<FetchInputUnionType>uncheckedCast(input));
  }

  public static native boolean hasOwnProperty(Object propertyName);

  public static native void importScripts(String... var_args);

  public static native void mozCancelAnimationFrame(double handle);

  public static native void mozCancelRequestAnimationFrame(double handle);

  public static native double mozRequestAnimationFrame(
      MozRequestAnimationFrameCallbackFn callback, Element element);

  public static native double mozRequestAnimationFrame(MozRequestAnimationFrameCallbackFn callback);

  public static native void msCancelAnimationFrame(double handle);

  public static native void msCancelRequestAnimationFrame(double handle);

  public static native double msRequestAnimationFrame(
      MsRequestAnimationFrameCallbackFn callback, Element element);

  public static native double msRequestAnimationFrame(MsRequestAnimationFrameCallbackFn callback);

  public static native void oCancelAnimationFrame(double handle);

  public static native void oCancelRequestAnimationFrame(double handle);

  public static native double oRequestAnimationFrame(
      ORequestAnimationFrameCallbackFn callback, Element element);

  public static native double oRequestAnimationFrame(ORequestAnimationFrameCallbackFn callback);

  @JsOverlay
  public static final Database openDatabase(
      String name, String version, String description, double size, DatabaseCallback callback) {
    return openDatabase(
        name,
        version,
        description,
        size,
        Js.<OpenDatabaseCallbackUnionType>uncheckedCast(callback));
  }

  @JsOverlay
  public static final Database openDatabase(
      String name,
      String version,
      String description,
      double size,
      OpenDatabaseCallbackFn callback) {
    return openDatabase(
        name,
        version,
        description,
        size,
        Js.<OpenDatabaseCallbackUnionType>uncheckedCast(callback));
  }

  public static native Database openDatabase(
      String name,
      String version,
      String description,
      double size,
      OpenDatabaseCallbackUnionType callback);

  public static native Database openDatabase(
      String name, String version, String description, double size);

  @JsOverlay
  public static final void postMessage(
      Object message,
      PostMessageTargetOriginOrTransferUnionType targetOriginOrTransfer,
      Array targetOriginOrPortsOrTransfer) {
    postMessage(
        message,
        targetOriginOrTransfer,
        Js.<PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(
            targetOriginOrPortsOrTransfer));
  }

  public static native void postMessage(
      Object message,
      PostMessageTargetOriginOrTransferUnionType targetOriginOrTransfer,
      PostMessageTargetOriginOrPortsOrTransferUnionType targetOriginOrPortsOrTransfer);

  @JsOverlay
  public static final void postMessage(
      Object message,
      PostMessageTargetOriginOrTransferUnionType targetOriginOrTransfer,
      String targetOriginOrPortsOrTransfer) {
    postMessage(
        message,
        targetOriginOrTransfer,
        Js.<PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(
            targetOriginOrPortsOrTransfer));
  }

  public static native void postMessage(
      Object message, PostMessageTargetOriginOrTransferUnionType targetOriginOrTransfer);

  @JsOverlay
  public static final void postMessage(
      Object message, String targetOriginOrTransfer, Array targetOriginOrPortsOrTransfer) {
    postMessage(
        message,
        Js.<PostMessageTargetOriginOrTransferUnionType>uncheckedCast(targetOriginOrTransfer),
        Js.<PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(
            targetOriginOrPortsOrTransfer));
  }

  @JsOverlay
  public static final void postMessage(
      Object message,
      String targetOriginOrTransfer,
      PostMessageTargetOriginOrPortsOrTransferUnionType targetOriginOrPortsOrTransfer) {
    postMessage(
        message,
        Js.<PostMessageTargetOriginOrTransferUnionType>uncheckedCast(targetOriginOrTransfer),
        targetOriginOrPortsOrTransfer);
  }

  @JsOverlay
  public static final void postMessage(
      Object message, String targetOriginOrTransfer, String targetOriginOrPortsOrTransfer) {
    postMessage(
        message,
        Js.<PostMessageTargetOriginOrTransferUnionType>uncheckedCast(targetOriginOrTransfer),
        Js.<PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(
            targetOriginOrPortsOrTransfer));
  }

  @JsOverlay
  public static final void postMessage(Object message, String targetOriginOrTransfer) {
    postMessage(
        message,
        Js.<PostMessageTargetOriginOrTransferUnionType>uncheckedCast(targetOriginOrTransfer));
  }

  @JsOverlay
  public static final void postMessage(
      Object message, Transferable[] targetOriginOrTransfer, Array targetOriginOrPortsOrTransfer) {
    postMessage(
        message,
        Js.<PostMessageTargetOriginOrTransferUnionType>uncheckedCast(targetOriginOrTransfer),
        Js.<PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(
            targetOriginOrPortsOrTransfer));
  }

  @JsOverlay
  public static final void postMessage(
      Object message,
      Transferable[] targetOriginOrTransfer,
      PostMessageTargetOriginOrPortsOrTransferUnionType targetOriginOrPortsOrTransfer) {
    postMessage(
        message,
        Js.<PostMessageTargetOriginOrTransferUnionType>uncheckedCast(targetOriginOrTransfer),
        targetOriginOrPortsOrTransfer);
  }

  @JsOverlay
  public static final void postMessage(
      Object message, Transferable[] targetOriginOrTransfer, String targetOriginOrPortsOrTransfer) {
    postMessage(
        message,
        Js.<PostMessageTargetOriginOrTransferUnionType>uncheckedCast(targetOriginOrTransfer),
        Js.<PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(
            targetOriginOrPortsOrTransfer));
  }

  @JsOverlay
  public static final void postMessage(Object message, Transferable[] targetOriginOrTransfer) {
    postMessage(
        message,
        Js.<PostMessageTargetOriginOrTransferUnionType>uncheckedCast(targetOriginOrTransfer));
  }

  public static native void postMessage(Object message);

  public static native String prompt(String message, String value);

  public static native String prompt(String message);

  public static native double requestAnimationFrame(
      RequestAnimationFrameCallbackFn callback, Element element);

  public static native double requestAnimationFrame(RequestAnimationFrameCallbackFn callback);

  public static native double setImmediate(SetImmediateCallbackFn callback);

  @JsOverlay
  public static final double setInterval(
      SetIntervalCallbackFn callback, double delay, Object... var_args) {
    return setInterval(Js.<SetIntervalCallbackUnionType>uncheckedCast(callback), delay, var_args);
  }

  public static native double setInterval(
      SetIntervalCallbackUnionType callback, double delay, Object... var_args);

  @JsOverlay
  public static final double setInterval(String callback, double delay, Object... var_args) {
    return setInterval(Js.<SetIntervalCallbackUnionType>uncheckedCast(callback), delay, var_args);
  }

  @JsOverlay
  public static final double setTimeout(
      SetTimeoutCallbackFn callback, double delay, Object... var_args) {
    return setTimeout(Js.<SetTimeoutCallbackUnionType>uncheckedCast(callback), delay, var_args);
  }

  public static native double setTimeout(
      SetTimeoutCallbackUnionType callback, double delay, Object... var_args);

  @JsOverlay
  public static final double setTimeout(String callback, double delay, Object... var_args) {
    return setTimeout(Js.<SetTimeoutCallbackUnionType>uncheckedCast(callback), delay, var_args);
  }

  public static native void webkitCancelAnimationFrame(double handle);

  public static native void webkitCancelRequestAnimationFrame(double handle);

  public static native double webkitRequestAnimationFrame(
      WebkitRequestAnimationFrameCallbackFn callback, Element element);

  public static native double webkitRequestAnimationFrame(
      WebkitRequestAnimationFrameCallbackFn callback);
}
