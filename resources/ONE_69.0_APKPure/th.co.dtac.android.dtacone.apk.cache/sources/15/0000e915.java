package p000;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;

/* renamed from: l92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20909l92 implements InterfaceC19247ba2 {

    /* renamed from: a */
    public final /* synthetic */ Activity f71598a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f71599b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f71600c;

    /* renamed from: d */
    public final /* synthetic */ DeferredLifecycleHelper f71601d;

    public C20909l92(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f71601d = deferredLifecycleHelper;
        this.f71598a = activity;
        this.f71599b = bundle;
        this.f71600c = bundle2;
    }

    @Override // p000.InterfaceC19247ba2
    /* renamed from: a */
    public final void mo26854a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.f71601d.f45371a;
        lifecycleDelegate2.onInflate(this.f71598a, this.f71599b, this.f71600c);
    }

    @Override // p000.InterfaceC19247ba2
    public final int zaa() {
        return 0;
    }
}