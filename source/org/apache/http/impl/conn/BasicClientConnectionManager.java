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
    public static final AtomicLong f74202g = new AtomicLong();

    /* renamed from: a */
    public final Log f74203a;

    /* renamed from: b */
    public final SchemeRegistry f74204b;

    /* renamed from: c */
    public final ClientConnectionOperator f74205c;

    /* renamed from: d */
    public C19302c90 f74206d;

    /* renamed from: e */
    public C17555En0 f74207e;

    /* renamed from: f */
    public volatile boolean f74208f;

    /* renamed from: org.apache.http.impl.conn.BasicClientConnectionManager$a */
    /* loaded from: classes6.dex */
    public class C12589a implements ClientConnectionRequest {

        /* renamed from: a */
        public final /* synthetic */ HttpRoute f74209a;

        /* renamed from: b */
        public final /* synthetic */ Object f74210b;

        public C12589a(HttpRoute httpRoute, Object obj) {
            this.f74209a = httpRoute;
            this.f74210b = obj;
        }

        @Override // org.apache.http.conn.ClientConnectionRequest
        public void abortRequest() {
        }

        @Override // org.apache.http.conn.ClientConnectionRequest
        public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
            return BasicClientConnectionManager.this.m24649b(this.f74209a, this.f74210b);
        }
    }

    public BasicClientConnectionManager(SchemeRegistry schemeRegistry) {
        this.f74203a = LogFactory.getLog(getClass());
        Args.notNull(schemeRegistry, "Scheme registry");
        this.f74204b = schemeRegistry;
        this.f74205c = createConnectionOperator(schemeRegistry);
    }

    /* renamed from: a */
    public final void m24650a() {
        Asserts.check(!this.f74208f, "Connection manager has been shut down");
    }

    /* renamed from: b */
    public ManagedClientConnection m24649b(HttpRoute httpRoute, Object obj) {
        boolean z;
        C17555En0 c17555En0;
        Args.notNull(httpRoute, "Route");
        synchronized (this) {
            try {
                m24650a();
                if (this.f74203a.isDebugEnabled()) {
                    Log log = this.f74203a;
                    log.debug("Get connection for route " + httpRoute);
                }
                if (this.f74207e == null) {
                    z = true;
                } else {
                    z = false;
                }
                Asserts.check(z, MISUSE_MESSAGE);
                C19302c90 c19302c90 = this.f74206d;
                if (c19302c90 != null && !c19302c90.m51703b().equals(httpRoute)) {
                    this.f74206d.close();
                    this.f74206d = null;
                }
                if (this.f74206d == null) {
                    this.f74206d = new C19302c90(this.f74203a, Long.toString(f74202g.getAndIncrement()), httpRoute, this.f74205c.createConnection(), 0L, TimeUnit.MILLISECONDS);
                }
                if (this.f74206d.isExpired(System.currentTimeMillis())) {
                    this.f74206d.close();
                    this.f74206d.m51702c().reset();
                }
                c17555En0 = new C17555En0(this, this.f74205c, this.f74206d);
                this.f74207e = c17555En0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c17555En0;
    }

    /* renamed from: c */
    public final void m24648c(HttpClientConnection httpClientConnection) {
        try {
            httpClientConnection.shutdown();
        } catch (IOException e) {
            if (this.f74203a.isDebugEnabled()) {
                this.f74203a.debug("I/O exception shutting down connection", e);
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        synchronized (this) {
            try {
                m24650a();
                long currentTimeMillis = System.currentTimeMillis();
                C19302c90 c19302c90 = this.f74206d;
                if (c19302c90 != null && c19302c90.isExpired(currentTimeMillis)) {
                    this.f74206d.close();
                    this.f74206d.m51702c().reset();
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
                m24650a();
                long millis = timeUnit.toMillis(j);
                if (millis < 0) {
                    millis = 0;
                }
                long currentTimeMillis = System.currentTimeMillis() - millis;
                C19302c90 c19302c90 = this.f74206d;
                if (c19302c90 != null && c19302c90.getUpdated() <= currentTimeMillis) {
                    this.f74206d.close();
                    this.f74206d.m51702c().reset();
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
        return this.f74204b;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        boolean z;
        TimeUnit timeUnit2;
        String str;
        Args.check(managedClientConnection instanceof C17555En0, "Connection class mismatch, connection not obtained from this manager");
        C17555En0 c17555En0 = (C17555En0) managedClientConnection;
        synchronized (c17555En0) {
            try {
                if (this.f74203a.isDebugEnabled()) {
                    this.f74203a.debug("Releasing connection " + managedClientConnection);
                }
                if (c17555En0.m68459k() == null) {
                    return;
                }
                if (c17555En0.m68460j() == this) {
                    z = true;
                } else {
                    z = false;
                }
                Asserts.check(z, "Connection not obtained from this manager");
                synchronized (this) {
                    if (this.f74208f) {
                        m24648c(c17555En0);
                        return;
                    }
                    try {
                        if (c17555En0.isOpen() && !c17555En0.isMarkedReusable()) {
                            m24648c(c17555En0);
                        }
                        if (c17555En0.isMarkedReusable()) {
                            C19302c90 c19302c90 = this.f74206d;
                            if (timeUnit != null) {
                                timeUnit2 = timeUnit;
                            } else {
                                timeUnit2 = TimeUnit.MILLISECONDS;
                            }
                            c19302c90.updateExpiry(j, timeUnit2);
                            if (this.f74203a.isDebugEnabled()) {
                                if (j > 0) {
                                    str = "for " + j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + timeUnit;
                                } else {
                                    str = "indefinitely";
                                }
                                this.f74203a.debug("Connection can be kept alive " + str);
                            }
                        }
                        c17555En0.m68464b();
                        this.f74207e = null;
                        if (this.f74206d.isClosed()) {
                            this.f74206d = null;
                        }
                    } catch (Throwable th2) {
                        c17555En0.m68464b();
                        this.f74207e = null;
                        if (this.f74206d.isClosed()) {
                            this.f74206d = null;
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
                this.f74208f = true;
                C19302c90 c19302c90 = this.f74206d;
                if (c19302c90 != null) {
                    c19302c90.close();
                }
                this.f74206d = null;
                this.f74207e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public BasicClientConnectionManager() {
        this(SchemeRegistryFactory.createDefault());
    }
}
