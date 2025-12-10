package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.br */
/* loaded from: classes5.dex */
public abstract class AbstractC9272br<T extends View> {
    private static int ThreeDS2Service = 0;
    private static int valueOf = 1;
    private T get;

    public abstract T ThreeDS2Service(Context context);

    public void ThreeDS2Service() {
        int i = valueOf;
        int i2 = i & 63;
        int i3 = i | 63;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public T valueOf(Context context) {
        int i = ThreeDS2Service;
        int i2 = i & 39;
        valueOf = (((((i ^ 39) | i2) << 1) - (~(-((~i2) & (i | 39))))) - 1) % 128;
        if (this.get == null) {
            int i3 = i & 23;
            int i4 = -(-(i | 23));
            int i5 = (i3 & i4) + (i4 | i3);
            valueOf = i5 % 128;
            if (i5 % 2 == 0) {
                this.get = ThreeDS2Service(context);
                int i6 = 7 / 0;
            } else {
                this.get = ThreeDS2Service(context);
            }
        }
        T t = this.get;
        int i7 = valueOf;
        ThreeDS2Service = (((i7 & 43) - (~(-(-(i7 | 43))))) - 1) % 128;
        return t;
    }

    public final void values() {
        ThreeDS2Service = (valueOf + 115) % 128;
        this.get = null;
        ThreeDS2Service();
        int i = ThreeDS2Service;
        int i2 = i & 109;
        int i3 = -(-((i ^ 109) | i2));
        valueOf = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
    }

    public T valueOf() {
        int i = valueOf;
        int i2 = i & 99;
        int i3 = ((i ^ 99) | i2) << 1;
        int i4 = -((~i2) & (i | 99));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        ThreeDS2Service = i5 % 128;
        int i6 = i5 % 2;
        T t = this.get;
        if (i6 != 0) {
            int i7 = 13 / 0;
        }
        int i8 = i & 51;
        ThreeDS2Service = ((i8 - (~((i ^ 51) | i8))) - 1) % 128;
        return t;
    }
}