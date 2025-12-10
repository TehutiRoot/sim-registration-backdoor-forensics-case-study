package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ol */
/* loaded from: classes5.dex */
public class C9668ol {
    private static C9672op ThreeDS2Service() {
        return new C9672op();
    }

    public static String get(byte[] bArr) {
        return ThreeDS2Service().ThreeDS2ServiceInstance(bArr);
    }

    public static byte[] valueOf(String str) {
        return ThreeDS2Service().ThreeDS2ServiceInstance(str);
    }
}
