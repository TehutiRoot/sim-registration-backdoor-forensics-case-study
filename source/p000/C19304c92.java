package p000;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;

/* renamed from: c92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19304c92 implements InterfaceC19648e92 {

    /* renamed from: a */
    public final /* synthetic */ DeferredLifecycleHelper f39352a;

    public C19304c92(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.f39352a = deferredLifecycleHelper;
    }

    @Override // p000.InterfaceC19648e92
    /* renamed from: a */
    public final void mo25959a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.f39352a.f45359a;
        lifecycleDelegate2.onResume();
    }

    @Override // p000.InterfaceC19648e92
    public final int zaa() {
        return 5;
    }
}
