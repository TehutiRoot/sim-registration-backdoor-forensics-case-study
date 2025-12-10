package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.WindowInsetsControllerCompat;

/* loaded from: classes2.dex */
public final class WindowInsetsControllerCompat {
    public static final int BEHAVIOR_DEFAULT = 1;
    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;
    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;

    /* renamed from: a */
    public final C4185e f34301a;

    /* loaded from: classes2.dex */
    public interface OnControllableInsetsChangedListener {
        void onControllableInsetsChanged(@NonNull WindowInsetsControllerCompat windowInsetsControllerCompat, int i);
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$a */
    /* loaded from: classes2.dex */
    public static class C4180a extends C4185e {

        /* renamed from: a */
        public final Window f34302a;

        /* renamed from: b */
        public final View f34303b;

        public C4180a(Window window, View view) {
            this.f34302a = window;
            this.f34303b = view;
        }

        /* renamed from: l */
        public static /* synthetic */ void m56662l(View view) {
            m56660n(view);
        }

        /* renamed from: n */
        public static /* synthetic */ void m56660n(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: a */
        public void mo56650a(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: b */
        public void mo56649b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: c */
        public int mo56648c() {
            return 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: d */
        public void mo56647d(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m56661m(i2);
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: g */
        public void mo56644g(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: j */
        public void mo56641j(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m56656r(2048);
                        m56659o(4096);
                        return;
                    }
                    return;
                }
                m56656r(4096);
                m56659o(2048);
                return;
            }
            m56656r(6144);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: k */
        public void mo56640k(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m56657q(i2);
                }
            }
        }

        /* renamed from: m */
        public final void m56661m(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 8) {
                        ((InputMethodManager) this.f34302a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f34302a.getDecorView().getWindowToken(), 0);
                        return;
                    }
                    return;
                }
                m56659o(2);
                return;
            }
            m56659o(4);
        }

        /* renamed from: o */
        public void m56659o(int i) {
            View decorView = this.f34302a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: p */
        public void m56658p(int i) {
            this.f34302a.addFlags(i);
        }

        /* renamed from: q */
        public final void m56657q(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 8) {
                        final View view = this.f34303b;
                        if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                            view = this.f34302a.getCurrentFocus();
                        } else {
                            view.requestFocus();
                        }
                        if (view == null) {
                            view = this.f34302a.findViewById(16908290);
                        }
                        if (view != null && view.hasWindowFocus()) {
                            view.post(new Runnable() { // from class: Y42
                                @Override // java.lang.Runnable
                                public final void run() {
                                    WindowInsetsControllerCompat.C4180a.m56662l(view);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                m56656r(2);
                return;
            }
            m56656r(4);
            m56655s(1024);
        }

        /* renamed from: r */
        public void m56656r(int i) {
            View decorView = this.f34302a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* renamed from: s */
        public void m56655s(int i) {
            this.f34302a.clearFlags(i);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$b */
    /* loaded from: classes2.dex */
    public static class C4181b extends C4180a {
        public C4181b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: f */
        public boolean mo56645f() {
            if ((this.f34302a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: i */
        public void mo56642i(boolean z) {
            if (z) {
                m56655s(67108864);
                m56658p(Integer.MIN_VALUE);
                m56659o(8192);
                return;
            }
            m56656r(8192);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$c */
    /* loaded from: classes2.dex */
    public static class C4182c extends C4181b {
        public C4182c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: e */
        public boolean mo56646e() {
            if ((this.f34302a.getDecorView().getSystemUiVisibility() & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: h */
        public void mo56643h(boolean z) {
            if (z) {
                m56655s(134217728);
                m56658p(Integer.MIN_VALUE);
                m56659o(16);
                return;
            }
            m56656r(16);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$e */
    /* loaded from: classes2.dex */
    public static class C4185e {
        /* renamed from: a */
        public abstract void mo56650a(OnControllableInsetsChangedListener onControllableInsetsChangedListener);

        /* renamed from: b */
        public abstract void mo56649b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat);

        /* renamed from: c */
        public abstract int mo56648c();

        /* renamed from: d */
        public abstract void mo56647d(int i);

        /* renamed from: e */
        public boolean mo56646e() {
            return false;
        }

        /* renamed from: f */
        public boolean mo56645f() {
            return false;
        }

        /* renamed from: g */
        public abstract void mo56644g(OnControllableInsetsChangedListener onControllableInsetsChangedListener);

        /* renamed from: h */
        public void mo56643h(boolean z) {
        }

        /* renamed from: i */
        public void mo56642i(boolean z) {
        }

        /* renamed from: j */
        public abstract void mo56641j(int i);

        /* renamed from: k */
        public abstract void mo56640k(int i);
    }

    public WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        this.f34301a = new C4183d(windowInsetsController, this);
    }

    @NonNull
    @RequiresApi(30)
    @Deprecated
    public static WindowInsetsControllerCompat toWindowInsetsControllerCompat(@NonNull WindowInsetsController windowInsetsController) {
        return new WindowInsetsControllerCompat(windowInsetsController);
    }

    public void addOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.f34301a.mo56650a(onControllableInsetsChangedListener);
    }

    public void controlWindowInsetsAnimation(int i, long j, @Nullable Interpolator interpolator, @Nullable CancellationSignal cancellationSignal, @NonNull WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        this.f34301a.mo56649b(i, j, interpolator, cancellationSignal, windowInsetsAnimationControlListenerCompat);
    }

    @SuppressLint({"WrongConstant"})
    public int getSystemBarsBehavior() {
        return this.f34301a.mo56648c();
    }

    public void hide(int i) {
        this.f34301a.mo56647d(i);
    }

    public boolean isAppearanceLightNavigationBars() {
        return this.f34301a.mo56646e();
    }

    public boolean isAppearanceLightStatusBars() {
        return this.f34301a.mo56645f();
    }

    public void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.f34301a.mo56644g(onControllableInsetsChangedListener);
    }

    public void setAppearanceLightNavigationBars(boolean z) {
        this.f34301a.mo56643h(z);
    }

    public void setAppearanceLightStatusBars(boolean z) {
        this.f34301a.mo56642i(z);
    }

    public void setSystemBarsBehavior(int i) {
        this.f34301a.mo56641j(i);
    }

    public void show(int i) {
        this.f34301a.mo56640k(i);
    }

    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$d */
    /* loaded from: classes2.dex */
    public static class C4183d extends C4185e {

        /* renamed from: a */
        public final WindowInsetsControllerCompat f34304a;

        /* renamed from: b */
        public final WindowInsetsController f34305b;

        /* renamed from: c */
        public final SimpleArrayMap f34306c;

        /* renamed from: d */
        public Window f34307d;

        /* renamed from: androidx.core.view.WindowInsetsControllerCompat$d$a */
        /* loaded from: classes2.dex */
        public class WindowInsetsAnimationControlListenerC4184a implements WindowInsetsAnimationControlListener {

            /* renamed from: a */
            public WindowInsetsAnimationControllerCompat f34308a = null;

            /* renamed from: b */
            public final /* synthetic */ WindowInsetsAnimationControlListenerCompat f34309b;

            public WindowInsetsAnimationControlListenerC4184a(WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
                C4183d.this = r1;
                this.f34309b = windowInsetsAnimationControlListenerCompat;
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat;
                WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat = this.f34309b;
                if (windowInsetsAnimationController == null) {
                    windowInsetsAnimationControllerCompat = null;
                } else {
                    windowInsetsAnimationControllerCompat = this.f34308a;
                }
                windowInsetsAnimationControlListenerCompat.onCancelled(windowInsetsAnimationControllerCompat);
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f34309b.onFinished(this.f34308a);
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = new WindowInsetsAnimationControllerCompat(windowInsetsAnimationController);
                this.f34308a = windowInsetsAnimationControllerCompat;
                this.f34309b.onReady(windowInsetsAnimationControllerCompat, i);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C4183d(android.view.Window r2, androidx.core.view.WindowInsetsControllerCompat r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = p000.AbstractC19464d52.m31931a(r2)
                r1.<init>(r0, r3)
                r1.f34307d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.WindowInsetsControllerCompat.C4183d.<init>(android.view.Window, androidx.core.view.WindowInsetsControllerCompat):void");
        }

        /* renamed from: l */
        public static /* synthetic */ void m56654l(C4183d c4183d, OnControllableInsetsChangedListener onControllableInsetsChangedListener, WindowInsetsController windowInsetsController, int i) {
            c4183d.m56653m(onControllableInsetsChangedListener, windowInsetsController, i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: a */
        public void mo56650a(final OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            if (this.f34306c.containsKey(onControllableInsetsChangedListener)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener2 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: f52
                {
                    WindowInsetsControllerCompat.C4183d.this = this;
                }

                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
                    WindowInsetsControllerCompat.C4183d.m56654l(WindowInsetsControllerCompat.C4183d.this, onControllableInsetsChangedListener, windowInsetsController, i);
                }
            };
            this.f34306c.put(onControllableInsetsChangedListener, onControllableInsetsChangedListener2);
            this.f34305b.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener2);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: b */
        public void mo56649b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
            this.f34305b.controlWindowInsetsAnimation(i, j, interpolator, cancellationSignal, new WindowInsetsAnimationControlListenerC4184a(windowInsetsAnimationControlListenerCompat));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: c */
        public int mo56648c() {
            int systemBarsBehavior;
            systemBarsBehavior = this.f34305b.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: d */
        public void mo56647d(int i) {
            this.f34305b.hide(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: e */
        public boolean mo56646e() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f34305b.getSystemBarsAppearance();
            if ((systemBarsAppearance & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: f */
        public boolean mo56645f() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f34305b.getSystemBarsAppearance();
            if ((systemBarsAppearance & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: g */
        public void mo56644g(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            WindowInsetsController.OnControllableInsetsChangedListener m52049a = AbstractC19120b52.m52049a(this.f34306c.remove(onControllableInsetsChangedListener));
            if (m52049a != null) {
                this.f34305b.removeOnControllableInsetsChangedListener(m52049a);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: h */
        public void mo56643h(boolean z) {
            if (z) {
                if (this.f34307d != null) {
                    m56652n(16);
                }
                this.f34305b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f34307d != null) {
                m56651o(16);
            }
            this.f34305b.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: i */
        public void mo56642i(boolean z) {
            if (z) {
                if (this.f34307d != null) {
                    m56652n(8192);
                }
                this.f34305b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f34307d != null) {
                m56651o(8192);
            }
            this.f34305b.setSystemBarsAppearance(0, 8);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: j */
        public void mo56641j(int i) {
            this.f34305b.setSystemBarsBehavior(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C4185e
        /* renamed from: k */
        public void mo56640k(int i) {
            Window window = this.f34307d;
            if (window != null && (i & 8) != 0 && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f34305b.show(i);
        }

        /* renamed from: m */
        public final /* synthetic */ void m56653m(OnControllableInsetsChangedListener onControllableInsetsChangedListener, WindowInsetsController windowInsetsController, int i) {
            if (this.f34305b == windowInsetsController) {
                onControllableInsetsChangedListener.onControllableInsetsChanged(this.f34304a, i);
            }
        }

        /* renamed from: n */
        public void m56652n(int i) {
            View decorView = this.f34307d.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: o */
        public void m56651o(int i) {
            View decorView = this.f34307d.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public C4183d(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat) {
            this.f34306c = new SimpleArrayMap();
            this.f34305b = windowInsetsController;
            this.f34304a = windowInsetsControllerCompat;
        }
    }

    public WindowInsetsControllerCompat(@NonNull Window window, @NonNull View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f34301a = new C4183d(window, this);
        } else if (i >= 26) {
            this.f34301a = new C4182c(window, view);
        } else if (i >= 23) {
            this.f34301a = new C4181b(window, view);
        } else {
            this.f34301a = new C4180a(window, view);
        }
    }
}
