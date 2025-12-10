package p000;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;

/* renamed from: Z92 */
/* loaded from: classes3.dex */
public final class Z92 implements InterfaceC19247ba2 {

    /* renamed from: a */
    public final /* synthetic */ DeferredLifecycleHelper f8109a;

    public Z92(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.f8109a = deferredLifecycleHelper;
    }

    @Override // p000.InterfaceC19247ba2
    /* renamed from: a */
    public final void mo26854a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.f8109a.f45371a;
        lifecycleDelegate2.onResume();
    }

    @Override // p000.InterfaceC19247ba2
    public final int zaa() {
        return 5;
    }
}