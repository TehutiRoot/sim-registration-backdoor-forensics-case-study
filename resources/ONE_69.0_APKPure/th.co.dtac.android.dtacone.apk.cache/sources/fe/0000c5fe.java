package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: ej2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19793ej2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f61642e;

    /* renamed from: f */
    public final /* synthetic */ zzee f61643f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19793ej2(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f61643f = zzeeVar;
        this.f61642e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f61643f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getCurrentScreenClass(this.f61642e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: b */
    public final void mo78b() {
        this.f61642e.zzd(null);
    }
}