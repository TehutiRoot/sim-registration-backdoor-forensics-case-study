package p000;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSchemeSocketFactory;
import org.apache.http.conn.scheme.LayeredSocketFactory;

/* renamed from: di0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19565di0 extends C19852fK1 implements LayeredSocketFactory {

    /* renamed from: b */
    public final LayeredSchemeSocketFactory f61262b;

    public C19565di0(LayeredSchemeSocketFactory layeredSchemeSocketFactory) {
        super(layeredSchemeSocketFactory);
        this.f61262b = layeredSchemeSocketFactory;
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.f61262b.createLayeredSocket(socket, str, i, z);
    }
}
