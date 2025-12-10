package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes3.dex */
public final class zzms {

    /* renamed from: a */
    public static C20417iI2 f47073a;

    public static synchronized zzmj zza(zzme zzmeVar) {
        zzmj zzmjVar;
        synchronized (zzms.class) {
            try {
                if (f47073a == null) {
                    f47073a = new C20417iI2(null);
                }
                zzmjVar = (zzmj) f47073a.get(zzmeVar);
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