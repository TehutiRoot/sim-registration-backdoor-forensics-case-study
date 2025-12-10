package p000;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;

/* renamed from: ak2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19052ak2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Activity f8418e;

    /* renamed from: f */
    public final /* synthetic */ C17741Hk2 f8419f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19052ak2(C17741Hk2 c17741Hk2, Activity activity) {
        super(c17741Hk2.f2296a, true);
        this.f8419f = c17741Hk2;
        this.f8418e = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f8419f.f2296a.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).onActivityPaused(ObjectWrapper.wrap(this.f8418e), this.f46197b);
    }
}
