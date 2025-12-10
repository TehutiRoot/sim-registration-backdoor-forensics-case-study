package org.apache.http.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.AbstractPoolEntry;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public class BasicPoolEntry extends AbstractPoolEntry {

    /* renamed from: a */
    public final long f74309a;

    /* renamed from: b */
    public long f74310b;

    /* renamed from: c */
    public final long f74311c;

    /* renamed from: d */
    public long f74312d;

    public BasicPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute, ReferenceQueue<Object> referenceQueue) {
        super(clientConnectionOperator, httpRoute);
        Args.notNull(httpRoute, "HTTP route");
        this.f74309a = System.currentTimeMillis();
        this.f74311c = Long.MAX_VALUE;
        this.f74312d = Long.MAX_VALUE;
    }

    public final OperatedClientConnection getConnection() {
        return this.connection;
    }

    public long getCreated() {
        return this.f74309a;
    }

    public long getExpiry() {
        return this.f74312d;
    }

    public final HttpRoute getPlannedRoute() {
        return this.route;
    }

    public long getUpdated() {
        return this.f74310b;
    }

    public long getValidUntil() {
        return this.f74311c;
    }

    public final BasicPoolEntryRef getWeakRef() {
        return null;
    }

    public boolean isExpired(long j) {
        if (j >= this.f74312d) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.impl.conn.AbstractPoolEntry
    public void shutdownEntry() {
        super.shutdownEntry();
    }

    public void updateExpiry(long j, TimeUnit timeUnit) {
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        this.f74310b = currentTimeMillis;
        if (j > 0) {
            j2 = currentTimeMillis + timeUnit.toMillis(j);
        } else {
            j2 = Long.MAX_VALUE;
        }
        this.f74312d = Math.min(this.f74311c, j2);
    }

    public BasicPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute) {
        this(clientConnectionOperator, httpRoute, -1L, TimeUnit.MILLISECONDS);
    }

    public BasicPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute, long j, TimeUnit timeUnit) {
        super(clientConnectionOperator, httpRoute);
        Args.notNull(httpRoute, "HTTP route");
        long currentTimeMillis = System.currentTimeMillis();
        this.f74309a = currentTimeMillis;
        if (j > 0) {
            this.f74311c = currentTimeMillis + timeUnit.toMillis(j);
        } else {
            this.f74311c = Long.MAX_VALUE;
        }
        this.f74312d = this.f74311c;
    }
}
