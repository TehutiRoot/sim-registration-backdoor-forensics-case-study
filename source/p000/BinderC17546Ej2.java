package p000;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzch;
import com.google.android.gms.measurement.internal.zzgy;

/* renamed from: Ej2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17546Ej2 extends zzch {

    /* renamed from: a */
    public final zzgy f1366a;

    public BinderC17546Ej2(zzgy zzgyVar) {
        this.f1366a = zzgyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.f1366a);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.f1366a.interceptEvent(str, str2, bundle, j);
    }
}
