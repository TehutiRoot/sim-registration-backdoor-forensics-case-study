package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Zh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18931Zh2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ long f8242e;

    /* renamed from: f */
    public final /* synthetic */ zzee f8243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18931Zh2(zzee zzeeVar, long j) {
        super(zzeeVar, true);
        this.f8243f = zzeeVar;
        this.f8242e = j;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f8243f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setSessionTimeoutDuration(this.f8242e);
    }
}