package p000;

import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;

/* renamed from: G82 */
/* loaded from: classes3.dex */
public final class G82 implements InterfaceC19648e92 {

    /* renamed from: a */
    public final /* synthetic */ Bundle f1825a;

    /* renamed from: b */
    public final /* synthetic */ DeferredLifecycleHelper f1826b;

    public G82(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.f1826b = deferredLifecycleHelper;
        this.f1825a = bundle;
    }

    @Override // p000.InterfaceC19648e92
    /* renamed from: a */
    public final void mo25959a(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.f1826b.f45359a;
        lifecycleDelegate2.onCreate(this.f1825a);
    }

    @Override // p000.InterfaceC19648e92
    public final int zaa() {
        return 1;
    }
}
