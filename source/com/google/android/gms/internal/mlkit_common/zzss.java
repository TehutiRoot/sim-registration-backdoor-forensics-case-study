package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
public final class zzss {

    /* renamed from: a */
    public static AJ2 f46507a;

    public static synchronized zzsh zza(zzsb zzsbVar) {
        zzsh zzshVar;
        synchronized (zzss.class) {
            try {
                if (f46507a == null) {
                    f46507a = new AJ2(null);
                }
                zzshVar = (zzsh) f46507a.get(zzsbVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzshVar;
    }

    public static synchronized zzsh zzb(String str) {
        zzsh zza;
        synchronized (zzss.class) {
            zza = zza(zzsb.zzd("common").zzd());
        }
        return zza;
    }
}
