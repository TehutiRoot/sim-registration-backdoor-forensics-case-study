package p000;

import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;

/* renamed from: D92 */
/* loaded from: classes3.dex */
public final class D92 implements InterfaceC19247ba2 {

    /* renamed from: a */
    public final /* synthetic */ Bundle f947a;

    /* renamed from: b */
    public final /* synthetic */ DeferredLifecycleHelper f948b;

    public D92(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.f948b = deferredLifecycleHelper;
        this.f947a = bundle;
    }

    @Override // p000.InterfaceC19247ba2
    /* renamed from: a */
    public final void mo26854a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.f948b.f45371a;
        lifecycleDelegate2.onCreate(this.f947a);
    }

    @Override // p000.InterfaceC19247ba2
    public final int zaa() {
        return 1;
    }
}