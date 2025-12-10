package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;

/* renamed from: S82 */
/* loaded from: classes3.dex */
public final class S82 implements InterfaceC19648e92 {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f5530a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflater f5531b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f5532c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f5533d;

    /* renamed from: e */
    public final /* synthetic */ DeferredLifecycleHelper f5534e;

    public S82(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5534e = deferredLifecycleHelper;
        this.f5530a = frameLayout;
        this.f5531b = layoutInflater;
        this.f5532c = viewGroup;
        this.f5533d = bundle;
    }

    @Override // p000.InterfaceC19648e92
    /* renamed from: a */
    public final void mo25959a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        this.f5530a.removeAllViews();
        lifecycleDelegate2 = this.f5534e.f45359a;
        this.f5530a.addView(lifecycleDelegate2.onCreateView(this.f5531b, this.f5532c, this.f5533d));
    }

    @Override // p000.InterfaceC19648e92
    public final int zaa() {
        return 2;
    }
}
