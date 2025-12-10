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
public class SocketHttpClientConnection extends AbstractHttpClientConnection implements HttpInetConnection {

    /* renamed from: i */
    public volatile boolean f73926i;

    /* renamed from: j */
    public volatile Socket f73927j = null;

    /* renamed from: b */
    public static void m24765b(StringBuilder sb, SocketAddress socketAddress) {
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
        Asserts.check(!this.f73926i, "Connection is already open");
    }

    @Override // org.apache.http.impl.AbstractHttpClientConnection
    public void assertOpen() {
        Asserts.check(this.f73926i, "Connection is not open");
    }

    public void bind(Socket socket, HttpParams httpParams) throws IOException {
        Args.notNull(socket, "Socket");
        Args.notNull(httpParams, "HTTP parameters");
        this.f73927j = socket;
        int intParameter = httpParams.getIntParameter(CoreConnectionPNames.SOCKET_BUFFER_SIZE, -1);
        init(createSessionInputBuffer(socket, intParameter, httpParams), createSessionOutputBuffer(socket, intParameter, httpParams), httpParams);
        this.f73926i = true;
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f73926i) {
            return;
        }
        this.f73926i = false;
        Socket socket = this.f73927j;
        try {
            doFlush();
            try {
                try {
                    socket.shutdownOutput();
                } catch (IOException unused) {
                }
                socket.shutdownInput();
            } catch (IOException | UnsupportedOperationException unused2) {
            }
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
        if (this.f73927j != null) {
            return this.f73927j.getLocalAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        if (this.f73927j != null) {
            return this.f73927j.getLocalPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        if (this.f73927j != null) {
            return this.f73927j.getInetAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        if (this.f73927j != null) {
            return this.f73927j.getPort();
        }
        return -1;
    }

    public Socket getSocket() {
        return this.f73927j;
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        if (this.f73927j != null) {
            try {
                return this.f73927j.getSoTimeout();
            } catch (SocketException unused) {
                return -1;
            }
        }
        return -1;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        return this.f73926i;
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i) {
        assertOpen();
        if (this.f73927j != null) {
            try {
                this.f73927j.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() throws IOException {
        this.f73926i = false;
        Socket socket = this.f73927j;
        if (socket != null) {
            socket.close();
        }
    }

    public String toString() {
        if (this.f73927j != null) {
            StringBuilder sb = new StringBuilder();
            SocketAddress remoteSocketAddress = this.f73927j.getRemoteSocketAddress();
            SocketAddress localSocketAddress = this.f73927j.getLocalSocketAddress();
            if (remoteSocketAddress != null && localSocketAddress != null) {
                m24765b(sb, localSocketAddress);
                sb.append("<->");
                m24765b(sb, remoteSocketAddress);
            }
            return sb.toString();
        }
        return super.toString();
    }
}
