package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: tg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22313tg2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Bundle f80190e;

    /* renamed from: f */
    public final /* synthetic */ zzee f80191f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22313tg2(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.f80191f = zzeeVar;
        this.f80190e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f80191f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setConditionalUserProperty(this.f80190e, this.f46196a);
    }
}
