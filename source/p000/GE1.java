package p000;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SchemeSocketFactory;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

/* renamed from: GE1 */
/* loaded from: classes6.dex */
public class GE1 implements SchemeSocketFactory {

    /* renamed from: a */
    public final SocketFactory f1854a;

    public GE1(SocketFactory socketFactory) {
        this.f1854a = socketFactory;
    }

    /* renamed from: a */
    public SocketFactory m68281a() {
        return this.f1854a;
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) {
        InetAddress inetAddress;
        int i;
        String hostName = inetSocketAddress.getHostName();
        int port = inetSocketAddress.getPort();
        if (inetSocketAddress2 != null) {
            inetAddress = inetSocketAddress2.getAddress();
            i = inetSocketAddress2.getPort();
        } else {
            inetAddress = null;
            i = 0;
        }
        return this.f1854a.connectSocket(socket, hostName, port, inetAddress, i, httpParams);
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket createSocket(HttpParams httpParams) {
        return this.f1854a.createSocket();
    }

    public boolean equals(Object obj) {
        SocketFactory socketFactory;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof GE1) {
            socketFactory = this.f1854a;
            obj = ((GE1) obj).f1854a;
        } else {
            socketFactory = this.f1854a;
        }
        return socketFactory.equals(obj);
    }

    public int hashCode() {
        return this.f1854a.hashCode();
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public boolean isSecure(Socket socket) {
        return this.f1854a.isSecure(socket);
    }
}
