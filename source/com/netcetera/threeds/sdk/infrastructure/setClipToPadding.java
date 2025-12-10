package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.Locale;

/* loaded from: classes5.dex */
public class setClipToPadding implements setClipChildren {
    private static final String ThreeDS2Service;
    private static final String ThreeDS2ServiceInstance;
    public static long get = 0;
    private static int getWarnings = 1;
    private static int valueOf;
    static final Locale values;

    static {
        get();
        Object[] objArr = new Object[1];
        get("䔆躋餟헾䕙", 1 - KeyEvent.normalizeMetaState(0), objArr);
        ThreeDS2Service = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        get("忄蓬逷\ue57e忩", 1 - TextUtils.getOffsetBefore("", 0), objArr2);
        ThreeDS2ServiceInstance = ((String) objArr2[0]).intern();
        values = Locale.US;
        valueOf = (getWarnings + 1) % 128;
    }

    public static void get() {
        get = 3984026347092475663L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Locale valueOf(java.util.Locale r5) throws com.netcetera.threeds.sdk.infrastructure.setId {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = r5.getISO3Language()     // Catch: java.util.MissingResourceException -> L59
            if (r2 == 0) goto L33
            int r2 = com.netcetera.threeds.sdk.infrastructure.setClipToPadding.getWarnings
            int r2 = r2 + 27
            int r3 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setClipToPadding.valueOf = r3
            int r2 = r2 % 2
            java.lang.String r3 = ""
            if (r2 != 0) goto L2a
            java.lang.String r2 = r5.getISO3Language()     // Catch: java.util.MissingResourceException -> L59
            boolean r2 = r2.equals(r3)     // Catch: java.util.MissingResourceException -> L59
            if (r2 != 0) goto L33
            int r2 = com.netcetera.threeds.sdk.infrastructure.setClipToPadding.valueOf
            int r2 = r2 + 115
            int r2 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setClipToPadding.getWarnings = r2
            r2 = 1
            goto L34
        L2a:
            java.lang.String r2 = r5.getISO3Language()     // Catch: java.util.MissingResourceException -> L59
            r2.equals(r3)     // Catch: java.util.MissingResourceException -> L59
            r5 = 0
            throw r5
        L33:
            r2 = 0
        L34:
            java.lang.String r3 = r5.getISO3Country()     // Catch: java.util.MissingResourceException -> L59
            if (r3 == 0) goto L3c
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            if (r2 == 0) goto L59
            if (r3 == 0) goto L59
            int r2 = com.netcetera.threeds.sdk.infrastructure.setClipToPadding.valueOf
            int r2 = r2 + 55
            int r3 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setClipToPadding.getWarnings = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L4f
            r2 = 0
            goto L50
        L4f:
            r2 = 1
        L50:
            int r3 = r3 + 19
            int r3 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.setClipToPadding.valueOf = r3
            if (r2 == 0) goto L59
            return r5
        L59:
            com.netcetera.threeds.sdk.infrastructure.setForegroundGravity r2 = com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.addParam
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            com.netcetera.threeds.sdk.infrastructure.setId r5 = r2.valueOf(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setClipToPadding.valueOf(java.util.Locale):java.util.Locale");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
        if (r11.contains(((java.lang.String) r1[0]).intern()) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
        r0 = new java.lang.String[0];
        com.netcetera.threeds.sdk.infrastructure.setClipToPadding.getWarnings = (com.netcetera.threeds.sdk.infrastructure.setClipToPadding.valueOf + 21) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
        if ((!r11.contains(((java.lang.String) r1[0]).intern())) != true) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Locale values(java.lang.String r11) throws com.netcetera.threeds.sdk.infrastructure.setId {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setClipToPadding.values(java.lang.String):java.util.Locale");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        r0 = 6 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        r4 = valueOf(values(r4));
        r0 = com.netcetera.threeds.sdk.infrastructure.setClipToPadding.getWarnings + 27;
        com.netcetera.threeds.sdk.infrastructure.setClipToPadding.valueOf = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if ((r0 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r4 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r4 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = com.netcetera.threeds.sdk.infrastructure.setClipToPadding.values;
        r0 = r0 + 103;
        com.netcetera.threeds.sdk.infrastructure.setClipToPadding.valueOf = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if ((r0 % 2) == 0) goto L14;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.setClipChildren
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Locale ThreeDS2Service(java.lang.String r4) throws com.netcetera.threeds.sdk.infrastructure.setId {
        /*
            r3 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.setClipToPadding.getWarnings
            int r1 = r0 + 9
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setClipToPadding.valueOf = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L13
            r1 = 89
            int r1 = r1 / 0
            if (r4 != 0) goto L25
            goto L15
        L13:
            if (r4 != 0) goto L25
        L15:
            java.util.Locale r4 = com.netcetera.threeds.sdk.infrastructure.setClipToPadding.values
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.setClipToPadding.valueOf = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L24
            r0 = 6
            int r0 = r0 / 0
        L24:
            return r4
        L25:
            java.util.Locale r4 = r3.values(r4)
            java.util.Locale r4 = r3.valueOf(r4)
            int r0 = com.netcetera.threeds.sdk.infrastructure.setClipToPadding.getWarnings
            int r0 = r0 + 27
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.setClipToPadding.valueOf = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L3a
            return r4
        L3a:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setClipToPadding.ThreeDS2Service(java.lang.String):java.util.Locale");
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.setClipToPadding.get     // Catch: java.lang.Throwable -> L3a
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.setClipToPadding.get     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setClipToPadding.get(java.lang.String, int, java.lang.Object[]):void");
    }
}
