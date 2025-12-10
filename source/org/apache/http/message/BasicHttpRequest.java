package org.apache.http.message;

import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public class BasicHttpRequest extends AbstractHttpMessage implements HttpRequest {

    /* renamed from: a */
    public final String f74544a;

    /* renamed from: b */
    public final String f74545b;

    /* renamed from: c */
    public RequestLine f74546c;

    public BasicHttpRequest(String str, String str2) {
        this.f74544a = (String) Args.notNull(str, "Method name");
        this.f74545b = (String) Args.notNull(str2, "Request URI");
        this.f74546c = null;
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        return getRequestLine().getProtocolVersion();
    }

    @Override // org.apache.http.HttpRequest
    public RequestLine getRequestLine() {
        if (this.f74546c == null) {
            this.f74546c = new BasicRequestLine(this.f74544a, this.f74545b, HttpVersion.HTTP_1_1);
        }
        return this.f74546c;
    }

    public String toString() {
        return this.f74544a + TokenParser.f74560SP + this.f74545b + TokenParser.f74560SP + this.headergroup;
    }

    public BasicHttpRequest(String str, String str2, ProtocolVersion protocolVersion) {
        this(new BasicRequestLine(str, str2, protocolVersion));
    }

    public BasicHttpRequest(RequestLine requestLine) {
        this.f74546c = (RequestLine) Args.notNull(requestLine, "Request line");
        this.f74544a = requestLine.getMethod();
        this.f74545b = requestLine.getUri();
    }
}
