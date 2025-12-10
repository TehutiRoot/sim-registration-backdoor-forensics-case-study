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
    public final C3581c f30929a;

    /* renamed from: androidx.compose.ui.platform.coreshims.SoftwareKeyboardControllerCompat$a */
    /* loaded from: classes2.dex */
    public static class C3579a extends C3581c {

        /* renamed from: a */
        public final View f30930a;

        public C3579a(View view) {
            this.f30930a = view;
        }

        /* renamed from: c */
        public static /* synthetic */ void m59113c(View view) {
            m59112d(view);
        }

        /* renamed from: d */
        public static /* synthetic */ void m59112d(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat.C3581c
        /* renamed from: a */
        public void mo59109a() {
            View view = this.f30930a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f30930a.getWindowToken(), 0);
            }
        }

        @Override // androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat.C3581c
        /* renamed from: b */
        public void mo59108b() {
            final View view = this.f30930a;
            if (view == null) {
                return;
            }
            if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                view = view.getRootView().findFocus();
            } else {
                view.requestFocus();
            }
            if (view == null) {
                view = this.f30930a.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new Runnable() { // from class: eL1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SoftwareKeyboardControllerCompat.C3579a.m59113c(view);
                    }
                });
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.coreshims.SoftwareKeyboardControllerCompat$b */
    /* loaded from: classes2.dex */
    public static class C3580b extends C3579a {

        /* renamed from: b */
        public View f30931b;

        /* renamed from: c */
        public WindowInsetsController f30932c;

        public C3580b(View view) {
            super(view);
            this.f30931b = view;
        }

        /* renamed from: e */
        public static /* synthetic */ void m59111e(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i) {
            m59110f(atomicBoolean, windowInsetsController, i);
        }

        /* renamed from: f */
        public static /* synthetic */ void m59110f(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i) {
            boolean z;
            if ((i & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            atomicBoolean.set(z);
        }

        @Override // androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat.C3579a, androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat.C3581c
        /* renamed from: a */
        public void mo59109a() {
            int ime;
            View view;
            WindowInsetsController windowInsetsController = this.f30932c;
            if (windowInsetsController == null) {
                View view2 = this.f30931b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: kL1
                    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                        SoftwareKeyboardControllerCompat.C3580b.m59111e(atomicBoolean, windowInsetsController2, i);
                    }
                };
                windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                if (!atomicBoolean.get() && (view = this.f30931b) != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f30931b.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                ime = WindowInsets.Type.ime();
                windowInsetsController.hide(ime);
                return;
            }
            super.mo59109a();
        }

        @Override // androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat.C3579a, androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat.C3581c
        /* renamed from: b */
        public void mo59108b() {
            int ime;
            View view = this.f30931b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f30932c;
            if (windowInsetsController == null) {
                View view2 = this.f30931b;
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
            super.mo59108b();
        }
    }

    /* renamed from: androidx.compose.ui.platform.coreshims.SoftwareKeyboardControllerCompat$c */
    /* loaded from: classes2.dex */
    public static class C3581c {
        /* renamed from: a */
        public abstract void mo59109a();

        /* renamed from: b */
        public abstract void mo59108b();
    }

    public SoftwareKeyboardControllerCompat(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f30929a = new C3580b(view);
        } else {
            this.f30929a = new C3579a(view);
        }
    }

    public void hide() {
        this.f30929a.mo59109a();
    }

    public void show() {
        this.f30929a.mo59108b();
    }
}