package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: hj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20258hj2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ BinderC17546Ej2 f62571e;

    /* renamed from: f */
    public final /* synthetic */ zzee f62572f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20258hj2(zzee zzeeVar, BinderC17546Ej2 binderC17546Ej2) {
        super(zzeeVar, true);
        this.f62572f = zzeeVar;
        this.f62571e = binderC17546Ej2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f62572f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setEventInterceptor(this.f62571e);
    }
}
