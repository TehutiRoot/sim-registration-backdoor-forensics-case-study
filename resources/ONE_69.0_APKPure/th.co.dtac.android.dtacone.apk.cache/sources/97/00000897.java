package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.github.barteksc.pdfviewer.PDFView;

/* renamed from: J4 */
/* loaded from: classes3.dex */
public class C0630J4 {

    /* renamed from: a */
    public PDFView f2899a;

    /* renamed from: b */
    public ValueAnimator f2900b;

    /* renamed from: c */
    public OverScroller f2901c;

    /* renamed from: d */
    public boolean f2902d = false;

    /* renamed from: e */
    public boolean f2903e = false;

    /* renamed from: J4$a */
    /* loaded from: classes3.dex */
    public class C0631a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public C0631a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C0630J4.this.f2899a.loadPages();
            C0630J4.this.f2903e = false;
            C0630J4.this.m67933e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0630J4.this.f2899a.loadPages();
            C0630J4.this.f2903e = false;
            C0630J4.this.m67933e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C0630J4.this.f2899a.moveTo(((Float) valueAnimator.getAnimatedValue()).floatValue(), C0630J4.this.f2899a.getCurrentYOffset());
            C0630J4.this.f2899a.m49308w();
        }
    }

    /* renamed from: J4$b */
    /* loaded from: classes3.dex */
    public class C0632b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public C0632b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C0630J4.this.f2899a.loadPages();
            C0630J4.this.f2903e = false;
            C0630J4.this.m67933e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0630J4.this.f2899a.loadPages();
            C0630J4.this.f2903e = false;
            C0630J4.this.m67933e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C0630J4.this.f2899a.moveTo(C0630J4.this.f2899a.getCurrentXOffset(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            C0630J4.this.f2899a.m49308w();
        }
    }

    public C0630J4(PDFView pDFView) {
        this.f2899a = pDFView;
        this.f2901c = new OverScroller(pDFView.getContext());
    }

    /* renamed from: d */
    public void m67934d() {
        if (this.f2901c.computeScrollOffset()) {
            this.f2899a.moveTo(this.f2901c.getCurrX(), this.f2901c.getCurrY());
            this.f2899a.m49308w();
        } else if (this.f2902d) {
            this.f2902d = false;
            this.f2899a.loadPages();
            m67933e();
            this.f2899a.performPageSnap();
        }
    }

    /* renamed from: e */
    public final void m67933e() {
        if (this.f2899a.getScrollHandle() != null) {
            this.f2899a.getScrollHandle().hideDelayed();
        }
    }

    /* renamed from: f */
    public boolean m67932f() {
        if (!this.f2902d && !this.f2903e) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void m67931g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m67926l();
        this.f2902d = true;
        this.f2901c.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: h */
    public void m67930h(float f) {
        if (this.f2899a.isSwipeVertical()) {
            m67928j(this.f2899a.getCurrentYOffset(), f);
        } else {
            m67929i(this.f2899a.getCurrentXOffset(), f);
        }
        this.f2903e = true;
    }

    /* renamed from: i */
    public void m67929i(float f, float f2) {
        m67926l();
        this.f2900b = ValueAnimator.ofFloat(f, f2);
        C0631a c0631a = new C0631a();
        this.f2900b.setInterpolator(new DecelerateInterpolator());
        this.f2900b.addUpdateListener(c0631a);
        this.f2900b.addListener(c0631a);
        this.f2900b.setDuration(400L);
        this.f2900b.start();
    }

    /* renamed from: j */
    public void m67928j(float f, float f2) {
        m67926l();
        this.f2900b = ValueAnimator.ofFloat(f, f2);
        C0632b c0632b = new C0632b();
        this.f2900b.setInterpolator(new DecelerateInterpolator());
        this.f2900b.addUpdateListener(c0632b);
        this.f2900b.addListener(c0632b);
        this.f2900b.setDuration(400L);
        this.f2900b.start();
    }

    /* renamed from: k */
    public void m67927k(float f, float f2, float f3, float f4) {
        m67926l();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f4);
        this.f2900b = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        C0633c c0633c = new C0633c(f, f2);
        this.f2900b.addUpdateListener(c0633c);
        this.f2900b.addListener(c0633c);
        this.f2900b.setDuration(400L);
        this.f2900b.start();
    }

    /* renamed from: l */
    public void m67926l() {
        ValueAnimator valueAnimator = this.f2900b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2900b = null;
        }
        m67925m();
    }

    /* renamed from: m */
    public void m67925m() {
        this.f2902d = false;
        this.f2901c.forceFinished(true);
    }

    /* renamed from: J4$c */
    /* loaded from: classes3.dex */
    public class C0633c implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* renamed from: a */
        public final float f2906a;

        /* renamed from: b */
        public final float f2907b;

        public C0633c(float f, float f2) {
            this.f2906a = f;
            this.f2907b = f2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C0630J4.this.f2899a.loadPages();
            C0630J4.this.m67933e();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0630J4.this.f2899a.loadPages();
            C0630J4.this.f2899a.performPageSnap();
            C0630J4.this.m67933e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C0630J4.this.f2899a.zoomCenteredTo(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f2906a, this.f2907b));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}