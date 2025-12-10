package org.apache.http.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import org.apache.http.HttpInetConnection;
import org.apache.http.impl.p029io.SocketInputBuffer;
import org.apache.http.impl.p029io.SocketOutputBuffer;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.p030io.SessionOutputBuffer;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Deprecated
/* loaded from: classes6.dex */
public class SocketHttpServerConnection extends AbstractHttpServerConnection implements HttpInetConnection {

    /* renamed from: i */
    public volatile boolean f73928i;

    /* renamed from: j */
    public volatile Socket f73929j = null;

    /* renamed from: b */
    private static void m24764b(StringBuilder sb, SocketAddress socketAddress) {
        Object address;
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            if (inetSocketAddress.getAddress() != null) {
                address = inetSocketAddress.getAddress().getHostAddress();
            } else {
                address = inetSocketAddress.getAddress();
            }
            sb.append(address);
            sb.append(':');
            sb.append(inetSocketAddress.getPort());
            return;
        }
        sb.append(socketAddress);
    }

    public void assertNotOpen() {
        Asserts.check(!this.f73928i, "Connection is already open");
    }

    @Override // org.apache.http.impl.AbstractHttpServerConnection
    public void assertOpen() {
        Asserts.check(this.f73928i, "Connection is not open");
    }

    public void bind(Socket socket, HttpParams httpParams) throws IOException {
        Args.notNull(socket, "Socket");
        Args.notNull(httpParams, "HTTP parameters");
        this.f73929j = socket;
        int intParameter = httpParams.getIntParameter(CoreConnectionPNames.SOCKET_BUFFER_SIZE, -1);
        init(createSessionInputBuffer(socket, intParameter, httpParams), createSessionOutputBuffer(socket, intParameter, httpParams), httpParams);
        this.f73928i = true;
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f73928i) {
            return;
        }
        this.f73928i = false;
        this.f73928i = false;
        Socket socket = this.f73929j;
        try {
            doFlush();
            try {
                try {
                    socket.shutdownOutput();
                } catch (IOException | UnsupportedOperationException unused) {
                }
            } catch (IOException unused2) {
            }
            socket.shutdownInput();
        } finally {
            socket.close();
        }
    }

    public SessionInputBuffer createSessionInputBuffer(Socket socket, int i, HttpParams httpParams) throws IOException {
        return new SocketInputBuffer(socket, i, httpParams);
    }

    public SessionOutputBuffer createSessionOutputBuffer(Socket socket, int i, HttpParams httpParams) throws IOException {
        return new SocketOutputBuffer(socket, i, httpParams);
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        if (this.f73929j != null) {
            return this.f73929j.getLocalAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        if (this.f73929j != null) {
            return this.f73929j.getLocalPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        if (this.f73929j != null) {
            return this.f73929j.getInetAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        if (this.f73929j != null) {
            return this.f73929j.getPort();
        }
        return -1;
    }

    public Socket getSocket() {
        return this.f73929j;
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        if (this.f73929j != null) {
            try {
                return this.f73929j.getSoTimeout();
            } catch (SocketException unused) {
                return -1;
            }
        }
        return -1;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        return this.f73928i;
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i) {
        assertOpen();
        if (this.f73929j != null) {
            try {
                this.f73929j.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() throws IOException {
        this.f73928i = false;
        Socket socket = this.f73929j;
        if (socket != null) {
            socket.close();
        }
    }

    public String toString() {
        if (this.f73929j != null) {
            StringBuilder sb = new StringBuilder();
            SocketAddress remoteSocketAddress = this.f73929j.getRemoteSocketAddress();
            SocketAddress localSocketAddress = this.f73929j.getLocalSocketAddress();
            if (remoteSocketAddress != null && localSocketAddress != null) {
                m24764b(sb, localSocketAddress);
                sb.append("<->");
                m24764b(sb, remoteSocketAddress);
            }
            return sb.toString();
        }
        return super.toString();
    }
}
