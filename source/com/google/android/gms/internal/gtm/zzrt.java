package com.google.android.gms.internal.gtm;

import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzrt {
    private final Map zza = new HashMap();
    private zzam zzb;

    public /* synthetic */ zzrt(zzrs zzrsVar) {
    }

    public final zzrr zza() {
        return new zzrr(this.zza, this.zzb, null);
    }

    public final zzrt zzb(String str, zzam zzamVar) {
        this.zza.put(str, zzamVar);
        return this;
    }

    public final zzrt zzc(zzam zzamVar) {
        this.zzb = zzamVar;
        return this;
    }
}
