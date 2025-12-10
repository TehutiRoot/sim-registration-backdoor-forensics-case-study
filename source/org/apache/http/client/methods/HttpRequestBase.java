package org.apache.http.client.methods;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URI;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpProtocolParams;

/* loaded from: classes6.dex */
public abstract class HttpRequestBase extends AbstractExecutionAwareRequest implements HttpUriRequest, Configurable {

    /* renamed from: b */
    public ProtocolVersion f73700b;

    /* renamed from: c */
    public URI f73701c;

    /* renamed from: d */
    public RequestConfig f73702d;

    @Override // org.apache.http.client.methods.Configurable
    public RequestConfig getConfig() {
        return this.f73702d;
    }

    public abstract String getMethod();

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        ProtocolVersion protocolVersion = this.f73700b;
        if (protocolVersion == null) {
            return HttpProtocolParams.getVersion(getParams());
        }
        return protocolVersion;
    }

    @Override // org.apache.http.HttpRequest
    public RequestLine getRequestLine() {
        String str;
        String method = getMethod();
        ProtocolVersion protocolVersion = getProtocolVersion();
        URI uri = getURI();
        if (uri != null) {
            str = uri.toASCIIString();
        } else {
            str = null;
        }
        if (str == null || str.isEmpty()) {
            str = RemoteSettings.FORWARD_SLASH_STRING;
        }
        return new BasicRequestLine(method, str, protocolVersion);
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public URI getURI() {
        return this.f73701c;
    }

    public void releaseConnection() {
        reset();
    }

    public void setConfig(RequestConfig requestConfig) {
        this.f73702d = requestConfig;
    }

    public void setProtocolVersion(ProtocolVersion protocolVersion) {
        this.f73700b = protocolVersion;
    }

    public void setURI(URI uri) {
        this.f73701c = uri;
    }

    public void started() {
    }

    public String toString() {
        return getMethod() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + getURI() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + getProtocolVersion();
    }
}
