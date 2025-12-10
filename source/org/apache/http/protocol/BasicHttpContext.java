package org.apache.http.protocol;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes6.dex */
public class BasicHttpContext implements HttpContext {

    /* renamed from: a */
    public final HttpContext f74596a;

    /* renamed from: b */
    public final Map f74597b;

    public BasicHttpContext() {
        this(null);
    }

    public void clear() {
        this.f74597b.clear();
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        HttpContext httpContext;
        Args.notNull(str, "Id");
        Object obj = this.f74597b.get(str);
        if (obj == null && (httpContext = this.f74596a) != null) {
            return httpContext.getAttribute(str);
        }
        return obj;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        Args.notNull(str, "Id");
        return this.f74597b.remove(str);
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        Args.notNull(str, "Id");
        if (obj != null) {
            this.f74597b.put(str, obj);
        } else {
            this.f74597b.remove(str);
        }
    }

    public String toString() {
        return this.f74597b.toString();
    }

    public BasicHttpContext(HttpContext httpContext) {
        this.f74597b = new ConcurrentHashMap();
        this.f74596a = httpContext;
    }
}
