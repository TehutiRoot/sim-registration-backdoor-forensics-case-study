package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes2.dex */
public class C4625f {

    /* renamed from: a */
    public final CopyOnWriteArrayList f35651a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final FragmentManager f35652b;

    /* renamed from: androidx.fragment.app.f$a */
    /* loaded from: classes2.dex */
    public static final class C4626a {

        /* renamed from: a */
        public final FragmentManager.FragmentLifecycleCallbacks f35653a;

        /* renamed from: b */
        public final boolean f35654b;

        public C4626a(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
            this.f35653a = fragmentLifecycleCallbacks;
            this.f35654b = z;
        }
    }

    public C4625f(FragmentManager fragmentManager) {
        this.f35652b = fragmentManager;
    }

    /* renamed from: a */
    public void m54260a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54260a(fragment, bundle, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentActivityCreated(this.f35652b, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    public void m54259b(Fragment fragment, boolean z) {
        Context m54448b = this.f35652b.getHost().m54448b();
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54259b(fragment, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentAttached(this.f35652b, fragment, m54448b);
            }
        }
    }

    /* renamed from: c */
    public void m54258c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54258c(fragment, bundle, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentCreated(this.f35652b, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    public void m54257d(Fragment fragment, boolean z) {
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54257d(fragment, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentDestroyed(this.f35652b, fragment);
            }
        }
    }

    /* renamed from: e */
    public void m54256e(Fragment fragment, boolean z) {
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54256e(fragment, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentDetached(this.f35652b, fragment);
            }
        }
    }

    /* renamed from: f */
    public void m54255f(Fragment fragment, boolean z) {
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54255f(fragment, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentPaused(this.f35652b, fragment);
            }
        }
    }

    /* renamed from: g */
    public void m54254g(Fragment fragment, boolean z) {
        Context m54448b = this.f35652b.getHost().m54448b();
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54254g(fragment, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentPreAttached(this.f35652b, fragment, m54448b);
            }
        }
    }

    /* renamed from: h */
    public void m54253h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54253h(fragment, bundle, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentPreCreated(this.f35652b, fragment, bundle);
            }
        }
    }

    /* renamed from: i */
    public void m54252i(Fragment fragment, boolean z) {
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54252i(fragment, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentResumed(this.f35652b, fragment);
            }
        }
    }

    /* renamed from: j */
    public void m54251j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54251j(fragment, bundle, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentSaveInstanceState(this.f35652b, fragment, bundle);
            }
        }
    }

    /* renamed from: k */
    public void m54250k(Fragment fragment, boolean z) {
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54250k(fragment, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentStarted(this.f35652b, fragment);
            }
        }
    }

    /* renamed from: l */
    public void m54249l(Fragment fragment, boolean z) {
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54249l(fragment, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentStopped(this.f35652b, fragment);
            }
        }
    }

    /* renamed from: m */
    public void m54248m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54248m(fragment, view, bundle, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentViewCreated(this.f35652b, fragment, view, bundle);
            }
        }
    }

    /* renamed from: n */
    public void m54247n(Fragment fragment, boolean z) {
        Fragment m54337t0 = this.f35652b.m54337t0();
        if (m54337t0 != null) {
            m54337t0.getParentFragmentManager().m54339s0().m54247n(fragment, true);
        }
        Iterator it = this.f35651a.iterator();
        while (it.hasNext()) {
            C4626a c4626a = (C4626a) it.next();
            if (!z || c4626a.f35654b) {
                c4626a.f35653a.onFragmentViewDestroyed(this.f35652b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void m54246o(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        this.f35651a.add(new C4626a(fragmentLifecycleCallbacks, z));
    }

    /* renamed from: p */
    public void m54245p(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        synchronized (this.f35651a) {
            try {
                int size = this.f35651a.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (((C4626a) this.f35651a.get(i)).f35653a == fragmentLifecycleCallbacks) {
                        this.f35651a.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
