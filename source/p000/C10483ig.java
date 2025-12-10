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
public class C10483ig extends AbstractConnPool {

    /* renamed from: p */
    public static final AtomicLong f62859p = new AtomicLong();

    /* renamed from: m */
    public final Log f62860m;

    /* renamed from: n */
    public final long f62861n;

    /* renamed from: o */
    public final TimeUnit f62862o;

    public C10483ig(ConnFactory connFactory, int i, int i2, long j, TimeUnit timeUnit) {
        super(connFactory, i, i2);
        this.f62860m = LogFactory.getLog(C10483ig.class);
        this.f62861n = j;
        this.f62862o = timeUnit;
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
    public C11550jg createEntry(HttpRoute httpRoute, ManagedHttpClientConnection managedHttpClientConnection) {
        return new C11550jg(this.f62860m, Long.toString(f62859p.getAndIncrement()), httpRoute, managedHttpClientConnection, this.f62861n, this.f62862o);
    }

    @Override // org.apache.http.pool.AbstractConnPool
    /* renamed from: l */
    public boolean validate(C11550jg c11550jg) {
        return !((ManagedHttpClientConnection) c11550jg.getConnection()).isStale();
    }
}
