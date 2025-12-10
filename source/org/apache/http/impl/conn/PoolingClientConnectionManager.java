package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolStats;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: classes6.dex */
public class PoolingClientConnectionManager implements ClientConnectionManager, ConnPoolControl<HttpRoute> {

    /* renamed from: a */
    public final Log f74275a;

    /* renamed from: b */
    public final SchemeRegistry f74276b;

    /* renamed from: c */
    public final V80 f74277c;

    /* renamed from: d */
    public final ClientConnectionOperator f74278d;

    /* renamed from: e */
    public final DnsResolver f74279e;

    /* renamed from: org.apache.http.impl.conn.PoolingClientConnectionManager$a */
    /* loaded from: classes6.dex */
    public class C12592a implements ClientConnectionRequest {

        /* renamed from: a */
        public final /* synthetic */ Future f74280a;

        public C12592a(Future future) {
            this.f74280a = future;
        }

        @Override // org.apache.http.conn.ClientConnectionRequest
        public void abortRequest() {
            this.f74280a.cancel(true);
        }

        @Override // org.apache.http.conn.ClientConnectionRequest
        public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
            return PoolingClientConnectionManager.this.m24636d(this.f74280a, j, timeUnit);
        }
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry) {
        this(schemeRegistry, -1L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final String m24639a(C19302c90 c19302c90) {
        StringBuilder sb = new StringBuilder();
        sb.append("[id: ");
        sb.append(c19302c90.getId());
        sb.append("]");
        sb.append("[route: ");
        sb.append(c19302c90.getRoute());
        sb.append("]");
        Object state = c19302c90.getState();
        if (state != null) {
            sb.append("[state: ");
            sb.append(state);
            sb.append("]");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final String m24638b(HttpRoute httpRoute, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("[route: ");
        sb.append(httpRoute);
        sb.append("]");
        if (obj != null) {
            sb.append("[state: ");
            sb.append(obj);
            sb.append("]");
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final String m24637c(HttpRoute httpRoute) {
        StringBuilder sb = new StringBuilder();
        PoolStats totalStats = this.f74277c.getTotalStats();
        PoolStats stats = this.f74277c.getStats(httpRoute);
        sb.append("[total kept alive: ");
        sb.append(totalStats.getAvailable());
        sb.append("; ");
        sb.append("route allocated: ");
        sb.append(stats.getLeased() + stats.getAvailable());
        sb.append(" of ");
        sb.append(stats.getMax());
        sb.append("; ");
        sb.append("total allocated: ");
        sb.append(totalStats.getLeased() + totalStats.getAvailable());
        sb.append(" of ");
        sb.append(totalStats.getMax());
        sb.append("]");
        return sb.toString();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        this.f74275a.debug("Closing expired connections");
        this.f74277c.closeExpired();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        if (this.f74275a.isDebugEnabled()) {
            Log log = this.f74275a;
            log.debug("Closing connections idle longer than " + j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + timeUnit);
        }
        this.f74277c.closeIdle(j, timeUnit);
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry, this.f74279e);
    }

    /* renamed from: d */
    public ManagedClientConnection m24636d(Future future, long j, TimeUnit timeUnit) {
        boolean z;
        try {
            C19302c90 c19302c90 = (C19302c90) future.get(j, timeUnit);
            if (c19302c90 != null && !future.isCancelled()) {
                if (c19302c90.getConnection() != null) {
                    z = true;
                } else {
                    z = false;
                }
                Asserts.check(z, "Pool entry with no connection");
                if (this.f74275a.isDebugEnabled()) {
                    Log log = this.f74275a;
                    log.debug("Connection leased: " + m24639a(c19302c90) + m24637c((HttpRoute) c19302c90.getRoute()));
                }
                return new C17555En0(this, this.f74278d, c19302c90);
            }
            throw new InterruptedException();
        } catch (ExecutionException e) {
            e = e;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            this.f74275a.error("Unexpected exception leasing connection from pool", e);
            throw new InterruptedException();
        } catch (TimeoutException unused) {
            throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
        }
    }

    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getDefaultMaxPerRoute() {
        return this.f74277c.getDefaultMaxPerRoute();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxTotal() {
        return this.f74277c.getMaxTotal();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.f74276b;
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getTotalStats() {
        return this.f74277c.getTotalStats();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        boolean z;
        TimeUnit timeUnit2;
        String str;
        Args.check(managedClientConnection instanceof C17555En0, "Connection class mismatch, connection not obtained from this manager");
        C17555En0 c17555En0 = (C17555En0) managedClientConnection;
        if (c17555En0.m68460j() == this) {
            z = true;
        } else {
            z = false;
        }
        Asserts.check(z, "Connection not obtained from this manager");
        synchronized (c17555En0) {
            C19302c90 m68464b = c17555En0.m68464b();
            if (m68464b == null) {
                return;
            }
            if (c17555En0.isOpen() && !c17555En0.isMarkedReusable()) {
                try {
                    c17555En0.shutdown();
                } catch (IOException e) {
                    if (this.f74275a.isDebugEnabled()) {
                        this.f74275a.debug("I/O exception shutting down released connection", e);
                    }
                }
            }
            if (c17555En0.isMarkedReusable()) {
                if (timeUnit != null) {
                    timeUnit2 = timeUnit;
                } else {
                    timeUnit2 = TimeUnit.MILLISECONDS;
                }
                m68464b.updateExpiry(j, timeUnit2);
                if (this.f74275a.isDebugEnabled()) {
                    if (j > 0) {
                        str = "for " + j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + timeUnit;
                    } else {
                        str = "indefinitely";
                    }
                    this.f74275a.debug("Connection " + m24639a(m68464b) + " can be kept alive " + str);
                }
            }
            this.f74277c.release((V80) m68464b, c17555En0.isMarkedReusable());
            if (this.f74275a.isDebugEnabled()) {
                this.f74275a.debug("Connection released: " + m24639a(m68464b) + m24637c((HttpRoute) m68464b.getRoute()));
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        Args.notNull(httpRoute, "HTTP route");
        if (this.f74275a.isDebugEnabled()) {
            Log log = this.f74275a;
            log.debug("Connection request: " + m24638b(httpRoute, obj) + m24637c(httpRoute));
        }
        return new C12592a(this.f74277c.lease(httpRoute, obj));
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setDefaultMaxPerRoute(int i) {
        this.f74277c.setDefaultMaxPerRoute(i);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxTotal(int i) {
        this.f74277c.setMaxTotal(i);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        this.f74275a.debug("Connection manager is shutting down");
        try {
            this.f74277c.shutdown();
        } catch (IOException e) {
            this.f74275a.debug("I/O exception shutting down connection manager", e);
        }
        this.f74275a.debug("Connection manager shut down");
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry, DnsResolver dnsResolver) {
        this(schemeRegistry, -1L, TimeUnit.MILLISECONDS, dnsResolver);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxPerRoute(HttpRoute httpRoute) {
        return this.f74277c.getMaxPerRoute(httpRoute);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getStats(HttpRoute httpRoute) {
        return this.f74277c.getStats(httpRoute);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxPerRoute(HttpRoute httpRoute, int i) {
        this.f74277c.setMaxPerRoute(httpRoute, i);
    }

    public PoolingClientConnectionManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry, long j, TimeUnit timeUnit) {
        this(schemeRegistry, j, timeUnit, new SystemDefaultDnsResolver());
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry, long j, TimeUnit timeUnit, DnsResolver dnsResolver) {
        Log log = LogFactory.getLog(getClass());
        this.f74275a = log;
        Args.notNull(schemeRegistry, "Scheme registry");
        Args.notNull(dnsResolver, "DNS resolver");
        this.f74276b = schemeRegistry;
        this.f74279e = dnsResolver;
        ClientConnectionOperator createConnectionOperator = createConnectionOperator(schemeRegistry);
        this.f74278d = createConnectionOperator;
        this.f74277c = new V80(log, createConnectionOperator, 2, 20, j, timeUnit);
    }
}
