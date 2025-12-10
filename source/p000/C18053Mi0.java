package p000;

import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: Mi0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18053Mi0 {

    /* renamed from: a */
    public final Object f3849a = new Object();

    /* renamed from: b */
    public final Map f3850b = new HashMap();

    /* renamed from: c */
    public final Map f3851c = new HashMap();

    /* renamed from: d */
    public final ArrayDeque f3852d = new ArrayDeque();

    /* renamed from: e */
    public CameraCoordinator f3853e;

    /* renamed from: Mi0$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0888a {
        /* renamed from: a */
        public static AbstractC0888a m67304a(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.CameraId cameraId) {
            return new C0158C8(lifecycleOwner, cameraId);
        }

        /* renamed from: b */
        public abstract CameraUseCaseAdapter.CameraId mo67303b();

        /* renamed from: c */
        public abstract LifecycleOwner mo67302c();
    }

    /* renamed from: Mi0$b */
    /* loaded from: classes.dex */
    public static class C0889b implements LifecycleObserver {

        /* renamed from: a */
        public final C18053Mi0 f3854a;

        /* renamed from: b */
        public final LifecycleOwner f3855b;

        public C0889b(LifecycleOwner lifecycleOwner, C18053Mi0 c18053Mi0) {
            this.f3855b = lifecycleOwner;
            this.f3854a = c18053Mi0;
        }

        /* renamed from: a */
        public LifecycleOwner m67301a() {
            return this.f3855b;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            this.f3854a.m67306n(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart(LifecycleOwner lifecycleOwner) {
            this.f3854a.m67311i(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop(LifecycleOwner lifecycleOwner) {
            this.f3854a.m67310j(lifecycleOwner);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:4:0x0003, B:6:0x0022, B:21:0x0063, B:22:0x0074, B:24:0x0084, B:25:0x0087, B:28:0x008a, B:29:0x0093, B:11:0x002c, B:12:0x0030, B:14:0x0036, B:16:0x0050, B:19:0x005b, B:20:0x0062), top: B:34:0x0003, inners: #0 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m67319a(p000.C17989Li0 r5, androidx.camera.core.ViewPort r6, java.util.List r7, java.util.Collection r8, androidx.camera.core.concurrent.CameraCoordinator r9) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f3849a
            monitor-enter(r0)
            boolean r1 = r8.isEmpty()     // Catch: java.lang.Throwable -> L2a
            r1 = r1 ^ 1
            androidx.core.util.Preconditions.checkArgument(r1)     // Catch: java.lang.Throwable -> L2a
            r4.f3853e = r9     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.LifecycleOwner r9 = r5.m67498c()     // Catch: java.lang.Throwable -> L2a
            Mi0$b r1 = r4.m67315e(r9)     // Catch: java.lang.Throwable -> L2a
            java.util.Map r2 = r4.f3851c     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L2a
            androidx.camera.core.concurrent.CameraCoordinator r2 = r4.f3853e     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            int r2 = r2.getCameraOperatingMode()     // Catch: java.lang.Throwable -> L2a
            r3 = 2
            if (r2 == r3) goto L63
            goto L2c
        L2a:
            r5 = move-exception
            goto L94
        L2c:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2a
        L30:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L63
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a
            Mi0$a r2 = (p000.C18053Mi0.AbstractC0888a) r2     // Catch: java.lang.Throwable -> L2a
            java.util.Map r3 = r4.f3850b     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L2a
            Li0 r2 = (p000.C17989Li0) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L2a
            Li0 r2 = (p000.C17989Li0) r2     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r2.equals(r5)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L30
            java.util.List r2 = r2.m67497d()     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L5b
            goto L30
        L5b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2a
            throw r5     // Catch: java.lang.Throwable -> L2a
        L63:
            androidx.camera.core.internal.CameraUseCaseAdapter r1 = r5.m67499b()     // Catch: java.lang.Throwable -> L2a androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L89
            r1.setViewPort(r6)     // Catch: java.lang.Throwable -> L2a androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L89
            androidx.camera.core.internal.CameraUseCaseAdapter r6 = r5.m67499b()     // Catch: java.lang.Throwable -> L2a androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L89
            r6.setEffects(r7)     // Catch: java.lang.Throwable -> L2a androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L89
            r5.m67500a(r8)     // Catch: java.lang.Throwable -> L2a androidx.camera.core.internal.CameraUseCaseAdapter.CameraException -> L89
            androidx.lifecycle.Lifecycle r5 = r9.getLifecycle()     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.Lifecycle$State r5 = r5.getCurrentState()     // Catch: java.lang.Throwable -> L2a
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.Throwable -> L2a
            boolean r5 = r5.isAtLeast(r6)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L87
            r4.m67311i(r9)     // Catch: java.lang.Throwable -> L2a
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L89:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2a
            throw r6     // Catch: java.lang.Throwable -> L2a
        L94:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18053Mi0.m67319a(Li0, androidx.camera.core.ViewPort, java.util.List, java.util.Collection, androidx.camera.core.concurrent.CameraCoordinator):void");
    }

    /* renamed from: b */
    public void m67318b() {
        synchronized (this.f3849a) {
            try {
                for (C0889b c0889b : new HashSet(this.f3851c.keySet())) {
                    m67306n(c0889b.m67301a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public C17989Li0 m67317c(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        boolean z;
        C17989Li0 c17989Li0;
        synchronized (this.f3849a) {
            try {
                if (this.f3850b.get(AbstractC0888a.m67304a(lifecycleOwner, cameraUseCaseAdapter.getCameraId())) == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                    c17989Li0 = new C17989Li0(lifecycleOwner, cameraUseCaseAdapter);
                    if (cameraUseCaseAdapter.getUseCases().isEmpty()) {
                        c17989Li0.m67495f();
                    }
                    m67312h(c17989Li0);
                } else {
                    throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c17989Li0;
    }

    /* renamed from: d */
    public C17989Li0 m67316d(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.CameraId cameraId) {
        C17989Li0 c17989Li0;
        synchronized (this.f3849a) {
            c17989Li0 = (C17989Li0) this.f3850b.get(AbstractC0888a.m67304a(lifecycleOwner, cameraId));
        }
        return c17989Li0;
    }

    /* renamed from: e */
    public final C0889b m67315e(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3849a) {
            try {
                for (C0889b c0889b : this.f3851c.keySet()) {
                    if (lifecycleOwner.equals(c0889b.m67301a())) {
                        return c0889b;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public Collection m67314f() {
        Collection unmodifiableCollection;
        synchronized (this.f3849a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f3850b.values());
        }
        return unmodifiableCollection;
    }

    /* renamed from: g */
    public final boolean m67313g(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3849a) {
            try {
                C0889b m67315e = m67315e(lifecycleOwner);
                if (m67315e == null) {
                    return false;
                }
                for (AbstractC0888a abstractC0888a : (Set) this.f3851c.get(m67315e)) {
                    if (!((C17989Li0) Preconditions.checkNotNull((C17989Li0) this.f3850b.get(abstractC0888a))).m67497d().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public final void m67312h(C17989Li0 c17989Li0) {
        Set hashSet;
        synchronized (this.f3849a) {
            try {
                LifecycleOwner m67498c = c17989Li0.m67498c();
                AbstractC0888a m67304a = AbstractC0888a.m67304a(m67498c, c17989Li0.m67499b().getCameraId());
                C0889b m67315e = m67315e(m67498c);
                if (m67315e != null) {
                    hashSet = (Set) this.f3851c.get(m67315e);
                } else {
                    hashSet = new HashSet();
                }
                hashSet.add(m67304a);
                this.f3850b.put(m67304a, c17989Li0);
                if (m67315e == null) {
                    C0889b c0889b = new C0889b(m67498c, this);
                    this.f3851c.put(c0889b, hashSet);
                    m67498c.getLifecycle().addObserver(c0889b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public void m67311i(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3849a) {
            try {
                if (!m67313g(lifecycleOwner)) {
                    return;
                }
                if (this.f3852d.isEmpty()) {
                    this.f3852d.push(lifecycleOwner);
                } else {
                    CameraCoordinator cameraCoordinator = this.f3853e;
                    if (cameraCoordinator == null || cameraCoordinator.getCameraOperatingMode() != 2) {
                        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) this.f3852d.peek();
                        if (!lifecycleOwner.equals(lifecycleOwner2)) {
                            m67309k(lifecycleOwner2);
                            this.f3852d.remove(lifecycleOwner);
                            this.f3852d.push(lifecycleOwner);
                        }
                    }
                }
                m67305o(lifecycleOwner);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public void m67310j(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3849a) {
            try {
                this.f3852d.remove(lifecycleOwner);
                m67309k(lifecycleOwner);
                if (!this.f3852d.isEmpty()) {
                    m67305o((LifecycleOwner) this.f3852d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public final void m67309k(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3849a) {
            try {
                C0889b m67315e = m67315e(lifecycleOwner);
                if (m67315e == null) {
                    return;
                }
                for (AbstractC0888a abstractC0888a : (Set) this.f3851c.get(m67315e)) {
                    ((C17989Li0) Preconditions.checkNotNull((C17989Li0) this.f3850b.get(abstractC0888a))).m67495f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public void m67308l(Collection collection) {
        synchronized (this.f3849a) {
            try {
                for (AbstractC0888a abstractC0888a : this.f3850b.keySet()) {
                    C17989Li0 c17989Li0 = (C17989Li0) this.f3850b.get(abstractC0888a);
                    boolean z = !c17989Li0.m67497d().isEmpty();
                    c17989Li0.m67494g(collection);
                    if (z && c17989Li0.m67497d().isEmpty()) {
                        m67310j(c17989Li0.m67498c());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public void m67307m() {
        synchronized (this.f3849a) {
            try {
                for (AbstractC0888a abstractC0888a : this.f3850b.keySet()) {
                    C17989Li0 c17989Li0 = (C17989Li0) this.f3850b.get(abstractC0888a);
                    c17989Li0.m67493h();
                    m67310j(c17989Li0.m67498c());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    public void m67306n(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3849a) {
            try {
                C0889b m67315e = m67315e(lifecycleOwner);
                if (m67315e == null) {
                    return;
                }
                m67310j(lifecycleOwner);
                for (AbstractC0888a abstractC0888a : (Set) this.f3851c.get(m67315e)) {
                    this.f3850b.remove(abstractC0888a);
                }
                this.f3851c.remove(m67315e);
                m67315e.m67301a().getLifecycle().removeObserver(m67315e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o */
    public final void m67305o(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3849a) {
            try {
                for (AbstractC0888a abstractC0888a : (Set) this.f3851c.get(m67315e(lifecycleOwner))) {
                    C17989Li0 c17989Li0 = (C17989Li0) this.f3850b.get(abstractC0888a);
                    if (!((C17989Li0) Preconditions.checkNotNull(c17989Li0)).m67497d().isEmpty()) {
                        c17989Li0.m67492i();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
