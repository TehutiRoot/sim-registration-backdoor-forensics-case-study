package com.netcetera.threeds.sdk.infrastructure;

import android.os.Build;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mm */
/* loaded from: classes5.dex */
public class C9596mm {
    private static int ThreeDS2ServiceInstance = 1;
    private static int valueOf;

    public static InterfaceC9591mh get() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 107;
        int i3 = (i ^ 107) | i2;
        valueOf = ((i2 & i3) + (i3 | i2)) % 128;
        if (Build.VERSION.SDK_INT < 30) {
            C9594mk c9594mk = new C9594mk();
            int i4 = ThreeDS2ServiceInstance + 21;
            valueOf = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
            return c9594mk;
        }
        C9592mi c9592mi = new C9592mi();
        int i6 = ThreeDS2ServiceInstance;
        int i7 = ((i6 | 117) << 1) - (((~i6) & 117) | (i6 & (-118)));
        valueOf = i7 % 128;
        if (i7 % 2 == 0) {
            return c9592mi;
        }
        throw null;
    }

    public static InterfaceC9590mg valueOf() {
        int i = valueOf;
        int i2 = (i & 83) + (i | 83);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0 && Build.VERSION.SDK_INT < 30) {
            C9594mk c9594mk = new C9594mk();
            int i3 = valueOf;
            ThreeDS2ServiceInstance = ((i3 & 49) + (i3 | 49)) % 128;
            return c9594mk;
        }
        C9592mi c9592mi = new C9592mi();
        int i4 = valueOf;
        ThreeDS2ServiceInstance = ((i4 ^ 25) + ((i4 & 25) << 1)) % 128;
        return c9592mi;
    }
}
