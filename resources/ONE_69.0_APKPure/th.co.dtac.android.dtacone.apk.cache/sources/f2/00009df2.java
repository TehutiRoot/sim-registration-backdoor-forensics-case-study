package com.google.android.gms.measurement.internal;

import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.e */
/* loaded from: classes3.dex */
public final class C6715e implements com.google.android.gms.internal.measurement.zzr {

    /* renamed from: a */
    public final /* synthetic */ zzfp f48172a;

    public C6715e(zzfp zzfpVar) {
        this.f48172a = zzfpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        zzem zzc;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        zzc = this.f48172a.zzs.zzay().zzi();
                    } else if (z) {
                        zzc = this.f48172a.zzs.zzay().zzm();
                    } else if (!z2) {
                        zzc = this.f48172a.zzs.zzay().zzl();
                    } else {
                        zzc = this.f48172a.zzs.zzay().zzk();
                    }
                } else {
                    zzc = this.f48172a.zzs.zzay().zzj();
                }
            } else if (z) {
                zzc = this.f48172a.zzs.zzay().zzh();
            } else if (!z2) {
                zzc = this.f48172a.zzs.zzay().zze();
            } else {
                zzc = this.f48172a.zzs.zzay().zzd();
            }
        } else {
            zzc = this.f48172a.zzs.zzay().zzc();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    zzc.zza(str);
                    return;
                } else {
                    zzc.zzd(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            zzc.zzc(str, list.get(0), list.get(1));
            return;
        }
        zzc.zzb(str, list.get(0));
    }
}