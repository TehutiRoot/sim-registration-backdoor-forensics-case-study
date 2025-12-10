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
public class C4936d extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {

    /* renamed from: D */
    public static final int[] f37225D = {16842919};

    /* renamed from: E */
    public static final int[] f37226E = new int[0];

    /* renamed from: A */
    public int f37227A;

    /* renamed from: B */
    public final Runnable f37228B;

    /* renamed from: C */
    public final RecyclerView.OnScrollListener f37229C;

    /* renamed from: a */
    public final int f37230a;

    /* renamed from: b */
    public final int f37231b;

    /* renamed from: c */
    public final StateListDrawable f37232c;

    /* renamed from: d */
    public final Drawable f37233d;

    /* renamed from: e */
    public final int f37234e;

    /* renamed from: f */
    public final int f37235f;

    /* renamed from: g */
    public final StateListDrawable f37236g;

    /* renamed from: h */
    public final Drawable f37237h;

    /* renamed from: i */
    public final int f37238i;

    /* renamed from: j */
    public final int f37239j;

    /* renamed from: k */
    public int f37240k;

    /* renamed from: l */
    public int f37241l;

    /* renamed from: m */
    public float f37242m;

    /* renamed from: n */
    public int f37243n;

    /* renamed from: o */
    public int f37244o;

    /* renamed from: p */
    public float f37245p;

    /* renamed from: s */
    public RecyclerView f37248s;

    /* renamed from: z */
    public final ValueAnimator f37255z;

    /* renamed from: q */
    public int f37246q = 0;

    /* renamed from: r */
    public int f37247r = 0;

    /* renamed from: t */
    public boolean f37249t = false;

    /* renamed from: u */
    public boolean f37250u = false;

    /* renamed from: v */
    public int f37251v = 0;

    /* renamed from: w */
    public int f37252w = 0;

    /* renamed from: x */
    public final int[] f37253x = new int[2];

    /* renamed from: y */
    public final int[] f37254y = new int[2];

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes2.dex */
    public class RunnableC4937a implements Runnable {
        public RunnableC4937a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4936d.this.m52983g(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes2.dex */
    public class C4938b extends RecyclerView.OnScrollListener {
        public C4938b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C4936d.this.m52972r(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes2.dex */
    public class C4939c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f37258a = false;

        public C4939c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f37258a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f37258a) {
                this.f37258a = false;
            } else if (((Float) C4936d.this.f37255z.getAnimatedValue()).floatValue() == 0.0f) {
                C4936d c4936d = C4936d.this;
                c4936d.f37227A = 0;
                c4936d.m52975o(0);
            } else {
                C4936d c4936d2 = C4936d.this;
                c4936d2.f37227A = 2;
                c4936d2.m52978l();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: classes2.dex */
    public class C4940d implements ValueAnimator.AnimatorUpdateListener {
        public C4940d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C4936d.this.f37232c.setAlpha(floatValue);
            C4936d.this.f37233d.setAlpha(floatValue);
            C4936d.this.m52978l();
        }
    }

    public C4936d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f37255z = ofFloat;
        this.f37227A = 0;
        this.f37228B = new RunnableC4937a();
        this.f37229C = new C4938b();
        this.f37232c = stateListDrawable;
        this.f37233d = drawable;
        this.f37236g = stateListDrawable2;
        this.f37237h = drawable2;
        this.f37234e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f37235f = Math.max(i, drawable.getIntrinsicWidth());
        this.f37238i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f37239j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f37230a = i2;
        this.f37231b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C4939c());
        ofFloat.addUpdateListener(new C4940d());
        attachToRecyclerView(recyclerView);
    }

    /* renamed from: a */
    public final void m52989a() {
        this.f37248s.removeCallbacks(this.f37228B);
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f37248s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m52988b();
        }
        this.f37248s = recyclerView;
        if (recyclerView != null) {
            m52974p();
        }
    }

    /* renamed from: b */
    public final void m52988b() {
        this.f37248s.removeItemDecoration(this);
        this.f37248s.removeOnItemTouchListener(this);
        this.f37248s.removeOnScrollListener(this.f37229C);
        m52989a();
    }

    /* renamed from: c */
    public final void m52987c(Canvas canvas) {
        int i = this.f37247r;
        int i2 = this.f37238i;
        int i3 = i - i2;
        int i4 = this.f37244o;
        int i5 = this.f37243n;
        int i6 = i4 - (i5 / 2);
        this.f37236g.setBounds(0, 0, i5, i2);
        this.f37237h.setBounds(0, 0, this.f37246q, this.f37239j);
        canvas.translate(0.0f, i3);
        this.f37237h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f37236g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    /* renamed from: d */
    public final void m52986d(Canvas canvas) {
        int i = this.f37246q;
        int i2 = this.f37234e;
        int i3 = i - i2;
        int i4 = this.f37241l;
        int i5 = this.f37240k;
        int i6 = i4 - (i5 / 2);
        this.f37232c.setBounds(0, 0, i2, i5);
        this.f37233d.setBounds(0, 0, this.f37235f, this.f37247r);
        if (m52981i()) {
            this.f37233d.draw(canvas);
            canvas.translate(this.f37234e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f37232c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f37234e, -i6);
            return;
        }
        canvas.translate(i3, 0.0f);
        this.f37233d.draw(canvas);
        canvas.translate(0.0f, i6);
        this.f37232c.draw(canvas);
        canvas.translate(-i3, -i6);
    }

    /* renamed from: e */
    public final int[] m52985e() {
        int[] iArr = this.f37254y;
        int i = this.f37231b;
        iArr[0] = i;
        iArr[1] = this.f37246q - i;
        return iArr;
    }

    /* renamed from: f */
    public final int[] m52984f() {
        int[] iArr = this.f37253x;
        int i = this.f37231b;
        iArr[0] = i;
        iArr[1] = this.f37247r - i;
        return iArr;
    }

    /* renamed from: g */
    public void m52983g(int i) {
        int i2 = this.f37227A;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
        } else {
            this.f37255z.cancel();
        }
        this.f37227A = 3;
        ValueAnimator valueAnimator = this.f37255z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f37255z.setDuration(i);
        this.f37255z.start();
    }

    /* renamed from: h */
    public final void m52982h(float f) {
        int[] m52985e = m52985e();
        float max = Math.max(m52985e[0], Math.min(m52985e[1], f));
        if (Math.abs(this.f37244o - max) < 2.0f) {
            return;
        }
        int m52976n = m52976n(this.f37245p, max, m52985e, this.f37248s.computeHorizontalScrollRange(), this.f37248s.computeHorizontalScrollOffset(), this.f37246q);
        if (m52976n != 0) {
            this.f37248s.scrollBy(m52976n, 0);
        }
        this.f37245p = max;
    }

    /* renamed from: i */
    public final boolean m52981i() {
        if (ViewCompat.getLayoutDirection(this.f37248s) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m52980j(float f, float f2) {
        if (f2 >= this.f37247r - this.f37238i) {
            int i = this.f37244o;
            int i2 = this.f37243n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public boolean m52979k(float f, float f2) {
        if (!m52981i() ? f >= this.f37246q - this.f37234e : f <= this.f37234e) {
            int i = this.f37241l;
            int i2 = this.f37240k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public void m52978l() {
        this.f37248s.invalidate();
    }

    /* renamed from: m */
    public final void m52977m(int i) {
        m52989a();
        this.f37248s.postDelayed(this.f37228B, i);
    }

    /* renamed from: n */
    public final int m52976n(float f, float f2, int[] iArr, int i, int i2, int i3) {
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
    public void m52975o(int i) {
        if (i == 2 && this.f37251v != 2) {
            this.f37232c.setState(f37225D);
            m52989a();
        }
        if (i == 0) {
            m52978l();
        } else {
            m52973q();
        }
        if (this.f37251v == 2 && i != 2) {
            this.f37232c.setState(f37226E);
            m52977m(BasicMarqueeKt.f12882b);
        } else if (i == 1) {
            m52977m(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f37251v = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f37246q == this.f37248s.getWidth() && this.f37247r == this.f37248s.getHeight()) {
            if (this.f37227A != 0) {
                if (this.f37249t) {
                    m52986d(canvas);
                }
                if (this.f37250u) {
                    m52987c(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f37246q = this.f37248s.getWidth();
        this.f37247r = this.f37248s.getHeight();
        m52975o(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f37251v;
        if (i == 1) {
            boolean m52979k = m52979k(motionEvent.getX(), motionEvent.getY());
            boolean m52980j = m52980j(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m52979k && !m52980j) {
                return false;
            }
            if (m52980j) {
                this.f37252w = 1;
                this.f37245p = (int) motionEvent.getX();
            } else if (m52979k) {
                this.f37252w = 2;
                this.f37242m = (int) motionEvent.getY();
            }
            m52975o(2);
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
        if (this.f37251v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m52979k = m52979k(motionEvent.getX(), motionEvent.getY());
            boolean m52980j = m52980j(motionEvent.getX(), motionEvent.getY());
            if (m52979k || m52980j) {
                if (m52980j) {
                    this.f37252w = 1;
                    this.f37245p = (int) motionEvent.getX();
                } else if (m52979k) {
                    this.f37252w = 2;
                    this.f37242m = (int) motionEvent.getY();
                }
                m52975o(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f37251v == 2) {
            this.f37242m = 0.0f;
            this.f37245p = 0.0f;
            m52975o(1);
            this.f37252w = 0;
        } else if (motionEvent.getAction() == 2 && this.f37251v == 2) {
            m52973q();
            if (this.f37252w == 1) {
                m52982h(motionEvent.getX());
            }
            if (this.f37252w == 2) {
                m52971s(motionEvent.getY());
            }
        }
    }

    /* renamed from: p */
    public final void m52974p() {
        this.f37248s.addItemDecoration(this);
        this.f37248s.addOnItemTouchListener(this);
        this.f37248s.addOnScrollListener(this.f37229C);
    }

    /* renamed from: q */
    public void m52973q() {
        int i = this.f37227A;
        if (i != 0) {
            if (i == 3) {
                this.f37255z.cancel();
            } else {
                return;
            }
        }
        this.f37227A = 1;
        ValueAnimator valueAnimator = this.f37255z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f37255z.setDuration(500L);
        this.f37255z.setStartDelay(0L);
        this.f37255z.start();
    }

    /* renamed from: r */
    public void m52972r(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.f37248s.computeVerticalScrollRange();
        int i3 = this.f37247r;
        if (computeVerticalScrollRange - i3 > 0 && i3 >= this.f37230a) {
            z = true;
        } else {
            z = false;
        }
        this.f37249t = z;
        int computeHorizontalScrollRange = this.f37248s.computeHorizontalScrollRange();
        int i4 = this.f37246q;
        if (computeHorizontalScrollRange - i4 > 0 && i4 >= this.f37230a) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f37250u = z2;
        boolean z3 = this.f37249t;
        if (!z3 && !z2) {
            if (this.f37251v != 0) {
                m52975o(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i3;
            this.f37241l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.f37240k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.f37250u) {
            float f2 = i4;
            this.f37244o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.f37243n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.f37251v;
        if (i5 == 0 || i5 == 1) {
            m52975o(1);
        }
    }

    /* renamed from: s */
    public final void m52971s(float f) {
        int[] m52984f = m52984f();
        float max = Math.max(m52984f[0], Math.min(m52984f[1], f));
        if (Math.abs(this.f37241l - max) < 2.0f) {
            return;
        }
        int m52976n = m52976n(this.f37242m, max, m52984f, this.f37248s.computeVerticalScrollRange(), this.f37248s.computeVerticalScrollOffset(), this.f37247r);
        if (m52976n != 0) {
            this.f37248s.scrollBy(0, m52976n);
        }
        this.f37242m = max;
    }
}