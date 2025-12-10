package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes3.dex */
public final class zzms {

    /* renamed from: a */
    public static C20876lH2 f47061a;

    public static synchronized zzmj zza(zzme zzmeVar) {
        zzmj zzmjVar;
        synchronized (zzms.class) {
            try {
                if (f47061a == null) {
                    f47061a = new C20876lH2(null);
                }
                zzmjVar = (zzmj) f47061a.get(zzmeVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzmjVar;
    }

    public static synchronized zzmj zzb(String str) {
        zzmj zza;
        synchronized (zzms.class) {
            zza = zza(zzme.zzd("vision-common").zzd());
        }
        return zza;
    }
}
