package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Aj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17313Aj2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ String f195e;

    /* renamed from: f */
    public final /* synthetic */ zzbz f196f;

    /* renamed from: g */
    public final /* synthetic */ zzee f197g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17313Aj2(zzee zzeeVar, String str, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f197g = zzeeVar;
        this.f195e = str;
        this.f196f = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f197g.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getMaxUserProperties(this.f195e, this.f196f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: b */
    public final void mo78b() {
        this.f196f.zzd(null);
    }
}