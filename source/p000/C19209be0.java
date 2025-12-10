package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: be0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19209be0 {

    /* renamed from: A */
    public ColorStateList f39068A;

    /* renamed from: B */
    public Typeface f39069B;

    /* renamed from: a */
    public final int f39070a;

    /* renamed from: b */
    public final int f39071b;

    /* renamed from: c */
    public final int f39072c;

    /* renamed from: d */
    public final TimeInterpolator f39073d;

    /* renamed from: e */
    public final TimeInterpolator f39074e;

    /* renamed from: f */
    public final TimeInterpolator f39075f;

    /* renamed from: g */
    public final Context f39076g;

    /* renamed from: h */
    public final TextInputLayout f39077h;

    /* renamed from: i */
    public LinearLayout f39078i;

    /* renamed from: j */
    public int f39079j;

    /* renamed from: k */
    public FrameLayout f39080k;

    /* renamed from: l */
    public Animator f39081l;

    /* renamed from: m */
    public final float f39082m;

    /* renamed from: n */
    public int f39083n;

    /* renamed from: o */
    public int f39084o;

    /* renamed from: p */
    public CharSequence f39085p;

    /* renamed from: q */
    public boolean f39086q;

    /* renamed from: r */
    public TextView f39087r;

    /* renamed from: s */
    public CharSequence f39088s;

    /* renamed from: t */
    public int f39089t;

    /* renamed from: u */
    public int f39090u;

    /* renamed from: v */
    public ColorStateList f39091v;

    /* renamed from: w */
    public CharSequence f39092w;

    /* renamed from: x */
    public boolean f39093x;

    /* renamed from: y */
    public TextView f39094y;

    /* renamed from: z */
    public int f39095z;

    /* renamed from: be0$a */
    /* loaded from: classes4.dex */
    public class C5383a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f39096a;

        /* renamed from: b */
        public final /* synthetic */ TextView f39097b;

        /* renamed from: c */
        public final /* synthetic */ int f39098c;

        /* renamed from: d */
        public final /* synthetic */ TextView f39099d;

        public C5383a(int i, TextView textView, int i2, TextView textView2) {
            this.f39096a = i;
            this.f39097b = textView;
            this.f39098c = i2;
            this.f39099d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C19209be0.this.f39083n = this.f39096a;
            C19209be0.this.f39081l = null;
            TextView textView = this.f39097b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f39098c == 1 && C19209be0.this.f39087r != null) {
                    C19209be0.this.f39087r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f39099d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f39099d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f39099d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f39099d.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: be0$b */
    /* loaded from: classes4.dex */
    public class C5384b extends View.AccessibilityDelegate {
        public C5384b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C19209be0.this.f39077h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C19209be0(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f39076g = context;
        this.f39077h = textInputLayout;
        this.f39082m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f39070a = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort4, 217);
        this.f39071b = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium4, 167);
        this.f39072c = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort4, 167);
        this.f39073d = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        int i = R.attr.motionEasingEmphasizedDecelerateInterpolator;
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        this.f39074e = MotionUtils.resolveThemeInterpolator(context, i, timeInterpolator);
        this.f39075f = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingLinearInterpolator, timeInterpolator);
    }

    /* renamed from: A */
    public boolean m51964A() {
        return this.f39086q;
    }

    /* renamed from: B */
    public boolean m51963B() {
        return this.f39093x;
    }

    /* renamed from: C */
    public void m51962C(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f39078i == null) {
            return;
        }
        if (m51920z(i) && (frameLayout = this.f39080k) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f39078i.removeView(textView);
        }
        int i2 = this.f39079j - 1;
        this.f39079j = i2;
        m51950O(this.f39078i, i2);
    }

    /* renamed from: D */
    public final void m51961D(int i, int i2) {
        TextView m51933m;
        TextView m51933m2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m51933m2 = m51933m(i2)) != null) {
            m51933m2.setVisibility(0);
            m51933m2.setAlpha(1.0f);
        }
        if (i != 0 && (m51933m = m51933m(i)) != null) {
            m51933m.setVisibility(4);
            if (i == 1) {
                m51933m.setText((CharSequence) null);
            }
        }
        this.f39083n = i2;
    }

    /* renamed from: E */
    public void m51960E(int i) {
        this.f39089t = i;
        TextView textView = this.f39087r;
        if (textView != null) {
            ViewCompat.setAccessibilityLiveRegion(textView, i);
        }
    }

    /* renamed from: F */
    public void m51959F(CharSequence charSequence) {
        this.f39088s = charSequence;
        TextView textView = this.f39087r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: G */
    public void m51958G(boolean z) {
        if (this.f39086q == z) {
            return;
        }
        m51938h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f39076g);
            this.f39087r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            this.f39087r.setTextAlignment(5);
            Typeface typeface = this.f39069B;
            if (typeface != null) {
                this.f39087r.setTypeface(typeface);
            }
            m51957H(this.f39090u);
            m51956I(this.f39091v);
            m51959F(this.f39088s);
            m51960E(this.f39089t);
            this.f39087r.setVisibility(4);
            m51941e(this.f39087r, 0);
        } else {
            m51923w();
            m51962C(this.f39087r, 0);
            this.f39087r = null;
            this.f39077h.m43815g0();
            this.f39077h.m43795q0();
        }
        this.f39086q = z;
    }

    /* renamed from: H */
    public void m51957H(int i) {
        this.f39090u = i;
        TextView textView = this.f39087r;
        if (textView != null) {
            this.f39077h.m43835T(textView, i);
        }
    }

    /* renamed from: I */
    public void m51956I(ColorStateList colorStateList) {
        this.f39091v = colorStateList;
        TextView textView = this.f39087r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: J */
    public void m51955J(int i) {
        this.f39095z = i;
        TextView textView = this.f39094y;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i);
        }
    }

    /* renamed from: K */
    public void m51954K(boolean z) {
        if (this.f39093x == z) {
            return;
        }
        m51938h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f39076g);
            this.f39094y = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            this.f39094y.setTextAlignment(5);
            Typeface typeface = this.f39069B;
            if (typeface != null) {
                this.f39094y.setTypeface(typeface);
            }
            this.f39094y.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(this.f39094y, 1);
            m51955J(this.f39095z);
            m51953L(this.f39068A);
            m51941e(this.f39094y, 1);
            this.f39094y.setAccessibilityDelegate(new C5384b());
        } else {
            m51922x();
            m51962C(this.f39094y, 1);
            this.f39094y = null;
            this.f39077h.m43815g0();
            this.f39077h.m43795q0();
        }
        this.f39093x = z;
    }

    /* renamed from: L */
    public void m51953L(ColorStateList colorStateList) {
        this.f39068A = colorStateList;
        TextView textView = this.f39094y;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: M */
    public final void m51952M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: N */
    public void m51951N(Typeface typeface) {
        if (typeface != this.f39069B) {
            this.f39069B = typeface;
            m51952M(this.f39087r, typeface);
            m51952M(this.f39094y, typeface);
        }
    }

    /* renamed from: O */
    public final void m51950O(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: P */
    public final boolean m51949P(TextView textView, CharSequence charSequence) {
        if (ViewCompat.isLaidOut(this.f39077h) && this.f39077h.isEnabled() && (this.f39084o != this.f39083n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public void m51948Q(CharSequence charSequence) {
        m51938h();
        this.f39085p = charSequence;
        this.f39087r.setText(charSequence);
        int i = this.f39083n;
        if (i != 1) {
            this.f39084o = 1;
        }
        m51946S(i, this.f39084o, m51949P(this.f39087r, charSequence));
    }

    /* renamed from: R */
    public void m51947R(CharSequence charSequence) {
        m51938h();
        this.f39092w = charSequence;
        this.f39094y.setText(charSequence);
        int i = this.f39083n;
        if (i != 2) {
            this.f39084o = 2;
        }
        m51946S(i, this.f39084o, m51949P(this.f39094y, charSequence));
    }

    /* renamed from: S */
    public final void m51946S(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f39081l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m51937i(arrayList, this.f39093x, this.f39094y, 2, i, i2);
            m51937i(arrayList, this.f39086q, this.f39087r, 1, i, i2);
            AnimatorSetCompat.playTogether(animatorSet, arrayList);
            animatorSet.addListener(new C5383a(i2, m51933m(i), i, m51933m(i2)));
            animatorSet.start();
        } else {
            m51961D(i, i2);
        }
        this.f39077h.m43815g0();
        this.f39077h.m43807k0(z);
        this.f39077h.m43795q0();
    }

    /* renamed from: e */
    public void m51941e(TextView textView, int i) {
        if (this.f39078i == null && this.f39080k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f39076g);
            this.f39078i = linearLayout;
            linearLayout.setOrientation(0);
            this.f39077h.addView(this.f39078i, -1, -2);
            this.f39080k = new FrameLayout(this.f39076g);
            this.f39078i.addView(this.f39080k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f39077h.getEditText() != null) {
                m51940f();
            }
        }
        if (m51920z(i)) {
            this.f39080k.setVisibility(0);
            this.f39080k.addView(textView);
        } else {
            this.f39078i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f39078i.setVisibility(0);
        this.f39079j++;
    }

    /* renamed from: f */
    public void m51940f() {
        if (m51939g()) {
            EditText editText = this.f39077h.getEditText();
            boolean isFontScaleAtLeast1_3 = MaterialResources.isFontScaleAtLeast1_3(this.f39076g);
            ViewCompat.setPaddingRelative(this.f39078i, m51924v(isFontScaleAtLeast1_3, R.dimen.material_helper_text_font_1_3_padding_horizontal, ViewCompat.getPaddingStart(editText)), m51924v(isFontScaleAtLeast1_3, R.dimen.material_helper_text_font_1_3_padding_top, this.f39076g.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), m51924v(isFontScaleAtLeast1_3, R.dimen.material_helper_text_font_1_3_padding_horizontal, ViewCompat.getPaddingEnd(editText)), 0);
        }
    }

    /* renamed from: g */
    public final boolean m51939g() {
        if (this.f39078i != null && this.f39077h.getEditText() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void m51938h() {
        Animator animator = this.f39081l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: i */
    public final void m51937i(List list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ObjectAnimator m51936j = m51936j(textView, z2);
                if (i == i3 && i2 != 0) {
                    m51936j.setStartDelay(this.f39072c);
                }
                list.add(m51936j);
                if (i3 == i && i2 != 0) {
                    ObjectAnimator m51935k = m51935k(textView);
                    m51935k.setStartDelay(this.f39072c);
                    list.add(m51935k);
                }
            }
        }
    }

    /* renamed from: j */
    public final ObjectAnimator m51936j(TextView textView, boolean z) {
        float f;
        int i;
        TimeInterpolator timeInterpolator;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
        if (z) {
            i = this.f39071b;
        } else {
            i = this.f39072c;
        }
        ofFloat.setDuration(i);
        if (z) {
            timeInterpolator = this.f39074e;
        } else {
            timeInterpolator = this.f39075f;
        }
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    /* renamed from: k */
    public final ObjectAnimator m51935k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f39082m, 0.0f);
        ofFloat.setDuration(this.f39070a);
        ofFloat.setInterpolator(this.f39073d);
        return ofFloat;
    }

    /* renamed from: l */
    public boolean m51934l() {
        return m51921y(this.f39084o);
    }

    /* renamed from: m */
    public final TextView m51933m(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.f39094y;
        }
        return this.f39087r;
    }

    /* renamed from: n */
    public int m51932n() {
        return this.f39089t;
    }

    /* renamed from: o */
    public CharSequence m51931o() {
        return this.f39088s;
    }

    /* renamed from: p */
    public CharSequence m51930p() {
        return this.f39085p;
    }

    /* renamed from: q */
    public int m51929q() {
        TextView textView = this.f39087r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: r */
    public ColorStateList m51928r() {
        TextView textView = this.f39087r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* renamed from: s */
    public CharSequence m51927s() {
        return this.f39092w;
    }

    /* renamed from: t */
    public View m51926t() {
        return this.f39094y;
    }

    /* renamed from: u */
    public int m51925u() {
        TextView textView = this.f39094y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: v */
    public final int m51924v(boolean z, int i, int i2) {
        if (z) {
            return this.f39076g.getResources().getDimensionPixelSize(i);
        }
        return i2;
    }

    /* renamed from: w */
    public void m51923w() {
        this.f39085p = null;
        m51938h();
        if (this.f39083n == 1) {
            if (this.f39093x && !TextUtils.isEmpty(this.f39092w)) {
                this.f39084o = 2;
            } else {
                this.f39084o = 0;
            }
        }
        m51946S(this.f39083n, this.f39084o, m51949P(this.f39087r, ""));
    }

    /* renamed from: x */
    public void m51922x() {
        m51938h();
        int i = this.f39083n;
        if (i == 2) {
            this.f39084o = 0;
        }
        m51946S(i, this.f39084o, m51949P(this.f39094y, ""));
    }

    /* renamed from: y */
    public final boolean m51921y(int i) {
        if (i == 1 && this.f39087r != null && !TextUtils.isEmpty(this.f39085p)) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m51920z(int i) {
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }
}
