package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
public final class zzf {

    /* renamed from: a */
    public final zzac f46417a = new zzac();

    /* renamed from: b */
    public Boolean f46418b;

    public /* synthetic */ zzf(zze zzeVar) {
    }

    public final zzf zza(zzk zzkVar) {
        zzt.zzc(this.f46418b, "Must call internal() or external() before appending rules.");
        this.f46417a.zzb(zzkVar);
        return this;
    }

    public final zzf zzb() {
        boolean z;
        if (this.f46418b == null) {
            z = true;
        } else {
            z = false;
        }
        zzt.zze(z, "A SourcePolicy can only set internal() or external() once.");
        this.f46418b = Boolean.FALSE;
        return this;
    }

    public final zzf zzc() {
        boolean z;
        if (this.f46418b == null) {
            z = true;
        } else {
            z = false;
        }
        zzt.zze(z, "A SourcePolicy can only set internal() or external() once.");
        this.f46418b = Boolean.TRUE;
        return this;
    }

    public final zzh zzd() {
        zzt.zzc(this.f46418b, "Must call internal() or external() when building a SourcePolicy.");
        return new zzh(this.f46418b.booleanValue(), false, this.f46417a.zzc(), null);
    }
}