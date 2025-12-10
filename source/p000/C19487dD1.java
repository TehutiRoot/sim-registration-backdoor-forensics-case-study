package p000;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* renamed from: dD1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19487dD1 extends SSLSocketFactory {

    /* renamed from: f */
    public final javax.net.ssl.SSLSocketFactory f61102f;

    public C19487dD1(SSLContext sSLContext) {
        super((KeyStore) null);
        this.f61102f = sSLContext.getSocketFactory();
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return this.f61102f.createSocket();
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        SSLSocket sSLSocket = (SSLSocket) this.f61102f.createSocket(socket, str, i, z);
        getHostnameVerifier().verify(str, sSLSocket);
        return sSLSocket;
    }
}
