package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mw */
/* loaded from: classes5.dex */
public final class C9595mw {
    public static final String ThreeDS2Service;
    public static final String ThreeDS2ServiceInstance;
    public static final String get;
    private static int initialize = 1;
    public static long valueOf;
    private static int values;

    static {
        get();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance("꥓ꥰ卷瞾碔\ued3cㅖ菧㪇콓ꕲ\uefc3身", 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        get = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance("ੵ\u0a56珎坑\uf46f䡄뷻⛉駷\uefea⧟", 1 - Drawable.resolveOpacity(0, 0), objArr2);
        ThreeDS2ServiceInstance = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance("\ue362\ue341칙\uea90ܛ\ueeaf仙聴炶剽\udafd", Color.blue(0) + 1, objArr3);
        ThreeDS2Service = ((String) objArr3[0]).intern();
        values = (initialize + 113) % 128;
    }

    public static boolean ThreeDS2Service(int i) {
        int i2 = values + 67;
        initialize = i2 % 128;
        if (i2 % 2 != 0 ? 1.0d - ((((Color.red(i) * 0.299d) + (Color.green(i) * 0.587d)) + (Color.blue(i) * 0.114d)) / 255.0d) < 0.5d : ((((0.299d % Color.red(i)) % (Color.green(i) + 0.587d)) + (0.114d - Color.blue(i))) - 255.0d) + 0.0d < 0.5d) {
            initialize = (values + 125) % 128;
            return false;
        }
        values = (initialize + 51) % 128;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.C9595mw.valueOf     // Catch: java.lang.Throwable -> L3a
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9595mw.valueOf     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9595mw.ThreeDS2ServiceInstance(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void get() {
        valueOf = 2975555749614986489L;
    }

    public static int ThreeDS2Service(int i, String str) {
        int argb;
        int i2 = initialize + 117;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            int parseLong = (int) Long.parseLong(str.substring(0), 64);
            argb = Color.argb(i, (parseLong + 117) & 25329, (parseLong / 15) | 26032, (parseLong % 1) | 3679);
        } else {
            int parseLong2 = (int) Long.parseLong(str.substring(1), 16);
            argb = Color.argb(i, (parseLong2 >> 16) & 255, (parseLong2 >> 8) & 255, parseLong2 & 255);
        }
        values = (initialize + 51) % 128;
        return argb;
    }
}