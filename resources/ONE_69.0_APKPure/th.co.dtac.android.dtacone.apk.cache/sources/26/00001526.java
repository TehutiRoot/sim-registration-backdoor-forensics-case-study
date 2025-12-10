package p000;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;

/* renamed from: W92 */
/* loaded from: classes3.dex */
public final class W92 implements InterfaceC19247ba2 {

    /* renamed from: a */
    public final /* synthetic */ DeferredLifecycleHelper f7208a;

    public W92(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.f7208a = deferredLifecycleHelper;
    }

    @Override // p000.InterfaceC19247ba2
    /* renamed from: a */
    public final void mo26854a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.f7208a.f45371a;
        lifecycleDelegate2.onStart();
    }

    @Override // p000.InterfaceC19247ba2
    public final int zaa() {
        return 4;
    }
}