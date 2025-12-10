package p000;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: L42 */
/* loaded from: classes2.dex */
public class L42 extends WeakReference {

    /* renamed from: a */
    public final InterfaceC20594jK0 f3504a;

    /* renamed from: b */
    public final int f3505b;

    /* renamed from: c */
    public Object f3506c;

    public L42(ViewDataBinding viewDataBinding, int i, InterfaceC20594jK0 interfaceC20594jK0, ReferenceQueue referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f3505b = i;
        this.f3504a = interfaceC20594jK0;
    }

    /* renamed from: a */
    public ViewDataBinding m67642a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            m67638e();
        }
        return viewDataBinding;
    }

    /* renamed from: b */
    public Object m67641b() {
        return this.f3506c;
    }

    /* renamed from: c */
    public void m67640c(LifecycleOwner lifecycleOwner) {
        this.f3504a.setLifecycleOwner(lifecycleOwner);
    }

    /* renamed from: d */
    public void m67639d(Object obj) {
        m67638e();
        this.f3506c = obj;
        if (obj != null) {
            this.f3504a.addListener(obj);
        }
    }

    /* renamed from: e */
    public boolean m67638e() {
        boolean z;
        Object obj = this.f3506c;
        if (obj != null) {
            this.f3504a.removeListener(obj);
            z = true;
        } else {
            z = false;
        }
        this.f3506c = null;
        return z;
    }
}