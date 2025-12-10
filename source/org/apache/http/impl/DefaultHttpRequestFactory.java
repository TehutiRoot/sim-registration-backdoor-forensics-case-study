package org.apache.http.impl;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.RequestLine;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class DefaultHttpRequestFactory implements HttpRequestFactory {
    public static final DefaultHttpRequestFactory INSTANCE = new DefaultHttpRequestFactory();

    /* renamed from: a */
    public static final String[] f73916a = {"GET"};

    /* renamed from: b */
    public static final String[] f73917b = {"POST", "PUT"};

    /* renamed from: c */
    public static final String[] f73918c = {"HEAD", "OPTIONS", "DELETE", "TRACE", "CONNECT"};

    /* renamed from: d */
    public static final String[] f73919d = {"PATCH"};

    /* renamed from: a */
    public static boolean m24767a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.http.HttpRequestFactory
    public HttpRequest newHttpRequest(RequestLine requestLine) throws MethodNotSupportedException {
        Args.notNull(requestLine, "Request line");
        String method = requestLine.getMethod();
        if (m24767a(f73916a, method)) {
            return new BasicHttpRequest(requestLine);
        }
        if (m24767a(f73917b, method)) {
            return new BasicHttpEntityEnclosingRequest(requestLine);
        }
        if (m24767a(f73918c, method)) {
            return new BasicHttpRequest(requestLine);
        }
        if (m24767a(f73919d, method)) {
            return new BasicHttpEntityEnclosingRequest(requestLine);
        }
        throw new MethodNotSupportedException(method + " method not supported");
    }

    @Override // org.apache.http.HttpRequestFactory
    public HttpRequest newHttpRequest(String str, String str2) throws MethodNotSupportedException {
        if (m24767a(f73916a, str)) {
            return new BasicHttpRequest(str, str2);
        }
        if (m24767a(f73917b, str)) {
            return new BasicHttpEntityEnclosingRequest(str, str2);
        }
        if (m24767a(f73918c, str)) {
            return new BasicHttpRequest(str, str2);
        }
        if (m24767a(f73919d, str)) {
            return new BasicHttpEntityEnclosingRequest(str, str2);
        }
        throw new MethodNotSupportedException(str + " method not supported");
    }
}
