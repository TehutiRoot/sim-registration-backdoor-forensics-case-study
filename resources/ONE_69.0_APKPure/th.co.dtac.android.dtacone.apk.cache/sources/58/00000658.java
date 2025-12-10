package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Gh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17697Gh2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ Boolean f2056e;

    /* renamed from: f */
    public final /* synthetic */ zzee f2057f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17697Gh2(zzee zzeeVar, Boolean bool) {
        super(zzeeVar, true);
        this.f2057f = zzeeVar;
        this.f2056e = bool;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzcc zzccVar2;
        if (this.f2056e != null) {
            zzccVar2 = this.f2057f.f46276g;
            ((zzcc) Preconditions.checkNotNull(zzccVar2)).setMeasurementEnabled(this.f2056e.booleanValue(), this.f46208a);
            return;
        }
        zzccVar = this.f2057f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).clearMeasurementEnabled(this.f46208a);
    }
}