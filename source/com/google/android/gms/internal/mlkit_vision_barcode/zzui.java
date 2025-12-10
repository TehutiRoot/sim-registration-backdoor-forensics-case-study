package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes3.dex */
public final class zzui {

    /* renamed from: a */
    public static C19165bK2 f46738a;

    public static synchronized zztx zza(zztp zztpVar) {
        zztx zztxVar;
        synchronized (zzui.class) {
            try {
                if (f46738a == null) {
                    f46738a = new C19165bK2(null);
                }
                zztxVar = (zztx) f46738a.get(zztpVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zztxVar;
    }

    public static synchronized zztx zzb(String str) {
        zztx zza;
        synchronized (zzui.class) {
            zza = zza(zztp.zzd(str).zzd());
        }
        return zza;
    }
}
