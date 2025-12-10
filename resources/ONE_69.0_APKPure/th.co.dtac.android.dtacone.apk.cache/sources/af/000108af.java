package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: rj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22042rj2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ String f77608e;

    /* renamed from: f */
    public final /* synthetic */ Object f77609f;

    /* renamed from: g */
    public final /* synthetic */ zzee f77610g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22042rj2(zzee zzeeVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(zzeeVar, false);
        this.f77610g = zzeeVar;
        this.f77608e = str;
        this.f77609f = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        zzcc zzccVar;
        zzccVar = this.f77610g.f46276g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).logHealthData(5, this.f77608e, ObjectWrapper.wrap(this.f77609f), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
    }
}