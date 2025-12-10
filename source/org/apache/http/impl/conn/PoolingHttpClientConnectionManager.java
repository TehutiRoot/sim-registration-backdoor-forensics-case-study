package org.apache.http.impl.conn;

import com.google.firebase.perf.util.Constants;
import com.zxy.tiny.common.UriUtil;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.HttpClientConnectionOperator;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.pool.ConnFactory;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolEntry;
import org.apache.http.pool.PoolEntryCallback;
import org.apache.http.pool.PoolStats;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes6.dex */
public class PoolingHttpClientConnectionManager implements HttpClientConnectionManager, ConnPoolControl<HttpRoute>, Closeable {

    /* renamed from: a */
    public final Log f74282a;

    /* renamed from: b */
    public final C12595c f74283b;

    /* renamed from: c */
    public final C10483ig f74284c;

    /* renamed from: d */
    public final HttpClientConnectionOperator f74285d;

    /* renamed from: e */
    public final AtomicBoolean f74286e;

    /* renamed from: org.apache.http.impl.conn.PoolingHttpClientConnectionManager$a */
    /* loaded from: classes6.dex */
    public class C12593a implements ConnectionRequest {

        /* renamed from: a */
        public final /* synthetic */ Future f74287a;

        /* renamed from: b */
        public final /* synthetic */ HttpRoute f74288b;

        public C12593a(Future future, HttpRoute httpRoute) {
            this.f74287a = future;
            this.f74288b = httpRoute;
        }

        @Override // org.apache.http.concurrent.Cancellable
        public boolean cancel() {
            return this.f74287a.cancel(true);
        }

        @Override // org.apache.http.conn.ConnectionRequest
        public HttpClientConnection get(long j, TimeUnit timeUnit) {
            HttpHost targetHost;
            HttpClientConnection leaseConnection = PoolingHttpClientConnectionManager.this.leaseConnection(this.f74287a, j, timeUnit);
            if (leaseConnection.isOpen()) {
                if (this.f74288b.getProxyHost() != null) {
                    targetHost = this.f74288b.getProxyHost();
                } else {
                    targetHost = this.f74288b.getTargetHost();
                }
                leaseConnection.setSocketTimeout(PoolingHttpClientConnectionManager.this.m24629l(targetHost).getSoTimeout());
            }
            return leaseConnection;
        }
    }

    /* renamed from: org.apache.http.impl.conn.PoolingHttpClientConnectionManager$b */
    /* loaded from: classes6.dex */
    public class C12594b implements PoolEntryCallback {
        public C12594b() {
        }

        @Override // org.apache.http.pool.PoolEntryCallback
        public void process(PoolEntry poolEntry) {
            ManagedHttpClientConnection managedHttpClientConnection = (ManagedHttpClientConnection) poolEntry.getConnection();
            if (managedHttpClientConnection != null) {
                try {
                    managedHttpClientConnection.shutdown();
                } catch (IOException e) {
                    if (PoolingHttpClientConnectionManager.this.f74282a.isDebugEnabled()) {
                        PoolingHttpClientConnectionManager.this.f74282a.debug("I/O exception shutting down connection", e);
                    }
                }
            }
        }
    }

    /* renamed from: org.apache.http.impl.conn.PoolingHttpClientConnectionManager$c */
    /* loaded from: classes6.dex */
    public static class C12595c {

        /* renamed from: a */
        public final Map f74291a = new ConcurrentHashMap();

        /* renamed from: b */
        public final Map f74292b = new ConcurrentHashMap();

        /* renamed from: c */
        public volatile SocketConfig f74293c;

        /* renamed from: d */
        public volatile ConnectionConfig f74294d;

        /* renamed from: a */
        public ConnectionConfig m24628a(HttpHost httpHost) {
            return (ConnectionConfig) this.f74292b.get(httpHost);
        }

        /* renamed from: b */
        public ConnectionConfig m24627b() {
            return this.f74294d;
        }

        /* renamed from: c */
        public SocketConfig m24626c() {
            return this.f74293c;
        }

        /* renamed from: d */
        public SocketConfig m24625d(HttpHost httpHost) {
            return (SocketConfig) this.f74291a.get(httpHost);
        }

        /* renamed from: e */
        public void m24624e(HttpHost httpHost, ConnectionConfig connectionConfig) {
            this.f74292b.put(httpHost, connectionConfig);
        }

        /* renamed from: f */
        public void m24623f(ConnectionConfig connectionConfig) {
            this.f74294d = connectionConfig;
        }

        /* renamed from: g */
        public void m24622g(SocketConfig socketConfig) {
            this.f74293c = socketConfig;
        }

        /* renamed from: h */
        public void m24621h(HttpHost httpHost, SocketConfig socketConfig) {
            this.f74291a.put(httpHost, socketConfig);
        }
    }

    /* renamed from: org.apache.http.impl.conn.PoolingHttpClientConnectionManager$d */
    /* loaded from: classes6.dex */
    public static class C12596d implements ConnFactory {

        /* renamed from: a */
        public final C12595c f74295a;

        /* renamed from: b */
        public final HttpConnectionFactory f74296b;

        public C12596d(C12595c c12595c, HttpConnectionFactory httpConnectionFactory) {
            this.f74295a = c12595c == null ? new C12595c() : c12595c;
            this.f74296b = httpConnectionFactory == null ? ManagedHttpClientConnectionFactory.INSTANCE : httpConnectionFactory;
        }

        @Override // org.apache.http.pool.ConnFactory
        /* renamed from: a */
        public ManagedHttpClientConnection create(HttpRoute httpRoute) {
            ConnectionConfig connectionConfig;
            if (httpRoute.getProxyHost() != null) {
                connectionConfig = this.f74295a.m24628a(httpRoute.getProxyHost());
            } else {
                connectionConfig = null;
            }
            if (connectionConfig == null) {
                connectionConfig = this.f74295a.m24628a(httpRoute.getTargetHost());
            }
            if (connectionConfig == null) {
                connectionConfig = this.f74295a.m24627b();
            }
            if (connectionConfig == null) {
                connectionConfig = ConnectionConfig.DEFAULT;
            }
            return (ManagedHttpClientConnection) this.f74296b.create(httpRoute, connectionConfig);
        }
    }

    public PoolingHttpClientConnectionManager() {
        this(m24630k());
    }

    /* renamed from: i */
    private String m24632i(HttpRoute httpRoute, Object obj) {
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

    /* renamed from: j */
    private String m24631j(HttpRoute httpRoute) {
        StringBuilder sb = new StringBuilder();
        PoolStats totalStats = this.f74284c.getTotalStats();
        PoolStats stats = this.f74284c.getStats(httpRoute);
        sb.append("[total available: ");
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

    /* renamed from: k */
    public static Registry m24630k() {
        return RegistryBuilder.create().register("http", PlainConnectionSocketFactory.getSocketFactory()).register(UriUtil.HTTPS_SCHEME, SSLConnectionSocketFactory.getSocketFactory()).build();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown();
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void closeExpiredConnections() {
        this.f74282a.debug("Closing expired connections");
        this.f74284c.closeExpired();
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        if (this.f74282a.isDebugEnabled()) {
            Log log = this.f74282a;
            log.debug("Closing connections idle longer than " + j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + timeUnit);
        }
        this.f74284c.closeIdle(j, timeUnit);
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void connect(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i, HttpContext httpContext) throws IOException {
        ManagedHttpClientConnection managedHttpClientConnection;
        HttpHost targetHost;
        Args.notNull(httpClientConnection, "Managed Connection");
        Args.notNull(httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            managedHttpClientConnection = (ManagedHttpClientConnection) C11670kg.m28886j(httpClientConnection).getConnection();
        }
        if (httpRoute.getProxyHost() != null) {
            targetHost = httpRoute.getProxyHost();
        } else {
            targetHost = httpRoute.getTargetHost();
        }
        HttpHost httpHost = targetHost;
        this.f74285d.connect(managedHttpClientConnection, httpHost, httpRoute.getLocalSocketAddress(), i, m24629l(httpHost), httpContext);
    }

    public void enumAvailable(PoolEntryCallback<HttpRoute, ManagedHttpClientConnection> poolEntryCallback) {
        this.f74284c.enumAvailable(poolEntryCallback);
    }

    public void enumLeased(PoolEntryCallback<HttpRoute, ManagedHttpClientConnection> poolEntryCallback) {
        this.f74284c.enumLeased(poolEntryCallback);
    }

    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final String m24633g(C11550jg c11550jg) {
        StringBuilder sb = new StringBuilder();
        sb.append("[id: ");
        sb.append(c11550jg.getId());
        sb.append("]");
        sb.append("[route: ");
        sb.append(c11550jg.getRoute());
        sb.append("]");
        Object state = c11550jg.getState();
        if (state != null) {
            sb.append("[state: ");
            sb.append(state);
            sb.append("]");
        }
        return sb.toString();
    }

    public ConnectionConfig getConnectionConfig(HttpHost httpHost) {
        return this.f74283b.m24628a(httpHost);
    }

    public ConnectionConfig getDefaultConnectionConfig() {
        return this.f74283b.m24627b();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getDefaultMaxPerRoute() {
        return this.f74284c.getDefaultMaxPerRoute();
    }

    public SocketConfig getDefaultSocketConfig() {
        return this.f74283b.m24626c();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxTotal() {
        return this.f74284c.getMaxTotal();
    }

    public Set<HttpRoute> getRoutes() {
        return this.f74284c.getRoutes();
    }

    public SocketConfig getSocketConfig(HttpHost httpHost) {
        return this.f74283b.m24625d(httpHost);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getTotalStats() {
        return this.f74284c.getTotalStats();
    }

    public int getValidateAfterInactivity() {
        return this.f74284c.getValidateAfterInactivity();
    }

    /* renamed from: l */
    public final SocketConfig m24629l(HttpHost httpHost) {
        SocketConfig m24625d = this.f74283b.m24625d(httpHost);
        if (m24625d == null) {
            m24625d = this.f74283b.m24626c();
        }
        if (m24625d == null) {
            return SocketConfig.DEFAULT;
        }
        return m24625d;
    }

    public HttpClientConnection leaseConnection(Future<C11550jg> future, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, ConnectionPoolTimeoutException {
        boolean z;
        try {
            C11550jg c11550jg = future.get(j, timeUnit);
            if (c11550jg != null && !future.isCancelled()) {
                if (c11550jg.getConnection() != null) {
                    z = true;
                } else {
                    z = false;
                }
                Asserts.check(z, "Pool entry with no connection");
                if (this.f74282a.isDebugEnabled()) {
                    Log log = this.f74282a;
                    log.debug("Connection leased: " + m24633g(c11550jg) + m24631j((HttpRoute) c11550jg.getRoute()));
                }
                return C11670kg.m28883m(c11550jg);
            }
            throw new ExecutionException(new CancellationException("Operation cancelled"));
        } catch (TimeoutException unused) {
            throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void releaseConnection(HttpClientConnection httpClientConnection, Object obj, long j, TimeUnit timeUnit) {
        String str;
        Args.notNull(httpClientConnection, "Managed connection");
        synchronized (httpClientConnection) {
            try {
                C11550jg m28889d = C11670kg.m28889d(httpClientConnection);
                if (m28889d == null) {
                    return;
                }
                ManagedHttpClientConnection managedHttpClientConnection = (ManagedHttpClientConnection) m28889d.getConnection();
                boolean z = true;
                if (managedHttpClientConnection.isOpen()) {
                    if (timeUnit == null) {
                        timeUnit = TimeUnit.MILLISECONDS;
                    }
                    m28889d.setState(obj);
                    m28889d.updateExpiry(j, timeUnit);
                    if (this.f74282a.isDebugEnabled()) {
                        if (j > 0) {
                            str = "for " + (timeUnit.toMillis(j) / 1000.0d) + " seconds";
                        } else {
                            str = "indefinitely";
                        }
                        this.f74282a.debug("Connection " + m24633g(m28889d) + " can be kept alive " + str);
                    }
                    managedHttpClientConnection.setSocketTimeout(0);
                }
                C10483ig c10483ig = this.f74284c;
                if (!managedHttpClientConnection.isOpen() || !m28889d.m29159b()) {
                    z = false;
                }
                c10483ig.release((C10483ig) m28889d, z);
                if (this.f74282a.isDebugEnabled()) {
                    this.f74282a.debug("Connection released: " + m24633g(m28889d) + m24631j((HttpRoute) m28889d.getRoute()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public ConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        Args.notNull(httpRoute, "HTTP route");
        if (this.f74282a.isDebugEnabled()) {
            Log log = this.f74282a;
            log.debug("Connection request: " + m24632i(httpRoute, obj) + m24631j(httpRoute));
        }
        Asserts.check(!this.f74286e.get(), "Connection pool shut down");
        return new C12593a(this.f74284c.lease(httpRoute, obj, null), httpRoute);
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void routeComplete(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) throws IOException {
        Args.notNull(httpClientConnection, "Managed Connection");
        Args.notNull(httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            C11670kg.m28886j(httpClientConnection).m29158c();
        }
    }

    public void setConnectionConfig(HttpHost httpHost, ConnectionConfig connectionConfig) {
        this.f74283b.m24624e(httpHost, connectionConfig);
    }

    public void setDefaultConnectionConfig(ConnectionConfig connectionConfig) {
        this.f74283b.m24623f(connectionConfig);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setDefaultMaxPerRoute(int i) {
        this.f74284c.setDefaultMaxPerRoute(i);
    }

    public void setDefaultSocketConfig(SocketConfig socketConfig) {
        this.f74283b.m24622g(socketConfig);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxTotal(int i) {
        this.f74284c.setMaxTotal(i);
    }

    public void setSocketConfig(HttpHost httpHost, SocketConfig socketConfig) {
        this.f74283b.m24621h(httpHost, socketConfig);
    }

    public void setValidateAfterInactivity(int i) {
        this.f74284c.setValidateAfterInactivity(i);
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void shutdown() {
        if (this.f74286e.compareAndSet(false, true)) {
            this.f74282a.debug("Connection manager is shutting down");
            try {
                this.f74284c.enumLeased(new C12594b());
                this.f74284c.shutdown();
            } catch (IOException e) {
                this.f74282a.debug("I/O exception shutting down connection manager", e);
            }
            this.f74282a.debug("Connection manager shut down");
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void upgrade(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) throws IOException {
        ManagedHttpClientConnection managedHttpClientConnection;
        Args.notNull(httpClientConnection, "Managed Connection");
        Args.notNull(httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            managedHttpClientConnection = (ManagedHttpClientConnection) C11670kg.m28886j(httpClientConnection).getConnection();
        }
        this.f74285d.upgrade(managedHttpClientConnection, httpRoute.getTargetHost(), httpContext);
    }

    public PoolingHttpClientConnectionManager(long j, TimeUnit timeUnit) {
        this(m24630k(), null, null, null, j, timeUnit);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxPerRoute(HttpRoute httpRoute) {
        return this.f74284c.getMaxPerRoute(httpRoute);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getStats(HttpRoute httpRoute) {
        return this.f74284c.getStats(httpRoute);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxPerRoute(HttpRoute httpRoute, int i) {
        this.f74284c.setMaxPerRoute(httpRoute, i);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry) {
        this(registry, null, null);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry, DnsResolver dnsResolver) {
        this(registry, null, dnsResolver);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this(registry, httpConnectionFactory, null);
    }

    public PoolingHttpClientConnectionManager(HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this(m24630k(), httpConnectionFactory, null);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, DnsResolver dnsResolver) {
        this(registry, httpConnectionFactory, null, dnsResolver, -1L, TimeUnit.MILLISECONDS);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, SchemePortResolver schemePortResolver, DnsResolver dnsResolver, long j, TimeUnit timeUnit) {
        this(new DefaultHttpClientConnectionOperator(registry, schemePortResolver, dnsResolver), httpConnectionFactory, j, timeUnit);
    }

    public PoolingHttpClientConnectionManager(HttpClientConnectionOperator httpClientConnectionOperator, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, long j, TimeUnit timeUnit) {
        this.f74282a = LogFactory.getLog(getClass());
        C12595c c12595c = new C12595c();
        this.f74283b = c12595c;
        C10483ig c10483ig = new C10483ig(new C12596d(c12595c, httpConnectionFactory), 2, 20, j, timeUnit);
        this.f74284c = c10483ig;
        c10483ig.setValidateAfterInactivity(Constants.MAX_URL_LENGTH);
        this.f74285d = (HttpClientConnectionOperator) Args.notNull(httpClientConnectionOperator, "HttpClientConnectionOperator");
        this.f74286e = new AtomicBoolean(false);
    }
}
