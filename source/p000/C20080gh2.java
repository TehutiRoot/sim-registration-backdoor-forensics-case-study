package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: gh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20080gh2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ String f62229e;

    /* renamed from: f */
    public final /* synthetic */ zzee f62230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20080gh2(zzee zzeeVar, String str) {
        super(zzeeVar, true);
        this.f62230f = zzeeVar;
        this.f62229e = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f62230f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).beginAdUnitExposure(this.f62229e, this.f46197b);
    }
}
