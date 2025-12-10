package com.netcetera.threeds.sdk.infrastructure;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class setBackInvokedCallbackEnabled {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setAllCaps r4) {
        /*
            int r0 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service
            r1 = r0 | 73
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 ^ 73
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r2
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance = r1
            java.util.List r0 = r4.getWarnings()
            boolean r0 = ThreeDS2ServiceInstance(r0)
            r1 = 0
            if (r0 == 0) goto L51
            int r0 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance
            r3 = r0 ^ 25
            r0 = r0 & 25
            int r0 = r0 << r2
            int r3 = r3 + r0
            int r0 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service = r0
            int r3 = r3 % 2
            if (r3 != 0) goto L46
            com.netcetera.threeds.sdk.infrastructure.put r0 = com.netcetera.threeds.sdk.infrastructure.put.ThreeDS2ServiceInstance
            com.netcetera.threeds.sdk.infrastructure.put r4 = r4.ThreeDS2Service()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L51
            int r4 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance
            r0 = r4 & 96
            r4 = r4 | 96
            int r0 = r0 + r4
            int r4 = ~r0
            int r0 = r0 << r2
            int r4 = r4 + r0
            int r4 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service = r4
            goto L5a
        L46:
            com.netcetera.threeds.sdk.infrastructure.put r0 = com.netcetera.threeds.sdk.infrastructure.put.ThreeDS2ServiceInstance
            com.netcetera.threeds.sdk.infrastructure.put r4 = r4.ThreeDS2Service()
            r0.equals(r4)
            r4 = 0
            throw r4
        L51:
            int r4 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service
            int r4 = r4 + 61
            int r4 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance = r4
            r2 = 0
        L5a:
            int r4 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service
            int r4 = r4 + 107
            int r0 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L69
            r4 = 91
            int r4 = r4 / r1
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setAllCaps):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setAllCaps r4) {
        /*
            int r0 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service
            int r0 = r0 + 31
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance = r0
            boolean r0 = ThreeDS2Service(r4)
            if (r0 == 0) goto L52
            int r0 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance
            r1 = r0 & 69
            r0 = r0 ^ 69
            r0 = r0 | r1
            int r0 = ~r0
            int r1 = r1 - r0
            r0 = 1
            int r1 = r1 - r0
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service = r1
            com.netcetera.threeds.sdk.infrastructure.getInfo r1 = r4.ConfigParameters()
            if (r1 == 0) goto L52
            int r1 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance
            r2 = r1 & 73
            r1 = r1 | 73
            int r1 = -r1
            int r1 = -r1
            r3 = r2 | r1
            int r3 = r3 << r0
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r3 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service = r3
            com.netcetera.threeds.sdk.infrastructure.getInfo r1 = com.netcetera.threeds.sdk.infrastructure.getInfo.ThreeDS2Service
            com.netcetera.threeds.sdk.infrastructure.getInfo r4 = r4.ConfigParameters()
            boolean r4 = r1.equals(r4)
            if (r4 == r0) goto L41
            goto L52
        L41:
            int r4 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service
            r1 = r4 & 77
            r4 = r4 ^ 77
            r4 = r4 | r1
            r2 = r1 ^ r4
            r4 = r4 & r1
            int r4 = r4 << r0
            int r2 = r2 + r4
            int r2 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance = r2
            goto L5b
        L52:
            int r4 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance
            int r4 = r4 + 55
            int r4 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service = r4
            r0 = 0
        L5b:
            int r4 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance
            r1 = r4 & 123(0x7b, float:1.72E-43)
            r4 = r4 | 123(0x7b, float:1.72E-43)
            int r1 = r1 + r4
            int r4 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service = r4
            int r1 = r1 % 2
            if (r1 != 0) goto L6b
            return r0
        L6b:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setAllCaps):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
        if ((!r5) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
        if (r5 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance = (com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service + 125) % 128;
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean get(com.netcetera.threeds.sdk.infrastructure.setAllCaps r5) {
        /*
            int r0 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service
            r1 = r0 ^ 81
            r2 = r0 & 81
            r1 = r1 | r2
            r3 = 1
            int r1 = r1 << r3
            int r2 = ~r2
            r0 = r0 | 81
            r0 = r0 & r2
            int r0 = -r0
            r2 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r3
            int r2 = r2 + r0
            int r2 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance = r2
            boolean r0 = ThreeDS2Service(r5)
            r0 = r0 ^ r3
            r1 = 0
            if (r0 == 0) goto L20
            goto L63
        L20:
            int r0 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service
            int r0 = r0 + 23
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance = r0
            java.lang.String r0 = r5.jcbConfiguration()
            boolean r0 = com.netcetera.threeds.sdk.infrastructure.C9669om.valueOf(r0)
            if (r0 == 0) goto L63
            int r0 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service
            r2 = r0 & (-126(0xffffffffffffff82, float:NaN))
            int r4 = ~r0
            r4 = r4 & 125(0x7d, float:1.75E-43)
            r2 = r2 | r4
            r0 = r0 & 125(0x7d, float:1.75E-43)
            int r0 = r0 << r3
            int r0 = ~r0
            int r2 = r2 - r0
            int r2 = r2 - r3
            int r0 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance = r0
            int r2 = r2 % 2
            java.lang.String r5 = r5.mastercardSchemeConfiguration()
            boolean r5 = com.netcetera.threeds.sdk.infrastructure.C9669om.valueOf(r5)
            if (r2 != 0) goto L57
            r0 = 33
            int r0 = r0 / r1
            r5 = r5 ^ r3
            if (r5 == r3) goto L63
            goto L59
        L57:
            if (r5 == 0) goto L63
        L59:
            int r5 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service
            int r5 = r5 + 125
            int r5 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance = r5
            r5 = 1
            goto L6f
        L63:
            int r5 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service
            r0 = r5 & 9
            r5 = r5 | 9
            int r0 = r0 + r5
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance = r0
            r5 = 0
        L6f:
            int r0 = com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2Service
            r2 = r0 & 47
            r0 = r0 ^ 47
            r0 = r0 | r2
            int r0 = -r0
            int r0 = -r0
            r4 = r2 ^ r0
            r0 = r0 & r2
            int r0 = r0 << r3
            int r4 = r4 + r0
            int r0 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.ThreeDS2ServiceInstance = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L88
            r0 = 70
            int r0 = r0 / r1
        L88:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setBackInvokedCallbackEnabled.get(com.netcetera.threeds.sdk.infrastructure.setAllCaps):boolean");
    }

    private static boolean ThreeDS2ServiceInstance(List<setCustomSelectionActionModeCallback> list) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i + 115;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            if (list != null) {
                int i3 = i & 59;
                int i4 = (i | 59) & (~i3);
                int i5 = -(-(i3 << 1));
                ThreeDS2Service = ((i4 & i5) + (i4 | i5)) % 128;
                Iterator<setCustomSelectionActionModeCallback> it = list.iterator();
                int i6 = ThreeDS2Service;
                int i7 = i6 & 73;
                ThreeDS2ServiceInstance = ((((i6 ^ 73) | i7) << 1) - ((i6 | 73) & (~i7))) % 128;
                while (it.hasNext()) {
                    int i8 = ThreeDS2ServiceInstance;
                    int i9 = (((i8 | 58) << 1) - (i8 ^ 58)) - 1;
                    ThreeDS2Service = i9 % 128;
                    if (i9 % 2 == 0) {
                        if (it.next() instanceof setTitleMarginEnd) {
                            int i10 = ThreeDS2Service;
                            int i11 = i10 ^ 57;
                            int i12 = (i10 & 57) << 1;
                            int i13 = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                            ThreeDS2ServiceInstance = i13;
                            int i14 = ((i13 ^ 6) + ((i13 & 6) << 1)) - 1;
                            ThreeDS2Service = i14 % 128;
                            if (i14 % 2 == 0) {
                                return true;
                            }
                            throw null;
                        }
                        ThreeDS2ServiceInstance = (ThreeDS2Service + 69) % 128;
                    } else {
                        boolean z = it.next() instanceof setTitleMarginEnd;
                        throw null;
                    }
                }
            }
            int i15 = ThreeDS2ServiceInstance + 31;
            ThreeDS2Service = i15 % 128;
            if (i15 % 2 == 0) {
                return false;
            }
            throw null;
        }
        throw null;
    }
}
