package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: jh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20596jh2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ String f67341e;

    /* renamed from: f */
    public final /* synthetic */ zzee f67342f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20596jh2(zzee zzeeVar, String str) {
        super(zzeeVar, true);
        this.f67342f = zzeeVar;
        this.f67341e = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f67342f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).endAdUnitExposure(this.f67341e, this.f46197b);
    }
}
