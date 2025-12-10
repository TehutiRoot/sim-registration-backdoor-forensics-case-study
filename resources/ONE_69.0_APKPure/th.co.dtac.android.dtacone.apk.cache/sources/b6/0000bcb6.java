package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.kf */
/* loaded from: classes5.dex */
public final class C9519kf implements InterfaceC9501jp {
    private static int ThreeDS2Service = 1;
    private static int get = 0;
    public static long values = -3846714924888463927L;

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9501jp
    public String ThreeDS2Service() {
        get = (ThreeDS2Service + 117) % 128;
        Object[] objArr = new Object[1];
        valueOf("좲죡锨\uf084焼튷뫍\ue399忤ఌ\ud85b⮥\ue692擰䍴뱑න\udbc4⩇", (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr);
        String intern = ((String) objArr[0]).intern();
        int i = get + 55;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        int i = get + 27;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return 85;
        }
        return 18;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        Object obj;
        int i = get + 25;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            Color.green(0);
            Object[] objArr = new Object[1];
            valueOf("込辟\udfae멗菚앸䡸\uf413ᢨ䚊⫾", 0, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            valueOf("込辟\udfae멗菚앸䡸\uf413ᢨ䚊⫾", 1 - Color.green(0), objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        ThreeDS2Service = (get + 39) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9501jp
    public String getSDKInfo() {
        Object obj;
        int i = ThreeDS2Service + 69;
        get = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            valueOf("\udd22\udd01瘀ᎏ\ue7b1⑴ⱡᕩ䩄\uef24井", (TypedValue.complexToFraction(0, 2.0f, 2.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 2.0f, 2.0f) == 0.0f ? 0 : -1)) + 1, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            valueOf("\udd22\udd01瘀ᎏ\ue7b1⑴ⱡᕩ䩄\uef24井", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        get = (ThreeDS2Service + 73) % 128;
        Object[] objArr = new Object[1];
        valueOf("⻡⺒脠\ue488⢦珿\ue35a䋗맨᠖膉諚À烿", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        ThreeDS2Service = (get + 65) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9501jp
    public String values() {
        Object obj;
        int i = get + 83;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            ExpandableListView.getPackedPositionType(0L);
            Object[] objArr = new Object[1];
            valueOf("덺댹풮넆ඞ̒왢㈪\u243b䶇", 0, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            valueOf("덺댹풮넆ඞ̒왢㈪\u243b䶇", 1 - ExpandableListView.getPackedPositionType(0L), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.C9519kf.values     // Catch: java.lang.Throwable -> L3a
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9519kf.values     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9519kf.valueOf(java.lang.String, int, java.lang.Object[]):void");
    }
}