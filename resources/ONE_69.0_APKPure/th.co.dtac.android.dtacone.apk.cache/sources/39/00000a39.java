package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.impl.conn.ConnectionShutdownException;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

/* renamed from: Kn0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17973Kn0 implements ManagedClientConnection {

    /* renamed from: a */
    public final ClientConnectionManager f3399a;

    /* renamed from: b */
    public final ClientConnectionOperator f3400b;

    /* renamed from: c */
    public volatile C20388i90 f3401c;

    /* renamed from: d */
    public volatile boolean f3402d;

    /* renamed from: e */
    public volatile long f3403e;

    public C17973Kn0(ClientConnectionManager clientConnectionManager, ClientConnectionOperator clientConnectionOperator, C20388i90 c20388i90) {
        Args.notNull(clientConnectionManager, "Connection manager");
        Args.notNull(clientConnectionOperator, "Connection operator");
        Args.notNull(c20388i90, "HTTP pool entry");
        this.f3399a = clientConnectionManager;
        this.f3400b = clientConnectionOperator;
        this.f3401c = c20388i90;
        this.f3402d = false;
        this.f3403e = Long.MAX_VALUE;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() {
        synchronized (this) {
            try {
                if (this.f3401c == null) {
                    return;
                }
                this.f3402d = false;
                try {
                    ((OperatedClientConnection) this.f3401c.getConnection()).shutdown();
                } catch (IOException unused) {
                }
                this.f3399a.releaseConnection(this, this.f3403e, TimeUnit.MILLISECONDS);
                this.f3401c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public C20388i90 m67667b() {
        C20388i90 c20388i90 = this.f3401c;
        this.f3401c = null;
        return c20388i90;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public void bind(Socket socket) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C20388i90 c20388i90 = this.f3401c;
        if (c20388i90 != null) {
            c20388i90.m31033c().reset();
            ((OperatedClientConnection) c20388i90.getConnection()).close();
        }
    }

    /* renamed from: d */
    public final OperatedClientConnection m67666d() {
        C20388i90 c20388i90 = this.f3401c;
        if (c20388i90 != null) {
            return (OperatedClientConnection) c20388i90.getConnection();
        }
        throw new ConnectionShutdownException();
    }

    @Override // org.apache.http.HttpClientConnection
    public void flush() {
        m67666d().flush();
    }

    /* renamed from: g */
    public final C20388i90 m67665g() {
        C20388i90 c20388i90 = this.f3401c;
        if (c20388i90 != null) {
            return c20388i90;
        }
        throw new ConnectionShutdownException();
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public String getId() {
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        return m67666d().getLocalAddress();
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        return m67666d().getLocalPort();
    }

    @Override // org.apache.http.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        return m67666d().getMetrics();
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        return m67666d().getRemoteAddress();
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        return m67666d().getRemotePort();
    }

    @Override // org.apache.http.conn.ManagedClientConnection, org.apache.http.conn.HttpRoutedConnection
    public HttpRoute getRoute() {
        return m67665g().m31035a();
    }

    @Override // org.apache.http.conn.ManagedClientConnection, org.apache.http.conn.HttpRoutedConnection, org.apache.http.conn.ManagedHttpClientConnection
    public SSLSession getSSLSession() {
        Socket socket = m67666d().getSocket();
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getSession();
        }
        return null;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public Socket getSocket() {
        return m67666d().getSocket();
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        return m67666d().getSocketTimeout();
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public Object getState() {
        return m67665g().getState();
    }

    /* renamed from: i */
    public final OperatedClientConnection m67664i() {
        C20388i90 c20388i90 = this.f3401c;
        if (c20388i90 == null) {
            return null;
        }
        return (OperatedClientConnection) c20388i90.getConnection();
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public boolean isMarkedReusable() {
        return this.f3402d;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        OperatedClientConnection m67664i = m67664i();
        if (m67664i != null) {
            return m67664i.isOpen();
        }
        return false;
    }

    @Override // org.apache.http.HttpClientConnection
    public boolean isResponseAvailable(int i) {
        return m67666d().isResponseAvailable(i);
    }

    @Override // org.apache.http.conn.ManagedClientConnection, org.apache.http.conn.HttpRoutedConnection
    public boolean isSecure() {
        return m67666d().isSecure();
    }

    @Override // org.apache.http.HttpConnection
    public boolean isStale() {
        OperatedClientConnection m67664i = m67664i();
        if (m67664i != null) {
            return m67664i.isStale();
        }
        return true;
    }

    /* renamed from: j */
    public ClientConnectionManager m67663j() {
        return this.f3399a;
    }

    /* renamed from: k */
    public C20388i90 m67662k() {
        return this.f3401c;
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void layerProtocol(HttpContext httpContext, HttpParams httpParams) {
        HttpHost targetHost;
        OperatedClientConnection operatedClientConnection;
        Args.notNull(httpParams, "HTTP parameters");
        synchronized (this) {
            if (this.f3401c != null) {
                RouteTracker m31033c = this.f3401c.m31033c();
                Asserts.notNull(m31033c, "Route tracker");
                Asserts.check(m31033c.isConnected(), "Connection not open");
                Asserts.check(m31033c.isTunnelled(), "Protocol layering without a tunnel not supported");
                Asserts.check(!m31033c.isLayered(), "Multiple protocol layering not supported");
                targetHost = m31033c.getTargetHost();
                operatedClientConnection = (OperatedClientConnection) this.f3401c.getConnection();
            } else {
                throw new ConnectionShutdownException();
            }
        }
        this.f3400b.updateSecureConnection(operatedClientConnection, targetHost, httpContext, httpParams);
        synchronized (this) {
            try {
                if (this.f3401c != null) {
                    this.f3401c.m31033c().layerProtocol(operatedClientConnection.isSecure());
                } else {
                    throw new InterruptedIOException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void markReusable() {
        this.f3402d = true;
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void open(HttpRoute httpRoute, HttpContext httpContext, HttpParams httpParams) {
        OperatedClientConnection operatedClientConnection;
        HttpHost targetHost;
        Args.notNull(httpRoute, "Route");
        Args.notNull(httpParams, "HTTP parameters");
        synchronized (this) {
            if (this.f3401c != null) {
                RouteTracker m31033c = this.f3401c.m31033c();
                Asserts.notNull(m31033c, "Route tracker");
                Asserts.check(!m31033c.isConnected(), "Connection already open");
                operatedClientConnection = (OperatedClientConnection) this.f3401c.getConnection();
            } else {
                throw new ConnectionShutdownException();
            }
        }
        HttpHost proxyHost = httpRoute.getProxyHost();
        ClientConnectionOperator clientConnectionOperator = this.f3400b;
        if (proxyHost != null) {
            targetHost = proxyHost;
        } else {
            targetHost = httpRoute.getTargetHost();
        }
        clientConnectionOperator.openConnection(operatedClientConnection, targetHost, httpRoute.getLocalAddress(), httpContext, httpParams);
        synchronized (this) {
            try {
                if (this.f3401c != null) {
                    RouteTracker m31033c2 = this.f3401c.m31033c();
                    if (proxyHost == null) {
                        m31033c2.connectTarget(operatedClientConnection.isSecure());
                    } else {
                        m31033c2.connectProxy(proxyHost, operatedClientConnection.isSecure());
                    }
                } else {
                    throw new InterruptedIOException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.apache.http.HttpClientConnection
    public void receiveResponseEntity(HttpResponse httpResponse) {
        m67666d().receiveResponseEntity(httpResponse);
    }

    @Override // org.apache.http.HttpClientConnection
    public HttpResponse receiveResponseHeader() {
        return m67666d().receiveResponseHeader();
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() {
        synchronized (this) {
            try {
                if (this.f3401c == null) {
                    return;
                }
                this.f3399a.releaseConnection(this, this.f3403e, TimeUnit.MILLISECONDS);
                this.f3401c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        m67666d().sendRequestEntity(httpEntityEnclosingRequest);
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestHeader(HttpRequest httpRequest) {
        m67666d().sendRequestHeader(httpRequest);
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void setIdleDuration(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.f3403e = timeUnit.toMillis(j);
        } else {
            this.f3403e = -1L;
        }
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i) {
        m67666d().setSocketTimeout(i);
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void setState(Object obj) {
        m67665g().setState(obj);
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() {
        C20388i90 c20388i90 = this.f3401c;
        if (c20388i90 != null) {
            c20388i90.m31033c().reset();
            ((OperatedClientConnection) c20388i90.getConnection()).shutdown();
        }
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void tunnelProxy(HttpHost httpHost, boolean z, HttpParams httpParams) {
        OperatedClientConnection operatedClientConnection;
        Args.notNull(httpHost, "Next proxy");
        Args.notNull(httpParams, "HTTP parameters");
        synchronized (this) {
            if (this.f3401c != null) {
                RouteTracker m31033c = this.f3401c.m31033c();
                Asserts.notNull(m31033c, "Route tracker");
                Asserts.check(m31033c.isConnected(), "Connection not open");
                operatedClientConnection = (OperatedClientConnection) this.f3401c.getConnection();
            } else {
                throw new ConnectionShutdownException();
            }
        }
        operatedClientConnection.update(null, httpHost, z, httpParams);
        synchronized (this) {
            try {
                if (this.f3401c != null) {
                    this.f3401c.m31033c().tunnelProxy(httpHost, z);
                } else {
                    throw new InterruptedIOException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void tunnelTarget(boolean z, HttpParams httpParams) {
        HttpHost targetHost;
        OperatedClientConnection operatedClientConnection;
        Args.notNull(httpParams, "HTTP parameters");
        synchronized (this) {
            if (this.f3401c != null) {
                RouteTracker m31033c = this.f3401c.m31033c();
                Asserts.notNull(m31033c, "Route tracker");
                Asserts.check(m31033c.isConnected(), "Connection not open");
                Asserts.check(!m31033c.isTunnelled(), "Connection is already tunnelled");
                targetHost = m31033c.getTargetHost();
                operatedClientConnection = (OperatedClientConnection) this.f3401c.getConnection();
            } else {
                throw new ConnectionShutdownException();
            }
        }
        operatedClientConnection.update(null, targetHost, z, httpParams);
        synchronized (this) {
            try {
                if (this.f3401c != null) {
                    this.f3401c.m31033c().tunnelTarget(z);
                } else {
                    throw new InterruptedIOException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void unmarkReusable() {
        this.f3402d = false;
    }
}