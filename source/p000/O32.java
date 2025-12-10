package p000;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: O32 */
/* loaded from: classes2.dex */
public class O32 extends WeakReference {

    /* renamed from: a */
    public final InterfaceC19507dK0 f4287a;

    /* renamed from: b */
    public final int f4288b;

    /* renamed from: c */
    public Object f4289c;

    public O32(ViewDataBinding viewDataBinding, int i, InterfaceC19507dK0 interfaceC19507dK0, ReferenceQueue referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f4288b = i;
        this.f4287a = interfaceC19507dK0;
    }

    /* renamed from: a */
    public ViewDataBinding m67135a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            m67131e();
        }
        return viewDataBinding;
    }

    /* renamed from: b */
    public Object m67134b() {
        return this.f4289c;
    }

    /* renamed from: c */
    public void m67133c(LifecycleOwner lifecycleOwner) {
        this.f4287a.setLifecycleOwner(lifecycleOwner);
    }

    /* renamed from: d */
    public void m67132d(Object obj) {
        m67131e();
        this.f4289c = obj;
        if (obj != null) {
            this.f4287a.addListener(obj);
        }
    }

    /* renamed from: e */
    public boolean m67131e() {
        boolean z;
        Object obj = this.f4289c;
        if (obj != null) {
            this.f4287a.removeListener(obj);
            z = true;
        } else {
            z = false;
        }
        this.f4289c = null;
        return z;
    }
}
