package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: ek2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19796ek2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ BinderC17381Bk2 f61645e;

    /* renamed from: f */
    public final /* synthetic */ zzee f61646f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19796ek2(zzee zzeeVar, BinderC17381Bk2 binderC17381Bk2) {
        super(zzeeVar, true);
        this.f61646f = zzeeVar;
        this.f61645e = binderC17381Bk2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f61646f.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setEventInterceptor(this.f61645e);
    }
}