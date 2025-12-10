package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;

/* renamed from: P92 */
/* loaded from: classes3.dex */
public final class P92 implements InterfaceC19247ba2 {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f4698a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflater f4699b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f4700c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f4701d;

    /* renamed from: e */
    public final /* synthetic */ DeferredLifecycleHelper f4702e;

    public P92(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f4702e = deferredLifecycleHelper;
        this.f4698a = frameLayout;
        this.f4699b = layoutInflater;
        this.f4700c = viewGroup;
        this.f4701d = bundle;
    }

    @Override // p000.InterfaceC19247ba2
    /* renamed from: a */
    public final void mo26854a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        this.f4698a.removeAllViews();
        lifecycleDelegate2 = this.f4702e.f45371a;
        this.f4698a.addView(lifecycleDelegate2.onCreateView(this.f4699b, this.f4700c, this.f4701d));
    }

    @Override // p000.InterfaceC19247ba2
    public final int zaa() {
        return 2;
    }
}