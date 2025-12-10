package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes3.dex */
public final class zzmw {

    /* renamed from: a */
    public static zzmw f47074a;

    public static synchronized zzmw zza() {
        zzmw zzmwVar;
        synchronized (zzmw.class) {
            try {
                if (f47074a == null) {
                    f47074a = new zzmw();
                }
                zzmwVar = f47074a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzmwVar;
    }

    public static final boolean zzb() {
        return AbstractC22147sI2.m22833a("mlkit-dev-profiling");
    }
}