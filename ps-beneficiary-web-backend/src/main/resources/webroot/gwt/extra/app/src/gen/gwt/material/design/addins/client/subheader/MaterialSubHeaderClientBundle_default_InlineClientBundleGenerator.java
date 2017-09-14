package gwt.material.design.addins.client.subheader;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialSubHeaderClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.subheader.MaterialSubHeaderClientBundle {
  private static MaterialSubHeaderClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialSubHeaderClientBundle_default_InlineClientBundleGenerator();
  private void subheaderCssInitializer() {
    subheaderCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/rafat/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.0-rc5/gwt-material-addins-2.0-rc5.jar!/gwt/material/design/addins/client/subheader/resources/css/subheader.min.css
      public String getText() {
        return ".subheader{background:#fff;position:relative;z-index:995;padding:12px}.subheader.fixed{position:fixed;top:0;width:200px;z-index:0}.subheader.fixed.absolute{position:absolute}.subheader-container{overflow:auto;position:relative;padding:0!important}.subheader-container .collection{margin:0!important}.top_holder{position:absolute;left:0;top:0;min-height:5px;width:100%;z-index:996}";
      }
      public String getName() {
        return "subheaderCss";
      }
    }
    ;
  }
  private static class subheaderCssInitializer {
    static {
      _instance0.subheaderCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return subheaderCss;
    }
  }
  public com.google.gwt.resources.client.TextResource subheaderCss() {
    return subheaderCssInitializer.get();
  }
  private void subheaderJsInitializer() {
    subheaderJs = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/rafat/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.0-rc5/gwt-material-addins-2.0-rc5.jar!/gwt/material/design/addins/client/subheader/resources/js/subheader.min.js
      public String getText() {
        return "function initSubheader(e,t){jQuery(document).ready(function(){var o=new stickyTitles(e,t);o.load(),$(t).on(\"scroll\",function(){o.scroll()})})}function stickyTitles(e,t){var o=jQuery(e),s=jQuery(t);s.addClass(\"subheader-container\");var r=document.createElement(\"div\");$(r).addClass(\"top_holder\"),s.prepend(r),this.load=function(){o.each(function(){var e=jQuery(this).wrap('<div class=\"followWrap\" />');e.parent().height(e.outerHeight()),jQuery.data(e[0],\"pos\",e.position().top)})},this.scroll=function(){$(r).css(\"top\",s.scrollTop()),$(r).addClass(\"z-depth-1\"),o.each(function(e){var t=jQuery(this),a=(o.eq(e+1),o.eq(e-1)),l=jQuery.data(t[0],\"pos\");0==s.scrollTop()?$(r).hide():$(r).show(),l<=s.scrollTop()?($(r).html(\"\"),t.clone().appendTo($(r))):(t.removeAttr(\"style\").show(),a.length>0&&s.offset().top<=jQuery.data(t[0],\"pos\")-a.outerHeight()&&a.removeClass(\"absolute\").removeAttr(\"style\"))})}}";
      }
      public String getName() {
        return "subheaderJs";
      }
    }
    ;
  }
  private static class subheaderJsInitializer {
    static {
      _instance0.subheaderJsInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return subheaderJs;
    }
  }
  public com.google.gwt.resources.client.TextResource subheaderJs() {
    return subheaderJsInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource subheaderCss;
  private static com.google.gwt.resources.client.TextResource subheaderJs;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      subheaderCss(), 
      subheaderJs(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("subheaderCss", subheaderCss());
        resourceMap.put("subheaderJs", subheaderJs());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'subheaderCss': return this.@gwt.material.design.addins.client.subheader.MaterialSubHeaderClientBundle::subheaderCss()();
      case 'subheaderJs': return this.@gwt.material.design.addins.client.subheader.MaterialSubHeaderClientBundle::subheaderJs()();
    }
    return null;
  }-*/;
}
