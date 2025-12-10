package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes4.dex */
public class C7118a extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f51092a;

    /* renamed from: b */
    public final FrameLayout f51093b;

    /* renamed from: c */
    public final CheckableImageButton f51094c;

    /* renamed from: d */
    public ColorStateList f51095d;

    /* renamed from: e */
    public PorterDuff.Mode f51096e;

    /* renamed from: f */
    public View.OnLongClickListener f51097f;

    /* renamed from: g */
    public final CheckableImageButton f51098g;

    /* renamed from: h */
    public final C7122d f51099h;

    /* renamed from: i */
    public int f51100i;

    /* renamed from: j */
    public final LinkedHashSet f51101j;

    /* renamed from: k */
    public ColorStateList f51102k;

    /* renamed from: l */
    public PorterDuff.Mode f51103l;

    /* renamed from: m */
    public int f51104m;

    /* renamed from: n */
    public ImageView.ScaleType f51105n;

    /* renamed from: o */
    public View.OnLongClickListener f51106o;

    /* renamed from: p */
    public CharSequence f51107p;

    /* renamed from: q */
    public final TextView f51108q;

    /* renamed from: r */
    public boolean f51109r;

    /* renamed from: s */
    public EditText f51110s;

    /* renamed from: t */
    public final AccessibilityManager f51111t;

    /* renamed from: u */
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener f51112u;

    /* renamed from: v */
    public final TextWatcher f51113v;

    /* renamed from: w */
    public final TextInputLayout.OnEditTextAttachedListener f51114w;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes4.dex */
    public class C7119a extends TextWatcherAdapter {
        public C7119a() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C7118a.this.m43724o().mo22436a(editable);
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7118a.this.m43724o().mo22435b(charSequence, i, i2, i3);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* loaded from: classes4.dex */
    public class C7120b implements TextInputLayout.OnEditTextAttachedListener {
        public C7120b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
        public void onEditTextAttached(TextInputLayout textInputLayout) {
            if (C7118a.this.f51110s == textInputLayout.getEditText()) {
                return;
            }
            if (C7118a.this.f51110s != null) {
                C7118a.this.f51110s.removeTextChangedListener(C7118a.this.f51113v);
                if (C7118a.this.f51110s.getOnFocusChangeListener() == C7118a.this.m43724o().mo22432e()) {
                    C7118a.this.f51110s.setOnFocusChangeListener(null);
                }
            }
            C7118a.this.f51110s = textInputLayout.getEditText();
            if (C7118a.this.f51110s != null) {
                C7118a.this.f51110s.addTextChangedListener(C7118a.this.f51113v);
            }
            C7118a.this.m43724o().mo22423n(C7118a.this.f51110s);
            C7118a c7118a = C7118a.this;
            c7118a.m43729l0(c7118a.m43724o());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* loaded from: classes4.dex */
    public class View$OnAttachStateChangeListenerC7121c implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC7121c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C7118a.this.m43738h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C7118a.this.m43762Q();
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* loaded from: classes4.dex */
    public static class C7122d {

        /* renamed from: a */
        public final SparseArray f51118a = new SparseArray();

        /* renamed from: b */
        public final C7118a f51119b;

        /* renamed from: c */
        public final int f51120c;

        /* renamed from: d */
        public final int f51121d;

        public C7122d(C7118a c7118a, TintTypedArray tintTypedArray) {
            this.f51119b = c7118a;
            this.f51120c = tintTypedArray.getResourceId(R.styleable.TextInputLayout_endIconDrawable, 0);
            this.f51121d = tintTypedArray.getResourceId(R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        /* renamed from: b */
        public final AbstractC13999tS m43699b(int i) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                return new C0447GK(this.f51119b);
                            }
                            throw new IllegalArgumentException("Invalid end icon mode: " + i);
                        }
                        return new C1124Pp(this.f51119b);
                    }
                    return new C18243Ph1(this.f51119b, this.f51121d);
                }
                return new FI0(this.f51119b);
            }
            return new C16950wA(this.f51119b);
        }

        /* renamed from: c */
        public AbstractC13999tS m43698c(int i) {
            AbstractC13999tS abstractC13999tS = (AbstractC13999tS) this.f51118a.get(i);
            if (abstractC13999tS == null) {
                AbstractC13999tS m43699b = m43699b(i);
                this.f51118a.append(i, m43699b);
                return m43699b;
            }
            return abstractC13999tS;
        }
    }

    public C7118a(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f51100i = 0;
        this.f51101j = new LinkedHashSet();
        this.f51113v = new C7119a();
        C7120b c7120b = new C7120b();
        this.f51114w = c7120b;
        this.f51111t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f51092a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f51093b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton m43732k = m43732k(this, from, R.id.text_input_error_icon);
        this.f51094c = m43732k;
        CheckableImageButton m43732k2 = m43732k(frameLayout, from, R.id.text_input_end_icon);
        this.f51098g = m43732k2;
        this.f51099h = new C7122d(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f51108q = appCompatTextView;
        m43776D(tintTypedArray);
        m43778C(tintTypedArray);
        m43774E(tintTypedArray);
        frameLayout.addView(m43732k2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(m43732k);
        textInputLayout.addOnEditTextAttachedListener(c7120b);
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC7121c());
    }

    /* renamed from: A */
    public TextView m43782A() {
        return this.f51108q;
    }

    /* renamed from: A0 */
    public final void m43781A0() {
        int i;
        char c;
        FrameLayout frameLayout = this.f51093b;
        int i2 = 8;
        if (this.f51098g.getVisibility() == 0 && !m43770I()) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (this.f51107p != null && !this.f51109r) {
            c = 0;
        } else {
            c = '\b';
        }
        setVisibility((m43771H() || m43770I() || c == 0) ? 0 : 0);
    }

    /* renamed from: B */
    public boolean m43780B() {
        if (this.f51100i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    public final void m43779B0() {
        boolean z;
        int i = 0;
        if (m43712u() != null && this.f51092a.isErrorEnabled() && this.f51092a.m43834U()) {
            z = true;
        } else {
            z = false;
        }
        CheckableImageButton checkableImageButton = this.f51094c;
        if (!z) {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        m43781A0();
        m43777C0();
        if (!m43780B()) {
            this.f51092a.m43817f0();
        }
    }

    /* renamed from: C */
    public final void m43778C(TintTypedArray tintTypedArray) {
        if (!tintTypedArray.hasValue(R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconTint)) {
                this.f51102k = MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.TextInputLayout_endIconTint);
            }
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconTintMode)) {
                this.f51103l = ViewUtils.parseTintMode(tintTypedArray.getInt(R.styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconMode)) {
            m43754Y(tintTypedArray.getInt(R.styleable.TextInputLayout_endIconMode, 0));
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconContentDescription)) {
                m43758U(tintTypedArray.getText(R.styleable.TextInputLayout_endIconContentDescription));
            }
            m43760S(tintTypedArray.getBoolean(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (tintTypedArray.hasValue(R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_passwordToggleTint)) {
                this.f51102k = MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.TextInputLayout_passwordToggleTint);
            }
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_passwordToggleTintMode)) {
                this.f51103l = ViewUtils.parseTintMode(tintTypedArray.getInt(R.styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            m43754Y(tintTypedArray.getBoolean(R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            m43758U(tintTypedArray.getText(R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        m43755X(tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconScaleType)) {
            m43749b0(AbstractC19547dc0.m31849b(tintTypedArray.getInt(R.styleable.TextInputLayout_endIconScaleType, -1)));
        }
    }

    /* renamed from: C0 */
    public void m43777C0() {
        int i;
        if (this.f51092a.f51041d == null) {
            return;
        }
        if (!m43771H() && !m43770I()) {
            i = ViewCompat.getPaddingEnd(this.f51092a.f51041d);
        } else {
            i = 0;
        }
        ViewCompat.setPaddingRelative(this.f51108q, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.f51092a.f51041d.getPaddingTop(), i, this.f51092a.f51041d.getPaddingBottom());
    }

    /* renamed from: D */
    public final void m43776D(TintTypedArray tintTypedArray) {
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_errorIconTint)) {
            this.f51095d = MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.TextInputLayout_errorIconTint);
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_errorIconTintMode)) {
            this.f51096e = ViewUtils.parseTintMode(tintTypedArray.getInt(R.styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_errorIconDrawable)) {
            m43739g0(tintTypedArray.getDrawable(R.styleable.TextInputLayout_errorIconDrawable));
        }
        this.f51094c.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(this.f51094c, 2);
        this.f51094c.setClickable(false);
        this.f51094c.setPressable(false);
        this.f51094c.setFocusable(false);
    }

    /* renamed from: D0 */
    public final void m43775D0() {
        int i;
        int visibility = this.f51108q.getVisibility();
        boolean z = false;
        if (this.f51107p != null && !this.f51109r) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility != i) {
            AbstractC13999tS m43724o = m43724o();
            if (i == 0) {
                z = true;
            }
            m43724o.mo22420q(z);
        }
        m43781A0();
        this.f51108q.setVisibility(i);
        this.f51092a.m43817f0();
    }

    /* renamed from: E */
    public final void m43774E(TintTypedArray tintTypedArray) {
        this.f51108q.setVisibility(8);
        this.f51108q.setId(R.id.textinput_suffix_text);
        this.f51108q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.setAccessibilityLiveRegion(this.f51108q, 1);
        m43711u0(tintTypedArray.getResourceId(R.styleable.TextInputLayout_suffixTextAppearance, 0));
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_suffixTextColor)) {
            m43709v0(tintTypedArray.getColorStateList(R.styleable.TextInputLayout_suffixTextColor));
        }
        m43713t0(tintTypedArray.getText(R.styleable.TextInputLayout_suffixText));
    }

    /* renamed from: F */
    public boolean m43773F() {
        return this.f51098g.isCheckable();
    }

    /* renamed from: G */
    public boolean m43772G() {
        if (m43780B() && this.f51098g.isChecked()) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public boolean m43771H() {
        if (this.f51093b.getVisibility() == 0 && this.f51098g.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public boolean m43770I() {
        if (this.f51094c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public boolean m43769J() {
        if (this.f51100i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public void m43768K(boolean z) {
        this.f51109r = z;
        m43775D0();
    }

    /* renamed from: L */
    public void m43767L() {
        m43779B0();
        m43765N();
        m43766M();
        if (m43724o().mo22418t()) {
            m43703y0(this.f51092a.m43834U());
        }
    }

    /* renamed from: M */
    public void m43766M() {
        AbstractC19547dc0.m31847d(this.f51092a, this.f51098g, this.f51102k);
    }

    /* renamed from: N */
    public void m43765N() {
        AbstractC19547dc0.m31847d(this.f51092a, this.f51094c, this.f51095d);
    }

    /* renamed from: O */
    public void m43764O(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        AbstractC13999tS m43724o = m43724o();
        boolean z3 = true;
        if (m43724o.mo22425l() && (isChecked = this.f51098g.isChecked()) != m43724o.mo22424m()) {
            this.f51098g.setChecked(!isChecked);
            z2 = true;
        } else {
            z2 = false;
        }
        if (m43724o.mo22427j() && (isActivated = this.f51098g.isActivated()) != m43724o.mo22426k()) {
            m43761R(!isActivated);
        } else {
            z3 = z2;
        }
        if (z || z3) {
            m43766M();
        }
    }

    /* renamed from: P */
    public void m43763P(TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.f51101j.remove(onEndIconChangedListener);
    }

    /* renamed from: Q */
    public final void m43762Q() {
        AccessibilityManager accessibilityManager;
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f51112u;
        if (touchExplorationStateChangeListener != null && (accessibilityManager = this.f51111t) != null) {
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
        }
    }

    /* renamed from: R */
    public void m43761R(boolean z) {
        this.f51098g.setActivated(z);
    }

    /* renamed from: S */
    public void m43760S(boolean z) {
        this.f51098g.setCheckable(z);
    }

    /* renamed from: T */
    public void m43759T(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        m43758U(charSequence);
    }

    /* renamed from: U */
    public void m43758U(CharSequence charSequence) {
        if (m43726n() != charSequence) {
            this.f51098g.setContentDescription(charSequence);
        }
    }

    /* renamed from: V */
    public void m43757V(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        m43756W(drawable);
    }

    /* renamed from: W */
    public void m43756W(Drawable drawable) {
        this.f51098g.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC19547dc0.m31850a(this.f51092a, this.f51098g, this.f51102k, this.f51103l);
            m43766M();
        }
    }

    /* renamed from: X */
    public void m43755X(int i) {
        if (i >= 0) {
            if (i != this.f51104m) {
                this.f51104m = i;
                AbstractC19547dc0.m31844g(this.f51098g, i);
                AbstractC19547dc0.m31844g(this.f51094c, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    /* renamed from: Y */
    public void m43754Y(int i) {
        boolean z;
        if (this.f51100i == i) {
            return;
        }
        m43705x0(m43724o());
        int i2 = this.f51100i;
        this.f51100i = i;
        m43730l(i2);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        m43743e0(z);
        AbstractC13999tS m43724o = m43724o();
        m43757V(m43710v(m43724o));
        m43759T(m43724o.mo22434c());
        m43760S(m43724o.mo22425l());
        if (m43724o.mo22428i(this.f51092a.getBoxBackgroundMode())) {
            m43707w0(m43724o);
            m43753Z(m43724o.mo22431f());
            EditText editText = this.f51110s;
            if (editText != null) {
                m43724o.mo22423n(editText);
                m43729l0(m43724o);
            }
            AbstractC19547dc0.m31850a(this.f51092a, this.f51098g, this.f51102k, this.f51103l);
            m43764O(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f51092a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
    }

    /* renamed from: Z */
    public void m43753Z(View.OnClickListener onClickListener) {
        AbstractC19547dc0.m31843h(this.f51098g, onClickListener, this.f51106o);
    }

    /* renamed from: a0 */
    public void m43751a0(View.OnLongClickListener onLongClickListener) {
        this.f51106o = onLongClickListener;
        AbstractC19547dc0.m31842i(this.f51098g, onLongClickListener);
    }

    /* renamed from: b0 */
    public void m43749b0(ImageView.ScaleType scaleType) {
        this.f51105n = scaleType;
        AbstractC19547dc0.m31841j(this.f51098g, scaleType);
        AbstractC19547dc0.m31841j(this.f51094c, scaleType);
    }

    /* renamed from: c0 */
    public void m43747c0(ColorStateList colorStateList) {
        if (this.f51102k != colorStateList) {
            this.f51102k = colorStateList;
            AbstractC19547dc0.m31850a(this.f51092a, this.f51098g, colorStateList, this.f51103l);
        }
    }

    /* renamed from: d0 */
    public void m43745d0(PorterDuff.Mode mode) {
        if (this.f51103l != mode) {
            this.f51103l = mode;
            AbstractC19547dc0.m31850a(this.f51092a, this.f51098g, this.f51102k, mode);
        }
    }

    /* renamed from: e0 */
    public void m43743e0(boolean z) {
        int i;
        if (m43771H() != z) {
            CheckableImageButton checkableImageButton = this.f51098g;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m43781A0();
            m43777C0();
            this.f51092a.m43817f0();
        }
    }

    /* renamed from: f0 */
    public void m43741f0(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        m43739g0(drawable);
        m43765N();
    }

    /* renamed from: g */
    public void m43740g(TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.f51101j.add(onEndIconChangedListener);
    }

    /* renamed from: g0 */
    public void m43739g0(Drawable drawable) {
        this.f51094c.setImageDrawable(drawable);
        m43779B0();
        AbstractC19547dc0.m31850a(this.f51092a, this.f51094c, this.f51095d, this.f51096e);
    }

    /* renamed from: h */
    public final void m43738h() {
        if (this.f51112u != null && this.f51111t != null && ViewCompat.isAttachedToWindow(this)) {
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(this.f51111t, this.f51112u);
        }
    }

    /* renamed from: h0 */
    public void m43737h0(View.OnClickListener onClickListener) {
        AbstractC19547dc0.m31843h(this.f51094c, onClickListener, this.f51097f);
    }

    /* renamed from: i */
    public void m43736i() {
        this.f51098g.performClick();
        this.f51098g.jumpDrawablesToCurrentState();
    }

    /* renamed from: i0 */
    public void m43735i0(View.OnLongClickListener onLongClickListener) {
        this.f51097f = onLongClickListener;
        AbstractC19547dc0.m31842i(this.f51094c, onLongClickListener);
    }

    /* renamed from: j */
    public void m43734j() {
        this.f51101j.clear();
    }

    /* renamed from: j0 */
    public void m43733j0(ColorStateList colorStateList) {
        if (this.f51095d != colorStateList) {
            this.f51095d = colorStateList;
            AbstractC19547dc0.m31850a(this.f51092a, this.f51094c, colorStateList, this.f51096e);
        }
    }

    /* renamed from: k */
    public final CheckableImageButton m43732k(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        AbstractC19547dc0.m31846e(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* renamed from: k0 */
    public void m43731k0(PorterDuff.Mode mode) {
        if (this.f51096e != mode) {
            this.f51096e = mode;
            AbstractC19547dc0.m31850a(this.f51092a, this.f51094c, this.f51095d, mode);
        }
    }

    /* renamed from: l */
    public final void m43730l(int i) {
        Iterator it = this.f51101j.iterator();
        while (it.hasNext()) {
            ((TextInputLayout.OnEndIconChangedListener) it.next()).onEndIconChanged(this.f51092a, i);
        }
    }

    /* renamed from: l0 */
    public final void m43729l0(AbstractC13999tS abstractC13999tS) {
        if (this.f51110s == null) {
            return;
        }
        if (abstractC13999tS.mo22432e() != null) {
            this.f51110s.setOnFocusChangeListener(abstractC13999tS.mo22432e());
        }
        if (abstractC13999tS.mo22430g() != null) {
            this.f51098g.setOnFocusChangeListener(abstractC13999tS.mo22430g());
        }
    }

    /* renamed from: m */
    public CheckableImageButton m43728m() {
        if (m43770I()) {
            return this.f51094c;
        }
        if (m43780B() && m43771H()) {
            return this.f51098g;
        }
        return null;
    }

    /* renamed from: m0 */
    public void m43727m0(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        m43725n0(charSequence);
    }

    /* renamed from: n */
    public CharSequence m43726n() {
        return this.f51098g.getContentDescription();
    }

    /* renamed from: n0 */
    public void m43725n0(CharSequence charSequence) {
        this.f51098g.setContentDescription(charSequence);
    }

    /* renamed from: o */
    public AbstractC13999tS m43724o() {
        return this.f51099h.m43698c(this.f51100i);
    }

    /* renamed from: o0 */
    public void m43723o0(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        m43721p0(drawable);
    }

    /* renamed from: p */
    public Drawable m43722p() {
        return this.f51098g.getDrawable();
    }

    /* renamed from: p0 */
    public void m43721p0(Drawable drawable) {
        this.f51098g.setImageDrawable(drawable);
    }

    /* renamed from: q */
    public int m43720q() {
        return this.f51104m;
    }

    /* renamed from: q0 */
    public void m43719q0(boolean z) {
        if (z && this.f51100i != 1) {
            m43754Y(1);
        } else if (!z) {
            m43754Y(0);
        }
    }

    /* renamed from: r */
    public int m43718r() {
        return this.f51100i;
    }

    /* renamed from: r0 */
    public void m43717r0(ColorStateList colorStateList) {
        this.f51102k = colorStateList;
        AbstractC19547dc0.m31850a(this.f51092a, this.f51098g, colorStateList, this.f51103l);
    }

    /* renamed from: s */
    public ImageView.ScaleType m43716s() {
        return this.f51105n;
    }

    /* renamed from: s0 */
    public void m43715s0(PorterDuff.Mode mode) {
        this.f51103l = mode;
        AbstractC19547dc0.m31850a(this.f51092a, this.f51098g, this.f51102k, mode);
    }

    /* renamed from: t */
    public CheckableImageButton m43714t() {
        return this.f51098g;
    }

    /* renamed from: t0 */
    public void m43713t0(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f51107p = charSequence2;
        this.f51108q.setText(charSequence);
        m43775D0();
    }

    /* renamed from: u */
    public Drawable m43712u() {
        return this.f51094c.getDrawable();
    }

    /* renamed from: u0 */
    public void m43711u0(int i) {
        TextViewCompat.setTextAppearance(this.f51108q, i);
    }

    /* renamed from: v */
    public final int m43710v(AbstractC13999tS abstractC13999tS) {
        int i = this.f51099h.f51120c;
        if (i == 0) {
            return abstractC13999tS.mo22433d();
        }
        return i;
    }

    /* renamed from: v0 */
    public void m43709v0(ColorStateList colorStateList) {
        this.f51108q.setTextColor(colorStateList);
    }

    /* renamed from: w */
    public CharSequence m43708w() {
        return this.f51098g.getContentDescription();
    }

    /* renamed from: w0 */
    public final void m43707w0(AbstractC13999tS abstractC13999tS) {
        abstractC13999tS.mo897s();
        this.f51112u = abstractC13999tS.mo22429h();
        m43738h();
    }

    /* renamed from: x */
    public Drawable m43706x() {
        return this.f51098g.getDrawable();
    }

    /* renamed from: x0 */
    public final void m43705x0(AbstractC13999tS abstractC13999tS) {
        m43762Q();
        this.f51112u = null;
        abstractC13999tS.mo22417u();
    }

    /* renamed from: y */
    public CharSequence m43704y() {
        return this.f51107p;
    }

    /* renamed from: y0 */
    public final void m43703y0(boolean z) {
        if (z && m43722p() != null) {
            Drawable mutate = DrawableCompat.wrap(m43722p()).mutate();
            DrawableCompat.setTint(mutate, this.f51092a.getErrorCurrentTextColors());
            this.f51098g.setImageDrawable(mutate);
            return;
        }
        AbstractC19547dc0.m31850a(this.f51092a, this.f51098g, this.f51102k, this.f51103l);
    }

    /* renamed from: z */
    public ColorStateList m43702z() {
        return this.f51108q.getTextColors();
    }

    /* renamed from: z0 */
    public void m43701z0(boolean z) {
        if (this.f51100i == 1) {
            this.f51098g.performClick();
            if (z) {
                this.f51098g.jumpDrawablesToCurrentState();
            }
        }
    }
}
