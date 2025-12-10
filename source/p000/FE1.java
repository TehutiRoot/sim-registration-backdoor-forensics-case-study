package p000;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.SchemeLayeredSocketFactory;
import org.apache.http.params.HttpParams;

/* renamed from: FE1 */
/* loaded from: classes6.dex */
public class FE1 extends GE1 implements SchemeLayeredSocketFactory {

    /* renamed from: b */
    public final LayeredSocketFactory f1551b;

    public FE1(LayeredSocketFactory layeredSocketFactory) {
        super(layeredSocketFactory);
        this.f1551b = layeredSocketFactory;
    }

    @Override // org.apache.http.conn.scheme.SchemeLayeredSocketFactory
    public Socket createLayeredSocket(Socket socket, String str, int i, HttpParams httpParams) {
        return this.f1551b.createSocket(socket, str, i, true);
    }
}
