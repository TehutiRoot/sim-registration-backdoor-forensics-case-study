package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Oi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18183Oi2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f4474e;

    /* renamed from: f */
    public final /* synthetic */ int f4475f;

    /* renamed from: g */
    public final /* synthetic */ zzee f4476g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18183Oi2(zzee zzeeVar, zzbz zzbzVar, int i) {
        super(zzeeVar, true);
        this.f4476g = zzeeVar;
        this.f4474e = zzbzVar;
        this.f4475f = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f4476g.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getTestFlag(this.f4474e, this.f4475f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: b */
    public final void mo1009b() {
        this.f4474e.zzd(null);
    }
}
