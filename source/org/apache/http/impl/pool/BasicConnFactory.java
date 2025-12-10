package org.apache.http.impl.pool;

import com.mixpanel.android.java_websocket.WebSocket;
import com.zxy.tiny.common.UriUtil;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionFactory;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.DefaultBHttpClientConnection;
import org.apache.http.impl.DefaultBHttpClientConnectionFactory;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParamConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.pool.ConnFactory;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class BasicConnFactory implements ConnFactory<HttpHost, HttpClientConnection> {

    /* renamed from: a */
    public final SocketFactory f74523a;

    /* renamed from: b */
    public final SSLSocketFactory f74524b;

    /* renamed from: c */
    public final int f74525c;

    /* renamed from: d */
    public final SocketConfig f74526d;

    /* renamed from: e */
    public final HttpConnectionFactory f74527e;

    /* renamed from: org.apache.http.impl.pool.BasicConnFactory$a */
    /* loaded from: classes6.dex */
    public class C12609a implements PrivilegedExceptionAction {

        /* renamed from: a */
        public final /* synthetic */ Socket f74528a;

        /* renamed from: b */
        public final /* synthetic */ InetSocketAddress f74529b;

        public C12609a(Socket socket, InetSocketAddress inetSocketAddress) {
            this.f74528a = socket;
            this.f74529b = inetSocketAddress;
        }

        @Override // java.security.PrivilegedExceptionAction
        public Object run() {
            this.f74528a.connect(this.f74529b, BasicConnFactory.this.f74525c);
            return null;
        }
    }

    @Deprecated
    public BasicConnFactory(SSLSocketFactory sSLSocketFactory, HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP params");
        this.f74523a = null;
        this.f74524b = sSLSocketFactory;
        this.f74525c = httpParams.getIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 0);
        this.f74526d = HttpParamConfig.getSocketConfig(httpParams);
        this.f74527e = new DefaultBHttpClientConnectionFactory(HttpParamConfig.getConnectionConfig(httpParams));
    }

    @Deprecated
    public HttpClientConnection create(Socket socket, HttpParams httpParams) throws IOException {
        DefaultBHttpClientConnection defaultBHttpClientConnection = new DefaultBHttpClientConnection(httpParams.getIntParameter(CoreConnectionPNames.SOCKET_BUFFER_SIZE, 8192));
        defaultBHttpClientConnection.bind(socket);
        return defaultBHttpClientConnection;
    }

    @Override // org.apache.http.pool.ConnFactory
    public HttpClientConnection create(HttpHost httpHost) throws IOException {
        Socket createSocket;
        String schemeName = httpHost.getSchemeName();
        if ("http".equalsIgnoreCase(schemeName)) {
            SocketFactory socketFactory = this.f74523a;
            createSocket = socketFactory != null ? socketFactory.createSocket() : new Socket();
        } else if (UriUtil.HTTPS_SCHEME.equalsIgnoreCase(schemeName)) {
            SocketFactory socketFactory2 = this.f74524b;
            if (socketFactory2 == null) {
                socketFactory2 = SSLSocketFactory.getDefault();
            }
            createSocket = socketFactory2.createSocket();
        } else {
            throw new IOException(schemeName + " scheme is not supported");
        }
        String hostName = httpHost.getHostName();
        int port = httpHost.getPort();
        if (port == -1) {
            if (httpHost.getSchemeName().equalsIgnoreCase("http")) {
                port = 80;
            } else if (httpHost.getSchemeName().equalsIgnoreCase(UriUtil.HTTPS_SCHEME)) {
                port = WebSocket.DEFAULT_WSS_PORT;
            }
        }
        createSocket.setSoTimeout(this.f74526d.getSoTimeout());
        if (this.f74526d.getSndBufSize() > 0) {
            createSocket.setSendBufferSize(this.f74526d.getSndBufSize());
        }
        if (this.f74526d.getRcvBufSize() > 0) {
            createSocket.setReceiveBufferSize(this.f74526d.getRcvBufSize());
        }
        createSocket.setTcpNoDelay(this.f74526d.isTcpNoDelay());
        int soLinger = this.f74526d.getSoLinger();
        if (soLinger >= 0) {
            createSocket.setSoLinger(true, soLinger);
        }
        createSocket.setKeepAlive(this.f74526d.isSoKeepAlive());
        try {
            AccessController.doPrivileged(new C12609a(createSocket, new InetSocketAddress(hostName, port)));
            return (HttpClientConnection) this.f74527e.createConnection(createSocket);
        } catch (PrivilegedActionException e) {
            Asserts.check(e.getCause() instanceof IOException, "method contract violation only checked exceptions are wrapped: " + e.getCause());
            throw ((IOException) e.getCause());
        }
    }

    @Deprecated
    public BasicConnFactory(HttpParams httpParams) {
        this((SSLSocketFactory) null, httpParams);
    }

    public BasicConnFactory(SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, int i, SocketConfig socketConfig, ConnectionConfig connectionConfig) {
        this.f74523a = socketFactory;
        this.f74524b = sSLSocketFactory;
        this.f74525c = i;
        this.f74526d = socketConfig == null ? SocketConfig.DEFAULT : socketConfig;
        this.f74527e = new DefaultBHttpClientConnectionFactory(connectionConfig == null ? ConnectionConfig.DEFAULT : connectionConfig);
    }

    public BasicConnFactory(int i, SocketConfig socketConfig, ConnectionConfig connectionConfig) {
        this(null, null, i, socketConfig, connectionConfig);
    }

    public BasicConnFactory(SocketConfig socketConfig, ConnectionConfig connectionConfig) {
        this(null, null, 0, socketConfig, connectionConfig);
    }

    public BasicConnFactory() {
        this(null, null, 0, SocketConfig.DEFAULT, ConnectionConfig.DEFAULT);
    }
}
