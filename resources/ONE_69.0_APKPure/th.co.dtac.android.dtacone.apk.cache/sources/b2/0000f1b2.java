package org.apache.http.impl;

import java.util.Locale;
import org.apache.http.HttpStatus;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class EnglishReasonPhraseCatalog implements ReasonPhraseCatalog {
    public static final EnglishReasonPhraseCatalog INSTANCE = new EnglishReasonPhraseCatalog();

    /* renamed from: a */
    public static final String[][] f74004a = {null, new String[3], new String[8], new String[8], new String[30], new String[8]};

    static {
        m24956a(200, "OK");
        m24956a(201, "Created");
        m24956a(202, "Accepted");
        m24956a(204, "No Content");
        m24956a(301, "Moved Permanently");
        m24956a(302, "Moved Temporarily");
        m24956a(304, "Not Modified");
        m24956a(400, "Bad Request");
        m24956a(401, "Unauthorized");
        m24956a(403, "Forbidden");
        m24956a(404, "Not Found");
        m24956a(HttpStatus.SC_TOO_MANY_REQUESTS, "Too Many Requests");
        m24956a(500, "Internal Server Error");
        m24956a(501, "Not Implemented");
        m24956a(502, "Bad Gateway");
        m24956a(503, "Service Unavailable");
        m24956a(100, "Continue");
        m24956a(307, "Temporary Redirect");
        m24956a(405, "Method Not Allowed");
        m24956a(409, "Conflict");
        m24956a(412, "Precondition Failed");
        m24956a(413, "Request Too Long");
        m24956a(414, "Request-URI Too Long");
        m24956a(415, "Unsupported Media Type");
        m24956a(300, "Multiple Choices");
        m24956a(303, "See Other");
        m24956a(305, "Use Proxy");
        m24956a(402, "Payment Required");
        m24956a(406, "Not Acceptable");
        m24956a(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, "Proxy Authentication Required");
        m24956a(HttpStatus.SC_REQUEST_TIMEOUT, "Request Timeout");
        m24956a(101, "Switching Protocols");
        m24956a(203, "Non Authoritative Information");
        m24956a(205, "Reset Content");
        m24956a(206, "Partial Content");
        m24956a(504, "Gateway Timeout");
        m24956a(505, "Http Version Not Supported");
        m24956a(410, "Gone");
        m24956a(411, "Length Required");
        m24956a(416, "Requested Range Not Satisfiable");
        m24956a(HttpStatus.SC_EXPECTATION_FAILED, "Expectation Failed");
        m24956a(102, "Processing");
        m24956a(207, "Multi-Status");
        m24956a(422, "Unprocessable Entity");
        m24956a(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, "Insufficient Space On Resource");
        m24956a(420, "Method Failure");
        m24956a(423, "Locked");
        m24956a(507, "Insufficient Storage");
        m24956a(424, "Failed Dependency");
    }

    /* renamed from: a */
    public static void m24956a(int i, String str) {
        int i2 = i / 100;
        f74004a[i2][i - (i2 * 100)] = str;
    }

    @Override // org.apache.http.ReasonPhraseCatalog
    public String getReason(int i, Locale locale) {
        boolean z;
        if (i >= 100 && i < 600) {
            z = true;
        } else {
            z = false;
        }
        Args.check(z, "Unknown category for status code " + i);
        int i2 = i / 100;
        int i3 = i - (i2 * 100);
        String[] strArr = f74004a[i2];
        if (strArr.length > i3) {
            return strArr[i3];
        }
        return null;
    }
}