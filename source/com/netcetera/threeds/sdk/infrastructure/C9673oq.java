package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.oq */
/* loaded from: classes5.dex */
public class C9673oq {
    private C9672op values = new C9672op(-1, null, true);

    public String ThreeDS2Service(String str) {
        return valueOf(str, "UTF-8");
    }

    public byte[] ThreeDS2ServiceInstance(String str) {
        return this.values.ThreeDS2ServiceInstance(str);
    }

    public String valueOf(String str, String str2) {
        return C9730ro.ThreeDS2Service(ThreeDS2ServiceInstance(str), str2);
    }

    public String values(String str) {
        return values(str, "UTF-8");
    }

    public String ThreeDS2Service(byte[] bArr) {
        return this.values.ThreeDS2ServiceInstance(bArr);
    }

    public String values(String str, String str2) {
        return ThreeDS2Service(C9730ro.valueOf(str, str2));
    }

    private static C9673oq valueOf() {
        return new C9673oq();
    }

    public static String values(byte[] bArr) {
        return valueOf().ThreeDS2Service(bArr);
    }
}
