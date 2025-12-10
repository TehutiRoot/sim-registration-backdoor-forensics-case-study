package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Di2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17479Di2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ String f1077e;

    /* renamed from: f */
    public final /* synthetic */ zzbz f1078f;

    /* renamed from: g */
    public final /* synthetic */ zzee f1079g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17479Di2(zzee zzeeVar, String str, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f1079g = zzeeVar;
        this.f1077e = str;
        this.f1078f = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f1079g.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getMaxUserProperties(this.f1077e, this.f1078f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: b */
    public final void mo1009b() {
        this.f1078f.zzd(null);
    }
}
