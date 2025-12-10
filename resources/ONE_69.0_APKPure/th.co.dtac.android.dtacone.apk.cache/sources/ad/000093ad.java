package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfr extends zzka implements zzlm {
    public /* synthetic */ zzfr(AbstractC21022lp2 abstractC21022lp2) {
        super(zzfs.m47298e());
    }

    public final int zza() {
        return ((zzfs) this.zza).zzb();
    }

    public final long zzb() {
        return ((zzfs) this.zza).zzc();
    }

    public final long zzc() {
        return ((zzfs) this.zza).zzd();
    }

    public final zzfr zzd(Iterable iterable) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.m47295h((zzfs) this.zza, iterable);
        return this;
    }

    public final zzfr zze(zzfv zzfvVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.m47296g((zzfs) this.zza, (zzfw) zzfvVar.zzaE());
        return this;
    }

    public final zzfr zzf(zzfw zzfwVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.m47296g((zzfs) this.zza, zzfwVar);
        return this;
    }

    public final zzfr zzg() {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.m47294i((zzfs) this.zza);
        return this;
    }

    public final zzfr zzh(int i) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.m47293j((zzfs) this.zza, i);
        return this;
    }

    public final zzfr zzi(String str) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.m47292k((zzfs) this.zza, str);
        return this;
    }

    public final zzfr zzj(int i, zzfv zzfvVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.m47297f((zzfs) this.zza, i, (zzfw) zzfvVar.zzaE());
        return this;
    }

    public final zzfr zzk(int i, zzfw zzfwVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.m47297f((zzfs) this.zza, i, zzfwVar);
        return this;
    }

    public final zzfr zzl(long j) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.m47290m((zzfs) this.zza, j);
        return this;
    }

    public final zzfr zzm(long j) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.m47291l((zzfs) this.zza, j);
        return this;
    }

    public final zzfw zzn(int i) {
        return ((zzfs) this.zza).zzg(i);
    }

    public final String zzo() {
        return ((zzfs) this.zza).zzh();
    }

    public final List zzp() {
        return Collections.unmodifiableList(((zzfs) this.zza).zzi());
    }

    public final boolean zzq() {
        return ((zzfs) this.zza).zzu();
    }
}