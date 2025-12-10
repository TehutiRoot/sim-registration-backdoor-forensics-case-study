package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes3.dex */
public final class zzun {

    /* renamed from: a */
    public static C19037aL2 f47431a;

    public static synchronized zzuc zza(zztu zztuVar) {
        zzuc zzucVar;
        synchronized (zzun.class) {
            try {
                if (f47431a == null) {
                    f47431a = new C19037aL2(null);
                }
                zzucVar = (zzuc) f47431a.get(zztuVar);
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