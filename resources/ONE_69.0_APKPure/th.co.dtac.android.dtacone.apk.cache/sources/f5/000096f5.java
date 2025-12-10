package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes3.dex */
public final class zzui {

    /* renamed from: a */
    public static YK2 f46750a;

    public static synchronized zztx zza(zztp zztpVar) {
        zztx zztxVar;
        synchronized (zzui.class) {
            try {
                if (f46750a == null) {
                    f46750a = new YK2(null);
                }
                zztxVar = (zztx) f46750a.get(zztpVar);
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