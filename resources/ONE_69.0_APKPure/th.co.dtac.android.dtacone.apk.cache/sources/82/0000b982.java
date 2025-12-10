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
    public WebSocketImpl f58440a;

    /* renamed from: b */
    public Socket f58441b;

    /* renamed from: c */
    public InputStream f58442c;

    /* renamed from: d */
    public OutputStream f58443d;

    /* renamed from: e */
    public Proxy f58444e;

    /* renamed from: f */
    public Thread f58445f;

    /* renamed from: g */
    public Draft f58446g;

    /* renamed from: h */
    public Map f58447h;

    /* renamed from: i */
    public CountDownLatch f58448i;

    /* renamed from: j */
    public CountDownLatch f58449j;

    /* renamed from: k */
    public int f58450k;
    protected URI uri;

    /* renamed from: com.mixpanel.android.java_websocket.client.WebSocketClient$b */
    /* loaded from: classes5.dex */
    public class RunnableC9124b implements Runnable {
        public RunnableC9124b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = WebSocketClient.this.f58440a.outQueue.take();
                    WebSocketClient.this.f58443d.write(take.array(), 0, take.limit());
                    WebSocketClient.this.f58443d.flush();
                } catch (IOException unused) {
                    WebSocketClient.this.f58440a.eot();
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
    public final int m33682c() {
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
        if (this.f58445f != null) {
            this.f58440a.close(1000);
        }
    }

    public void closeBlocking() throws InterruptedException {
        close();
        this.f58449j.await();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void closeConnection(int i, String str) {
        this.f58440a.closeConnection(i, str);
    }

    public void connect() {
        if (this.f58445f == null) {
            Thread thread = new Thread(this);
            this.f58445f = thread;
            thread.start();
            return;
        }
        throw new IllegalStateException("WebSocketClient objects are not reuseable");
    }

    public boolean connectBlocking() throws InterruptedException {
        connect();
        this.f58448i.await();
        return this.f58440a.isOpen();
    }

    /* renamed from: d */
    public final void m33681d() {
        String str;
        String path = this.uri.getPath();
        String query = this.uri.getQuery();
        if (path == null || path.length() == 0) {
            path = RemoteSettings.FORWARD_SLASH_STRING;
        }
        if (query != null) {
            path = path + CallerData.f39637NA + query;
        }
        int m33682c = m33682c();
        StringBuilder sb = new StringBuilder();
        sb.append(this.uri.getHost());
        if (m33682c != 80) {
            str = ":" + m33682c;
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();
        handshakeImpl1Client.setResourceDescriptor(path);
        handshakeImpl1Client.put("Host", sb2);
        Map map = this.f58447h;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                handshakeImpl1Client.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f58440a.startHandshake(handshakeImpl1Client);
    }

    public WebSocket getConnection() {
        return this.f58440a;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public Draft getDraft() {
        return this.f58446g;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        Socket socket = this.f58441b;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public WebSocket.READYSTATE getReadyState() {
        return this.f58440a.getReadyState();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        Socket socket = this.f58441b;
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
        return this.f58440a.hasBufferedData();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isClosed() {
        return this.f58440a.isClosed();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isClosing() {
        return this.f58440a.isClosing();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isConnecting() {
        return this.f58440a.isConnecting();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isFlushAndClose() {
        return this.f58440a.isFlushAndClose();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isOpen() {
        return this.f58440a.isOpen();
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
        this.f58448i.countDown();
        this.f58449j.countDown();
        Thread thread = this.f58445f;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            Socket socket = this.f58441b;
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
        this.f58448i.countDown();
        onOpen((ServerHandshake) handshakedata);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocketListener
    public final void onWriteDemand(WebSocket webSocket) {
    }

    @Override // java.lang.Runnable
    public void run() {
        int read;
        try {
            Socket socket = this.f58441b;
            if (socket == null) {
                this.f58441b = new Socket(this.f58444e);
            } else if (socket.isClosed()) {
                throw new IOException();
            }
            if (!this.f58441b.isBound()) {
                this.f58441b.connect(new InetSocketAddress(this.uri.getHost(), m33682c()), this.f58450k);
            }
            this.f58442c = this.f58441b.getInputStream();
            this.f58443d = this.f58441b.getOutputStream();
            m33681d();
            Thread thread = new Thread(new RunnableC9124b());
            this.f58445f = thread;
            thread.start();
            byte[] bArr = new byte[WebSocketImpl.RCVBUF];
            while (!isClosed() && (read = this.f58442c.read(bArr)) != -1) {
                try {
                    this.f58440a.decode(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException unused) {
                    this.f58440a.eot();
                    return;
                } catch (RuntimeException e) {
                    onError(e);
                    this.f58440a.closeConnection(1006, e.getMessage());
                    return;
                }
            }
            this.f58440a.eot();
        } catch (Exception e2) {
            onWebsocketError(this.f58440a, e2);
            this.f58440a.closeConnection(-1, e2.getMessage());
        }
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void send(String str) throws NotYetConnectedException {
        this.f58440a.send(str);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        this.f58440a.sendFragmentedFrame(opcode, byteBuffer, z);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void sendFrame(Framedata framedata) {
        this.f58440a.sendFrame(framedata);
    }

    public void setProxy(Proxy proxy) {
        if (proxy != null) {
            this.f58444e = proxy;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setSocket(Socket socket) {
        if (this.f58441b == null) {
            this.f58441b = socket;
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
        this.f58440a.send(bArr);
    }

    public WebSocketClient(URI uri, Draft draft, Map<String, String> map, int i) {
        this.uri = null;
        this.f58440a = null;
        this.f58441b = null;
        this.f58444e = Proxy.NO_PROXY;
        this.f58448i = new CountDownLatch(1);
        this.f58449j = new CountDownLatch(1);
        this.f58450k = 0;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (draft != null) {
            this.uri = uri;
            this.f58446g = draft;
            this.f58447h = map;
            this.f58450k = i;
            this.f58440a = new WebSocketImpl(this, draft);
            return;
        }
        throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void close(int i) {
        this.f58440a.close();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        return this.f58440a.getLocalSocketAddress();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        return this.f58440a.getRemoteSocketAddress();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void send(ByteBuffer byteBuffer) throws IllegalArgumentException, NotYetConnectedException {
        this.f58440a.send(byteBuffer);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void close(int i, String str) {
        this.f58440a.close(i, str);
    }
}