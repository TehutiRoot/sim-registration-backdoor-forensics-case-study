package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Ni2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18155Ni2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f4244e;

    /* renamed from: f */
    public final /* synthetic */ zzee f4245f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18155Ni2(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f4245f = zzeeVar;
        this.f4244e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f4245f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getCachedAppInstanceId(this.f4244e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: b */
    public final void mo78b() {
        this.f4244e.zzd(null);
    }
}