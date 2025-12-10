package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Jh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17860Jh2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f2886e;

    /* renamed from: f */
    public final /* synthetic */ zzee f2887f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17860Jh2(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f2887f = zzeeVar;
        this.f2886e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f2887f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getGmpAppId(this.f2886e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: b */
    public final void mo1009b() {
        this.f2886e.zzd(null);
    }
}
