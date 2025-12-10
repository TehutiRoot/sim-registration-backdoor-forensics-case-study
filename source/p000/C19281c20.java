package p000;

import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.p016v1.NetworkRequestMetric;
import com.google.firebase.perf.util.URLAllowlist;
import com.zxy.tiny.common.UriUtil;
import java.net.URI;

/* renamed from: c20  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19281c20 extends PerfMetricValidator {

    /* renamed from: c */
    public static final AndroidLogger f39313c = AndroidLogger.getInstance();

    /* renamed from: a */
    public final NetworkRequestMetric f39314a;

    /* renamed from: b */
    public final Context f39315b;

    public C19281c20(NetworkRequestMetric networkRequestMetric, Context context) {
        this.f39315b = context;
        this.f39314a = networkRequestMetric;
    }

    /* renamed from: b */
    public final URI m51730b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            f39313c.warn("getResultUrl throws exception %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public final boolean m51729c(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return URLAllowlist.isURLAllowlisted(uri, context);
    }

    /* renamed from: d */
    public final boolean m51728d(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    /* renamed from: e */
    public final boolean m51727e(String str) {
        return m51728d(str);
    }

    /* renamed from: f */
    public final boolean m51726f(String str) {
        if (str != null && !m51728d(str) && str.length() <= 255) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m51725g(NetworkRequestMetric.HttpMethod httpMethod) {
        if (httpMethod != null && httpMethod != NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m51724h(int i) {
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m51723i(long j) {
        if (j >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public boolean isValidPerfMetric() {
        NetworkRequestMetric.HttpMethod httpMethod;
        if (m51727e(this.f39314a.getUrl())) {
            AndroidLogger androidLogger = f39313c;
            androidLogger.warn("URL is missing:" + this.f39314a.getUrl());
            return false;
        }
        URI m51730b = m51730b(this.f39314a.getUrl());
        if (m51730b == null) {
            f39313c.warn("URL cannot be parsed");
            return false;
        } else if (!m51729c(m51730b, this.f39315b)) {
            AndroidLogger androidLogger2 = f39313c;
            androidLogger2.warn("URL fails allowlist rule: " + m51730b);
            return false;
        } else if (!m51726f(m51730b.getHost())) {
            f39313c.warn("URL host is null or invalid");
            return false;
        } else if (!m51721k(m51730b.getScheme())) {
            f39313c.warn("URL scheme is null or invalid");
            return false;
        } else if (!m51719m(m51730b.getUserInfo())) {
            f39313c.warn("URL user info is null");
            return false;
        } else if (!m51722j(m51730b.getPort())) {
            f39313c.warn("URL port is less than or equal to 0");
            return false;
        } else {
            if (this.f39314a.hasHttpMethod()) {
                httpMethod = this.f39314a.getHttpMethod();
            } else {
                httpMethod = null;
            }
            if (!m51725g(httpMethod)) {
                AndroidLogger androidLogger3 = f39313c;
                androidLogger3.warn("HTTP Method is null or invalid: " + this.f39314a.getHttpMethod());
                return false;
            } else if (this.f39314a.hasHttpResponseCode() && !m51724h(this.f39314a.getHttpResponseCode())) {
                AndroidLogger androidLogger4 = f39313c;
                androidLogger4.warn("HTTP ResponseCode is a negative value:" + this.f39314a.getHttpResponseCode());
                return false;
            } else if (this.f39314a.hasRequestPayloadBytes() && !m51723i(this.f39314a.getRequestPayloadBytes())) {
                AndroidLogger androidLogger5 = f39313c;
                androidLogger5.warn("Request Payload is a negative value:" + this.f39314a.getRequestPayloadBytes());
                return false;
            } else if (this.f39314a.hasResponsePayloadBytes() && !m51723i(this.f39314a.getResponsePayloadBytes())) {
                AndroidLogger androidLogger6 = f39313c;
                androidLogger6.warn("Response Payload is a negative value:" + this.f39314a.getResponsePayloadBytes());
                return false;
            } else if (this.f39314a.hasClientStartTimeUs() && this.f39314a.getClientStartTimeUs() > 0) {
                if (this.f39314a.hasTimeToRequestCompletedUs() && !m51720l(this.f39314a.getTimeToRequestCompletedUs())) {
                    AndroidLogger androidLogger7 = f39313c;
                    androidLogger7.warn("Time to complete the request is a negative value:" + this.f39314a.getTimeToRequestCompletedUs());
                    return false;
                } else if (this.f39314a.hasTimeToResponseInitiatedUs() && !m51720l(this.f39314a.getTimeToResponseInitiatedUs())) {
                    AndroidLogger androidLogger8 = f39313c;
                    androidLogger8.warn("Time from the start of the request to the start of the response is null or a negative value:" + this.f39314a.getTimeToResponseInitiatedUs());
                    return false;
                } else if (this.f39314a.hasTimeToResponseCompletedUs() && this.f39314a.getTimeToResponseCompletedUs() > 0) {
                    if (!this.f39314a.hasHttpResponseCode()) {
                        f39313c.warn("Did not receive a HTTP Response Code");
                        return false;
                    }
                    return true;
                } else {
                    AndroidLogger androidLogger9 = f39313c;
                    androidLogger9.warn("Time from the start of the request to the end of the response is null, negative or zero:" + this.f39314a.getTimeToResponseCompletedUs());
                    return false;
                }
            } else {
                AndroidLogger androidLogger10 = f39313c;
                androidLogger10.warn("Start time of the request is null, or zero, or a negative value:" + this.f39314a.getClientStartTimeUs());
                return false;
            }
        }
    }

    /* renamed from: j */
    public final boolean m51722j(int i) {
        if (i != -1 && i <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m51721k(String str) {
        if (str == null) {
            return false;
        }
        if (!"http".equalsIgnoreCase(str) && !UriUtil.HTTPS_SCHEME.equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean m51720l(long j) {
        if (j >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m51719m(String str) {
        if (str == null) {
            return true;
        }
        return false;
    }
}
