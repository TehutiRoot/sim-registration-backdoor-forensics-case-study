package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzei extends zzka implements zzlm {
    public /* synthetic */ zzei(AbstractC18381Rk2 abstractC18381Rk2) {
        super(zzej.m47315e());
    }

    public final int zza() {
        return ((zzej) this.zza).zza();
    }

    public final zzei zzb(String str) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzej.m47314f((zzej) this.zza, str);
        return this;
    }

    public final zzei zzc(int i, zzel zzelVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzej.m47313g((zzej) this.zza, i, zzelVar);
        return this;
    }

    public final zzel zzd(int i) {
        return ((zzej) this.zza).zze(i);
    }

    public final String zze() {
        return ((zzej) this.zza).zzg();
    }
}
