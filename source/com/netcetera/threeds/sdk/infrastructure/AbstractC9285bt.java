package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bt */
/* loaded from: classes5.dex */
public abstract class AbstractC9285bt<T extends View> extends AbstractC9283br<T> {
    private static int ThreeDS2Service = 0;
    private static int valueOf = 1;
    private setAllCaps get;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (valueOf() != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (valueOf() != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        values(r4, valueOf());
        com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.ThreeDS2Service = (com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.valueOf + 29) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void get(com.netcetera.threeds.sdk.infrastructure.setAllCaps r4) {
        /*
            r3 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.valueOf
            r1 = r0 & (-26)
            int r2 = ~r0
            r2 = r2 & 25
            r1 = r1 | r2
            r0 = r0 & 25
            int r0 = r0 << 1
            int r0 = -r0
            int r0 = -r0
            r2 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << 1
            int r2 = r2 + r0
            int r0 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.ThreeDS2Service = r0
            int r2 = r2 % 2
            if (r2 == 0) goto L29
            r3.get = r4
            android.view.View r0 = r3.valueOf()
            r1 = 9
            int r1 = r1 / 0
            if (r0 == 0) goto L40
            goto L31
        L29:
            r3.get = r4
            android.view.View r0 = r3.valueOf()
            if (r0 == 0) goto L40
        L31:
            android.view.View r0 = r3.valueOf()
            r3.values(r4, r0)
            int r4 = com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.valueOf
            int r4 = r4 + 29
            int r4 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.ThreeDS2Service = r4
        L40:
            int r4 = com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.valueOf
            int r4 = r4 + 61
            int r4 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.ThreeDS2Service = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.get(com.netcetera.threeds.sdk.infrastructure.setAllCaps):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r3.get != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r3.get != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        values(r3.get, r4);
        r0 = com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.ThreeDS2Service;
        com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.valueOf = (((r0 & (-26)) | ((~r0) & 25)) + ((r0 & 25) << 1)) % 128;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9283br
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T valueOf(android.content.Context r4) {
        /*
            r3 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.ThreeDS2Service
            r1 = r0 & (-110(0xffffffffffffff92, float:NaN))
            int r2 = ~r0
            r2 = r2 & 109(0x6d, float:1.53E-43)
            r1 = r1 | r2
            r0 = r0 & 109(0x6d, float:1.53E-43)
            int r0 = r0 << 1
            r2 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << 1
            int r2 = r2 + r0
            int r0 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.valueOf = r0
            int r2 = r2 % 2
            if (r2 != 0) goto L27
            android.view.View r4 = super.valueOf(r4)
            com.netcetera.threeds.sdk.infrastructure.setAllCaps r0 = r3.get
            r1 = 61
            int r1 = r1 / 0
            if (r0 == 0) goto L45
            goto L2f
        L27:
            android.view.View r4 = super.valueOf(r4)
            com.netcetera.threeds.sdk.infrastructure.setAllCaps r0 = r3.get
            if (r0 == 0) goto L45
        L2f:
            com.netcetera.threeds.sdk.infrastructure.setAllCaps r0 = r3.get
            r3.values(r0, r4)
            int r0 = com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.ThreeDS2Service
            r1 = r0 & (-26)
            int r2 = ~r0
            r2 = r2 & 25
            r1 = r1 | r2
            r0 = r0 & 25
            int r0 = r0 << 1
            int r1 = r1 + r0
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.valueOf = r1
        L45:
            int r0 = com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.ThreeDS2Service
            r1 = r0 & (-26)
            int r2 = ~r0
            r2 = r2 & 25
            r1 = r1 | r2
            r0 = r0 & 25
            int r0 = r0 << 1
            r2 = r1 | r0
            int r2 = r2 << 1
            r0 = r0 ^ r1
            int r2 = r2 - r0
            int r2 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.valueOf = r2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt.valueOf(android.content.Context):android.view.View");
    }

    public abstract void values(setAllCaps setallcaps, T t);
}
