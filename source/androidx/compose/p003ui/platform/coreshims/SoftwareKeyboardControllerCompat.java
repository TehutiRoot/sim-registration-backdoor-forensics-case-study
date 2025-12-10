package androidx.compose.p003ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.compose.ui.platform.coreshims.SoftwareKeyboardControllerCompat */
/* loaded from: classes2.dex */
public final class SoftwareKeyboardControllerCompat {

    /* renamed from: a */
    public final C3599c f30841a;

    /* renamed from: androidx.compose.ui.platform.coreshims.SoftwareKeyboardControllerCompat$a */
    /* loaded from: classes2.dex */
    public static class C3597a extends C3599c {

        /* renamed from: a */
        public final View f30842a;

        public C3597a(View view) {
            this.f30842a = view;
        }

        /* renamed from: c */
        public static /* synthetic */ void m59163c(View view) {
            m59162d(view);
        }

        /* renamed from: d */
        public static /* synthetic */ void m59162d(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat.C3599c
        /* renamed from: a */
        public void mo59159a() {
            View view = this.f30842a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f30842a.getWindowToken(), 0);
            }
        }

        @Override // androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat.C3599c
        /* renamed from: b */
        public void mo59158b() {
            final View view = this.f30842a;
            if (view == null) {
                return;
            }
            if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                view = view.getRootView().findFocus();
            } else {
                view.requestFocus();
            }
            if (view == null) {
                view = this.f30842a.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new Runnable() { // from class: hK1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SoftwareKeyboardControllerCompat.C3597a.m59163c(view);
                    }
                });
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.coreshims.SoftwareKeyboardControllerCompat$b */
    /* loaded from: classes2.dex */
    public static class C3598b extends C3597a {

        /* renamed from: b */
        public View f30843b;

        /* renamed from: c */
        public WindowInsetsController f30844c;

        public C3598b(View view) {
            super(view);
            this.f30843b = view;
        }

        /* renamed from: e */
        public static /* synthetic */ void m59161e(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i) {
            m59160f(atomicBoolean, windowInsetsController, i);
        }

        /* renamed from: f */
        public static /* synthetic */ void m59160f(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i) {
            boolean z;
            if ((i & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            atomicBoolean.set(z);
        }

        @Override // androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat.C3597a, androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat.C3599c
        /* renamed from: a */
        public void mo59159a() {
            int ime;
            View view;
            WindowInsetsController windowInsetsController = this.f30844c;
            if (windowInsetsController == null) {
                View view2 = this.f30843b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: nK1
                    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                        SoftwareKeyboardControllerCompat.C3598b.m59161e(atomicBoolean, windowInsetsController2, i);
                    }
                };
                windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                if (!atomicBoolean.get() && (view = this.f30843b) != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f30843b.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                ime = WindowInsets.Type.ime();
                windowInsetsController.hide(ime);
                return;
            }
            super.mo59159a();
        }

        @Override // androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat.C3597a, androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat.C3599c
        /* renamed from: b */
        public void mo59158b() {
            int ime;
            View view = this.f30843b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f30844c;
            if (windowInsetsController == null) {
                View view2 = this.f30843b;
                if (view2 != null) {
                    windowInsetsController = view2.getWindowInsetsController();
                } else {
                    windowInsetsController = null;
                }
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
                return;
            }
            super.mo59158b();
        }
    }

    /* renamed from: androidx.compose.ui.platform.coreshims.SoftwareKeyboardControllerCompat$c */
    /* loaded from: classes2.dex */
    public static class C3599c {
        /* renamed from: a */
        public abstract void mo59159a();

        /* renamed from: b */
        public abstract void mo59158b();
    }

    public SoftwareKeyboardControllerCompat(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f30841a = new C3598b(view);
        } else {
            this.f30841a = new C3597a(view);
        }
    }

    public void hide() {
        this.f30841a.mo59159a();
    }

    public void show() {
        this.f30841a.mo59158b();
    }
}
