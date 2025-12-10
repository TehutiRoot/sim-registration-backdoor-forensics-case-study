package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;

/* renamed from: bj0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19224bj0 extends AbstractC18806Yd0 {

    /* renamed from: l */
    public static final int[] f39164l = {533, 567, 850, 750};

    /* renamed from: m */
    public static final int[] f39165m = {1267, 1000, 333, 0};

    /* renamed from: n */
    public static final Property f39166n = new C5395c(Float.class, "animationFraction");

    /* renamed from: d */
    public ObjectAnimator f39167d;

    /* renamed from: e */
    public ObjectAnimator f39168e;

    /* renamed from: f */
    public final Interpolator[] f39169f;

    /* renamed from: g */
    public final BaseProgressIndicatorSpec f39170g;

    /* renamed from: h */
    public int f39171h;

    /* renamed from: i */
    public boolean f39172i;

    /* renamed from: j */
    public float f39173j;

    /* renamed from: k */
    public Animatable2Compat.AnimationCallback f39174k;

    /* renamed from: bj0$a */
    /* loaded from: classes4.dex */
    public class C5393a extends AnimatorListenerAdapter {
        public C5393a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C19224bj0 c19224bj0 = C19224bj0.this;
            c19224bj0.f39171h = (c19224bj0.f39171h + 1) % C19224bj0.this.f39170g.indicatorColors.length;
            C19224bj0.this.f39172i = true;
        }
    }

    /* renamed from: bj0$b */
    /* loaded from: classes4.dex */
    public class C5394b extends AnimatorListenerAdapter {
        public C5394b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C19224bj0.this.mo51887a();
            C19224bj0 c19224bj0 = C19224bj0.this;
            Animatable2Compat.AnimationCallback animationCallback = c19224bj0.f39174k;
            if (animationCallback != null) {
                animationCallback.onAnimationEnd(c19224bj0.f7801a);
            }
        }
    }

    /* renamed from: bj0$c */
    /* loaded from: classes4.dex */
    public class C5395c extends Property {
        public C5395c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C19224bj0 c19224bj0) {
            return Float.valueOf(c19224bj0.m51876n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C19224bj0 c19224bj0, Float f) {
            c19224bj0.m51872r(f.floatValue());
        }
    }

    public C19224bj0(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f39171h = 0;
        this.f39174k = null;
        this.f39170g = linearProgressIndicatorSpec;
        this.f39169f = new Interpolator[]{AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public float m51876n() {
        return this.f39173j;
    }

    /* renamed from: o */
    private void m51875o() {
        if (this.f39167d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f39166n, 0.0f, 1.0f);
            this.f39167d = ofFloat;
            ofFloat.setDuration(1800L);
            this.f39167d.setInterpolator(null);
            this.f39167d.setRepeatCount(-1);
            this.f39167d.addListener(new C5393a());
        }
        if (this.f39168e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f39166n, 1.0f);
            this.f39168e = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f39168e.setInterpolator(null);
            this.f39168e.addListener(new C5394b());
        }
    }

    /* renamed from: p */
    private void m51874p() {
        if (this.f39172i) {
            Arrays.fill(this.f7803c, MaterialColors.compositeARGBWithAlpha(this.f39170g.indicatorColors[this.f39171h], this.f7801a.getAlpha()));
            this.f39172i = false;
        }
    }

    /* renamed from: s */
    private void m51871s(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f7802b[i2] = Math.max(0.0f, Math.min(1.0f, this.f39169f[i2].getInterpolation(m65332b(i, f39165m[i2], f39164l[i2]))));
        }
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: a */
    public void mo51887a() {
        ObjectAnimator objectAnimator = this.f39167d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: c */
    public void mo51886c() {
        m51873q();
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: d */
    public void mo51885d(Animatable2Compat.AnimationCallback animationCallback) {
        this.f39174k = animationCallback;
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: f */
    public void mo51884f() {
        ObjectAnimator objectAnimator = this.f39168e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            mo51887a();
            if (this.f7801a.isVisible()) {
                this.f39168e.setFloatValues(this.f39173j, 1.0f);
                this.f39168e.setDuration((1.0f - this.f39173j) * 1800.0f);
                this.f39168e.start();
            }
        }
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: g */
    public void mo51883g() {
        m51875o();
        m51873q();
        this.f39167d.start();
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: h */
    public void mo51882h() {
        this.f39174k = null;
    }

    /* renamed from: q */
    public void m51873q() {
        this.f39171h = 0;
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(this.f39170g.indicatorColors[0], this.f7801a.getAlpha());
        int[] iArr = this.f7803c;
        iArr[0] = compositeARGBWithAlpha;
        iArr[1] = compositeARGBWithAlpha;
    }

    /* renamed from: r */
    public void m51872r(float f) {
        this.f39173j = f;
        m51871s((int) (f * 1800.0f));
        m51874p();
        this.f7801a.invalidateSelf();
    }
}
