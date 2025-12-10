package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* renamed from: Bp */
/* loaded from: classes4.dex */
public final class C0129Bp extends AbstractC19776ee0 {

    /* renamed from: l */
    public static final int[] f538l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    public static final int[] f539m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    public static final int[] f540n = {1000, 2350, 3700, 5050};

    /* renamed from: o */
    public static final Property f541o = new C0132c(Float.class, "animationFraction");

    /* renamed from: p */
    public static final Property f542p = new C0133d(Float.class, "completeEndFraction");

    /* renamed from: d */
    public ObjectAnimator f543d;

    /* renamed from: e */
    public ObjectAnimator f544e;

    /* renamed from: f */
    public final FastOutSlowInInterpolator f545f;

    /* renamed from: g */
    public final BaseProgressIndicatorSpec f546g;

    /* renamed from: h */
    public int f547h;

    /* renamed from: i */
    public float f548i;

    /* renamed from: j */
    public float f549j;

    /* renamed from: k */
    public Animatable2Compat.AnimationCallback f550k;

    /* renamed from: Bp$a */
    /* loaded from: classes4.dex */
    public class C0130a extends AnimatorListenerAdapter {
        public C0130a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C0129Bp c0129Bp = C0129Bp.this;
            c0129Bp.f547h = (c0129Bp.f547h + 4) % C0129Bp.this.f546g.indicatorColors.length;
        }
    }

    /* renamed from: Bp$b */
    /* loaded from: classes4.dex */
    public class C0131b extends AnimatorListenerAdapter {
        public C0131b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C0129Bp.this.mo31121a();
            C0129Bp c0129Bp = C0129Bp.this;
            Animatable2Compat.AnimationCallback animationCallback = c0129Bp.f550k;
            if (animationCallback != null) {
                animationCallback.onAnimationEnd(c0129Bp.f61616a);
            }
        }
    }

    /* renamed from: Bp$c */
    /* loaded from: classes4.dex */
    public class C0132c extends Property {
        public C0132c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C0129Bp c0129Bp) {
            return Float.valueOf(c0129Bp.m69059o());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C0129Bp c0129Bp, Float f) {
            c0129Bp.m69054t(f.floatValue());
        }
    }

    /* renamed from: Bp$d */
    /* loaded from: classes4.dex */
    public class C0133d extends Property {
        public C0133d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C0129Bp c0129Bp) {
            return Float.valueOf(c0129Bp.m69058p());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C0129Bp c0129Bp, Float f) {
            c0129Bp.m69053u(f.floatValue());
        }
    }

    public C0129Bp(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f547h = 0;
        this.f550k = null;
        this.f546g = circularProgressIndicatorSpec;
        this.f545f = new FastOutSlowInInterpolator();
    }

    @Override // p000.AbstractC19776ee0
    /* renamed from: a */
    public void mo31121a() {
        ObjectAnimator objectAnimator = this.f543d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.AbstractC19776ee0
    /* renamed from: c */
    public void mo31120c() {
        m69055s();
    }

    @Override // p000.AbstractC19776ee0
    /* renamed from: d */
    public void mo31119d(Animatable2Compat.AnimationCallback animationCallback) {
        this.f550k = animationCallback;
    }

    @Override // p000.AbstractC19776ee0
    /* renamed from: f */
    public void mo31118f() {
        ObjectAnimator objectAnimator = this.f544e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f61616a.isVisible()) {
                this.f544e.start();
            } else {
                mo31121a();
            }
        }
    }

    @Override // p000.AbstractC19776ee0
    /* renamed from: g */
    public void mo31117g() {
        m69057q();
        m69055s();
        this.f543d.start();
    }

    @Override // p000.AbstractC19776ee0
    /* renamed from: h */
    public void mo31116h() {
        this.f550k = null;
    }

    /* renamed from: o */
    public final float m69059o() {
        return this.f548i;
    }

    /* renamed from: p */
    public final float m69058p() {
        return this.f549j;
    }

    /* renamed from: q */
    public final void m69057q() {
        if (this.f543d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f541o, 0.0f, 1.0f);
            this.f543d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f543d.setInterpolator(null);
            this.f543d.setRepeatCount(-1);
            this.f543d.addListener(new C0130a());
        }
        if (this.f544e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f542p, 0.0f, 1.0f);
            this.f544e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f544e.setInterpolator(this.f545f);
            this.f544e.addListener(new C0131b());
        }
    }

    /* renamed from: r */
    public final void m69056r(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float m31661b = m31661b(i, f540n[i2], 333);
            if (m31661b >= 0.0f && m31661b <= 1.0f) {
                int i3 = i2 + this.f547h;
                int[] iArr = this.f546g.indicatorColors;
                int length = i3 % iArr.length;
                int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(iArr[length], this.f61616a.getAlpha());
                int compositeARGBWithAlpha2 = MaterialColors.compositeARGBWithAlpha(this.f546g.indicatorColors[(length + 1) % iArr.length], this.f61616a.getAlpha());
                this.f61618c[0] = ArgbEvaluatorCompat.getInstance().evaluate(this.f545f.getInterpolation(m31661b), Integer.valueOf(compositeARGBWithAlpha), Integer.valueOf(compositeARGBWithAlpha2)).intValue();
                return;
            }
        }
    }

    /* renamed from: s */
    public void m69055s() {
        this.f547h = 0;
        this.f61618c[0] = MaterialColors.compositeARGBWithAlpha(this.f546g.indicatorColors[0], this.f61616a.getAlpha());
        this.f549j = 0.0f;
    }

    /* renamed from: t */
    public void m69054t(float f) {
        this.f548i = f;
        int i = (int) (f * 5400.0f);
        m69052v(i);
        m69056r(i);
        this.f61616a.invalidateSelf();
    }

    /* renamed from: u */
    public final void m69053u(float f) {
        this.f549j = f;
    }

    /* renamed from: v */
    public final void m69052v(int i) {
        float[] fArr = this.f61617b;
        float f = this.f548i;
        fArr[0] = (f * 1520.0f) - 20.0f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float m31661b = m31661b(i, f538l[i2], 667);
            float[] fArr2 = this.f61617b;
            fArr2[1] = fArr2[1] + (this.f545f.getInterpolation(m31661b) * 250.0f);
            float m31661b2 = m31661b(i, f539m[i2], 667);
            float[] fArr3 = this.f61617b;
            fArr3[0] = fArr3[0] + (this.f545f.getInterpolation(m31661b2) * 250.0f);
        }
        float[] fArr4 = this.f61617b;
        float f2 = fArr4[0];
        float f3 = fArr4[1];
        float f4 = f2 + ((f3 - f2) * this.f549j);
        fArr4[0] = f4;
        fArr4[0] = f4 / 360.0f;
        fArr4[1] = f3 / 360.0f;
    }
}