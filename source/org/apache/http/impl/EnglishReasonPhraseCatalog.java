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
    public static final String[][] f73920a = {null, new String[3], new String[8], new String[8], new String[30], new String[8]};

    static {
        m24766a(200, "OK");
        m24766a(201, "Created");
        m24766a(202, "Accepted");
        m24766a(204, "No Content");
        m24766a(301, "Moved Permanently");
        m24766a(302, "Moved Temporarily");
        m24766a(304, "Not Modified");
        m24766a(400, "Bad Request");
        m24766a(401, "Unauthorized");
        m24766a(403, "Forbidden");
        m24766a(404, "Not Found");
        m24766a(HttpStatus.SC_TOO_MANY_REQUESTS, "Too Many Requests");
        m24766a(500, "Internal Server Error");
        m24766a(501, "Not Implemented");
        m24766a(502, "Bad Gateway");
        m24766a(503, "Service Unavailable");
        m24766a(100, "Continue");
        m24766a(307, "Temporary Redirect");
        m24766a(405, "Method Not Allowed");
        m24766a(409, "Conflict");
        m24766a(412, "Precondition Failed");
        m24766a(413, "Request Too Long");
        m24766a(414, "Request-URI Too Long");
        m24766a(415, "Unsupported Media Type");
        m24766a(300, "Multiple Choices");
        m24766a(303, "See Other");
        m24766a(305, "Use Proxy");
        m24766a(402, "Payment Required");
        m24766a(406, "Not Acceptable");
        m24766a(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, "Proxy Authentication Required");
        m24766a(HttpStatus.SC_REQUEST_TIMEOUT, "Request Timeout");
        m24766a(101, "Switching Protocols");
        m24766a(203, "Non Authoritative Information");
        m24766a(205, "Reset Content");
        m24766a(206, "Partial Content");
        m24766a(504, "Gateway Timeout");
        m24766a(505, "Http Version Not Supported");
        m24766a(410, "Gone");
        m24766a(411, "Length Required");
        m24766a(416, "Requested Range Not Satisfiable");
        m24766a(HttpStatus.SC_EXPECTATION_FAILED, "Expectation Failed");
        m24766a(102, "Processing");
        m24766a(207, "Multi-Status");
        m24766a(422, "Unprocessable Entity");
        m24766a(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, "Insufficient Space On Resource");
        m24766a(420, "Method Failure");
        m24766a(423, "Locked");
        m24766a(507, "Insufficient Storage");
        m24766a(424, "Failed Dependency");
    }

    /* renamed from: a */
    public static void m24766a(int i, String str) {
        int i2 = i / 100;
        f73920a[i2][i - (i2 * 100)] = str;
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
        String[] strArr = f73920a[i2];
        if (strArr.length > i3) {
            return strArr[i3];
        }
        return null;
    }
}
