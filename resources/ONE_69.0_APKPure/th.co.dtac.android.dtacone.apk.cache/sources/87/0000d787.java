package p000;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSchemeSocketFactory;
import org.apache.http.conn.scheme.LayeredSocketFactory;

/* renamed from: ji0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C20653ji0 extends C19387cL1 implements LayeredSocketFactory {

    /* renamed from: b */
    public final LayeredSchemeSocketFactory f67375b;

    public C20653ji0(LayeredSchemeSocketFactory layeredSchemeSocketFactory) {
        super(layeredSchemeSocketFactory);
        this.f67375b = layeredSchemeSocketFactory;
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.f67375b.createLayeredSocket(socket, str, i, z);
    }
}