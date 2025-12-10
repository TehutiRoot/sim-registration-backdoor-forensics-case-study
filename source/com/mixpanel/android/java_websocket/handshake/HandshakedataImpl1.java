package com.mixpanel.android.java_websocket.handshake;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public class HandshakedataImpl1 implements HandshakeBuilder {

    /* renamed from: a */
    public byte[] f58456a;

    /* renamed from: b */
    public TreeMap f58457b = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    @Override // com.mixpanel.android.java_websocket.handshake.Handshakedata
    public byte[] getContent() {
        return this.f58456a;
    }

    @Override // com.mixpanel.android.java_websocket.handshake.Handshakedata
    public String getFieldValue(String str) {
        String str2 = (String) this.f58457b.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // com.mixpanel.android.java_websocket.handshake.Handshakedata
    public boolean hasFieldValue(String str) {
        return this.f58457b.containsKey(str);
    }

    @Override // com.mixpanel.android.java_websocket.handshake.Handshakedata
    public Iterator<String> iterateHttpFields() {
        return Collections.unmodifiableSet(this.f58457b.keySet()).iterator();
    }

    @Override // com.mixpanel.android.java_websocket.handshake.HandshakeBuilder
    public void put(String str, String str2) {
        this.f58457b.put(str, str2);
    }

    @Override // com.mixpanel.android.java_websocket.handshake.HandshakeBuilder
    public void setContent(byte[] bArr) {
        this.f58456a = bArr;
    }
}
