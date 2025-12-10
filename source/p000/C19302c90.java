package p000;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.pool.PoolEntry;

/* renamed from: c90  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19302c90 extends PoolEntry {

    /* renamed from: i */
    public final Log f39349i;

    /* renamed from: j */
    public final RouteTracker f39350j;

    public C19302c90(Log log, String str, HttpRoute httpRoute, OperatedClientConnection operatedClientConnection, long j, TimeUnit timeUnit) {
        super(str, httpRoute, operatedClientConnection, j, timeUnit);
        this.f39349i = log;
        this.f39350j = new RouteTracker(httpRoute);
    }

    /* renamed from: a */
    public HttpRoute m51704a() {
        return this.f39350j.toRoute();
    }

    /* renamed from: b */
    public HttpRoute m51703b() {
        return (HttpRoute) getRoute();
    }

    /* renamed from: c */
    public RouteTracker m51702c() {
        return this.f39350j;
    }

    @Override // org.apache.http.pool.PoolEntry
    public void close() {
        try {
            ((OperatedClientConnection) getConnection()).close();
        } catch (IOException e) {
            this.f39349i.debug("I/O error closing connection", e);
        }
    }

    @Override // org.apache.http.pool.PoolEntry
    public boolean isClosed() {
        return !((OperatedClientConnection) getConnection()).isOpen();
    }

    @Override // org.apache.http.pool.PoolEntry
    public boolean isExpired(long j) {
        boolean isExpired = super.isExpired(j);
        if (isExpired && this.f39349i.isDebugEnabled()) {
            Log log = this.f39349i;
            log.debug("Connection " + this + " expired @ " + new Date(getExpiry()));
        }
        return isExpired;
    }
}
