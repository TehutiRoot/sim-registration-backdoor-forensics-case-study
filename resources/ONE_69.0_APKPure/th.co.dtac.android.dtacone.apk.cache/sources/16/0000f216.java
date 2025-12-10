package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes6.dex */
public class BasicClientConnectionManager implements ClientConnectionManager {
    public static final String MISUSE_MESSAGE = "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";

    /* renamed from: g */
    public static final AtomicLong f74286g = new AtomicLong();

    /* renamed from: a */
    public final Log f74287a;

    /* renamed from: b */
    public final SchemeRegistry f74288b;

    /* renamed from: c */
    public final ClientConnectionOperator f74289c;

    /* renamed from: d */
    public C20388i90 f74290d;

    /* renamed from: e */
    public C17973Kn0 f74291e;

    /* renamed from: f */
    public volatile boolean f74292f;

    /* renamed from: org.apache.http.impl.conn.BasicClientConnectionManager$a */
    /* loaded from: classes6.dex */
    public class C12589a implements ClientConnectionRequest {

        /* renamed from: a */
        public final /* synthetic */ HttpRoute f74293a;

        /* renamed from: b */
        public final /* synthetic */ Object f74294b;

        public C12589a(HttpRoute httpRoute, Object obj) {
            this.f74293a = httpRoute;
            this.f74294b = obj;
        }

        @Override // org.apache.http.conn.ClientConnectionRequest
        public void abortRequest() {
        }

        @Override // org.apache.http.conn.ClientConnectionRequest
        public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
            return BasicClientConnectionManager.this.m24839b(this.f74293a, this.f74294b);
        }
    }

    public BasicClientConnectionManager(SchemeRegistry schemeRegistry) {
        this.f74287a = LogFactory.getLog(getClass());
        Args.notNull(schemeRegistry, "Scheme registry");
        this.f74288b = schemeRegistry;
        this.f74289c = createConnectionOperator(schemeRegistry);
    }

    /* renamed from: a */
    public final void m24840a() {
        Asserts.check(!this.f74292f, "Connection manager has been shut down");
    }

    /* renamed from: b */
    public ManagedClientConnection m24839b(HttpRoute httpRoute, Object obj) {
        boolean z;
        C17973Kn0 c17973Kn0;
        Args.notNull(httpRoute, "Route");
        synchronized (this) {
            try {
                m24840a();
                if (this.f74287a.isDebugEnabled()) {
                    Log log = this.f74287a;
                    log.debug("Get connection for route " + httpRoute);
                }
                if (this.f74291e == null) {
                    z = true;
                } else {
                    z = false;
                }
                Asserts.check(z, MISUSE_MESSAGE);
                C20388i90 c20388i90 = this.f74290d;
                if (c20388i90 != null && !c20388i90.m31034b().equals(httpRoute)) {
                    this.f74290d.close();
                    this.f74290d = null;
                }
                if (this.f74290d == null) {
                    this.f74290d = new C20388i90(this.f74287a, Long.toString(f74286g.getAndIncrement()), httpRoute, this.f74289c.createConnection(), 0L, TimeUnit.MILLISECONDS);
                }
                if (this.f74290d.isExpired(System.currentTimeMillis())) {
                    this.f74290d.close();
                    this.f74290d.m31033c().reset();
                }
                c17973Kn0 = new C17973Kn0(this, this.f74289c, this.f74290d);
                this.f74291e = c17973Kn0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c17973Kn0;
    }

    /* renamed from: c */
    public final void m24838c(HttpClientConnection httpClientConnection) {
        try {
            httpClientConnection.shutdown();
        } catch (IOException e) {
            if (this.f74287a.isDebugEnabled()) {
                this.f74287a.debug("I/O exception shutting down connection", e);
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        synchronized (this) {
            try {
                m24840a();
                long currentTimeMillis = System.currentTimeMillis();
                C20388i90 c20388i90 = this.f74290d;
                if (c20388i90 != null && c20388i90.isExpired(currentTimeMillis)) {
                    this.f74290d.close();
                    this.f74290d.m31033c().reset();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        synchronized (this) {
            try {
                m24840a();
                long millis = timeUnit.toMillis(j);
                if (millis < 0) {
                    millis = 0;
                }
                long currentTimeMillis = System.currentTimeMillis() - millis;
                C20388i90 c20388i90 = this.f74290d;
                if (c20388i90 != null && c20388i90.getUpdated() <= currentTimeMillis) {
                    this.f74290d.close();
                    this.f74290d.m31033c().reset();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry);
    }

    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.f74288b;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        boolean z;
        TimeUnit timeUnit2;
        String str;
        Args.check(managedClientConnection instanceof C17973Kn0, "Connection class mismatch, connection not obtained from this manager");
        C17973Kn0 c17973Kn0 = (C17973Kn0) managedClientConnection;
        synchronized (c17973Kn0) {
            try {
                if (this.f74287a.isDebugEnabled()) {
                    this.f74287a.debug("Releasing connection " + managedClientConnection);
                }
                if (c17973Kn0.m67662k() == null) {
                    return;
                }
                if (c17973Kn0.m67663j() == this) {
                    z = true;
                } else {
                    z = false;
                }
                Asserts.check(z, "Connection not obtained from this manager");
                synchronized (this) {
                    if (this.f74292f) {
                        m24838c(c17973Kn0);
                        return;
                    }
                    try {
                        if (c17973Kn0.isOpen() && !c17973Kn0.isMarkedReusable()) {
                            m24838c(c17973Kn0);
                        }
                        if (c17973Kn0.isMarkedReusable()) {
                            C20388i90 c20388i90 = this.f74290d;
                            if (timeUnit != null) {
                                timeUnit2 = timeUnit;
                            } else {
                                timeUnit2 = TimeUnit.MILLISECONDS;
                            }
                            c20388i90.updateExpiry(j, timeUnit2);
                            if (this.f74287a.isDebugEnabled()) {
                                if (j > 0) {
                                    str = "for " + j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + timeUnit;
                                } else {
                                    str = "indefinitely";
                                }
                                this.f74287a.debug("Connection can be kept alive " + str);
                            }
                        }
                        c17973Kn0.m67667b();
                        this.f74291e = null;
                        if (this.f74290d.isClosed()) {
                            this.f74290d = null;
                        }
                    } catch (Throwable th2) {
                        c17973Kn0.m67667b();
                        this.f74291e = null;
                        if (this.f74290d.isClosed()) {
                            this.f74290d = null;
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        return new C12589a(httpRoute, obj);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        synchronized (this) {
            try {
                this.f74292f = true;
                C20388i90 c20388i90 = this.f74290d;
                if (c20388i90 != null) {
                    c20388i90.close();
                }
                this.f74290d = null;
                this.f74291e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public BasicClientConnectionManager() {
        this(SchemeRegistryFactory.createDefault());
    }
}