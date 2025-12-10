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

/* renamed from: go0 */
/* loaded from: classes4.dex */
public class C20099go0 {

    /* renamed from: A */
    public static final Drawable f62280A;

    /* renamed from: z */
    public static final double f62281z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public final MaterialCardView f62282a;

    /* renamed from: c */
    public final MaterialShapeDrawable f62284c;

    /* renamed from: d */
    public final MaterialShapeDrawable f62285d;

    /* renamed from: e */
    public int f62286e;

    /* renamed from: f */
    public int f62287f;

    /* renamed from: g */
    public int f62288g;

    /* renamed from: h */
    public int f62289h;

    /* renamed from: i */
    public Drawable f62290i;

    /* renamed from: j */
    public Drawable f62291j;

    /* renamed from: k */
    public ColorStateList f62292k;

    /* renamed from: l */
    public ColorStateList f62293l;

    /* renamed from: m */
    public ShapeAppearanceModel f62294m;

    /* renamed from: n */
    public ColorStateList f62295n;

    /* renamed from: o */
    public Drawable f62296o;

    /* renamed from: p */
    public LayerDrawable f62297p;

    /* renamed from: q */
    public MaterialShapeDrawable f62298q;

    /* renamed from: r */
    public MaterialShapeDrawable f62299r;

    /* renamed from: t */
    public boolean f62301t;

    /* renamed from: u */
    public ValueAnimator f62302u;

    /* renamed from: v */
    public final TimeInterpolator f62303v;

    /* renamed from: w */
    public final int f62304w;

    /* renamed from: x */
    public final int f62305x;

    /* renamed from: b */
    public final Rect f62283b = new Rect();

    /* renamed from: s */
    public boolean f62300s = false;

    /* renamed from: y */
    public float f62306y = 0.0f;

    /* renamed from: go0$a */
    /* loaded from: classes4.dex */
    public class C10330a extends InsetDrawable {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10330a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
            C20099go0.this = r7;
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
        f62280A = colorDrawable;
    }

    public C20099go0(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f62282a = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, i2);
        this.f62284c = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(materialCardView.getContext());
        materialShapeDrawable.setShadowColor(-12303292);
        ShapeAppearanceModel.Builder builder = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R.styleable.CardView, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(R.styleable.CardView_cardCornerRadius)) {
            builder.setAllCornerSizes(obtainStyledAttributes.getDimension(R.styleable.CardView_cardCornerRadius, 0.0f));
        }
        this.f62285d = new MaterialShapeDrawable();
        m31018Z(builder.build());
        this.f62303v = MotionUtils.resolveThemeInterpolator(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.f62304w = MotionUtils.resolveThemeDuration(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f62305x = MotionUtils.resolveThemeDuration(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static /* synthetic */ void m31017a(C20099go0 c20099go0, ValueAnimator valueAnimator) {
        c20099go0.m31035I(valueAnimator);
    }

    /* renamed from: A */
    public ColorStateList m31043A() {
        return this.f62295n;
    }

    /* renamed from: B */
    public int m31042B() {
        return this.f62289h;
    }

    /* renamed from: C */
    public Rect m31041C() {
        return this.f62283b;
    }

    /* renamed from: D */
    public final Drawable m31040D(Drawable drawable) {
        int i;
        int i2;
        if (this.f62282a.getUseCompatPadding()) {
            i2 = (int) Math.ceil(m31007f());
            i = (int) Math.ceil(m31009e());
        } else {
            i = 0;
            i2 = 0;
        }
        return new C10330a(drawable, i, i2, i, i2);
    }

    /* renamed from: E */
    public boolean m31039E() {
        return this.f62300s;
    }

    /* renamed from: F */
    public boolean m31038F() {
        return this.f62301t;
    }

    /* renamed from: G */
    public final boolean m31037G() {
        if ((this.f62288g & 80) == 80) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final boolean m31036H() {
        if ((this.f62288g & GravityCompat.END) == 8388613) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final /* synthetic */ void m31035I(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f62291j.setAlpha((int) (255.0f * floatValue));
        this.f62306y = floatValue;
    }

    /* renamed from: J */
    public void m31034J(TypedArray typedArray) {
        Drawable drawable;
        ColorStateList colorStateList = MaterialResources.getColorStateList(this.f62282a.getContext(), typedArray, R.styleable.MaterialCardView_strokeColor);
        this.f62295n = colorStateList;
        if (colorStateList == null) {
            this.f62295n = ColorStateList.valueOf(-1);
        }
        this.f62289h = typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(R.styleable.MaterialCardView_android_checkable, false);
        this.f62301t = z;
        this.f62282a.setLongClickable(z);
        this.f62293l = MaterialResources.getColorStateList(this.f62282a.getContext(), typedArray, R.styleable.MaterialCardView_checkedIconTint);
        m31026R(MaterialResources.getDrawable(this.f62282a.getContext(), typedArray, R.styleable.MaterialCardView_checkedIcon));
        m31023U(typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_checkedIconSize, 0));
        m31024T(typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_checkedIconMargin, 0));
        this.f62288g = typedArray.getInteger(R.styleable.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(this.f62282a.getContext(), typedArray, R.styleable.MaterialCardView_rippleColor);
        this.f62292k = colorStateList2;
        if (colorStateList2 == null) {
            this.f62292k = ColorStateList.valueOf(MaterialColors.getColor(this.f62282a, R.attr.colorControlHighlight));
        }
        m31030N(MaterialResources.getColorStateList(this.f62282a.getContext(), typedArray, R.styleable.MaterialCardView_cardForegroundColor));
        m30996k0();
        m31002h0();
        m30994l0();
        this.f62282a.setBackgroundInternal(m31040D(this.f62284c));
        if (this.f62282a.isClickable()) {
            drawable = m30986t();
        } else {
            drawable = this.f62285d;
        }
        this.f62290i = drawable;
        this.f62282a.setForeground(m31040D(drawable));
    }

    /* renamed from: K */
    public void m31033K(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.f62297p != null) {
            if (this.f62282a.getUseCompatPadding()) {
                i3 = (int) Math.ceil(m31007f() * 2.0f);
                i4 = (int) Math.ceil(m31009e() * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (m31036H()) {
                i5 = ((i - this.f62286e) - this.f62287f) - i4;
            } else {
                i5 = this.f62286e;
            }
            if (m31037G()) {
                i6 = this.f62286e;
            } else {
                i6 = ((i2 - this.f62286e) - this.f62287f) - i3;
            }
            int i11 = i6;
            if (m31036H()) {
                i7 = this.f62286e;
            } else {
                i7 = ((i - this.f62286e) - this.f62287f) - i4;
            }
            if (m31037G()) {
                i8 = ((i2 - this.f62286e) - this.f62287f) - i3;
            } else {
                i8 = this.f62286e;
            }
            int i12 = i8;
            if (ViewCompat.getLayoutDirection(this.f62282a) == 1) {
                i10 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i10 = i5;
            }
            this.f62297p.setLayerInset(2, i10, i12, i9, i11);
        }
    }

    /* renamed from: L */
    public void m31032L(boolean z) {
        this.f62300s = z;
    }

    /* renamed from: M */
    public void m31031M(ColorStateList colorStateList) {
        this.f62284c.setFillColor(colorStateList);
    }

    /* renamed from: N */
    public void m31030N(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f62285d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.setFillColor(colorStateList);
    }

    /* renamed from: O */
    public void m31029O(boolean z) {
        this.f62301t = z;
    }

    /* renamed from: P */
    public void m31028P(boolean z) {
        m31027Q(z, false);
    }

    /* renamed from: Q */
    public void m31027Q(boolean z, boolean z2) {
        int i;
        float f;
        Drawable drawable = this.f62291j;
        if (drawable != null) {
            if (z2) {
                m31015b(z);
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
            this.f62306y = f;
        }
    }

    /* renamed from: R */
    public void m31026R(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            this.f62291j = mutate;
            DrawableCompat.setTintList(mutate, this.f62293l);
            m31028P(this.f62282a.isChecked());
        } else {
            this.f62291j = f62280A;
        }
        LayerDrawable layerDrawable = this.f62297p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f62291j);
        }
    }

    /* renamed from: S */
    public void m31025S(int i) {
        this.f62288g = i;
        m31033K(this.f62282a.getMeasuredWidth(), this.f62282a.getMeasuredHeight());
    }

    /* renamed from: T */
    public void m31024T(int i) {
        this.f62286e = i;
    }

    /* renamed from: U */
    public void m31023U(int i) {
        this.f62287f = i;
    }

    /* renamed from: V */
    public void m31022V(ColorStateList colorStateList) {
        this.f62293l = colorStateList;
        Drawable drawable = this.f62291j;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        }
    }

    /* renamed from: W */
    public void m31021W(float f) {
        m31018Z(this.f62294m.withCornerSize(f));
        this.f62290i.invalidateSelf();
        if (m31008e0() || m31010d0()) {
            m31004g0();
        }
        if (m31008e0()) {
            m30998j0();
        }
    }

    /* renamed from: X */
    public void m31020X(float f) {
        this.f62284c.setInterpolation(f);
        MaterialShapeDrawable materialShapeDrawable = this.f62285d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f62299r;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setInterpolation(f);
        }
    }

    /* renamed from: Y */
    public void m31019Y(ColorStateList colorStateList) {
        this.f62292k = colorStateList;
        m30996k0();
    }

    /* renamed from: Z */
    public void m31018Z(ShapeAppearanceModel shapeAppearanceModel) {
        this.f62294m = shapeAppearanceModel;
        this.f62284c.setShapeAppearanceModel(shapeAppearanceModel);
        MaterialShapeDrawable materialShapeDrawable = this.f62284c;
        materialShapeDrawable.setShadowBitmapDrawingEnable(!materialShapeDrawable.isRoundRect());
        MaterialShapeDrawable materialShapeDrawable2 = this.f62285d;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.f62299r;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable4 = this.f62298q;
        if (materialShapeDrawable4 != null) {
            materialShapeDrawable4.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    /* renamed from: a0 */
    public void m31016a0(ColorStateList colorStateList) {
        if (this.f62295n == colorStateList) {
            return;
        }
        this.f62295n = colorStateList;
        m30994l0();
    }

    /* renamed from: b */
    public void m31015b(boolean z) {
        float f;
        float f2;
        int i;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (z) {
            f2 = 1.0f - this.f62306y;
        } else {
            f2 = this.f62306y;
        }
        ValueAnimator valueAnimator = this.f62302u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f62302u = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f62306y, f);
        this.f62302u = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fo0
            {
                C20099go0.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C20099go0.m31017a(C20099go0.this, valueAnimator2);
            }
        });
        this.f62302u.setInterpolator(this.f62303v);
        ValueAnimator valueAnimator2 = this.f62302u;
        if (z) {
            i = this.f62304w;
        } else {
            i = this.f62305x;
        }
        valueAnimator2.setDuration(i * f2);
        this.f62302u.start();
    }

    /* renamed from: b0 */
    public void m31014b0(int i) {
        if (i == this.f62289h) {
            return;
        }
        this.f62289h = i;
        m30994l0();
    }

    /* renamed from: c */
    public final float m31013c() {
        return Math.max(Math.max(m31011d(this.f62294m.getTopLeftCorner(), this.f62284c.getTopLeftCornerResolvedSize()), m31011d(this.f62294m.getTopRightCorner(), this.f62284c.getTopRightCornerResolvedSize())), Math.max(m31011d(this.f62294m.getBottomRightCorner(), this.f62284c.getBottomRightCornerResolvedSize()), m31011d(this.f62294m.getBottomLeftCorner(), this.f62284c.getBottomLeftCornerResolvedSize())));
    }

    /* renamed from: c0 */
    public void m31012c0(int i, int i2, int i3, int i4) {
        this.f62283b.set(i, i2, i3, i4);
        m31004g0();
    }

    /* renamed from: d */
    public final float m31011d(CornerTreatment cornerTreatment, float f) {
        if (cornerTreatment instanceof RoundedCornerTreatment) {
            return (float) ((1.0d - f62281z) * f);
        }
        if (cornerTreatment instanceof CutCornerTreatment) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: d0 */
    public final boolean m31010d0() {
        if (this.f62282a.getPreventCornerOverlap() && !m31005g()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final float m31009e() {
        float f;
        float maxCardElevation = this.f62282a.getMaxCardElevation();
        if (m31008e0()) {
            f = m31013c();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    /* renamed from: e0 */
    public final boolean m31008e0() {
        if (this.f62282a.getPreventCornerOverlap() && m31005g() && this.f62282a.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final float m31007f() {
        float f;
        float maxCardElevation = this.f62282a.getMaxCardElevation() * 1.5f;
        if (m31008e0()) {
            f = m31013c();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    /* renamed from: f0 */
    public void m31006f0() {
        Drawable drawable;
        Drawable drawable2 = this.f62290i;
        if (this.f62282a.isClickable()) {
            drawable = m30986t();
        } else {
            drawable = this.f62285d;
        }
        this.f62290i = drawable;
        if (drawable2 != drawable) {
            m31000i0(drawable);
        }
    }

    /* renamed from: g */
    public final boolean m31005g() {
        return this.f62284c.isRoundRect();
    }

    /* renamed from: g0 */
    public void m31004g0() {
        float m31013c;
        if (!m31010d0() && !m31008e0()) {
            m31013c = 0.0f;
        } else {
            m31013c = m31013c();
        }
        int m30984v = (int) (m31013c - m30984v());
        MaterialCardView materialCardView = this.f62282a;
        Rect rect = this.f62283b;
        materialCardView.m45544d(rect.left + m30984v, rect.top + m30984v, rect.right + m30984v, rect.bottom + m30984v);
    }

    /* renamed from: h */
    public final Drawable m31003h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        MaterialShapeDrawable m30999j = m30999j();
        this.f62298q = m30999j;
        m30999j.setFillColor(this.f62292k);
        stateListDrawable.addState(new int[]{16842919}, this.f62298q);
        return stateListDrawable;
    }

    /* renamed from: h0 */
    public void m31002h0() {
        this.f62284c.setElevation(this.f62282a.getCardElevation());
    }

    /* renamed from: i */
    public final Drawable m31001i() {
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            this.f62299r = m30999j();
            return new RippleDrawable(this.f62292k, null, this.f62299r);
        }
        return m31003h();
    }

    /* renamed from: i0 */
    public final void m31000i0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && (this.f62282a.getForeground() instanceof InsetDrawable)) {
            ((InsetDrawable) this.f62282a.getForeground()).setDrawable(drawable);
        } else {
            this.f62282a.setForeground(m31040D(drawable));
        }
    }

    /* renamed from: j */
    public final MaterialShapeDrawable m30999j() {
        return new MaterialShapeDrawable(this.f62294m);
    }

    /* renamed from: j0 */
    public void m30998j0() {
        if (!m31039E()) {
            this.f62282a.setBackgroundInternal(m31040D(this.f62284c));
        }
        this.f62282a.setForeground(m31040D(this.f62290i));
    }

    /* renamed from: k */
    public void m30997k() {
        Drawable drawable = this.f62296o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f62296o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f62296o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* renamed from: k0 */
    public final void m30996k0() {
        Drawable drawable;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && (drawable = this.f62296o) != null) {
            ((RippleDrawable) drawable).setColor(this.f62292k);
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = this.f62298q;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setFillColor(this.f62292k);
        }
    }

    /* renamed from: l */
    public MaterialShapeDrawable m30995l() {
        return this.f62284c;
    }

    /* renamed from: l0 */
    public void m30994l0() {
        this.f62285d.setStroke(this.f62289h, this.f62295n);
    }

    /* renamed from: m */
    public ColorStateList m30993m() {
        return this.f62284c.getFillColor();
    }

    /* renamed from: n */
    public ColorStateList m30992n() {
        return this.f62285d.getFillColor();
    }

    /* renamed from: o */
    public Drawable m30991o() {
        return this.f62291j;
    }

    /* renamed from: p */
    public int m30990p() {
        return this.f62288g;
    }

    /* renamed from: q */
    public int m30989q() {
        return this.f62286e;
    }

    /* renamed from: r */
    public int m30988r() {
        return this.f62287f;
    }

    /* renamed from: s */
    public ColorStateList m30987s() {
        return this.f62293l;
    }

    /* renamed from: t */
    public final Drawable m30986t() {
        if (this.f62296o == null) {
            this.f62296o = m31001i();
        }
        if (this.f62297p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f62296o, this.f62285d, this.f62291j});
            this.f62297p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f62297p;
    }

    /* renamed from: u */
    public float m30985u() {
        return this.f62284c.getTopLeftCornerResolvedSize();
    }

    /* renamed from: v */
    public final float m30984v() {
        if (this.f62282a.getPreventCornerOverlap() && this.f62282a.getUseCompatPadding()) {
            return (float) ((1.0d - f62281z) * this.f62282a.getCardViewRadius());
        }
        return 0.0f;
    }

    /* renamed from: w */
    public float m30983w() {
        return this.f62284c.getInterpolation();
    }

    /* renamed from: x */
    public ColorStateList m30982x() {
        return this.f62292k;
    }

    /* renamed from: y */
    public ShapeAppearanceModel m30981y() {
        return this.f62294m;
    }

    /* renamed from: z */
    public int m30980z() {
        ColorStateList colorStateList = this.f62295n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
