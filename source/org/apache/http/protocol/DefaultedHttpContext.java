package org.apache.http.protocol;

import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public final class DefaultedHttpContext implements HttpContext {

    /* renamed from: a */
    public final HttpContext f74598a;

    /* renamed from: b */
    public final HttpContext f74599b;

    public DefaultedHttpContext(HttpContext httpContext, HttpContext httpContext2) {
        this.f74598a = (HttpContext) Args.notNull(httpContext, "HTTP context");
        this.f74599b = httpContext2;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        Object attribute = this.f74598a.getAttribute(str);
        if (attribute == null) {
            return this.f74599b.getAttribute(str);
        }
        return attribute;
    }

    public HttpContext getDefaults() {
        return this.f74599b;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        return this.f74598a.removeAttribute(str);
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        this.f74598a.setAttribute(str, obj);
    }

    public String toString() {
        return "[local: " + this.f74598a + "defaults: " + this.f74599b + "]";
    }
}
