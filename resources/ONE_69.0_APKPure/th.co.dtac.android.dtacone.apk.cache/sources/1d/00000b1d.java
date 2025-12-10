package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Lj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18028Lj2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f3671e;

    /* renamed from: f */
    public final /* synthetic */ int f3672f;

    /* renamed from: g */
    public final /* synthetic */ zzee f3673g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18028Lj2(zzee zzeeVar, zzbz zzbzVar, int i) {
        super(zzeeVar, true);
        this.f3673g = zzeeVar;
        this.f3671e = zzbzVar;
        this.f3672f = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f3673g.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getTestFlag(this.f3671e, this.f3672f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: b */
    public final void mo78b() {
        this.f3671e.zzd(null);
    }
}