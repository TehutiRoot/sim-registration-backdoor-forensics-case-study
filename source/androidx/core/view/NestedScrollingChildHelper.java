package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class NestedScrollingChildHelper {

    /* renamed from: a */
    public ViewParent f34176a;

    /* renamed from: b */
    public ViewParent f34177b;

    /* renamed from: c */
    public final View f34178c;

    /* renamed from: d */
    public boolean f34179d;

    /* renamed from: e */
    public int[] f34180e;

    public NestedScrollingChildHelper(@NonNull View view) {
        this.f34178c = view;
    }

    /* renamed from: a */
    public final boolean m56967a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m56966b;
        int i6;
        int i7;
        int[] iArr3;
        if (!isNestedScrollingEnabled() || (m56966b = m56966b(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f34178c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] m56965c = m56965c();
            m56965c[0] = 0;
            m56965c[1] = 0;
            iArr3 = m56965c;
        } else {
            iArr3 = iArr2;
        }
        ViewParentCompat.onNestedScroll(m56966b, this.f34178c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f34178c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: b */
    public final ViewParent m56966b(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f34177b;
        }
        return this.f34176a;
    }

    /* renamed from: c */
    public final int[] m56965c() {
        if (this.f34180e == null) {
            this.f34180e = new int[2];
        }
        return this.f34180e;
    }

    /* renamed from: d */
    public final void m56964d(int i, ViewParent viewParent) {
        if (i != 0) {
            if (i == 1) {
                this.f34177b = viewParent;
                return;
            }
            return;
        }
        this.f34176a = viewParent;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent m56966b;
        if (!isNestedScrollingEnabled() || (m56966b = m56966b(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedFling(m56966b, this.f34178c, f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent m56966b;
        if (!isNestedScrollingEnabled() || (m56966b = m56966b(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedPreFling(m56966b, this.f34178c, f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return m56967a(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f34179d;
    }

    public void onDetachedFromWindow() {
        ViewCompat.stopNestedScroll(this.f34178c);
    }

    public void onStopNestedScroll(@NonNull View view) {
        ViewCompat.stopNestedScroll(this.f34178c);
    }

    public void setNestedScrollingEnabled(boolean z) {
        if (this.f34179d) {
            ViewCompat.stopNestedScroll(this.f34178c);
        }
        this.f34179d = z;
    }

    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        ViewParent m56966b;
        int i4;
        int i5;
        if (!isNestedScrollingEnabled() || (m56966b = m56966b(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f34178c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = m56965c();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        ViewParentCompat.onNestedPreScroll(m56966b, this.f34178c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f34178c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        return m56967a(i, i2, i3, i4, iArr, i5, null);
    }

    public boolean hasNestedScrollingParent(int i) {
        return m56966b(i) != null;
    }

    public boolean startNestedScroll(int i, int i2) {
        if (hasNestedScrollingParent(i2)) {
            return true;
        }
        if (isNestedScrollingEnabled()) {
            View view = this.f34178c;
            for (ViewParent parent = this.f34178c.getParent(); parent != null; parent = parent.getParent()) {
                if (ViewParentCompat.onStartNestedScroll(parent, view, this.f34178c, i, i2)) {
                    m56964d(i2, parent);
                    ViewParentCompat.onNestedScrollAccepted(parent, view, this.f34178c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void stopNestedScroll(int i) {
        ViewParent m56966b = m56966b(i);
        if (m56966b != null) {
            ViewParentCompat.onStopNestedScroll(m56966b, this.f34178c, i);
            m56964d(i, null);
        }
    }

    public void dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @Nullable int[] iArr2) {
        m56967a(i, i2, i3, i4, iArr, i5, iArr2);
    }
}
