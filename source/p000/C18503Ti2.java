package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Ti2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18503Ti2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ boolean f6083e;

    /* renamed from: f */
    public final /* synthetic */ zzee f6084f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18503Ti2(zzee zzeeVar, boolean z) {
        super(zzeeVar, true);
        this.f6084f = zzeeVar;
        this.f6083e = z;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f6084f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setDataCollectionEnabled(this.f6083e);
    }
}
