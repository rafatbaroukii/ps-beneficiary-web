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

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Element extends Node {
  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface MatchesSelectorRefNodesUnionType {
    @JsOverlay
    static MatchesSelectorRefNodesUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default Node asNode() {
      return Js.cast(this);
    }

    @JsOverlay
    default NodeList<Object> asNodeList() {
      return Js.cast(this);
    }

    @JsOverlay
    default boolean isNode() {
      return (Object) this instanceof Node;
    }

    @JsOverlay
    default boolean isNodeList() {
      return (Object) this instanceof NodeList;
    }
  }

  @JsFunction
  public interface OnabortCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnbeforeinputCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnbeforeunloadCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnblurCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnchangeCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnclickCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OncompositionendCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OncompositionstartCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OncompositionupdateCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OncontextmenuCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OncopyCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OncutCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OndblclickCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnerrorCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnfocusCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnfocusinCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnfocusoutCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OninputCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnkeydownCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnkeypressCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnkeyupCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnloadCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnmousedownCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnmousemoveCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnmouseoutCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnmouseoverCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnmouseupCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnmousewheelCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnpasteCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnresetCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnresizeCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnscrollCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnselectCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnsubmitCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OntextinputCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OntouchcancelCallbackFn {
    Object onInvoke(TouchEvent p0);
  }

  @JsFunction
  public interface OntouchendCallbackFn {
    Object onInvoke(TouchEvent p0);
  }

  @JsFunction
  public interface OntouchmoveCallbackFn {
    Object onInvoke(TouchEvent p0);
  }

  @JsFunction
  public interface OntouchstartCallbackFn {
    Object onInvoke(TouchEvent p0);
  }

  @JsFunction
  public interface OnunloadCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsFunction
  public interface OnwheelCallbackFn {
    Object onInvoke(Event p0);
  }

  @JsType
  public interface ScrollIntoViewTopType {
    @JsProperty
    String getBehavior();

    @JsProperty
    String getBlock();

    @JsProperty
    void setBehavior(String behavior);

    @JsProperty
    void setBlock(String block);
  }

  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface ScrollIntoViewTopUnionType {
    @JsOverlay
    static ScrollIntoViewTopUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default boolean asBoolean() {
      return Js.castToBoolean(this);
    }

    @JsOverlay
    default ScrollIntoViewTopType asScrollIntoViewTopType() {
      return Js.cast(this);
    }

    @JsOverlay
    default boolean isBoolean() {
      return (Object) this instanceof Boolean;
    }

    @JsOverlay
    default boolean isScrollIntoViewTopType() {
      return (Object) this instanceof ScrollIntoViewTopType;
    }
  }

  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface SetAttributeNSValueUnionType {
    @JsOverlay
    static SetAttributeNSValueUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default boolean asBoolean() {
      return Js.castToBoolean(this);
    }

    @JsOverlay
    default double asDouble() {
      return Js.castToDouble(this);
    }

    @JsOverlay
    default String asString() {
      return Js.cast(this);
    }

    @JsOverlay
    default boolean isBoolean() {
      return (Object) this instanceof Boolean;
    }

    @JsOverlay
    default boolean isDouble() {
      return (Object) this instanceof Double;
    }

    @JsOverlay
    default boolean isString() {
      return (Object) this instanceof String;
    }
  }

  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface SetAttributeValueUnionType {
    @JsOverlay
    static SetAttributeValueUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default boolean asBoolean() {
      return Js.castToBoolean(this);
    }

    @JsOverlay
    default double asDouble() {
      return Js.castToDouble(this);
    }

    @JsOverlay
    default String asString() {
      return Js.cast(this);
    }

    @JsOverlay
    default boolean isBoolean() {
      return (Object) this instanceof Boolean;
    }

    @JsOverlay
    default boolean isDouble() {
      return (Object) this instanceof Double;
    }

    @JsOverlay
    default boolean isString() {
      return (Object) this instanceof String;
    }
  }

  public static double ALLOW_KEYBOARD_INPUT;
  public NamedNodeMap<Attr> attributes;
  public double childElementCount;
  public DOMTokenList classList;
  public Object className;
  public double clientHeight;
  public double clientLeft;
  public double clientTop;
  public double clientWidth;
  public Element firstElementChild;
  public String innerHTML;
  public Element lastElementChild;
  public Element nextElementSibling;
  public OnabortCallbackFn onabort;
  public OnbeforeinputCallbackFn onbeforeinput;
  public OnbeforeunloadCallbackFn onbeforeunload;
  public OnblurCallbackFn onblur;
  public OnchangeCallbackFn onchange;
  public OnclickCallbackFn onclick;
  public OncompositionendCallbackFn oncompositionend;
  public OncompositionstartCallbackFn oncompositionstart;
  public OncompositionupdateCallbackFn oncompositionupdate;
  public OncontextmenuCallbackFn oncontextmenu;
  public OncopyCallbackFn oncopy;
  public OncutCallbackFn oncut;
  public OndblclickCallbackFn ondblclick;
  public OnerrorCallbackFn onerror;
  public OnfocusCallbackFn onfocus;
  public OnfocusinCallbackFn onfocusin;
  public OnfocusoutCallbackFn onfocusout;
  public OninputCallbackFn oninput;
  public OnkeydownCallbackFn onkeydown;
  public OnkeypressCallbackFn onkeypress;
  public OnkeyupCallbackFn onkeyup;
  public OnloadCallbackFn onload;
  public OnmousedownCallbackFn onmousedown;
  public OnmousemoveCallbackFn onmousemove;
  public OnmouseoutCallbackFn onmouseout;
  public OnmouseoverCallbackFn onmouseover;
  public OnmouseupCallbackFn onmouseup;
  public OnmousewheelCallbackFn onmousewheel;
  public OnpasteCallbackFn onpaste;
  public OnresetCallbackFn onreset;
  public OnresizeCallbackFn onresize;
  public OnscrollCallbackFn onscroll;
  public OnselectCallbackFn onselect;
  public OnsubmitCallbackFn onsubmit;
  public OntextinputCallbackFn ontextinput;
  public OntouchcancelCallbackFn ontouchcancel;
  public OntouchendCallbackFn ontouchend;
  public OntouchmoveCallbackFn ontouchmove;
  public OntouchstartCallbackFn ontouchstart;
  public OnunloadCallbackFn onunload;
  public OnwheelCallbackFn onwheel;
  public Element previousElementSibling;
  public TypeInfo schemaTypeInfo;
  public double scrollHeight;
  public double scrollLeft;
  public double scrollTop;
  public double scrollWidth;
  public String tagName;

  public native void blur();

  public native void click();

  public native Element closest(String selectors);

  public native void focus();

  public native String getAttribute(String name, double flags);

  public native String getAttribute(String name);

  public native String getAttributeNS(String namespaceURI, String localName);

  public native Attr getAttributeNode(String name);

  public native Attr getAttributeNodeNS(String namespaceURI, String localName);

  public native ClientRect getBoundingClientRect();

  public native ClientRectList getClientRects();

  public native NodeList<Element> getElementsByTagName(String tagname);

  public native NodeList<Element> getElementsByTagNameNS(String namespaceURI, String localName);

  public native boolean hasAttribute(String name);

  public native boolean hasAttributeNS(String namespaceURI, String localName);

  public native boolean matches(String selectors);

  public native boolean matchesSelector(
      String selectors, MatchesSelectorRefNodesUnionType refNodes);

  @JsOverlay
  public final boolean matchesSelector(String selectors, Node refNodes) {
    return matchesSelector(selectors, Js.<MatchesSelectorRefNodesUnionType>uncheckedCast(refNodes));
  }

  @JsOverlay
  public final boolean matchesSelector(String selectors, NodeList<Object> refNodes) {
    return matchesSelector(selectors, Js.<MatchesSelectorRefNodesUnionType>uncheckedCast(refNodes));
  }

  public native boolean matchesSelector(String selectors);

  public native boolean mozMatchesSelector(String selectors);

  public native Object mozRequestFullScreen();

  public native Object mozRequestFullScreenWithKeys();

  public native void msExitFullscreen();

  public native boolean msMatchesSelector(String selectors);

  public native void msRequestFullscreen();

  public native boolean oMatchesSelector(String selectors);

  public native Element querySelector(String selectors);

  public native NodeList<Element> querySelectorAll(String selectors);

  public native void remove();

  public native void removeAttribute(String name);

  public native void removeAttributeNS(String namespaceURI, String localName);

  public native Attr removeAttributeNode(Attr oldAttr);

  public native void requestFullscreen();

  public native void scrollIntoView();

  @JsOverlay
  public final void scrollIntoView(ScrollIntoViewTopType top) {
    scrollIntoView(Js.<ScrollIntoViewTopUnionType>uncheckedCast(top));
  }

  public native void scrollIntoView(ScrollIntoViewTopUnionType top);

  @JsOverlay
  public final void scrollIntoView(boolean top) {
    scrollIntoView(Js.<ScrollIntoViewTopUnionType>uncheckedCast(top));
  }

  public native void setAttribute(String name, SetAttributeValueUnionType value);

  @JsOverlay
  public final void setAttribute(String name, String value) {
    setAttribute(name, Js.<SetAttributeValueUnionType>uncheckedCast(value));
  }

  @JsOverlay
  public final void setAttribute(String name, boolean value) {
    setAttribute(name, Js.<SetAttributeValueUnionType>uncheckedCast(value));
  }

  @JsOverlay
  public final void setAttribute(String name, double value) {
    setAttribute(name, Js.<SetAttributeValueUnionType>uncheckedCast(value));
  }

  public native void setAttributeNS(
      String namespaceURI, String qualifiedName, SetAttributeNSValueUnionType value);

  @JsOverlay
  public final void setAttributeNS(String namespaceURI, String qualifiedName, String value) {
    setAttributeNS(
        namespaceURI, qualifiedName, Js.<SetAttributeNSValueUnionType>uncheckedCast(value));
  }

  @JsOverlay
  public final void setAttributeNS(String namespaceURI, String qualifiedName, boolean value) {
    setAttributeNS(
        namespaceURI, qualifiedName, Js.<SetAttributeNSValueUnionType>uncheckedCast(value));
  }

  @JsOverlay
  public final void setAttributeNS(String namespaceURI, String qualifiedName, double value) {
    setAttributeNS(
        namespaceURI, qualifiedName, Js.<SetAttributeNSValueUnionType>uncheckedCast(value));
  }

  public native Attr setAttributeNode(Attr newAttr);

  public native Attr setAttributeNodeNS(Attr newAttr);

  public native void setIdAttribute(String name, boolean isId);

  public native void setIdAttributeNS(String namespaceURI, String localName, boolean isId);

  public native void setIdAttributeNode(Attr idAttr, boolean isId);

  public native boolean webkitMatchesSelector(String selectors);

  public native void webkitRequestFullScreen();

  public native void webkitRequestFullScreen(double allowKeyboardInput);

  public native void webkitRequestFullscreen();

  public native void webkitRequestFullscreen(double allowKeyboardInput);
}
