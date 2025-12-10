package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;

/* renamed from: mo0 */
/* loaded from: classes4.dex */
public class C21190mo0 {

    /* renamed from: A */
    public static final Drawable f72143A;

    /* renamed from: z */
    public static final double f72144z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public final MaterialCardView f72145a;

    /* renamed from: c */
    public final MaterialShapeDrawable f72147c;

    /* renamed from: d */
    public final MaterialShapeDrawable f72148d;

    /* renamed from: e */
    public int f72149e;

    /* renamed from: f */
    public int f72150f;

    /* renamed from: g */
    public int f72151g;

    /* renamed from: h */
    public int f72152h;

    /* renamed from: i */
    public Drawable f72153i;

    /* renamed from: j */
    public Drawable f72154j;

    /* renamed from: k */
    public ColorStateList f72155k;

    /* renamed from: l */
    public ColorStateList f72156l;

    /* renamed from: m */
    public ShapeAppearanceModel f72157m;

    /* renamed from: n */
    public ColorStateList f72158n;

    /* renamed from: o */
    public Drawable f72159o;

    /* renamed from: p */
    public LayerDrawable f72160p;

    /* renamed from: q */
    public MaterialShapeDrawable f72161q;

    /* renamed from: r */
    public MaterialShapeDrawable f72162r;

    /* renamed from: t */
    public boolean f72164t;

    /* renamed from: u */
    public ValueAnimator f72165u;

    /* renamed from: v */
    public final TimeInterpolator f72166v;

    /* renamed from: w */
    public final int f72167w;

    /* renamed from: x */
    public final int f72168x;

    /* renamed from: b */
    public final Rect f72146b = new Rect();

    /* renamed from: s */
    public boolean f72163s = false;

    /* renamed from: y */
    public float f72169y = 0.0f;

    /* renamed from: mo0$a */
    /* loaded from: classes4.dex */
    public class C12307a extends InsetDrawable {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12307a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
            C21190mo0.this = r7;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f72143A = colorDrawable;
    }

    public C21190mo0(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f72145a = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, i2);
        this.f72147c = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(materialCardView.getContext());
        materialShapeDrawable.setShadowColor(-12303292);
        ShapeAppearanceModel.Builder builder = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R.styleable.CardView, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(R.styleable.CardView_cardCornerRadius)) {
            builder.setAllCornerSizes(obtainStyledAttributes.getDimension(R.styleable.CardView_cardCornerRadius, 0.0f));
        }
        this.f72148d = new MaterialShapeDrawable();
        m26546Z(builder.build());
        this.f72166v = MotionUtils.resolveThemeInterpolator(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.f72167w = MotionUtils.resolveThemeDuration(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f72168x = MotionUtils.resolveThemeDuration(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static /* synthetic */ void m26545a(C21190mo0 c21190mo0, ValueAnimator valueAnimator) {
        c21190mo0.m26563I(valueAnimator);
    }

    /* renamed from: A */
    public ColorStateList m26571A() {
        return this.f72158n;
    }

    /* renamed from: B */
    public int m26570B() {
        return this.f72152h;
    }

    /* renamed from: C */
    public Rect m26569C() {
        return this.f72146b;
    }

    /* renamed from: D */
    public final Drawable m26568D(Drawable drawable) {
        int i;
        int i2;
        if (this.f72145a.getUseCompatPadding()) {
            i2 = (int) Math.ceil(m26535f());
            i = (int) Math.ceil(m26537e());
        } else {
            i = 0;
            i2 = 0;
        }
        return new C12307a(drawable, i, i2, i, i2);
    }

    /* renamed from: E */
    public boolean m26567E() {
        return this.f72163s;
    }

    /* renamed from: F */
    public boolean m26566F() {
        return this.f72164t;
    }

    /* renamed from: G */
    public final boolean m26565G() {
        if ((this.f72151g & 80) == 80) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final boolean m26564H() {
        if ((this.f72151g & GravityCompat.END) == 8388613) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final /* synthetic */ void m26563I(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f72154j.setAlpha((int) (255.0f * floatValue));
        this.f72169y = floatValue;
    }

    /* renamed from: J */
    public void m26562J(TypedArray typedArray) {
        Drawable drawable;
        ColorStateList colorStateList = MaterialResources.getColorStateList(this.f72145a.getContext(), typedArray, R.styleable.MaterialCardView_strokeColor);
        this.f72158n = colorStateList;
        if (colorStateList == null) {
            this.f72158n = ColorStateList.valueOf(-1);
        }
        this.f72152h = typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(R.styleable.MaterialCardView_android_checkable, false);
        this.f72164t = z;
        this.f72145a.setLongClickable(z);
        this.f72156l = MaterialResources.getColorStateList(this.f72145a.getContext(), typedArray, R.styleable.MaterialCardView_checkedIconTint);
        m26554R(MaterialResources.getDrawable(this.f72145a.getContext(), typedArray, R.styleable.MaterialCardView_checkedIcon));
        m26551U(typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_checkedIconSize, 0));
        m26552T(typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_checkedIconMargin, 0));
        this.f72151g = typedArray.getInteger(R.styleable.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(this.f72145a.getContext(), typedArray, R.styleable.MaterialCardView_rippleColor);
        this.f72155k = colorStateList2;
        if (colorStateList2 == null) {
            this.f72155k = ColorStateList.valueOf(MaterialColors.getColor(this.f72145a, R.attr.colorControlHighlight));
        }
        m26558N(MaterialResources.getColorStateList(this.f72145a.getContext(), typedArray, R.styleable.MaterialCardView_cardForegroundColor));
        m26524k0();
        m26530h0();
        m26522l0();
        this.f72145a.setBackgroundInternal(m26568D(this.f72147c));
        if (this.f72145a.isClickable()) {
            drawable = m26514t();
        } else {
            drawable = this.f72148d;
        }
        this.f72153i = drawable;
        this.f72145a.setForeground(m26568D(drawable));
    }

    /* renamed from: K */
    public void m26561K(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.f72160p != null) {
            if (this.f72145a.getUseCompatPadding()) {
                i3 = (int) Math.ceil(m26535f() * 2.0f);
                i4 = (int) Math.ceil(m26537e() * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (m26564H()) {
                i5 = ((i - this.f72149e) - this.f72150f) - i4;
            } else {
                i5 = this.f72149e;
            }
            if (m26565G()) {
                i6 = this.f72149e;
            } else {
                i6 = ((i2 - this.f72149e) - this.f72150f) - i3;
            }
            int i11 = i6;
            if (m26564H()) {
                i7 = this.f72149e;
            } else {
                i7 = ((i - this.f72149e) - this.f72150f) - i4;
            }
            if (m26565G()) {
                i8 = ((i2 - this.f72149e) - this.f72150f) - i3;
            } else {
                i8 = this.f72149e;
            }
            int i12 = i8;
            if (ViewCompat.getLayoutDirection(this.f72145a) == 1) {
                i10 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i10 = i5;
            }
            this.f72160p.setLayerInset(2, i10, i12, i9, i11);
        }
    }

    /* renamed from: L */
    public void m26560L(boolean z) {
        this.f72163s = z;
    }

    /* renamed from: M */
    public void m26559M(ColorStateList colorStateList) {
        this.f72147c.setFillColor(colorStateList);
    }

    /* renamed from: N */
    public void m26558N(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f72148d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.setFillColor(colorStateList);
    }

    /* renamed from: O */
    public void m26557O(boolean z) {
        this.f72164t = z;
    }

    /* renamed from: P */
    public void m26556P(boolean z) {
        m26555Q(z, false);
    }

    /* renamed from: Q */
    public void m26555Q(boolean z, boolean z2) {
        int i;
        float f;
        Drawable drawable = this.f72154j;
        if (drawable != null) {
            if (z2) {
                m26543b(z);
                return;
            }
            if (z) {
                i = 255;
            } else {
                i = 0;
            }
            drawable.setAlpha(i);
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.f72169y = f;
        }
    }

    /* renamed from: R */
    public void m26554R(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            this.f72154j = mutate;
            DrawableCompat.setTintList(mutate, this.f72156l);
            m26556P(this.f72145a.isChecked());
        } else {
            this.f72154j = f72143A;
        }
        LayerDrawable layerDrawable = this.f72160p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f72154j);
        }
    }

    /* renamed from: S */
    public void m26553S(int i) {
        this.f72151g = i;
        m26561K(this.f72145a.getMeasuredWidth(), this.f72145a.getMeasuredHeight());
    }

    /* renamed from: T */
    public void m26552T(int i) {
        this.f72149e = i;
    }

    /* renamed from: U */
    public void m26551U(int i) {
        this.f72150f = i;
    }

    /* renamed from: V */
    public void m26550V(ColorStateList colorStateList) {
        this.f72156l = colorStateList;
        Drawable drawable = this.f72154j;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        }
    }

    /* renamed from: W */
    public void m26549W(float f) {
        m26546Z(this.f72157m.withCornerSize(f));
        this.f72153i.invalidateSelf();
        if (m26536e0() || m26538d0()) {
            m26532g0();
        }
        if (m26536e0()) {
            m26526j0();
        }
    }

    /* renamed from: X */
    public void m26548X(float f) {
        this.f72147c.setInterpolation(f);
        MaterialShapeDrawable materialShapeDrawable = this.f72148d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f72162r;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setInterpolation(f);
        }
    }

    /* renamed from: Y */
    public void m26547Y(ColorStateList colorStateList) {
        this.f72155k = colorStateList;
        m26524k0();
    }

    /* renamed from: Z */
    public void m26546Z(ShapeAppearanceModel shapeAppearanceModel) {
        this.f72157m = shapeAppearanceModel;
        this.f72147c.setShapeAppearanceModel(shapeAppearanceModel);
        MaterialShapeDrawable materialShapeDrawable = this.f72147c;
        materialShapeDrawable.setShadowBitmapDrawingEnable(!materialShapeDrawable.isRoundRect());
        MaterialShapeDrawable materialShapeDrawable2 = this.f72148d;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.f72162r;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable4 = this.f72161q;
        if (materialShapeDrawable4 != null) {
            materialShapeDrawable4.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    /* renamed from: a0 */
    public void m26544a0(ColorStateList colorStateList) {
        if (this.f72158n == colorStateList) {
            return;
        }
        this.f72158n = colorStateList;
        m26522l0();
    }

    /* renamed from: b */
    public void m26543b(boolean z) {
        float f;
        float f2;
        int i;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (z) {
            f2 = 1.0f - this.f72169y;
        } else {
            f2 = this.f72169y;
        }
        ValueAnimator valueAnimator = this.f72165u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f72165u = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f72169y, f);
        this.f72165u = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lo0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C21190mo0.m26545a(C21190mo0.this, valueAnimator2);
            }
        });
        this.f72165u.setInterpolator(this.f72166v);
        ValueAnimator valueAnimator2 = this.f72165u;
        if (z) {
            i = this.f72167w;
        } else {
            i = this.f72168x;
        }
        valueAnimator2.setDuration(i * f2);
        this.f72165u.start();
    }

    /* renamed from: b0 */
    public void m26542b0(int i) {
        if (i == this.f72152h) {
            return;
        }
        this.f72152h = i;
        m26522l0();
    }

    /* renamed from: c */
    public final float m26541c() {
        return Math.max(Math.max(m26539d(this.f72157m.getTopLeftCorner(), this.f72147c.getTopLeftCornerResolvedSize()), m26539d(this.f72157m.getTopRightCorner(), this.f72147c.getTopRightCornerResolvedSize())), Math.max(m26539d(this.f72157m.getBottomRightCorner(), this.f72147c.getBottomRightCornerResolvedSize()), m26539d(this.f72157m.getBottomLeftCorner(), this.f72147c.getBottomLeftCornerResolvedSize())));
    }

    /* renamed from: c0 */
    public void m26540c0(int i, int i2, int i3, int i4) {
        this.f72146b.set(i, i2, i3, i4);
        m26532g0();
    }

    /* renamed from: d */
    public final float m26539d(CornerTreatment cornerTreatment, float f) {
        if (cornerTreatment instanceof RoundedCornerTreatment) {
            return (float) ((1.0d - f72144z) * f);
        }
        if (cornerTreatment instanceof CutCornerTreatment) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: d0 */
    public final boolean m26538d0() {
        if (this.f72145a.getPreventCornerOverlap() && !m26533g()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final float m26537e() {
        float f;
        float maxCardElevation = this.f72145a.getMaxCardElevation();
        if (m26536e0()) {
            f = m26541c();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    /* renamed from: e0 */
    public final boolean m26536e0() {
        if (this.f72145a.getPreventCornerOverlap() && m26533g() && this.f72145a.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final float m26535f() {
        float f;
        float maxCardElevation = this.f72145a.getMaxCardElevation() * 1.5f;
        if (m26536e0()) {
            f = m26541c();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    /* renamed from: f0 */
    public void m26534f0() {
        Drawable drawable;
        Drawable drawable2 = this.f72153i;
        if (this.f72145a.isClickable()) {
            drawable = m26514t();
        } else {
            drawable = this.f72148d;
        }
        this.f72153i = drawable;
        if (drawable2 != drawable) {
            m26528i0(drawable);
        }
    }

    /* renamed from: g */
    public final boolean m26533g() {
        return this.f72147c.isRoundRect();
    }

    /* renamed from: g0 */
    public void m26532g0() {
        float m26541c;
        if (!m26538d0() && !m26536e0()) {
            m26541c = 0.0f;
        } else {
            m26541c = m26541c();
        }
        int m26512v = (int) (m26541c - m26512v());
        MaterialCardView materialCardView = this.f72145a;
        Rect rect = this.f72146b;
        materialCardView.m45520d(rect.left + m26512v, rect.top + m26512v, rect.right + m26512v, rect.bottom + m26512v);
    }

    /* renamed from: h */
    public final Drawable m26531h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        MaterialShapeDrawable m26527j = m26527j();
        this.f72161q = m26527j;
        m26527j.setFillColor(this.f72155k);
        stateListDrawable.addState(new int[]{16842919}, this.f72161q);
        return stateListDrawable;
    }

    /* renamed from: h0 */
    public void m26530h0() {
        this.f72147c.setElevation(this.f72145a.getCardElevation());
    }

    /* renamed from: i */
    public final Drawable m26529i() {
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            this.f72162r = m26527j();
            return new RippleDrawable(this.f72155k, null, this.f72162r);
        }
        return m26531h();
    }

    /* renamed from: i0 */
    public final void m26528i0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && (this.f72145a.getForeground() instanceof InsetDrawable)) {
            ((InsetDrawable) this.f72145a.getForeground()).setDrawable(drawable);
        } else {
            this.f72145a.setForeground(m26568D(drawable));
        }
    }

    /* renamed from: j */
    public final MaterialShapeDrawable m26527j() {
        return new MaterialShapeDrawable(this.f72157m);
    }

    /* renamed from: j0 */
    public void m26526j0() {
        if (!m26567E()) {
            this.f72145a.setBackgroundInternal(m26568D(this.f72147c));
        }
        this.f72145a.setForeground(m26568D(this.f72153i));
    }

    /* renamed from: k */
    public void m26525k() {
        Drawable drawable = this.f72159o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f72159o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f72159o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* renamed from: k0 */
    public final void m26524k0() {
        Drawable drawable;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && (drawable = this.f72159o) != null) {
            ((RippleDrawable) drawable).setColor(this.f72155k);
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = this.f72161q;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setFillColor(this.f72155k);
        }
    }

    /* renamed from: l */
    public MaterialShapeDrawable m26523l() {
        return this.f72147c;
    }

    /* renamed from: l0 */
    public void m26522l0() {
        this.f72148d.setStroke(this.f72152h, this.f72158n);
    }

    /* renamed from: m */
    public ColorStateList m26521m() {
        return this.f72147c.getFillColor();
    }

    /* renamed from: n */
    public ColorStateList m26520n() {
        return this.f72148d.getFillColor();
    }

    /* renamed from: o */
    public Drawable m26519o() {
        return this.f72154j;
    }

    /* renamed from: p */
    public int m26518p() {
        return this.f72151g;
    }

    /* renamed from: q */
    public int m26517q() {
        return this.f72149e;
    }

    /* renamed from: r */
    public int m26516r() {
        return this.f72150f;
    }

    /* renamed from: s */
    public ColorStateList m26515s() {
        return this.f72156l;
    }

    /* renamed from: t */
    public final Drawable m26514t() {
        if (this.f72159o == null) {
            this.f72159o = m26529i();
        }
        if (this.f72160p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f72159o, this.f72148d, this.f72154j});
            this.f72160p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f72160p;
    }

    /* renamed from: u */
    public float m26513u() {
        return this.f72147c.getTopLeftCornerResolvedSize();
    }

    /* renamed from: v */
    public final float m26512v() {
        if (this.f72145a.getPreventCornerOverlap() && this.f72145a.getUseCompatPadding()) {
            return (float) ((1.0d - f72144z) * this.f72145a.getCardViewRadius());
        }
        return 0.0f;
    }

    /* renamed from: w */
    public float m26511w() {
        return this.f72147c.getInterpolation();
    }

    /* renamed from: x */
    public ColorStateList m26510x() {
        return this.f72155k;
    }

    /* renamed from: y */
    public ShapeAppearanceModel m26509y() {
        return this.f72157m;
    }

    /* renamed from: z */
    public int m26508z() {
        ColorStateList colorStateList = this.f72158n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}