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

/* renamed from: OL1 */
/* loaded from: classes4.dex */
public class OL1 extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f4382a;

    /* renamed from: b */
    public final TextView f4383b;

    /* renamed from: c */
    public CharSequence f4384c;

    /* renamed from: d */
    public final CheckableImageButton f4385d;

    /* renamed from: e */
    public ColorStateList f4386e;

    /* renamed from: f */
    public PorterDuff.Mode f4387f;

    /* renamed from: g */
    public int f4388g;

    /* renamed from: h */
    public ImageView.ScaleType f4389h;

    /* renamed from: i */
    public View.OnLongClickListener f4390i;

    /* renamed from: j */
    public boolean f4391j;

    public OL1(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f4382a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f4385d = checkableImageButton;
        AbstractC19547dc0.m31846e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f4383b = appCompatTextView;
        m67064i(tintTypedArray);
        m67065h(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* renamed from: A */
    public void m67075A(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f4383b.getVisibility() == 0) {
            accessibilityNodeInfoCompat.setLabelFor(this.f4383b);
            accessibilityNodeInfoCompat.setTraversalAfter(this.f4383b);
            return;
        }
        accessibilityNodeInfoCompat.setTraversalAfter(this.f4385d);
    }

    /* renamed from: B */
    public void m67074B() {
        int paddingStart;
        EditText editText = this.f4382a.f51041d;
        if (editText == null) {
            return;
        }
        if (m67062k()) {
            paddingStart = 0;
        } else {
            paddingStart = ViewCompat.getPaddingStart(editText);
        }
        ViewCompat.setPaddingRelative(this.f4383b, paddingStart, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    /* renamed from: C */
    public final void m67073C() {
        int i;
        int i2 = 8;
        if (this.f4384c != null && !this.f4391j) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility((this.f4385d.getVisibility() == 0 || i == 0) ? 0 : 0);
        this.f4383b.setVisibility(i);
        this.f4382a.m43817f0();
    }

    /* renamed from: a */
    public CharSequence m67072a() {
        return this.f4384c;
    }

    /* renamed from: b */
    public ColorStateList m67071b() {
        return this.f4383b.getTextColors();
    }

    /* renamed from: c */
    public TextView m67070c() {
        return this.f4383b;
    }

    /* renamed from: d */
    public CharSequence m67069d() {
        return this.f4385d.getContentDescription();
    }

    /* renamed from: e */
    public Drawable m67068e() {
        return this.f4385d.getDrawable();
    }

    /* renamed from: f */
    public int m67067f() {
        return this.f4388g;
    }

    /* renamed from: g */
    public ImageView.ScaleType m67066g() {
        return this.f4389h;
    }

    /* renamed from: h */
    public final void m67065h(TintTypedArray tintTypedArray) {
        this.f4383b.setVisibility(8);
        this.f4383b.setId(R.id.textinput_prefix_text);
        this.f4383b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.setAccessibilityLiveRegion(this.f4383b, 1);
        m67058o(tintTypedArray.getResourceId(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_prefixTextColor)) {
            m67057p(tintTypedArray.getColorStateList(R.styleable.TextInputLayout_prefixTextColor));
        }
        m67059n(tintTypedArray.getText(R.styleable.TextInputLayout_prefixText));
    }

    /* renamed from: i */
    public final void m67064i(TintTypedArray tintTypedArray) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) this.f4385d.getLayoutParams(), 0);
        }
        m67052u(null);
        m67051v(null);
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_startIconTint)) {
            this.f4386e = MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.TextInputLayout_startIconTint);
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_startIconTintMode)) {
            this.f4387f = ViewUtils.parseTintMode(tintTypedArray.getInt(R.styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_startIconDrawable)) {
            m67054s(tintTypedArray.getDrawable(R.styleable.TextInputLayout_startIconDrawable));
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_startIconContentDescription)) {
                m67055r(tintTypedArray.getText(R.styleable.TextInputLayout_startIconContentDescription));
            }
            m67056q(tintTypedArray.getBoolean(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        m67053t(tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_startIconScaleType)) {
            m67050w(AbstractC19547dc0.m31849b(tintTypedArray.getInt(R.styleable.TextInputLayout_startIconScaleType, -1)));
        }
    }

    /* renamed from: j */
    public boolean m67063j() {
        return this.f4385d.isCheckable();
    }

    /* renamed from: k */
    public boolean m67062k() {
        if (this.f4385d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void m67061l(boolean z) {
        this.f4391j = z;
        m67073C();
    }

    /* renamed from: m */
    public void m67060m() {
        AbstractC19547dc0.m31847d(this.f4382a, this.f4385d, this.f4386e);
    }

    /* renamed from: n */
    public void m67059n(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f4384c = charSequence2;
        this.f4383b.setText(charSequence);
        m67073C();
    }

    /* renamed from: o */
    public void m67058o(int i) {
        TextViewCompat.setTextAppearance(this.f4383b, i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m67074B();
    }

    /* renamed from: p */
    public void m67057p(ColorStateList colorStateList) {
        this.f4383b.setTextColor(colorStateList);
    }

    /* renamed from: q */
    public void m67056q(boolean z) {
        this.f4385d.setCheckable(z);
    }

    /* renamed from: r */
    public void m67055r(CharSequence charSequence) {
        if (m67069d() != charSequence) {
            this.f4385d.setContentDescription(charSequence);
        }
    }

    /* renamed from: s */
    public void m67054s(Drawable drawable) {
        this.f4385d.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC19547dc0.m31850a(this.f4382a, this.f4385d, this.f4386e, this.f4387f);
            m67047z(true);
            m67060m();
            return;
        }
        m67047z(false);
        m67052u(null);
        m67051v(null);
        m67055r(null);
    }

    /* renamed from: t */
    public void m67053t(int i) {
        if (i >= 0) {
            if (i != this.f4388g) {
                this.f4388g = i;
                AbstractC19547dc0.m31844g(this.f4385d, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    /* renamed from: u */
    public void m67052u(View.OnClickListener onClickListener) {
        AbstractC19547dc0.m31843h(this.f4385d, onClickListener, this.f4390i);
    }

    /* renamed from: v */
    public void m67051v(View.OnLongClickListener onLongClickListener) {
        this.f4390i = onLongClickListener;
        AbstractC19547dc0.m31842i(this.f4385d, onLongClickListener);
    }

    /* renamed from: w */
    public void m67050w(ImageView.ScaleType scaleType) {
        this.f4389h = scaleType;
        AbstractC19547dc0.m31841j(this.f4385d, scaleType);
    }

    /* renamed from: x */
    public void m67049x(ColorStateList colorStateList) {
        if (this.f4386e != colorStateList) {
            this.f4386e = colorStateList;
            AbstractC19547dc0.m31850a(this.f4382a, this.f4385d, colorStateList, this.f4387f);
        }
    }

    /* renamed from: y */
    public void m67048y(PorterDuff.Mode mode) {
        if (this.f4387f != mode) {
            this.f4387f = mode;
            AbstractC19547dc0.m31850a(this.f4382a, this.f4385d, this.f4386e, mode);
        }
    }

    /* renamed from: z */
    public void m67047z(boolean z) {
        int i;
        if (m67062k() != z) {
            CheckableImageButton checkableImageButton = this.f4385d;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m67074B();
            m67073C();
        }
    }
}
