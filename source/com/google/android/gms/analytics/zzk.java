package com.google.android.gms.analytics;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class zzk {

    /* renamed from: a */
    public final zzr f44416a;

    /* renamed from: b */
    public final List f44417b;
    protected final zzh zza;

    @VisibleForTesting
    public zzk(zzr zzrVar, Clock clock) {
        Preconditions.checkNotNull(zzrVar);
        this.f44416a = zzrVar;
        this.f44417b = new ArrayList();
        zzh zzhVar = new zzh(this, clock);
        zzhVar.m48734b();
        this.zza = zzhVar;
    }

    public void zze(zzh zzhVar) {
        throw null;
    }

    public final zzr zzm() {
        return this.f44416a;
    }

    public final void zzn(zzh zzhVar) {
        for (zzi zziVar : this.f44417b) {
            zziVar.zza();
        }
    }
}
