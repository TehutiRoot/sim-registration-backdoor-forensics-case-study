package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
public final class zzss {

    /* renamed from: a */
    public static C23018xK2 f46519a;

    public static synchronized zzsh zza(zzsb zzsbVar) {
        zzsh zzshVar;
        synchronized (zzss.class) {
            try {
                if (f46519a == null) {
                    f46519a = new C23018xK2(null);
                }
                zzshVar = (zzsh) f46519a.get(zzsbVar);
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