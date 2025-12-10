package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Gi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17700Gi2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ zzbz f2060e;

    /* renamed from: f */
    public final /* synthetic */ zzee f2061f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17700Gi2(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f2061f = zzeeVar;
        this.f2060e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f2061f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getGmpAppId(this.f2060e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: b */
    public final void mo78b() {
        this.f2060e.zzd(null);
    }
}