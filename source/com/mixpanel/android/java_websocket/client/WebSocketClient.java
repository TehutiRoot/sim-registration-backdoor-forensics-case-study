package com.mixpanel.android.java_websocket.client;

import android.annotation.SuppressLint;
import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.WebSocketAdapter;
import com.mixpanel.android.java_websocket.WebSocketImpl;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.drafts.Draft_17;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.handshake.HandshakeImpl1Client;
import com.mixpanel.android.java_websocket.handshake.Handshakedata;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

@SuppressLint({"Assert"})
/* loaded from: classes5.dex */
public abstract class WebSocketClient extends WebSocketAdapter implements Runnable, WebSocket {

    /* renamed from: a */
    public WebSocketImpl f58428a;

    /* renamed from: b */
    public Socket f58429b;

    /* renamed from: c */
    public InputStream f58430c;

    /* renamed from: d */
    public OutputStream f58431d;

    /* renamed from: e */
    public Proxy f58432e;

    /* renamed from: f */
    public Thread f58433f;

    /* renamed from: g */
    public Draft f58434g;

    /* renamed from: h */
    public Map f58435h;

    /* renamed from: i */
    public CountDownLatch f58436i;

    /* renamed from: j */
    public CountDownLatch f58437j;

    /* renamed from: k */
    public int f58438k;
    protected URI uri;

    /* renamed from: com.mixpanel.android.java_websocket.client.WebSocketClient$b */
    /* loaded from: classes5.dex */
    public class RunnableC9135b implements Runnable {
        public RunnableC9135b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = WebSocketClient.this.f58428a.outQueue.take();
                    WebSocketClient.this.f58431d.write(take.array(), 0, take.limit());
                    WebSocketClient.this.f58431d.flush();
                } catch (IOException unused) {
                    WebSocketClient.this.f58428a.eot();
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }

    public WebSocketClient(URI uri) {
        this(uri, new Draft_17());
    }

    /* renamed from: c */
    public final int m33690c() {
        int port = this.uri.getPort();
        if (port == -1) {
            String scheme = this.uri.getScheme();
            if (scheme.equals("wss")) {
                return WebSocket.DEFAULT_WSS_PORT;
            }
            if (scheme.equals("ws")) {
                return 80;
            }
            throw new RuntimeException("unkonow scheme" + scheme);
        }
        return port;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void close() {
        if (this.f58433f != null) {
            this.f58428a.close(1000);
        }
    }

    public void closeBlocking() throws InterruptedException {
        close();
        this.f58437j.await();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void closeConnection(int i, String str) {
        this.f58428a.closeConnection(i, str);
    }

    public void connect() {
        if (this.f58433f == null) {
            Thread thread = new Thread(this);
            this.f58433f = thread;
            thread.start();
            return;
        }
        throw new IllegalStateException("WebSocketClient objects are not reuseable");
    }

    public boolean connectBlocking() throws InterruptedException {
        connect();
        this.f58436i.await();
        return this.f58428a.isOpen();
    }

    /* renamed from: d */
    public final void m33689d() {
        String str;
        String path = this.uri.getPath();
        String query = this.uri.getQuery();
        if (path == null || path.length() == 0) {
            path = RemoteSettings.FORWARD_SLASH_STRING;
        }
        if (query != null) {
            path = path + CallerData.f39639NA + query;
        }
        int m33690c = m33690c();
        StringBuilder sb = new StringBuilder();
        sb.append(this.uri.getHost());
        if (m33690c != 80) {
            str = ":" + m33690c;
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();
        handshakeImpl1Client.setResourceDescriptor(path);
        handshakeImpl1Client.put("Host", sb2);
        Map map = this.f58435h;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                handshakeImpl1Client.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f58428a.startHandshake(handshakeImpl1Client);
    }

    public WebSocket getConnection() {
        return this.f58428a;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public Draft getDraft() {
        return this.f58434g;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        Socket socket = this.f58429b;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public WebSocket.READYSTATE getReadyState() {
        return this.f58428a.getReadyState();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        Socket socket = this.f58429b;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public String getResourceDescriptor() {
        return this.uri.getPath();
    }

    public URI getURI() {
        return this.uri;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean hasBufferedData() {
        return this.f58428a.hasBufferedData();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isClosed() {
        return this.f58428a.isClosed();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isClosing() {
        return this.f58428a.isClosing();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isConnecting() {
        return this.f58428a.isConnecting();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isFlushAndClose() {
        return this.f58428a.isFlushAndClose();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isOpen() {
        return this.f58428a.isOpen();
    }

    public abstract void onClose(int i, String str, boolean z);

    public void onCloseInitiated(int i, String str) {
    }

    public void onClosing(int i, String str, boolean z) {
    }

    public abstract void onError(Exception exc);

    public void onFragment(Framedata framedata) {
    }

    public abstract void onMessage(String str);

    public void onMessage(ByteBuffer byteBuffer) {
    }

    public abstract void onOpen(ServerHandshake serverHandshake);

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        this.f58436i.countDown();
        this.f58437j.countDown();
        Thread thread = this.f58433f;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            Socket socket = this.f58429b;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            onWebsocketError(this, e);
        }
        onClose(i, str, z);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        onCloseInitiated(i, str);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        onClosing(i, str, z);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        onError(exc);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        onMessage(str);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketAdapter, com.mixpanel.android.java_websocket.WebSocketListener
    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
        onFragment(framedata);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public final void onWebsocketOpen(WebSocket webSocket, Handshakedata handshakedata) {
        this.f58436i.countDown();
        onOpen((ServerHandshake) handshakedata);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public final void onWriteDemand(WebSocket webSocket) {
    }

    @Override // java.lang.Runnable
    public void run() {
        int read;
        try {
            Socket socket = this.f58429b;
            if (socket == null) {
                this.f58429b = new Socket(this.f58432e);
            } else if (socket.isClosed()) {
                throw new IOException();
            }
            if (!this.f58429b.isBound()) {
                this.f58429b.connect(new InetSocketAddress(this.uri.getHost(), m33690c()), this.f58438k);
            }
            this.f58430c = this.f58429b.getInputStream();
            this.f58431d = this.f58429b.getOutputStream();
            m33689d();
            Thread thread = new Thread(new RunnableC9135b());
            this.f58433f = thread;
            thread.start();
            byte[] bArr = new byte[WebSocketImpl.RCVBUF];
            while (!isClosed() && (read = this.f58430c.read(bArr)) != -1) {
                try {
                    this.f58428a.decode(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException unused) {
                    this.f58428a.eot();
                    return;
                } catch (RuntimeException e) {
                    onError(e);
                    this.f58428a.closeConnection(1006, e.getMessage());
                    return;
                }
            }
            this.f58428a.eot();
        } catch (Exception e2) {
            onWebsocketError(this.f58428a, e2);
            this.f58428a.closeConnection(-1, e2.getMessage());
        }
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void send(String str) throws NotYetConnectedException {
        this.f58428a.send(str);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        this.f58428a.sendFragmentedFrame(opcode, byteBuffer, z);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void sendFrame(Framedata framedata) {
        this.f58428a.sendFrame(framedata);
    }

    public void setProxy(Proxy proxy) {
        if (proxy != null) {
            this.f58432e = proxy;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setSocket(Socket socket) {
        if (this.f58429b == null) {
            this.f58429b = socket;
            return;
        }
        throw new IllegalStateException("socket has already been set");
    }

    public WebSocketClient(URI uri, Draft draft) {
        this(uri, draft, null, 0);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        onMessage(byteBuffer);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void send(byte[] bArr) throws NotYetConnectedException {
        this.f58428a.send(bArr);
    }

    public WebSocketClient(URI uri, Draft draft, Map<String, String> map, int i) {
        this.uri = null;
        this.f58428a = null;
        this.f58429b = null;
        this.f58432e = Proxy.NO_PROXY;
        this.f58436i = new CountDownLatch(1);
        this.f58437j = new CountDownLatch(1);
        this.f58438k = 0;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (draft != null) {
            this.uri = uri;
            this.f58434g = draft;
            this.f58435h = map;
            this.f58438k = i;
            this.f58428a = new WebSocketImpl(this, draft);
            return;
        }
        throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void close(int i) {
        this.f58428a.close();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        return this.f58428a.getLocalSocketAddress();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        return this.f58428a.getRemoteSocketAddress();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void send(ByteBuffer byteBuffer) throws IllegalArgumentException, NotYetConnectedException {
        this.f58428a.send(byteBuffer);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void close(int i, String str) {
        this.f58428a.close(i, str);
    }
}
