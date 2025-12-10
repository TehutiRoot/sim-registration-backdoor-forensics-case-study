package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.impl.SocketHttpClientConnection;
import org.apache.http.message.LineParser;
import org.apache.http.p030io.HttpMessageParser;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.p030io.SessionOutputBuffer;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public class DefaultClientConnection extends SocketHttpClientConnection implements OperatedClientConnection, ManagedHttpClientConnection, HttpContext {

    /* renamed from: n */
    public volatile Socket f74314n;

    /* renamed from: o */
    public HttpHost f74315o;

    /* renamed from: p */
    public boolean f74316p;

    /* renamed from: q */
    public volatile boolean f74317q;

    /* renamed from: k */
    public final Log f74311k = LogFactory.getLog(getClass());

    /* renamed from: l */
    public final Log f74312l = LogFactory.getLog("org.apache.http.headers");

    /* renamed from: m */
    public final Log f74313m = LogFactory.getLog("org.apache.http.wire");

    /* renamed from: r */
    public final Map f74318r = new HashMap();

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public void bind(Socket socket) throws IOException {
        bind(socket, new BasicHttpParams());
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection, org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
            if (this.f74311k.isDebugEnabled()) {
                Log log = this.f74311k;
                log.debug("Connection " + this + " closed");
            }
        } catch (IOException e) {
            this.f74311k.debug("I/O error closing connection", e);
        }
    }

    @Override // org.apache.http.impl.AbstractHttpClientConnection
    public HttpMessageParser<HttpResponse> createResponseParser(SessionInputBuffer sessionInputBuffer, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        return new DefaultHttpResponseParser(sessionInputBuffer, (LineParser) null, httpResponseFactory, httpParams);
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection
    public SessionInputBuffer createSessionInputBuffer(Socket socket, int i, HttpParams httpParams) throws IOException {
        if (i <= 0) {
            i = 8192;
        }
        SessionInputBuffer createSessionInputBuffer = super.createSessionInputBuffer(socket, i, httpParams);
        if (this.f74313m.isDebugEnabled()) {
            return new LoggingSessionInputBuffer(createSessionInputBuffer, new Wire(this.f74313m), HttpProtocolParams.getHttpElementCharset(httpParams));
        }
        return createSessionInputBuffer;
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection
    public SessionOutputBuffer createSessionOutputBuffer(Socket socket, int i, HttpParams httpParams) throws IOException {
        if (i <= 0) {
            i = 8192;
        }
        SessionOutputBuffer createSessionOutputBuffer = super.createSessionOutputBuffer(socket, i, httpParams);
        if (this.f74313m.isDebugEnabled()) {
            return new LoggingSessionOutputBuffer(createSessionOutputBuffer, new Wire(this.f74313m), HttpProtocolParams.getHttpElementCharset(httpParams));
        }
        return createSessionOutputBuffer;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        return this.f74318r.get(str);
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public String getId() {
        return null;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public SSLSession getSSLSession() {
        if (this.f74314n instanceof SSLSocket) {
            return ((SSLSocket) this.f74314n).getSession();
        }
        return null;
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection, org.apache.http.conn.OperatedClientConnection, org.apache.http.conn.ManagedHttpClientConnection
    public final Socket getSocket() {
        return this.f74314n;
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public final HttpHost getTargetHost() {
        return this.f74315o;
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public final boolean isSecure() {
        return this.f74316p;
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public void openCompleted(boolean z, HttpParams httpParams) throws IOException {
        Args.notNull(httpParams, "Parameters");
        assertNotOpen();
        this.f74316p = z;
        bind(this.f74314n, httpParams);
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public void opening(Socket socket, HttpHost httpHost) throws IOException {
        assertNotOpen();
        this.f74314n = socket;
        this.f74315o = httpHost;
        if (!this.f74317q) {
            return;
        }
        socket.close();
        throw new InterruptedIOException("Connection already shutdown");
    }

    @Override // org.apache.http.impl.AbstractHttpClientConnection, org.apache.http.HttpClientConnection
    public HttpResponse receiveResponseHeader() throws HttpException, IOException {
        Header[] allHeaders;
        HttpResponse receiveResponseHeader = super.receiveResponseHeader();
        if (this.f74311k.isDebugEnabled()) {
            this.f74311k.debug("Receiving response: " + receiveResponseHeader.getStatusLine());
        }
        if (this.f74312l.isDebugEnabled()) {
            this.f74312l.debug("<< " + receiveResponseHeader.getStatusLine().toString());
            for (Header header : receiveResponseHeader.getAllHeaders()) {
                this.f74312l.debug("<< " + header.toString());
            }
        }
        return receiveResponseHeader;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        return this.f74318r.remove(str);
    }

    @Override // org.apache.http.impl.AbstractHttpClientConnection, org.apache.http.HttpClientConnection
    public void sendRequestHeader(HttpRequest httpRequest) throws HttpException, IOException {
        Header[] allHeaders;
        if (this.f74311k.isDebugEnabled()) {
            this.f74311k.debug("Sending request: " + httpRequest.getRequestLine());
        }
        super.sendRequestHeader(httpRequest);
        if (this.f74312l.isDebugEnabled()) {
            this.f74312l.debug(">> " + httpRequest.getRequestLine().toString());
            for (Header header : httpRequest.getAllHeaders()) {
                this.f74312l.debug(">> " + header.toString());
            }
        }
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        this.f74318r.put(str, obj);
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection, org.apache.http.HttpConnection
    public void shutdown() throws IOException {
        this.f74317q = true;
        try {
            super.shutdown();
            if (this.f74311k.isDebugEnabled()) {
                Log log = this.f74311k;
                log.debug("Connection " + this + " shut down");
            }
            Socket socket = this.f74314n;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            this.f74311k.debug("I/O error shutting down connection", e);
        }
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public void update(Socket socket, HttpHost httpHost, boolean z, HttpParams httpParams) throws IOException {
        assertOpen();
        Args.notNull(httpHost, "Target host");
        Args.notNull(httpParams, "Parameters");
        if (socket != null) {
            this.f74314n = socket;
            bind(socket, httpParams);
        }
        this.f74315o = httpHost;
        this.f74316p = z;
    }
}