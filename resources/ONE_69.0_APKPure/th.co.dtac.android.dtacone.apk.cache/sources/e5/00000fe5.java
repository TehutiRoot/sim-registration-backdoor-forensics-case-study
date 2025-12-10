package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Qj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18353Qj2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ boolean f5291e;

    /* renamed from: f */
    public final /* synthetic */ zzee f5292f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18353Qj2(zzee zzeeVar, boolean z) {
        super(zzeeVar, true);
        this.f5292f = zzeeVar;
        this.f5291e = z;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f5292f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setDataCollectionEnabled(this.f5291e);
    }
}