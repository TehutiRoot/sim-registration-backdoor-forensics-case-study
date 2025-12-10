package com.netcetera.threeds.sdk.infrastructure;

import android.os.Handler;
import kotlin.text.Typography;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ch */
/* loaded from: classes5.dex */
public class C9302ch implements InterfaceC9311compute, getProperty {
    public static char[] ThreeDS2Service = {Matrix.MATRIX_TYPE_RANDOM_UT, Typography.middleDot, 201, 206, 204, 200, 166, 173, 209, 207, Typography.times, 212, 207, 206, Typography.section, 165, 201, 200, 202, 208, 204, 205, 206, 202, 172, 138, 165, 201, 200, 202, 208, 204, 205, 206, 202, 166, 175, 211, 203, 210, 175, 168, 210, 173, 166, 202, 210, 212, 207, 210, Typography.times, 208, 200, 173};
    private static int getSDKInfo = 1;
    private static int getSDKVersion;
    private final Handler ThreeDS2ServiceInstance;
    private final InterfaceC9751size get;
    private long initialize;
    private merge valueOf;
    private final InterfaceC9652ns values = C9653nt.ThreeDS2ServiceInstance(C9302ch.class);

    public C9302ch(InterfaceC9751size interfaceC9751size, merge mergeVar, Handler handler) {
        this.get = interfaceC9751size;
        this.valueOf = mergeVar;
        this.ThreeDS2ServiceInstance = handler;
        mergeVar.get(this);
    }

    public static /* synthetic */ void values(C9302ch c9302ch, setAllCaps setallcaps) {
        int i = getSDKVersion + 83;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        c9302ch.ThreeDS2ServiceInstance(setallcaps);
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9311compute
    public void ThreeDS2Service(keys keysVar) {
        getSDKInfo = (getSDKVersion + 45) % 128;
        this.get.valueOf(keysVar);
        int i = getSDKVersion + 103;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            int i2 = 0 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getProperty
    public void ThreeDS2ServiceInstance() {
        int i = getSDKVersion + 77;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            this.initialize = System.currentTimeMillis();
            merge mergeVar = this.valueOf;
            if (mergeVar != null) {
                mergeVar.ThreeDS2ServiceInstance();
            }
            getSDKInfo = (getSDKVersion + 21) % 128;
            return;
        }
        this.initialize = System.currentTimeMillis();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getProperty
    public void get(setAllCaps setallcaps) {
        int i = getSDKInfo;
        getSDKVersion = (i + 63) % 128;
        if (this.valueOf != null) {
            getSDKVersion = (i + 47) % 128;
            long currentTimeMillis = System.currentTimeMillis() - this.initialize;
            if (currentTimeMillis >= 1000) {
                this.valueOf.get(setallcaps);
                this.valueOf.ThreeDS2Service();
                getSDKInfo = (getSDKVersion + 105) % 128;
            } else {
                this.ThreeDS2ServiceInstance.postDelayed(new RunnableC9301cg(this, setallcaps), 1000 - currentTimeMillis);
            }
        } else {
            InterfaceC9652ns interfaceC9652ns = this.values;
            Object[] objArr = new Object[1];
            ThreeDS2Service("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{0, 54, 100, 0}, false, objArr);
            interfaceC9652ns.valueOf(((String) objArr[0]).intern());
        }
        getSDKInfo = (getSDKVersion + 113) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
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
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.C9302ch.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9302ch.ThreeDS2Service(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getProperty
    public void values() {
        int i = getSDKVersion + 93;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            int i2 = 52 / 0;
            if (this.valueOf == null) {
                return;
            }
        } else if (this.valueOf == null) {
            return;
        }
        this.valueOf.values();
        this.valueOf = null;
        getSDKVersion = (getSDKInfo + 23) % 128;
    }

    private /* synthetic */ void ThreeDS2ServiceInstance(setAllCaps setallcaps) {
        getSDKVersion = (getSDKInfo + 41) % 128;
        get(setallcaps);
        int i = getSDKVersion + 33;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
