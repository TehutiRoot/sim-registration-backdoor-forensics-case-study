package p000;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;

/* renamed from: rk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21981rk2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Activity f77392e;

    /* renamed from: f */
    public final /* synthetic */ C17741Hk2 f77393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21981rk2(C17741Hk2 c17741Hk2, Activity activity) {
        super(c17741Hk2.f2296a, true);
        this.f77393f = c17741Hk2;
        this.f77392e = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        zzcc zzccVar;
        zzccVar = this.f77393f.f2296a.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).onActivityStopped(ObjectWrapper.wrap(this.f77392e), this.f46197b);
    }
}
