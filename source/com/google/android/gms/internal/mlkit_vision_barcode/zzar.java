package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class zzar {

    /* renamed from: a */
    public static final zzbf f46573a;

    static {
        zzbf c21097mc2;
        try {
            SystemClock.elapsedRealtimeNanos();
            c21097mc2 = new C20237hc2();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            c21097mc2 = new C21097mc2();
        }
        f46573a = c21097mc2;
    }

    public static zzbf zza() {
        return f46573a;
    }
}
