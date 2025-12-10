package ch.qos.logback.core.net.server;

import ch.qos.logback.core.net.server.Client;
import ch.qos.logback.core.util.CloseUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/* loaded from: classes.dex */
public abstract class ServerSocketListener<T extends Client> implements ServerListener<T> {

    /* renamed from: a */
    public final ServerSocket f39932a;

    public ServerSocketListener(ServerSocket serverSocket) {
        this.f39932a = serverSocket;
    }

    @Override // ch.qos.logback.core.net.server.ServerListener
    public T acceptClient() throws IOException {
        Socket accept = this.f39932a.accept();
        return createClient(m51438b(accept.getRemoteSocketAddress()), accept);
    }

    /* renamed from: b */
    public final String m51438b(SocketAddress socketAddress) {
        String obj = socketAddress.toString();
        int indexOf = obj.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
        return indexOf >= 0 ? obj.substring(indexOf + 1) : obj;
    }

    @Override // ch.qos.logback.core.net.server.ServerListener, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CloseUtil.closeQuietly(this.f39932a);
    }

    public abstract T createClient(String str, Socket socket) throws IOException;

    public String toString() {
        return m51438b(this.f39932a.getLocalSocketAddress());
    }
}