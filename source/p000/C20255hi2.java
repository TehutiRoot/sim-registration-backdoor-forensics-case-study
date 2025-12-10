package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: hi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20255hi2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f62567e;

    /* renamed from: f */
    public final /* synthetic */ zzee f62568f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20255hi2(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f62568f = zzeeVar;
        this.f62567e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f62568f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getCurrentScreenClass(this.f62567e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: b */
    public final void mo1009b() {
        this.f62567e.zzd(null);
    }
}
