package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;

    /* renamed from: y0 */
    public static final int f51010y0 = R.style.Widget_Design_TextInputLayout;

    /* renamed from: z0 */
    public static final int[][] f51011z0 = {new int[]{16842919}, new int[0]};

    /* renamed from: A */
    public boolean f51012A;

    /* renamed from: B */
    public CharSequence f51013B;

    /* renamed from: C */
    public boolean f51014C;

    /* renamed from: D */
    public MaterialShapeDrawable f51015D;

    /* renamed from: E */
    public MaterialShapeDrawable f51016E;

    /* renamed from: F */
    public StateListDrawable f51017F;

    /* renamed from: G */
    public boolean f51018G;

    /* renamed from: H */
    public MaterialShapeDrawable f51019H;

    /* renamed from: I */
    public MaterialShapeDrawable f51020I;

    /* renamed from: J */
    public ShapeAppearanceModel f51021J;

    /* renamed from: K */
    public boolean f51022K;

    /* renamed from: L */
    public final int f51023L;

    /* renamed from: M */
    public int f51024M;

    /* renamed from: N */
    public int f51025N;

    /* renamed from: O */
    public int f51026O;

    /* renamed from: P */
    public int f51027P;

    /* renamed from: Q */
    public int f51028Q;

    /* renamed from: R */
    public int f51029R;

    /* renamed from: S */
    public int f51030S;

    /* renamed from: T */
    public final Rect f51031T;

    /* renamed from: U */
    public final Rect f51032U;

    /* renamed from: V */
    public final RectF f51033V;

    /* renamed from: W */
    public Typeface f51034W;

    /* renamed from: a */
    public final FrameLayout f51035a;

    /* renamed from: a0 */
    public Drawable f51036a0;

    /* renamed from: b */
    public final OL1 f51037b;

    /* renamed from: b0 */
    public int f51038b0;

    /* renamed from: c */
    public final C7118a f51039c;

    /* renamed from: c0 */
    public final LinkedHashSet f51040c0;

    /* renamed from: d */
    public EditText f51041d;

    /* renamed from: d0 */
    public Drawable f51042d0;

    /* renamed from: e */
    public CharSequence f51043e;

    /* renamed from: e0 */
    public int f51044e0;

    /* renamed from: f */
    public int f51045f;

    /* renamed from: f0 */
    public Drawable f51046f0;

    /* renamed from: g */
    public int f51047g;

    /* renamed from: g0 */
    public ColorStateList f51048g0;

    /* renamed from: h */
    public int f51049h;

    /* renamed from: h0 */
    public ColorStateList f51050h0;

    /* renamed from: i */
    public int f51051i;

    /* renamed from: i0 */
    public int f51052i0;

    /* renamed from: j */
    public final C19209be0 f51053j;

    /* renamed from: j0 */
    public int f51054j0;

    /* renamed from: k */
    public boolean f51055k;

    /* renamed from: k0 */
    public int f51056k0;

    /* renamed from: l */
    public int f51057l;

    /* renamed from: l0 */
    public ColorStateList f51058l0;

    /* renamed from: m */
    public boolean f51059m;

    /* renamed from: m0 */
    public int f51060m0;

    /* renamed from: n */
    public LengthCounter f51061n;

    /* renamed from: n0 */
    public int f51062n0;

    /* renamed from: o */
    public TextView f51063o;

    /* renamed from: o0 */
    public int f51064o0;

    /* renamed from: p */
    public int f51065p;

    /* renamed from: p0 */
    public int f51066p0;

    /* renamed from: q */
    public int f51067q;

    /* renamed from: q0 */
    public int f51068q0;

    /* renamed from: r */
    public CharSequence f51069r;

    /* renamed from: r0 */
    public boolean f51070r0;

    /* renamed from: s */
    public boolean f51071s;

    /* renamed from: s0 */
    public final CollapsingTextHelper f51072s0;

    /* renamed from: t */
    public TextView f51073t;

    /* renamed from: t0 */
    public boolean f51074t0;

    /* renamed from: u */
    public ColorStateList f51075u;

    /* renamed from: u0 */
    public boolean f51076u0;

    /* renamed from: v */
    public int f51077v;

    /* renamed from: v0 */
    public ValueAnimator f51078v0;

    /* renamed from: w */
    public Fade f51079w;

    /* renamed from: w0 */
    public boolean f51080w0;

    /* renamed from: x */
    public Fade f51081x;

    /* renamed from: x0 */
    public boolean f51082x0;

    /* renamed from: y */
    public ColorStateList f51083y;

    /* renamed from: z */
    public ColorStateList f51084z;

    /* loaded from: classes4.dex */
    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {

        /* renamed from: d */
        public final TextInputLayout f51085d;

        public AccessibilityDelegate(@NonNull TextInputLayout textInputLayout) {
            this.f51085d = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            CharSequence charSequence;
            String str;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            EditText editText = this.f51085d.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = this.f51085d.getHint();
            CharSequence error = this.f51085d.getError();
            CharSequence placeholderText = this.f51085d.getPlaceholderText();
            int counterMaxLength = this.f51085d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f51085d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            boolean z = !isEmpty;
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.f51085d.m43844K();
            boolean z5 = !TextUtils.isEmpty(error);
            if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
                z2 = false;
            }
            if (z3) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.f51085d.f51037b.m67075A(accessibilityNodeInfoCompat);
            if (z) {
                accessibilityNodeInfoCompat.setText(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                accessibilityNodeInfoCompat.setText(str);
                if (z4 && placeholderText != null) {
                    accessibilityNodeInfoCompat.setText(str + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.setHintText(str);
                } else {
                    if (z) {
                        str = ((Object) charSequence) + ", " + str;
                    }
                    accessibilityNodeInfoCompat.setText(str);
                }
                accessibilityNodeInfoCompat.setShowingHintText(isEmpty);
            }
            accessibilityNodeInfoCompat.setMaxTextLength((charSequence == null || charSequence.length() != counterMaxLength) ? -1 : -1);
            if (z2) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.setError(error);
            }
            View m51926t = this.f51085d.f51053j.m51926t();
            if (m51926t != null) {
                accessibilityNodeInfoCompat.setLabelFor(m51926t);
            }
            this.f51085d.f51039c.m43724o().mo22422o(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f51085d.f51039c.m43724o().mo22421p(view, accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface EndIconMode {
    }

    /* loaded from: classes4.dex */
    public interface LengthCounter {
        int countLength(@Nullable Editable editable);
    }

    /* loaded from: classes4.dex */
    public interface OnEditTextAttachedListener {
        void onEditTextAttached(@NonNull TextInputLayout textInputLayout);
    }

    /* loaded from: classes4.dex */
    public interface OnEndIconChangedListener {
        void onEndIconChanged(@NonNull TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: classes4.dex */
    public class C7112a implements TextWatcher {
        public C7112a() {
            TextInputLayout.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m43807k0(!textInputLayout.f51082x0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f51055k) {
                textInputLayout2.m43825b0(editable);
            }
            if (TextInputLayout.this.f51071s) {
                TextInputLayout.this.m43799o0(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: classes4.dex */
    public class RunnableC7113b implements Runnable {
        public RunnableC7113b() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f51039c.m43736i();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: classes4.dex */
    public class RunnableC7114c implements Runnable {
        public RunnableC7114c() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f51041d.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: classes4.dex */
    public class C7115d implements ValueAnimator.AnimatorUpdateListener {
        public C7115d() {
            TextInputLayout.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f51072s0.setExpansionFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    /* loaded from: classes4.dex */
    public static class C7116e extends AbsSavedState {
        public static final Parcelable.Creator<C7116e> CREATOR = new C7117a();

        /* renamed from: b */
        public CharSequence f51090b;

        /* renamed from: c */
        public boolean f51091c;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$e$a */
        /* loaded from: classes4.dex */
        public class C7117a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C7116e createFromParcel(Parcel parcel) {
                return new C7116e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C7116e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7116e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C7116e[] newArray(int i) {
                return new C7116e[i];
            }
        }

        public C7116e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f51090b) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f51090b, parcel, i);
            parcel.writeInt(this.f51091c ? 1 : 0);
        }

        public C7116e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f51090b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f51091c = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: F */
    public static Drawable m43849F(MaterialShapeDrawable materialShapeDrawable, int i, int i2, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{MaterialColors.layer(i2, i, 0.1f), i}), materialShapeDrawable, materialShapeDrawable);
    }

    /* renamed from: I */
    public static Drawable m43846I(Context context, MaterialShapeDrawable materialShapeDrawable, int i, int[][] iArr) {
        int color = MaterialColors.getColor(context, R.attr.colorSurface, "TextInputLayout");
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int layer = MaterialColors.layer(i, color, 0.1f);
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, new int[]{layer, 0}));
        materialShapeDrawable2.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{layer, color});
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
    }

    /* renamed from: M */
    public static /* synthetic */ int m43842M(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* renamed from: Q */
    public static void m43838Q(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m43838Q((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m43828a(Editable editable) {
        return m43842M(editable);
    }

    /* renamed from: c0 */
    public static void m43823c0(Context context, TextView textView, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = R.string.character_counter_overflowed_content_description;
        } else {
            i3 = R.string.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i3, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f51041d;
        if ((editText instanceof AutoCompleteTextView) && !AbstractC1534VQ.m65851a(editText)) {
            int color = MaterialColors.getColor(this.f51041d, R.attr.colorControlHighlight);
            int i = this.f51024M;
            if (i == 2) {
                return m43846I(getContext(), this.f51015D, color, f51011z0);
            }
            if (i == 1) {
                return m43849F(this.f51015D, this.f51030S, color, f51011z0);
            }
            return null;
        }
        return this.f51015D;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f51017F == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f51017F = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f51017F.addState(new int[0], m43850E(false));
        }
        return this.f51017F;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f51016E == null) {
            this.f51016E = m43850E(true);
        }
        return this.f51016E;
    }

    private void setEditText(EditText editText) {
        if (this.f51041d == null) {
            if (getEndIconMode() != 3) {
                boolean z = editText instanceof TextInputEditText;
            }
            this.f51041d = editText;
            int i = this.f51045f;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.f51049h);
            }
            int i2 = this.f51047g;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.f51051i);
            }
            this.f51018G = false;
            m43841N();
            setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
            this.f51072s0.setTypefaces(this.f51041d.getTypeface());
            this.f51072s0.setExpandedTextSize(this.f51041d.getTextSize());
            this.f51072s0.setExpandedLetterSpacing(this.f51041d.getLetterSpacing());
            int gravity = this.f51041d.getGravity();
            this.f51072s0.setCollapsedTextGravity((gravity & (-113)) | 48);
            this.f51072s0.setExpandedTextGravity(gravity);
            this.f51041d.addTextChangedListener(new C7112a());
            if (this.f51048g0 == null) {
                this.f51048g0 = this.f51041d.getHintTextColors();
            }
            if (this.f51012A) {
                if (TextUtils.isEmpty(this.f51013B)) {
                    CharSequence hint = this.f51041d.getHint();
                    this.f51043e = hint;
                    setHint(hint);
                    this.f51041d.setHint((CharSequence) null);
                }
                this.f51014C = true;
            }
            if (this.f51063o != null) {
                m43825b0(this.f51041d.getText());
            }
            m43815g0();
            this.f51053j.m51940f();
            this.f51037b.bringToFront();
            this.f51039c.bringToFront();
            m43854A();
            this.f51039c.m43777C0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m43805l0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f51013B)) {
            this.f51013B = charSequence;
            this.f51072s0.setText(charSequence);
            if (!this.f51070r0) {
                m43840O();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f51071s == z) {
            return;
        }
        if (z) {
            m43814h();
        } else {
            m43837R();
            this.f51073t = null;
        }
        this.f51071s = z;
    }

    /* renamed from: A */
    public final void m43854A() {
        Iterator it = this.f51040c0.iterator();
        while (it.hasNext()) {
            ((OnEditTextAttachedListener) it.next()).onEditTextAttached(this);
        }
    }

    /* renamed from: B */
    public final void m43853B(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        if (this.f51020I != null && (materialShapeDrawable = this.f51019H) != null) {
            materialShapeDrawable.draw(canvas);
            if (this.f51041d.isFocused()) {
                Rect bounds = this.f51020I.getBounds();
                Rect bounds2 = this.f51019H.getBounds();
                float expansionFraction = this.f51072s0.getExpansionFraction();
                int centerX = bounds2.centerX();
                bounds.left = AnimationUtils.lerp(centerX, bounds2.left, expansionFraction);
                bounds.right = AnimationUtils.lerp(centerX, bounds2.right, expansionFraction);
                this.f51020I.draw(canvas);
            }
        }
    }

    /* renamed from: C */
    public final void m43852C(Canvas canvas) {
        if (this.f51012A) {
            this.f51072s0.draw(canvas);
        }
    }

    /* renamed from: D */
    public final void m43851D(boolean z) {
        ValueAnimator valueAnimator = this.f51078v0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f51078v0.cancel();
        }
        if (z && this.f51076u0) {
            m43810j(0.0f);
        } else {
            this.f51072s0.setExpansionFraction(0.0f);
        }
        if (m43786z() && ((AbstractC16876vB) this.f51015D).m1102B()) {
            m43789w();
        }
        this.f51070r0 = true;
        m43845J();
        this.f51037b.m67061l(true);
        this.f51039c.m43768K(true);
    }

    /* renamed from: E */
    public final MaterialShapeDrawable m43850E(boolean z) {
        float f;
        float dimensionPixelOffset;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z) {
            f = dimensionPixelOffset2;
        } else {
            f = 0.0f;
        }
        EditText editText = this.f51041d;
        if (editText instanceof MaterialAutoCompleteTextView) {
            dimensionPixelOffset = ((MaterialAutoCompleteTextView) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel build = ShapeAppearanceModel.builder().setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomLeftCornerSize(dimensionPixelOffset2).setBottomRightCornerSize(dimensionPixelOffset2).build();
        MaterialShapeDrawable createWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(getContext(), dimensionPixelOffset);
        createWithElevationOverlay.setShapeAppearanceModel(build);
        createWithElevationOverlay.setPadding(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return createWithElevationOverlay;
    }

    /* renamed from: G */
    public final int m43848G(int i, boolean z) {
        int compoundPaddingLeft = i + this.f51041d.getCompoundPaddingLeft();
        if (getPrefixText() != null && !z) {
            return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    /* renamed from: H */
    public final int m43847H(int i, boolean z) {
        int compoundPaddingRight = i - this.f51041d.getCompoundPaddingRight();
        if (getPrefixText() != null && z) {
            return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
        }
        return compoundPaddingRight;
    }

    /* renamed from: J */
    public final void m43845J() {
        TextView textView = this.f51073t;
        if (textView != null && this.f51071s) {
            textView.setText((CharSequence) null);
            TransitionManager.beginDelayedTransition(this.f51035a, this.f51081x);
            this.f51073t.setVisibility(4);
        }
    }

    /* renamed from: K */
    public final boolean m43844K() {
        return this.f51070r0;
    }

    /* renamed from: L */
    public final boolean m43843L() {
        if (this.f51024M == 1 && this.f51041d.getMinLines() <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final void m43841N() {
        m43802n();
        m43813h0();
        m43795q0();
        m43830Y();
        m43812i();
        if (this.f51024M != 0) {
            m43809j0();
        }
        m43836S();
    }

    /* renamed from: O */
    public final void m43840O() {
        if (!m43786z()) {
            return;
        }
        RectF rectF = this.f51033V;
        this.f51072s0.getCollapsedTextActualBounds(rectF, this.f51041d.getWidth(), this.f51041d.getGravity());
        if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
            m43804m(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f51026O);
            ((AbstractC16876vB) this.f51015D).m1099E(rectF);
        }
    }

    /* renamed from: P */
    public final void m43839P() {
        if (m43786z() && !this.f51070r0) {
            m43789w();
            m43840O();
        }
    }

    /* renamed from: R */
    public final void m43837R() {
        TextView textView = this.f51073t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: S */
    public final void m43836S() {
        EditText editText = this.f51041d;
        if (!(editText instanceof AutoCompleteTextView)) {
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        if (autoCompleteTextView.getDropDownBackground() == null) {
            int i = this.f51024M;
            if (i == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
            } else if (i == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
            }
        }
    }

    /* renamed from: T */
    public void m43835T(TextView textView, int i) {
        try {
            TextViewCompat.setTextAppearance(textView, i);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            TextViewCompat.setTextAppearance(textView, R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.design_error));
        }
    }

    /* renamed from: U */
    public boolean m43834U() {
        return this.f51053j.m51934l();
    }

    /* renamed from: V */
    public final boolean m43833V() {
        if ((this.f51039c.m43770I() || ((this.f51039c.m43780B() && isEndIconVisible()) || this.f51039c.m43704y() != null)) && this.f51039c.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public final boolean m43832W() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f51037b.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public final void m43831X() {
        if (this.f51073t != null && this.f51071s && !TextUtils.isEmpty(this.f51069r)) {
            this.f51073t.setText(this.f51069r);
            TransitionManager.beginDelayedTransition(this.f51035a, this.f51079w);
            this.f51073t.setVisibility(0);
            this.f51073t.bringToFront();
            announceForAccessibility(this.f51069r);
        }
    }

    /* renamed from: Y */
    public final void m43830Y() {
        if (this.f51024M == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                this.f51025N = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                this.f51025N = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    /* renamed from: Z */
    public final void m43829Z(Rect rect) {
        MaterialShapeDrawable materialShapeDrawable = this.f51019H;
        if (materialShapeDrawable != null) {
            int i = rect.bottom;
            materialShapeDrawable.setBounds(rect.left, i - this.f51027P, rect.right, i);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f51020I;
        if (materialShapeDrawable2 != null) {
            int i2 = rect.bottom;
            materialShapeDrawable2.setBounds(rect.left, i2 - this.f51028Q, rect.right, i2);
        }
    }

    /* renamed from: a0 */
    public final void m43827a0() {
        Editable text;
        if (this.f51063o != null) {
            EditText editText = this.f51041d;
            if (editText == null) {
                text = null;
            } else {
                text = editText.getText();
            }
            m43825b0(text);
        }
    }

    public void addOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener onEditTextAttachedListener) {
        this.f51040c0.add(onEditTextAttachedListener);
        if (this.f51041d != null) {
            onEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(@NonNull OnEndIconChangedListener onEndIconChangedListener) {
        this.f51039c.m43740g(onEndIconChangedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f51035a.addView(view, layoutParams2);
            this.f51035a.setLayoutParams(layoutParams);
            m43809j0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b0 */
    public void m43825b0(Editable editable) {
        boolean z;
        int countLength = this.f51061n.countLength(editable);
        boolean z2 = this.f51059m;
        int i = this.f51057l;
        if (i == -1) {
            this.f51063o.setText(String.valueOf(countLength));
            this.f51063o.setContentDescription(null);
            this.f51059m = false;
        } else {
            if (countLength > i) {
                z = true;
            } else {
                z = false;
            }
            this.f51059m = z;
            m43823c0(getContext(), this.f51063o, countLength, this.f51057l, this.f51059m);
            if (z2 != this.f51059m) {
                m43821d0();
            }
            this.f51063o.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(countLength), Integer.valueOf(this.f51057l))));
        }
        if (this.f51041d != null && z2 != this.f51059m) {
            m43807k0(false);
            m43795q0();
            m43815g0();
        }
    }

    public void clearOnEditTextAttachedListeners() {
        this.f51040c0.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.f51039c.m43734j();
    }

    /* renamed from: d0 */
    public final void m43821d0() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f51063o;
        if (textView != null) {
            if (this.f51059m) {
                i = this.f51065p;
            } else {
                i = this.f51067q;
            }
            m43835T(textView, i);
            if (!this.f51059m && (colorStateList2 = this.f51083y) != null) {
                this.f51063o.setTextColor(colorStateList2);
            }
            if (this.f51059m && (colorStateList = this.f51084z) != null) {
                this.f51063o.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i) {
        AutofillId autofillId;
        ViewStructure newChild;
        EditText editText = this.f51041d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f51043e == null) {
            autofillId = getAutofillId();
            viewStructure.setAutofillId(autofillId);
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f51035a.getChildCount());
            for (int i2 = 0; i2 < this.f51035a.getChildCount(); i2++) {
                View childAt = this.f51035a.getChildAt(i2);
                newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f51041d) {
                    newChild.setHint(getHint());
                }
            }
            return;
        }
        boolean z = this.f51014C;
        this.f51014C = false;
        CharSequence hint = editText.getHint();
        this.f51041d.setHint(this.f51043e);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f51041d.setHint(hint);
            this.f51014C = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.f51082x0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f51082x0 = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        m43852C(canvas);
        m43853B(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        if (this.f51080w0) {
            return;
        }
        boolean z2 = true;
        this.f51080w0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.f51072s0;
        if (collapsingTextHelper != null) {
            z = collapsingTextHelper.setState(drawableState);
        } else {
            z = false;
        }
        if (this.f51041d != null) {
            m43807k0((ViewCompat.isLaidOut(this) && isEnabled()) ? false : false);
        }
        m43815g0();
        m43795q0();
        if (z) {
            invalidate();
        }
        this.f51080w0 = false;
    }

    /* renamed from: e0 */
    public final void m43819e0(boolean z) {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), R.attr.colorControlActivated);
        EditText editText = this.f51041d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null && colorStateListOrNull != null) {
                textCursorDrawable2 = this.f51041d.getTextCursorDrawable();
                if (z) {
                    ColorStateList colorStateList = this.f51058l0;
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(this.f51029R);
                    }
                    colorStateListOrNull = colorStateList;
                }
                DrawableCompat.setTintList(textCursorDrawable2, colorStateListOrNull);
            }
        }
    }

    /* renamed from: f0 */
    public boolean m43817f0() {
        boolean z;
        if (this.f51041d == null) {
            return false;
        }
        boolean z2 = true;
        if (m43832W()) {
            int measuredWidth = this.f51037b.getMeasuredWidth() - this.f51041d.getPaddingLeft();
            if (this.f51036a0 == null || this.f51038b0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f51036a0 = colorDrawable;
                this.f51038b0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this.f51041d);
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f51036a0;
            if (drawable != drawable2) {
                TextViewCompat.setCompoundDrawablesRelative(this.f51041d, drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f51036a0 != null) {
                Drawable[] compoundDrawablesRelative2 = TextViewCompat.getCompoundDrawablesRelative(this.f51041d);
                TextViewCompat.setCompoundDrawablesRelative(this.f51041d, null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f51036a0 = null;
                z = true;
            }
            z = false;
        }
        if (m43833V()) {
            int measuredWidth2 = this.f51039c.m43782A().getMeasuredWidth() - this.f51041d.getPaddingRight();
            CheckableImageButton m43728m = this.f51039c.m43728m();
            if (m43728m != null) {
                measuredWidth2 = measuredWidth2 + m43728m.getMeasuredWidth() + MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) m43728m.getLayoutParams());
            }
            Drawable[] compoundDrawablesRelative3 = TextViewCompat.getCompoundDrawablesRelative(this.f51041d);
            Drawable drawable3 = this.f51042d0;
            if (drawable3 != null && this.f51044e0 != measuredWidth2) {
                this.f51044e0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.setCompoundDrawablesRelative(this.f51041d, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f51042d0, compoundDrawablesRelative3[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f51042d0 = colorDrawable2;
                    this.f51044e0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.f51042d0;
                if (drawable4 != drawable5) {
                    this.f51046f0 = drawable4;
                    TextViewCompat.setCompoundDrawablesRelative(this.f51041d, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z2 = z;
                }
            }
        } else if (this.f51042d0 != null) {
            Drawable[] compoundDrawablesRelative4 = TextViewCompat.getCompoundDrawablesRelative(this.f51041d);
            if (compoundDrawablesRelative4[2] == this.f51042d0) {
                TextViewCompat.setCompoundDrawablesRelative(this.f51041d, compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f51046f0, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.f51042d0 = null;
        } else {
            return z;
        }
        return z2;
    }

    /* renamed from: g0 */
    public void m43815g0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f51041d;
        if (editText == null || this.f51024M != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (m43834U()) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f51059m && (textView = this.f51063o) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            DrawableCompat.clearColorFilter(background);
            this.f51041d.refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f51041d;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m43792t();
        }
        return super.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.f51024M;
        if (i != 1 && i != 2) {
            throw new IllegalStateException();
        }
        return this.f51015D;
    }

    public int getBoxBackgroundColor() {
        return this.f51030S;
    }

    public int getBoxBackgroundMode() {
        return this.f51024M;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f51025N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.f51021J.getBottomLeftCornerSize().getCornerSize(this.f51033V);
        }
        return this.f51021J.getBottomRightCornerSize().getCornerSize(this.f51033V);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.f51021J.getBottomRightCornerSize().getCornerSize(this.f51033V);
        }
        return this.f51021J.getBottomLeftCornerSize().getCornerSize(this.f51033V);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.f51021J.getTopLeftCornerSize().getCornerSize(this.f51033V);
        }
        return this.f51021J.getTopRightCornerSize().getCornerSize(this.f51033V);
    }

    public float getBoxCornerRadiusTopStart() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.f51021J.getTopRightCornerSize().getCornerSize(this.f51033V);
        }
        return this.f51021J.getTopLeftCornerSize().getCornerSize(this.f51033V);
    }

    public int getBoxStrokeColor() {
        return this.f51056k0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f51058l0;
    }

    public int getBoxStrokeWidth() {
        return this.f51027P;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f51028Q;
    }

    public int getCounterMaxLength() {
        return this.f51057l;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f51055k && this.f51059m && (textView = this.f51063o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f51084z;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f51083y;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f51048g0;
    }

    @Nullable
    public EditText getEditText() {
        return this.f51041d;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f51039c.m43726n();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f51039c.m43722p();
    }

    public int getEndIconMinSize() {
        return this.f51039c.m43720q();
    }

    public int getEndIconMode() {
        return this.f51039c.m43718r();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f51039c.m43716s();
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f51039c.m43714t();
    }

    @Nullable
    public CharSequence getError() {
        if (this.f51053j.m51964A()) {
            return this.f51053j.m51930p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f51053j.m51932n();
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f51053j.m51931o();
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.f51053j.m51929q();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f51039c.m43712u();
    }

    @Nullable
    public CharSequence getHelperText() {
        if (this.f51053j.m51963B()) {
            return this.f51053j.m51927s();
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        return this.f51053j.m51925u();
    }

    @Nullable
    public CharSequence getHint() {
        if (this.f51012A) {
            return this.f51013B;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.f51072s0.getCollapsedTextHeight();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.f51072s0.getCurrentCollapsedTextColor();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f51050h0;
    }

    @NonNull
    public LengthCounter getLengthCounter() {
        return this.f51061n;
    }

    public int getMaxEms() {
        return this.f51047g;
    }

    @InterfaceC2055Px
    public int getMaxWidth() {
        return this.f51051i;
    }

    public int getMinEms() {
        return this.f51045f;
    }

    @InterfaceC2055Px
    public int getMinWidth() {
        return this.f51049h;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f51039c.m43708w();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f51039c.m43706x();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f51071s) {
            return this.f51069r;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f51077v;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f51075u;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f51037b.m67072a();
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f51037b.m67071b();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f51037b.m67070c();
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f51021J;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f51037b.m67069d();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f51037b.m67068e();
    }

    public int getStartIconMinSize() {
        return this.f51037b.m67067f();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f51037b.m67066g();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f51039c.m43704y();
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f51039c.m43702z();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f51039c.m43782A();
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f51034W;
    }

    /* renamed from: h */
    public final void m43814h() {
        TextView textView = this.f51073t;
        if (textView != null) {
            this.f51035a.addView(textView);
            this.f51073t.setVisibility(0);
        }
    }

    /* renamed from: h0 */
    public void m43813h0() {
        EditText editText = this.f51041d;
        if (editText != null && this.f51015D != null) {
            if ((this.f51018G || editText.getBackground() == null) && this.f51024M != 0) {
                ViewCompat.setBackground(this.f51041d, getEditTextBoxBackground());
                this.f51018G = true;
            }
        }
    }

    /* renamed from: i */
    public final void m43812i() {
        if (this.f51041d != null && this.f51024M == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                EditText editText = this.f51041d;
                ViewCompat.setPaddingRelative(editText, ViewCompat.getPaddingStart(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.getPaddingEnd(this.f51041d), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                EditText editText2 = this.f51041d;
                ViewCompat.setPaddingRelative(editText2, ViewCompat.getPaddingStart(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.getPaddingEnd(this.f51041d), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    /* renamed from: i0 */
    public final boolean m43811i0() {
        int max;
        if (this.f51041d == null || this.f51041d.getMeasuredHeight() >= (max = Math.max(this.f51039c.getMeasuredHeight(), this.f51037b.getMeasuredHeight()))) {
            return false;
        }
        this.f51041d.setMinimumHeight(max);
        return true;
    }

    public boolean isCounterEnabled() {
        return this.f51055k;
    }

    public boolean isEndIconCheckable() {
        return this.f51039c.m43773F();
    }

    public boolean isEndIconVisible() {
        return this.f51039c.m43771H();
    }

    public boolean isErrorEnabled() {
        return this.f51053j.m51964A();
    }

    public boolean isExpandedHintEnabled() {
        return this.f51074t0;
    }

    public boolean isHelperTextEnabled() {
        return this.f51053j.m51963B();
    }

    public boolean isHintAnimationEnabled() {
        return this.f51076u0;
    }

    public boolean isHintEnabled() {
        return this.f51012A;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.f51039c.m43769J();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isProvidingHint() {
        return this.f51014C;
    }

    public boolean isStartIconCheckable() {
        return this.f51037b.m67063j();
    }

    public boolean isStartIconVisible() {
        return this.f51037b.m67062k();
    }

    /* renamed from: j */
    public void m43810j(float f) {
        if (this.f51072s0.getExpansionFraction() == f) {
            return;
        }
        if (this.f51078v0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f51078v0 = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.f51078v0.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationMedium4, 167));
            this.f51078v0.addUpdateListener(new C7115d());
        }
        this.f51078v0.setFloatValues(this.f51072s0.getExpansionFraction(), f);
        this.f51078v0.start();
    }

    /* renamed from: j0 */
    public final void m43809j0() {
        if (this.f51024M != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f51035a.getLayoutParams();
            int m43792t = m43792t();
            if (m43792t != layoutParams.topMargin) {
                layoutParams.topMargin = m43792t;
                this.f51035a.requestLayout();
            }
        }
    }

    /* renamed from: k */
    public final void m43808k() {
        MaterialShapeDrawable materialShapeDrawable = this.f51015D;
        if (materialShapeDrawable == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        ShapeAppearanceModel shapeAppearanceModel2 = this.f51021J;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            this.f51015D.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (m43791u()) {
            this.f51015D.setStroke(this.f51026O, this.f51029R);
        }
        int m43800o = m43800o();
        this.f51030S = m43800o;
        this.f51015D.setFillColor(ColorStateList.valueOf(m43800o));
        m43806l();
        m43813h0();
    }

    /* renamed from: k0 */
    public void m43807k0(boolean z) {
        m43805l0(z, false);
    }

    /* renamed from: l */
    public final void m43806l() {
        ColorStateList valueOf;
        if (this.f51019H != null && this.f51020I != null) {
            if (m43790v()) {
                MaterialShapeDrawable materialShapeDrawable = this.f51019H;
                if (this.f51041d.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.f51052i0);
                } else {
                    valueOf = ColorStateList.valueOf(this.f51029R);
                }
                materialShapeDrawable.setFillColor(valueOf);
                this.f51020I.setFillColor(ColorStateList.valueOf(this.f51029R));
            }
            invalidate();
        }
    }

    /* renamed from: l0 */
    public final void m43805l0(boolean z, boolean z2) {
        boolean z3;
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.f51041d;
        boolean z4 = false;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.f51041d;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        }
        ColorStateList colorStateList2 = this.f51048g0;
        if (colorStateList2 != null) {
            this.f51072s0.setCollapsedAndExpandedTextColor(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f51048g0;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.f51068q0);
            } else {
                i = this.f51068q0;
            }
            this.f51072s0.setCollapsedAndExpandedTextColor(ColorStateList.valueOf(i));
        } else if (m43834U()) {
            this.f51072s0.setCollapsedAndExpandedTextColor(this.f51053j.m51928r());
        } else if (this.f51059m && (textView = this.f51063o) != null) {
            this.f51072s0.setCollapsedAndExpandedTextColor(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f51050h0) != null) {
            this.f51072s0.setCollapsedTextColor(colorStateList);
        }
        if (!z3 && this.f51074t0 && (!isEnabled() || !z4)) {
            if (z2 || !this.f51070r0) {
                m43851D(z);
            }
        } else if (z2 || this.f51070r0) {
            m43788x(z);
        }
    }

    /* renamed from: m */
    public final void m43804m(RectF rectF) {
        float f = rectF.left;
        int i = this.f51023L;
        rectF.left = f - i;
        rectF.right += i;
    }

    /* renamed from: m0 */
    public final void m43803m0() {
        EditText editText;
        if (this.f51073t != null && (editText = this.f51041d) != null) {
            this.f51073t.setGravity(editText.getGravity());
            this.f51073t.setPadding(this.f51041d.getCompoundPaddingLeft(), this.f51041d.getCompoundPaddingTop(), this.f51041d.getCompoundPaddingRight(), this.f51041d.getCompoundPaddingBottom());
        }
    }

    /* renamed from: n */
    public final void m43802n() {
        int i = this.f51024M;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.f51012A && !(this.f51015D instanceof AbstractC16876vB)) {
                        this.f51015D = AbstractC16876vB.m1103A(this.f51021J);
                    } else {
                        this.f51015D = new MaterialShapeDrawable(this.f51021J);
                    }
                    this.f51019H = null;
                    this.f51020I = null;
                    return;
                }
                throw new IllegalArgumentException(this.f51024M + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.f51015D = new MaterialShapeDrawable(this.f51021J);
            this.f51019H = new MaterialShapeDrawable();
            this.f51020I = new MaterialShapeDrawable();
            return;
        }
        this.f51015D = null;
        this.f51019H = null;
        this.f51020I = null;
    }

    /* renamed from: n0 */
    public final void m43801n0() {
        Editable text;
        EditText editText = this.f51041d;
        if (editText == null) {
            text = null;
        } else {
            text = editText.getText();
        }
        m43799o0(text);
    }

    /* renamed from: o */
    public final int m43800o() {
        int i = this.f51030S;
        if (this.f51024M == 1) {
            return MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface, 0), this.f51030S);
        }
        return i;
    }

    /* renamed from: o0 */
    public final void m43799o0(Editable editable) {
        if (this.f51061n.countLength(editable) == 0 && !this.f51070r0) {
            m43831X();
        } else {
            m43845J();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f51072s0.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f51041d;
        if (editText != null) {
            Rect rect = this.f51031T;
            DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            m43829Z(rect);
            if (this.f51012A) {
                this.f51072s0.setExpandedTextSize(this.f51041d.getTextSize());
                int gravity = this.f51041d.getGravity();
                this.f51072s0.setCollapsedTextGravity((gravity & (-113)) | 48);
                this.f51072s0.setExpandedTextGravity(gravity);
                this.f51072s0.setCollapsedBounds(m43798p(rect));
                this.f51072s0.setExpandedBounds(m43793s(rect));
                this.f51072s0.recalculate();
                if (m43786z() && !this.f51070r0) {
                    m43840O();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean m43811i0 = m43811i0();
        boolean m43817f0 = m43817f0();
        if (m43811i0 || m43817f0) {
            this.f51041d.post(new RunnableC7114c());
        }
        m43803m0();
        this.f51039c.m43777C0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof C7116e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7116e c7116e = (C7116e) parcelable;
        super.onRestoreInstanceState(c7116e.getSuperState());
        setError(c7116e.f51090b);
        if (c7116e.f51091c) {
            post(new RunnableC7113b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.f51022K) {
            float cornerSize = this.f51021J.getTopLeftCornerSize().getCornerSize(this.f51033V);
            float cornerSize2 = this.f51021J.getTopRightCornerSize().getCornerSize(this.f51033V);
            float cornerSize3 = this.f51021J.getBottomLeftCornerSize().getCornerSize(this.f51033V);
            float cornerSize4 = this.f51021J.getBottomRightCornerSize().getCornerSize(this.f51033V);
            CornerTreatment topLeftCorner = this.f51021J.getTopLeftCorner();
            CornerTreatment topRightCorner = this.f51021J.getTopRightCorner();
            ShapeAppearanceModel build = ShapeAppearanceModel.builder().setTopLeftCorner(topRightCorner).setTopRightCorner(topLeftCorner).setBottomLeftCorner(this.f51021J.getBottomRightCorner()).setBottomRightCorner(this.f51021J.getBottomLeftCorner()).setTopLeftCornerSize(cornerSize2).setTopRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize4).setBottomRightCornerSize(cornerSize3).build();
            this.f51022K = z;
            setShapeAppearanceModel(build);
        }
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        C7116e c7116e = new C7116e(super.onSaveInstanceState());
        if (m43834U()) {
            c7116e.f51090b = getError();
        }
        c7116e.f51091c = this.f51039c.m43772G();
        return c7116e;
    }

    /* renamed from: p */
    public final Rect m43798p(Rect rect) {
        if (this.f51041d != null) {
            Rect rect2 = this.f51032U;
            boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
            rect2.bottom = rect.bottom;
            int i = this.f51024M;
            if (i != 1) {
                if (i != 2) {
                    rect2.left = m43848G(rect.left, isLayoutRtl);
                    rect2.top = getPaddingTop();
                    rect2.right = m43847H(rect.right, isLayoutRtl);
                    return rect2;
                }
                rect2.left = rect.left + this.f51041d.getPaddingLeft();
                rect2.top = rect.top - m43792t();
                rect2.right = rect.right - this.f51041d.getPaddingRight();
                return rect2;
            }
            rect2.left = m43848G(rect.left, isLayoutRtl);
            rect2.top = rect.top + this.f51025N;
            rect2.right = m43847H(rect.right, isLayoutRtl);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: p0 */
    public final void m43797p0(boolean z, boolean z2) {
        int defaultColor = this.f51058l0.getDefaultColor();
        int colorForState = this.f51058l0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f51058l0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f51029R = colorForState2;
        } else if (z2) {
            this.f51029R = colorForState;
        } else {
            this.f51029R = defaultColor;
        }
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        this.f51039c.m43701z0(z);
    }

    /* renamed from: q */
    public final int m43796q(Rect rect, Rect rect2, float f) {
        if (m43843L()) {
            return (int) (rect2.top + f);
        }
        return rect.bottom - this.f51041d.getCompoundPaddingBottom();
    }

    /* renamed from: q0 */
    public void m43795q0() {
        boolean z;
        boolean z2;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f51015D != null && this.f51024M != 0) {
            boolean z3 = false;
            if (!isFocused() && ((editText2 = this.f51041d) == null || !editText2.hasFocus())) {
                z = false;
            } else {
                z = true;
            }
            if (!isHovered() && ((editText = this.f51041d) == null || !editText.isHovered())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (m43834U() || (this.f51063o != null && this.f51059m)) {
                z3 = true;
            }
            if (!isEnabled()) {
                this.f51029R = this.f51068q0;
            } else if (m43834U()) {
                if (this.f51058l0 != null) {
                    m43797p0(z, z2);
                } else {
                    this.f51029R = getErrorCurrentTextColors();
                }
            } else if (this.f51059m && (textView = this.f51063o) != null) {
                if (this.f51058l0 != null) {
                    m43797p0(z, z2);
                } else {
                    this.f51029R = textView.getCurrentTextColor();
                }
            } else if (z) {
                this.f51029R = this.f51056k0;
            } else if (z2) {
                this.f51029R = this.f51054j0;
            } else {
                this.f51029R = this.f51052i0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                m43819e0(z3);
            }
            this.f51039c.m43767L();
            refreshStartIconDrawableState();
            if (this.f51024M == 2) {
                int i = this.f51026O;
                if (z && isEnabled()) {
                    this.f51026O = this.f51028Q;
                } else {
                    this.f51026O = this.f51027P;
                }
                if (this.f51026O != i) {
                    m43839P();
                }
            }
            if (this.f51024M == 1) {
                if (!isEnabled()) {
                    this.f51030S = this.f51062n0;
                } else if (z2 && !z) {
                    this.f51030S = this.f51066p0;
                } else if (z) {
                    this.f51030S = this.f51064o0;
                } else {
                    this.f51030S = this.f51060m0;
                }
            }
            m43808k();
        }
    }

    /* renamed from: r */
    public final int m43794r(Rect rect, float f) {
        if (m43843L()) {
            return (int) (rect.centerY() - (f / 2.0f));
        }
        return rect.top + this.f51041d.getCompoundPaddingTop();
    }

    public void refreshEndIconDrawableState() {
        this.f51039c.m43766M();
    }

    public void refreshErrorIconDrawableState() {
        this.f51039c.m43765N();
    }

    public void refreshStartIconDrawableState() {
        this.f51037b.m67060m();
    }

    public void removeOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener onEditTextAttachedListener) {
        this.f51040c0.remove(onEditTextAttachedListener);
    }

    public void removeOnEndIconChangedListener(@NonNull OnEndIconChangedListener onEndIconChangedListener) {
        this.f51039c.m43763P(onEndIconChangedListener);
    }

    /* renamed from: s */
    public final Rect m43793s(Rect rect) {
        if (this.f51041d != null) {
            Rect rect2 = this.f51032U;
            float expandedTextHeight = this.f51072s0.getExpandedTextHeight();
            rect2.left = rect.left + this.f51041d.getCompoundPaddingLeft();
            rect2.top = m43794r(rect, expandedTextHeight);
            rect2.right = rect.right - this.f51041d.getCompoundPaddingRight();
            rect2.bottom = m43796q(rect, rect2, expandedTextHeight);
            return rect2;
        }
        throw new IllegalStateException();
    }

    public void setBoxBackgroundColor(@ColorInt int i) {
        if (this.f51030S != i) {
            this.f51030S = i;
            this.f51060m0 = i;
            this.f51064o0 = i;
            this.f51066p0 = i;
            m43808k();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f51060m0 = defaultColor;
        this.f51030S = defaultColor;
        this.f51062n0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f51064o0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f51066p0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m43808k();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f51024M) {
            return;
        }
        this.f51024M = i;
        if (this.f51041d != null) {
            m43841N();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f51025N = i;
    }

    public void setBoxCornerFamily(int i) {
        this.f51021J = this.f51021J.toBuilder().setTopLeftCorner(i, this.f51021J.getTopLeftCornerSize()).setTopRightCorner(i, this.f51021J.getTopRightCornerSize()).setBottomLeftCorner(i, this.f51021J.getBottomLeftCornerSize()).setBottomRightCorner(i, this.f51021J.getBottomRightCornerSize()).build();
        m43808k();
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        this.f51022K = isLayoutRtl;
        if (isLayoutRtl) {
            f5 = f2;
        } else {
            f5 = f;
        }
        if (!isLayoutRtl) {
            f = f2;
        }
        if (isLayoutRtl) {
            f6 = f4;
        } else {
            f6 = f3;
        }
        if (!isLayoutRtl) {
            f3 = f4;
        }
        MaterialShapeDrawable materialShapeDrawable = this.f51015D;
        if (materialShapeDrawable == null || materialShapeDrawable.getTopLeftCornerResolvedSize() != f5 || this.f51015D.getTopRightCornerResolvedSize() != f || this.f51015D.getBottomLeftCornerResolvedSize() != f6 || this.f51015D.getBottomRightCornerResolvedSize() != f3) {
            this.f51021J = this.f51021J.toBuilder().setTopLeftCornerSize(f5).setTopRightCornerSize(f).setBottomLeftCornerSize(f6).setBottomRightCornerSize(f3).build();
            m43808k();
        }
    }

    public void setBoxCornerRadiiResources(@DimenRes int i, @DimenRes int i2, @DimenRes int i3, @DimenRes int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(@ColorInt int i) {
        if (this.f51056k0 != i) {
            this.f51056k0 = i;
            m43795q0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f51052i0 = colorStateList.getDefaultColor();
            this.f51068q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f51054j0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f51056k0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f51056k0 != colorStateList.getDefaultColor()) {
            this.f51056k0 = colorStateList.getDefaultColor();
        }
        m43795q0();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f51058l0 != colorStateList) {
            this.f51058l0 = colorStateList;
            m43795q0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f51027P = i;
        m43795q0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f51028Q = i;
        m43795q0();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f51055k != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f51063o = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.f51034W;
                if (typeface != null) {
                    this.f51063o.setTypeface(typeface);
                }
                this.f51063o.setMaxLines(1);
                this.f51053j.m51941e(this.f51063o, 2);
                MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.f51063o.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                m43821d0();
                m43827a0();
            } else {
                this.f51053j.m51962C(this.f51063o, 2);
                this.f51063o = null;
            }
            this.f51055k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f51057l != i) {
            if (i > 0) {
                this.f51057l = i;
            } else {
                this.f51057l = -1;
            }
            if (this.f51055k) {
                m43827a0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f51065p != i) {
            this.f51065p = i;
            m43821d0();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f51084z != colorStateList) {
            this.f51084z = colorStateList;
            m43821d0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f51067q != i) {
            this.f51067q = i;
            m43821d0();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f51083y != colorStateList) {
            this.f51083y = colorStateList;
            m43821d0();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f51048g0 = colorStateList;
        this.f51050h0 = colorStateList;
        if (this.f51041d != null) {
            m43807k0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m43838Q(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f51039c.m43761R(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f51039c.m43760S(z);
    }

    public void setEndIconContentDescription(@StringRes int i) {
        this.f51039c.m43759T(i);
    }

    public void setEndIconDrawable(@DrawableRes int i) {
        this.f51039c.m43757V(i);
    }

    public void setEndIconMinSize(@IntRange(from = 0) int i) {
        this.f51039c.m43755X(i);
    }

    public void setEndIconMode(int i) {
        this.f51039c.m43754Y(i);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f51039c.m43753Z(onClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f51039c.m43751a0(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f51039c.m43749b0(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        this.f51039c.m43747c0(colorStateList);
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f51039c.m43745d0(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.f51039c.m43743e0(z);
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.f51053j.m51964A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f51053j.m51948Q(charSequence);
        } else {
            this.f51053j.m51923w();
        }
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        this.f51053j.m51960E(i);
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        this.f51053j.m51959F(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f51053j.m51958G(z);
    }

    public void setErrorIconDrawable(@DrawableRes int i) {
        this.f51039c.m43741f0(i);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f51039c.m43737h0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f51039c.m43735i0(onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        this.f51039c.m43733j0(colorStateList);
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f51039c.m43731k0(mode);
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        this.f51053j.m51957H(i);
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        this.f51053j.m51956I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f51074t0 != z) {
            this.f51074t0 = z;
            m43807k0(false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!isHelperTextEnabled()) {
            setHelperTextEnabled(true);
        }
        this.f51053j.m51947R(charSequence);
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        this.f51053j.m51953L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f51053j.m51954K(z);
    }

    public void setHelperTextTextAppearance(@StyleRes int i) {
        this.f51053j.m51955J(i);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f51012A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f51076u0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f51012A) {
            this.f51012A = z;
            if (!z) {
                this.f51014C = false;
                if (!TextUtils.isEmpty(this.f51013B) && TextUtils.isEmpty(this.f51041d.getHint())) {
                    this.f51041d.setHint(this.f51013B);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f51041d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f51013B)) {
                        setHint(hint);
                    }
                    this.f51041d.setHint((CharSequence) null);
                }
                this.f51014C = true;
            }
            if (this.f51041d != null) {
                m43809j0();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i) {
        this.f51072s0.setCollapsedTextAppearance(i);
        this.f51050h0 = this.f51072s0.getCollapsedTextColor();
        if (this.f51041d != null) {
            m43807k0(false);
            m43809j0();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f51050h0 != colorStateList) {
            if (this.f51048g0 == null) {
                this.f51072s0.setCollapsedTextColor(colorStateList);
            }
            this.f51050h0 = colorStateList;
            if (this.f51041d != null) {
                m43807k0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull LengthCounter lengthCounter) {
        this.f51061n = lengthCounter;
    }

    public void setMaxEms(int i) {
        this.f51047g = i;
        EditText editText = this.f51041d;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(@InterfaceC2055Px int i) {
        this.f51051i = i;
        EditText editText = this.f51041d;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(@DimenRes int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f51045f = i;
        EditText editText = this.f51041d;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(@InterfaceC2055Px int i) {
        this.f51049h = i;
        EditText editText = this.f51041d;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(@DimenRes int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i) {
        this.f51039c.m43727m0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        this.f51039c.m43723o0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.f51039c.m43719q0(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.f51039c.m43717r0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.f51039c.m43715s0(mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.f51073t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f51073t = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            ViewCompat.setImportantForAccessibility(this.f51073t, 2);
            Fade m43787y = m43787y();
            this.f51079w = m43787y;
            m43787y.setStartDelay(67L);
            this.f51081x = m43787y();
            setPlaceholderTextAppearance(this.f51077v);
            setPlaceholderTextColor(this.f51075u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f51071s) {
                setPlaceholderTextEnabled(true);
            }
            this.f51069r = charSequence;
        }
        m43801n0();
    }

    public void setPlaceholderTextAppearance(@StyleRes int i) {
        this.f51077v = i;
        TextView textView = this.f51073t;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f51075u != colorStateList) {
            this.f51075u = colorStateList;
            TextView textView = this.f51073t;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        this.f51037b.m67059n(charSequence);
    }

    public void setPrefixTextAppearance(@StyleRes int i) {
        this.f51037b.m67058o(i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f51037b.m67057p(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.f51015D;
        if (materialShapeDrawable != null && materialShapeDrawable.getShapeAppearanceModel() != shapeAppearanceModel) {
            this.f51021J = shapeAppearanceModel;
            m43808k();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.f51037b.m67056q(z);
    }

    public void setStartIconContentDescription(@StringRes int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(@DrawableRes int i) {
        setStartIconDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setStartIconMinSize(@IntRange(from = 0) int i) {
        this.f51037b.m67053t(i);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f51037b.m67052u(onClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f51037b.m67051v(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f51037b.m67050w(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        this.f51037b.m67049x(colorStateList);
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f51037b.m67048y(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.f51037b.m67047z(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.f51039c.m43713t0(charSequence);
    }

    public void setSuffixTextAppearance(@StyleRes int i) {
        this.f51039c.m43711u0(i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f51039c.m43709v0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.f51041d;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f51034W) {
            this.f51034W = typeface;
            this.f51072s0.setTypefaces(typeface);
            this.f51053j.m51951N(typeface);
            TextView textView = this.f51063o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final int m43792t() {
        float collapsedTextHeight;
        if (!this.f51012A) {
            return 0;
        }
        int i = this.f51024M;
        if (i != 0) {
            if (i != 2) {
                return 0;
            }
            collapsedTextHeight = this.f51072s0.getCollapsedTextHeight() / 2.0f;
        } else {
            collapsedTextHeight = this.f51072s0.getCollapsedTextHeight();
        }
        return (int) collapsedTextHeight;
    }

    /* renamed from: u */
    public final boolean m43791u() {
        if (this.f51024M == 2 && m43790v()) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m43790v() {
        if (this.f51026O > -1 && this.f51029R != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final void m43789w() {
        if (m43786z()) {
            ((AbstractC16876vB) this.f51015D).m1101C();
        }
    }

    /* renamed from: x */
    public final void m43788x(boolean z) {
        ValueAnimator valueAnimator = this.f51078v0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f51078v0.cancel();
        }
        if (z && this.f51076u0) {
            m43810j(1.0f);
        } else {
            this.f51072s0.setExpansionFraction(1.0f);
        }
        this.f51070r0 = false;
        if (m43786z()) {
            m43840O();
        }
        m43801n0();
        this.f51037b.m67061l(false);
        this.f51039c.m43768K(false);
    }

    /* renamed from: y */
    public final Fade m43787y() {
        Fade fade = new Fade();
        fade.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationShort2, 87));
        fade.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR));
        return fade;
    }

    /* renamed from: z */
    public final boolean m43786z() {
        if (this.f51012A && !TextUtils.isEmpty(this.f51013B) && (this.f51015D instanceof AbstractC16876vB)) {
            return true;
        }
        return false;
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        this.f51039c.m43758U(charSequence);
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.f51039c.m43756W(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f51039c.m43739g0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f51039c.m43725n0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f51039c.m43721p0(drawable);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        this.f51037b.m67055r(charSequence);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f51037b.m67054s(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(@androidx.annotation.NonNull android.content.Context r17, @androidx.annotation.Nullable android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setHint(@StringRes int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
