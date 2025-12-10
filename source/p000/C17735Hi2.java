package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Hi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17735Hi2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f2287e;

    /* renamed from: f */
    public final /* synthetic */ zzee f2288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17735Hi2(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f2288f = zzeeVar;
        this.f2287e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f2288f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getAppInstanceId(this.f2287e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: b */
    public final void mo1009b() {
        this.f2287e.zzd(null);
    }
}
