package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes3.dex */
public final class zzmw {

    /* renamed from: a */
    public static zzmw f47062a;

    public static synchronized zzmw zza() {
        zzmw zzmwVar;
        synchronized (zzmw.class) {
            try {
                if (f47062a == null) {
                    f47062a = new zzmw();
                }
                zzmwVar = f47062a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzmwVar;
    }

    public static final boolean zzb() {
        return AbstractC22596vH2.m1063a("mlkit-dev-profiling");
    }
}
