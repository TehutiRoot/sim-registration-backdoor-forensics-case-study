package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzn extends zzai {

    /* renamed from: a */
    public final zzo f46345a;

    public zzn(String str, zzo zzoVar) {
        super("internal.remoteConfig");
        this.f46345a = zzoVar;
        this.zze.put("getValue", new WF2(this, "getValue", zzoVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        return zzap.zzf;
    }
}
