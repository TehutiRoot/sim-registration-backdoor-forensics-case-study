package org.apache.http.impl.client;

import androidx.lifecycle.CoroutineLiveDataKt;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.BackoffManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public class AIMDBackoffManager implements BackoffManager {

    /* renamed from: a */
    public final ConnPoolControl f74111a;

    /* renamed from: b */
    public final InterfaceC5381bq f74112b;

    /* renamed from: c */
    public final Map f74113c;

    /* renamed from: d */
    public final Map f74114d;

    /* renamed from: e */
    public long f74115e;

    /* renamed from: f */
    public double f74116f;

    /* renamed from: g */
    public int f74117g;

    public AIMDBackoffManager(ConnPoolControl<HttpRoute> connPoolControl) {
        this(connPoolControl, new ZQ1());
    }

    /* renamed from: a */
    public final int m24873a(int i) {
        if (i <= 1) {
            return 1;
        }
        return (int) Math.floor(this.f74116f * i);
    }

    /* renamed from: b */
    public final Long m24872b(Map map, HttpRoute httpRoute) {
        Long l = (Long) map.get(httpRoute);
        if (l == null) {
            return 0L;
        }
        return l;
    }

    @Override // org.apache.http.client.BackoffManager
    public void backOff(HttpRoute httpRoute) {
        synchronized (this.f74111a) {
            try {
                int maxPerRoute = this.f74111a.getMaxPerRoute(httpRoute);
                Long m24872b = m24872b(this.f74114d, httpRoute);
                long currentTime = this.f74112b.getCurrentTime();
                if (currentTime - m24872b.longValue() < this.f74115e) {
                    return;
                }
                this.f74111a.setMaxPerRoute(httpRoute, m24873a(maxPerRoute));
                this.f74114d.put(httpRoute, Long.valueOf(currentTime));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.apache.http.client.BackoffManager
    public void probe(HttpRoute httpRoute) {
        synchronized (this.f74111a) {
            try {
                int maxPerRoute = this.f74111a.getMaxPerRoute(httpRoute);
                int i = this.f74117g;
                if (maxPerRoute < i) {
                    i = maxPerRoute + 1;
                }
                Long m24872b = m24872b(this.f74113c, httpRoute);
                Long m24872b2 = m24872b(this.f74114d, httpRoute);
                long currentTime = this.f74112b.getCurrentTime();
                if (currentTime - m24872b.longValue() >= this.f74115e && currentTime - m24872b2.longValue() >= this.f74115e) {
                    this.f74111a.setMaxPerRoute(httpRoute, i);
                    this.f74113c.put(httpRoute, Long.valueOf(currentTime));
                }
            } finally {
            }
        }
    }

    public void setBackoffFactor(double d) {
        boolean z;
        if (d > 0.0d && d < 1.0d) {
            z = true;
        } else {
            z = false;
        }
        Args.check(z, "Backoff factor must be 0.0 < f < 1.0");
        this.f74116f = d;
    }

    public void setCooldownMillis(long j) {
        Args.positive(this.f74115e, "Cool down");
        this.f74115e = j;
    }

    public void setPerHostConnectionCap(int i) {
        Args.positive(i, "Per host connection cap");
        this.f74117g = i;
    }

    public AIMDBackoffManager(ConnPoolControl connPoolControl, InterfaceC5381bq interfaceC5381bq) {
        this.f74115e = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        this.f74116f = 0.5d;
        this.f74117g = 2;
        this.f74112b = interfaceC5381bq;
        this.f74111a = connPoolControl;
        this.f74113c = new HashMap();
        this.f74114d = new HashMap();
    }
}