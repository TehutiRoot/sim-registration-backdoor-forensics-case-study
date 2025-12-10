package org.apache.http.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.ConnectionClosedException;
import org.apache.http.Header;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpMessage;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.p029io.ChunkedInputStream;
import org.apache.http.impl.p029io.ChunkedOutputStream;
import org.apache.http.impl.p029io.ContentLengthInputStream;
import org.apache.http.impl.p029io.ContentLengthOutputStream;
import org.apache.http.impl.p029io.EmptyInputStream;
import org.apache.http.impl.p029io.HttpTransportMetricsImpl;
import org.apache.http.impl.p029io.IdentityInputStream;
import org.apache.http.impl.p029io.IdentityOutputStream;
import org.apache.http.impl.p029io.SessionInputBufferImpl;
import org.apache.http.impl.p029io.SessionOutputBufferImpl;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.p030io.SessionOutputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.NetUtils;

/* loaded from: classes6.dex */
public class BHttpConnectionBase implements HttpInetConnection {

    /* renamed from: a */
    public final SessionInputBufferImpl f73895a;

    /* renamed from: b */
    public final SessionOutputBufferImpl f73896b;

    /* renamed from: c */
    public final MessageConstraints f73897c;

    /* renamed from: d */
    public final HttpConnectionMetricsImpl f73898d;

    /* renamed from: e */
    public final ContentLengthStrategy f73899e;

    /* renamed from: f */
    public final ContentLengthStrategy f73900f;

    /* renamed from: g */
    public final AtomicReference f73901g;

    public BHttpConnectionBase(int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2) {
        MessageConstraints messageConstraints2;
        ContentLengthStrategy contentLengthStrategy3;
        ContentLengthStrategy contentLengthStrategy4;
        Args.positive(i, "Buffer size");
        HttpTransportMetricsImpl httpTransportMetricsImpl = new HttpTransportMetricsImpl();
        HttpTransportMetricsImpl httpTransportMetricsImpl2 = new HttpTransportMetricsImpl();
        if (messageConstraints != null) {
            messageConstraints2 = messageConstraints;
        } else {
            messageConstraints2 = MessageConstraints.DEFAULT;
        }
        this.f73895a = new SessionInputBufferImpl(httpTransportMetricsImpl, i, -1, messageConstraints2, charsetDecoder);
        this.f73896b = new SessionOutputBufferImpl(httpTransportMetricsImpl2, i, i2, charsetEncoder);
        this.f73897c = messageConstraints;
        this.f73898d = new HttpConnectionMetricsImpl(httpTransportMetricsImpl, httpTransportMetricsImpl2);
        if (contentLengthStrategy != null) {
            contentLengthStrategy3 = contentLengthStrategy;
        } else {
            contentLengthStrategy3 = LaxContentLengthStrategy.INSTANCE;
        }
        this.f73899e = contentLengthStrategy3;
        if (contentLengthStrategy2 != null) {
            contentLengthStrategy4 = contentLengthStrategy2;
        } else {
            contentLengthStrategy4 = StrictContentLengthStrategy.INSTANCE;
        }
        this.f73900f = contentLengthStrategy4;
        this.f73901g = new AtomicReference();
    }

    public boolean awaitInput(int i) throws IOException {
        if (this.f73895a.hasBufferedData()) {
            return true;
        }
        m24769b(i);
        return this.f73895a.hasBufferedData();
    }

    /* renamed from: b */
    public final int m24769b(int i) {
        Socket socket = (Socket) this.f73901g.get();
        int soTimeout = socket.getSoTimeout();
        try {
            socket.setSoTimeout(i);
            return this.f73895a.fillBuffer();
        } finally {
            socket.setSoTimeout(soTimeout);
        }
    }

    public void bind(Socket socket) throws IOException {
        Args.notNull(socket, "Socket");
        this.f73901g.set(socket);
        this.f73895a.bind(null);
        this.f73896b.bind(null);
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Socket socket = (Socket) this.f73901g.getAndSet(null);
        if (socket != null) {
            try {
                this.f73895a.clear();
                this.f73896b.flush();
            } finally {
                socket.close();
            }
        }
    }

    public InputStream createInputStream(long j, SessionInputBuffer sessionInputBuffer) {
        if (j == -2) {
            return new ChunkedInputStream(sessionInputBuffer, this.f73897c);
        }
        if (j == -1) {
            return new IdentityInputStream(sessionInputBuffer);
        }
        if (j == 0) {
            return EmptyInputStream.INSTANCE;
        }
        return new ContentLengthInputStream(sessionInputBuffer, j);
    }

    public OutputStream createOutputStream(long j, SessionOutputBuffer sessionOutputBuffer) {
        if (j == -2) {
            return new ChunkedOutputStream(2048, sessionOutputBuffer);
        }
        if (j == -1) {
            return new IdentityOutputStream(sessionOutputBuffer);
        }
        return new ContentLengthOutputStream(sessionOutputBuffer, j);
    }

    public void doFlush() throws IOException {
        this.f73896b.flush();
    }

    public void ensureOpen() throws IOException {
        Socket socket = (Socket) this.f73901g.get();
        if (socket != null) {
            if (!this.f73895a.isBound()) {
                this.f73895a.bind(getSocketInputStream(socket));
            }
            if (!this.f73896b.isBound()) {
                this.f73896b.bind(getSocketOutputStream(socket));
                return;
            }
            return;
        }
        throw new ConnectionClosedException();
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        Socket socket = (Socket) this.f73901g.get();
        if (socket != null) {
            return socket.getLocalAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        Socket socket = (Socket) this.f73901g.get();
        if (socket != null) {
            return socket.getLocalPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        return this.f73898d;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        Socket socket = (Socket) this.f73901g.get();
        if (socket != null) {
            return socket.getInetAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        Socket socket = (Socket) this.f73901g.get();
        if (socket != null) {
            return socket.getPort();
        }
        return -1;
    }

    public SessionInputBuffer getSessionInputBuffer() {
        return this.f73895a;
    }

    public SessionOutputBuffer getSessionOutputBuffer() {
        return this.f73896b;
    }

    public Socket getSocket() {
        return (Socket) this.f73901g.get();
    }

    public InputStream getSocketInputStream(Socket socket) throws IOException {
        return socket.getInputStream();
    }

    public OutputStream getSocketOutputStream(Socket socket) throws IOException {
        return socket.getOutputStream();
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        Socket socket = (Socket) this.f73901g.get();
        if (socket != null) {
            try {
                return socket.getSoTimeout();
            } catch (SocketException unused) {
                return -1;
            }
        }
        return -1;
    }

    public void incrementRequestCount() {
        this.f73898d.incrementRequestCount();
    }

    public void incrementResponseCount() {
        this.f73898d.incrementResponseCount();
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        if (this.f73901g.get() != null) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isStale() {
        if (!isOpen()) {
            return true;
        }
        try {
            if (m24769b(1) < 0) {
                return true;
            }
            return false;
        } catch (SocketTimeoutException unused) {
            return false;
        } catch (IOException unused2) {
            return true;
        }
    }

    public HttpEntity prepareInput(HttpMessage httpMessage) throws HttpException {
        BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
        long determineLength = this.f73899e.determineLength(httpMessage);
        InputStream createInputStream = createInputStream(determineLength, this.f73895a);
        if (determineLength == -2) {
            basicHttpEntity.setChunked(true);
            basicHttpEntity.setContentLength(-1L);
            basicHttpEntity.setContent(createInputStream);
        } else if (determineLength == -1) {
            basicHttpEntity.setChunked(false);
            basicHttpEntity.setContentLength(-1L);
            basicHttpEntity.setContent(createInputStream);
        } else {
            basicHttpEntity.setChunked(false);
            basicHttpEntity.setContentLength(determineLength);
            basicHttpEntity.setContent(createInputStream);
        }
        Header firstHeader = httpMessage.getFirstHeader("Content-Type");
        if (firstHeader != null) {
            basicHttpEntity.setContentType(firstHeader);
        }
        Header firstHeader2 = httpMessage.getFirstHeader("Content-Encoding");
        if (firstHeader2 != null) {
            basicHttpEntity.setContentEncoding(firstHeader2);
        }
        return basicHttpEntity;
    }

    public OutputStream prepareOutput(HttpMessage httpMessage) throws HttpException {
        return createOutputStream(this.f73900f.determineLength(httpMessage), this.f73896b);
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i) {
        Socket socket = (Socket) this.f73901g.get();
        if (socket != null) {
            try {
                socket.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() throws IOException {
        Socket socket = (Socket) this.f73901g.getAndSet(null);
        if (socket != null) {
            try {
                socket.setSoLinger(true, 0);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                socket.close();
                throw th2;
            }
            socket.close();
        }
    }

    public String toString() {
        Socket socket = (Socket) this.f73901g.get();
        if (socket != null) {
            StringBuilder sb = new StringBuilder();
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            SocketAddress localSocketAddress = socket.getLocalSocketAddress();
            if (remoteSocketAddress != null && localSocketAddress != null) {
                NetUtils.formatAddress(sb, localSocketAddress);
                sb.append("<->");
                NetUtils.formatAddress(sb, remoteSocketAddress);
            }
            return sb.toString();
        }
        return "[Not bound]";
    }
}
