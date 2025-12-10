package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.ImageFormat;
import android.view.KeyEvent;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class setGravity implements setBaselineAlignedChildIndex {
    private static int valueOf = 1;
    private static int values;
    private final setBaselineAligned ThreeDS2Service;
    private final AtomicReference<Boolean> ThreeDS2ServiceInstance;
    private final AtomicReference<setFooterDividersEnabled> get;

    public setGravity(setBaselineAligned setbaselinealigned, AtomicReference<Boolean> atomicReference, AtomicReference<setFooterDividersEnabled> atomicReference2) {
        this.ThreeDS2Service = setbaselinealigned;
        this.ThreeDS2ServiceInstance = atomicReference;
        this.get = atomicReference2;
    }

    public static setBaselineAlignedChildIndex get(Context context) {
        try {
            setGravity setgravity = new setGravity((setBaselineAligned) ((Class) get3DSServerTransactionID.ThreeDS2Service(1938 - KeyEvent.getDeadChar(0, 0), 63 - View.MeasureSpec.getSize(0), (char) (ImageFormat.getBitsPerPixel(0) + 38198))).getMethod("values", Context.class).invoke(null, context), new AtomicReference(Boolean.FALSE), new AtomicReference(setFooterDividersEnabled.ThreeDS2Service()));
            int i = valueOf;
            int i2 = i & 59;
            values = (i2 + ((i ^ 59) | i2)) % 128;
            return setgravity;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setBaselineAlignedChildIndex
    public synchronized String ThreeDS2ServiceInstance(String str) throws setId {
        setFooterDividersEnabled valueOf2;
        String valueOf3;
        try {
            int i = values;
            int i2 = ((i | 86) << 1) - (i ^ 86);
            valueOf = ((~i2) + (i2 << 1)) % 128;
            if (this.ThreeDS2ServiceInstance.get().booleanValue()) {
                int i3 = valueOf;
                int i4 = ((i3 & (-106)) | ((~i3) & 105)) + ((i3 & 105) << 1);
                values = i4 % 128;
                if (i4 % 2 == 0) {
                    valueOf2 = this.get.get();
                    int i5 = valueOf;
                    values = ((i5 & 43) + (i5 | 43)) % 128;
                } else {
                    this.get.get();
                    throw null;
                }
            } else {
                valueOf2 = this.ThreeDS2Service.valueOf(str).valueOf();
                int i6 = valueOf;
                int i7 = i6 & 31;
                values = ((((i6 | 31) & (~i7)) - (~(-(-(i7 << 1))))) - 1) % 128;
            }
            if (!(!valueOf2.get().booleanValue())) {
                valueOf3 = valueOf2.valueOf();
                int i8 = valueOf;
                int i9 = i8 & 1;
                values = (((i8 | 1) & (~i9)) + (i9 << 1)) % 128;
            } else {
                int i10 = values;
                valueOf = ((((i10 | 18) << 1) - (i10 ^ 18)) - 1) % 128;
                throw setForegroundGravity.getSchemeLogoDark.valueOf(new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return valueOf3;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setBaselineAlignedChildIndex
    public synchronized void values(setFooterDividersEnabled setfooterdividersenabled) {
        int i = valueOf;
        int i2 = i & 57;
        int i3 = -(-((i ^ 57) | i2));
        values = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        this.ThreeDS2ServiceInstance.set(Boolean.TRUE);
        this.get.set(setfooterdividersenabled);
        int i4 = valueOf + 27;
        values = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
    }
}
