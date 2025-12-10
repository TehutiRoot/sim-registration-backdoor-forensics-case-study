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

/* renamed from: he0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20295he0 {

    /* renamed from: A */
    public ColorStateList f62531A;

    /* renamed from: B */
    public Typeface f62532B;

    /* renamed from: a */
    public final int f62533a;

    /* renamed from: b */
    public final int f62534b;

    /* renamed from: c */
    public final int f62535c;

    /* renamed from: d */
    public final TimeInterpolator f62536d;

    /* renamed from: e */
    public final TimeInterpolator f62537e;

    /* renamed from: f */
    public final TimeInterpolator f62538f;

    /* renamed from: g */
    public final Context f62539g;

    /* renamed from: h */
    public final TextInputLayout f62540h;

    /* renamed from: i */
    public LinearLayout f62541i;

    /* renamed from: j */
    public int f62542j;

    /* renamed from: k */
    public FrameLayout f62543k;

    /* renamed from: l */
    public Animator f62544l;

    /* renamed from: m */
    public final float f62545m;

    /* renamed from: n */
    public int f62546n;

    /* renamed from: o */
    public int f62547o;

    /* renamed from: p */
    public CharSequence f62548p;

    /* renamed from: q */
    public boolean f62549q;

    /* renamed from: r */
    public TextView f62550r;

    /* renamed from: s */
    public CharSequence f62551s;

    /* renamed from: t */
    public int f62552t;

    /* renamed from: u */
    public int f62553u;

    /* renamed from: v */
    public ColorStateList f62554v;

    /* renamed from: w */
    public CharSequence f62555w;

    /* renamed from: x */
    public boolean f62556x;

    /* renamed from: y */
    public TextView f62557y;

    /* renamed from: z */
    public int f62558z;

    /* renamed from: he0$a */
    /* loaded from: classes4.dex */
    public class C10378a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f62559a;

        /* renamed from: b */
        public final /* synthetic */ TextView f62560b;

        /* renamed from: c */
        public final /* synthetic */ int f62561c;

        /* renamed from: d */
        public final /* synthetic */ TextView f62562d;

        public C10378a(int i, TextView textView, int i2, TextView textView2) {
            this.f62559a = i;
            this.f62560b = textView;
            this.f62561c = i2;
            this.f62562d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C20295he0.this.f62546n = this.f62559a;
            C20295he0.this.f62544l = null;
            TextView textView = this.f62560b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f62561c == 1 && C20295he0.this.f62550r != null) {
                    C20295he0.this.f62550r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f62562d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f62562d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f62562d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f62562d.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: he0$b */
    /* loaded from: classes4.dex */
    public class C10379b extends View.AccessibilityDelegate {
        public C10379b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C20295he0.this.f62540h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C20295he0(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f62539g = context;
        this.f62540h = textInputLayout;
        this.f62545m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f62533a = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort4, 217);
        this.f62534b = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium4, 167);
        this.f62535c = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort4, 167);
        this.f62536d = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        int i = R.attr.motionEasingEmphasizedDecelerateInterpolator;
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        this.f62537e = MotionUtils.resolveThemeInterpolator(context, i, timeInterpolator);
        this.f62538f = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingLinearInterpolator, timeInterpolator);
    }

    /* renamed from: A */
    public boolean m31185A() {
        return this.f62549q;
    }

    /* renamed from: B */
    public boolean m31184B() {
        return this.f62556x;
    }

    /* renamed from: C */
    public void m31183C(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f62541i == null) {
            return;
        }
        if (m31141z(i) && (frameLayout = this.f62543k) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f62541i.removeView(textView);
        }
        int i2 = this.f62542j - 1;
        this.f62542j = i2;
        m31171O(this.f62541i, i2);
    }

    /* renamed from: D */
    public final void m31182D(int i, int i2) {
        TextView m31154m;
        TextView m31154m2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m31154m2 = m31154m(i2)) != null) {
            m31154m2.setVisibility(0);
            m31154m2.setAlpha(1.0f);
        }
        if (i != 0 && (m31154m = m31154m(i)) != null) {
            m31154m.setVisibility(4);
            if (i == 1) {
                m31154m.setText((CharSequence) null);
            }
        }
        this.f62546n = i2;
    }

    /* renamed from: E */
    public void m31181E(int i) {
        this.f62552t = i;
        TextView textView = this.f62550r;
        if (textView != null) {
            ViewCompat.setAccessibilityLiveRegion(textView, i);
        }
    }

    /* renamed from: F */
    public void m31180F(CharSequence charSequence) {
        this.f62551s = charSequence;
        TextView textView = this.f62550r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: G */
    public void m31179G(boolean z) {
        if (this.f62549q == z) {
            return;
        }
        m31159h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f62539g);
            this.f62550r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            this.f62550r.setTextAlignment(5);
            Typeface typeface = this.f62532B;
            if (typeface != null) {
                this.f62550r.setTypeface(typeface);
            }
            m31178H(this.f62553u);
            m31177I(this.f62554v);
            m31180F(this.f62551s);
            m31181E(this.f62552t);
            this.f62550r.setVisibility(4);
            m31162e(this.f62550r, 0);
        } else {
            m31144w();
            m31183C(this.f62550r, 0);
            this.f62550r = null;
            this.f62540h.m43802g0();
            this.f62540h.m43782q0();
        }
        this.f62549q = z;
    }

    /* renamed from: H */
    public void m31178H(int i) {
        this.f62553u = i;
        TextView textView = this.f62550r;
        if (textView != null) {
            this.f62540h.m43822T(textView, i);
        }
    }

    /* renamed from: I */
    public void m31177I(ColorStateList colorStateList) {
        this.f62554v = colorStateList;
        TextView textView = this.f62550r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: J */
    public void m31176J(int i) {
        this.f62558z = i;
        TextView textView = this.f62557y;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i);
        }
    }

    /* renamed from: K */
    public void m31175K(boolean z) {
        if (this.f62556x == z) {
            return;
        }
        m31159h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f62539g);
            this.f62557y = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            this.f62557y.setTextAlignment(5);
            Typeface typeface = this.f62532B;
            if (typeface != null) {
                this.f62557y.setTypeface(typeface);
            }
            this.f62557y.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(this.f62557y, 1);
            m31176J(this.f62558z);
            m31174L(this.f62531A);
            m31162e(this.f62557y, 1);
            this.f62557y.setAccessibilityDelegate(new C10379b());
        } else {
            m31143x();
            m31183C(this.f62557y, 1);
            this.f62557y = null;
            this.f62540h.m43802g0();
            this.f62540h.m43782q0();
        }
        this.f62556x = z;
    }

    /* renamed from: L */
    public void m31174L(ColorStateList colorStateList) {
        this.f62531A = colorStateList;
        TextView textView = this.f62557y;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: M */
    public final void m31173M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: N */
    public void m31172N(Typeface typeface) {
        if (typeface != this.f62532B) {
            this.f62532B = typeface;
            m31173M(this.f62550r, typeface);
            m31173M(this.f62557y, typeface);
        }
    }

    /* renamed from: O */
    public final void m31171O(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: P */
    public final boolean m31170P(TextView textView, CharSequence charSequence) {
        if (ViewCompat.isLaidOut(this.f62540h) && this.f62540h.isEnabled() && (this.f62547o != this.f62546n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public void m31169Q(CharSequence charSequence) {
        m31159h();
        this.f62548p = charSequence;
        this.f62550r.setText(charSequence);
        int i = this.f62546n;
        if (i != 1) {
            this.f62547o = 1;
        }
        m31167S(i, this.f62547o, m31170P(this.f62550r, charSequence));
    }

    /* renamed from: R */
    public void m31168R(CharSequence charSequence) {
        m31159h();
        this.f62555w = charSequence;
        this.f62557y.setText(charSequence);
        int i = this.f62546n;
        if (i != 2) {
            this.f62547o = 2;
        }
        m31167S(i, this.f62547o, m31170P(this.f62557y, charSequence));
    }

    /* renamed from: S */
    public final void m31167S(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f62544l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m31158i(arrayList, this.f62556x, this.f62557y, 2, i, i2);
            m31158i(arrayList, this.f62549q, this.f62550r, 1, i, i2);
            AnimatorSetCompat.playTogether(animatorSet, arrayList);
            animatorSet.addListener(new C10378a(i2, m31154m(i), i, m31154m(i2)));
            animatorSet.start();
        } else {
            m31182D(i, i2);
        }
        this.f62540h.m43802g0();
        this.f62540h.m43794k0(z);
        this.f62540h.m43782q0();
    }

    /* renamed from: e */
    public void m31162e(TextView textView, int i) {
        if (this.f62541i == null && this.f62543k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f62539g);
            this.f62541i = linearLayout;
            linearLayout.setOrientation(0);
            this.f62540h.addView(this.f62541i, -1, -2);
            this.f62543k = new FrameLayout(this.f62539g);
            this.f62541i.addView(this.f62543k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f62540h.getEditText() != null) {
                m31161f();
            }
        }
        if (m31141z(i)) {
            this.f62543k.setVisibility(0);
            this.f62543k.addView(textView);
        } else {
            this.f62541i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f62541i.setVisibility(0);
        this.f62542j++;
    }

    /* renamed from: f */
    public void m31161f() {
        if (m31160g()) {
            EditText editText = this.f62540h.getEditText();
            boolean isFontScaleAtLeast1_3 = MaterialResources.isFontScaleAtLeast1_3(this.f62539g);
            ViewCompat.setPaddingRelative(this.f62541i, m31145v(isFontScaleAtLeast1_3, R.dimen.material_helper_text_font_1_3_padding_horizontal, ViewCompat.getPaddingStart(editText)), m31145v(isFontScaleAtLeast1_3, R.dimen.material_helper_text_font_1_3_padding_top, this.f62539g.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), m31145v(isFontScaleAtLeast1_3, R.dimen.material_helper_text_font_1_3_padding_horizontal, ViewCompat.getPaddingEnd(editText)), 0);
        }
    }

    /* renamed from: g */
    public final boolean m31160g() {
        if (this.f62541i != null && this.f62540h.getEditText() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void m31159h() {
        Animator animator = this.f62544l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: i */
    public final void m31158i(List list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ObjectAnimator m31157j = m31157j(textView, z2);
                if (i == i3 && i2 != 0) {
                    m31157j.setStartDelay(this.f62535c);
                }
                list.add(m31157j);
                if (i3 == i && i2 != 0) {
                    ObjectAnimator m31156k = m31156k(textView);
                    m31156k.setStartDelay(this.f62535c);
                    list.add(m31156k);
                }
            }
        }
    }

    /* renamed from: j */
    public final ObjectAnimator m31157j(TextView textView, boolean z) {
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
            i = this.f62534b;
        } else {
            i = this.f62535c;
        }
        ofFloat.setDuration(i);
        if (z) {
            timeInterpolator = this.f62537e;
        } else {
            timeInterpolator = this.f62538f;
        }
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    /* renamed from: k */
    public final ObjectAnimator m31156k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f62545m, 0.0f);
        ofFloat.setDuration(this.f62533a);
        ofFloat.setInterpolator(this.f62536d);
        return ofFloat;
    }

    /* renamed from: l */
    public boolean m31155l() {
        return m31142y(this.f62547o);
    }

    /* renamed from: m */
    public final TextView m31154m(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.f62557y;
        }
        return this.f62550r;
    }

    /* renamed from: n */
    public int m31153n() {
        return this.f62552t;
    }

    /* renamed from: o */
    public CharSequence m31152o() {
        return this.f62551s;
    }

    /* renamed from: p */
    public CharSequence m31151p() {
        return this.f62548p;
    }

    /* renamed from: q */
    public int m31150q() {
        TextView textView = this.f62550r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: r */
    public ColorStateList m31149r() {
        TextView textView = this.f62550r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* renamed from: s */
    public CharSequence m31148s() {
        return this.f62555w;
    }

    /* renamed from: t */
    public View m31147t() {
        return this.f62557y;
    }

    /* renamed from: u */
    public int m31146u() {
        TextView textView = this.f62557y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: v */
    public final int m31145v(boolean z, int i, int i2) {
        if (z) {
            return this.f62539g.getResources().getDimensionPixelSize(i);
        }
        return i2;
    }

    /* renamed from: w */
    public void m31144w() {
        this.f62548p = null;
        m31159h();
        if (this.f62546n == 1) {
            if (this.f62556x && !TextUtils.isEmpty(this.f62555w)) {
                this.f62547o = 2;
            } else {
                this.f62547o = 0;
            }
        }
        m31167S(this.f62546n, this.f62547o, m31170P(this.f62550r, ""));
    }

    /* renamed from: x */
    public void m31143x() {
        m31159h();
        int i = this.f62546n;
        if (i == 2) {
            this.f62547o = 0;
        }
        m31167S(i, this.f62547o, m31170P(this.f62557y, ""));
    }

    /* renamed from: y */
    public final boolean m31142y(int i) {
        if (i == 1 && this.f62550r != null && !TextUtils.isEmpty(this.f62548p)) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m31141z(int i) {
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }
}