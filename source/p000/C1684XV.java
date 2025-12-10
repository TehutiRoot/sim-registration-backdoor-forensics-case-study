package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C5216c;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: XV */
/* loaded from: classes2.dex */
public final class C1684XV {

    /* renamed from: a */
    public final ViewPager2 f7499a;

    /* renamed from: b */
    public final C5216c f7500b;

    /* renamed from: c */
    public final RecyclerView f7501c;

    /* renamed from: d */
    public VelocityTracker f7502d;

    /* renamed from: e */
    public int f7503e;

    /* renamed from: f */
    public float f7504f;

    /* renamed from: g */
    public int f7505g;

    /* renamed from: h */
    public long f7506h;

    public C1684XV(ViewPager2 viewPager2, C5216c c5216c, RecyclerView recyclerView) {
        this.f7499a = viewPager2;
        this.f7500b = c5216c;
        this.f7501c = recyclerView;
    }

    /* renamed from: a */
    public final void m65491a(long j, int i, float f, float f2) {
        MotionEvent obtain = MotionEvent.obtain(this.f7506h, j, i, f, f2, 0);
        this.f7502d.addMovement(obtain);
        obtain.recycle();
    }

    /* renamed from: b */
    public boolean m65490b() {
        if (this.f7500b.m52374g()) {
            return false;
        }
        this.f7505g = 0;
        this.f7504f = 0;
        this.f7506h = SystemClock.uptimeMillis();
        m65489c();
        this.f7500b.m52370k();
        if (!this.f7500b.m52372i()) {
            this.f7501c.stopScroll();
        }
        m65491a(this.f7506h, 0, 0.0f, 0.0f);
        return true;
    }

    /* renamed from: c */
    public final void m65489c() {
        VelocityTracker velocityTracker = this.f7502d;
        if (velocityTracker == null) {
            this.f7502d = VelocityTracker.obtain();
            this.f7503e = ViewConfiguration.get(this.f7499a.getContext()).getScaledMaximumFlingVelocity();
            return;
        }
        velocityTracker.clear();
    }

    /* renamed from: d */
    public boolean m65488d() {
        if (!this.f7500b.m52373h()) {
            return false;
        }
        this.f7500b.m52368m();
        VelocityTracker velocityTracker = this.f7502d;
        velocityTracker.computeCurrentVelocity(1000, this.f7503e);
        if (!this.f7501c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            this.f7499a.m52418h();
            return true;
        }
        return true;
    }

    /* renamed from: e */
    public boolean m65487e(float f) {
        boolean z;
        int i;
        float f2;
        float f3;
        int i2 = 0;
        if (!this.f7500b.m52373h()) {
            return false;
        }
        float f4 = this.f7504f - f;
        this.f7504f = f4;
        int round = Math.round(f4 - this.f7505g);
        this.f7505g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f7499a.getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = round;
        } else {
            i = 0;
        }
        if (!z) {
            i2 = round;
        }
        if (z) {
            f2 = this.f7504f;
        } else {
            f2 = 0.0f;
        }
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = this.f7504f;
        }
        this.f7501c.scrollBy(i, i2);
        m65491a(uptimeMillis, 2, f2, f3);
        return true;
    }

    /* renamed from: f */
    public boolean m65486f() {
        return this.f7500b.m52373h();
    }
}
