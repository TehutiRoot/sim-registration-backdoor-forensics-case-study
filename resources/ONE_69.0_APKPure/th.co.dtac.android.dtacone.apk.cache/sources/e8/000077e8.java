package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.AbstractConnPool;
import org.apache.http.pool.ConnFactory;

/* renamed from: b90  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19177b90 extends AbstractConnPool {

    /* renamed from: p */
    public static final AtomicLong f39010p = new AtomicLong();

    /* renamed from: m */
    public final Log f39011m;

    /* renamed from: n */
    public final long f39012n;

    /* renamed from: o */
    public final TimeUnit f39013o;

    /* renamed from: b90$a */
    /* loaded from: classes6.dex */
    public static class C5335a implements ConnFactory {

        /* renamed from: a */
        public final ClientConnectionOperator f39014a;

        public C5335a(ClientConnectionOperator clientConnectionOperator) {
            this.f39014a = clientConnectionOperator;
        }

        @Override // org.apache.http.pool.ConnFactory
        /* renamed from: a */
        public OperatedClientConnection create(HttpRoute httpRoute) {
            return this.f39014a.createConnection();
        }
    }

    public C19177b90(Log log, ClientConnectionOperator clientConnectionOperator, int i, int i2, long j, TimeUnit timeUnit) {
        super(new C5335a(clientConnectionOperator), i, i2);
        this.f39011m = log;
        this.f39012n = j;
        this.f39013o = timeUnit;
    }

    @Override // org.apache.http.pool.AbstractConnPool
    /* renamed from: k */
    public C20388i90 createEntry(HttpRoute httpRoute, OperatedClientConnection operatedClientConnection) {
        return new C20388i90(this.f39011m, Long.toString(f39010p.getAndIncrement()), httpRoute, operatedClientConnection, this.f39012n, this.f39013o);
    }
}