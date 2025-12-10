package p000;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzch;
import com.google.android.gms.measurement.internal.zzgz;

/* renamed from: Fk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17641Fk2 extends zzch {

    /* renamed from: a */
    public final zzgz f1765a;

    public BinderC17641Fk2(zzgz zzgzVar) {
        this.f1765a = zzgzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.f1765a);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.f1765a.onEvent(str, str2, bundle, j);
    }
}