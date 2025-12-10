package p000;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzch;
import com.google.android.gms.measurement.internal.zzgz;

/* renamed from: Ij2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17802Ij2 extends zzch {

    /* renamed from: a */
    public final zzgz f2582a;

    public BinderC17802Ij2(zzgz zzgzVar) {
        this.f2582a = zzgzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.f2582a);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.f2582a.onEvent(str, str2, bundle, j);
    }
}
