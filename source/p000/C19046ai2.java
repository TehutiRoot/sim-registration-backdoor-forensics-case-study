package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: ai2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19046ai2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f8402e;

    /* renamed from: f */
    public final /* synthetic */ zzee f8403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19046ai2(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f8403f = zzeeVar;
        this.f8402e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f8403f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getCurrentScreenName(this.f8402e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: b */
    public final void mo1009b() {
        this.f8402e.zzd(null);
    }
}
