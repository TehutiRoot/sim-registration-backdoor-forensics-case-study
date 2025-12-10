package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Jg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17857Jg2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Boolean f2882e;

    /* renamed from: f */
    public final /* synthetic */ zzee f2883f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17857Jg2(zzee zzeeVar, Boolean bool) {
        super(zzeeVar, true);
        this.f2883f = zzeeVar;
        this.f2882e = bool;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzcc zzccVar2;
        if (this.f2882e != null) {
            zzccVar2 = this.f2883f.f46264g;
            ((zzcc) Preconditions.checkNotNull(zzccVar2)).setMeasurementEnabled(this.f2882e.booleanValue(), this.f46196a);
            return;
        }
        zzccVar = this.f2883f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).clearMeasurementEnabled(this.f46196a);
    }
}
