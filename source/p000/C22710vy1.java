package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: vy1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22710vy1 extends UG1 {

    /* renamed from: a */
    public final SideSheetBehavior f107864a;

    public C22710vy1(SideSheetBehavior sideSheetBehavior) {
        this.f107864a = sideSheetBehavior;
    }

    @Override // p000.UG1
    /* renamed from: a */
    public int mo965a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // p000.UG1
    /* renamed from: b */
    public float mo964b(int i) {
        float mo961e = mo961e();
        return (mo961e - i) / (mo961e - mo962d());
    }

    @Override // p000.UG1
    /* renamed from: c */
    public int mo963c(View view, float f, float f2) {
        if (f < 0.0f) {
            return 3;
        }
        if (m954l(view, f)) {
            if (!m955k(f, f2) && !m956j(view)) {
                return 3;
            }
        } else if (f == 0.0f || !WG1.m65644a(f, f2)) {
            int left = view.getLeft();
            if (Math.abs(left - mo962d()) < Math.abs(left - mo961e())) {
                return 3;
            }
        }
        return 5;
    }

    @Override // p000.UG1
    /* renamed from: d */
    public int mo962d() {
        return Math.max(0, (mo961e() - this.f107864a.m44079s()) - this.f107864a.m44076v());
    }

    @Override // p000.UG1
    /* renamed from: e */
    public int mo961e() {
        return this.f107864a.m44074x();
    }

    @Override // p000.UG1
    /* renamed from: f */
    public int mo960f(View view) {
        return view.getLeft() - this.f107864a.m44076v();
    }

    @Override // p000.UG1
    /* renamed from: g */
    public int mo959g() {
        return 0;
    }

    @Override // p000.UG1
    /* renamed from: h */
    public boolean mo958h(View view, int i, boolean z) {
        int m44075w = this.f107864a.m44075w(i);
        ViewDragHelper m44073y = this.f107864a.m44073y();
        if (m44073y != null && (!z ? m44073y.smoothSlideViewTo(view, m44075w, view.getTop()) : m44073y.settleCapturedViewAt(m44075w, view.getTop()))) {
            return true;
        }
        return false;
    }

    @Override // p000.UG1
    /* renamed from: i */
    public void mo957i(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int m44074x = this.f107864a.m44074x();
        if (i <= m44074x) {
            marginLayoutParams.rightMargin = m44074x - i;
        }
    }

    /* renamed from: j */
    public final boolean m956j(View view) {
        if (view.getLeft() > (mo961e() - mo962d()) / 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m955k(float f, float f2) {
        if (WG1.m65644a(f, f2) && f2 > this.f107864a.getSignificantVelocityThreshold()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m954l(View view, float f) {
        if (Math.abs(view.getRight() + (f * this.f107864a.getHideFriction())) > this.f107864a.m44077u()) {
            return true;
        }
        return false;
    }
}
