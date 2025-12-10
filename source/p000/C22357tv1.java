package p000;

import ch.qos.logback.core.net.server.ServerSocketListener;
import java.net.ServerSocket;
import java.net.Socket;

/* renamed from: tv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22357tv1 extends ServerSocketListener {
    public C22357tv1(ServerSocket serverSocket) {
        super(serverSocket);
    }

    @Override // ch.qos.logback.core.net.server.ServerSocketListener
    /* renamed from: d */
    public InterfaceC22185sv1 createClient(String str, Socket socket) {
        return new C22701vv1(str, socket);
    }
}
