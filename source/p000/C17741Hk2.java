package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: Hk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17741Hk2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ zzee f2296a;

    public C17741Hk2(zzee zzeeVar) {
        this.f2296a = zzeeVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f2296a.m47325e(new C17866Jj2(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f2296a.m47325e(new C17421Ck2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f2296a.m47325e(new C19052ak2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f2296a.m47325e(new C18506Tj2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbz zzbzVar = new zzbz();
        this.f2296a.m47325e(new C23185yk2(this, activity, zzbzVar));
        Bundle zzb = zzbzVar.zzb(50L);
        if (zzb != null) {
            bundle.putAll(zzb);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f2296a.m47325e(new C18442Sj2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f2296a.m47325e(new C21981rk2(this, activity));
    }
}
