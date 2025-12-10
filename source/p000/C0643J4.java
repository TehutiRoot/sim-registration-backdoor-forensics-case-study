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
public class C0643J4 {

    /* renamed from: a */
    public PDFView f2685a;

    /* renamed from: b */
    public ValueAnimator f2686b;

    /* renamed from: c */
    public OverScroller f2687c;

    /* renamed from: d */
    public boolean f2688d = false;

    /* renamed from: e */
    public boolean f2689e = false;

    /* renamed from: J4$a */
    /* loaded from: classes3.dex */
    public class C0644a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public C0644a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C0643J4.this.f2685a.loadPages();
            C0643J4.this.f2689e = false;
            C0643J4.this.m67810e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0643J4.this.f2685a.loadPages();
            C0643J4.this.f2689e = false;
            C0643J4.this.m67810e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C0643J4.this.f2685a.moveTo(((Float) valueAnimator.getAnimatedValue()).floatValue(), C0643J4.this.f2685a.getCurrentYOffset());
            C0643J4.this.f2685a.m49311w();
        }
    }

    /* renamed from: J4$b */
    /* loaded from: classes3.dex */
    public class C0645b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public C0645b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C0643J4.this.f2685a.loadPages();
            C0643J4.this.f2689e = false;
            C0643J4.this.m67810e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0643J4.this.f2685a.loadPages();
            C0643J4.this.f2689e = false;
            C0643J4.this.m67810e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C0643J4.this.f2685a.moveTo(C0643J4.this.f2685a.getCurrentXOffset(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            C0643J4.this.f2685a.m49311w();
        }
    }

    public C0643J4(PDFView pDFView) {
        this.f2685a = pDFView;
        this.f2687c = new OverScroller(pDFView.getContext());
    }

    /* renamed from: d */
    public void m67811d() {
        if (this.f2687c.computeScrollOffset()) {
            this.f2685a.moveTo(this.f2687c.getCurrX(), this.f2687c.getCurrY());
            this.f2685a.m49311w();
        } else if (this.f2688d) {
            this.f2688d = false;
            this.f2685a.loadPages();
            m67810e();
            this.f2685a.performPageSnap();
        }
    }

    /* renamed from: e */
    public final void m67810e() {
        if (this.f2685a.getScrollHandle() != null) {
            this.f2685a.getScrollHandle().hideDelayed();
        }
    }

    /* renamed from: f */
    public boolean m67809f() {
        if (!this.f2688d && !this.f2689e) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void m67808g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m67803l();
        this.f2688d = true;
        this.f2687c.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: h */
    public void m67807h(float f) {
        if (this.f2685a.isSwipeVertical()) {
            m67805j(this.f2685a.getCurrentYOffset(), f);
        } else {
            m67806i(this.f2685a.getCurrentXOffset(), f);
        }
        this.f2689e = true;
    }

    /* renamed from: i */
    public void m67806i(float f, float f2) {
        m67803l();
        this.f2686b = ValueAnimator.ofFloat(f, f2);
        C0644a c0644a = new C0644a();
        this.f2686b.setInterpolator(new DecelerateInterpolator());
        this.f2686b.addUpdateListener(c0644a);
        this.f2686b.addListener(c0644a);
        this.f2686b.setDuration(400L);
        this.f2686b.start();
    }

    /* renamed from: j */
    public void m67805j(float f, float f2) {
        m67803l();
        this.f2686b = ValueAnimator.ofFloat(f, f2);
        C0645b c0645b = new C0645b();
        this.f2686b.setInterpolator(new DecelerateInterpolator());
        this.f2686b.addUpdateListener(c0645b);
        this.f2686b.addListener(c0645b);
        this.f2686b.setDuration(400L);
        this.f2686b.start();
    }

    /* renamed from: k */
    public void m67804k(float f, float f2, float f3, float f4) {
        m67803l();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f4);
        this.f2686b = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        C0646c c0646c = new C0646c(f, f2);
        this.f2686b.addUpdateListener(c0646c);
        this.f2686b.addListener(c0646c);
        this.f2686b.setDuration(400L);
        this.f2686b.start();
    }

    /* renamed from: l */
    public void m67803l() {
        ValueAnimator valueAnimator = this.f2686b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2686b = null;
        }
        m67802m();
    }

    /* renamed from: m */
    public void m67802m() {
        this.f2688d = false;
        this.f2687c.forceFinished(true);
    }

    /* renamed from: J4$c */
    /* loaded from: classes3.dex */
    public class C0646c implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* renamed from: a */
        public final float f2692a;

        /* renamed from: b */
        public final float f2693b;

        public C0646c(float f, float f2) {
            this.f2692a = f;
            this.f2693b = f2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C0643J4.this.f2685a.loadPages();
            C0643J4.this.m67810e();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0643J4.this.f2685a.loadPages();
            C0643J4.this.f2685a.performPageSnap();
            C0643J4.this.m67810e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C0643J4.this.f2685a.zoomCenteredTo(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f2692a, this.f2693b));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
