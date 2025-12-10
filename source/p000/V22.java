package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: V22 */
/* loaded from: classes4.dex */
public abstract class V22 extends CoordinatorLayout.Behavior {

    /* renamed from: a */
    public W22 f6527a;

    /* renamed from: b */
    public int f6528b;

    /* renamed from: c */
    public int f6529c;

    public V22() {
        this.f6528b = 0;
        this.f6529c = 0;
    }

    public int getLeftAndRightOffset() {
        W22 w22 = this.f6527a;
        if (w22 != null) {
            return w22.m65702c();
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        W22 w22 = this.f6527a;
        if (w22 != null) {
            return w22.m65701d();
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        W22 w22 = this.f6527a;
        if (w22 != null && w22.m65700e()) {
            return true;
        }
        return false;
    }

    public boolean isVerticalOffsetEnabled() {
        W22 w22 = this.f6527a;
        if (w22 != null && w22.m65699f()) {
            return true;
        }
        return false;
    }

    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        coordinatorLayout.onLayoutChild(view, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        layoutChild(coordinatorLayout, view, i);
        if (this.f6527a == null) {
            this.f6527a = new W22(view);
        }
        this.f6527a.m65698g();
        this.f6527a.m65704a();
        int i2 = this.f6528b;
        if (i2 != 0) {
            this.f6527a.m65695j(i2);
            this.f6528b = 0;
        }
        int i3 = this.f6529c;
        if (i3 != 0) {
            this.f6527a.m65696i(i3);
            this.f6529c = 0;
            return true;
        }
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        W22 w22 = this.f6527a;
        if (w22 != null) {
            w22.m65697h(z);
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        W22 w22 = this.f6527a;
        if (w22 != null) {
            return w22.m65696i(i);
        }
        this.f6529c = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        W22 w22 = this.f6527a;
        if (w22 != null) {
            return w22.m65695j(i);
        }
        this.f6528b = i;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        W22 w22 = this.f6527a;
        if (w22 != null) {
            w22.m65694k(z);
        }
    }

    public V22(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6528b = 0;
        this.f6529c = 0;
    }
}
