package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
class setContentInsetsRelative implements setSubtitleTextColor<setIncludeFontPadding, C9651nr> {
    public static char ThreeDS2Service = 57948;
    public static char ThreeDS2ServiceInstance = 60707;
    private static int get = 0;
    private static int getSDKVersion = 1;
    public static char valueOf = 1139;
    public static char values = 63300;

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r12, int r13, java.lang.Object[] r14) {
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
            char r11 = com.netcetera.threeds.sdk.infrastructure.setContentInsetsRelative.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.setContentInsetsRelative.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.setContentInsetsRelative.valueOf     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.setContentInsetsRelative.values     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setContentInsetsRelative.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }

    public setIncludeFontPadding ThreeDS2ServiceInstance(C9651nr c9651nr) {
        Object[] objArr = new Object[1];
        ThreeDS2Service("耄롑ퟍ䁾辘쳛⼵㗮ꢔ嵨璐훇茣譪ᇫ\udb97젍\udee9\u0d98簀噕櫳篫ᱬ\u243d恵︎ˡ㞚홖", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30, objArr);
        fillInStackTrace fillinstacktrace = (fillInStackTrace) c9651nr.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), fillInStackTrace.class);
        Object[] objArr2 = new Object[1];
        ThreeDS2Service("耄롑ퟍ䁾辘쳛⼵㗮ꢔ嵨璐훇茣譪ᇫ\udb97젍\udee9굼䐡沮钆ꬹ貃๊䀉", 26 - View.resolveSizeAndState(0, 0, 0), objArr2);
        addSuppressed addsuppressed = (addSuppressed) c9651nr.ThreeDS2ServiceInstance(((String) objArr2[0]).intern(), addSuppressed.class);
        Object[] objArr3 = new Object[1];
        ThreeDS2Service("耄롑ퟍ䁾辘쳛⼵㗮ꢔ嵨璐훇茣譪ᇫ\udb97젍\udee9굼䐡沮钆ꬹ貃๊䀉︎ˡ㞚홖", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29, objArr3);
        setStackTrace setstacktrace = (setStackTrace) c9651nr.ThreeDS2ServiceInstance(((String) objArr3[0]).intern(), setStackTrace.class);
        Object[] objArr4 = new Object[1];
        ThreeDS2Service("耄롑ퟍ䁾辘쳛⼵㗮ꢔ嵨璐훇茣譪ᇫ\udb97젍\udee9鏟\uecbb⼵㗮㘓绶㳚Ὁ鞅茱", View.getDefaultSize(0, 0) + 27, objArr4);
        Integer ThreeDS2ServiceInstance2 = c9651nr.ThreeDS2ServiceInstance(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        ThreeDS2Service("耄롑ퟍ䁾辘쳛⼵㗮ꢔ嵨璐훇茣譪ᇫ\udb97젍\udee9倌쉿緥嵸李莆", 23 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr5);
        String values2 = c9651nr.values(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        ThreeDS2Service("耄롑ퟍ䁾辘쳛⼵㗮ꢔ嵨璐훇茣譪ᇫ\udb97젍\udee9㳚Ὁꘐ⡃荸밊䅈쬡", View.MeasureSpec.makeMeasureSpec(0, 0) + 25, objArr6);
        getInfo getinfo = (getInfo) c9651nr.ThreeDS2ServiceInstance(((String) objArr6[0]).intern(), getInfo.class);
        Object[] objArr7 = new Object[1];
        ThreeDS2Service("耄롑ퟍ䁾辘쳛⼵㗮ꢔ嵨璐훇茣譪ᇫ\udb97젍\udee9ᩢ\uec2a\u2d9b췞辘쳛", (ViewConfiguration.getPressedStateDuration() >> 16) + 24, objArr7);
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding(fillinstacktrace, addsuppressed, setstacktrace, ThreeDS2ServiceInstance2, values2, getinfo, (clear) c9651nr.ThreeDS2ServiceInstance(((String) objArr7[0]).intern(), clear.class));
        getSDKVersion = (get + 89) % 128;
        return setincludefontpadding;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public /* synthetic */ setIncludeFontPadding valueOf(C9651nr c9651nr) {
        get = (getSDKVersion + 91) % 128;
        setIncludeFontPadding ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(c9651nr);
        int i = get + 7;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            int i2 = 75 / 0;
        }
        return ThreeDS2ServiceInstance2;
    }
}
