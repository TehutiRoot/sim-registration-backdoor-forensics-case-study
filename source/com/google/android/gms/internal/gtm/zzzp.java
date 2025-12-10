package com.google.android.gms.internal.gtm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzzp {
    private static final zzzp zza = new zzzp();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzzu zzb = new zzyy();

    private zzzp() {
    }

    public static zzzp zza() {
        return zza;
    }

    public final zzzt zzb(Class cls) {
        zzye.zzc(cls, "messageType");
        zzzt zzztVar = (zzzt) this.zzc.get(cls);
        if (zzztVar == null) {
            zzztVar = this.zzb.zza(cls);
            zzye.zzc(cls, "messageType");
            zzzt zzztVar2 = (zzzt) this.zzc.putIfAbsent(cls, zzztVar);
            if (zzztVar2 != null) {
                return zzztVar2;
            }
        }
        return zzztVar;
    }
}
