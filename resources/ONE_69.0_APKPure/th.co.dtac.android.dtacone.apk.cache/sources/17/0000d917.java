package p000;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.impl.conn.ConnectionShutdownException;
import org.apache.http.protocol.HttpContext;

/* renamed from: kg */
/* loaded from: classes6.dex */
public class C11646kg implements ManagedHttpClientConnection, HttpContext {

    /* renamed from: a */
    public volatile C11535jg f68022a;

    public C11646kg(C11535jg c11535jg) {
        this.f68022a = c11535jg;
    }

    /* renamed from: d */
    public static C11535jg m29173d(HttpClientConnection httpClientConnection) {
        return m29169k(httpClientConnection).m29174b();
    }

    /* renamed from: j */
    public static C11535jg m29170j(HttpClientConnection httpClientConnection) {
        C11535jg m29171i = m29169k(httpClientConnection).m29171i();
        if (m29171i != null) {
            return m29171i;
        }
        throw new ConnectionShutdownException();
    }

    /* renamed from: k */
    public static C11646kg m29169k(HttpClientConnection httpClientConnection) {
        if (C11646kg.class.isInstance(httpClientConnection)) {
            return (C11646kg) C11646kg.class.cast(httpClientConnection);
        }
        throw new IllegalStateException("Unexpected connection proxy class: " + httpClientConnection.getClass());
    }

    /* renamed from: m */
    public static HttpClientConnection m29167m(C11535jg c11535jg) {
        return new C11646kg(c11535jg);
    }

    /* renamed from: b */
    public C11535jg m29174b() {
        C11535jg c11535jg = this.f68022a;
        this.f68022a = null;
        return c11535jg;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public void bind(Socket socket) {
        m29168l().bind(socket);
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C11535jg c11535jg = this.f68022a;
        if (c11535jg != null) {
            c11535jg.m29497a();
        }
    }

    @Override // org.apache.http.HttpClientConnection
    public void flush() {
        m29168l().flush();
    }

    /* renamed from: g */
    public ManagedHttpClientConnection m29172g() {
        C11535jg c11535jg = this.f68022a;
        if (c11535jg == null) {
            return null;
        }
        return (ManagedHttpClientConnection) c11535jg.getConnection();
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        ManagedHttpClientConnection m29168l = m29168l();
        if (m29168l instanceof HttpContext) {
            return ((HttpContext) m29168l).getAttribute(str);
        }
        return null;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public String getId() {
        return m29168l().getId();
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        return m29168l().getLocalAddress();
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        return m29168l().getLocalPort();
    }

    @Override // org.apache.http.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        return m29168l().getMetrics();
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        return m29168l().getRemoteAddress();
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        return m29168l().getRemotePort();
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public SSLSession getSSLSession() {
        return m29168l().getSSLSession();
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public Socket getSocket() {
        return m29168l().getSocket();
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        return m29168l().getSocketTimeout();
    }

    /* renamed from: i */
    public C11535jg m29171i() {
        return this.f68022a;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        C11535jg c11535jg = this.f68022a;
        if (c11535jg == null || c11535jg.isClosed()) {
            return false;
        }
        return true;
    }

    @Override // org.apache.http.HttpClientConnection
    public boolean isResponseAvailable(int i) {
        return m29168l().isResponseAvailable(i);
    }

    @Override // org.apache.http.HttpConnection
    public boolean isStale() {
        ManagedHttpClientConnection m29172g = m29172g();
        if (m29172g != null) {
            return m29172g.isStale();
        }
        return true;
    }

    /* renamed from: l */
    public ManagedHttpClientConnection m29168l() {
        ManagedHttpClientConnection m29172g = m29172g();
        if (m29172g != null) {
            return m29172g;
        }
        throw new ConnectionShutdownException();
    }

    @Override // org.apache.http.HttpClientConnection
    public void receiveResponseEntity(HttpResponse httpResponse) {
        m29168l().receiveResponseEntity(httpResponse);
    }

    @Override // org.apache.http.HttpClientConnection
    public HttpResponse receiveResponseHeader() {
        return m29168l().receiveResponseHeader();
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        ManagedHttpClientConnection m29168l = m29168l();
        if (m29168l instanceof HttpContext) {
            return ((HttpContext) m29168l).removeAttribute(str);
        }
        return null;
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        m29168l().sendRequestEntity(httpEntityEnclosingRequest);
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestHeader(HttpRequest httpRequest) {
        m29168l().sendRequestHeader(httpRequest);
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        ManagedHttpClientConnection m29168l = m29168l();
        if (m29168l instanceof HttpContext) {
            ((HttpContext) m29168l).setAttribute(str, obj);
        }
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i) {
        m29168l().setSocketTimeout(i);
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() {
        C11535jg c11535jg = this.f68022a;
        if (c11535jg != null) {
            c11535jg.m29494d();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CPoolProxy{");
        ManagedHttpClientConnection m29172g = m29172g();
        if (m29172g != null) {
            sb.append(m29172g);
        } else {
            sb.append("detached");
        }
        sb.append('}');
        return sb.toString();
    }
}