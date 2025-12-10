package p000;

import ch.qos.logback.core.net.server.ServerSocketListener;
import java.net.ServerSocket;
import java.net.Socket;

/* renamed from: gv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C20121gv1 extends ServerSocketListener {
    public C20121gv1(ServerSocket serverSocket) {
        super(serverSocket);
    }

    @Override // ch.qos.logback.core.net.server.ServerSocketListener
    /* renamed from: d */
    public InterfaceC19949fv1 createClient(String str, Socket socket) {
        return new C20465iv1(str, socket);
    }
}
