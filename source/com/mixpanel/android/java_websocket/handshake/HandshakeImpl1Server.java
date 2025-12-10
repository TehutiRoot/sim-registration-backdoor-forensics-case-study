package com.mixpanel.android.java_websocket.handshake;

/* loaded from: classes5.dex */
public class HandshakeImpl1Server extends HandshakedataImpl1 implements ServerHandshakeBuilder {

    /* renamed from: c */
    public short f58454c;

    /* renamed from: d */
    public String f58455d;

    @Override // com.mixpanel.android.java_websocket.handshake.ServerHandshake
    public short getHttpStatus() {
        return this.f58454c;
    }

    @Override // com.mixpanel.android.java_websocket.handshake.ServerHandshake
    public String getHttpStatusMessage() {
        return this.f58455d;
    }

    @Override // com.mixpanel.android.java_websocket.handshake.ServerHandshakeBuilder
    public void setHttpStatus(short s) {
        this.f58454c = s;
    }

    @Override // com.mixpanel.android.java_websocket.handshake.ServerHandshakeBuilder
    public void setHttpStatusMessage(String str) {
        this.f58455d = str;
    }
}
