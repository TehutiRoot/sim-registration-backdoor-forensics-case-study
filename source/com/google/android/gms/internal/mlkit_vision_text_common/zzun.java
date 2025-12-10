package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes3.dex */
public final class zzun {

    /* renamed from: a */
    public static C19509dK2 f47419a;

    public static synchronized zzuc zza(zztu zztuVar) {
        zzuc zzucVar;
        synchronized (zzun.class) {
            try {
                if (f47419a == null) {
                    f47419a = new C19509dK2(null);
                }
                zzucVar = (zzuc) f47419a.get(zztuVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzucVar;
    }

    public static synchronized zzuc zzb(String str) {
        zzuc zza;
        synchronized (zzun.class) {
            zza = zza(zztu.zzd(str).zzd());
        }
        return zza;
    }
}
