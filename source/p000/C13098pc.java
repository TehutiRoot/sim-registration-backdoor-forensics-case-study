package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: pc */
/* loaded from: classes5.dex */
public class C13098pc extends H12 {

    /* renamed from: m */
    public static final Interpolator f76621m = new LinearOutSlowInInterpolator();

    /* renamed from: e */
    public final int f76622e;

    /* renamed from: f */
    public final int f76623f;

    /* renamed from: g */
    public boolean f76624g;

    /* renamed from: h */
    public ViewPropertyAnimatorCompat f76625h;

    /* renamed from: i */
    public boolean f76626i = false;

    /* renamed from: j */
    public int f76627j = -1;

    /* renamed from: k */
    public final InterfaceC13100b f76628k = new C13101c();

    /* renamed from: l */
    public boolean f76629l = true;

    /* renamed from: pc$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC13100b {
        /* renamed from: a */
        void mo23642a(CoordinatorLayout coordinatorLayout, View view, View view2);
    }

    /* renamed from: pc$c */
    /* loaded from: classes5.dex */
    public class C13101c implements InterfaceC13100b {
        public C13101c() {
        }

        @Override // p000.C13098pc.InterfaceC13100b
        /* renamed from: a */
        public void mo23642a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (!C13098pc.this.f76624g && (view instanceof Snackbar.SnackbarLayout)) {
                if (C13098pc.this.f76627j == -1) {
                    C13098pc.this.f76627j = view.getHeight();
                }
                if (ViewCompat.getTranslationY(view2) != 0.0f) {
                    return;
                }
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (C13098pc.this.f76627j + C13098pc.this.f76622e) - C13098pc.this.f76623f);
            }
        }
    }

    public C13098pc(int i, int i2, boolean z) {
        this.f76624g = false;
        this.f76622e = i;
        this.f76623f = i2;
        this.f76624g = z;
    }

    /* renamed from: k */
    public static C13098pc m23646k(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof C13098pc) {
                return (C13098pc) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomNavigationBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    @Override // p000.H12
    /* renamed from: a */
    public void mo23656a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        m23645l(view, i3);
    }

    @Override // p000.H12
    /* renamed from: b */
    public boolean mo23655b(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, int i) {
        m23645l(view, i);
        return true;
    }

    /* renamed from: i */
    public final void m23648i(View view, int i) {
        m23647j(view);
        this.f76625h.translationY(i).start();
    }

    /* renamed from: j */
    public final void m23647j(View view) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f76625h;
        if (viewPropertyAnimatorCompat == null) {
            ViewPropertyAnimatorCompat animate = ViewCompat.animate(view);
            this.f76625h = animate;
            animate.setDuration(300L);
            this.f76625h.setInterpolator(f76621m);
            return;
        }
        viewPropertyAnimatorCompat.cancel();
    }

    /* renamed from: l */
    public final void m23645l(View view, int i) {
        if (!this.f76629l) {
            return;
        }
        if (i == -1 && this.f76626i) {
            this.f76626i = false;
            m23648i(view, this.f76623f);
        } else if (i == 1 && !this.f76626i) {
            this.f76626i = true;
            m23648i(view, this.f76622e + this.f76623f);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        this.f76628k.mo23642a(coordinatorLayout, view2, view);
        return view2 instanceof Snackbar.SnackbarLayout;
    }

    /* renamed from: m */
    public void m23644m(View view, boolean z) {
        if (!z && this.f76626i) {
            m23648i(view, this.f76623f);
        } else if (z && !this.f76626i) {
            m23648i(view, this.f76622e + this.f76623f);
        }
        this.f76626i = z;
    }

    /* renamed from: n */
    public final void m23643n(View view, boolean z) {
        if (!this.f76624g && (view instanceof Snackbar.SnackbarLayout)) {
            this.f76629l = z;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        m23643n(view2, false);
        return super.onDependentViewChanged(coordinatorLayout, view, view2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        m23643n(view2, true);
        super.onDependentViewRemoved(coordinatorLayout, view, view2);
    }

    @Override // p000.H12
    /* renamed from: c */
    public void mo23654c(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
    }
}
