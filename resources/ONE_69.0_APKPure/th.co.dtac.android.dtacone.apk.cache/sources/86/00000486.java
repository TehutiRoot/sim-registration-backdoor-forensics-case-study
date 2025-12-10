package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzee;

/* renamed from: El2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17579El2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ zzee f1445a;

    public C17579El2(zzee zzeeVar) {
        this.f1445a = zzeeVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f1445a.m47334e(new C17706Gk2(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f1445a.m47334e(new C23432zl2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f1445a.m47334e(new C18811Xk2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f1445a.m47334e(new C18356Qk2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbz zzbzVar = new zzbz();
        this.f1445a.m47334e(new C22740vl2(this, activity, zzbzVar));
        Bundle zzb = zzbzVar.zzb(50L);
        if (zzb != null) {
            bundle.putAll(zzb);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f1445a.m47334e(new C18291Pk2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f1445a.m47334e(new C21529ol2(this, activity));
    }
}