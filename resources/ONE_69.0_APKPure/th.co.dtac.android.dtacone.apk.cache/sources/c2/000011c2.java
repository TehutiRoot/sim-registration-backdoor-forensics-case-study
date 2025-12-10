package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Si2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18480Si2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f5905e;

    /* renamed from: f */
    public final /* synthetic */ zzee f5906f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18480Si2(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f5906f = zzeeVar;
        this.f5905e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f5906f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).generateEventId(this.f5905e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: b */
    public final void mo78b() {
        this.f5905e.zzd(null);
    }
}