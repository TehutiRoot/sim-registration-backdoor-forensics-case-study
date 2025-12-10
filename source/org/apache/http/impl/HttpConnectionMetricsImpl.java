package org.apache.http.impl;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.p030io.HttpTransportMetrics;

/* loaded from: classes6.dex */
public class HttpConnectionMetricsImpl implements HttpConnectionMetrics {
    public static final String RECEIVED_BYTES_COUNT = "http.received-bytes-count";
    public static final String REQUEST_COUNT = "http.request-count";
    public static final String RESPONSE_COUNT = "http.response-count";
    public static final String SENT_BYTES_COUNT = "http.sent-bytes-count";

    /* renamed from: a */
    public final HttpTransportMetrics f73921a;

    /* renamed from: b */
    public final HttpTransportMetrics f73922b;

    /* renamed from: c */
    public long f73923c = 0;

    /* renamed from: d */
    public long f73924d = 0;

    /* renamed from: e */
    public Map f73925e;

    public HttpConnectionMetricsImpl(HttpTransportMetrics httpTransportMetrics, HttpTransportMetrics httpTransportMetrics2) {
        this.f73921a = httpTransportMetrics;
        this.f73922b = httpTransportMetrics2;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public Object getMetric(String str) {
        Object obj;
        Map map = this.f73925e;
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        if (obj == null) {
            if (REQUEST_COUNT.equals(str)) {
                return Long.valueOf(this.f73923c);
            }
            if (RESPONSE_COUNT.equals(str)) {
                return Long.valueOf(this.f73924d);
            }
            if (RECEIVED_BYTES_COUNT.equals(str)) {
                HttpTransportMetrics httpTransportMetrics = this.f73921a;
                if (httpTransportMetrics == null) {
                    return null;
                }
                return Long.valueOf(httpTransportMetrics.getBytesTransferred());
            } else if (SENT_BYTES_COUNT.equals(str)) {
                HttpTransportMetrics httpTransportMetrics2 = this.f73922b;
                if (httpTransportMetrics2 == null) {
                    return null;
                }
                return Long.valueOf(httpTransportMetrics2.getBytesTransferred());
            } else {
                return obj;
            }
        }
        return obj;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public long getReceivedBytesCount() {
        HttpTransportMetrics httpTransportMetrics = this.f73921a;
        if (httpTransportMetrics != null) {
            return httpTransportMetrics.getBytesTransferred();
        }
        return -1L;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public long getRequestCount() {
        return this.f73923c;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public long getResponseCount() {
        return this.f73924d;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public long getSentBytesCount() {
        HttpTransportMetrics httpTransportMetrics = this.f73922b;
        if (httpTransportMetrics != null) {
            return httpTransportMetrics.getBytesTransferred();
        }
        return -1L;
    }

    public void incrementRequestCount() {
        this.f73923c++;
    }

    public void incrementResponseCount() {
        this.f73924d++;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public void reset() {
        HttpTransportMetrics httpTransportMetrics = this.f73922b;
        if (httpTransportMetrics != null) {
            httpTransportMetrics.reset();
        }
        HttpTransportMetrics httpTransportMetrics2 = this.f73921a;
        if (httpTransportMetrics2 != null) {
            httpTransportMetrics2.reset();
        }
        this.f73923c = 0L;
        this.f73924d = 0L;
        this.f73925e = null;
    }

    public void setMetric(String str, Object obj) {
        if (this.f73925e == null) {
            this.f73925e = new HashMap();
        }
        this.f73925e.put(str, obj);
    }
}
