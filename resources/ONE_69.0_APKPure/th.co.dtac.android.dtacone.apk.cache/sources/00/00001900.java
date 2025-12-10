package p000;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* renamed from: aE1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19015aE1 extends SSLSocketFactory {

    /* renamed from: f */
    public final javax.net.ssl.SSLSocketFactory f8384f;

    public C19015aE1(SSLContext sSLContext) {
        super((KeyStore) null);
        this.f8384f = sSLContext.getSocketFactory();
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return this.f8384f.createSocket();
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        SSLSocket sSLSocket = (SSLSocket) this.f8384f.createSocket(socket, str, i, z);
        getHostnameVerifier().verify(str, sSLSocket);
        return sSLSocket;
    }
}