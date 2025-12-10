package p000;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SchemeSocketFactory;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

/* renamed from: fK1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19852fK1 implements SocketFactory {

    /* renamed from: a */
    public final SchemeSocketFactory f61788a;

    public C19852fK1(SchemeSocketFactory schemeSocketFactory) {
        this.f61788a = schemeSocketFactory;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        InetSocketAddress inetSocketAddress;
        if (inetAddress == null && i2 <= 0) {
            inetSocketAddress = null;
        } else {
            if (i2 <= 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        }
        return this.f61788a.connectSocket(socket, new InetSocketAddress(InetAddress.getByName(str), i), inetSocketAddress, httpParams);
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return this.f61788a.createSocket(new BasicHttpParams());
    }

    public boolean equals(Object obj) {
        SchemeSocketFactory schemeSocketFactory;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19852fK1) {
            schemeSocketFactory = this.f61788a;
            obj = ((C19852fK1) obj).f61788a;
        } else {
            schemeSocketFactory = this.f61788a;
        }
        return schemeSocketFactory.equals(obj);
    }

    public int hashCode() {
        return this.f61788a.hashCode();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public boolean isSecure(Socket socket) {
        return this.f61788a.isSecure(socket);
    }
}
