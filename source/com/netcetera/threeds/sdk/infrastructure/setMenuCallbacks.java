package com.netcetera.threeds.sdk.infrastructure;

import android.text.AndroidCharacter;
import android.text.TextUtils;

/* loaded from: classes5.dex */
public class setMenuCallbacks {
    private static int cleanup = 1;
    public static long valueOf = 4420801312065518686L;
    private static int values;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final setForegroundGravity get;

    public setMenuCallbacks(setForegroundGravity setforegroundgravity, String str, String str2) {
        this.get = setforegroundgravity;
        this.ThreeDS2Service = str;
        this.ThreeDS2ServiceInstance = str2;
    }

    private String valueOf() {
        cleanup = (values + 15) % 128;
        Object[] objArr = new Object[1];
        ThreeDS2Service("鎹鏢픪㵣ᰧ⥑拡얬\ue960쓎⿶྄焨\uf673ṩㄎ䟱裏ࣩₐ嘸\ueb02筕叮⒄骕疂䔲㭌谌搎璪ণ뾒囉晱᠖ꄡ䇰槜\ueeee債끸魔ﵨ䈶ꊬ諃\uf3ff疰鵨뱔쉸擃辙꾾타ᙓ︑턽ꝇᦅ\ue8c0샯뗂", TextUtils.lastIndexOf("", '0') + 1, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2Service("릩릛澟\ue62f∔鏯䣡Ầ휠縗\uf4a2", '0' - AndroidCharacter.getMirror('0'), objArr2);
        String ThreeDS2Service = C9669om.ThreeDS2Service(String.format(intern, ((String) objArr2[0]).intern(), this.ThreeDS2Service, this.ThreeDS2ServiceInstance), 2048);
        int i = values + 43;
        cleanup = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    public String ThreeDS2Service() {
        int i = cleanup;
        String str = this.ThreeDS2Service;
        int i2 = i + 5;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public setForegroundGravity ThreeDS2ServiceInstance() {
        int i = (cleanup + 79) % 128;
        values = i;
        setForegroundGravity setforegroundgravity = this.get;
        cleanup = (i + 15) % 128;
        return setforegroundgravity;
    }

    public String get() {
        int i = (cleanup + 27) % 128;
        values = i;
        String str = this.ThreeDS2ServiceInstance;
        int i2 = i + 117;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public setId values() {
        int i = cleanup + 103;
        values = i % 128;
        if (i % 2 == 0) {
            return setId.get(this.get).get(valueOf()).valueOf();
        }
        setId.get(this.get).get(valueOf()).valueOf();
        throw null;
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
            long r1 = com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.valueOf     // Catch: java.lang.Throwable -> L3a
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.valueOf     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }

    public setId ThreeDS2ServiceInstance(Throwable th2) {
        cleanup = (values + 31) % 128;
        setId valueOf2 = setId.get(this.get).get(valueOf()).values(th2).valueOf();
        cleanup = (values + 115) % 128;
        return valueOf2;
    }
}
