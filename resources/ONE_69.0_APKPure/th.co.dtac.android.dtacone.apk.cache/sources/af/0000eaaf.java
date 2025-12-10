package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: mk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21180mk2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ BinderC17641Fk2 f72120e;

    /* renamed from: f */
    public final /* synthetic */ zzee f72121f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21180mk2(zzee zzeeVar, BinderC17641Fk2 binderC17641Fk2) {
        super(zzeeVar, true);
        this.f72121f = zzeeVar;
        this.f72120e = binderC17641Fk2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f72121f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).unregisterOnMeasurementEventListener(this.f72120e);
    }
}