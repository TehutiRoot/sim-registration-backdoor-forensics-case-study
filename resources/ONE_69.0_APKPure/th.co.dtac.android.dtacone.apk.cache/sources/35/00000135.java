package p000;

import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSchemeSocketFactory;
import org.apache.http.conn.scheme.SchemeLayeredSocketFactory;
import org.apache.http.params.HttpParams;

/* renamed from: BF1 */
/* loaded from: classes6.dex */
public class BF1 implements SchemeLayeredSocketFactory {

    /* renamed from: a */
    public final LayeredSchemeSocketFactory f351a;

    public BF1(LayeredSchemeSocketFactory layeredSchemeSocketFactory) {
        this.f351a = layeredSchemeSocketFactory;
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) {
        return this.f351a.connectSocket(socket, inetSocketAddress, inetSocketAddress2, httpParams);
    }

    @Override // org.apache.http.conn.scheme.SchemeLayeredSocketFactory
    public Socket createLayeredSocket(Socket socket, String str, int i, HttpParams httpParams) {
        return this.f351a.createLayeredSocket(socket, str, i, true);
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket createSocket(HttpParams httpParams) {
        return this.f351a.createSocket(httpParams);
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public boolean isSecure(Socket socket) {
        return this.f351a.isSecure(socket);
    }
}