package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Zg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18881Zg2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ zzee f8096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18881Zg2(zzee zzeeVar) {
        super(zzeeVar, true);
        this.f8096e = zzeeVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f8096e.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).resetAnalyticsData(this.f46196a);
    }
}
