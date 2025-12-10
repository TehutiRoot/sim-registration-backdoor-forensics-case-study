package com.mixpanel.android.java_websocket.handshake;

import org.slf4j.Marker;

/* loaded from: classes5.dex */
public class HandshakeImpl1Client extends HandshakedataImpl1 implements ClientHandshakeBuilder {

    /* renamed from: c */
    public String f58453c = Marker.ANY_MARKER;

    @Override // com.mixpanel.android.java_websocket.handshake.ClientHandshake
    public String getResourceDescriptor() {
        return this.f58453c;
    }

    @Override // com.mixpanel.android.java_websocket.handshake.ClientHandshakeBuilder
    public void setResourceDescriptor(String str) throws IllegalArgumentException {
        if (str != null) {
            this.f58453c = str;
            return;
        }
        throw new IllegalArgumentException("http resource descriptor must not be null");
    }
}
