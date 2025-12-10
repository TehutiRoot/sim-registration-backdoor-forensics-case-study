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

/* renamed from: En0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17555En0 implements ManagedClientConnection {

    /* renamed from: a */
    public final ClientConnectionManager f1390a;

    /* renamed from: b */
    public final ClientConnectionOperator f1391b;

    /* renamed from: c */
    public volatile C19302c90 f1392c;

    /* renamed from: d */
    public volatile boolean f1393d;

    /* renamed from: e */
    public volatile long f1394e;

    public C17555En0(ClientConnectionManager clientConnectionManager, ClientConnectionOperator clientConnectionOperator, C19302c90 c19302c90) {
        Args.notNull(clientConnectionManager, "Connection manager");
        Args.notNull(clientConnectionOperator, "Connection operator");
        Args.notNull(c19302c90, "HTTP pool entry");
        this.f1390a = clientConnectionManager;
        this.f1391b = clientConnectionOperator;
        this.f1392c = c19302c90;
        this.f1393d = false;
        this.f1394e = Long.MAX_VALUE;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() {
        synchronized (this) {
            try {
                if (this.f1392c == null) {
                    return;
                }
                this.f1393d = false;
                try {
                    ((OperatedClientConnection) this.f1392c.getConnection()).shutdown();
                } catch (IOException unused) {
                }
                this.f1390a.releaseConnection(this, this.f1394e, TimeUnit.MILLISECONDS);
                this.f1392c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public C19302c90 m68464b() {
        C19302c90 c19302c90 = this.f1392c;
        this.f1392c = null;
        return c19302c90;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public void bind(Socket socket) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C19302c90 c19302c90 = this.f1392c;
        if (c19302c90 != null) {
            c19302c90.m51702c().reset();
            ((OperatedClientConnection) c19302c90.getConnection()).close();
        }
    }

    /* renamed from: d */
    public final OperatedClientConnection m68463d() {
        C19302c90 c19302c90 = this.f1392c;
        if (c19302c90 != null) {
            return (OperatedClientConnection) c19302c90.getConnection();
        }
        throw new ConnectionShutdownException();
    }

    @Override // org.apache.http.HttpClientConnection
    public void flush() {
        m68463d().flush();
    }

    /* renamed from: g */
    public final C19302c90 m68462g() {
        C19302c90 c19302c90 = this.f1392c;
        if (c19302c90 != null) {
            return c19302c90;
        }
        throw new ConnectionShutdownException();
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public String getId() {
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        return m68463d().getLocalAddress();
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        return m68463d().getLocalPort();
    }

    @Override // org.apache.http.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        return m68463d().getMetrics();
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        return m68463d().getRemoteAddress();
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        return m68463d().getRemotePort();
    }

    @Override // org.apache.http.conn.ManagedClientConnection, org.apache.http.conn.HttpRoutedConnection
    public HttpRoute getRoute() {
        return m68462g().m51704a();
    }

    @Override // org.apache.http.conn.ManagedClientConnection, org.apache.http.conn.HttpRoutedConnection, org.apache.http.conn.ManagedHttpClientConnection
    public SSLSession getSSLSession() {
        Socket socket = m68463d().getSocket();
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getSession();
        }
        return null;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public Socket getSocket() {
        return m68463d().getSocket();
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        return m68463d().getSocketTimeout();
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public Object getState() {
        return m68462g().getState();
    }

    /* renamed from: i */
    public final OperatedClientConnection m68461i() {
        C19302c90 c19302c90 = this.f1392c;
        if (c19302c90 == null) {
            return null;
        }
        return (OperatedClientConnection) c19302c90.getConnection();
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public boolean isMarkedReusable() {
        return this.f1393d;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        OperatedClientConnection m68461i = m68461i();
        if (m68461i != null) {
            return m68461i.isOpen();
        }
        return false;
    }

    @Override // org.apache.http.HttpClientConnection
    public boolean isResponseAvailable(int i) {
        return m68463d().isResponseAvailable(i);
    }

    @Override // org.apache.http.conn.ManagedClientConnection, org.apache.http.conn.HttpRoutedConnection
    public boolean isSecure() {
        return m68463d().isSecure();
    }

    @Override // org.apache.http.HttpConnection
    public boolean isStale() {
        OperatedClientConnection m68461i = m68461i();
        if (m68461i != null) {
            return m68461i.isStale();
        }
        return true;
    }

    /* renamed from: j */
    public ClientConnectionManager m68460j() {
        return this.f1390a;
    }

    /* renamed from: k */
    public C19302c90 m68459k() {
        return this.f1392c;
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void layerProtocol(HttpContext httpContext, HttpParams httpParams) {
        HttpHost targetHost;
        OperatedClientConnection operatedClientConnection;
        Args.notNull(httpParams, "HTTP parameters");
        synchronized (this) {
            if (this.f1392c != null) {
                RouteTracker m51702c = this.f1392c.m51702c();
                Asserts.notNull(m51702c, "Route tracker");
                Asserts.check(m51702c.isConnected(), "Connection not open");
                Asserts.check(m51702c.isTunnelled(), "Protocol layering without a tunnel not supported");
                Asserts.check(!m51702c.isLayered(), "Multiple protocol layering not supported");
                targetHost = m51702c.getTargetHost();
                operatedClientConnection = (OperatedClientConnection) this.f1392c.getConnection();
            } else {
                throw new ConnectionShutdownException();
            }
        }
        this.f1391b.updateSecureConnection(operatedClientConnection, targetHost, httpContext, httpParams);
        synchronized (this) {
            try {
                if (this.f1392c != null) {
                    this.f1392c.m51702c().layerProtocol(operatedClientConnection.isSecure());
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
        this.f1393d = true;
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void open(HttpRoute httpRoute, HttpContext httpContext, HttpParams httpParams) {
        OperatedClientConnection operatedClientConnection;
        HttpHost targetHost;
        Args.notNull(httpRoute, "Route");
        Args.notNull(httpParams, "HTTP parameters");
        synchronized (this) {
            if (this.f1392c != null) {
                RouteTracker m51702c = this.f1392c.m51702c();
                Asserts.notNull(m51702c, "Route tracker");
                Asserts.check(!m51702c.isConnected(), "Connection already open");
                operatedClientConnection = (OperatedClientConnection) this.f1392c.getConnection();
            } else {
                throw new ConnectionShutdownException();
            }
        }
        HttpHost proxyHost = httpRoute.getProxyHost();
        ClientConnectionOperator clientConnectionOperator = this.f1391b;
        if (proxyHost != null) {
            targetHost = proxyHost;
        } else {
            targetHost = httpRoute.getTargetHost();
        }
        clientConnectionOperator.openConnection(operatedClientConnection, targetHost, httpRoute.getLocalAddress(), httpContext, httpParams);
        synchronized (this) {
            try {
                if (this.f1392c != null) {
                    RouteTracker m51702c2 = this.f1392c.m51702c();
                    if (proxyHost == null) {
                        m51702c2.connectTarget(operatedClientConnection.isSecure());
                    } else {
                        m51702c2.connectProxy(proxyHost, operatedClientConnection.isSecure());
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
        m68463d().receiveResponseEntity(httpResponse);
    }

    @Override // org.apache.http.HttpClientConnection
    public HttpResponse receiveResponseHeader() {
        return m68463d().receiveResponseHeader();
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() {
        synchronized (this) {
            try {
                if (this.f1392c == null) {
                    return;
                }
                this.f1390a.releaseConnection(this, this.f1394e, TimeUnit.MILLISECONDS);
                this.f1392c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        m68463d().sendRequestEntity(httpEntityEnclosingRequest);
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestHeader(HttpRequest httpRequest) {
        m68463d().sendRequestHeader(httpRequest);
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void setIdleDuration(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.f1394e = timeUnit.toMillis(j);
        } else {
            this.f1394e = -1L;
        }
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i) {
        m68463d().setSocketTimeout(i);
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void setState(Object obj) {
        m68462g().setState(obj);
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() {
        C19302c90 c19302c90 = this.f1392c;
        if (c19302c90 != null) {
            c19302c90.m51702c().reset();
            ((OperatedClientConnection) c19302c90.getConnection()).shutdown();
        }
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void tunnelProxy(HttpHost httpHost, boolean z, HttpParams httpParams) {
        OperatedClientConnection operatedClientConnection;
        Args.notNull(httpHost, "Next proxy");
        Args.notNull(httpParams, "HTTP parameters");
        synchronized (this) {
            if (this.f1392c != null) {
                RouteTracker m51702c = this.f1392c.m51702c();
                Asserts.notNull(m51702c, "Route tracker");
                Asserts.check(m51702c.isConnected(), "Connection not open");
                operatedClientConnection = (OperatedClientConnection) this.f1392c.getConnection();
            } else {
                throw new ConnectionShutdownException();
            }
        }
        operatedClientConnection.update(null, httpHost, z, httpParams);
        synchronized (this) {
            try {
                if (this.f1392c != null) {
                    this.f1392c.m51702c().tunnelProxy(httpHost, z);
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
            if (this.f1392c != null) {
                RouteTracker m51702c = this.f1392c.m51702c();
                Asserts.notNull(m51702c, "Route tracker");
                Asserts.check(m51702c.isConnected(), "Connection not open");
                Asserts.check(!m51702c.isTunnelled(), "Connection is already tunnelled");
                targetHost = m51702c.getTargetHost();
                operatedClientConnection = (OperatedClientConnection) this.f1392c.getConnection();
            } else {
                throw new ConnectionShutdownException();
            }
        }
        operatedClientConnection.update(null, targetHost, z, httpParams);
        synchronized (this) {
            try {
                if (this.f1392c != null) {
                    this.f1392c.m51702c().tunnelTarget(z);
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
        this.f1393d = false;
    }
}
