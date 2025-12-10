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
    public static final int f34427r = ViewConfiguration.getTapTimeout();

    /* renamed from: c */
    public final View f34430c;

    /* renamed from: d */
    public Runnable f34431d;

    /* renamed from: g */
    public int f34434g;

    /* renamed from: h */
    public int f34435h;

    /* renamed from: l */
    public boolean f34439l;

    /* renamed from: m */
    public boolean f34440m;

    /* renamed from: n */
    public boolean f34441n;

    /* renamed from: o */
    public boolean f34442o;

    /* renamed from: p */
    public boolean f34443p;

    /* renamed from: q */
    public boolean f34444q;

    /* renamed from: a */
    public final C4191a f34428a = new C4191a();

    /* renamed from: b */
    public final Interpolator f34429b = new AccelerateInterpolator();

    /* renamed from: e */
    public float[] f34432e = {0.0f, 0.0f};

    /* renamed from: f */
    public float[] f34433f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i */
    public float[] f34436i = {0.0f, 0.0f};

    /* renamed from: j */
    public float[] f34437j = {0.0f, 0.0f};

    /* renamed from: k */
    public float[] f34438k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.AutoScrollHelper$a */
    /* loaded from: classes2.dex */
    public static class C4191a {

        /* renamed from: a */
        public int f34445a;

        /* renamed from: b */
        public int f34446b;

        /* renamed from: c */
        public float f34447c;

        /* renamed from: d */
        public float f34448d;

        /* renamed from: j */
        public float f34454j;

        /* renamed from: k */
        public int f34455k;

        /* renamed from: e */
        public long f34449e = Long.MIN_VALUE;

        /* renamed from: i */
        public long f34453i = -1;

        /* renamed from: f */
        public long f34450f = 0;

        /* renamed from: g */
        public int f34451g = 0;

        /* renamed from: h */
        public int f34452h = 0;

        /* renamed from: a */
        public void m56509a() {
            if (this.f34450f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float m56503g = m56503g(m56505e(currentAnimationTimeMillis));
                this.f34450f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f34450f)) * m56503g;
                this.f34451g = (int) (this.f34447c * f);
                this.f34452h = (int) (f * this.f34448d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int m56508b() {
            return this.f34451g;
        }

        /* renamed from: c */
        public int m56507c() {
            return this.f34452h;
        }

        /* renamed from: d */
        public int m56506d() {
            float f = this.f34447c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public final float m56505e(long j) {
            long j2 = this.f34449e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f34453i;
            if (j3 >= 0 && j >= j3) {
                float f = this.f34454j;
                return (1.0f - f) + (f * AutoScrollHelper.m56516c(((float) (j - j3)) / this.f34455k, 0.0f, 1.0f));
            }
            return AutoScrollHelper.m56516c(((float) (j - j2)) / this.f34445a, 0.0f, 1.0f) * 0.5f;
        }

        /* renamed from: f */
        public int m56504f() {
            float f = this.f34448d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: g */
        public final float m56503g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: h */
        public boolean m56502h() {
            if (this.f34453i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f34453i + this.f34455k) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public void m56501i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f34455k = AutoScrollHelper.m56515d((int) (currentAnimationTimeMillis - this.f34449e), 0, this.f34446b);
            this.f34454j = m56505e(currentAnimationTimeMillis);
            this.f34453i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m56500j(int i) {
            this.f34446b = i;
        }

        /* renamed from: k */
        public void m56499k(int i) {
            this.f34445a = i;
        }

        /* renamed from: l */
        public void m56498l(float f, float f2) {
            this.f34447c = f;
            this.f34448d = f2;
        }

        /* renamed from: m */
        public void m56497m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f34449e = currentAnimationTimeMillis;
            this.f34453i = -1L;
            this.f34450f = currentAnimationTimeMillis;
            this.f34454j = 0.5f;
            this.f34451g = 0;
            this.f34452h = 0;
        }
    }

    /* renamed from: androidx.core.widget.AutoScrollHelper$b */
    /* loaded from: classes2.dex */
    public class RunnableC4192b implements Runnable {
        public RunnableC4192b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (!autoScrollHelper.f34442o) {
                return;
            }
            if (autoScrollHelper.f34440m) {
                autoScrollHelper.f34440m = false;
                autoScrollHelper.f34428a.m56497m();
            }
            C4191a c4191a = AutoScrollHelper.this.f34428a;
            if (!c4191a.m56502h() && AutoScrollHelper.this.m56511h()) {
                AutoScrollHelper autoScrollHelper2 = AutoScrollHelper.this;
                if (autoScrollHelper2.f34441n) {
                    autoScrollHelper2.f34441n = false;
                    autoScrollHelper2.m56518a();
                }
                c4191a.m56509a();
                AutoScrollHelper.this.scrollTargetBy(c4191a.m56508b(), c4191a.m56507c());
                ViewCompat.postOnAnimation(AutoScrollHelper.this.f34430c, this);
                return;
            }
            AutoScrollHelper.this.f34442o = false;
        }
    }

    public AutoScrollHelper(@NonNull View view) {
        this.f34430c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        setMaximumVelocity(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        setMinimumVelocity(f3, f3);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(f34427r);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    /* renamed from: c */
    public static float m56516c(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: d */
    public static int m56515d(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public void m56518a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f34430c.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: b */
    public final float m56517b(int i, float f, float f2, float f3) {
        float m56513f = m56513f(this.f34432e[i], f2, this.f34433f[i], f);
        int i2 = (m56513f > 0.0f ? 1 : (m56513f == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f34436i[i];
        float f5 = this.f34437j[i];
        float f6 = this.f34438k[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m56516c(m56513f * f7, f5, f6);
        }
        return -m56516c((-m56513f) * f7, f5, f6);
    }

    public abstract boolean canTargetScrollHorizontally(int i);

    public abstract boolean canTargetScrollVertically(int i);

    /* renamed from: e */
    public final float m56514e(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f34434g;
        if (i != 0 && i != 1) {
            if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        } else if (f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.f34442o && i == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final float m56513f(float f, float f2, float f3, float f4) {
        float interpolation;
        float m56516c = m56516c(f * f2, 0.0f, f3);
        float m56514e = m56514e(f2 - f4, m56516c) - m56514e(f4, m56516c);
        if (m56514e < 0.0f) {
            interpolation = -this.f34429b.getInterpolation(-m56514e);
        } else if (m56514e <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f34429b.getInterpolation(m56514e);
        }
        return m56516c(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: g */
    public final void m56512g() {
        if (this.f34440m) {
            this.f34442o = false;
        } else {
            this.f34428a.m56501i();
        }
    }

    /* renamed from: h */
    public boolean m56511h() {
        C4191a c4191a = this.f34428a;
        int m56504f = c4191a.m56504f();
        int m56506d = c4191a.m56506d();
        if ((m56504f != 0 && canTargetScrollVertically(m56504f)) || (m56506d != 0 && canTargetScrollHorizontally(m56506d))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m56510i() {
        int i;
        if (this.f34431d == null) {
            this.f34431d = new RunnableC4192b();
        }
        this.f34442o = true;
        this.f34440m = true;
        if (!this.f34439l && (i = this.f34435h) > 0) {
            ViewCompat.postOnAnimationDelayed(this.f34430c, this.f34431d, i);
        } else {
            this.f34431d.run();
        }
        this.f34439l = true;
    }

    public boolean isEnabled() {
        return this.f34443p;
    }

    public boolean isExclusive() {
        return this.f34444q;
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
            boolean r0 = r5.f34443p
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
            r5.m56512g()
            goto L58
        L1a:
            r5.f34441n = r2
            r5.f34439l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f34430c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m56517b(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f34430c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m56517b(r2, r7, r6, r3)
            androidx.core.widget.AutoScrollHelper$a r7 = r5.f34428a
            r7.m56498l(r0, r6)
            boolean r6 = r5.f34442o
            if (r6 != 0) goto L58
            boolean r6 = r5.m56511h()
            if (r6 == 0) goto L58
            r5.m56510i()
        L58:
            boolean r6 = r5.f34444q
            if (r6 == 0) goto L61
            boolean r6 = r5.f34442o
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
        this.f34435h = i;
        return this;
    }

    @NonNull
    public AutoScrollHelper setEdgeType(int i) {
        this.f34434g = i;
        return this;
    }

    public AutoScrollHelper setEnabled(boolean z) {
        if (this.f34443p && !z) {
            m56512g();
        }
        this.f34443p = z;
        return this;
    }

    public AutoScrollHelper setExclusive(boolean z) {
        this.f34444q = z;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumEdges(float f, float f2) {
        float[] fArr = this.f34433f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumVelocity(float f, float f2) {
        float[] fArr = this.f34438k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMinimumVelocity(float f, float f2) {
        float[] fArr = this.f34437j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampDownDuration(int i) {
        this.f34428a.m56500j(i);
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampUpDuration(int i) {
        this.f34428a.m56499k(i);
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeEdges(float f, float f2) {
        float[] fArr = this.f34432e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeVelocity(float f, float f2) {
        float[] fArr = this.f34436i;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }
}