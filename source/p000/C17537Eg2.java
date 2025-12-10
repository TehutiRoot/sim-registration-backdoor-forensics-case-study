package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Eg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17537Eg2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ String f1355e;

    /* renamed from: f */
    public final /* synthetic */ zzee f1356f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17537Eg2(zzee zzeeVar, String str) {
        super(zzeeVar, true);
        this.f1356f = zzeeVar;
        this.f1355e = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f1356f.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setUserId(this.f1355e, this.f46196a);
    }
}
