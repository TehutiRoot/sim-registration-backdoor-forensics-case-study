package org.apache.http.impl.conn;

import com.zxy.tiny.common.UriUtil;
import java.io.Closeable;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Lookup;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
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
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.LangUtils;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes6.dex */
public class BasicHttpClientConnectionManager implements HttpClientConnectionManager, Closeable {

    /* renamed from: a */
    public final Log f74212a;

    /* renamed from: b */
    public final HttpClientConnectionOperator f74213b;

    /* renamed from: c */
    public final HttpConnectionFactory f74214c;

    /* renamed from: d */
    public ManagedHttpClientConnection f74215d;

    /* renamed from: e */
    public HttpRoute f74216e;

    /* renamed from: f */
    public Object f74217f;

    /* renamed from: g */
    public long f74218g;

    /* renamed from: h */
    public long f74219h;

    /* renamed from: i */
    public boolean f74220i;

    /* renamed from: j */
    public SocketConfig f74221j;

    /* renamed from: k */
    public ConnectionConfig f74222k;

    /* renamed from: l */
    public final AtomicBoolean f74223l;

    /* renamed from: org.apache.http.impl.conn.BasicHttpClientConnectionManager$a */
    /* loaded from: classes6.dex */
    public class C12590a implements ConnectionRequest {

        /* renamed from: a */
        public final /* synthetic */ HttpRoute f74224a;

        /* renamed from: b */
        public final /* synthetic */ Object f74225b;

        public C12590a(HttpRoute httpRoute, Object obj) {
            this.f74224a = httpRoute;
            this.f74225b = obj;
        }

        @Override // org.apache.http.concurrent.Cancellable
        public boolean cancel() {
            return false;
        }

        @Override // org.apache.http.conn.ConnectionRequest
        public HttpClientConnection get(long j, TimeUnit timeUnit) {
            return BasicHttpClientConnectionManager.this.m24645g(this.f74224a, this.f74225b);
        }
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, SchemePortResolver schemePortResolver, DnsResolver dnsResolver) {
        this(new DefaultHttpClientConnectionOperator(lookup, schemePortResolver, dnsResolver), httpConnectionFactory);
    }

    /* renamed from: i */
    private static Registry m24644i() {
        return RegistryBuilder.create().register("http", PlainConnectionSocketFactory.getSocketFactory()).register(UriUtil.HTTPS_SCHEME, SSLConnectionSocketFactory.getSocketFactory()).build();
    }

    /* renamed from: b */
    public final void m24647b() {
        if (this.f74215d != null && System.currentTimeMillis() >= this.f74219h) {
            if (this.f74212a.isDebugEnabled()) {
                Log log = this.f74212a;
                log.debug("Connection expired @ " + new Date(this.f74219h));
            }
            m24646d();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f74223l.compareAndSet(false, true)) {
            m24646d();
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public synchronized void closeExpiredConnections() {
        if (this.f74223l.get()) {
            return;
        }
        if (!this.f74220i) {
            m24647b();
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public synchronized void closeIdleConnections(long j, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        if (this.f74223l.get()) {
            return;
        }
        if (!this.f74220i) {
            long millis = timeUnit.toMillis(j);
            if (millis < 0) {
                millis = 0;
            }
            if (this.f74218g <= System.currentTimeMillis() - millis) {
                m24646d();
            }
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void connect(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i, HttpContext httpContext) throws IOException {
        boolean z;
        HttpHost targetHost;
        Args.notNull(httpClientConnection, "Connection");
        Args.notNull(httpRoute, "HTTP route");
        if (httpClientConnection == this.f74215d) {
            z = true;
        } else {
            z = false;
        }
        Asserts.check(z, "Connection not obtained from this manager");
        if (httpRoute.getProxyHost() != null) {
            targetHost = httpRoute.getProxyHost();
        } else {
            targetHost = httpRoute.getTargetHost();
        }
        HttpHost httpHost = targetHost;
        this.f74213b.connect(this.f74215d, httpHost, httpRoute.getLocalSocketAddress(), i, this.f74221j, httpContext);
    }

    /* renamed from: d */
    public final synchronized void m24646d() {
        if (this.f74215d != null) {
            this.f74212a.debug("Closing connection");
            try {
                this.f74215d.close();
            } catch (IOException e) {
                if (this.f74212a.isDebugEnabled()) {
                    this.f74212a.debug("I/O exception closing connection", e);
                }
            }
            this.f74215d = null;
        }
    }

    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public synchronized HttpClientConnection m24645g(HttpRoute httpRoute, Object obj) {
        try {
            Asserts.check(!this.f74223l.get(), "Connection manager has been shut down");
            if (this.f74212a.isDebugEnabled()) {
                Log log = this.f74212a;
                log.debug("Get connection for route " + httpRoute);
            }
            Asserts.check(!this.f74220i, "Connection is still allocated");
            if (!LangUtils.equals(this.f74216e, httpRoute) || !LangUtils.equals(this.f74217f, obj)) {
                m24646d();
            }
            this.f74216e = httpRoute;
            this.f74217f = obj;
            m24647b();
            if (this.f74215d == null) {
                this.f74215d = (ManagedHttpClientConnection) this.f74214c.create(httpRoute, this.f74222k);
            }
            this.f74215d.setSocketTimeout(this.f74221j.getSoTimeout());
            this.f74220i = true;
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74215d;
    }

    public synchronized ConnectionConfig getConnectionConfig() {
        return this.f74222k;
    }

    public synchronized SocketConfig getSocketConfig() {
        return this.f74221j;
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public synchronized void releaseConnection(HttpClientConnection httpClientConnection, Object obj, long j, TimeUnit timeUnit) {
        boolean z;
        String str;
        try {
            Args.notNull(httpClientConnection, "Connection");
            if (httpClientConnection == this.f74215d) {
                z = true;
            } else {
                z = false;
            }
            Asserts.check(z, "Connection not obtained from this manager");
            if (this.f74212a.isDebugEnabled()) {
                this.f74212a.debug("Releasing connection " + httpClientConnection);
            }
            if (this.f74223l.get()) {
                return;
            }
            this.f74218g = System.currentTimeMillis();
            if (!this.f74215d.isOpen()) {
                this.f74216e = null;
                this.f74215d = null;
                this.f74219h = Long.MAX_VALUE;
            } else {
                this.f74217f = obj;
                this.f74215d.setSocketTimeout(0);
                if (this.f74212a.isDebugEnabled()) {
                    if (j > 0) {
                        str = "for " + j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + timeUnit;
                    } else {
                        str = "indefinitely";
                    }
                    this.f74212a.debug("Connection can be kept alive " + str);
                }
                if (j > 0) {
                    this.f74219h = this.f74218g + timeUnit.toMillis(j);
                } else {
                    this.f74219h = Long.MAX_VALUE;
                }
            }
            this.f74220i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public final ConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        Args.notNull(httpRoute, "Route");
        return new C12590a(httpRoute, obj);
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void routeComplete(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) throws IOException {
    }

    public synchronized void setConnectionConfig(ConnectionConfig connectionConfig) {
        if (connectionConfig == null) {
            connectionConfig = ConnectionConfig.DEFAULT;
        }
        this.f74222k = connectionConfig;
    }

    public synchronized void setSocketConfig(SocketConfig socketConfig) {
        if (socketConfig == null) {
            socketConfig = SocketConfig.DEFAULT;
        }
        this.f74221j = socketConfig;
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void shutdown() {
        if (this.f74223l.compareAndSet(false, true) && this.f74215d != null) {
            this.f74212a.debug("Shutting down connection");
            try {
                this.f74215d.shutdown();
            } catch (IOException e) {
                if (this.f74212a.isDebugEnabled()) {
                    this.f74212a.debug("I/O exception shutting down connection", e);
                }
            }
            this.f74215d = null;
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void upgrade(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) throws IOException {
        boolean z;
        Args.notNull(httpClientConnection, "Connection");
        Args.notNull(httpRoute, "HTTP route");
        if (httpClientConnection == this.f74215d) {
            z = true;
        } else {
            z = false;
        }
        Asserts.check(z, "Connection not obtained from this manager");
        this.f74213b.upgrade(this.f74215d, httpRoute.getTargetHost(), httpContext);
    }

    public BasicHttpClientConnectionManager(HttpClientConnectionOperator httpClientConnectionOperator, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this.f74212a = LogFactory.getLog(getClass());
        this.f74213b = (HttpClientConnectionOperator) Args.notNull(httpClientConnectionOperator, "Connection operator");
        this.f74214c = httpConnectionFactory == null ? ManagedHttpClientConnectionFactory.INSTANCE : httpConnectionFactory;
        this.f74219h = Long.MAX_VALUE;
        this.f74221j = SocketConfig.DEFAULT;
        this.f74222k = ConnectionConfig.DEFAULT;
        this.f74223l = new AtomicBoolean(false);
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this(lookup, httpConnectionFactory, null, null);
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup) {
        this(lookup, null, null, null);
    }

    public BasicHttpClientConnectionManager() {
        this(m24644i(), null, null, null);
    }
}
