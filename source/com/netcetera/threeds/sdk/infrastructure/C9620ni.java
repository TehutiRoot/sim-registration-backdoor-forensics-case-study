package com.netcetera.threeds.sdk.infrastructure;

import android.os.Looper;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ni */
/* loaded from: classes5.dex */
public final class C9620ni {
    private static int ThreeDS2Service = 1;
    private static int valueOf;

    public void ThreeDS2Service(String str) {
        int i = valueOf;
        int i2 = i & 33;
        int i3 = ((((i ^ 33) | i2) << 1) - (~(-((i | 33) & (~i2))))) - 1;
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                int i4 = ThreeDS2Service;
                int i5 = i4 & 85;
                int i6 = i5 + ((i4 ^ 85) | i5);
                valueOf = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 37 / 0;
                    return;
                }
                return;
            }
            throw setForegroundGravity.getLicenseExpiryDate.valueOf(str);
        }
        Looper.getMainLooper().getThread();
        Thread.currentThread();
        throw null;
    }

    public void values(String str) {
        int i = valueOf;
        int i2 = i & 51;
        int i3 = (((i ^ 51) | i2) << 1) - ((i | 51) & (~i2));
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                valueOf = (ThreeDS2Service + 31) % 128;
                return;
            }
            int i4 = valueOf;
            ThreeDS2Service = (((i4 ^ 102) + ((i4 & 102) << 1)) - 1) % 128;
            throw setForegroundGravity.SDKInfo.valueOf(str);
        }
        Looper.getMainLooper().getThread();
        Thread.currentThread();
        throw null;
    }
}
