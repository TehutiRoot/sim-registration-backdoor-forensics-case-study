package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: ik2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20488ik2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ BinderC17641Fk2 f62942e;

    /* renamed from: f */
    public final /* synthetic */ zzee f62943f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20488ik2(zzee zzeeVar, BinderC17641Fk2 binderC17641Fk2) {
        super(zzeeVar, true);
        this.f62943f = zzeeVar;
        this.f62942e = binderC17641Fk2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f62943f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).registerOnMeasurementEventListener(this.f62942e);
    }
}