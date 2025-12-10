package net.lucode.hackware.magicindicator;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* loaded from: classes6.dex */
public class NavigatorHelper {

    /* renamed from: a */
    public SparseBooleanArray f72400a = new SparseBooleanArray();

    /* renamed from: b */
    public SparseArray f72401b = new SparseArray();

    /* renamed from: c */
    public int f72402c;

    /* renamed from: d */
    public int f72403d;

    /* renamed from: e */
    public int f72404e;

    /* renamed from: f */
    public float f72405f;

    /* renamed from: g */
    public int f72406g;

    /* renamed from: h */
    public boolean f72407h;

    /* renamed from: i */
    public OnNavigatorScrollListener f72408i;

    /* loaded from: classes6.dex */
    public interface OnNavigatorScrollListener {
        void onDeselected(int i, int i2);

        void onEnter(int i, int i2, float f, boolean z);

        void onLeave(int i, int i2, float f, boolean z);

        void onSelected(int i, int i2);
    }

    /* renamed from: a */
    public final void m26361a(int i) {
        OnNavigatorScrollListener onNavigatorScrollListener = this.f72408i;
        if (onNavigatorScrollListener != null) {
            onNavigatorScrollListener.onDeselected(i, this.f72402c);
        }
        this.f72400a.put(i, true);
    }

    /* renamed from: b */
    public final void m26360b(int i, float f, boolean z, boolean z2) {
        if (this.f72407h || i == this.f72403d || this.f72406g == 1 || z2) {
            OnNavigatorScrollListener onNavigatorScrollListener = this.f72408i;
            if (onNavigatorScrollListener != null) {
                onNavigatorScrollListener.onEnter(i, this.f72402c, f, z);
            }
            this.f72401b.put(i, Float.valueOf(1.0f - f));
        }
    }

    /* renamed from: c */
    public final void m26359c(int i, float f, boolean z, boolean z2) {
        if (!this.f72407h && i != this.f72404e && this.f72406g != 1) {
            int i2 = this.f72403d;
            if (((i != i2 - 1 && i != i2 + 1) || ((Float) this.f72401b.get(i, Float.valueOf(0.0f))).floatValue() == 1.0f) && !z2) {
                return;
            }
        }
        OnNavigatorScrollListener onNavigatorScrollListener = this.f72408i;
        if (onNavigatorScrollListener != null) {
            onNavigatorScrollListener.onLeave(i, this.f72402c, f, z);
        }
        this.f72401b.put(i, Float.valueOf(f));
    }

    /* renamed from: d */
    public final void m26358d(int i) {
        OnNavigatorScrollListener onNavigatorScrollListener = this.f72408i;
        if (onNavigatorScrollListener != null) {
            onNavigatorScrollListener.onSelected(i, this.f72402c);
        }
        this.f72400a.put(i, false);
    }

    public int getCurrentIndex() {
        return this.f72403d;
    }

    public int getScrollState() {
        return this.f72406g;
    }

    public int getTotalCount() {
        return this.f72402c;
    }

    public void onPageScrollStateChanged(int i) {
        this.f72406g = i;
    }

    public void onPageScrolled(int i, float f, int i2) {
        boolean z;
        boolean z2;
        float f2 = i + f;
        float f3 = this.f72405f;
        if (f3 <= f2) {
            z = true;
        } else {
            z = false;
        }
        if (this.f72406g != 0) {
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
            for (int i4 = 0; i4 < this.f72402c; i4++) {
                if (i4 != i && i4 != i3 && ((Float) this.f72401b.get(i4, Float.valueOf(0.0f))).floatValue() != 1.0f) {
                    m26359c(i4, 1.0f, z, true);
                }
            }
            if (z2) {
                if (z) {
                    m26359c(i, f, true, false);
                    m26360b(i3, f, true, false);
                } else {
                    float f4 = 1.0f - f;
                    m26359c(i3, f4, false, false);
                    m26360b(i, f4, false, false);
                }
            } else {
                float f5 = 1.0f - f;
                m26359c(i3, f5, true, false);
                m26360b(i, f5, true, false);
            }
        } else {
            for (int i5 = 0; i5 < this.f72402c; i5++) {
                if (i5 != this.f72403d) {
                    if (!this.f72400a.get(i5)) {
                        m26361a(i5);
                    }
                    if (((Float) this.f72401b.get(i5, Float.valueOf(0.0f))).floatValue() != 1.0f) {
                        m26359c(i5, 1.0f, false, true);
                    }
                }
            }
            m26360b(this.f72403d, 1.0f, false, true);
            m26358d(this.f72403d);
        }
        this.f72405f = f2;
    }

    public void onPageSelected(int i) {
        this.f72404e = this.f72403d;
        this.f72403d = i;
        m26358d(i);
        for (int i2 = 0; i2 < this.f72402c; i2++) {
            if (i2 != this.f72403d && !this.f72400a.get(i2)) {
                m26361a(i2);
            }
        }
    }

    public void setNavigatorScrollListener(OnNavigatorScrollListener onNavigatorScrollListener) {
        this.f72408i = onNavigatorScrollListener;
    }

    public void setSkimOver(boolean z) {
        this.f72407h = z;
    }

    public void setTotalCount(int i) {
        this.f72402c = i;
        this.f72400a.clear();
        this.f72401b.clear();
    }
}