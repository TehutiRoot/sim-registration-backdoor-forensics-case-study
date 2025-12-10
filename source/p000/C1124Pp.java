package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.textfield.C7118a;

/* renamed from: Pp */
/* loaded from: classes4.dex */
public class C1124Pp extends AbstractC13999tS {

    /* renamed from: e */
    public final int f4855e;

    /* renamed from: f */
    public final int f4856f;

    /* renamed from: g */
    public final TimeInterpolator f4857g;

    /* renamed from: h */
    public final TimeInterpolator f4858h;

    /* renamed from: i */
    public EditText f4859i;

    /* renamed from: j */
    public final View.OnClickListener f4860j;

    /* renamed from: k */
    public final View.OnFocusChangeListener f4861k;

    /* renamed from: l */
    public AnimatorSet f4862l;

    /* renamed from: m */
    public ValueAnimator f4863m;

    /* renamed from: Pp$a */
    /* loaded from: classes4.dex */
    public class C1125a extends AnimatorListenerAdapter {
        public C1125a() {
            C1124Pp.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1124Pp.this.f80117b.m43743e0(true);
        }
    }

    /* renamed from: Pp$b */
    /* loaded from: classes4.dex */
    public class C1126b extends AnimatorListenerAdapter {
        public C1126b() {
            C1124Pp.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1124Pp.this.f80117b.m43743e0(false);
        }
    }

    public C1124Pp(C7118a c7118a) {
        super(c7118a);
        this.f4860j = new View.OnClickListener() { // from class: Kp
            {
                C1124Pp.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1124Pp.m66715v(C1124Pp.this, view);
            }
        };
        this.f4861k = new View.OnFocusChangeListener() { // from class: Lp
            {
                C1124Pp.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C1124Pp.m66714w(C1124Pp.this, view, z);
            }
        };
        this.f4855e = MotionUtils.resolveThemeDuration(c7118a.getContext(), R.attr.motionDurationShort3, 100);
        this.f4856f = MotionUtils.resolveThemeDuration(c7118a.getContext(), R.attr.motionDurationShort3, 150);
        this.f4857g = MotionUtils.resolveThemeInterpolator(c7118a.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.f4858h = MotionUtils.resolveThemeInterpolator(c7118a.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }

    /* renamed from: v */
    public static /* synthetic */ void m66715v(C1124Pp c1124Pp, View view) {
        c1124Pp.m66719G(view);
    }

    /* renamed from: w */
    public static /* synthetic */ void m66714w(C1124Pp c1124Pp, View view, boolean z) {
        c1124Pp.m66718H(view, z);
    }

    /* renamed from: x */
    public static /* synthetic */ void m66713x(C1124Pp c1124Pp, ValueAnimator valueAnimator) {
        c1124Pp.m66721E(valueAnimator);
    }

    /* renamed from: y */
    public static /* synthetic */ void m66712y(C1124Pp c1124Pp, ValueAnimator valueAnimator) {
        c1124Pp.m66720F(valueAnimator);
    }

    /* renamed from: z */
    public static /* synthetic */ void m66711z(C1124Pp c1124Pp) {
        c1124Pp.m66717I();
    }

    /* renamed from: A */
    public final void m66725A(boolean z) {
        boolean z2;
        if (this.f80117b.m43771H() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.f4862l.isRunning()) {
            this.f4863m.cancel();
            this.f4862l.start();
            if (z2) {
                this.f4862l.end();
            }
        } else if (!z) {
            this.f4862l.cancel();
            this.f4863m.start();
            if (z2) {
                this.f4863m.end();
            }
        }
    }

    /* renamed from: B */
    public final ValueAnimator m66724B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f4857g);
        ofFloat.setDuration(this.f4855e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Mp
            {
                C1124Pp.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1124Pp.m66713x(C1124Pp.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: C */
    public final ValueAnimator m66723C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f4858h);
        ofFloat.setDuration(this.f4856f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Op
            {
                C1124Pp.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1124Pp.m66712y(C1124Pp.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: D */
    public final void m66722D() {
        ValueAnimator m66723C = m66723C();
        ValueAnimator m66724B = m66724B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4862l = animatorSet;
        animatorSet.playTogether(m66723C, m66724B);
        this.f4862l.addListener(new C1125a());
        ValueAnimator m66724B2 = m66724B(1.0f, 0.0f);
        this.f4863m = m66724B2;
        m66724B2.addListener(new C1126b());
    }

    /* renamed from: E */
    public final /* synthetic */ void m66721E(ValueAnimator valueAnimator) {
        this.f80119d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: F */
    public final /* synthetic */ void m66720F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f80119d.setScaleX(floatValue);
        this.f80119d.setScaleY(floatValue);
    }

    /* renamed from: G */
    public final /* synthetic */ void m66719G(View view) {
        EditText editText = this.f4859i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        m22419r();
    }

    /* renamed from: H */
    public final /* synthetic */ void m66718H(View view, boolean z) {
        m66725A(m66716J());
    }

    /* renamed from: I */
    public final /* synthetic */ void m66717I() {
        m66725A(true);
    }

    /* renamed from: J */
    public final boolean m66716J() {
        EditText editText = this.f4859i;
        if (editText != null && ((editText.hasFocus() || this.f80119d.hasFocus()) && this.f4859i.getText().length() > 0)) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: a */
    public void mo22436a(Editable editable) {
        if (this.f80117b.m43704y() != null) {
            return;
        }
        m66725A(m66716J());
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: c */
    public int mo22434c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: d */
    public int mo22433d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: e */
    public View.OnFocusChangeListener mo22432e() {
        return this.f4861k;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: f */
    public View.OnClickListener mo22431f() {
        return this.f4860j;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: g */
    public View.OnFocusChangeListener mo22430g() {
        return this.f4861k;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: n */
    public void mo22423n(EditText editText) {
        this.f4859i = editText;
        this.f80116a.setEndIconVisible(m66716J());
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: q */
    public void mo22420q(boolean z) {
        if (this.f80117b.m43704y() == null) {
            return;
        }
        m66725A(z);
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: s */
    public void mo897s() {
        m66722D();
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: u */
    public void mo22417u() {
        EditText editText = this.f4859i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: Np
                {
                    C1124Pp.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1124Pp.m66711z(C1124Pp.this);
                }
            });
        }
    }
}
