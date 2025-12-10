package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes2.dex */
public class C4607f {

    /* renamed from: a */
    public final CopyOnWriteArrayList f35739a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final FragmentManager f35740b;

    /* renamed from: androidx.fragment.app.f$a */
    /* loaded from: classes2.dex */
    public static final class C4608a {

        /* renamed from: a */
        public final FragmentManager.FragmentLifecycleCallbacks f35741a;

        /* renamed from: b */
        public final boolean f35742b;

        public C4608a(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
            this.f35741a = fragmentLifecycleCallbacks;
            this.f35742b = z;
        }
    }

    public C4607f(FragmentManager fragmentManager) {
        this.f35740b = fragmentManager;
    }

    /* renamed from: a */
    public void m54211a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54211a(fragment, bundle, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentActivityCreated(this.f35740b, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    public void m54210b(Fragment fragment, boolean z) {
        Context m54398b = this.f35740b.getHost().m54398b();
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54210b(fragment, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentAttached(this.f35740b, fragment, m54398b);
            }
        }
    }

    /* renamed from: c */
    public void m54209c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54209c(fragment, bundle, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentCreated(this.f35740b, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    public void m54208d(Fragment fragment, boolean z) {
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54208d(fragment, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentDestroyed(this.f35740b, fragment);
            }
        }
    }

    /* renamed from: e */
    public void m54207e(Fragment fragment, boolean z) {
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54207e(fragment, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentDetached(this.f35740b, fragment);
            }
        }
    }

    /* renamed from: f */
    public void m54206f(Fragment fragment, boolean z) {
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54206f(fragment, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentPaused(this.f35740b, fragment);
            }
        }
    }

    /* renamed from: g */
    public void m54205g(Fragment fragment, boolean z) {
        Context m54398b = this.f35740b.getHost().m54398b();
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54205g(fragment, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentPreAttached(this.f35740b, fragment, m54398b);
            }
        }
    }

    /* renamed from: h */
    public void m54204h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54204h(fragment, bundle, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentPreCreated(this.f35740b, fragment, bundle);
            }
        }
    }

    /* renamed from: i */
    public void m54203i(Fragment fragment, boolean z) {
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54203i(fragment, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentResumed(this.f35740b, fragment);
            }
        }
    }

    /* renamed from: j */
    public void m54202j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54202j(fragment, bundle, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentSaveInstanceState(this.f35740b, fragment, bundle);
            }
        }
    }

    /* renamed from: k */
    public void m54201k(Fragment fragment, boolean z) {
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54201k(fragment, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentStarted(this.f35740b, fragment);
            }
        }
    }

    /* renamed from: l */
    public void m54200l(Fragment fragment, boolean z) {
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54200l(fragment, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentStopped(this.f35740b, fragment);
            }
        }
    }

    /* renamed from: m */
    public void m54199m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54199m(fragment, view, bundle, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentViewCreated(this.f35740b, fragment, view, bundle);
            }
        }
    }

    /* renamed from: n */
    public void m54198n(Fragment fragment, boolean z) {
        Fragment m54287t0 = this.f35740b.m54287t0();
        if (m54287t0 != null) {
            m54287t0.getParentFragmentManager().m54289s0().m54198n(fragment, true);
        }
        Iterator it = this.f35739a.iterator();
        while (it.hasNext()) {
            C4608a c4608a = (C4608a) it.next();
            if (!z || c4608a.f35742b) {
                c4608a.f35741a.onFragmentViewDestroyed(this.f35740b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void m54197o(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        this.f35739a.add(new C4608a(fragmentLifecycleCallbacks, z));
    }

    /* renamed from: p */
    public void m54196p(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        synchronized (this.f35739a) {
            try {
                int size = this.f35739a.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (((C4608a) this.f35739a.get(i)).f35741a == fragmentLifecycleCallbacks) {
                        this.f35739a.remove(i);
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