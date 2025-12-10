package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.AbstractConnPool;
import org.apache.http.pool.ConnFactory;

/* renamed from: V80 */
/* loaded from: classes6.dex */
public class V80 extends AbstractConnPool {

    /* renamed from: p */
    public static final AtomicLong f6560p = new AtomicLong();

    /* renamed from: m */
    public final Log f6561m;

    /* renamed from: n */
    public final long f6562n;

    /* renamed from: o */
    public final TimeUnit f6563o;

    /* renamed from: V80$a */
    /* loaded from: classes6.dex */
    public static class C1516a implements ConnFactory {

        /* renamed from: a */
        public final ClientConnectionOperator f6564a;

        public C1516a(ClientConnectionOperator clientConnectionOperator) {
            this.f6564a = clientConnectionOperator;
        }

        @Override // org.apache.http.pool.ConnFactory
        /* renamed from: a */
        public OperatedClientConnection create(HttpRoute httpRoute) {
            return this.f6564a.createConnection();
        }
    }

    public V80(Log log, ClientConnectionOperator clientConnectionOperator, int i, int i2, long j, TimeUnit timeUnit) {
        super(new C1516a(clientConnectionOperator), i, i2);
        this.f6561m = log;
        this.f6562n = j;
        this.f6563o = timeUnit;
    }

    @Override // org.apache.http.pool.AbstractConnPool
    /* renamed from: k */
    public C19302c90 createEntry(HttpRoute httpRoute, OperatedClientConnection operatedClientConnection) {
        return new C19302c90(this.f6561m, Long.toString(f6560p.getAndIncrement()), httpRoute, operatedClientConnection, this.f6562n, this.f6563o);
    }
}
