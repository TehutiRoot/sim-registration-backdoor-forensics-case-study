package p000;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;

/* renamed from: Tj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18506Tj2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Activity f6086e;

    /* renamed from: f */
    public final /* synthetic */ C17741Hk2 f6087f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18506Tj2(C17741Hk2 c17741Hk2, Activity activity) {
        super(c17741Hk2.f2296a, true);
        this.f6087f = c17741Hk2;
        this.f6086e = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f6087f.f2296a.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).onActivityResumed(ObjectWrapper.wrap(this.f6086e), this.f46197b);
    }
}
