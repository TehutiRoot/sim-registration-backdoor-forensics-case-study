package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Yi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18823Yi2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Bundle f7833e;

    /* renamed from: f */
    public final /* synthetic */ zzee f7834f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18823Yi2(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.f7834f = zzeeVar;
        this.f7833e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f7834f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setDefaultEventParameters(this.f7833e);
    }
}
