package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    public static final float NO_MAX = Float.MAX_VALUE;
    public static final float NO_MIN = 0.0f;
    public static final float RELATIVE_UNSPECIFIED = 0.0f;

    /* renamed from: r */
    public static final int f34339r = ViewConfiguration.getTapTimeout();

    /* renamed from: c */
    public final View f34342c;

    /* renamed from: d */
    public Runnable f34343d;

    /* renamed from: g */
    public int f34346g;

    /* renamed from: h */
    public int f34347h;

    /* renamed from: l */
    public boolean f34351l;

    /* renamed from: m */
    public boolean f34352m;

    /* renamed from: n */
    public boolean f34353n;

    /* renamed from: o */
    public boolean f34354o;

    /* renamed from: p */
    public boolean f34355p;

    /* renamed from: q */
    public boolean f34356q;

    /* renamed from: a */
    public final C4209a f34340a = new C4209a();

    /* renamed from: b */
    public final Interpolator f34341b = new AccelerateInterpolator();

    /* renamed from: e */
    public float[] f34344e = {0.0f, 0.0f};

    /* renamed from: f */
    public float[] f34345f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i */
    public float[] f34348i = {0.0f, 0.0f};

    /* renamed from: j */
    public float[] f34349j = {0.0f, 0.0f};

    /* renamed from: k */
    public float[] f34350k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.AutoScrollHelper$a */
    /* loaded from: classes2.dex */
    public static class C4209a {

        /* renamed from: a */
        public int f34357a;

        /* renamed from: b */
        public int f34358b;

        /* renamed from: c */
        public float f34359c;

        /* renamed from: d */
        public float f34360d;

        /* renamed from: j */
        public float f34366j;

        /* renamed from: k */
        public int f34367k;

        /* renamed from: e */
        public long f34361e = Long.MIN_VALUE;

        /* renamed from: i */
        public long f34365i = -1;

        /* renamed from: f */
        public long f34362f = 0;

        /* renamed from: g */
        public int f34363g = 0;

        /* renamed from: h */
        public int f34364h = 0;

        /* renamed from: a */
        public void m56559a() {
            if (this.f34362f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float m56553g = m56553g(m56555e(currentAnimationTimeMillis));
                this.f34362f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f34362f)) * m56553g;
                this.f34363g = (int) (this.f34359c * f);
                this.f34364h = (int) (f * this.f34360d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int m56558b() {
            return this.f34363g;
        }

        /* renamed from: c */
        public int m56557c() {
            return this.f34364h;
        }

        /* renamed from: d */
        public int m56556d() {
            float f = this.f34359c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public final float m56555e(long j) {
            long j2 = this.f34361e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f34365i;
            if (j3 >= 0 && j >= j3) {
                float f = this.f34366j;
                return (1.0f - f) + (f * AutoScrollHelper.m56566c(((float) (j - j3)) / this.f34367k, 0.0f, 1.0f));
            }
            return AutoScrollHelper.m56566c(((float) (j - j2)) / this.f34357a, 0.0f, 1.0f) * 0.5f;
        }

        /* renamed from: f */
        public int m56554f() {
            float f = this.f34360d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: g */
        public final float m56553g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: h */
        public boolean m56552h() {
            if (this.f34365i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f34365i + this.f34367k) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public void m56551i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f34367k = AutoScrollHelper.m56565d((int) (currentAnimationTimeMillis - this.f34361e), 0, this.f34358b);
            this.f34366j = m56555e(currentAnimationTimeMillis);
            this.f34365i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m56550j(int i) {
            this.f34358b = i;
        }

        /* renamed from: k */
        public void m56549k(int i) {
            this.f34357a = i;
        }

        /* renamed from: l */
        public void m56548l(float f, float f2) {
            this.f34359c = f;
            this.f34360d = f2;
        }

        /* renamed from: m */
        public void m56547m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f34361e = currentAnimationTimeMillis;
            this.f34365i = -1L;
            this.f34362f = currentAnimationTimeMillis;
            this.f34366j = 0.5f;
            this.f34363g = 0;
            this.f34364h = 0;
        }
    }

    /* renamed from: androidx.core.widget.AutoScrollHelper$b */
    /* loaded from: classes2.dex */
    public class RunnableC4210b implements Runnable {
        public RunnableC4210b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (!autoScrollHelper.f34354o) {
                return;
            }
            if (autoScrollHelper.f34352m) {
                autoScrollHelper.f34352m = false;
                autoScrollHelper.f34340a.m56547m();
            }
            C4209a c4209a = AutoScrollHelper.this.f34340a;
            if (!c4209a.m56552h() && AutoScrollHelper.this.m56561h()) {
                AutoScrollHelper autoScrollHelper2 = AutoScrollHelper.this;
                if (autoScrollHelper2.f34353n) {
                    autoScrollHelper2.f34353n = false;
                    autoScrollHelper2.m56568a();
                }
                c4209a.m56559a();
                AutoScrollHelper.this.scrollTargetBy(c4209a.m56558b(), c4209a.m56557c());
                ViewCompat.postOnAnimation(AutoScrollHelper.this.f34342c, this);
                return;
            }
            AutoScrollHelper.this.f34354o = false;
        }
    }

    public AutoScrollHelper(@NonNull View view) {
        this.f34342c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        setMaximumVelocity(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        setMinimumVelocity(f3, f3);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(f34339r);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    /* renamed from: c */
    public static float m56566c(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: d */
    public static int m56565d(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public void m56568a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f34342c.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: b */
    public final float m56567b(int i, float f, float f2, float f3) {
        float m56563f = m56563f(this.f34344e[i], f2, this.f34345f[i], f);
        int i2 = (m56563f > 0.0f ? 1 : (m56563f == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f34348i[i];
        float f5 = this.f34349j[i];
        float f6 = this.f34350k[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m56566c(m56563f * f7, f5, f6);
        }
        return -m56566c((-m56563f) * f7, f5, f6);
    }

    public abstract boolean canTargetScrollHorizontally(int i);

    public abstract boolean canTargetScrollVertically(int i);

    /* renamed from: e */
    public final float m56564e(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f34346g;
        if (i != 0 && i != 1) {
            if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        } else if (f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.f34354o && i == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final float m56563f(float f, float f2, float f3, float f4) {
        float interpolation;
        float m56566c = m56566c(f * f2, 0.0f, f3);
        float m56564e = m56564e(f2 - f4, m56566c) - m56564e(f4, m56566c);
        if (m56564e < 0.0f) {
            interpolation = -this.f34341b.getInterpolation(-m56564e);
        } else if (m56564e <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f34341b.getInterpolation(m56564e);
        }
        return m56566c(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: g */
    public final void m56562g() {
        if (this.f34352m) {
            this.f34354o = false;
        } else {
            this.f34340a.m56551i();
        }
    }

    /* renamed from: h */
    public boolean m56561h() {
        C4209a c4209a = this.f34340a;
        int m56554f = c4209a.m56554f();
        int m56556d = c4209a.m56556d();
        if ((m56554f != 0 && canTargetScrollVertically(m56554f)) || (m56556d != 0 && canTargetScrollHorizontally(m56556d))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m56560i() {
        int i;
        if (this.f34343d == null) {
            this.f34343d = new RunnableC4210b();
        }
        this.f34354o = true;
        this.f34352m = true;
        if (!this.f34351l && (i = this.f34347h) > 0) {
            ViewCompat.postOnAnimationDelayed(this.f34342c, this.f34343d, i);
        } else {
            this.f34343d.run();
        }
        this.f34351l = true;
    }

    public boolean isEnabled() {
        return this.f34355p;
    }

    public boolean isExclusive() {
        return this.f34356q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f34355p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m56562g()
            goto L58
        L1a:
            r5.f34353n = r2
            r5.f34351l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f34342c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m56567b(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f34342c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m56567b(r2, r7, r6, r3)
            androidx.core.widget.AutoScrollHelper$a r7 = r5.f34340a
            r7.m56548l(r0, r6)
            boolean r6 = r5.f34354o
            if (r6 != 0) goto L58
            boolean r6 = r5.m56561h()
            if (r6 == 0) goto L58
            r5.m56560i()
        L58:
            boolean r6 = r5.f34356q
            if (r6 == 0) goto L61
            boolean r6 = r5.f34354o
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void scrollTargetBy(int i, int i2);

    @NonNull
    public AutoScrollHelper setActivationDelay(int i) {
        this.f34347h = i;
        return this;
    }

    @NonNull
    public AutoScrollHelper setEdgeType(int i) {
        this.f34346g = i;
        return this;
    }

    public AutoScrollHelper setEnabled(boolean z) {
        if (this.f34355p && !z) {
            m56562g();
        }
        this.f34355p = z;
        return this;
    }

    public AutoScrollHelper setExclusive(boolean z) {
        this.f34356q = z;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumEdges(float f, float f2) {
        float[] fArr = this.f34345f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumVelocity(float f, float f2) {
        float[] fArr = this.f34350k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMinimumVelocity(float f, float f2) {
        float[] fArr = this.f34349j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampDownDuration(int i) {
        this.f34340a.m56550j(i);
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampUpDuration(int i) {
        this.f34340a.m56549k(i);
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeEdges(float f, float f2) {
        float[] fArr = this.f34344e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeVelocity(float f, float f2) {
        float[] fArr = this.f34348i;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }
}
