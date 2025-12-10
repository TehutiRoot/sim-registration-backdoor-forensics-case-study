package com.netcetera.threeds.sdk.infrastructure;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class hideProgress {
    private static int get = 1;
    private static int values;
    private final int ThreeDS2ServiceInstance;

    private hideProgress(int i) {
        this.ThreeDS2ServiceInstance = i;
    }

    public static hideProgress get(int i) {
        hideProgress hideprogress = new hideProgress(i);
        int i2 = values;
        int i3 = i2 & 55;
        int i4 = (i2 | 55) & (~i3);
        int i5 = -(-(i3 << 1));
        get = ((i4 & i5) + (i4 | i5)) % 128;
        return hideprogress;
    }

    public static hideProgress values() {
        hideProgress hideprogress = new hideProgress(0);
        int i = get;
        int i2 = i ^ 71;
        int i3 = (((i & 71) | i2) << 1) - i2;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            return hideprogress;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        r6 = 11 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r6 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        r2 = r2 + 68;
        r0 = (~r2) + (r2 << 1);
        com.netcetera.threeds.sdk.infrastructure.hideProgress.values = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if ((r0 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        r2 = 86 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.hideProgress.class == r6.getClass()) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.hideProgress.class == r6.getClass()) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (get() != ((com.netcetera.threeds.sdk.infrastructure.hideProgress) r6).get()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.hideProgress.values;
        com.netcetera.threeds.sdk.infrastructure.hideProgress.get = ((r6 & 23) + (r6 | 23)) % 128;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.hideProgress.values;
        com.netcetera.threeds.sdk.infrastructure.hideProgress.get = ((r6 & 53) + (r6 | 53)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.hideProgress.get;
        r0 = ((((r6 ^ 107) | (r6 & 107)) << 1) - (~(-(((~r6) & 107) | (r6 & (-108)))))) - 1;
        com.netcetera.threeds.sdk.infrastructure.hideProgress.values = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        if ((r0 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.hideProgress.get;
        r0 = (r6 ^ androidx.appcompat.app.AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR) + ((r6 & androidx.appcompat.app.AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR) << 1);
        com.netcetera.threeds.sdk.infrastructure.hideProgress.values = ((~r0) + (r0 << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r5 == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r5 == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        r0 = r0 + 61;
        com.netcetera.threeds.sdk.infrastructure.hideProgress.get = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r0 % 2) != 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.hideProgress.values
            r1 = r0 ^ 45
            r2 = r0 & 45
            r3 = 1
            int r2 = r2 << r3
            int r2 = ~r2
            int r1 = r1 - r2
            int r1 = r1 - r3
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.hideProgress.get = r2
            int r1 = r1 % 2
            r4 = 0
            if (r1 != 0) goto L1a
            r1 = 77
            int r1 = r1 / r4
            if (r5 != r6) goto L2a
            goto L1c
        L1a:
            if (r5 != r6) goto L2a
        L1c:
            int r0 = r0 + 61
            int r6 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.hideProgress.get = r6
            int r0 = r0 % 2
            if (r0 != 0) goto L29
            r6 = 11
            int r6 = r6 / r4
        L29:
            return r3
        L2a:
            if (r6 == 0) goto L8e
            int r2 = r2 + 68
            int r0 = ~r2
            int r1 = r2 << 1
            int r0 = r0 + r1
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.hideProgress.values = r1
            int r0 = r0 % 2
            java.lang.Class<com.netcetera.threeds.sdk.infrastructure.hideProgress> r1 = com.netcetera.threeds.sdk.infrastructure.hideProgress.class
            if (r0 == 0) goto L46
            java.lang.Class r0 = r6.getClass()
            r2 = 86
            int r2 = r2 / r4
            if (r1 == r0) goto L4d
            goto L8e
        L46:
            java.lang.Class r0 = r6.getClass()
            if (r1 == r0) goto L4d
            goto L8e
        L4d:
            com.netcetera.threeds.sdk.infrastructure.hideProgress r6 = (com.netcetera.threeds.sdk.infrastructure.hideProgress) r6
            int r0 = r5.get()
            int r6 = r6.get()
            if (r0 != r6) goto L66
            int r6 = com.netcetera.threeds.sdk.infrastructure.hideProgress.values
            r0 = r6 & 23
            r6 = r6 | 23
            int r0 = r0 + r6
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.hideProgress.get = r0
            r4 = 1
            goto L71
        L66:
            int r6 = com.netcetera.threeds.sdk.infrastructure.hideProgress.values
            r0 = r6 & 53
            r6 = r6 | 53
            int r0 = r0 + r6
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.hideProgress.get = r0
        L71:
            int r6 = com.netcetera.threeds.sdk.infrastructure.hideProgress.get
            r0 = r6 ^ 107(0x6b, float:1.5E-43)
            r1 = r6 & 107(0x6b, float:1.5E-43)
            r0 = r0 | r1
            int r0 = r0 << r3
            r1 = r6 & (-108(0xffffffffffffff94, float:NaN))
            int r6 = ~r6
            r6 = r6 & 107(0x6b, float:1.5E-43)
            r6 = r6 | r1
            int r6 = -r6
            int r6 = ~r6
            int r0 = r0 - r6
            int r0 = r0 - r3
            int r6 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.hideProgress.values = r6
            int r0 = r0 % 2
            if (r0 != 0) goto L8c
            return r4
        L8c:
            r6 = 0
            throw r6
        L8e:
            int r6 = com.netcetera.threeds.sdk.infrastructure.hideProgress.get
            r0 = r6 ^ 108(0x6c, float:1.51E-43)
            r6 = r6 & 108(0x6c, float:1.51E-43)
            int r6 = r6 << r3
            int r0 = r0 + r6
            int r6 = ~r0
            int r0 = r0 << r3
            int r6 = r6 + r0
            int r6 = r6 % 128
            com.netcetera.threeds.sdk.infrastructure.hideProgress.values = r6
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.hideProgress.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hash;
        int i = get;
        int i2 = i & 47;
        int i3 = (i | 47) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        values = i5 % 128;
        int i6 = i5 % 2;
        Integer valueOf = Integer.valueOf(this.ThreeDS2ServiceInstance);
        Object[] objArr = new Object[1];
        if (i6 != 0) {
            objArr[0] = valueOf;
            hash = Objects.hash(objArr);
        } else {
            objArr[0] = valueOf;
            hash = Objects.hash(objArr);
        }
        int i7 = get;
        int i8 = (i7 & (-34)) | ((~i7) & 33);
        int i9 = -(-((i7 & 33) << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        values = i10 % 128;
        if (i10 % 2 == 0) {
            return hash;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        com.netcetera.threeds.sdk.infrastructure.hideProgress.values = ((r0 ^ 27) + ((r0 & 27) << 1)) % 128;
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r6.ThreeDS2ServiceInstance != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r6.ThreeDS2ServiceInstance != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        r1 = r0 & 59;
        r4 = (~r1) & (r0 | 59);
        r1 = r1 << 1;
        com.netcetera.threeds.sdk.infrastructure.hideProgress.values = ((r4 ^ r1) + ((r1 & r4) << 1)) % 128;
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean valueOf() {
        /*
            r6 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.hideProgress.get
            r1 = r0 | 76
            r2 = 1
            int r1 = r1 << r2
            r3 = r0 ^ 76
            int r1 = r1 - r3
            int r1 = r1 - r2
            int r3 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.hideProgress.values = r3
            int r1 = r1 % 2
            r3 = 0
            if (r1 == 0) goto L1b
            int r1 = r6.ThreeDS2ServiceInstance
            r4 = 60
            int r4 = r4 / r3
            if (r1 == 0) goto L31
            goto L1f
        L1b:
            int r1 = r6.ThreeDS2ServiceInstance
            if (r1 == 0) goto L31
        L1f:
            r1 = r0 & 59
            int r4 = ~r1
            r5 = r0 | 59
            r4 = r4 & r5
            int r1 = r1 << r2
            r5 = r4 ^ r1
            r1 = r1 & r4
            int r1 = r1 << r2
            int r5 = r5 + r1
            int r5 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.hideProgress.values = r5
            r1 = 1
            goto L3c
        L31:
            r1 = r0 ^ 27
            r4 = r0 & 27
            int r4 = r4 << r2
            int r1 = r1 + r4
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.hideProgress.values = r1
            r1 = 0
        L3c:
            r4 = r0 & 95
            int r5 = ~r4
            r0 = r0 | 95
            r0 = r0 & r5
            int r4 = r4 << r2
            int r4 = -r4
            int r4 = -r4
            r5 = r0 ^ r4
            r0 = r0 & r4
            int r0 = r0 << r2
            int r5 = r5 + r0
            int r0 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.hideProgress.values = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L55
            r0 = 23
            int r0 = r0 / r3
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.hideProgress.valueOf():boolean");
    }

    public int get() {
        int i = values;
        int i2 = (i | 41) << 1;
        int i3 = -(i ^ 41);
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        get = i5;
        if (i4 % 2 != 0) {
            int i6 = this.ThreeDS2ServiceInstance;
            int i7 = i5 + 95;
            values = i7 % 128;
            if (i7 % 2 == 0) {
                return i6;
            }
            throw null;
        }
        throw null;
    }
}