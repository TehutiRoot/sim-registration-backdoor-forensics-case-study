package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Wh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18737Wh2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ zzee f7354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18737Wh2(zzee zzeeVar) {
        super(zzeeVar, true);
        this.f7354e = zzeeVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f7354e.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).resetAnalyticsData(this.f46208a);
    }
}