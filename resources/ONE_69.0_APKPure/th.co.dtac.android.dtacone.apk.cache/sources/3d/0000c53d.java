package p000;

import ch.qos.logback.core.net.server.ServerSocketListener;
import java.net.ServerSocket;
import java.net.Socket;

/* renamed from: dw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C19658dw1 extends ServerSocketListener {
    public C19658dw1(ServerSocket serverSocket) {
        super(serverSocket);
    }

    @Override // ch.qos.logback.core.net.server.ServerSocketListener
    /* renamed from: d */
    public InterfaceC19485cw1 createClient(String str, Socket socket) {
        return new C20004fw1(str, socket);
    }
}