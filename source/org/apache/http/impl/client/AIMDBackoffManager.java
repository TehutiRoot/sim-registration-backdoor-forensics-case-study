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
    public final ConnPoolControl f74027a;

    /* renamed from: b */
    public final InterfaceC5404bq f74028b;

    /* renamed from: c */
    public final Map f74029c;

    /* renamed from: d */
    public final Map f74030d;

    /* renamed from: e */
    public long f74031e;

    /* renamed from: f */
    public double f74032f;

    /* renamed from: g */
    public int f74033g;

    public AIMDBackoffManager(ConnPoolControl<HttpRoute> connPoolControl) {
        this(connPoolControl, new C19350cQ1());
    }

    /* renamed from: a */
    public final int m24683a(int i) {
        if (i <= 1) {
            return 1;
        }
        return (int) Math.floor(this.f74032f * i);
    }

    /* renamed from: b */
    public final Long m24682b(Map map, HttpRoute httpRoute) {
        Long l = (Long) map.get(httpRoute);
        if (l == null) {
            return 0L;
        }
        return l;
    }

    @Override // org.apache.http.client.BackoffManager
    public void backOff(HttpRoute httpRoute) {
        synchronized (this.f74027a) {
            try {
                int maxPerRoute = this.f74027a.getMaxPerRoute(httpRoute);
                Long m24682b = m24682b(this.f74030d, httpRoute);
                long currentTime = this.f74028b.getCurrentTime();
                if (currentTime - m24682b.longValue() < this.f74031e) {
                    return;
                }
                this.f74027a.setMaxPerRoute(httpRoute, m24683a(maxPerRoute));
                this.f74030d.put(httpRoute, Long.valueOf(currentTime));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.apache.http.client.BackoffManager
    public void probe(HttpRoute httpRoute) {
        synchronized (this.f74027a) {
            try {
                int maxPerRoute = this.f74027a.getMaxPerRoute(httpRoute);
                int i = this.f74033g;
                if (maxPerRoute < i) {
                    i = maxPerRoute + 1;
                }
                Long m24682b = m24682b(this.f74029c, httpRoute);
                Long m24682b2 = m24682b(this.f74030d, httpRoute);
                long currentTime = this.f74028b.getCurrentTime();
                if (currentTime - m24682b.longValue() >= this.f74031e && currentTime - m24682b2.longValue() >= this.f74031e) {
                    this.f74027a.setMaxPerRoute(httpRoute, i);
                    this.f74029c.put(httpRoute, Long.valueOf(currentTime));
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
        this.f74032f = d;
    }

    public void setCooldownMillis(long j) {
        Args.positive(this.f74031e, "Cool down");
        this.f74031e = j;
    }

    public void setPerHostConnectionCap(int i) {
        Args.positive(i, "Per host connection cap");
        this.f74033g = i;
    }

    public AIMDBackoffManager(ConnPoolControl connPoolControl, InterfaceC5404bq interfaceC5404bq) {
        this.f74031e = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        this.f74032f = 0.5d;
        this.f74033g = 2;
        this.f74028b = interfaceC5404bq;
        this.f74027a = connPoolControl;
        this.f74029c = new HashMap();
        this.f74030d = new HashMap();
    }
}
