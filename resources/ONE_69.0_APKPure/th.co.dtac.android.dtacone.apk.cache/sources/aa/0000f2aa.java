package org.apache.http.impl.p029io;

import org.apache.http.p030io.HttpTransportMetrics;

/* renamed from: org.apache.http.impl.io.HttpTransportMetricsImpl */
/* loaded from: classes6.dex */
public class HttpTransportMetricsImpl implements HttpTransportMetrics {

    /* renamed from: a */
    public long f74583a = 0;

    @Override // org.apache.http.p030io.HttpTransportMetrics
    public long getBytesTransferred() {
        return this.f74583a;
    }

    public void incrementBytesTransferred(long j) {
        this.f74583a += j;
    }

    @Override // org.apache.http.p030io.HttpTransportMetrics
    public void reset() {
        this.f74583a = 0L;
    }

    public void setBytesTransferred(long j) {
        this.f74583a = j;
    }
}