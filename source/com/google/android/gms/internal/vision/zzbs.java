package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzbs {

    /* renamed from: a */
    public final boolean f47595a;

    public zzbs(zzbv zzbvVar) {
        zzde.zza(zzbvVar, "BuildInfo must be non-null");
        this.f47595a = !zzbvVar.zza();
    }

    public final boolean zza(String str) {
        zzde.zza(str, "flagName must not be null");
        if (!this.f47595a) {
            return true;
        }
        return zzbu.zza.zza().zza(str);
    }
}
