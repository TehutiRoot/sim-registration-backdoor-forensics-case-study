package ch.qos.logback.classic.html;

import ch.qos.logback.core.html.CssBuilder;

/* loaded from: classes.dex */
public class UrlCssBuilder implements CssBuilder {

    /* renamed from: a */
    public String f39541a = "http://logback.qos.ch/css/classic.css";

    @Override // ch.qos.logback.core.html.CssBuilder
    public void addCss(StringBuilder sb) {
        sb.append("<link REL=StyleSheet HREF=\"");
        sb.append(this.f39541a);
        sb.append("\" TITLE=\"Basic\" />");
    }

    public String getUrl() {
        return this.f39541a;
    }

    public void setUrl(String str) {
        this.f39541a = str;
    }
}
