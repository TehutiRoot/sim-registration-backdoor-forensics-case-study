package p000;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;

/* renamed from: o82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21365o82 implements InterfaceC19648e92 {

    /* renamed from: a */
    public final /* synthetic */ Activity f72576a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f72577b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f72578c;

    /* renamed from: d */
    public final /* synthetic */ DeferredLifecycleHelper f72579d;

    public C21365o82(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f72579d = deferredLifecycleHelper;
        this.f72576a = activity;
        this.f72577b = bundle;
        this.f72578c = bundle2;
    }

    @Override // p000.InterfaceC19648e92
    /* renamed from: a */
    public final void mo25959a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.f72579d.f45359a;
        lifecycleDelegate2.onInflate(this.f72576a, this.f72577b, this.f72578c);
    }

    @Override // p000.InterfaceC19648e92
    public final int zaa() {
        return 0;
    }
}
