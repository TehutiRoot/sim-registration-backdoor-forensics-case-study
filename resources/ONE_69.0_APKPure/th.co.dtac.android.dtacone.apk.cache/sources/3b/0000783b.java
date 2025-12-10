package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C5198c;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: bW */
/* loaded from: classes2.dex */
public final class C5358bW {

    /* renamed from: a */
    public final ViewPager2 f39115a;

    /* renamed from: b */
    public final C5198c f39116b;

    /* renamed from: c */
    public final RecyclerView f39117c;

    /* renamed from: d */
    public VelocityTracker f39118d;

    /* renamed from: e */
    public int f39119e;

    /* renamed from: f */
    public float f39120f;

    /* renamed from: g */
    public int f39121g;

    /* renamed from: h */
    public long f39122h;

    public C5358bW(ViewPager2 viewPager2, C5198c c5198c, RecyclerView recyclerView) {
        this.f39115a = viewPager2;
        this.f39116b = c5198c;
        this.f39117c = recyclerView;
    }

    /* renamed from: a */
    public final void m51929a(long j, int i, float f, float f2) {
        MotionEvent obtain = MotionEvent.obtain(this.f39122h, j, i, f, f2, 0);
        this.f39118d.addMovement(obtain);
        obtain.recycle();
    }

    /* renamed from: b */
    public boolean m51928b() {
        if (this.f39116b.m52326g()) {
            return false;
        }
        this.f39121g = 0;
        this.f39120f = 0;
        this.f39122h = SystemClock.uptimeMillis();
        m51927c();
        this.f39116b.m52322k();
        if (!this.f39116b.m52324i()) {
            this.f39117c.stopScroll();
        }
        m51929a(this.f39122h, 0, 0.0f, 0.0f);
        return true;
    }

    /* renamed from: c */
    public final void m51927c() {
        VelocityTracker velocityTracker = this.f39118d;
        if (velocityTracker == null) {
            this.f39118d = VelocityTracker.obtain();
            this.f39119e = ViewConfiguration.get(this.f39115a.getContext()).getScaledMaximumFlingVelocity();
            return;
        }
        velocityTracker.clear();
    }

    /* renamed from: d */
    public boolean m51926d() {
        if (!this.f39116b.m52325h()) {
            return false;
        }
        this.f39116b.m52320m();
        VelocityTracker velocityTracker = this.f39118d;
        velocityTracker.computeCurrentVelocity(1000, this.f39119e);
        if (!this.f39117c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            this.f39115a.m52370h();
            return true;
        }
        return true;
    }

    /* renamed from: e */
    public boolean m51925e(float f) {
        boolean z;
        int i;
        float f2;
        float f3;
        int i2 = 0;
        if (!this.f39116b.m52325h()) {
            return false;
        }
        float f4 = this.f39120f - f;
        this.f39120f = f4;
        int round = Math.round(f4 - this.f39121g);
        this.f39121g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f39115a.getOrientation() == 0) {
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
            f2 = this.f39120f;
        } else {
            f2 = 0.0f;
        }
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = this.f39120f;
        }
        this.f39117c.scrollBy(i, i2);
        m51929a(uptimeMillis, 2, f2, f3);
        return true;
    }

    /* renamed from: f */
    public boolean m51924f() {
        return this.f39116b.m52325h();
    }
}