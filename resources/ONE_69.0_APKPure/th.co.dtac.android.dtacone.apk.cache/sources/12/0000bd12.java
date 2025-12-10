package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.nb */
/* loaded from: classes5.dex */
public class C9602nb {
    public static char ThreeDS2Service = 0;
    public static char ThreeDS2ServiceInstance = 0;
    private static final String cleanup;
    private static final String get;
    private static int getSDKInfo = 1;
    private static int getSDKVersion;
    public static char valueOf;
    public static char values;
    private final boolean getWarnings;
    private final boolean initialize;

    static {
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        get("ࣲ䐳굽\uedd0혥럍球㭓轜쒠㾸脃뜬蒚\u175f涸䚬\uea47钄㤒뭋☓轿첮", 23 - TextUtils.getCapsMode("", 0, 0), objArr);
        cleanup = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        get("䧚駎\ue844\ue527\uebf7ﮝ앻\uf01e뽤蝙\ue23dꏅ쒡唠赔\ud8d2䄠ጀ", 17 - ImageFormat.getBitsPerPixel(0), objArr2);
        get = ((String) objArr2[0]).intern();
        getSDKInfo = (getSDKVersion + 85) % 128;
    }

    public C9602nb(boolean z, boolean z2) {
        this.initialize = z;
        this.getWarnings = z2;
    }

    public static void ThreeDS2Service() {
        values = (char) 7846;
        valueOf = (char) 10369;
        ThreeDS2Service = (char) 21260;
        ThreeDS2ServiceInstance = (char) 36336;
    }

    public static C9602nb values(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters) {
        Object[] objArr = new Object[1];
        get("䧚駎\ue844\ue527\uebf7ﮝ앻\uf01e뽤蝙\ue23dꏅ쒡唠赔\ud8d2䄠ጀ", Color.red(0) + 18, objArr);
        Object[] objArr2 = new Object[1];
        get("ࣲ䐳굽\uedd0혥럍球㭓轜쒠㾸脃뜬蒚\u175f涸䚬\uea47钄㤒뭋☓轿첮", 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
        C9602nb c9602nb = new C9602nb(Boolean.parseBoolean((String) C9658om.ThreeDS2Service(configParameters.getParamValue(null, ((String) objArr[0]).intern()), String.valueOf(Boolean.TRUE))), Boolean.parseBoolean((String) C9658om.ThreeDS2Service(configParameters.getParamValue(null, ((String) objArr2[0]).intern()), String.valueOf(Boolean.FALSE))));
        getSDKInfo = (getSDKVersion + 101) % 128;
        return c9602nb;
    }

    public boolean ThreeDS2ServiceInstance() {
        int i = getSDKInfo;
        boolean z = this.getWarnings;
        int i2 = i + 125;
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public boolean get() {
        int i = getSDKVersion + 1;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            return this.initialize;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(java.lang.String r12, int r13, java.lang.Object[] r14) {
        /*
            if (r12 == 0) goto L6
            char[] r12 = r12.toCharArray()
        L6:
            char[] r12 = (char[]) r12
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.onCompleted.valueOf
            monitor-enter(r0)
            int r1 = r12.length     // Catch: java.lang.Throwable -> L5b
            char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.onCompleted.values = r2     // Catch: java.lang.Throwable -> L5b
            r3 = 2
            char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L5b
        L14:
            int r4 = com.netcetera.threeds.sdk.infrastructure.onCompleted.values     // Catch: java.lang.Throwable -> L5b
            int r5 = r12.length     // Catch: java.lang.Throwable -> L5b
            if (r4 >= r5) goto L6e
            char r5 = r12[r4]     // Catch: java.lang.Throwable -> L5b
            r3[r2] = r5     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + 1
            char r4 = r12[r4]     // Catch: java.lang.Throwable -> L5b
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.Throwable -> L5b
            r4 = 58224(0xe370, float:8.1589E-41)
            r6 = 0
        L28:
            r7 = 16
            if (r6 >= r7) goto L5d
            char r7 = r3[r5]     // Catch: java.lang.Throwable -> L5b
            char r8 = r3[r2]     // Catch: java.lang.Throwable -> L5b
            int r9 = r8 + r4
            int r10 = r8 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.C9602nb.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.C9602nb.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.C9602nb.values     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.C9602nb.valueOf     // Catch: java.lang.Throwable -> L5b
            int r7 = r7 + r10
            r7 = r7 ^ r9
            int r8 = r8 - r7
            char r7 = (char) r8     // Catch: java.lang.Throwable -> L5b
            r3[r2] = r7     // Catch: java.lang.Throwable -> L5b
            r7 = 40503(0x9e37, float:5.6757E-41)
            int r4 = r4 - r7
            int r6 = r6 + 1
            goto L28
        L5b:
            r12 = move-exception
            goto L77
        L5d:
            int r4 = com.netcetera.threeds.sdk.infrastructure.onCompleted.values     // Catch: java.lang.Throwable -> L5b
            char r6 = r3[r2]     // Catch: java.lang.Throwable -> L5b
            r1[r4] = r6     // Catch: java.lang.Throwable -> L5b
            int r6 = r4 + 1
            char r5 = r3[r5]     // Catch: java.lang.Throwable -> L5b
            r1[r6] = r5     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + 2
            com.netcetera.threeds.sdk.infrastructure.onCompleted.values = r4     // Catch: java.lang.Throwable -> L5b
            goto L14
        L6e:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L5b
            r12.<init>(r1, r2, r13)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            r14[r2] = r12
            return
        L77:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9602nb.get(java.lang.String, int, java.lang.Object[]):void");
    }
}