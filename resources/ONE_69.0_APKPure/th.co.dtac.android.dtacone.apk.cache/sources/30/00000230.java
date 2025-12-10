package p000;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.SchemeLayeredSocketFactory;
import org.apache.http.params.HttpParams;

/* renamed from: CF1 */
/* loaded from: classes6.dex */
public class CF1 extends DF1 implements SchemeLayeredSocketFactory {

    /* renamed from: b */
    public final LayeredSocketFactory f699b;

    public CF1(LayeredSocketFactory layeredSocketFactory) {
        super(layeredSocketFactory);
        this.f699b = layeredSocketFactory;
    }

    @Override // org.apache.http.conn.scheme.SchemeLayeredSocketFactory
    public Socket createLayeredSocket(Socket socket, String str, int i, HttpParams httpParams) {
        return this.f699b.createSocket(socket, str, i, true);
    }
}