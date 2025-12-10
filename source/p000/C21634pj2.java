package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: pj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21634pj2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ BinderC17802Ij2 f76671e;

    /* renamed from: f */
    public final /* synthetic */ zzee f76672f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21634pj2(zzee zzeeVar, BinderC17802Ij2 binderC17802Ij2) {
        super(zzeeVar, true);
        this.f76672f = zzeeVar;
        this.f76671e = binderC17802Ij2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f76672f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).unregisterOnMeasurementEventListener(this.f76671e);
    }
}
