package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.compose.foundation.BasicMarqueeKt;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes2.dex */
public class C4954d extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {

    /* renamed from: D */
    public static final int[] f37137D = {16842919};

    /* renamed from: E */
    public static final int[] f37138E = new int[0];

    /* renamed from: A */
    public int f37139A;

    /* renamed from: B */
    public final Runnable f37140B;

    /* renamed from: C */
    public final RecyclerView.OnScrollListener f37141C;

    /* renamed from: a */
    public final int f37142a;

    /* renamed from: b */
    public final int f37143b;

    /* renamed from: c */
    public final StateListDrawable f37144c;

    /* renamed from: d */
    public final Drawable f37145d;

    /* renamed from: e */
    public final int f37146e;

    /* renamed from: f */
    public final int f37147f;

    /* renamed from: g */
    public final StateListDrawable f37148g;

    /* renamed from: h */
    public final Drawable f37149h;

    /* renamed from: i */
    public final int f37150i;

    /* renamed from: j */
    public final int f37151j;

    /* renamed from: k */
    public int f37152k;

    /* renamed from: l */
    public int f37153l;

    /* renamed from: m */
    public float f37154m;

    /* renamed from: n */
    public int f37155n;

    /* renamed from: o */
    public int f37156o;

    /* renamed from: p */
    public float f37157p;

    /* renamed from: s */
    public RecyclerView f37160s;

    /* renamed from: z */
    public final ValueAnimator f37167z;

    /* renamed from: q */
    public int f37158q = 0;

    /* renamed from: r */
    public int f37159r = 0;

    /* renamed from: t */
    public boolean f37161t = false;

    /* renamed from: u */
    public boolean f37162u = false;

    /* renamed from: v */
    public int f37163v = 0;

    /* renamed from: w */
    public int f37164w = 0;

    /* renamed from: x */
    public final int[] f37165x = new int[2];

    /* renamed from: y */
    public final int[] f37166y = new int[2];

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes2.dex */
    public class RunnableC4955a implements Runnable {
        public RunnableC4955a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4954d.this.m53032g(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes2.dex */
    public class C4956b extends RecyclerView.OnScrollListener {
        public C4956b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C4954d.this.m53021r(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes2.dex */
    public class C4957c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f37170a = false;

        public C4957c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f37170a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f37170a) {
                this.f37170a = false;
            } else if (((Float) C4954d.this.f37167z.getAnimatedValue()).floatValue() == 0.0f) {
                C4954d c4954d = C4954d.this;
                c4954d.f37139A = 0;
                c4954d.m53024o(0);
            } else {
                C4954d c4954d2 = C4954d.this;
                c4954d2.f37139A = 2;
                c4954d2.m53027l();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: classes2.dex */
    public class C4958d implements ValueAnimator.AnimatorUpdateListener {
        public C4958d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C4954d.this.f37144c.setAlpha(floatValue);
            C4954d.this.f37145d.setAlpha(floatValue);
            C4954d.this.m53027l();
        }
    }

    public C4954d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f37167z = ofFloat;
        this.f37139A = 0;
        this.f37140B = new RunnableC4955a();
        this.f37141C = new C4956b();
        this.f37144c = stateListDrawable;
        this.f37145d = drawable;
        this.f37148g = stateListDrawable2;
        this.f37149h = drawable2;
        this.f37146e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f37147f = Math.max(i, drawable.getIntrinsicWidth());
        this.f37150i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f37151j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f37142a = i2;
        this.f37143b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C4957c());
        ofFloat.addUpdateListener(new C4958d());
        attachToRecyclerView(recyclerView);
    }

    /* renamed from: a */
    public final void m53038a() {
        this.f37160s.removeCallbacks(this.f37140B);
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f37160s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m53037b();
        }
        this.f37160s = recyclerView;
        if (recyclerView != null) {
            m53023p();
        }
    }

    /* renamed from: b */
    public final void m53037b() {
        this.f37160s.removeItemDecoration(this);
        this.f37160s.removeOnItemTouchListener(this);
        this.f37160s.removeOnScrollListener(this.f37141C);
        m53038a();
    }

    /* renamed from: c */
    public final void m53036c(Canvas canvas) {
        int i = this.f37159r;
        int i2 = this.f37150i;
        int i3 = i - i2;
        int i4 = this.f37156o;
        int i5 = this.f37155n;
        int i6 = i4 - (i5 / 2);
        this.f37148g.setBounds(0, 0, i5, i2);
        this.f37149h.setBounds(0, 0, this.f37158q, this.f37151j);
        canvas.translate(0.0f, i3);
        this.f37149h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f37148g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    /* renamed from: d */
    public final void m53035d(Canvas canvas) {
        int i = this.f37158q;
        int i2 = this.f37146e;
        int i3 = i - i2;
        int i4 = this.f37153l;
        int i5 = this.f37152k;
        int i6 = i4 - (i5 / 2);
        this.f37144c.setBounds(0, 0, i2, i5);
        this.f37145d.setBounds(0, 0, this.f37147f, this.f37159r);
        if (m53030i()) {
            this.f37145d.draw(canvas);
            canvas.translate(this.f37146e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f37144c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f37146e, -i6);
            return;
        }
        canvas.translate(i3, 0.0f);
        this.f37145d.draw(canvas);
        canvas.translate(0.0f, i6);
        this.f37144c.draw(canvas);
        canvas.translate(-i3, -i6);
    }

    /* renamed from: e */
    public final int[] m53034e() {
        int[] iArr = this.f37166y;
        int i = this.f37143b;
        iArr[0] = i;
        iArr[1] = this.f37158q - i;
        return iArr;
    }

    /* renamed from: f */
    public final int[] m53033f() {
        int[] iArr = this.f37165x;
        int i = this.f37143b;
        iArr[0] = i;
        iArr[1] = this.f37159r - i;
        return iArr;
    }

    /* renamed from: g */
    public void m53032g(int i) {
        int i2 = this.f37139A;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
        } else {
            this.f37167z.cancel();
        }
        this.f37139A = 3;
        ValueAnimator valueAnimator = this.f37167z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f37167z.setDuration(i);
        this.f37167z.start();
    }

    /* renamed from: h */
    public final void m53031h(float f) {
        int[] m53034e = m53034e();
        float max = Math.max(m53034e[0], Math.min(m53034e[1], f));
        if (Math.abs(this.f37156o - max) < 2.0f) {
            return;
        }
        int m53025n = m53025n(this.f37157p, max, m53034e, this.f37160s.computeHorizontalScrollRange(), this.f37160s.computeHorizontalScrollOffset(), this.f37158q);
        if (m53025n != 0) {
            this.f37160s.scrollBy(m53025n, 0);
        }
        this.f37157p = max;
    }

    /* renamed from: i */
    public final boolean m53030i() {
        if (ViewCompat.getLayoutDirection(this.f37160s) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m53029j(float f, float f2) {
        if (f2 >= this.f37159r - this.f37150i) {
            int i = this.f37156o;
            int i2 = this.f37155n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public boolean m53028k(float f, float f2) {
        if (!m53030i() ? f >= this.f37158q - this.f37146e : f <= this.f37146e) {
            int i = this.f37153l;
            int i2 = this.f37152k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public void m53027l() {
        this.f37160s.invalidate();
    }

    /* renamed from: m */
    public final void m53026m(int i) {
        m53038a();
        this.f37160s.postDelayed(this.f37140B, i);
    }

    /* renamed from: n */
    public final int m53025n(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: o */
    public void m53024o(int i) {
        if (i == 2 && this.f37163v != 2) {
            this.f37144c.setState(f37137D);
            m53038a();
        }
        if (i == 0) {
            m53027l();
        } else {
            m53022q();
        }
        if (this.f37163v == 2 && i != 2) {
            this.f37144c.setState(f37138E);
            m53026m(BasicMarqueeKt.f12794b);
        } else if (i == 1) {
            m53026m(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f37163v = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f37158q == this.f37160s.getWidth() && this.f37159r == this.f37160s.getHeight()) {
            if (this.f37139A != 0) {
                if (this.f37161t) {
                    m53035d(canvas);
                }
                if (this.f37162u) {
                    m53036c(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f37158q = this.f37160s.getWidth();
        this.f37159r = this.f37160s.getHeight();
        m53024o(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f37163v;
        if (i == 1) {
            boolean m53028k = m53028k(motionEvent.getX(), motionEvent.getY());
            boolean m53029j = m53029j(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m53028k && !m53029j) {
                return false;
            }
            if (m53029j) {
                this.f37164w = 1;
                this.f37157p = (int) motionEvent.getX();
            } else if (m53028k) {
                this.f37164w = 2;
                this.f37154m = (int) motionEvent.getY();
            }
            m53024o(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f37163v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m53028k = m53028k(motionEvent.getX(), motionEvent.getY());
            boolean m53029j = m53029j(motionEvent.getX(), motionEvent.getY());
            if (m53028k || m53029j) {
                if (m53029j) {
                    this.f37164w = 1;
                    this.f37157p = (int) motionEvent.getX();
                } else if (m53028k) {
                    this.f37164w = 2;
                    this.f37154m = (int) motionEvent.getY();
                }
                m53024o(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f37163v == 2) {
            this.f37154m = 0.0f;
            this.f37157p = 0.0f;
            m53024o(1);
            this.f37164w = 0;
        } else if (motionEvent.getAction() == 2 && this.f37163v == 2) {
            m53022q();
            if (this.f37164w == 1) {
                m53031h(motionEvent.getX());
            }
            if (this.f37164w == 2) {
                m53020s(motionEvent.getY());
            }
        }
    }

    /* renamed from: p */
    public final void m53023p() {
        this.f37160s.addItemDecoration(this);
        this.f37160s.addOnItemTouchListener(this);
        this.f37160s.addOnScrollListener(this.f37141C);
    }

    /* renamed from: q */
    public void m53022q() {
        int i = this.f37139A;
        if (i != 0) {
            if (i == 3) {
                this.f37167z.cancel();
            } else {
                return;
            }
        }
        this.f37139A = 1;
        ValueAnimator valueAnimator = this.f37167z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f37167z.setDuration(500L);
        this.f37167z.setStartDelay(0L);
        this.f37167z.start();
    }

    /* renamed from: r */
    public void m53021r(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.f37160s.computeVerticalScrollRange();
        int i3 = this.f37159r;
        if (computeVerticalScrollRange - i3 > 0 && i3 >= this.f37142a) {
            z = true;
        } else {
            z = false;
        }
        this.f37161t = z;
        int computeHorizontalScrollRange = this.f37160s.computeHorizontalScrollRange();
        int i4 = this.f37158q;
        if (computeHorizontalScrollRange - i4 > 0 && i4 >= this.f37142a) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f37162u = z2;
        boolean z3 = this.f37161t;
        if (!z3 && !z2) {
            if (this.f37163v != 0) {
                m53024o(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i3;
            this.f37153l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.f37152k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.f37162u) {
            float f2 = i4;
            this.f37156o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.f37155n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.f37163v;
        if (i5 == 0 || i5 == 1) {
            m53024o(1);
        }
    }

    /* renamed from: s */
    public final void m53020s(float f) {
        int[] m53033f = m53033f();
        float max = Math.max(m53033f[0], Math.min(m53033f[1], f));
        if (Math.abs(this.f37153l - max) < 2.0f) {
            return;
        }
        int m53025n = m53025n(this.f37154m, max, m53033f, this.f37160s.computeVerticalScrollRange(), this.f37160s.computeVerticalScrollOffset(), this.f37159r);
        if (m53025n != 0) {
            this.f37160s.scrollBy(0, m53025n);
        }
        this.f37154m = max;
    }
}
