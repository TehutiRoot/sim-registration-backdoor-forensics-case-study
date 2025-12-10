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

/* renamed from: y70  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23080y70 extends V22 {

    /* renamed from: d */
    public final Rect f108617d;

    /* renamed from: e */
    public final Rect f108618e;

    /* renamed from: f */
    public int f108619f;

    /* renamed from: g */
    public int f108620g;

    public AbstractC23080y70() {
        this.f108617d = new Rect();
        this.f108618e = new Rect();
        this.f108619f = 0;
    }

    /* renamed from: f */
    public static int m334f(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* renamed from: a */
    public abstract View mo339a(List list);

    /* renamed from: b */
    public final int m338b(View view) {
        if (this.f108620g == 0) {
            return 0;
        }
        float mo337c = mo337c(view);
        int i = this.f108620g;
        return MathUtils.clamp((int) (mo337c * i), 0, i);
    }

    /* renamed from: c */
    public abstract float mo337c(View view);

    /* renamed from: d */
    public int mo336d(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: e */
    public final int m335e() {
        return this.f108619f;
    }

    public final int getOverlayTop() {
        return this.f108620g;
    }

    @Override // p000.V22
    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        View mo339a = mo339a(coordinatorLayout.getDependencies(view));
        if (mo339a != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            Rect rect = this.f108617d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, mo339a.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((coordinatorLayout.getHeight() + mo339a.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            Rect rect2 = this.f108618e;
            GravityCompat.apply(m334f(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int m338b = m338b(mo339a);
            view.layout(rect2.left, rect2.top - m338b, rect2.right, rect2.bottom - m338b);
            this.f108619f = rect2.top - mo339a.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i);
        this.f108619f = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View mo339a;
        int i5;
        WindowInsetsCompat lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 == -1 || i6 == -2) && (mo339a = mo339a(coordinatorLayout.getDependencies(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (ViewCompat.getFitsSystemWindows(mo339a) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int mo336d = size + mo336d(mo339a);
            int measuredHeight = mo339a.getMeasuredHeight();
            if (shouldHeaderOverlapScrollingChild()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                mo336d -= measuredHeight;
            }
            if (i6 == -1) {
                i5 = 1073741824;
            } else {
                i5 = Integer.MIN_VALUE;
            }
            coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(mo336d, i5), i4);
            return true;
        }
        return false;
    }

    public final void setOverlayTop(int i) {
        this.f108620g = i;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public AbstractC23080y70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f108617d = new Rect();
        this.f108618e = new Rect();
        this.f108619f = 0;
    }
}
