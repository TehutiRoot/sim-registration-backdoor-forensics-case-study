package org.apache.http.protocol;

import java.util.Map;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes6.dex */
public class HttpRequestHandlerRegistry implements HttpRequestHandlerResolver {

    /* renamed from: a */
    public final UriPatternMatcher f74695a = new UriPatternMatcher();

    public Map<String, HttpRequestHandler> getHandlers() {
        return this.f74695a.getObjects();
    }

    @Override // org.apache.http.protocol.HttpRequestHandlerResolver
    public HttpRequestHandler lookup(String str) {
        return (HttpRequestHandler) this.f74695a.lookup(str);
    }

    public void register(String str, HttpRequestHandler httpRequestHandler) {
        Args.notNull(str, "URI request pattern");
        Args.notNull(httpRequestHandler, "Request handler");
        this.f74695a.register(str, httpRequestHandler);
    }

    public void setHandlers(Map<String, HttpRequestHandler> map) {
        this.f74695a.setObjects(map);
    }

    public void unregister(String str) {
        this.f74695a.unregister(str);
    }
}