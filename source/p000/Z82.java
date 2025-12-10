package p000;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;

/* renamed from: Z82 */
/* loaded from: classes3.dex */
public final class Z82 implements InterfaceC19648e92 {

    /* renamed from: a */
    public final /* synthetic */ DeferredLifecycleHelper f7964a;

    public Z82(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.f7964a = deferredLifecycleHelper;
    }

    @Override // p000.InterfaceC19648e92
    /* renamed from: a */
    public final void mo25959a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.f7964a.f45359a;
        lifecycleDelegate2.onStart();
    }

    @Override // p000.InterfaceC19648e92
    public final int zaa() {
        return 4;
    }
}
