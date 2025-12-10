package com.mixpanel.android.viewcrawler;

import com.mixpanel.android.java_websocket.client.WebSocketClient;
import com.mixpanel.android.java_websocket.drafts.Draft_17;
import com.mixpanel.android.java_websocket.exceptions.NotSendableException;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.handshake.ServerHandshake;
import com.mixpanel.android.util.MPLog;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class EditorConnection {

    /* renamed from: d */
    public static final ByteBuffer f58778d = ByteBuffer.allocate(0);

    /* renamed from: a */
    public final Editor f58779a;

    /* renamed from: b */
    public final C9194b f58780b;

    /* renamed from: c */
    public final URI f58781c;

    /* loaded from: classes5.dex */
    public interface Editor {
        void bindEvents(JSONObject jSONObject);

        void cleanup();

        void clearEdits(JSONObject jSONObject);

        void performEdit(JSONObject jSONObject);

        void sendDeviceInfo();

        void sendSnapshot(JSONObject jSONObject);

        void setTweaks(JSONObject jSONObject);
    }

    /* loaded from: classes5.dex */
    public class EditorConnectionException extends IOException {
        private static final long serialVersionUID = -1884953175346045636L;

        public EditorConnectionException(Throwable th2) {
            super(th2.getMessage());
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.EditorConnection$b */
    /* loaded from: classes5.dex */
    public class C9194b extends WebSocketClient {
        public C9194b(URI uri, int i, Socket socket) {
            super(uri, new Draft_17(), null, i);
            setSocket(socket);
        }

        @Override // com.mixpanel.android.java_websocket.client.WebSocketClient
        public void onClose(int i, String str, boolean z) {
            MPLog.m33445v("MixpanelAPI.EditorCnctn", "WebSocket closed. Code: " + i + ", reason: " + str + "\nURI: " + EditorConnection.this.f58781c);
            EditorConnection.this.f58779a.cleanup();
        }

        @Override // com.mixpanel.android.java_websocket.client.WebSocketClient
        public void onError(Exception exc) {
            if (exc != null && exc.getMessage() != null) {
                MPLog.m33449e("MixpanelAPI.EditorCnctn", "Websocket Error: " + exc.getMessage());
                return;
            }
            MPLog.m33449e("MixpanelAPI.EditorCnctn", "Unknown websocket error occurred");
        }

        @Override // com.mixpanel.android.java_websocket.client.WebSocketClient
        public void onMessage(String str) {
            MPLog.m33445v("MixpanelAPI.EditorCnctn", "Received message from editor:\n" + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("type");
                if (string.equals("device_info_request")) {
                    EditorConnection.this.f58779a.sendDeviceInfo();
                } else if (string.equals("snapshot_request")) {
                    EditorConnection.this.f58779a.sendSnapshot(jSONObject);
                } else if (string.equals("change_request")) {
                    EditorConnection.this.f58779a.performEdit(jSONObject);
                } else if (string.equals("event_binding_request")) {
                    EditorConnection.this.f58779a.bindEvents(jSONObject);
                } else if (string.equals("clear_request")) {
                    EditorConnection.this.f58779a.clearEdits(jSONObject);
                } else if (string.equals("tweak_request")) {
                    EditorConnection.this.f58779a.setTweaks(jSONObject);
                }
            } catch (JSONException e) {
                MPLog.m33448e("MixpanelAPI.EditorCnctn", "Bad JSON received:" + str, e);
            }
        }

        @Override // com.mixpanel.android.java_websocket.client.WebSocketClient
        public void onOpen(ServerHandshake serverHandshake) {
            MPLog.m33445v("MixpanelAPI.EditorCnctn", "Websocket connected");
        }
    }

    public EditorConnection(URI uri, Editor editor, Socket socket) {
        this.f58779a = editor;
        this.f58781c = uri;
        try {
            C9194b c9194b = new C9194b(uri, 5000, socket);
            this.f58780b = c9194b;
            c9194b.connectBlocking();
        } catch (InterruptedException e) {
            throw new EditorConnectionException(e);
        }
    }

    /* renamed from: e */
    public BufferedOutputStream m33428e() {
        return new BufferedOutputStream(new C9195c());
    }

    /* renamed from: f */
    public boolean m33427f() {
        return this.f58780b.isOpen();
    }

    /* renamed from: g */
    public boolean m33426g() {
        if (!this.f58780b.isClosed() && !this.f58780b.isClosing() && !this.f58780b.isFlushAndClose()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.mixpanel.android.viewcrawler.EditorConnection$c */
    /* loaded from: classes5.dex */
    public class C9195c extends OutputStream {
        public C9195c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                EditorConnection.this.f58780b.sendFragmentedFrame(Framedata.Opcode.TEXT, EditorConnection.f58778d, true);
            } catch (NotSendableException e) {
                throw new EditorConnectionException(e);
            } catch (WebsocketNotConnectedException e2) {
                throw new EditorConnectionException(e2);
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            write(new byte[]{(byte) i}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            write(bArr, 0, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            try {
                EditorConnection.this.f58780b.sendFragmentedFrame(Framedata.Opcode.TEXT, ByteBuffer.wrap(bArr, i, i2), false);
            } catch (NotSendableException e) {
                throw new EditorConnectionException(e);
            } catch (WebsocketNotConnectedException e2) {
                throw new EditorConnectionException(e2);
            }
        }
    }
}