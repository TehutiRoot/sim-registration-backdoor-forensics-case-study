package com.mixpanel.android.java_websocket.handshake;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public class HandshakedataImpl1 implements HandshakeBuilder {

    /* renamed from: a */
    public byte[] f58468a;

    /* renamed from: b */
    public TreeMap f58469b = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    @Override // com.mixpanel.android.java_websocket.handshake.Handshakedata
    public byte[] getContent() {
        return this.f58468a;
    }

    @Override // com.mixpanel.android.java_websocket.handshake.Handshakedata
    public String getFieldValue(String str) {
        String str2 = (String) this.f58469b.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // com.mixpanel.android.java_websocket.handshake.Handshakedata
    public boolean hasFieldValue(String str) {
        return this.f58469b.containsKey(str);
    }

    @Override // com.mixpanel.android.java_websocket.handshake.Handshakedata
    public Iterator<String> iterateHttpFields() {
        return Collections.unmodifiableSet(this.f58469b.keySet()).iterator();
    }

    @Override // com.mixpanel.android.java_websocket.handshake.HandshakeBuilder
    public void put(String str, String str2) {
        this.f58469b.put(str, str2);
    }

    @Override // com.mixpanel.android.java_websocket.handshake.HandshakeBuilder
    public void setContent(byte[] bArr) {
        this.f58468a = bArr;
    }
}