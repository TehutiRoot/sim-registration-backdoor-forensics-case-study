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
public final class C0133Bp extends AbstractC18806Yd0 {

    /* renamed from: l */
    public static final int[] f522l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    public static final int[] f523m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    public static final int[] f524n = {1000, 2350, 3700, 5050};

    /* renamed from: o */
    public static final Property f525o = new C0136c(Float.class, "animationFraction");

    /* renamed from: p */
    public static final Property f526p = new C0137d(Float.class, "completeEndFraction");

    /* renamed from: d */
    public ObjectAnimator f527d;

    /* renamed from: e */
    public ObjectAnimator f528e;

    /* renamed from: f */
    public final FastOutSlowInInterpolator f529f;

    /* renamed from: g */
    public final BaseProgressIndicatorSpec f530g;

    /* renamed from: h */
    public int f531h;

    /* renamed from: i */
    public float f532i;

    /* renamed from: j */
    public float f533j;

    /* renamed from: k */
    public Animatable2Compat.AnimationCallback f534k;

    /* renamed from: Bp$a */
    /* loaded from: classes4.dex */
    public class C0134a extends AnimatorListenerAdapter {
        public C0134a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C0133Bp c0133Bp = C0133Bp.this;
            c0133Bp.f531h = (c0133Bp.f531h + 4) % C0133Bp.this.f530g.indicatorColors.length;
        }
    }

    /* renamed from: Bp$b */
    /* loaded from: classes4.dex */
    public class C0135b extends AnimatorListenerAdapter {
        public C0135b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C0133Bp.this.mo51887a();
            C0133Bp c0133Bp = C0133Bp.this;
            Animatable2Compat.AnimationCallback animationCallback = c0133Bp.f534k;
            if (animationCallback != null) {
                animationCallback.onAnimationEnd(c0133Bp.f7801a);
            }
        }
    }

    /* renamed from: Bp$c */
    /* loaded from: classes4.dex */
    public class C0136c extends Property {
        public C0136c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C0133Bp c0133Bp) {
            return Float.valueOf(c0133Bp.m68869o());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C0133Bp c0133Bp, Float f) {
            c0133Bp.m68864t(f.floatValue());
        }
    }

    /* renamed from: Bp$d */
    /* loaded from: classes4.dex */
    public class C0137d extends Property {
        public C0137d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C0133Bp c0133Bp) {
            return Float.valueOf(c0133Bp.m68868p());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C0133Bp c0133Bp, Float f) {
            c0133Bp.m68863u(f.floatValue());
        }
    }

    public C0133Bp(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f531h = 0;
        this.f534k = null;
        this.f530g = circularProgressIndicatorSpec;
        this.f529f = new FastOutSlowInInterpolator();
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: a */
    public void mo51887a() {
        ObjectAnimator objectAnimator = this.f527d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: c */
    public void mo51886c() {
        m68865s();
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: d */
    public void mo51885d(Animatable2Compat.AnimationCallback animationCallback) {
        this.f534k = animationCallback;
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: f */
    public void mo51884f() {
        ObjectAnimator objectAnimator = this.f528e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f7801a.isVisible()) {
                this.f528e.start();
            } else {
                mo51887a();
            }
        }
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: g */
    public void mo51883g() {
        m68867q();
        m68865s();
        this.f527d.start();
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: h */
    public void mo51882h() {
        this.f534k = null;
    }

    /* renamed from: o */
    public final float m68869o() {
        return this.f532i;
    }

    /* renamed from: p */
    public final float m68868p() {
        return this.f533j;
    }

    /* renamed from: q */
    public final void m68867q() {
        if (this.f527d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f525o, 0.0f, 1.0f);
            this.f527d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f527d.setInterpolator(null);
            this.f527d.setRepeatCount(-1);
            this.f527d.addListener(new C0134a());
        }
        if (this.f528e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f526p, 0.0f, 1.0f);
            this.f528e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f528e.setInterpolator(this.f529f);
            this.f528e.addListener(new C0135b());
        }
    }

    /* renamed from: r */
    public final void m68866r(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float m65332b = m65332b(i, f524n[i2], 333);
            if (m65332b >= 0.0f && m65332b <= 1.0f) {
                int i3 = i2 + this.f531h;
                int[] iArr = this.f530g.indicatorColors;
                int length = i3 % iArr.length;
                int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(iArr[length], this.f7801a.getAlpha());
                int compositeARGBWithAlpha2 = MaterialColors.compositeARGBWithAlpha(this.f530g.indicatorColors[(length + 1) % iArr.length], this.f7801a.getAlpha());
                this.f7803c[0] = ArgbEvaluatorCompat.getInstance().evaluate(this.f529f.getInterpolation(m65332b), Integer.valueOf(compositeARGBWithAlpha), Integer.valueOf(compositeARGBWithAlpha2)).intValue();
                return;
            }
        }
    }

    /* renamed from: s */
    public void m68865s() {
        this.f531h = 0;
        this.f7803c[0] = MaterialColors.compositeARGBWithAlpha(this.f530g.indicatorColors[0], this.f7801a.getAlpha());
        this.f533j = 0.0f;
    }

    /* renamed from: t */
    public void m68864t(float f) {
        this.f532i = f;
        int i = (int) (f * 5400.0f);
        m68862v(i);
        m68866r(i);
        this.f7801a.invalidateSelf();
    }

    /* renamed from: u */
    public final void m68863u(float f) {
        this.f533j = f;
    }

    /* renamed from: v */
    public final void m68862v(int i) {
        float[] fArr = this.f7802b;
        float f = this.f532i;
        fArr[0] = (f * 1520.0f) - 20.0f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float m65332b = m65332b(i, f522l[i2], 667);
            float[] fArr2 = this.f7802b;
            fArr2[1] = fArr2[1] + (this.f529f.getInterpolation(m65332b) * 250.0f);
            float m65332b2 = m65332b(i, f523m[i2], 667);
            float[] fArr3 = this.f7802b;
            fArr3[0] = fArr3[0] + (this.f529f.getInterpolation(m65332b2) * 250.0f);
        }
        float[] fArr4 = this.f7802b;
        float f2 = fArr4[0];
        float f3 = fArr4[1];
        float f4 = f2 + ((f3 - f2) * this.f533j);
        fArr4[0] = f4;
        fArr4[0] = f4 / 360.0f;
        fArr4[1] = f3 / 360.0f;
    }
}
