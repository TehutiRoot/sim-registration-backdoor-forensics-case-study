package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.lz */
/* loaded from: classes5.dex */
public class C9582lz {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private final Context get;

    public C9582lz(Context context) {
        this.get = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        if ((r6.get.getResources().getConfiguration().uiMode & 48) != 32) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2ServiceInstance;
        r1 = ((r0 ^ 59) | (r0 & 59)) << 1;
        r0 = -(((~r0) & 59) | (r0 & (-60)));
        r4 = (r1 & r0) + (r0 | r1);
        com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2Service = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
        if ((r4 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2ServiceInstance;
        r1 = r0 & 69;
        r0 = -(-((r0 ^ 69) | r1));
        r2 = (r1 ^ r0) + ((r0 & r1) << 1);
        com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2Service = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
        if ((r2 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
        if ((((~r1) & 54) ^ (r1 & (-55))) != 32) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean get() {
        /*
            r6 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2ServiceInstance
            r1 = 29
            int r0 = r0 + r1
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2Service = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 < r1) goto L85
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2Service
            r1 = r0 | 99
            int r1 = r1 << r4
            r5 = r0 & (-100)
            int r0 = ~r0
            r0 = r0 & 99
            r0 = r0 | r5
            int r0 = -r0
            r5 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r4
            int r5 = r5 + r0
            int r0 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2ServiceInstance = r0
            int r5 = r5 % 2
            r0 = 32
            if (r5 != 0) goto L40
            android.content.Context r1 = r6.get
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r5 = r1 & (-55)
            int r1 = ~r1
            r1 = r1 & 54
            r1 = r1 ^ r5
            if (r1 == r0) goto L6d
            goto L50
        L40:
            android.content.Context r1 = r6.get
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            if (r1 == r0) goto L6d
        L50:
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2ServiceInstance
            r1 = r0 ^ 59
            r5 = r0 & 59
            r1 = r1 | r5
            int r1 = r1 << r4
            r4 = r0 & (-60)
            int r0 = ~r0
            r0 = r0 & 59
            r0 = r0 | r4
            int r0 = -r0
            r4 = r1 & r0
            r0 = r0 | r1
            int r4 = r4 + r0
            int r0 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2Service = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L6c
            return r2
        L6c:
            throw r3
        L6d:
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2ServiceInstance
            r1 = r0 & 69
            r0 = r0 ^ 69
            r0 = r0 | r1
            int r0 = -r0
            int r0 = -r0
            r2 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r4
            int r2 = r2 + r0
            int r0 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2Service = r0
            int r2 = r2 % 2
            if (r2 != 0) goto L84
            return r4
        L84:
            throw r3
        L85:
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2Service
            r1 = r0 ^ 33
            r5 = r0 & 33
            r1 = r1 | r5
            int r1 = r1 << r4
            int r4 = ~r5
            r0 = r0 | 33
            r0 = r0 & r4
            int r0 = -r0
            r4 = r1 & r0
            r0 = r0 | r1
            int r4 = r4 + r0
            int r0 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.C9582lz.ThreeDS2ServiceInstance = r0
            int r4 = r4 % 2
            if (r4 == 0) goto L9f
            return r2
        L9f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9582lz.get():boolean");
    }
}
