package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.gc */
/* loaded from: classes5.dex */
public class C9406gc {
    private static int get = 0;
    private static int values = 1;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.gc$5 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C94075 {
        private static int ThreeDS2ServiceInstance = 0;
        private static int valueOf = 1;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[setFastScrollEnabled.valueOf.values().length];
            values = iArr;
            try {
                iArr[setFastScrollEnabled.valueOf.get.ordinal()] = 1;
                int i = valueOf;
                int i2 = i & 67;
                int i3 = ((i ^ 67) | i2) << 1;
                int i4 = -((i | 67) & (~i2));
                ThreeDS2ServiceInstance = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[setFastScrollEnabled.valueOf.ThreeDS2ServiceInstance.ordinal()] = 2;
                int i5 = ThreeDS2ServiceInstance;
                int i6 = i5 | 113;
                valueOf = ((i6 << 1) - ((~(i5 & 113)) & i6)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                values[setFastScrollEnabled.valueOf.valueOf.ordinal()] = 3;
                int i7 = ThreeDS2ServiceInstance;
                int i8 = i7 & 61;
                valueOf = ((i8 - (~(-(-((i7 ^ 61) | i8))))) - 1) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            int i9 = valueOf;
            int i10 = ((i9 ^ 92) + ((i9 & 92) << 1)) - 1;
            ThreeDS2ServiceInstance = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 94 / 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r7 != 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        r7 = com.netcetera.threeds.sdk.infrastructure.C9424gf.valueOf();
        r2 = com.netcetera.threeds.sdk.infrastructure.C9406gc.values;
        r4 = r2 ^ 69;
        r2 = -(-((r2 & 69) << 1));
        r3 = (r4 & r2) + (r2 | r4);
        com.netcetera.threeds.sdk.infrastructure.C9406gc.get = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        r7 = com.netcetera.threeds.sdk.infrastructure.C9437gs.valueOf();
        r1 = com.netcetera.threeds.sdk.infrastructure.C9406gc.values + 83;
        com.netcetera.threeds.sdk.infrastructure.C9406gc.get = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        if ((r1 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        r0 = 45 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r7 != 2) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netcetera.threeds.sdk.infrastructure.InterfaceC9401fy valueOf(com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled.valueOf r7) {
        /*
            r6 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9406gc.values
            r1 = r0 | 91
            int r2 = r1 << 1
            r0 = r0 & 91
            int r0 = ~r0
            r0 = r0 & r1
            int r2 = r2 - r0
            int r0 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.C9406gc.get = r0
            r0 = 2
            int r2 = r2 % r0
            r1 = 0
            r3 = 1
            if (r2 == 0) goto L26
            int[] r2 = com.netcetera.threeds.sdk.infrastructure.C9406gc.C94075.values
            int r7 = r7.ordinal()
            r7 = r2[r7]
            r2 = 33
            int r2 = r2 / 0
            if (r7 == r3) goto L60
            if (r7 == r0) goto L4c
            goto L32
        L26:
            int[] r2 = com.netcetera.threeds.sdk.infrastructure.C9406gc.C94075.values
            int r7 = r7.ordinal()
            r7 = r2[r7]
            if (r7 == r3) goto L60
            if (r7 == r0) goto L4c
        L32:
            com.netcetera.threeds.sdk.infrastructure.fy r7 = com.netcetera.threeds.sdk.infrastructure.C9424gf.valueOf()
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9406gc.values
            r4 = r2 ^ 69
            r2 = r2 & 69
            int r2 = r2 << r3
            int r2 = -r2
            int r2 = -r2
            r3 = r4 & r2
            r2 = r2 | r4
            int r3 = r3 + r2
            int r2 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.C9406gc.get = r2
            int r3 = r3 % r0
            if (r3 != 0) goto L4b
            return r7
        L4b:
            throw r1
        L4c:
            com.netcetera.threeds.sdk.infrastructure.fy r7 = com.netcetera.threeds.sdk.infrastructure.C9437gs.valueOf()
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9406gc.values
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9406gc.get = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L5f
            r0 = 45
            int r0 = r0 / 0
        L5f:
            return r7
        L60:
            com.netcetera.threeds.sdk.infrastructure.fy r7 = com.netcetera.threeds.sdk.infrastructure.C9457hl.valueOf()
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9406gc.values
            r4 = r2 & 87
            int r5 = ~r4
            r2 = r2 | 87
            r2 = r2 & r5
            int r3 = r4 << 1
            int r2 = r2 + r3
            int r3 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.C9406gc.get = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L77
            return r7
        L77:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9406gc.valueOf(com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled$valueOf):com.netcetera.threeds.sdk.infrastructure.fy");
    }
}
