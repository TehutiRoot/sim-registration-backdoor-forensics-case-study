package io.opencensus.contrib.http.util;

import io.opencensus.trace.Status;
import javax.annotation.Nullable;
import org.apache.http.HttpStatus;

/* loaded from: classes5.dex */
public final class HttpTraceUtil {

    /* renamed from: a */
    public static final Status f63493a;

    /* renamed from: b */
    public static final Status f63494b;

    /* renamed from: c */
    public static final Status f63495c;

    /* renamed from: d */
    public static final Status f63496d;

    /* renamed from: e */
    public static final Status f63497e;

    /* renamed from: f */
    public static final Status f63498f;

    /* renamed from: g */
    public static final Status f63499g;

    /* renamed from: h */
    public static final Status f63500h;

    /* renamed from: i */
    public static final Status f63501i;

    /* renamed from: j */
    public static final Status f63502j;

    /* renamed from: k */
    public static final Status f63503k;

    /* renamed from: l */
    public static final Status f63504l;

    /* renamed from: m */
    public static final Status f63505m;

    /* renamed from: n */
    public static final Status f63506n;

    /* renamed from: o */
    public static final Status f63507o;

    /* renamed from: p */
    public static final Status f63508p;

    /* renamed from: q */
    public static final Status f63509q;

    /* renamed from: r */
    public static final Status f63510r;

    /* renamed from: s */
    public static final Status f63511s;

    static {
        Status status = Status.UNKNOWN;
        f63493a = status.withDescription("Continue");
        f63494b = status.withDescription("Switching Protocols");
        f63495c = status.withDescription("Payment Required");
        f63496d = status.withDescription("Method Not Allowed");
        f63497e = status.withDescription("Not Acceptable");
        f63498f = status.withDescription("Proxy Authentication Required");
        f63499g = status.withDescription("Request Time-out");
        f63500h = status.withDescription("Conflict");
        f63501i = status.withDescription("Gone");
        f63502j = status.withDescription("Length Required");
        f63503k = status.withDescription("Precondition Failed");
        f63504l = status.withDescription("Request Entity Too Large");
        f63505m = status.withDescription("Request-URI Too Large");
        f63506n = status.withDescription("Unsupported Media Type");
        f63507o = status.withDescription("Requested range not satisfiable");
        f63508p = status.withDescription("Expectation Failed");
        f63509q = status.withDescription("Internal Server Error");
        f63510r = status.withDescription("Bad Gateway");
        f63511s = status.withDescription("HTTP Version not supported");
    }

    public static final Status parseResponseStatus(int i, @Nullable Throwable th2) {
        String str;
        if (th2 != null) {
            str = th2.getMessage();
            if (str == null) {
                str = th2.getClass().getSimpleName();
            }
        } else {
            str = null;
        }
        if (i == 0) {
            return Status.UNKNOWN.withDescription(str);
        }
        if (i >= 200 && i < 400) {
            return Status.f63681OK;
        }
        if (i != 100) {
            if (i != 101) {
                if (i != 429) {
                    switch (i) {
                        case 400:
                            return Status.INVALID_ARGUMENT.withDescription(str);
                        case 401:
                            return Status.UNAUTHENTICATED.withDescription(str);
                        case 402:
                            return f63495c;
                        case 403:
                            return Status.PERMISSION_DENIED.withDescription(str);
                        case 404:
                            return Status.NOT_FOUND.withDescription(str);
                        case 405:
                            return f63496d;
                        case 406:
                            return f63497e;
                        case HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED /* 407 */:
                            return f63498f;
                        case HttpStatus.SC_REQUEST_TIMEOUT /* 408 */:
                            return f63499g;
                        case 409:
                            return f63500h;
                        case 410:
                            return f63501i;
                        case 411:
                            return f63502j;
                        case 412:
                            return f63503k;
                        case 413:
                            return f63504l;
                        case 414:
                            return f63505m;
                        case 415:
                            return f63506n;
                        case 416:
                            return f63507o;
                        case HttpStatus.SC_EXPECTATION_FAILED /* 417 */:
                            return f63508p;
                        default:
                            switch (i) {
                                case 500:
                                    return f63509q;
                                case 501:
                                    return Status.UNIMPLEMENTED.withDescription(str);
                                case 502:
                                    return f63510r;
                                case 503:
                                    return Status.UNAVAILABLE.withDescription(str);
                                case 504:
                                    return Status.DEADLINE_EXCEEDED.withDescription(str);
                                case 505:
                                    return f63511s;
                                default:
                                    return Status.UNKNOWN.withDescription(str);
                            }
                    }
                }
                return Status.RESOURCE_EXHAUSTED.withDescription(str);
            }
            return f63494b;
        }
        return f63493a;
    }
}
