package com.mixpanel.android.java_websocket;

import android.annotation.SuppressLint;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.drafts.Draft_10;
import com.mixpanel.android.java_websocket.drafts.Draft_17;
import com.mixpanel.android.java_websocket.drafts.Draft_75;
import com.mixpanel.android.java_websocket.drafts.Draft_76;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import com.mixpanel.android.java_websocket.framing.CloseFrame;
import com.mixpanel.android.java_websocket.framing.CloseFrameBuilder;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.handshake.ClientHandshake;
import com.mixpanel.android.java_websocket.handshake.ClientHandshakeBuilder;
import com.mixpanel.android.java_websocket.handshake.Handshakedata;
import com.mixpanel.android.java_websocket.util.Charsetfunctions;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@SuppressLint({"Assert"})
/* loaded from: classes5.dex */
public class WebSocketImpl implements WebSocket {
    public static boolean DEBUG = false;
    public static int RCVBUF = 16384;
    public static final List<Draft> defaultdraftlist;

    /* renamed from: a */
    public volatile boolean f58415a;

    /* renamed from: b */
    public WebSocket.READYSTATE f58416b;

    /* renamed from: c */
    public final WebSocketListener f58417c;
    public ByteChannel channel;

    /* renamed from: d */
    public List f58418d;

    /* renamed from: e */
    public Draft f58419e;

    /* renamed from: f */
    public WebSocket.Role f58420f;

    /* renamed from: g */
    public Framedata.Opcode f58421g;

    /* renamed from: h */
    public ByteBuffer f58422h;

    /* renamed from: i */
    public ClientHandshake f58423i;
    public final BlockingQueue<ByteBuffer> inQueue;

    /* renamed from: j */
    public String f58424j;

    /* renamed from: k */
    public Integer f58425k;
    public SelectionKey key;

    /* renamed from: l */
    public Boolean f58426l;

    /* renamed from: m */
    public String f58427m;
    public final BlockingQueue<ByteBuffer> outQueue;

    static {
        ArrayList arrayList = new ArrayList(4);
        defaultdraftlist = arrayList;
        arrayList.add(new Draft_17());
        arrayList.add(new Draft_10());
        arrayList.add(new Draft_76());
        arrayList.add(new Draft_75());
    }

    public WebSocketImpl(WebSocketListener webSocketListener, List<Draft> list) {
        this(webSocketListener, (Draft) null);
        this.f58420f = WebSocket.Role.SERVER;
        if (list != null && !list.isEmpty()) {
            this.f58418d = list;
        } else {
            this.f58418d = defaultdraftlist;
        }
    }

    /* renamed from: a */
    public final void m33700a(int i, String str, boolean z) {
        WebSocket.READYSTATE readystate = this.f58416b;
        WebSocket.READYSTATE readystate2 = WebSocket.READYSTATE.CLOSING;
        if (readystate != readystate2 && readystate != WebSocket.READYSTATE.CLOSED) {
            if (readystate == WebSocket.READYSTATE.OPEN) {
                if (i == 1006) {
                    this.f58416b = readystate2;
                    flushAndClose(i, str, false);
                    return;
                }
                if (this.f58419e.getCloseHandshakeType() != Draft.CloseHandshakeType.NONE) {
                    try {
                        if (!z) {
                            try {
                                this.f58417c.onWebsocketCloseInitiated(this, i, str);
                            } catch (RuntimeException e) {
                                this.f58417c.onWebsocketError(this, e);
                            }
                        }
                        sendFrame(new CloseFrameBuilder(i, str));
                    } catch (InvalidDataException e2) {
                        this.f58417c.onWebsocketError(this, e2);
                        flushAndClose(1006, "generated frame is invalid", false);
                    }
                }
                flushAndClose(i, str, z);
            } else if (i == -3) {
                flushAndClose(-3, str, true);
            } else {
                flushAndClose(-1, str, false);
            }
            if (i == 1002) {
                flushAndClose(i, str, z);
            }
            this.f58416b = WebSocket.READYSTATE.CLOSING;
            this.f58422h = null;
        }
    }

    /* renamed from: b */
    public final void m33699b(ByteBuffer byteBuffer) {
        String str;
        int i;
        try {
        } catch (InvalidDataException e) {
            this.f58417c.onWebsocketError(this, e);
            close(e);
            return;
        }
        for (Framedata framedata : this.f58419e.translateFrame(byteBuffer)) {
            if (DEBUG) {
                PrintStream printStream = System.out;
                printStream.println("matched frame: " + framedata);
            }
            Framedata.Opcode opcode = framedata.getOpcode();
            boolean isFin = framedata.isFin();
            if (opcode == Framedata.Opcode.CLOSING) {
                if (!(framedata instanceof CloseFrame)) {
                    str = "";
                    i = 1005;
                } else {
                    CloseFrame closeFrame = (CloseFrame) framedata;
                    i = closeFrame.getCloseCode();
                    str = closeFrame.getMessage();
                }
                if (this.f58416b == WebSocket.READYSTATE.CLOSING) {
                    closeConnection(i, str, true);
                } else if (this.f58419e.getCloseHandshakeType() == Draft.CloseHandshakeType.TWOWAY) {
                    m33700a(i, str, true);
                } else {
                    flushAndClose(i, str, false);
                }
            } else if (opcode == Framedata.Opcode.PING) {
                this.f58417c.onWebsocketPing(this, framedata);
            } else if (opcode == Framedata.Opcode.PONG) {
                this.f58417c.onWebsocketPong(this, framedata);
            } else {
                if (isFin && opcode != Framedata.Opcode.CONTINUOUS) {
                    if (this.f58421g == null) {
                        if (opcode == Framedata.Opcode.TEXT) {
                            try {
                                this.f58417c.onWebsocketMessage(this, Charsetfunctions.stringUtf8(framedata.getPayloadData()));
                            } catch (RuntimeException e2) {
                                this.f58417c.onWebsocketError(this, e2);
                            }
                        } else if (opcode == Framedata.Opcode.BINARY) {
                            try {
                                this.f58417c.onWebsocketMessage(this, framedata.getPayloadData());
                            } catch (RuntimeException e3) {
                                this.f58417c.onWebsocketError(this, e3);
                            }
                        } else {
                            throw new InvalidDataException(1002, "non control or continious frame expected");
                        }
                        this.f58417c.onWebsocketError(this, e);
                        close(e);
                        return;
                    }
                    throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
                }
                if (opcode != Framedata.Opcode.CONTINUOUS) {
                    if (this.f58421g == null) {
                        this.f58421g = opcode;
                    } else {
                        throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
                    }
                } else if (isFin) {
                    if (this.f58421g != null) {
                        this.f58421g = null;
                    } else {
                        throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                    }
                } else if (this.f58421g == null) {
                    throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                }
                try {
                    this.f58417c.onWebsocketMessageFragment(this, framedata);
                } catch (RuntimeException e4) {
                    this.f58417c.onWebsocketError(this, e4);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m33698c(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.java_websocket.WebSocketImpl.m33698c(java.nio.ByteBuffer):boolean");
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void close(int i, String str) {
        m33700a(i, str, false);
    }

    public synchronized void closeConnection(int i, String str, boolean z) {
        try {
            if (this.f58416b == WebSocket.READYSTATE.CLOSED) {
                return;
            }
            SelectionKey selectionKey = this.key;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.channel;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e) {
                    this.f58417c.onWebsocketError(this, e);
                }
            }
            try {
                this.f58417c.onWebsocketClose(this, i, str, z);
            } catch (RuntimeException e2) {
                this.f58417c.onWebsocketError(this, e2);
            }
            Draft draft = this.f58419e;
            if (draft != null) {
                draft.reset();
            }
            this.f58423i = null;
            this.f58416b = WebSocket.READYSTATE.CLOSED;
            this.outQueue.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    public final Draft.HandshakeState m33697d(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        int limit = byteBuffer.limit();
        byte[] bArr = Draft.FLASH_POLICY_REQUEST;
        if (limit > bArr.length) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (byteBuffer.limit() >= bArr.length) {
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                if (Draft.FLASH_POLICY_REQUEST[i] != byteBuffer.get()) {
                    byteBuffer.reset();
                    return Draft.HandshakeState.NOT_MATCHED;
                }
                i++;
            }
            return Draft.HandshakeState.MATCHED;
        }
        throw new IncompleteHandshakeException(bArr.length);
    }

    public void decode(ByteBuffer byteBuffer) {
        String str;
        if (DEBUG) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("process(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            if (byteBuffer.remaining() > 1000) {
                str = "too big to display";
            } else {
                str = new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            }
            sb.append(str);
            sb.append("}");
            printStream.println(sb.toString());
        }
        if (this.f58416b != WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            m33699b(byteBuffer);
        } else if (m33698c(byteBuffer)) {
            if (byteBuffer.hasRemaining()) {
                m33699b(byteBuffer);
            } else if (this.f58422h.hasRemaining()) {
                m33699b(this.f58422h);
            }
        }
    }

    /* renamed from: e */
    public final void m33696e(Handshakedata handshakedata) {
        if (DEBUG) {
            PrintStream printStream = System.out;
            printStream.println("open using draft: " + this.f58419e.getClass().getSimpleName());
        }
        this.f58416b = WebSocket.READYSTATE.OPEN;
        try {
            this.f58417c.onWebsocketOpen(this, handshakedata);
        } catch (RuntimeException e) {
            this.f58417c.onWebsocketError(this, e);
        }
    }

    public void eot() {
        if (getReadyState() == WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            closeConnection(-1, true);
        } else if (this.f58415a) {
            closeConnection(this.f58425k.intValue(), this.f58424j, this.f58426l.booleanValue());
        } else if (this.f58419e.getCloseHandshakeType() == Draft.CloseHandshakeType.NONE) {
            closeConnection(1000, true);
        } else if (this.f58419e.getCloseHandshakeType() == Draft.CloseHandshakeType.ONEWAY) {
            if (this.f58420f == WebSocket.Role.SERVER) {
                closeConnection(1006, true);
            } else {
                closeConnection(1000, true);
            }
        } else {
            closeConnection(1006, true);
        }
    }

    /* renamed from: f */
    public final void m33695f(Collection collection) {
        if (isOpen()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                sendFrame((Framedata) it.next());
            }
            return;
        }
        throw new WebsocketNotConnectedException();
    }

    public synchronized void flushAndClose(int i, String str, boolean z) {
        if (this.f58415a) {
            return;
        }
        this.f58425k = Integer.valueOf(i);
        this.f58424j = str;
        this.f58426l = Boolean.valueOf(z);
        this.f58415a = true;
        this.f58417c.onWriteDemand(this);
        try {
            this.f58417c.onWebsocketClosing(this, i, str, z);
        } catch (RuntimeException e) {
            this.f58417c.onWebsocketError(this, e);
        }
        Draft draft = this.f58419e;
        if (draft != null) {
            draft.reset();
        }
        this.f58423i = null;
    }

    /* renamed from: g */
    public final void m33694g(ByteBuffer byteBuffer) {
        String str;
        if (DEBUG) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("write(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            if (byteBuffer.remaining() > 1000) {
                str = "too big to display";
            } else {
                str = new String(byteBuffer.array());
            }
            sb.append(str);
            sb.append("}");
            printStream.println(sb.toString());
        }
        this.outQueue.add(byteBuffer);
        this.f58417c.onWriteDemand(this);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public Draft getDraft() {
        return this.f58419e;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        return this.f58417c.getLocalSocketAddress(this);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public WebSocket.READYSTATE getReadyState() {
        return this.f58416b;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        return this.f58417c.getRemoteSocketAddress(this);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public String getResourceDescriptor() {
        return this.f58427m;
    }

    /* renamed from: h */
    public final void m33693h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m33694g((ByteBuffer) it.next());
        }
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean hasBufferedData() {
        return !this.outQueue.isEmpty();
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isClosed() {
        if (this.f58416b == WebSocket.READYSTATE.CLOSED) {
            return true;
        }
        return false;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isClosing() {
        if (this.f58416b == WebSocket.READYSTATE.CLOSING) {
            return true;
        }
        return false;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isConnecting() {
        if (this.f58416b == WebSocket.READYSTATE.CONNECTING) {
            return true;
        }
        return false;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isFlushAndClose() {
        return this.f58415a;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public boolean isOpen() {
        if (this.f58416b == WebSocket.READYSTATE.OPEN) {
            return true;
        }
        return false;
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void send(String str) throws WebsocketNotConnectedException {
        if (str == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        m33695f(this.f58419e.createFrames(str, this.f58420f == WebSocket.Role.CLIENT));
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        m33695f(this.f58419e.continuousFrame(opcode, byteBuffer, z));
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void sendFrame(Framedata framedata) {
        if (DEBUG) {
            PrintStream printStream = System.out;
            printStream.println("send frame: " + framedata);
        }
        m33694g(this.f58419e.createBinaryFrame(framedata));
    }

    public void startHandshake(ClientHandshakeBuilder clientHandshakeBuilder) throws InvalidHandshakeException {
        this.f58423i = this.f58419e.postProcessHandshakeRequestAsClient(clientHandshakeBuilder);
        this.f58427m = clientHandshakeBuilder.getResourceDescriptor();
        try {
            this.f58417c.onWebsocketHandshakeSentAsClient(this, this.f58423i);
            m33693h(this.f58419e.createHandshake(this.f58423i, this.f58420f));
        } catch (InvalidDataException unused) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        } catch (RuntimeException e) {
            this.f58417c.onWebsocketError(this, e);
            throw new InvalidHandshakeException("rejected because of" + e);
        }
    }

    public String toString() {
        return super.toString();
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void close(int i) {
        m33700a(i, "", false);
    }

    public void close(InvalidDataException invalidDataException) {
        m33700a(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void send(ByteBuffer byteBuffer) throws IllegalArgumentException, WebsocketNotConnectedException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        m33695f(this.f58419e.createFrames(byteBuffer, this.f58420f == WebSocket.Role.CLIENT));
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void close() {
        close(1000);
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void send(byte[] bArr) throws IllegalArgumentException, WebsocketNotConnectedException {
        send(ByteBuffer.wrap(bArr));
    }

    public WebSocketImpl(WebSocketListener webSocketListener, Draft draft) {
        this.f58415a = false;
        this.f58416b = WebSocket.READYSTATE.NOT_YET_CONNECTED;
        this.f58419e = null;
        this.f58421g = null;
        this.f58422h = ByteBuffer.allocate(0);
        this.f58423i = null;
        this.f58424j = null;
        this.f58425k = null;
        this.f58426l = null;
        this.f58427m = null;
        if (webSocketListener != null && (draft != null || this.f58420f != WebSocket.Role.SERVER)) {
            this.outQueue = new LinkedBlockingQueue();
            this.inQueue = new LinkedBlockingQueue();
            this.f58417c = webSocketListener;
            this.f58420f = WebSocket.Role.CLIENT;
            if (draft != null) {
                this.f58419e = draft.copyInstance();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }

    public void closeConnection(int i, boolean z) {
        closeConnection(i, "", z);
    }

    public void closeConnection() {
        if (this.f58426l != null) {
            closeConnection(this.f58425k.intValue(), this.f58424j, this.f58426l.booleanValue());
            return;
        }
        throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
    }

    @Override // com.mixpanel.android.java_websocket.WebSocket
    public void closeConnection(int i, String str) {
        closeConnection(i, str, false);
    }

    @Deprecated
    public WebSocketImpl(WebSocketListener webSocketListener, Draft draft, Socket socket) {
        this(webSocketListener, draft);
    }

    @Deprecated
    public WebSocketImpl(WebSocketListener webSocketListener, List<Draft> list, Socket socket) {
        this(webSocketListener, list);
    }
}
