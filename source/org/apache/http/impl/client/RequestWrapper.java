package org.apache.http.impl.client;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public class RequestWrapper extends AbstractHttpMessage implements HttpUriRequest {

    /* renamed from: a */
    public final HttpRequest f74175a;

    /* renamed from: b */
    public URI f74176b;

    /* renamed from: c */
    public String f74177c;

    /* renamed from: d */
    public ProtocolVersion f74178d;

    /* renamed from: e */
    public int f74179e;

    public RequestWrapper(HttpRequest httpRequest) throws ProtocolException {
        Args.notNull(httpRequest, "HTTP request");
        this.f74175a = httpRequest;
        setParams(httpRequest.getParams());
        setHeaders(httpRequest.getAllHeaders());
        if (httpRequest instanceof HttpUriRequest) {
            HttpUriRequest httpUriRequest = (HttpUriRequest) httpRequest;
            this.f74176b = httpUriRequest.getURI();
            this.f74177c = httpUriRequest.getMethod();
            this.f74178d = null;
        } else {
            RequestLine requestLine = httpRequest.getRequestLine();
            try {
                this.f74176b = new URI(requestLine.getUri());
                this.f74177c = requestLine.getMethod();
                this.f74178d = httpRequest.getProtocolVersion();
            } catch (URISyntaxException e) {
                throw new ProtocolException("Invalid request URI: " + requestLine.getUri(), e);
            }
        }
        this.f74179e = 0;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public void abort() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public int getExecCount() {
        return this.f74179e;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return this.f74177c;
    }

    public HttpRequest getOriginal() {
        return this.f74175a;
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        if (this.f74178d == null) {
            this.f74178d = HttpProtocolParams.getVersion(getParams());
        }
        return this.f74178d;
    }

    @Override // org.apache.http.HttpRequest
    public RequestLine getRequestLine() {
        String str;
        ProtocolVersion protocolVersion = getProtocolVersion();
        URI uri = this.f74176b;
        if (uri != null) {
            str = uri.toASCIIString();
        } else {
            str = null;
        }
        if (str == null || str.isEmpty()) {
            str = RemoteSettings.FORWARD_SLASH_STRING;
        }
        return new BasicRequestLine(getMethod(), str, protocolVersion);
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public URI getURI() {
        return this.f74176b;
    }

    public void incrementExecCount() {
        this.f74179e++;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public boolean isAborted() {
        return false;
    }

    public boolean isRepeatable() {
        return true;
    }

    public void resetHeaders() {
        this.headergroup.clear();
        setHeaders(this.f74175a.getAllHeaders());
    }

    public void setMethod(String str) {
        Args.notNull(str, "Method name");
        this.f74177c = str;
    }

    public void setProtocolVersion(ProtocolVersion protocolVersion) {
        this.f74178d = protocolVersion;
    }

    public void setURI(URI uri) {
        this.f74176b = uri;
    }
}
