package com.facebook.stetho.websocket;

/* loaded from: classes3.dex */
public interface SimpleEndpoint {
    void onClose(SimpleSession simpleSession, int i, String str);

    void onError(SimpleSession simpleSession, Throwable th2);

    void onMessage(SimpleSession simpleSession, String str);

    void onMessage(SimpleSession simpleSession, byte[] bArr, int i);

    void onOpen(SimpleSession simpleSession);
}
