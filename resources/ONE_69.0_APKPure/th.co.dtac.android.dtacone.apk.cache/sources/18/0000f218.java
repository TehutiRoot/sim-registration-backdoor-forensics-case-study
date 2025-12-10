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
    public final Log f74296a;

    /* renamed from: b */
    public final HttpClientConnectionOperator f74297b;

    /* renamed from: c */
    public final HttpConnectionFactory f74298c;

    /* renamed from: d */
    public ManagedHttpClientConnection f74299d;

    /* renamed from: e */
    public HttpRoute f74300e;

    /* renamed from: f */
    public Object f74301f;

    /* renamed from: g */
    public long f74302g;

    /* renamed from: h */
    public long f74303h;

    /* renamed from: i */
    public boolean f74304i;

    /* renamed from: j */
    public SocketConfig f74305j;

    /* renamed from: k */
    public ConnectionConfig f74306k;

    /* renamed from: l */
    public final AtomicBoolean f74307l;

    /* renamed from: org.apache.http.impl.conn.BasicHttpClientConnectionManager$a */
    /* loaded from: classes6.dex */
    public class C12590a implements ConnectionRequest {

        /* renamed from: a */
        public final /* synthetic */ HttpRoute f74308a;

        /* renamed from: b */
        public final /* synthetic */ Object f74309b;

        public C12590a(HttpRoute httpRoute, Object obj) {
            this.f74308a = httpRoute;
            this.f74309b = obj;
        }

        @Override // org.apache.http.concurrent.Cancellable
        public boolean cancel() {
            return false;
        }

        @Override // org.apache.http.conn.ConnectionRequest
        public HttpClientConnection get(long j, TimeUnit timeUnit) {
            return BasicHttpClientConnectionManager.this.m24835g(this.f74308a, this.f74309b);
        }
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, SchemePortResolver schemePortResolver, DnsResolver dnsResolver) {
        this(new DefaultHttpClientConnectionOperator(lookup, schemePortResolver, dnsResolver), httpConnectionFactory);
    }

    /* renamed from: i */
    private static Registry m24834i() {
        return RegistryBuilder.create().register("http", PlainConnectionSocketFactory.getSocketFactory()).register(UriUtil.HTTPS_SCHEME, SSLConnectionSocketFactory.getSocketFactory()).build();
    }

    /* renamed from: b */
    public final void m24837b() {
        if (this.f74299d != null && System.currentTimeMillis() >= this.f74303h) {
            if (this.f74296a.isDebugEnabled()) {
                Log log = this.f74296a;
                log.debug("Connection expired @ " + new Date(this.f74303h));
            }
            m24836d();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f74307l.compareAndSet(false, true)) {
            m24836d();
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public synchronized void closeExpiredConnections() {
        if (this.f74307l.get()) {
            return;
        }
        if (!this.f74304i) {
            m24837b();
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public synchronized void closeIdleConnections(long j, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        if (this.f74307l.get()) {
            return;
        }
        if (!this.f74304i) {
            long millis = timeUnit.toMillis(j);
            if (millis < 0) {
                millis = 0;
            }
            if (this.f74302g <= System.currentTimeMillis() - millis) {
                m24836d();
            }
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void connect(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i, HttpContext httpContext) throws IOException {
        boolean z;
        HttpHost targetHost;
        Args.notNull(httpClientConnection, "Connection");
        Args.notNull(httpRoute, "HTTP route");
        if (httpClientConnection == this.f74299d) {
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
        this.f74297b.connect(this.f74299d, httpHost, httpRoute.getLocalSocketAddress(), i, this.f74305j, httpContext);
    }

    /* renamed from: d */
    public final synchronized void m24836d() {
        if (this.f74299d != null) {
            this.f74296a.debug("Closing connection");
            try {
                this.f74299d.close();
            } catch (IOException e) {
                if (this.f74296a.isDebugEnabled()) {
                    this.f74296a.debug("I/O exception closing connection", e);
                }
            }
            this.f74299d = null;
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
    public synchronized HttpClientConnection m24835g(HttpRoute httpRoute, Object obj) {
        try {
            Asserts.check(!this.f74307l.get(), "Connection manager has been shut down");
            if (this.f74296a.isDebugEnabled()) {
                Log log = this.f74296a;
                log.debug("Get connection for route " + httpRoute);
            }
            Asserts.check(!this.f74304i, "Connection is still allocated");
            if (!LangUtils.equals(this.f74300e, httpRoute) || !LangUtils.equals(this.f74301f, obj)) {
                m24836d();
            }
            this.f74300e = httpRoute;
            this.f74301f = obj;
            m24837b();
            if (this.f74299d == null) {
                this.f74299d = (ManagedHttpClientConnection) this.f74298c.create(httpRoute, this.f74306k);
            }
            this.f74299d.setSocketTimeout(this.f74305j.getSoTimeout());
            this.f74304i = true;
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74299d;
    }

    public synchronized ConnectionConfig getConnectionConfig() {
        return this.f74306k;
    }

    public synchronized SocketConfig getSocketConfig() {
        return this.f74305j;
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public synchronized void releaseConnection(HttpClientConnection httpClientConnection, Object obj, long j, TimeUnit timeUnit) {
        boolean z;
        String str;
        try {
            Args.notNull(httpClientConnection, "Connection");
            if (httpClientConnection == this.f74299d) {
                z = true;
            } else {
                z = false;
            }
            Asserts.check(z, "Connection not obtained from this manager");
            if (this.f74296a.isDebugEnabled()) {
                this.f74296a.debug("Releasing connection " + httpClientConnection);
            }
            if (this.f74307l.get()) {
                return;
            }
            this.f74302g = System.currentTimeMillis();
            if (!this.f74299d.isOpen()) {
                this.f74300e = null;
                this.f74299d = null;
                this.f74303h = Long.MAX_VALUE;
            } else {
                this.f74301f = obj;
                this.f74299d.setSocketTimeout(0);
                if (this.f74296a.isDebugEnabled()) {
                    if (j > 0) {
                        str = "for " + j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + timeUnit;
                    } else {
                        str = "indefinitely";
                    }
                    this.f74296a.debug("Connection can be kept alive " + str);
                }
                if (j > 0) {
                    this.f74303h = this.f74302g + timeUnit.toMillis(j);
                } else {
                    this.f74303h = Long.MAX_VALUE;
                }
            }
            this.f74304i = false;
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
        this.f74306k = connectionConfig;
    }

    public synchronized void setSocketConfig(SocketConfig socketConfig) {
        if (socketConfig == null) {
            socketConfig = SocketConfig.DEFAULT;
        }
        this.f74305j = socketConfig;
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void shutdown() {
        if (this.f74307l.compareAndSet(false, true) && this.f74299d != null) {
            this.f74296a.debug("Shutting down connection");
            try {
                this.f74299d.shutdown();
            } catch (IOException e) {
                if (this.f74296a.isDebugEnabled()) {
                    this.f74296a.debug("I/O exception shutting down connection", e);
                }
            }
            this.f74299d = null;
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void upgrade(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) throws IOException {
        boolean z;
        Args.notNull(httpClientConnection, "Connection");
        Args.notNull(httpRoute, "HTTP route");
        if (httpClientConnection == this.f74299d) {
            z = true;
        } else {
            z = false;
        }
        Asserts.check(z, "Connection not obtained from this manager");
        this.f74297b.upgrade(this.f74299d, httpRoute.getTargetHost(), httpContext);
    }

    public BasicHttpClientConnectionManager(HttpClientConnectionOperator httpClientConnectionOperator, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this.f74296a = LogFactory.getLog(getClass());
        this.f74297b = (HttpClientConnectionOperator) Args.notNull(httpClientConnectionOperator, "Connection operator");
        this.f74298c = httpConnectionFactory == null ? ManagedHttpClientConnectionFactory.INSTANCE : httpConnectionFactory;
        this.f74303h = Long.MAX_VALUE;
        this.f74305j = SocketConfig.DEFAULT;
        this.f74306k = ConnectionConfig.DEFAULT;
        this.f74307l = new AtomicBoolean(false);
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this(lookup, httpConnectionFactory, null, null);
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup) {
        this(lookup, null, null, null);
    }

    public BasicHttpClientConnectionManager() {
        this(m24834i(), null, null, null);
    }
}