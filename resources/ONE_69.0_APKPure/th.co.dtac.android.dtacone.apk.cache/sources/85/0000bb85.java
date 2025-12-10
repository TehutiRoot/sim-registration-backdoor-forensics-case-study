package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.du */
/* loaded from: classes5.dex */
public class C9334du extends AbstractC9272br<C9574mb> {
    private static int ThreeDS2Service = 0;
    private static int valueOf = 1;
    private boolean get;

    public C9334du(boolean z) {
        this.get = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (valueOf() != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (valueOf() != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.C9334du.valueOf;
        r1 = r0 & 47;
        r0 = r0 | 47;
        com.netcetera.threeds.sdk.infrastructure.C9334du.ThreeDS2Service = ((r1 ^ r0) + ((r0 & r1) << 1)) % 128;
        ThreeDS2Service(valueOf());
        r0 = com.netcetera.threeds.sdk.infrastructure.C9334du.valueOf;
        com.netcetera.threeds.sdk.infrastructure.C9334du.ThreeDS2Service = ((((r0 | 51) << 1) - (~(-(((~r0) & 51) | (r0 & (-52)))))) - 1) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getSDKVersion() {
        /*
            r3 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9334du.ThreeDS2Service
            r1 = r0 & (-106(0xffffffffffffff96, float:NaN))
            int r2 = ~r0
            r2 = r2 & 105(0x69, float:1.47E-43)
            r1 = r1 | r2
            r0 = r0 & 105(0x69, float:1.47E-43)
            int r0 = r0 << 1
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9334du.valueOf = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L20
            android.view.View r0 = r3.valueOf()
            r1 = 45
            int r1 = r1 / 0
            if (r0 == 0) goto L54
            goto L26
        L20:
            android.view.View r0 = r3.valueOf()
            if (r0 == 0) goto L54
        L26:
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9334du.valueOf
            r1 = r0 & 47
            r0 = r0 | 47
            r2 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << 1
            int r2 = r2 + r0
            int r2 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.C9334du.ThreeDS2Service = r2
            android.view.View r0 = r3.valueOf()
            com.netcetera.threeds.sdk.infrastructure.mb r0 = (com.netcetera.threeds.sdk.infrastructure.C9574mb) r0
            r3.ThreeDS2Service(r0)
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9334du.valueOf
            r1 = r0 | 51
            int r1 = r1 << 1
            r2 = r0 & (-52)
            int r0 = ~r0
            r0 = r0 & 51
            r0 = r0 | r2
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 + (-1)
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9334du.ThreeDS2Service = r1
        L54:
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9334du.valueOf
            r1 = r0 ^ 41
            r2 = r0 & 41
            r1 = r1 | r2
            int r1 = r1 << 1
            int r2 = ~r2
            r0 = r0 | 41
            r0 = r0 & r2
            int r0 = -r0
            r2 = r1 | r0
            int r2 = r2 << 1
            r0 = r0 ^ r1
            int r2 = r2 - r0
            int r2 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.C9334du.ThreeDS2Service = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9334du.getSDKVersion():void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272br
    public /* synthetic */ C9574mb ThreeDS2Service(Context context) {
        int i = ThreeDS2Service;
        int i2 = (i & (-110)) | ((~i) & 109);
        int i3 = (i & 109) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return values(context);
        }
        values(context);
        throw null;
    }

    public void ThreeDS2ServiceInstance() {
        int i = valueOf;
        int i2 = i & 91;
        ThreeDS2Service = ((i2 - (~((i ^ 91) | i2))) - 1) % 128;
        this.get = true;
        getSDKVersion();
        int i3 = ThreeDS2Service;
        valueOf = (((((i3 ^ 33) | (i3 & 33)) << 1) - (~(-(((~i3) & 33) | (i3 & (-34)))))) - 1) % 128;
    }

    public void get() {
        int i = ThreeDS2Service;
        valueOf = ((i ^ 69) + ((i & 69) << 1)) % 128;
        this.get = false;
        getSDKVersion();
    }

    public C9574mb values(Context context) {
        C9574mb c9574mb = new C9574mb(context);
        ThreeDS2Service(c9574mb);
        int i = ThreeDS2Service;
        valueOf = (((i & 36) + (i | 36)) - 1) % 128;
        return c9574mb;
    }

    private void ThreeDS2Service(C9574mb c9574mb) {
        int i;
        int i2 = ThreeDS2Service;
        int i3 = i2 ^ 21;
        int i4 = (((((i2 & 21) | i3) << 1) - (~(-i3))) - 1) % 128;
        valueOf = i4;
        if (!this.get) {
            ThreeDS2Service = (((i4 & 34) + (i4 | 34)) - 1) % 128;
            i = 8;
        } else {
            ThreeDS2Service = (i4 + 83) % 128;
            i = 0;
        }
        c9574mb.setVisibility(i);
        int i5 = ThreeDS2Service;
        int i6 = (i5 | 87) << 1;
        int i7 = -(((~i5) & 87) | (i5 & (-88)));
        valueOf = ((i6 & i7) + (i7 | i6)) % 128;
    }
}