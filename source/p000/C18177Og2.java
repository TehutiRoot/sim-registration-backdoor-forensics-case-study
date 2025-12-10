package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Og2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18177Og2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Bundle f4458e;

    /* renamed from: f */
    public final /* synthetic */ zzee f4459f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18177Og2(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.f4459f = zzeeVar;
        this.f4458e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f4459f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setConsent(this.f4458e, this.f46196a);
    }
}
