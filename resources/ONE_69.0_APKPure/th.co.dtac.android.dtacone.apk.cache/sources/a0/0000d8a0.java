package p000;

import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.params.HttpParams;

/* renamed from: k90  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C20734k90 implements CloseableHttpResponse {

    /* renamed from: a */
    public final HttpResponse f67885a;

    /* renamed from: b */
    public final C1189Qw f67886b;

    public C20734k90(HttpResponse httpResponse, C1189Qw c1189Qw) {
        this.f67885a = httpResponse;
        this.f67886b = c1189Qw;
        C17931Jy1.m67774b(httpResponse, c1189Qw);
    }

    @Override // org.apache.http.HttpMessage
    public void addHeader(Header header) {
        this.f67885a.addHeader(header);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C1189Qw c1189Qw = this.f67886b;
        if (c1189Qw != null) {
            c1189Qw.close();
        }
    }

    @Override // org.apache.http.HttpMessage
    public boolean containsHeader(String str) {
        return this.f67885a.containsHeader(str);
    }

    @Override // org.apache.http.HttpMessage
    public Header[] getAllHeaders() {
        return this.f67885a.getAllHeaders();
    }

    @Override // org.apache.http.HttpResponse
    public HttpEntity getEntity() {
        return this.f67885a.getEntity();
    }

    @Override // org.apache.http.HttpMessage
    public Header getFirstHeader(String str) {
        return this.f67885a.getFirstHeader(str);
    }

    @Override // org.apache.http.HttpMessage
    public Header[] getHeaders(String str) {
        return this.f67885a.getHeaders(str);
    }

    @Override // org.apache.http.HttpMessage
    public Header getLastHeader(String str) {
        return this.f67885a.getLastHeader(str);
    }

    @Override // org.apache.http.HttpResponse
    public Locale getLocale() {
        return this.f67885a.getLocale();
    }

    @Override // org.apache.http.HttpMessage
    public HttpParams getParams() {
        return this.f67885a.getParams();
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        return this.f67885a.getProtocolVersion();
    }

    @Override // org.apache.http.HttpResponse
    public StatusLine getStatusLine() {
        return this.f67885a.getStatusLine();
    }

    @Override // org.apache.http.HttpMessage
    public HeaderIterator headerIterator() {
        return this.f67885a.headerIterator();
    }

    @Override // org.apache.http.HttpMessage
    public void removeHeader(Header header) {
        this.f67885a.removeHeader(header);
    }

    @Override // org.apache.http.HttpMessage
    public void removeHeaders(String str) {
        this.f67885a.removeHeaders(str);
    }

    @Override // org.apache.http.HttpResponse
    public void setEntity(HttpEntity httpEntity) {
        this.f67885a.setEntity(httpEntity);
    }

    @Override // org.apache.http.HttpMessage
    public void setHeader(Header header) {
        this.f67885a.setHeader(header);
    }

    @Override // org.apache.http.HttpMessage
    public void setHeaders(Header[] headerArr) {
        this.f67885a.setHeaders(headerArr);
    }

    @Override // org.apache.http.HttpResponse
    public void setLocale(Locale locale) {
        this.f67885a.setLocale(locale);
    }

    @Override // org.apache.http.HttpMessage
    public void setParams(HttpParams httpParams) {
        this.f67885a.setParams(httpParams);
    }

    @Override // org.apache.http.HttpResponse
    public void setReasonPhrase(String str) {
        this.f67885a.setReasonPhrase(str);
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusCode(int i) {
        this.f67885a.setStatusCode(i);
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(StatusLine statusLine) {
        this.f67885a.setStatusLine(statusLine);
    }

    public String toString() {
        return "HttpResponseProxy{" + this.f67885a + '}';
    }

    @Override // org.apache.http.HttpMessage
    public void addHeader(String str, String str2) {
        this.f67885a.addHeader(str, str2);
    }

    @Override // org.apache.http.HttpMessage
    public HeaderIterator headerIterator(String str) {
        return this.f67885a.headerIterator(str);
    }

    @Override // org.apache.http.HttpMessage
    public void setHeader(String str, String str2) {
        this.f67885a.setHeader(str, str2);
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(ProtocolVersion protocolVersion, int i) {
        this.f67885a.setStatusLine(protocolVersion, i);
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        this.f67885a.setStatusLine(protocolVersion, i, str);
    }
}