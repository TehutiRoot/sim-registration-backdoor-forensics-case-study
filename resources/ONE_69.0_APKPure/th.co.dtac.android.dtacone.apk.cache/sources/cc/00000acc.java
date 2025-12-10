package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: LM1 */
/* loaded from: classes4.dex */
public class LM1 extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f3590a;

    /* renamed from: b */
    public final TextView f3591b;

    /* renamed from: c */
    public CharSequence f3592c;

    /* renamed from: d */
    public final CheckableImageButton f3593d;

    /* renamed from: e */
    public ColorStateList f3594e;

    /* renamed from: f */
    public PorterDuff.Mode f3595f;

    /* renamed from: g */
    public int f3596g;

    /* renamed from: h */
    public ImageView.ScaleType f3597h;

    /* renamed from: i */
    public View.OnLongClickListener f3598i;

    /* renamed from: j */
    public boolean f3599j;

    public LM1(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f3590a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f3593d = checkableImageButton;
        AbstractC20635jc0.m29506e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f3591b = appCompatTextView;
        m67576i(tintTypedArray);
        m67577h(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* renamed from: A */
    public void m67587A(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f3591b.getVisibility() == 0) {
            accessibilityNodeInfoCompat.setLabelFor(this.f3591b);
            accessibilityNodeInfoCompat.setTraversalAfter(this.f3591b);
            return;
        }
        accessibilityNodeInfoCompat.setTraversalAfter(this.f3593d);
    }

    /* renamed from: B */
    public void m67586B() {
        int paddingStart;
        EditText editText = this.f3590a.f51053d;
        if (editText == null) {
            return;
        }
        if (m67574k()) {
            paddingStart = 0;
        } else {
            paddingStart = ViewCompat.getPaddingStart(editText);
        }
        ViewCompat.setPaddingRelative(this.f3591b, paddingStart, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    /* renamed from: C */
    public final void m67585C() {
        int i;
        int i2 = 8;
        if (this.f3592c != null && !this.f3599j) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility((this.f3593d.getVisibility() == 0 || i == 0) ? 0 : 0);
        this.f3591b.setVisibility(i);
        this.f3590a.m43804f0();
    }

    /* renamed from: a */
    public CharSequence m67584a() {
        return this.f3592c;
    }

    /* renamed from: b */
    public ColorStateList m67583b() {
        return this.f3591b.getTextColors();
    }

    /* renamed from: c */
    public TextView m67582c() {
        return this.f3591b;
    }

    /* renamed from: d */
    public CharSequence m67581d() {
        return this.f3593d.getContentDescription();
    }

    /* renamed from: e */
    public Drawable m67580e() {
        return this.f3593d.getDrawable();
    }

    /* renamed from: f */
    public int m67579f() {
        return this.f3596g;
    }

    /* renamed from: g */
    public ImageView.ScaleType m67578g() {
        return this.f3597h;
    }

    /* renamed from: h */
    public final void m67577h(TintTypedArray tintTypedArray) {
        this.f3591b.setVisibility(8);
        this.f3591b.setId(R.id.textinput_prefix_text);
        this.f3591b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.setAccessibilityLiveRegion(this.f3591b, 1);
        m67570o(tintTypedArray.getResourceId(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_prefixTextColor)) {
            m67569p(tintTypedArray.getColorStateList(R.styleable.TextInputLayout_prefixTextColor));
        }
        m67571n(tintTypedArray.getText(R.styleable.TextInputLayout_prefixText));
    }

    /* renamed from: i */
    public final void m67576i(TintTypedArray tintTypedArray) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) this.f3593d.getLayoutParams(), 0);
        }
        m67564u(null);
        m67563v(null);
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_startIconTint)) {
            this.f3594e = MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.TextInputLayout_startIconTint);
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_startIconTintMode)) {
            this.f3595f = ViewUtils.parseTintMode(tintTypedArray.getInt(R.styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_startIconDrawable)) {
            m67566s(tintTypedArray.getDrawable(R.styleable.TextInputLayout_startIconDrawable));
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_startIconContentDescription)) {
                m67567r(tintTypedArray.getText(R.styleable.TextInputLayout_startIconContentDescription));
            }
            m67568q(tintTypedArray.getBoolean(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        m67565t(tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_startIconScaleType)) {
            m67562w(AbstractC20635jc0.m29509b(tintTypedArray.getInt(R.styleable.TextInputLayout_startIconScaleType, -1)));
        }
    }

    /* renamed from: j */
    public boolean m67575j() {
        return this.f3593d.isCheckable();
    }

    /* renamed from: k */
    public boolean m67574k() {
        if (this.f3593d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void m67573l(boolean z) {
        this.f3599j = z;
        m67585C();
    }

    /* renamed from: m */
    public void m67572m() {
        AbstractC20635jc0.m29507d(this.f3590a, this.f3593d, this.f3594e);
    }

    /* renamed from: n */
    public void m67571n(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f3592c = charSequence2;
        this.f3591b.setText(charSequence);
        m67585C();
    }

    /* renamed from: o */
    public void m67570o(int i) {
        TextViewCompat.setTextAppearance(this.f3591b, i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m67586B();
    }

    /* renamed from: p */
    public void m67569p(ColorStateList colorStateList) {
        this.f3591b.setTextColor(colorStateList);
    }

    /* renamed from: q */
    public void m67568q(boolean z) {
        this.f3593d.setCheckable(z);
    }

    /* renamed from: r */
    public void m67567r(CharSequence charSequence) {
        if (m67581d() != charSequence) {
            this.f3593d.setContentDescription(charSequence);
        }
    }

    /* renamed from: s */
    public void m67566s(Drawable drawable) {
        this.f3593d.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC20635jc0.m29510a(this.f3590a, this.f3593d, this.f3594e, this.f3595f);
            m67559z(true);
            m67572m();
            return;
        }
        m67559z(false);
        m67564u(null);
        m67563v(null);
        m67567r(null);
    }

    /* renamed from: t */
    public void m67565t(int i) {
        if (i >= 0) {
            if (i != this.f3596g) {
                this.f3596g = i;
                AbstractC20635jc0.m29504g(this.f3593d, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    /* renamed from: u */
    public void m67564u(View.OnClickListener onClickListener) {
        AbstractC20635jc0.m29503h(this.f3593d, onClickListener, this.f3598i);
    }

    /* renamed from: v */
    public void m67563v(View.OnLongClickListener onLongClickListener) {
        this.f3598i = onLongClickListener;
        AbstractC20635jc0.m29502i(this.f3593d, onLongClickListener);
    }

    /* renamed from: w */
    public void m67562w(ImageView.ScaleType scaleType) {
        this.f3597h = scaleType;
        AbstractC20635jc0.m29501j(this.f3593d, scaleType);
    }

    /* renamed from: x */
    public void m67561x(ColorStateList colorStateList) {
        if (this.f3594e != colorStateList) {
            this.f3594e = colorStateList;
            AbstractC20635jc0.m29510a(this.f3590a, this.f3593d, colorStateList, this.f3595f);
        }
    }

    /* renamed from: y */
    public void m67560y(PorterDuff.Mode mode) {
        if (this.f3595f != mode) {
            this.f3595f = mode;
            AbstractC20635jc0.m29510a(this.f3590a, this.f3593d, this.f3594e, mode);
        }
    }

    /* renamed from: z */
    public void m67559z(boolean z) {
        int i;
        if (m67574k() != z) {
            CheckableImageButton checkableImageButton = this.f3593d;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m67586B();
            m67585C();
        }
    }
}