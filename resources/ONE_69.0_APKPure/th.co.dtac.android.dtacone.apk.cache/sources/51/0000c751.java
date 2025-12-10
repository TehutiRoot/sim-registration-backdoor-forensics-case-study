package p000;

import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.p016v1.NetworkRequestMetric;
import com.google.firebase.perf.util.URLAllowlist;
import com.zxy.tiny.common.UriUtil;
import java.net.URI;

/* renamed from: g20  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20021g20 extends PerfMetricValidator {

    /* renamed from: c */
    public static final AndroidLogger f62060c = AndroidLogger.getInstance();

    /* renamed from: a */
    public final NetworkRequestMetric f62061a;

    /* renamed from: b */
    public final Context f62062b;

    public C20021g20(NetworkRequestMetric networkRequestMetric, Context context) {
        this.f62062b = context;
        this.f62061a = networkRequestMetric;
    }

    /* renamed from: b */
    public final URI m31453b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            f62060c.warn("getResultUrl throws exception %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public final boolean m31452c(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return URLAllowlist.isURLAllowlisted(uri, context);
    }

    /* renamed from: d */
    public final boolean m31451d(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    /* renamed from: e */
    public final boolean m31450e(String str) {
        return m31451d(str);
    }

    /* renamed from: f */
    public final boolean m31449f(String str) {
        if (str != null && !m31451d(str) && str.length() <= 255) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m31448g(NetworkRequestMetric.HttpMethod httpMethod) {
        if (httpMethod != null && httpMethod != NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m31447h(int i) {
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m31446i(long j) {
        if (j >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public boolean isValidPerfMetric() {
        NetworkRequestMetric.HttpMethod httpMethod;
        if (m31450e(this.f62061a.getUrl())) {
            AndroidLogger androidLogger = f62060c;
            androidLogger.warn("URL is missing:" + this.f62061a.getUrl());
            return false;
        }
        URI m31453b = m31453b(this.f62061a.getUrl());
        if (m31453b == null) {
            f62060c.warn("URL cannot be parsed");
            return false;
        } else if (!m31452c(m31453b, this.f62062b)) {
            AndroidLogger androidLogger2 = f62060c;
            androidLogger2.warn("URL fails allowlist rule: " + m31453b);
            return false;
        } else if (!m31449f(m31453b.getHost())) {
            f62060c.warn("URL host is null or invalid");
            return false;
        } else if (!m31444k(m31453b.getScheme())) {
            f62060c.warn("URL scheme is null or invalid");
            return false;
        } else if (!m31442m(m31453b.getUserInfo())) {
            f62060c.warn("URL user info is null");
            return false;
        } else if (!m31445j(m31453b.getPort())) {
            f62060c.warn("URL port is less than or equal to 0");
            return false;
        } else {
            if (this.f62061a.hasHttpMethod()) {
                httpMethod = this.f62061a.getHttpMethod();
            } else {
                httpMethod = null;
            }
            if (!m31448g(httpMethod)) {
                AndroidLogger androidLogger3 = f62060c;
                androidLogger3.warn("HTTP Method is null or invalid: " + this.f62061a.getHttpMethod());
                return false;
            } else if (this.f62061a.hasHttpResponseCode() && !m31447h(this.f62061a.getHttpResponseCode())) {
                AndroidLogger androidLogger4 = f62060c;
                androidLogger4.warn("HTTP ResponseCode is a negative value:" + this.f62061a.getHttpResponseCode());
                return false;
            } else if (this.f62061a.hasRequestPayloadBytes() && !m31446i(this.f62061a.getRequestPayloadBytes())) {
                AndroidLogger androidLogger5 = f62060c;
                androidLogger5.warn("Request Payload is a negative value:" + this.f62061a.getRequestPayloadBytes());
                return false;
            } else if (this.f62061a.hasResponsePayloadBytes() && !m31446i(this.f62061a.getResponsePayloadBytes())) {
                AndroidLogger androidLogger6 = f62060c;
                androidLogger6.warn("Response Payload is a negative value:" + this.f62061a.getResponsePayloadBytes());
                return false;
            } else if (this.f62061a.hasClientStartTimeUs() && this.f62061a.getClientStartTimeUs() > 0) {
                if (this.f62061a.hasTimeToRequestCompletedUs() && !m31443l(this.f62061a.getTimeToRequestCompletedUs())) {
                    AndroidLogger androidLogger7 = f62060c;
                    androidLogger7.warn("Time to complete the request is a negative value:" + this.f62061a.getTimeToRequestCompletedUs());
                    return false;
                } else if (this.f62061a.hasTimeToResponseInitiatedUs() && !m31443l(this.f62061a.getTimeToResponseInitiatedUs())) {
                    AndroidLogger androidLogger8 = f62060c;
                    androidLogger8.warn("Time from the start of the request to the start of the response is null or a negative value:" + this.f62061a.getTimeToResponseInitiatedUs());
                    return false;
                } else if (this.f62061a.hasTimeToResponseCompletedUs() && this.f62061a.getTimeToResponseCompletedUs() > 0) {
                    if (!this.f62061a.hasHttpResponseCode()) {
                        f62060c.warn("Did not receive a HTTP Response Code");
                        return false;
                    }
                    return true;
                } else {
                    AndroidLogger androidLogger9 = f62060c;
                    androidLogger9.warn("Time from the start of the request to the end of the response is null, negative or zero:" + this.f62061a.getTimeToResponseCompletedUs());
                    return false;
                }
            } else {
                AndroidLogger androidLogger10 = f62060c;
                androidLogger10.warn("Start time of the request is null, or zero, or a negative value:" + this.f62061a.getClientStartTimeUs());
                return false;
            }
        }
    }

    /* renamed from: j */
    public final boolean m31445j(int i) {
        if (i != -1 && i <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m31444k(String str) {
        if (str == null) {
            return false;
        }
        if (!"http".equalsIgnoreCase(str) && !UriUtil.HTTPS_SCHEME.equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean m31443l(long j) {
        if (j >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m31442m(String str) {
        if (str == null) {
            return true;
        }
        return false;
    }
}