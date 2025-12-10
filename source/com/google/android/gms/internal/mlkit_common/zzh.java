package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzh {
    public static final zzh zza;

    /* renamed from: a */
    public final boolean f46407a;

    /* renamed from: b */
    public final boolean f46408b = false;

    /* renamed from: c */
    public final zzaf f46409c;

    static {
        zzf zzfVar = new zzf(null);
        zzfVar.zzb();
        zza = zzfVar.zzd();
        zzf zzfVar2 = new zzf(null);
        zzfVar2.zzb();
        zzfVar2.zza(new C17540Eh2());
        zzfVar2.zzd();
        zzf zzfVar3 = new zzf(null);
        zzfVar3.zzc();
        zzfVar3.zzd();
    }

    public /* synthetic */ zzh(boolean z, boolean z2, zzaf zzafVar, zzg zzgVar) {
        this.f46407a = z;
        this.f46409c = zzafVar;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ int m47136c(zzh zzhVar, Context context, zzj zzjVar) {
        zzaf zzafVar = zzhVar.f46409c;
        int size = zzafVar.size();
        int i = 0;
        while (i < size) {
            int zza2 = ((zzk) zzafVar.get(i)).zza(context, zzjVar, zzhVar.f46407a) - 1;
            i++;
            if (zza2 == 1) {
                return 2;
            }
        }
        return 3;
    }
}
