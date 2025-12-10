package p000;

import android.os.Parcelable;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;

/* renamed from: H12 */
/* loaded from: classes5.dex */
public abstract class H12 extends CoordinatorLayout.Behavior {

    /* renamed from: a */
    public int f2088a = 0;

    /* renamed from: b */
    public int f2089b = 0;

    /* renamed from: c */
    public int f2090c = 0;

    /* renamed from: d */
    public int f2091d = 0;

    /* renamed from: a */
    public abstract void mo23656a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3);

    /* renamed from: b */
    public abstract boolean mo23655b(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, int i);

    /* renamed from: c */
    public abstract void mo23654c(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorLayout, View view, WindowInsetsCompat windowInsetsCompat) {
        return super.onApplyWindowInsets(coordinatorLayout, view, windowInsetsCompat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        int i;
        super.onNestedFling(coordinatorLayout, view, view2, f, f2, z);
        if (f2 > 0.0f) {
            i = 1;
        } else {
            i = -1;
        }
        this.f2091d = i;
        return mo23655b(coordinatorLayout, view, view2, f, f2, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return super.onNestedPreFling(coordinatorLayout, view, view2, f, f2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        super.onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr);
        if (i2 > 0 && this.f2089b < 0) {
            this.f2089b = 0;
            this.f2091d = 1;
        } else if (i2 < 0 && this.f2089b > 0) {
            this.f2089b = 0;
            this.f2091d = -1;
        }
        this.f2089b += i2;
        mo23656a(coordinatorLayout, view, view2, i, i2, iArr, this.f2091d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        super.onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i4);
        if (i4 > 0 && this.f2088a < 0) {
            this.f2088a = 0;
            this.f2090c = 1;
        } else if (i4 < 0 && this.f2088a > 0) {
            this.f2088a = 0;
            this.f2090c = -1;
        }
        int i5 = this.f2088a + i4;
        this.f2088a = i5;
        mo23654c(coordinatorLayout, view, this.f2090c, i2, i5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        super.onNestedScrollAccepted(coordinatorLayout, view, view2, view3, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return super.onSaveInstanceState(coordinatorLayout, view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.onStopNestedScroll(coordinatorLayout, view, view2);
    }
}
