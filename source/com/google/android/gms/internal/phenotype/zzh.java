package com.google.android.gms.internal.phenotype;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzh<T> {

    /* renamed from: a */
    public static final Object f47475a = new Object();

    /* renamed from: b */
    public static Context f47476b = null;

    /* renamed from: c */
    public static boolean f47477c = false;

    /* renamed from: d */
    public static volatile Boolean f47478d;

    /* JADX WARN: Removed duplicated region for block: B:17:0x001e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x0003, B:6:0x0009, B:15:0x001a, B:17:0x001e, B:18:0x0021, B:19:0x0023, B:11:0x0012), top: B:24:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void init(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.phenotype.zzh.f47475a
            monitor-enter(r0)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L10
            r2 = 24
            if (r1 < r2) goto L12
            boolean r1 = p000.AbstractC21359o62.m25962a(r3)     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            goto L1a
        L10:
            r3 = move-exception
            goto L28
        L12:
            android.content.Context r1 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L19
            goto L1a
        L19:
            r3 = r1
        L1a:
            android.content.Context r1 = com.google.android.gms.internal.phenotype.zzh.f47476b     // Catch: java.lang.Throwable -> L10
            if (r1 == r3) goto L21
            r1 = 0
            com.google.android.gms.internal.phenotype.zzh.f47478d = r1     // Catch: java.lang.Throwable -> L10
        L21:
            com.google.android.gms.internal.phenotype.zzh.f47476b = r3     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r3 = 0
            com.google.android.gms.internal.phenotype.zzh.f47477c = r3
            return
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.phenotype.zzh.init(android.content.Context):void");
    }

    public static void maybeInit(Context context) {
        if (f47476b == null) {
            init(context);
        }
    }
}
