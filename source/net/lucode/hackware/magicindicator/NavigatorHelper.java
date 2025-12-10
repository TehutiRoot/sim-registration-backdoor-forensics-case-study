package net.lucode.hackware.magicindicator;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* loaded from: classes6.dex */
public class NavigatorHelper {

    /* renamed from: a */
    public SparseBooleanArray f72278a = new SparseBooleanArray();

    /* renamed from: b */
    public SparseArray f72279b = new SparseArray();

    /* renamed from: c */
    public int f72280c;

    /* renamed from: d */
    public int f72281d;

    /* renamed from: e */
    public int f72282e;

    /* renamed from: f */
    public float f72283f;

    /* renamed from: g */
    public int f72284g;

    /* renamed from: h */
    public boolean f72285h;

    /* renamed from: i */
    public OnNavigatorScrollListener f72286i;

    /* loaded from: classes6.dex */
    public interface OnNavigatorScrollListener {
        void onDeselected(int i, int i2);

        void onEnter(int i, int i2, float f, boolean z);

        void onLeave(int i, int i2, float f, boolean z);

        void onSelected(int i, int i2);
    }

    /* renamed from: a */
    public final void m26101a(int i) {
        OnNavigatorScrollListener onNavigatorScrollListener = this.f72286i;
        if (onNavigatorScrollListener != null) {
            onNavigatorScrollListener.onDeselected(i, this.f72280c);
        }
        this.f72278a.put(i, true);
    }

    /* renamed from: b */
    public final void m26100b(int i, float f, boolean z, boolean z2) {
        if (this.f72285h || i == this.f72281d || this.f72284g == 1 || z2) {
            OnNavigatorScrollListener onNavigatorScrollListener = this.f72286i;
            if (onNavigatorScrollListener != null) {
                onNavigatorScrollListener.onEnter(i, this.f72280c, f, z);
            }
            this.f72279b.put(i, Float.valueOf(1.0f - f));
        }
    }

    /* renamed from: c */
    public final void m26099c(int i, float f, boolean z, boolean z2) {
        if (!this.f72285h && i != this.f72282e && this.f72284g != 1) {
            int i2 = this.f72281d;
            if (((i != i2 - 1 && i != i2 + 1) || ((Float) this.f72279b.get(i, Float.valueOf(0.0f))).floatValue() == 1.0f) && !z2) {
                return;
            }
        }
        OnNavigatorScrollListener onNavigatorScrollListener = this.f72286i;
        if (onNavigatorScrollListener != null) {
            onNavigatorScrollListener.onLeave(i, this.f72280c, f, z);
        }
        this.f72279b.put(i, Float.valueOf(f));
    }

    /* renamed from: d */
    public final void m26098d(int i) {
        OnNavigatorScrollListener onNavigatorScrollListener = this.f72286i;
        if (onNavigatorScrollListener != null) {
            onNavigatorScrollListener.onSelected(i, this.f72280c);
        }
        this.f72278a.put(i, false);
    }

    public int getCurrentIndex() {
        return this.f72281d;
    }

    public int getScrollState() {
        return this.f72284g;
    }

    public int getTotalCount() {
        return this.f72280c;
    }

    public void onPageScrollStateChanged(int i) {
        this.f72284g = i;
    }

    public void onPageScrolled(int i, float f, int i2) {
        boolean z;
        boolean z2;
        float f2 = i + f;
        float f3 = this.f72283f;
        if (f3 <= f2) {
            z = true;
        } else {
            z = false;
        }
        if (this.f72284g != 0) {
            if (f2 == f3) {
                return;
            }
            int i3 = i + 1;
            if (f == 0.0f && z) {
                i3 = i - 1;
                z2 = false;
            } else {
                z2 = true;
            }
            for (int i4 = 0; i4 < this.f72280c; i4++) {
                if (i4 != i && i4 != i3 && ((Float) this.f72279b.get(i4, Float.valueOf(0.0f))).floatValue() != 1.0f) {
                    m26099c(i4, 1.0f, z, true);
                }
            }
            if (z2) {
                if (z) {
                    m26099c(i, f, true, false);
                    m26100b(i3, f, true, false);
                } else {
                    float f4 = 1.0f - f;
                    m26099c(i3, f4, false, false);
                    m26100b(i, f4, false, false);
                }
            } else {
                float f5 = 1.0f - f;
                m26099c(i3, f5, true, false);
                m26100b(i, f5, true, false);
            }
        } else {
            for (int i5 = 0; i5 < this.f72280c; i5++) {
                if (i5 != this.f72281d) {
                    if (!this.f72278a.get(i5)) {
                        m26101a(i5);
                    }
                    if (((Float) this.f72279b.get(i5, Float.valueOf(0.0f))).floatValue() != 1.0f) {
                        m26099c(i5, 1.0f, false, true);
                    }
                }
            }
            m26100b(this.f72281d, 1.0f, false, true);
            m26098d(this.f72281d);
        }
        this.f72283f = f2;
    }

    public void onPageSelected(int i) {
        this.f72282e = this.f72281d;
        this.f72281d = i;
        m26098d(i);
        for (int i2 = 0; i2 < this.f72280c; i2++) {
            if (i2 != this.f72281d && !this.f72278a.get(i2)) {
                m26101a(i2);
            }
        }
    }

    public void setNavigatorScrollListener(OnNavigatorScrollListener onNavigatorScrollListener) {
        this.f72286i = onNavigatorScrollListener;
    }

    public void setSkimOver(boolean z) {
        this.f72285h = z;
    }

    public void setTotalCount(int i) {
        this.f72280c = i;
        this.f72278a.clear();
        this.f72279b.clear();
    }
}
