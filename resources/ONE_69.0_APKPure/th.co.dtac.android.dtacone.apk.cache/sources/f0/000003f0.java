package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* renamed from: E70 */
/* loaded from: classes4.dex */
public abstract class E70 extends S32 {

    /* renamed from: d */
    public final Rect f1257d;

    /* renamed from: e */
    public final Rect f1258e;

    /* renamed from: f */
    public int f1259f;

    /* renamed from: g */
    public int f1260g;

    public E70() {
        this.f1257d = new Rect();
        this.f1258e = new Rect();
        this.f1259f = 0;
    }

    /* renamed from: f */
    public static int m68691f(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* renamed from: a */
    public abstract View mo45889a(List list);

    /* renamed from: b */
    public final int m68693b(View view) {
        if (this.f1260g == 0) {
            return 0;
        }
        float mo45888c = mo45888c(view);
        int i = this.f1260g;
        return MathUtils.clamp((int) (mo45888c * i), 0, i);
    }

    /* renamed from: c */
    public abstract float mo45888c(View view);

    /* renamed from: d */
    public int mo45887d(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: e */
    public final int m68692e() {
        return this.f1259f;
    }

    public final int getOverlayTop() {
        return this.f1260g;
    }

    @Override // p000.S32
    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        View mo45889a = mo45889a(coordinatorLayout.getDependencies(view));
        if (mo45889a != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            Rect rect = this.f1257d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, mo45889a.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((coordinatorLayout.getHeight() + mo45889a.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            Rect rect2 = this.f1258e;
            GravityCompat.apply(m68691f(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int m68693b = m68693b(mo45889a);
            view.layout(rect2.left, rect2.top - m68693b, rect2.right, rect2.bottom - m68693b);
            this.f1259f = rect2.top - mo45889a.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i);
        this.f1259f = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View mo45889a;
        int i5;
        WindowInsetsCompat lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 == -1 || i6 == -2) && (mo45889a = mo45889a(coordinatorLayout.getDependencies(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (ViewCompat.getFitsSystemWindows(mo45889a) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int mo45887d = size + mo45887d(mo45889a);
            int measuredHeight = mo45889a.getMeasuredHeight();
            if (shouldHeaderOverlapScrollingChild()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                mo45887d -= measuredHeight;
            }
            if (i6 == -1) {
                i5 = 1073741824;
            } else {
                i5 = Integer.MIN_VALUE;
            }
            coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(mo45887d, i5), i4);
            return true;
        }
        return false;
    }

    public final void setOverlayTop(int i) {
        this.f1260g = i;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public E70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1257d = new Rect();
        this.f1258e = new Rect();
        this.f1259f = 0;
    }
}