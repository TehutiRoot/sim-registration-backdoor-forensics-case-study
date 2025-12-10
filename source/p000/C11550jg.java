package p000;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.PoolEntry;

/* renamed from: jg */
/* loaded from: classes6.dex */
public class C11550jg extends PoolEntry {

    /* renamed from: i */
    public final Log f67330i;

    /* renamed from: j */
    public volatile boolean f67331j;

    public C11550jg(Log log, String str, HttpRoute httpRoute, ManagedHttpClientConnection managedHttpClientConnection, long j, TimeUnit timeUnit) {
        super(str, httpRoute, managedHttpClientConnection, j, timeUnit);
        this.f67330i = log;
    }

    /* renamed from: a */
    public void m29160a() {
        ((HttpClientConnection) getConnection()).close();
    }

    /* renamed from: b */
    public boolean m29159b() {
        return this.f67331j;
    }

    /* renamed from: c */
    public void m29158c() {
        this.f67331j = true;
    }

    @Override // org.apache.http.pool.PoolEntry
    public void close() {
        try {
            m29160a();
        } catch (IOException e) {
            this.f67330i.debug("I/O error closing connection", e);
        }
    }

    /* renamed from: d */
    public void m29157d() {
        ((HttpClientConnection) getConnection()).shutdown();
    }

    @Override // org.apache.http.pool.PoolEntry
    public boolean isClosed() {
        return !((HttpClientConnection) getConnection()).isOpen();
    }

    @Override // org.apache.http.pool.PoolEntry
    public boolean isExpired(long j) {
        boolean isExpired = super.isExpired(j);
        if (isExpired && this.f67330i.isDebugEnabled()) {
            Log log = this.f67330i;
            log.debug("Connection " + this + " expired @ " + new Date(getExpiry()));
        }
        return isExpired;
    }
}
