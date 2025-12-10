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

/* renamed from: e90  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19646e90 implements CloseableHttpResponse {

    /* renamed from: a */
    public final HttpResponse f61422a;

    /* renamed from: b */
    public final C1210Qw f61423b;

    public C19646e90(HttpResponse httpResponse, C1210Qw c1210Qw) {
        this.f61422a = httpResponse;
        this.f61423b = c1210Qw;
        C18088Mx1.m67259b(httpResponse, c1210Qw);
    }

    @Override // org.apache.http.HttpMessage
    public void addHeader(Header header) {
        this.f61422a.addHeader(header);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C1210Qw c1210Qw = this.f61423b;
        if (c1210Qw != null) {
            c1210Qw.close();
        }
    }

    @Override // org.apache.http.HttpMessage
    public boolean containsHeader(String str) {
        return this.f61422a.containsHeader(str);
    }

    @Override // org.apache.http.HttpMessage
    public Header[] getAllHeaders() {
        return this.f61422a.getAllHeaders();
    }

    @Override // org.apache.http.HttpResponse
    public HttpEntity getEntity() {
        return this.f61422a.getEntity();
    }

    @Override // org.apache.http.HttpMessage
    public Header getFirstHeader(String str) {
        return this.f61422a.getFirstHeader(str);
    }

    @Override // org.apache.http.HttpMessage
    public Header[] getHeaders(String str) {
        return this.f61422a.getHeaders(str);
    }

    @Override // org.apache.http.HttpMessage
    public Header getLastHeader(String str) {
        return this.f61422a.getLastHeader(str);
    }

    @Override // org.apache.http.HttpResponse
    public Locale getLocale() {
        return this.f61422a.getLocale();
    }

    @Override // org.apache.http.HttpMessage
    public HttpParams getParams() {
        return this.f61422a.getParams();
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        return this.f61422a.getProtocolVersion();
    }

    @Override // org.apache.http.HttpResponse
    public StatusLine getStatusLine() {
        return this.f61422a.getStatusLine();
    }

    @Override // org.apache.http.HttpMessage
    public HeaderIterator headerIterator() {
        return this.f61422a.headerIterator();
    }

    @Override // org.apache.http.HttpMessage
    public void removeHeader(Header header) {
        this.f61422a.removeHeader(header);
    }

    @Override // org.apache.http.HttpMessage
    public void removeHeaders(String str) {
        this.f61422a.removeHeaders(str);
    }

    @Override // org.apache.http.HttpResponse
    public void setEntity(HttpEntity httpEntity) {
        this.f61422a.setEntity(httpEntity);
    }

    @Override // org.apache.http.HttpMessage
    public void setHeader(Header header) {
        this.f61422a.setHeader(header);
    }

    @Override // org.apache.http.HttpMessage
    public void setHeaders(Header[] headerArr) {
        this.f61422a.setHeaders(headerArr);
    }

    @Override // org.apache.http.HttpResponse
    public void setLocale(Locale locale) {
        this.f61422a.setLocale(locale);
    }

    @Override // org.apache.http.HttpMessage
    public void setParams(HttpParams httpParams) {
        this.f61422a.setParams(httpParams);
    }

    @Override // org.apache.http.HttpResponse
    public void setReasonPhrase(String str) {
        this.f61422a.setReasonPhrase(str);
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusCode(int i) {
        this.f61422a.setStatusCode(i);
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(StatusLine statusLine) {
        this.f61422a.setStatusLine(statusLine);
    }

    public String toString() {
        return "HttpResponseProxy{" + this.f61422a + '}';
    }

    @Override // org.apache.http.HttpMessage
    public void addHeader(String str, String str2) {
        this.f61422a.addHeader(str, str2);
    }

    @Override // org.apache.http.HttpMessage
    public HeaderIterator headerIterator(String str) {
        return this.f61422a.headerIterator(str);
    }

    @Override // org.apache.http.HttpMessage
    public void setHeader(String str, String str2) {
        this.f61422a.setHeader(str, str2);
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(ProtocolVersion protocolVersion, int i) {
        this.f61422a.setStatusLine(protocolVersion, i);
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        this.f61422a.setStatusLine(protocolVersion, i, str);
    }
}
