package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.AbstractConnPool;
import org.apache.http.pool.ConnFactory;
import org.apache.http.pool.PoolEntryCallback;

/* renamed from: ig */
/* loaded from: classes6.dex */
public class C10470ig extends AbstractConnPool {

    /* renamed from: p */
    public static final AtomicLong f62908p = new AtomicLong();

    /* renamed from: m */
    public final Log f62909m;

    /* renamed from: n */
    public final long f62910n;

    /* renamed from: o */
    public final TimeUnit f62911o;

    public C10470ig(ConnFactory connFactory, int i, int i2, long j, TimeUnit timeUnit) {
        super(connFactory, i, i2);
        this.f62909m = LogFactory.getLog(C10470ig.class);
        this.f62910n = j;
        this.f62911o = timeUnit;
    }

    @Override // org.apache.http.pool.AbstractConnPool
    public void enumAvailable(PoolEntryCallback poolEntryCallback) {
        super.enumAvailable(poolEntryCallback);
    }

    @Override // org.apache.http.pool.AbstractConnPool
    public void enumLeased(PoolEntryCallback poolEntryCallback) {
        super.enumLeased(poolEntryCallback);
    }

    @Override // org.apache.http.pool.AbstractConnPool
    /* renamed from: k */
    public C11535jg createEntry(HttpRoute httpRoute, ManagedHttpClientConnection managedHttpClientConnection) {
        return new C11535jg(this.f62909m, Long.toString(f62908p.getAndIncrement()), httpRoute, managedHttpClientConnection, this.f62910n, this.f62911o);
    }

    @Override // org.apache.http.pool.AbstractConnPool
    /* renamed from: l */
    public boolean validate(C11535jg c11535jg) {
        return !((ManagedHttpClientConnection) c11535jg.getConnection()).isStale();
    }
}