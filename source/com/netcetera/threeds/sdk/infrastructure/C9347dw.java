package com.netcetera.threeds.sdk.infrastructure;

import com.google.common.base.Ascii;
import kotlin.text.Typography;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.dw */
/* loaded from: classes5.dex */
public class C9347dw implements InterfaceC9311compute {
    public static boolean ThreeDS2Service = true;
    public static char[] ThreeDS2ServiceInstance = {136, 166, Typography.plusMinus, Typography.registered, 179, 172, 'e', 185, 173, 170, 168, 134, 180, 145, 184, Typography.middleDot, 's', 153, Typography.copyright, 'm', Ascii.MAX, 192, 194, 'q', 135, 'n'};
    private static int getSDKVersion = 1;
    private static int getWarnings = 0;
    public static int valueOf = 69;
    public static boolean values = true;
    private InterfaceC9311compute cleanup;
    private final InterfaceC9652ns get = C9653nt.ThreeDS2ServiceInstance(C9347dw.class);
    private volatile boolean initialize = false;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r4.initialize == true) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.C9347dw.getSDKVersion + 91;
        com.netcetera.threeds.sdk.infrastructure.C9347dw.getWarnings = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        android.view.KeyEvent.getDeadChar(0, 1);
        r4.initialize = true;
        r4.cleanup.ThreeDS2Service(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        android.view.KeyEvent.getDeadChar(0, 0);
        r4.initialize = true;
        r4.cleanup.ThreeDS2Service(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r4.cleanup != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r4.cleanup != null) goto L8;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9311compute
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.keys r5) {
        /*
            r4 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9347dw.getSDKVersion
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9347dw.getWarnings = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L15
            com.netcetera.threeds.sdk.infrastructure.compute r0 = r4.cleanup
            r2 = 17
            int r2 = r2 / r1
            if (r0 == 0) goto L40
            goto L19
        L15:
            com.netcetera.threeds.sdk.infrastructure.compute r0 = r4.cleanup
            if (r0 == 0) goto L40
        L19:
            boolean r0 = r4.initialize
            r2 = 1
            if (r0 == r2) goto L40
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9347dw.getSDKVersion
            int r0 = r0 + 91
            int r3 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9347dw.getWarnings = r3
            int r0 = r0 % 2
            if (r0 == 0) goto L35
            android.view.KeyEvent.getDeadChar(r1, r2)
            r4.initialize = r2
            com.netcetera.threeds.sdk.infrastructure.compute r0 = r4.cleanup
            r0.ThreeDS2Service(r5)
            goto L43
        L35:
            android.view.KeyEvent.getDeadChar(r1, r1)
            r4.initialize = r2
            com.netcetera.threeds.sdk.infrastructure.compute r0 = r4.cleanup
            r0.ThreeDS2Service(r5)
            goto L43
        L40:
            android.os.SystemClock.currentThreadTimeMillis()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9347dw.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.keys):void");
    }

    public void get(InterfaceC9311compute interfaceC9311compute) {
        int i = getWarnings + 59;
        int i2 = i % 128;
        getSDKVersion = i2;
        int i3 = i % 2;
        this.cleanup = interfaceC9311compute;
        if (i3 != 0) {
            int i4 = i2 + 111;
            getWarnings = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
                return;
            }
            return;
        }
        throw null;
    }
}
