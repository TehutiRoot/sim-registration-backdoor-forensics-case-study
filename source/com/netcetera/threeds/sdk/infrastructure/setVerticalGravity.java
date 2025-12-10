package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class setVerticalGravity implements setSelectionAfterHeaderView {
    private static int valueOf = 0;
    private static int values = 1;
    private final AtomicReference<Boolean> ThreeDS2Service;
    private final setDivider ThreeDS2ServiceInstance;

    public setVerticalGravity(setDivider setdivider, AtomicReference<Boolean> atomicReference) {
        this.ThreeDS2ServiceInstance = setdivider;
        this.ThreeDS2Service = atomicReference;
    }

    public static setSelectionAfterHeaderView ThreeDS2Service(Context context) {
        setVerticalGravity setverticalgravity = new setVerticalGravity(setDivider.get(context), new AtomicReference(Boolean.FALSE));
        int i = values;
        int i2 = i & 47;
        int i3 = -(-(i | 47));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return setverticalgravity;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectionAfterHeaderView
    public boolean ThreeDS2ServiceInstance() {
        int i = valueOf + 33;
        values = i % 128;
        if (i % 2 != 0) {
            return this.ThreeDS2Service.get().booleanValue();
        }
        this.ThreeDS2Service.get().booleanValue();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectionAfterHeaderView
    public void values(String str) {
        int i = values;
        int i2 = ((i ^ 35) | (i & 35)) << 1;
        int i3 = -(((~i) & 35) | (i & (-36)));
        valueOf = ((i2 & i3) + (i3 | i2)) % 128;
        if (C9669om.ThreeDS2Service(str)) {
            int i4 = values;
            valueOf = (((((i4 ^ 19) | (i4 & 19)) << 1) - (~(-(((~i4) & 19) | (i4 & (-20)))))) - 1) % 128;
            if (this.ThreeDS2ServiceInstance.get()) {
                int i5 = values;
                int i6 = i5 & 81;
                valueOf = (((i5 | 81) & (~i6)) + (i6 << 1)) % 128;
                this.ThreeDS2Service.set(Boolean.TRUE);
                throw setForegroundGravity.getSchemeLogo.valueOf(new Object[0]);
            }
            throw setForegroundGravity.getSchemePublicRootKeys.valueOf(new Object[0]);
        }
        int i7 = values;
        int i8 = i7 & 103;
        valueOf = ((i8 - (~((i7 ^ 103) | i8))) - 1) % 128;
    }
}
