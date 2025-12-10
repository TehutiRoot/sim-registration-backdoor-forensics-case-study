package io.opencensus.contrib.http.util;

import io.opencensus.trace.Status;
import javax.annotation.Nullable;
import org.apache.http.HttpStatus;

/* loaded from: classes5.dex */
public final class HttpTraceUtil {

    /* renamed from: a */
    public static final Status f63556a;

    /* renamed from: b */
    public static final Status f63557b;

    /* renamed from: c */
    public static final Status f63558c;

    /* renamed from: d */
    public static final Status f63559d;

    /* renamed from: e */
    public static final Status f63560e;

    /* renamed from: f */
    public static final Status f63561f;

    /* renamed from: g */
    public static final Status f63562g;

    /* renamed from: h */
    public static final Status f63563h;

    /* renamed from: i */
    public static final Status f63564i;

    /* renamed from: j */
    public static final Status f63565j;

    /* renamed from: k */
    public static final Status f63566k;

    /* renamed from: l */
    public static final Status f63567l;

    /* renamed from: m */
    public static final Status f63568m;

    /* renamed from: n */
    public static final Status f63569n;

    /* renamed from: o */
    public static final Status f63570o;

    /* renamed from: p */
    public static final Status f63571p;

    /* renamed from: q */
    public static final Status f63572q;

    /* renamed from: r */
    public static final Status f63573r;

    /* renamed from: s */
    public static final Status f63574s;

    static {
        Status status = Status.UNKNOWN;
        f63556a = status.withDescription("Continue");
        f63557b = status.withDescription("Switching Protocols");
        f63558c = status.withDescription("Payment Required");
        f63559d = status.withDescription("Method Not Allowed");
        f63560e = status.withDescription("Not Acceptable");
        f63561f = status.withDescription("Proxy Authentication Required");
        f63562g = status.withDescription("Request Time-out");
        f63563h = status.withDescription("Conflict");
        f63564i = status.withDescription("Gone");
        f63565j = status.withDescription("Length Required");
        f63566k = status.withDescription("Precondition Failed");
        f63567l = status.withDescription("Request Entity Too Large");
        f63568m = status.withDescription("Request-URI Too Large");
        f63569n = status.withDescription("Unsupported Media Type");
        f63570o = status.withDescription("Requested range not satisfiable");
        f63571p = status.withDescription("Expectation Failed");
        f63572q = status.withDescription("Internal Server Error");
        f63573r = status.withDescription("Bad Gateway");
        f63574s = status.withDescription("HTTP Version not supported");
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
            return Status.f63744OK;
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
                            return f63558c;
                        case 403:
                            return Status.PERMISSION_DENIED.withDescription(str);
                        case 404:
                            return Status.NOT_FOUND.withDescription(str);
                        case 405:
                            return f63559d;
                        case 406:
                            return f63560e;
                        case HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED /* 407 */:
                            return f63561f;
                        case HttpStatus.SC_REQUEST_TIMEOUT /* 408 */:
                            return f63562g;
                        case 409:
                            return f63563h;
                        case 410:
                            return f63564i;
                        case 411:
                            return f63565j;
                        case 412:
                            return f63566k;
                        case 413:
                            return f63567l;
                        case 414:
                            return f63568m;
                        case 415:
                            return f63569n;
                        case 416:
                            return f63570o;
                        case HttpStatus.SC_EXPECTATION_FAILED /* 417 */:
                            return f63571p;
                        default:
                            switch (i) {
                                case 500:
                                    return f63572q;
                                case 501:
                                    return Status.UNIMPLEMENTED.withDescription(str);
                                case 502:
                                    return f63573r;
                                case 503:
                                    return Status.UNAVAILABLE.withDescription(str);
                                case 504:
                                    return Status.DEADLINE_EXCEEDED.withDescription(str);
                                case 505:
                                    return f63574s;
                                default:
                                    return Status.UNKNOWN.withDescription(str);
                            }
                    }
                }
                return Status.RESOURCE_EXHAUSTED.withDescription(str);
            }
            return f63557b;
        }
        return f63556a;
    }
}