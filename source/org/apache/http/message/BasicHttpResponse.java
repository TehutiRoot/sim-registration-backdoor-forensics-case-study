package org.apache.http.message;

import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

/* loaded from: classes6.dex */
public class BasicHttpResponse extends AbstractHttpMessage implements HttpResponse {

    /* renamed from: a */
    public StatusLine f74547a;

    /* renamed from: b */
    public ProtocolVersion f74548b;

    /* renamed from: c */
    public int f74549c;

    /* renamed from: d */
    public String f74550d;

    /* renamed from: e */
    public HttpEntity f74551e;

    /* renamed from: f */
    public final ReasonPhraseCatalog f74552f;

    /* renamed from: g */
    public Locale f74553g;

    public BasicHttpResponse(StatusLine statusLine, ReasonPhraseCatalog reasonPhraseCatalog, Locale locale) {
        this.f74547a = (StatusLine) Args.notNull(statusLine, "Status line");
        this.f74548b = statusLine.getProtocolVersion();
        this.f74549c = statusLine.getStatusCode();
        this.f74550d = statusLine.getReasonPhrase();
        this.f74552f = reasonPhraseCatalog;
        this.f74553g = locale;
    }

    @Override // org.apache.http.HttpResponse
    public HttpEntity getEntity() {
        return this.f74551e;
    }

    @Override // org.apache.http.HttpResponse
    public Locale getLocale() {
        return this.f74553g;
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        return this.f74548b;
    }

    public String getReason(int i) {
        ReasonPhraseCatalog reasonPhraseCatalog = this.f74552f;
        if (reasonPhraseCatalog != null) {
            Locale locale = this.f74553g;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            return reasonPhraseCatalog.getReason(i, locale);
        }
        return null;
    }

    @Override // org.apache.http.HttpResponse
    public StatusLine getStatusLine() {
        if (this.f74547a == null) {
            ProtocolVersion protocolVersion = this.f74548b;
            if (protocolVersion == null) {
                protocolVersion = HttpVersion.HTTP_1_1;
            }
            int i = this.f74549c;
            String str = this.f74550d;
            if (str == null) {
                str = getReason(i);
            }
            this.f74547a = new BasicStatusLine(protocolVersion, i, str);
        }
        return this.f74547a;
    }

    @Override // org.apache.http.HttpResponse
    public void setEntity(HttpEntity httpEntity) {
        this.f74551e = httpEntity;
    }

    @Override // org.apache.http.HttpResponse
    public void setLocale(Locale locale) {
        this.f74553g = (Locale) Args.notNull(locale, "Locale");
        this.f74547a = null;
    }

    @Override // org.apache.http.HttpResponse
    public void setReasonPhrase(String str) {
        this.f74547a = null;
        if (TextUtils.isBlank(str)) {
            str = null;
        }
        this.f74550d = str;
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusCode(int i) {
        Args.notNegative(i, "Status code");
        this.f74547a = null;
        this.f74549c = i;
        this.f74550d = null;
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(StatusLine statusLine) {
        this.f74547a = (StatusLine) Args.notNull(statusLine, "Status line");
        this.f74548b = statusLine.getProtocolVersion();
        this.f74549c = statusLine.getStatusCode();
        this.f74550d = statusLine.getReasonPhrase();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getStatusLine());
        sb.append(TokenParser.f74560SP);
        sb.append(this.headergroup);
        if (this.f74551e != null) {
            sb.append(TokenParser.f74560SP);
            sb.append(this.f74551e);
        }
        return sb.toString();
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(ProtocolVersion protocolVersion, int i) {
        Args.notNegative(i, "Status code");
        this.f74547a = null;
        this.f74548b = protocolVersion;
        this.f74549c = i;
        this.f74550d = null;
    }

    public BasicHttpResponse(StatusLine statusLine) {
        this.f74547a = (StatusLine) Args.notNull(statusLine, "Status line");
        this.f74548b = statusLine.getProtocolVersion();
        this.f74549c = statusLine.getStatusCode();
        this.f74550d = statusLine.getReasonPhrase();
        this.f74552f = null;
        this.f74553g = null;
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        Args.notNegative(i, "Status code");
        this.f74547a = null;
        this.f74548b = protocolVersion;
        this.f74549c = i;
        this.f74550d = str;
    }

    public BasicHttpResponse(ProtocolVersion protocolVersion, int i, String str) {
        Args.notNegative(i, "Status code");
        this.f74547a = null;
        this.f74548b = protocolVersion;
        this.f74549c = i;
        this.f74550d = str;
        this.f74552f = null;
        this.f74553g = null;
    }
}
