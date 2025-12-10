package p000;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;

/* renamed from: Jj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17866Jj2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ Bundle f2911e;

    /* renamed from: f */
    public final /* synthetic */ Activity f2912f;

    /* renamed from: g */
    public final /* synthetic */ C17741Hk2 f2913g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17866Jj2(C17741Hk2 c17741Hk2, Bundle bundle, Activity activity) {
        super(c17741Hk2.f2296a, true);
        this.f2913g = c17741Hk2;
        this.f2911e = bundle;
        this.f2912f = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        Bundle bundle;
        zzcc zzccVar;
        if (this.f2911e != null) {
            bundle = new Bundle();
            if (this.f2911e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f2911e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzccVar = this.f2913g.f2296a.f46264g;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).onActivityCreated(ObjectWrapper.wrap(this.f2912f), bundle, this.f46197b);
    }
}
