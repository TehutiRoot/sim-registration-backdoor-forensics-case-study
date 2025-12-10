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
import com.google.android.material.textfield.C7107a;

/* renamed from: Pp */
/* loaded from: classes4.dex */
public class C1115Pp extends AbstractC17054xS {

    /* renamed from: e */
    public final int f4893e;

    /* renamed from: f */
    public final int f4894f;

    /* renamed from: g */
    public final TimeInterpolator f4895g;

    /* renamed from: h */
    public final TimeInterpolator f4896h;

    /* renamed from: i */
    public EditText f4897i;

    /* renamed from: j */
    public final View.OnClickListener f4898j;

    /* renamed from: k */
    public final View.OnFocusChangeListener f4899k;

    /* renamed from: l */
    public AnimatorSet f4900l;

    /* renamed from: m */
    public ValueAnimator f4901m;

    /* renamed from: Pp$a */
    /* loaded from: classes4.dex */
    public class C1116a extends AnimatorListenerAdapter {
        public C1116a() {
            C1115Pp.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1115Pp.this.f108750b.m43730e0(true);
        }
    }

    /* renamed from: Pp$b */
    /* loaded from: classes4.dex */
    public class C1117b extends AnimatorListenerAdapter {
        public C1117b() {
            C1115Pp.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1115Pp.this.f108750b.m43730e0(false);
        }
    }

    public C1115Pp(C7107a c7107a) {
        super(c7107a);
        this.f4898j = new View.OnClickListener() { // from class: Kp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1115Pp.m66900v(C1115Pp.this, view);
            }
        };
        this.f4899k = new View.OnFocusChangeListener() { // from class: Lp
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C1115Pp.m66899w(C1115Pp.this, view, z);
            }
        };
        this.f4893e = MotionUtils.resolveThemeDuration(c7107a.getContext(), R.attr.motionDurationShort3, 100);
        this.f4894f = MotionUtils.resolveThemeDuration(c7107a.getContext(), R.attr.motionDurationShort3, 150);
        this.f4895g = MotionUtils.resolveThemeInterpolator(c7107a.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.f4896h = MotionUtils.resolveThemeInterpolator(c7107a.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }

    /* renamed from: v */
    public static /* synthetic */ void m66900v(C1115Pp c1115Pp, View view) {
        c1115Pp.m66904G(view);
    }

    /* renamed from: w */
    public static /* synthetic */ void m66899w(C1115Pp c1115Pp, View view, boolean z) {
        c1115Pp.m66903H(view, z);
    }

    /* renamed from: x */
    public static /* synthetic */ void m66898x(C1115Pp c1115Pp, ValueAnimator valueAnimator) {
        c1115Pp.m66906E(valueAnimator);
    }

    /* renamed from: y */
    public static /* synthetic */ void m66897y(C1115Pp c1115Pp, ValueAnimator valueAnimator) {
        c1115Pp.m66905F(valueAnimator);
    }

    /* renamed from: z */
    public static /* synthetic */ void m66896z(C1115Pp c1115Pp) {
        c1115Pp.m66902I();
    }

    /* renamed from: A */
    public final void m66910A(boolean z) {
        boolean z2;
        if (this.f108750b.m43758H() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.f4900l.isRunning()) {
            this.f4901m.cancel();
            this.f4900l.start();
            if (z2) {
                this.f4900l.end();
            }
        } else if (!z) {
            this.f4900l.cancel();
            this.f4901m.start();
            if (z2) {
                this.f4901m.end();
            }
        }
    }

    /* renamed from: B */
    public final ValueAnimator m66909B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f4895g);
        ofFloat.setDuration(this.f4893e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Mp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1115Pp.m66898x(C1115Pp.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: C */
    public final ValueAnimator m66908C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f4896h);
        ofFloat.setDuration(this.f4894f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Op
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1115Pp.m66897y(C1115Pp.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: D */
    public final void m66907D() {
        ValueAnimator m66908C = m66908C();
        ValueAnimator m66909B = m66909B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4900l = animatorSet;
        animatorSet.playTogether(m66908C, m66909B);
        this.f4900l.addListener(new C1116a());
        ValueAnimator m66909B2 = m66909B(1.0f, 0.0f);
        this.f4901m = m66909B2;
        m66909B2.addListener(new C1117b());
    }

    /* renamed from: E */
    public final /* synthetic */ void m66906E(ValueAnimator valueAnimator) {
        this.f108752d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: F */
    public final /* synthetic */ void m66905F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f108752d.setScaleX(floatValue);
        this.f108752d.setScaleY(floatValue);
    }

    /* renamed from: G */
    public final /* synthetic */ void m66904G(View view) {
        EditText editText = this.f4897i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        m533r();
    }

    /* renamed from: H */
    public final /* synthetic */ void m66903H(View view, boolean z) {
        m66910A(m66901J());
    }

    /* renamed from: I */
    public final /* synthetic */ void m66902I() {
        m66910A(true);
    }

    /* renamed from: J */
    public final boolean m66901J() {
        EditText editText = this.f4897i;
        if (editText != null && ((editText.hasFocus() || this.f108752d.hasFocus()) && this.f4897i.getText().length() > 0)) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: a */
    public void mo550a(Editable editable) {
        if (this.f108750b.m43691y() != null) {
            return;
        }
        m66910A(m66901J());
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: c */
    public int mo548c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: d */
    public int mo547d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: e */
    public View.OnFocusChangeListener mo546e() {
        return this.f4899k;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: f */
    public View.OnClickListener mo545f() {
        return this.f4898j;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: g */
    public View.OnFocusChangeListener mo544g() {
        return this.f4899k;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: n */
    public void mo537n(EditText editText) {
        this.f4897i = editText;
        this.f108749a.setEndIconVisible(m66901J());
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: q */
    public void mo534q(boolean z) {
        if (this.f108750b.m43691y() == null) {
            return;
        }
        m66910A(z);
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: s */
    public void mo532s() {
        m66907D();
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: u */
    public void mo530u() {
        EditText editText = this.f4897i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: Np
                @Override // java.lang.Runnable
                public final void run() {
                    C1115Pp.m66896z(C1115Pp.this);
                }
            });
        }
    }
}