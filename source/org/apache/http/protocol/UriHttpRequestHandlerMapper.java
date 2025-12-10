package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public class UriHttpRequestHandlerMapper implements HttpRequestHandlerMapper {

    /* renamed from: a */
    public final UriPatternMatcher f74628a;

    public UriHttpRequestHandlerMapper(UriPatternMatcher<HttpRequestHandler> uriPatternMatcher) {
        this.f74628a = (UriPatternMatcher) Args.notNull(uriPatternMatcher, "Pattern matcher");
    }

    public String getRequestPath(HttpRequest httpRequest) {
        String uri = httpRequest.getRequestLine().getUri();
        int indexOf = uri.indexOf(63);
        if (indexOf != -1) {
            return uri.substring(0, indexOf);
        }
        int indexOf2 = uri.indexOf(35);
        if (indexOf2 != -1) {
            return uri.substring(0, indexOf2);
        }
        return uri;
    }

    @Override // org.apache.http.protocol.HttpRequestHandlerMapper
    public HttpRequestHandler lookup(HttpRequest httpRequest) {
        Args.notNull(httpRequest, "HTTP request");
        return (HttpRequestHandler) this.f74628a.lookup(getRequestPath(httpRequest));
    }

    public void register(String str, HttpRequestHandler httpRequestHandler) {
        Args.notNull(str, "Pattern");
        Args.notNull(httpRequestHandler, "Handler");
        this.f74628a.register(str, httpRequestHandler);
    }

    public void unregister(String str) {
        this.f74628a.unregister(str);
    }

    public UriHttpRequestHandlerMapper() {
        this(new UriPatternMatcher());
    }
}
