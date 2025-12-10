package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzk {

    /* renamed from: a */
    public long f47821a = Long.MIN_VALUE;

    public final zzk zza(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "intervalMillis can't be negative.");
        this.f47821a = j;
        return this;
    }

    public final zzl zzb() {
        boolean z;
        if (this.f47821a != Long.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Must set intervalMillis.");
        return new zzl(this.f47821a, true, null, null, null, false, null, 0L, null);
    }
}