package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: ui2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22491ui2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ String f107438e;

    /* renamed from: f */
    public final /* synthetic */ Object f107439f;

    /* renamed from: g */
    public final /* synthetic */ zzee f107440g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22491ui2(zzee zzeeVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(zzeeVar, false);
        this.f107440g = zzeeVar;
        this.f107438e = str;
        this.f107439f = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f107440g.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).logHealthData(5, this.f107438e, ObjectWrapper.wrap(this.f107439f), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
    }
}
