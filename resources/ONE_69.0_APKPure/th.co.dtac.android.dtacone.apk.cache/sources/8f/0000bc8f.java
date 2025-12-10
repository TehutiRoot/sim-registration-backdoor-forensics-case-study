package com.netcetera.threeds.sdk.infrastructure;

import android.util.TypedValue;
import android.view.ViewConfiguration;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ix */
/* loaded from: classes5.dex */
public final class C9483ix implements setMotionEventSplittingEnabled {
    private static int get = 0;
    private static int valueOf = 1;
    public static long values = -7786682295283290684L;
    private final setVelocityScale ThreeDS2Service;
    private final InterfaceC9641ns ThreeDS2ServiceInstance = C9642nt.ThreeDS2ServiceInstance(C9483ix.class);

    private C9483ix(setVelocityScale setvelocityscale) {
        this.ThreeDS2Service = setvelocityscale;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.C9483ix.values     // Catch: java.lang.Throwable -> L3a
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2Service(r1, r8, r9)     // Catch: java.lang.Throwable -> L3a
            r9 = 4
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r9     // Catch: java.lang.Throwable -> L3a
        L14:
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            if (r1 >= r2) goto L3c
            int r1 = r1 + (-4)
            com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            char r2 = r8[r1]     // Catch: java.lang.Throwable -> L3a
            int r3 = r1 % 4
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L3a
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3a
            int r4 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3a
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9483ix.values     // Catch: java.lang.Throwable -> L3a
            long r4 = r4 * r6
            long r2 = r2 ^ r4
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L3a
            char r2 = (char) r3     // Catch: java.lang.Throwable -> L3a
            r8[r1] = r2     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 + 1
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r1     // Catch: java.lang.Throwable -> L3a
            goto L14
        L3a:
            r8 = move-exception
            goto L48
        L3c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            int r2 = r2 - r9
            r1.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            r8 = 0
            r10[r8] = r1
            return
        L48:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9483ix.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }

    public static setMotionEventSplittingEnabled get() {
        C9483ix c9483ix = new C9483ix((setVelocityScale) AuthenticationRequestParameters.valueOf(setVelocityScale.class));
        get = (valueOf + 43) % 128;
        return c9483ix;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMotionEventSplittingEnabled
    public void valueOf(setId setid) {
        get = (valueOf + 31) % 128;
        InterfaceC9641ns interfaceC9641ns = this.ThreeDS2ServiceInstance;
        Object[] objArr = new Object[1];
        ThreeDS2Service("棦俚梣潦鍩ꉬ뒜婊\udf84\ueb2eﶍፐڨᑚ⚧ꑫ䶱崎澎絧듉薪\ud8c1㚆ﯙ캢ƞ쾰⋴瞌䫡肷榶ꂣ돻妦퀕\ue9ff\ufb09ዀݘ", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, objArr);
        interfaceC9641ns.ThreeDS2Service(((String) objArr[0]).intern(), setid);
        this.ThreeDS2Service.get();
        int i = get + 29;
        valueOf = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMotionEventSplittingEnabled
    public void values() {
        int i = get + 27;
        valueOf = i % 128;
        if (i % 2 == 0) {
            TypedValue.complexToFloat(1);
            this.ThreeDS2Service.get();
        } else {
            TypedValue.complexToFloat(0);
            this.ThreeDS2Service.get();
        }
        int i2 = get + 5;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
    }
}