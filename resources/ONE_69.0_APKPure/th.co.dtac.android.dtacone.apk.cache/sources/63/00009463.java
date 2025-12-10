package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzu extends zzai {

    /* renamed from: a */
    public final Callable f46399a;

    public zzu(String str, Callable callable) {
        super("internal.appMetadata");
        this.f46399a = callable;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        try {
            return zzi.zzb(this.f46399a.call());
        } catch (Exception unused) {
            return zzap.zzf;
        }
    }
}