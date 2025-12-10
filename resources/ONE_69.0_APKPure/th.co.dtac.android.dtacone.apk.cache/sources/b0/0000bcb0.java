package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.kb */
/* loaded from: classes5.dex */
public class C9515kb implements InterfaceC9501jp {
    public static char ThreeDS2Service = 9858;
    public static char ThreeDS2ServiceInstance = 29546;
    public static char get = 7209;
    private static int getSDKInfo = 1;
    private static int valueOf = 0;
    public static char values = 59353;

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9501jp
    public String ThreeDS2Service() {
        valueOf = (getSDKInfo + 41) % 128;
        Object[] objArr = new Object[1];
        values("菖쮢嫆憏鉁쩘攛唶䈯쟞妛裘ꯟ⧝뫸⠋", (ViewConfiguration.getJumpTapTimeout() >> 16) + 15, objArr);
        String intern = ((String) objArr[0]).intern();
        getSDKInfo = (valueOf + 83) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        int i;
        int i2 = getSDKInfo + 109;
        int i3 = i2 % 128;
        valueOf = i3;
        if (i2 % 2 != 0) {
            i = 98;
        } else {
            i = 18;
        }
        int i4 = i3 + 109;
        getSDKInfo = i4 % 128;
        if (i4 % 2 != 0) {
            return i;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        valueOf = (getSDKInfo + 57) % 128;
        Object[] objArr = new Object[1];
        values("䡜㟨≌틃≌틃搂뺣", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, objArr);
        String intern = ((String) objArr[0]).intern();
        int i = valueOf + 1;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            int i2 = 76 / 0;
        }
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9501jp
    public String getSDKInfo() {
        Object obj;
        int i = valueOf + 17;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            values("ꏓ䗫컛ᔀ컛ᔀᶬ伞", 28 >>> Color.green(1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            values("ꏓ䗫컛ᔀ컛ᔀᶬ伞", Color.green(0) + 7, objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        int i2 = getSDKInfo + 121;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        valueOf = (getSDKInfo + 31) % 128;
        Object[] objArr = new Object[1];
        values("उ澧项찦補㛔前幆섟륗", Color.blue(0) + 10, objArr);
        String intern = ((String) objArr[0]).intern();
        int i = valueOf + 9;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            int i2 = 29 / 0;
        }
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9501jp
    public String values() {
        valueOf = (getSDKInfo + 117) % 128;
        Object[] objArr = new Object[1];
        values("ⲋ鋜燤轟ꞟ將", 6 - KeyEvent.getDeadChar(0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        int i = valueOf + 95;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            return intern;
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
    private static void values(java.lang.String r12, int r13, java.lang.Object[] r14) {
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
            char r11 = com.netcetera.threeds.sdk.infrastructure.C9515kb.get     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.C9515kb.values     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.C9515kb.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.C9515kb.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9515kb.values(java.lang.String, int, java.lang.Object[]):void");
    }
}