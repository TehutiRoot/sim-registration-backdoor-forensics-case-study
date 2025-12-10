package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.nh */
/* loaded from: classes5.dex */
public final class C9619nh {
    public static long ThreeDS2ServiceInstance = -3946944974834783294L;
    private static int valueOf = 0;
    private static int values = 1;

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(java.lang.String r7, int r8, java.lang.Object[] r9) {
        /*
            if (r7 == 0) goto L6
            char[] r7 = r7.toCharArray()
        L6:
            char[] r7 = (char[]) r7
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.initialize.values
            monitor-enter(r0)
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L2e
            int r8 = r7.length     // Catch: java.lang.Throwable -> L2e
            char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L2e
        L13:
            int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            int r3 = r7.length     // Catch: java.lang.Throwable -> L2e
            if (r2 >= r3) goto L30
            char r3 = r7[r2]     // Catch: java.lang.Throwable -> L2e
            int r4 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 * r2
            r3 = r3 ^ r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L2e
            long r5 = com.netcetera.threeds.sdk.infrastructure.C9619nh.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            long r3 = r3 ^ r5
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2e
            char r3 = (char) r4     // Catch: java.lang.Throwable -> L2e
            r8[r2] = r3     // Catch: java.lang.Throwable -> L2e
            int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + 1
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2e
            goto L13
        L2e:
            r7 = move-exception
            goto L39
        L30:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            r9[r1] = r7
            return
        L39:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9619nh.ThreeDS2ServiceInstance(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:
        return com.netcetera.threeds.sdk.infrastructure.C9669om.valueOf(r8, r4, ((java.lang.String) r5[0]).intern(), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
        com.netcetera.threeds.sdk.infrastructure.C9619nh.valueOf = (com.netcetera.threeds.sdk.infrastructure.C9619nh.values + 117) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007f, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.values((java.lang.CharSequence) r8, (java.lang.CharSequence) ((java.lang.String) r4[0]).intern()) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
        if ((!com.netcetera.threeds.sdk.infrastructure.C9669om.values((java.lang.CharSequence) r8, (java.lang.CharSequence) ((java.lang.String) r4[0]).intern())) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
        r4 = new java.lang.Object[1];
        ThreeDS2ServiceInstance("ꮪ涥➐曆", 50707 - android.text.TextUtils.indexOf("", ""), r4);
        r4 = ((java.lang.String) r4[0]).intern();
        r5 = new java.lang.Object[1];
        ThreeDS2ServiceInstance("ꮪ頛쳬サ攅", 13228 - android.os.Process.getGidForName(""), r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String ThreeDS2Service(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9619nh.values
            int r0 = r0 + 21
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9619nh.valueOf = r1
            int r0 = r0 % 2
            java.lang.String r1 = "ꮪ頛쳬サ攅"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2c
            int r0 = android.view.KeyEvent.getDeadChar(r3, r3)
            r4 = 18153(0x46e9, float:2.5438E-41)
            int r0 = r4 >> r0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            ThreeDS2ServiceInstance(r1, r0, r4)
            r0 = r4[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = com.netcetera.threeds.sdk.infrastructure.C9669om.values(r8, r0)
            if (r0 == 0) goto L46
            goto L77
        L2c:
            int r0 = android.view.KeyEvent.getDeadChar(r2, r2)
            int r0 = 13229 - r0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            ThreeDS2ServiceInstance(r1, r0, r4)
            r0 = r4[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = com.netcetera.threeds.sdk.infrastructure.C9669om.values(r8, r0)
            r0 = r0 ^ r3
            if (r0 == 0) goto L77
        L46:
            java.lang.String r0 = ""
            int r4 = android.text.TextUtils.indexOf(r0, r0)
            r5 = 50707(0xc613, float:7.1056E-41)
            int r5 = r5 - r4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r6 = "ꮪ涥➐曆"
            ThreeDS2ServiceInstance(r6, r5, r4)
            r4 = r4[r2]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            int r0 = android.os.Process.getGidForName(r0)
            int r0 = 13228 - r0
            java.lang.Object[] r5 = new java.lang.Object[r3]
            ThreeDS2ServiceInstance(r1, r0, r5)
            r0 = r5[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r8 = com.netcetera.threeds.sdk.infrastructure.C9669om.valueOf(r8, r4, r0, r3)
            return r8
        L77:
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9619nh.values
            int r0 = r0 + 117
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9619nh.valueOf = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9619nh.ThreeDS2Service(java.lang.String):java.lang.String");
    }
}
