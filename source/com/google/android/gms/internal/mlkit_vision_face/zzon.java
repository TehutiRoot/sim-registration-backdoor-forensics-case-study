package com.google.android.gms.internal.mlkit_vision_face;

/* loaded from: classes3.dex */
public final class zzon {

    /* renamed from: a */
    public static C22427uI2 f47232a;

    public static synchronized zzoc zza(zznt zzntVar) {
        zzoc zzocVar;
        synchronized (zzon.class) {
            try {
                if (f47232a == null) {
                    f47232a = new C22427uI2(null);
                }
                zzocVar = (zzoc) f47232a.get(zzntVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzocVar;
    }

    public static synchronized zzoc zzb(String str) {
        zzoc zza;
        synchronized (zzon.class) {
            zza = zza(zznt.zzd(str).zzd());
        }
        return zza;
    }
}
