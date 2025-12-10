package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Vh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18628Vh2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f6782e;

    /* renamed from: f */
    public final /* synthetic */ zzee f6783f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18628Vh2(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f6783f = zzeeVar;
        this.f6782e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f6783f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).generateEventId(this.f6782e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: b */
    public final void mo1009b() {
        this.f6782e.zzd(null);
    }
}
