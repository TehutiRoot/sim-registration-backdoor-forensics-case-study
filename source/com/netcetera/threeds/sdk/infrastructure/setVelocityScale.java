package com.netcetera.threeds.sdk.infrastructure;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes5.dex */
public final class setVelocityScale {
    private static int ThreeDS2ServiceInstance = 1;
    private static int valueOf;
    private final Handler values;

    private setVelocityScale(Handler handler) {
        this.values = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ThreeDS2Service() {
        int i = valueOf;
        int i2 = ((i ^ 51) | (i & 51)) << 1;
        int i3 = -(((~i) & 51) | (i & (-52)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2ServiceInstance = i4 % 128;
        int i5 = i4 % 2;
        Runtime.getRuntime().gc();
        if (i5 != 0) {
            int i6 = ThreeDS2ServiceInstance;
            valueOf = (((i6 & (-28)) | ((~i6) & 27)) + ((i6 & 27) << 1)) % 128;
            return;
        }
        throw null;
    }

    public static setVelocityScale valueOf() {
        setVelocityScale setvelocityscale = new setVelocityScale(new Handler(Looper.getMainLooper()));
        int i = valueOf;
        int i2 = ((i | 13) << 1) - (i ^ 13);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return setvelocityscale;
        }
        throw null;
    }

    public void get() {
        int i = valueOf;
        int i2 = i ^ 3;
        int i3 = (i & 3) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2ServiceInstance = i4 % 128;
        int i5 = i4 % 2;
        this.values.post(setDrawSelectorOnTop.values);
        if (i5 != 0) {
            valueOf = (ThreeDS2ServiceInstance + 43) % 128;
            return;
        }
        throw null;
    }
}
