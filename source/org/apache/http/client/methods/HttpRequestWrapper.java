package org.apache.http.client.methods;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URI;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public class HttpRequestWrapper extends AbstractHttpMessage implements HttpUriRequest {

    /* renamed from: a */
    public final HttpRequest f73703a;

    /* renamed from: b */
    public final HttpHost f73704b;

    /* renamed from: c */
    public final String f73705c;

    /* renamed from: d */
    public RequestLine f73706d;

    /* renamed from: e */
    public ProtocolVersion f73707e;

    /* renamed from: f */
    public URI f73708f;

    /* renamed from: org.apache.http.client.methods.HttpRequestWrapper$b */
    /* loaded from: classes6.dex */
    public static class C12562b extends HttpRequestWrapper implements HttpEntityEnclosingRequest {

        /* renamed from: g */
        public HttpEntity f73709g;

        public C12562b(HttpEntityEnclosingRequest httpEntityEnclosingRequest, HttpHost httpHost) {
            super(httpEntityEnclosingRequest, httpHost);
            this.f73709g = httpEntityEnclosingRequest.getEntity();
        }

        @Override // org.apache.http.HttpEntityEnclosingRequest
        public boolean expectContinue() {
            Header firstHeader = getFirstHeader("Expect");
            if (firstHeader != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(firstHeader.getValue())) {
                return true;
            }
            return false;
        }

        @Override // org.apache.http.HttpEntityEnclosingRequest
        public HttpEntity getEntity() {
            return this.f73709g;
        }

        @Override // org.apache.http.HttpEntityEnclosingRequest
        public void setEntity(HttpEntity httpEntity) {
            this.f73709g = httpEntity;
        }
    }

    public static HttpRequestWrapper wrap(HttpRequest httpRequest) {
        return wrap(httpRequest, null);
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public void abort() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return this.f73705c;
    }

    public HttpRequest getOriginal() {
        return this.f73703a;
    }

    @Override // org.apache.http.message.AbstractHttpMessage, org.apache.http.HttpMessage
    @Deprecated
    public HttpParams getParams() {
        if (this.params == null) {
            this.params = this.f73703a.getParams().copy();
        }
        return this.params;
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        ProtocolVersion protocolVersion = this.f73707e;
        if (protocolVersion == null) {
            return this.f73703a.getProtocolVersion();
        }
        return protocolVersion;
    }

    @Override // org.apache.http.HttpRequest
    public RequestLine getRequestLine() {
        String uri;
        if (this.f73706d == null) {
            URI uri2 = this.f73708f;
            if (uri2 != null) {
                uri = uri2.toASCIIString();
            } else {
                uri = this.f73703a.getRequestLine().getUri();
            }
            if (uri == null || uri.isEmpty()) {
                uri = RemoteSettings.FORWARD_SLASH_STRING;
            }
            this.f73706d = new BasicRequestLine(this.f73705c, uri, getProtocolVersion());
        }
        return this.f73706d;
    }

    public HttpHost getTarget() {
        return this.f73704b;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public URI getURI() {
        return this.f73708f;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public boolean isAborted() {
        return false;
    }

    public void setProtocolVersion(ProtocolVersion protocolVersion) {
        this.f73707e = protocolVersion;
        this.f73706d = null;
    }

    public void setURI(URI uri) {
        this.f73708f = uri;
        this.f73706d = null;
    }

    public String toString() {
        return getRequestLine() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.headergroup;
    }

    public HttpRequestWrapper(HttpRequest httpRequest, HttpHost httpHost) {
        HttpRequest httpRequest2 = (HttpRequest) Args.notNull(httpRequest, "HTTP request");
        this.f73703a = httpRequest2;
        this.f73704b = httpHost;
        this.f73707e = httpRequest2.getRequestLine().getProtocolVersion();
        this.f73705c = httpRequest2.getRequestLine().getMethod();
        if (httpRequest instanceof HttpUriRequest) {
            this.f73708f = ((HttpUriRequest) httpRequest).getURI();
        } else {
            this.f73708f = null;
        }
        setHeaders(httpRequest.getAllHeaders());
    }

    public static HttpRequestWrapper wrap(HttpRequest httpRequest, HttpHost httpHost) {
        Args.notNull(httpRequest, "HTTP request");
        return httpRequest instanceof HttpEntityEnclosingRequest ? new C12562b((HttpEntityEnclosingRequest) httpRequest, httpHost) : new HttpRequestWrapper(httpRequest, httpHost);
    }
}
