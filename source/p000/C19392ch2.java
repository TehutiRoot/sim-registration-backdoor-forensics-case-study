package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: ch2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19392ch2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ long f40187e;

    /* renamed from: f */
    public final /* synthetic */ zzee f40188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19392ch2(zzee zzeeVar, long j) {
        super(zzeeVar, true);
        this.f40188f = zzeeVar;
        this.f40187e = j;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f40188f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setSessionTimeoutDuration(this.f40187e);
    }
}
