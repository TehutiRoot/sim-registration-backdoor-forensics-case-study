package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class zzar {

    /* renamed from: a */
    public static final zzbf f46585a;

    static {
        zzbf c20640jd2;
        try {
            SystemClock.elapsedRealtimeNanos();
            c20640jd2 = new C19775ed2();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            c20640jd2 = new C20640jd2();
        }
        f46585a = c20640jd2;
    }

    public static zzbf zza() {
        return f46585a;
    }
}