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
public class C11670kg implements ManagedHttpClientConnection, HttpContext {

    /* renamed from: a */
    public volatile C11550jg f67973a;

    public C11670kg(C11550jg c11550jg) {
        this.f67973a = c11550jg;
    }

    /* renamed from: d */
    public static C11550jg m28889d(HttpClientConnection httpClientConnection) {
        return m28885k(httpClientConnection).m28890b();
    }

    /* renamed from: j */
    public static C11550jg m28886j(HttpClientConnection httpClientConnection) {
        C11550jg m28887i = m28885k(httpClientConnection).m28887i();
        if (m28887i != null) {
            return m28887i;
        }
        throw new ConnectionShutdownException();
    }

    /* renamed from: k */
    public static C11670kg m28885k(HttpClientConnection httpClientConnection) {
        if (C11670kg.class.isInstance(httpClientConnection)) {
            return (C11670kg) C11670kg.class.cast(httpClientConnection);
        }
        throw new IllegalStateException("Unexpected connection proxy class: " + httpClientConnection.getClass());
    }

    /* renamed from: m */
    public static HttpClientConnection m28883m(C11550jg c11550jg) {
        return new C11670kg(c11550jg);
    }

    /* renamed from: b */
    public C11550jg m28890b() {
        C11550jg c11550jg = this.f67973a;
        this.f67973a = null;
        return c11550jg;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public void bind(Socket socket) {
        m28884l().bind(socket);
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C11550jg c11550jg = this.f67973a;
        if (c11550jg != null) {
            c11550jg.m29160a();
        }
    }

    @Override // org.apache.http.HttpClientConnection
    public void flush() {
        m28884l().flush();
    }

    /* renamed from: g */
    public ManagedHttpClientConnection m28888g() {
        C11550jg c11550jg = this.f67973a;
        if (c11550jg == null) {
            return null;
        }
        return (ManagedHttpClientConnection) c11550jg.getConnection();
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        ManagedHttpClientConnection m28884l = m28884l();
        if (m28884l instanceof HttpContext) {
            return ((HttpContext) m28884l).getAttribute(str);
        }
        return null;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public String getId() {
        return m28884l().getId();
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        return m28884l().getLocalAddress();
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        return m28884l().getLocalPort();
    }

    @Override // org.apache.http.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        return m28884l().getMetrics();
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        return m28884l().getRemoteAddress();
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        return m28884l().getRemotePort();
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public SSLSession getSSLSession() {
        return m28884l().getSSLSession();
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public Socket getSocket() {
        return m28884l().getSocket();
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        return m28884l().getSocketTimeout();
    }

    /* renamed from: i */
    public C11550jg m28887i() {
        return this.f67973a;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        C11550jg c11550jg = this.f67973a;
        if (c11550jg == null || c11550jg.isClosed()) {
            return false;
        }
        return true;
    }

    @Override // org.apache.http.HttpClientConnection
    public boolean isResponseAvailable(int i) {
        return m28884l().isResponseAvailable(i);
    }

    @Override // org.apache.http.HttpConnection
    public boolean isStale() {
        ManagedHttpClientConnection m28888g = m28888g();
        if (m28888g != null) {
            return m28888g.isStale();
        }
        return true;
    }

    /* renamed from: l */
    public ManagedHttpClientConnection m28884l() {
        ManagedHttpClientConnection m28888g = m28888g();
        if (m28888g != null) {
            return m28888g;
        }
        throw new ConnectionShutdownException();
    }

    @Override // org.apache.http.HttpClientConnection
    public void receiveResponseEntity(HttpResponse httpResponse) {
        m28884l().receiveResponseEntity(httpResponse);
    }

    @Override // org.apache.http.HttpClientConnection
    public HttpResponse receiveResponseHeader() {
        return m28884l().receiveResponseHeader();
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        ManagedHttpClientConnection m28884l = m28884l();
        if (m28884l instanceof HttpContext) {
            return ((HttpContext) m28884l).removeAttribute(str);
        }
        return null;
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        m28884l().sendRequestEntity(httpEntityEnclosingRequest);
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestHeader(HttpRequest httpRequest) {
        m28884l().sendRequestHeader(httpRequest);
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        ManagedHttpClientConnection m28884l = m28884l();
        if (m28884l instanceof HttpContext) {
            ((HttpContext) m28884l).setAttribute(str, obj);
        }
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i) {
        m28884l().setSocketTimeout(i);
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() {
        C11550jg c11550jg = this.f67973a;
        if (c11550jg != null) {
            c11550jg.m29157d();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CPoolProxy{");
        ManagedHttpClientConnection m28888g = m28888g();
        if (m28888g != null) {
            sb.append(m28888g);
        } else {
            sb.append("detached");
        }
        sb.append('}');
        return sb.toString();
    }
}
