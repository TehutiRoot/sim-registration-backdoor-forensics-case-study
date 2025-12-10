package com.netcetera.threeds.sdk.infrastructure;

import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;

/* loaded from: classes5.dex */
public class setLineHeight extends setMinEms {
    private static int getSDKInfo = 1;
    public static int getSDKVersion = 53;
    private static int getWarnings;

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.apiKey.get
            monitor-enter(r0)
            char[] r1 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L10:
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r3 >= r7) goto L31
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf = r3     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            int r4 = com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 + r9
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            char r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
            int r5 = com.netcetera.threeds.sdk.infrastructure.setLineHeight.getSDKVersion     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 - r5
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L2f
            goto L10
        L2f:
            r6 = move-exception
            goto L69
        L31:
            if (r6 <= 0) goto L48
            com.netcetera.threeds.sdk.infrastructure.apiKey.values = r6     // Catch: java.lang.Throwable -> L2f
            char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            java.lang.System.arraycopy(r1, r2, r6, r2, r7)     // Catch: java.lang.Throwable -> L2f
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r9 = r7 - r8
            java.lang.System.arraycopy(r6, r2, r1, r9, r8)     // Catch: java.lang.Throwable -> L2f
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r9 = r7 - r8
            java.lang.System.arraycopy(r6, r8, r1, r2, r9)     // Catch: java.lang.Throwable -> L2f
        L48:
            if (r10 == 0) goto L60
            char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L4e:
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r8 >= r7) goto L5f
            int r9 = r7 - r8
            int r9 = r9 + (-1)
            char r9 = r1[r9]     // Catch: java.lang.Throwable -> L2f
            r6[r8] = r9     // Catch: java.lang.Throwable -> L2f
            int r8 = r8 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r8     // Catch: java.lang.Throwable -> L2f
            goto L4e
        L5f:
            r1 = r6
        L60:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            r11[r2] = r6
            return
        L69:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setLineHeight.values(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMinEms
    public void ThreeDS2Service(C9651nr c9651nr, setLineSpacing setlinespacing) {
        Object obj;
        int i = getSDKInfo + 125;
        getWarnings = i % 128;
        int i2 = i % 2;
        double convertQuartSecToDecDegrees = CdmaCellLocation.convertQuartSecToDecDegrees(0);
        if (i2 != 0) {
            Object[] objArr = new Object[1];
            values(70 >>> (convertQuartSecToDecDegrees > 1.0d ? 1 : (convertQuartSecToDecDegrees == 1.0d ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) * 51, "\u000b\u0005\u0006ￚ\ufff9\u0006\u0006￼\f\u0005\u0000", TextUtils.getOffsetAfter("", 1) + 10812, false, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            values(7 - (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)), 10 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u000b\u0005\u0006ￚ\ufff9\u0006\u0006￼\f\u0005\u0000", TextUtils.getOffsetAfter("", 0) + 158, true, objArr2);
            obj = objArr2[0];
        }
        c9651nr.get(((String) obj).intern(), setlinespacing.createTransaction());
        int i3 = getWarnings + 37;
        getSDKInfo = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        throw null;
    }
}
