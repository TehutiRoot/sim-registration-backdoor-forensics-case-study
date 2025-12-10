package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Qh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18308Qh2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f5135e;

    /* renamed from: f */
    public final /* synthetic */ zzee f5136f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18308Qh2(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f5136f = zzeeVar;
        this.f5135e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f5136f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getCachedAppInstanceId(this.f5135e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: b */
    public final void mo1009b() {
        this.f5135e.zzd(null);
    }
}
