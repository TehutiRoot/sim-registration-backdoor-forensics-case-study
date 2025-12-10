package com.netcetera.threeds.sdk.infrastructure;

import android.os.Handler;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
class setMaxLines implements setFontFeatureSettings, Runnable {
    private static int getSDKVersion = 1;
    private static int initialize;
    public static char[] valueOf = {'*', '^', 'f', 'B', 'A', 'e', 'd', 'f', 'l', 'h', 'i', 'j', 'f', 'B', 'J', 'n', 'k', 'i', 'k', 'I', 'D', 'n', 'I', '@', 'f', 'o', 'k', 'c', 'b', 'n', Matrix.MATRIX_TYPE_RANDOM_LT, 'I', 's', 'j', 'i', 's', 'l', 'd', '2', 'd', 'l', 's', 'i', 'j', 's', 'I', 'J', 'q', 'n', 'G', 'I', 'n', 'D', 'I', 'k', 'i', 'k', 'n', 'J', 'B', 'f', 'j', 'i', 'h', 'l', 'f', 'd', 'e', 'A', 'B', 'f', '^'};
    private setJustificationMode ThreeDS2Service;
    private final InterfaceC9652ns ThreeDS2ServiceInstance = C9653nt.ThreeDS2ServiceInstance(setMaxLines.class);
    private long cleanup;
    private setLines get;
    private Handler values;

    public setMaxLines(setJustificationMode setjustificationmode, setLines setlines, Handler handler, long j) {
        this.ThreeDS2Service = setjustificationmode;
        this.values = handler;
        this.cleanup = j;
        this.get = setlines;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFontFeatureSettings
    public void ThreeDS2ServiceInstance() {
        InterfaceC9652ns interfaceC9652ns;
        Object obj;
        initialize = (getSDKVersion + 83) % 128;
        if (this.get.valueOf()) {
            int i = initialize + 31;
            getSDKVersion = i % 128;
            if (i % 2 == 0) {
                interfaceC9652ns = this.ThreeDS2ServiceInstance;
                Object[] objArr = new Object[1];
                valueOf("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{0, 38, 0, 0}, true, objArr);
                obj = objArr[0];
            } else {
                interfaceC9652ns = this.ThreeDS2ServiceInstance;
                Object[] objArr2 = new Object[1];
                valueOf("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{0, 38, 0, 0}, false, objArr2);
                obj = objArr2[0];
            }
            interfaceC9652ns.valueOf(((String) obj).intern());
            return;
        }
        this.get.ThreeDS2ServiceInstance();
        this.values.postDelayed(this, this.cleanup);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.get.valueOf()) {
            int i = initialize + 13;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                this.ThreeDS2Service.get();
                this.get.get();
            } else {
                this.ThreeDS2Service.get();
                this.get.get();
                throw null;
            }
        }
        getSDKVersion = (initialize + 85) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFontFeatureSettings
    public void valueOf() {
        InterfaceC9652ns interfaceC9652ns;
        Object obj;
        getSDKVersion = (initialize + 89) % 128;
        if (!this.get.valueOf()) {
            int i = getSDKVersion + 1;
            initialize = i % 128;
            if (i % 2 != 0) {
                interfaceC9652ns = this.ThreeDS2ServiceInstance;
                Object[] objArr = new Object[1];
                valueOf("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{38, 34, 0, 0}, false, objArr);
                obj = objArr[0];
            } else {
                interfaceC9652ns = this.ThreeDS2ServiceInstance;
                Object[] objArr2 = new Object[1];
                valueOf("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{38, 34, 0, 0}, true, objArr2);
                obj = objArr2[0];
            }
            interfaceC9652ns.valueOf(((String) obj).intern());
            return;
        }
        this.get.get();
        this.values.removeCallbacks(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
        /*
            if (r12 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r12 = r12.getBytes(r0)
        L8:
            byte[] r12 = (byte[]) r12
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.values
            monitor-enter(r0)
            r1 = 0
            r2 = r13[r1]     // Catch: java.lang.Throwable -> L38
            r3 = 1
            r4 = r13[r3]     // Catch: java.lang.Throwable -> L38
            r5 = 2
            r6 = r13[r5]     // Catch: java.lang.Throwable -> L38
            r7 = 3
            r7 = r13[r7]     // Catch: java.lang.Throwable -> L38
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.setMaxLines.valueOf     // Catch: java.lang.Throwable -> L38
            char[] r9 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L49
            char[] r2 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
            r8 = 0
        L27:
            int r10 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r10 >= r4) goto L48
            r11 = r12[r10]     // Catch: java.lang.Throwable -> L38
            if (r11 != r3) goto L3a
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 + r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
            goto L41
        L38:
            r12 = move-exception
            goto L8d
        L3a:
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
        L41:
            char r8 = r2[r10]     // Catch: java.lang.Throwable -> L38
            int r10 = r10 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r10     // Catch: java.lang.Throwable -> L38
            goto L27
        L48:
            r9 = r2
        L49:
            if (r7 <= 0) goto L58
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r9, r1, r12, r1, r4)     // Catch: java.lang.Throwable -> L38
            int r2 = r4 - r7
            java.lang.System.arraycopy(r12, r1, r9, r2, r7)     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r12, r7, r9, r1, r2)     // Catch: java.lang.Throwable -> L38
        L58:
            if (r14 == 0) goto L6f
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
        L5e:
            int r14 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r14 >= r4) goto L6e
            int r2 = r4 - r14
            int r2 = r2 - r3
            char r2 = r9[r2]     // Catch: java.lang.Throwable -> L38
            r12[r14] = r2     // Catch: java.lang.Throwable -> L38
            int r14 = r14 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r14     // Catch: java.lang.Throwable -> L38
            goto L5e
        L6e:
            r9 = r12
        L6f:
            if (r6 <= 0) goto L84
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
        L73:
            int r12 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r12 >= r4) goto L84
            char r14 = r9[r12]     // Catch: java.lang.Throwable -> L38
            r2 = r13[r5]     // Catch: java.lang.Throwable -> L38
            int r14 = r14 - r2
            char r14 = (char) r14     // Catch: java.lang.Throwable -> L38
            r9[r12] = r14     // Catch: java.lang.Throwable -> L38
            int r12 = r12 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r12     // Catch: java.lang.Throwable -> L38
            goto L73
        L84:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L38
            r12.<init>(r9)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            r15[r1] = r12
            return
        L8d:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setMaxLines.valueOf(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }
}
