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
    public final HttpTransportMetrics f74005a;

    /* renamed from: b */
    public final HttpTransportMetrics f74006b;

    /* renamed from: c */
    public long f74007c = 0;

    /* renamed from: d */
    public long f74008d = 0;

    /* renamed from: e */
    public Map f74009e;

    public HttpConnectionMetricsImpl(HttpTransportMetrics httpTransportMetrics, HttpTransportMetrics httpTransportMetrics2) {
        this.f74005a = httpTransportMetrics;
        this.f74006b = httpTransportMetrics2;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public Object getMetric(String str) {
        Object obj;
        Map map = this.f74009e;
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        if (obj == null) {
            if (REQUEST_COUNT.equals(str)) {
                return Long.valueOf(this.f74007c);
            }
            if (RESPONSE_COUNT.equals(str)) {
                return Long.valueOf(this.f74008d);
            }
            if (RECEIVED_BYTES_COUNT.equals(str)) {
                HttpTransportMetrics httpTransportMetrics = this.f74005a;
                if (httpTransportMetrics == null) {
                    return null;
                }
                return Long.valueOf(httpTransportMetrics.getBytesTransferred());
            } else if (SENT_BYTES_COUNT.equals(str)) {
                HttpTransportMetrics httpTransportMetrics2 = this.f74006b;
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
        HttpTransportMetrics httpTransportMetrics = this.f74005a;
        if (httpTransportMetrics != null) {
            return httpTransportMetrics.getBytesTransferred();
        }
        return -1L;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public long getRequestCount() {
        return this.f74007c;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public long getResponseCount() {
        return this.f74008d;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public long getSentBytesCount() {
        HttpTransportMetrics httpTransportMetrics = this.f74006b;
        if (httpTransportMetrics != null) {
            return httpTransportMetrics.getBytesTransferred();
        }
        return -1L;
    }

    public void incrementRequestCount() {
        this.f74007c++;
    }

    public void incrementResponseCount() {
        this.f74008d++;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public void reset() {
        HttpTransportMetrics httpTransportMetrics = this.f74006b;
        if (httpTransportMetrics != null) {
            httpTransportMetrics.reset();
        }
        HttpTransportMetrics httpTransportMetrics2 = this.f74005a;
        if (httpTransportMetrics2 != null) {
            httpTransportMetrics2.reset();
        }
        this.f74007c = 0L;
        this.f74008d = 0L;
        this.f74009e = null;
    }

    public void setMetric(String str, Object obj) {
        if (this.f74009e == null) {
            this.f74009e = new HashMap();
        }
        this.f74009e.put(str, obj);
    }
}