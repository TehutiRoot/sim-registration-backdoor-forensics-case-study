package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.AttrRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.text.BidiFormatter;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class ChipDrawable extends MaterialShapeDrawable implements TintAwareDrawable, Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {

    /* renamed from: J0 */
    public static final int[] f49479J0 = {16842910};

    /* renamed from: K0 */
    public static final ShapeDrawable f49480K0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public ColorStateList f49481A;

    /* renamed from: A0 */
    public PorterDuff.Mode f49482A0;

    /* renamed from: B */
    public float f49483B;

    /* renamed from: B0 */
    public int[] f49484B0;

    /* renamed from: C */
    public float f49485C;

    /* renamed from: C0 */
    public boolean f49486C0;

    /* renamed from: D */
    public ColorStateList f49487D;

    /* renamed from: D0 */
    public ColorStateList f49488D0;

    /* renamed from: E */
    public float f49489E;

    /* renamed from: E0 */
    public WeakReference f49490E0;

    /* renamed from: F */
    public ColorStateList f49491F;

    /* renamed from: F0 */
    public TextUtils.TruncateAt f49492F0;

    /* renamed from: G */
    public CharSequence f49493G;

    /* renamed from: G0 */
    public boolean f49494G0;

    /* renamed from: H */
    public boolean f49495H;

    /* renamed from: H0 */
    public int f49496H0;

    /* renamed from: I */
    public Drawable f49497I;

    /* renamed from: I0 */
    public boolean f49498I0;

    /* renamed from: J */
    public ColorStateList f49499J;

    /* renamed from: K */
    public float f49500K;

    /* renamed from: L */
    public boolean f49501L;

    /* renamed from: M */
    public boolean f49502M;

    /* renamed from: N */
    public Drawable f49503N;

    /* renamed from: O */
    public Drawable f49504O;

    /* renamed from: P */
    public ColorStateList f49505P;

    /* renamed from: Q */
    public float f49506Q;

    /* renamed from: R */
    public CharSequence f49507R;

    /* renamed from: S */
    public boolean f49508S;

    /* renamed from: T */
    public boolean f49509T;

    /* renamed from: U */
    public Drawable f49510U;

    /* renamed from: V */
    public ColorStateList f49511V;

    /* renamed from: W */
    public MotionSpec f49512W;

    /* renamed from: X */
    public MotionSpec f49513X;

    /* renamed from: Y */
    public float f49514Y;

    /* renamed from: Z */
    public float f49515Z;

    /* renamed from: a0 */
    public float f49516a0;

    /* renamed from: b0 */
    public float f49517b0;

    /* renamed from: c0 */
    public float f49518c0;

    /* renamed from: d0 */
    public float f49519d0;

    /* renamed from: e0 */
    public float f49520e0;

    /* renamed from: f0 */
    public float f49521f0;

    /* renamed from: g0 */
    public final Context f49522g0;

    /* renamed from: h0 */
    public final Paint f49523h0;

    /* renamed from: i0 */
    public final Paint f49524i0;

    /* renamed from: j0 */
    public final Paint.FontMetrics f49525j0;

    /* renamed from: k0 */
    public final RectF f49526k0;

    /* renamed from: l0 */
    public final PointF f49527l0;

    /* renamed from: m0 */
    public final Path f49528m0;

    /* renamed from: n0 */
    public final TextDrawableHelper f49529n0;

    /* renamed from: o0 */
    public int f49530o0;

    /* renamed from: p0 */
    public int f49531p0;

    /* renamed from: q0 */
    public int f49532q0;

    /* renamed from: r0 */
    public int f49533r0;

    /* renamed from: s0 */
    public int f49534s0;

    /* renamed from: t0 */
    public int f49535t0;

    /* renamed from: u0 */
    public boolean f49536u0;

    /* renamed from: v0 */
    public int f49537v0;

    /* renamed from: w0 */
    public int f49538w0;

    /* renamed from: x0 */
    public ColorFilter f49539x0;

    /* renamed from: y0 */
    public PorterDuffColorFilter f49540y0;

    /* renamed from: z */
    public ColorStateList f49541z;

    /* renamed from: z0 */
    public ColorStateList f49542z0;

    /* loaded from: classes4.dex */
    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    public ChipDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f49485C = -1.0f;
        this.f49523h0 = new Paint(1);
        this.f49525j0 = new Paint.FontMetrics();
        this.f49526k0 = new RectF();
        this.f49527l0 = new PointF();
        this.f49528m0 = new Path();
        this.f49538w0 = 255;
        this.f49482A0 = PorterDuff.Mode.SRC_IN;
        this.f49490E0 = new WeakReference(null);
        initializeElevationOverlay(context);
        this.f49522g0 = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f49529n0 = textDrawableHelper;
        this.f49493G = "";
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        this.f49524i0 = null;
        int[] iArr = f49479J0;
        setState(iArr);
        setCloseIconState(iArr);
        this.f49494G0 = true;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            f49480K0.setTint(-1);
        }
    }

    /* renamed from: V */
    public static boolean m45388V(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public static boolean m45387W(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public static boolean m45386X(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public static boolean m45385Y(TextAppearance textAppearance) {
        if (textAppearance != null && textAppearance.getTextColor() != null && textAppearance.getTextColor().isStateful()) {
            return true;
        }
        return false;
    }

    @NonNull
    public static ChipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, i, i2);
        chipDrawable.m45384Z(attributeSet, i, i2);
        return chipDrawable;
    }

    @NonNull
    public static ChipDrawable createFromResource(@NonNull Context context, @XmlRes int i) {
        AttributeSet parseDrawableXml = DrawableUtils.parseDrawableXml(context, i, "chip");
        int styleAttribute = parseDrawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return createFromAttributes(context, parseDrawableXml, R.attr.chipStandaloneStyle, styleAttribute);
    }

    /* renamed from: A */
    public float m45409A() {
        if (!m45378f0() && !m45379e0()) {
            return 0.0f;
        }
        return this.f49515Z + m45390T() + this.f49516a0;
    }

    /* renamed from: B */
    public final void m45408B(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m45377g0()) {
            float f = this.f49521f0 + this.f49520e0 + this.f49506Q + this.f49519d0 + this.f49518c0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    /* renamed from: C */
    public final void m45407C(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m45377g0()) {
            float f = this.f49521f0 + this.f49520e0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f49506Q;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f49506Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f49506Q;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: D */
    public final void m45406D(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m45377g0()) {
            float f = this.f49521f0 + this.f49520e0 + this.f49506Q + this.f49519d0 + this.f49518c0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: E */
    public float m45405E() {
        if (m45377g0()) {
            return this.f49519d0 + this.f49506Q + this.f49520e0;
        }
        return 0.0f;
    }

    /* renamed from: F */
    public final void m45404F(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f49493G != null) {
            float m45409A = this.f49514Y + m45409A() + this.f49517b0;
            float m45405E = this.f49521f0 + m45405E() + this.f49518c0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.left = rect.left + m45409A;
                rectF.right = rect.right - m45405E;
            } else {
                rectF.left = rect.left + m45405E;
                rectF.right = rect.right - m45409A;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: G */
    public final float m45403G() {
        this.f49529n0.getTextPaint().getFontMetrics(this.f49525j0);
        Paint.FontMetrics fontMetrics = this.f49525j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: H */
    public Paint.Align m45402H(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f49493G != null) {
            float m45409A = this.f49514Y + m45409A() + this.f49517b0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                pointF.x = rect.left + m45409A;
            } else {
                pointF.x = rect.right - m45409A;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m45403G();
        }
        return align;
    }

    /* renamed from: I */
    public final boolean m45401I() {
        if (this.f49509T && this.f49510U != null && this.f49508S) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final void m45400J(Canvas canvas, Rect rect) {
        if (m45379e0()) {
            m45372z(rect, this.f49526k0);
            RectF rectF = this.f49526k0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f49510U.setBounds(0, 0, (int) this.f49526k0.width(), (int) this.f49526k0.height());
            this.f49510U.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: K */
    public final void m45399K(Canvas canvas, Rect rect) {
        if (!this.f49498I0) {
            this.f49523h0.setColor(this.f49531p0);
            this.f49523h0.setStyle(Paint.Style.FILL);
            this.f49523h0.setColorFilter(m45389U());
            this.f49526k0.set(rect);
            canvas.drawRoundRect(this.f49526k0, getChipCornerRadius(), getChipCornerRadius(), this.f49523h0);
        }
    }

    /* renamed from: L */
    public final void m45398L(Canvas canvas, Rect rect) {
        if (m45378f0()) {
            m45372z(rect, this.f49526k0);
            RectF rectF = this.f49526k0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f49497I.setBounds(0, 0, (int) this.f49526k0.width(), (int) this.f49526k0.height());
            this.f49497I.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: M */
    public final void m45397M(Canvas canvas, Rect rect) {
        if (this.f49489E > 0.0f && !this.f49498I0) {
            this.f49523h0.setColor(this.f49533r0);
            this.f49523h0.setStyle(Paint.Style.STROKE);
            if (!this.f49498I0) {
                this.f49523h0.setColorFilter(m45389U());
            }
            RectF rectF = this.f49526k0;
            float f = this.f49489E;
            rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
            float f2 = this.f49485C - (this.f49489E / 2.0f);
            canvas.drawRoundRect(this.f49526k0, f2, f2, this.f49523h0);
        }
    }

    /* renamed from: N */
    public final void m45396N(Canvas canvas, Rect rect) {
        if (!this.f49498I0) {
            this.f49523h0.setColor(this.f49530o0);
            this.f49523h0.setStyle(Paint.Style.FILL);
            this.f49526k0.set(rect);
            canvas.drawRoundRect(this.f49526k0, getChipCornerRadius(), getChipCornerRadius(), this.f49523h0);
        }
    }

    /* renamed from: O */
    public final void m45395O(Canvas canvas, Rect rect) {
        if (m45377g0()) {
            m45407C(rect, this.f49526k0);
            RectF rectF = this.f49526k0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f49503N.setBounds(0, 0, (int) this.f49526k0.width(), (int) this.f49526k0.height());
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.f49504O.setBounds(this.f49503N.getBounds());
                this.f49504O.jumpToCurrentState();
                this.f49504O.draw(canvas);
            } else {
                this.f49503N.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: P */
    public final void m45394P(Canvas canvas, Rect rect) {
        this.f49523h0.setColor(this.f49534s0);
        this.f49523h0.setStyle(Paint.Style.FILL);
        this.f49526k0.set(rect);
        if (!this.f49498I0) {
            canvas.drawRoundRect(this.f49526k0, getChipCornerRadius(), getChipCornerRadius(), this.f49523h0);
            return;
        }
        calculatePathForSize(new RectF(rect), this.f49528m0);
        super.drawShape(canvas, this.f49523h0, this.f49528m0, getBoundsAsRectF());
    }

    /* renamed from: Q */
    public final void m45393Q(Canvas canvas, Rect rect) {
        Paint paint = this.f49524i0;
        if (paint != null) {
            paint.setColor(ColorUtils.setAlphaComponent(-16777216, 127));
            canvas.drawRect(rect, this.f49524i0);
            if (m45378f0() || m45379e0()) {
                m45372z(rect, this.f49526k0);
                canvas.drawRect(this.f49526k0, this.f49524i0);
            }
            if (this.f49493G != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f49524i0);
            }
            if (m45377g0()) {
                m45407C(rect, this.f49526k0);
                canvas.drawRect(this.f49526k0, this.f49524i0);
            }
            this.f49524i0.setColor(ColorUtils.setAlphaComponent(SupportMenu.CATEGORY_MASK, 127));
            m45408B(rect, this.f49526k0);
            canvas.drawRect(this.f49526k0, this.f49524i0);
            this.f49524i0.setColor(ColorUtils.setAlphaComponent(-16711936, 127));
            m45406D(rect, this.f49526k0);
            canvas.drawRect(this.f49526k0, this.f49524i0);
        }
    }

    /* renamed from: R */
    public final void m45392R(Canvas canvas, Rect rect) {
        boolean z;
        if (this.f49493G != null) {
            Paint.Align m45402H = m45402H(rect, this.f49527l0);
            m45404F(rect, this.f49526k0);
            if (this.f49529n0.getTextAppearance() != null) {
                this.f49529n0.getTextPaint().drawableState = getState();
                this.f49529n0.updateTextPaintDrawState(this.f49522g0);
            }
            this.f49529n0.getTextPaint().setTextAlign(m45402H);
            int i = 0;
            if (Math.round(this.f49529n0.getTextWidth(getText().toString())) > Math.round(this.f49526k0.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f49526k0);
            }
            CharSequence charSequence = this.f49493G;
            if (z && this.f49492F0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f49529n0.getTextPaint(), this.f49526k0.width(), this.f49492F0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f49527l0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f49529n0.getTextPaint());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: S */
    public final float m45391S() {
        Drawable drawable;
        if (this.f49536u0) {
            drawable = this.f49510U;
        } else {
            drawable = this.f49497I;
        }
        float f = this.f49500K;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(ViewUtils.dpToPx(this.f49522g0, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: T */
    public final float m45390T() {
        Drawable drawable;
        if (this.f49536u0) {
            drawable = this.f49510U;
        } else {
            drawable = this.f49497I;
        }
        float f = this.f49500K;
        if (f <= 0.0f && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return f;
    }

    /* renamed from: U */
    public final ColorFilter m45389U() {
        ColorFilter colorFilter = this.f49539x0;
        if (colorFilter == null) {
            return this.f49540y0;
        }
        return colorFilter;
    }

    /* renamed from: Z */
    public final void m45384Z(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.f49522g0, attributeSet, R.styleable.Chip, i, i2, new int[0]);
        this.f49498I0 = obtainStyledAttributes.hasValue(R.styleable.Chip_shapeAppearance);
        m45382b0(MaterialResources.getColorStateList(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_chipSurfaceColor));
        setChipBackgroundColor(MaterialResources.getColorStateList(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_chipBackgroundColor));
        setChipMinHeight(obtainStyledAttributes.getDimension(R.styleable.Chip_chipMinHeight, 0.0f));
        if (obtainStyledAttributes.hasValue(R.styleable.Chip_chipCornerRadius)) {
            setChipCornerRadius(obtainStyledAttributes.getDimension(R.styleable.Chip_chipCornerRadius, 0.0f));
        }
        setChipStrokeColor(MaterialResources.getColorStateList(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_chipStrokeColor));
        setChipStrokeWidth(obtainStyledAttributes.getDimension(R.styleable.Chip_chipStrokeWidth, 0.0f));
        setRippleColor(MaterialResources.getColorStateList(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_rippleColor));
        setText(obtainStyledAttributes.getText(R.styleable.Chip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_android_textAppearance);
        textAppearance.setTextSize(obtainStyledAttributes.getDimension(R.styleable.Chip_android_textSize, textAppearance.getTextSize()));
        if (Build.VERSION.SDK_INT < 23) {
            textAppearance.setTextColor(MaterialResources.getColorStateList(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_android_textColor));
        }
        setTextAppearance(textAppearance);
        int i3 = obtainStyledAttributes.getInt(R.styleable.Chip_android_ellipsize, 0);
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    setEllipsize(TextUtils.TruncateAt.END);
                }
            } else {
                setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
        } else {
            setEllipsize(TextUtils.TruncateAt.START);
        }
        setChipIconVisible(obtainStyledAttributes.getBoolean(R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            setChipIconVisible(obtainStyledAttributes.getBoolean(R.styleable.Chip_chipIconEnabled, false));
        }
        setChipIcon(MaterialResources.getDrawable(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_chipIcon));
        if (obtainStyledAttributes.hasValue(R.styleable.Chip_chipIconTint)) {
            setChipIconTint(MaterialResources.getColorStateList(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_chipIconTint));
        }
        setChipIconSize(obtainStyledAttributes.getDimension(R.styleable.Chip_chipIconSize, -1.0f));
        setCloseIconVisible(obtainStyledAttributes.getBoolean(R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            setCloseIconVisible(obtainStyledAttributes.getBoolean(R.styleable.Chip_closeIconEnabled, false));
        }
        setCloseIcon(MaterialResources.getDrawable(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_closeIcon));
        setCloseIconTint(MaterialResources.getColorStateList(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_closeIconTint));
        setCloseIconSize(obtainStyledAttributes.getDimension(R.styleable.Chip_closeIconSize, 0.0f));
        setCheckable(obtainStyledAttributes.getBoolean(R.styleable.Chip_android_checkable, false));
        setCheckedIconVisible(obtainStyledAttributes.getBoolean(R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            setCheckedIconVisible(obtainStyledAttributes.getBoolean(R.styleable.Chip_checkedIconEnabled, false));
        }
        setCheckedIcon(MaterialResources.getDrawable(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_checkedIcon));
        if (obtainStyledAttributes.hasValue(R.styleable.Chip_checkedIconTint)) {
            setCheckedIconTint(MaterialResources.getColorStateList(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_checkedIconTint));
        }
        setShowMotionSpec(MotionSpec.createFromAttribute(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_showMotionSpec));
        setHideMotionSpec(MotionSpec.createFromAttribute(this.f49522g0, obtainStyledAttributes, R.styleable.Chip_hideMotionSpec));
        setChipStartPadding(obtainStyledAttributes.getDimension(R.styleable.Chip_chipStartPadding, 0.0f));
        setIconStartPadding(obtainStyledAttributes.getDimension(R.styleable.Chip_iconStartPadding, 0.0f));
        setIconEndPadding(obtainStyledAttributes.getDimension(R.styleable.Chip_iconEndPadding, 0.0f));
        setTextStartPadding(obtainStyledAttributes.getDimension(R.styleable.Chip_textStartPadding, 0.0f));
        setTextEndPadding(obtainStyledAttributes.getDimension(R.styleable.Chip_textEndPadding, 0.0f));
        setCloseIconStartPadding(obtainStyledAttributes.getDimension(R.styleable.Chip_closeIconStartPadding, 0.0f));
        setCloseIconEndPadding(obtainStyledAttributes.getDimension(R.styleable.Chip_closeIconEndPadding, 0.0f));
        setChipEndPadding(obtainStyledAttributes.getDimension(R.styleable.Chip_chipEndPadding, 0.0f));
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0156  */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m45383a0(int[] r7, int[] r8) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipDrawable.m45383a0(int[], int[]):boolean");
    }

    /* renamed from: b0 */
    public final void m45382b0(ColorStateList colorStateList) {
        if (this.f49541z != colorStateList) {
            this.f49541z = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: c0 */
    public void m45381c0(boolean z) {
        this.f49494G0 = z;
    }

    /* renamed from: d0 */
    public boolean m45380d0() {
        return this.f49494G0;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = this.f49538w0;
            if (i2 < 255) {
                i = CanvasCompat.saveLayerAlpha(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
            } else {
                i = 0;
            }
            m45396N(canvas, bounds);
            m45399K(canvas, bounds);
            if (this.f49498I0) {
                super.draw(canvas);
            }
            m45397M(canvas, bounds);
            m45394P(canvas, bounds);
            m45398L(canvas, bounds);
            m45400J(canvas, bounds);
            if (this.f49494G0) {
                m45392R(canvas, bounds);
            }
            m45395O(canvas, bounds);
            m45393Q(canvas, bounds);
            if (this.f49538w0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e0 */
    public final boolean m45379e0() {
        if (this.f49509T && this.f49510U != null && this.f49536u0) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public final boolean m45378f0() {
        if (this.f49495H && this.f49497I != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    public final boolean m45377g0() {
        if (this.f49502M && this.f49503N != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f49538w0;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f49510U;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f49511V;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        return this.f49481A;
    }

    public float getChipCornerRadius() {
        if (this.f49498I0) {
            return getTopLeftCornerResolvedSize();
        }
        return this.f49485C;
    }

    public float getChipEndPadding() {
        return this.f49521f0;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable = this.f49497I;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    public float getChipIconSize() {
        return this.f49500K;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        return this.f49499J;
    }

    public float getChipMinHeight() {
        return this.f49483B;
    }

    public float getChipStartPadding() {
        return this.f49514Y;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        return this.f49487D;
    }

    public float getChipStrokeWidth() {
        return this.f49489E;
    }

    public void getChipTouchBounds(@NonNull RectF rectF) {
        m45408B(getBounds(), rectF);
    }

    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable = this.f49503N;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        return this.f49507R;
    }

    public float getCloseIconEndPadding() {
        return this.f49520e0;
    }

    public float getCloseIconSize() {
        return this.f49506Q;
    }

    public float getCloseIconStartPadding() {
        return this.f49519d0;
    }

    @NonNull
    public int[] getCloseIconState() {
        return this.f49484B0;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        return this.f49505P;
    }

    public void getCloseIconTouchBounds(@NonNull RectF rectF) {
        m45406D(getBounds(), rectF);
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.f49539x0;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.f49492F0;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.f49513X;
    }

    public float getIconEndPadding() {
        return this.f49516a0;
    }

    public float getIconStartPadding() {
        return this.f49515Z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f49483B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f49514Y + m45409A() + this.f49517b0 + this.f49529n0.getTextWidth(getText().toString()) + this.f49518c0 + m45405E() + this.f49521f0), this.f49496H0);
    }

    @InterfaceC2055Px
    public int getMaxWidth() {
        return this.f49496H0;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f49498I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f49485C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f49485C);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.f49491F;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.f49512W;
    }

    @Nullable
    public CharSequence getText() {
        return this.f49493G;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.f49529n0.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.f49518c0;
    }

    public float getTextStartPadding() {
        return this.f49517b0;
    }

    public boolean getUseCompatRipple() {
        return this.f49486C0;
    }

    /* renamed from: h0 */
    public final void m45376h0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: i0 */
    public final void m45375i0() {
        ColorStateList colorStateList;
        if (this.f49486C0) {
            colorStateList = RippleUtils.sanitizeRippleDrawableColor(this.f49491F);
        } else {
            colorStateList = null;
        }
        this.f49488D0 = colorStateList;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isCheckable() {
        return this.f49508S;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.f49509T;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.f49495H;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return m45386X(this.f49503N);
    }

    public boolean isCloseIconVisible() {
        return this.f49502M;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!m45387W(this.f49541z) && !m45387W(this.f49481A) && !m45387W(this.f49487D) && ((!this.f49486C0 || !m45387W(this.f49488D0)) && !m45385Y(this.f49529n0.getTextAppearance()) && !m45401I() && !m45386X(this.f49497I) && !m45386X(this.f49510U) && !m45387W(this.f49542z0))) {
            return false;
        }
        return true;
    }

    /* renamed from: j0 */
    public final void m45374j0() {
        this.f49504O = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(getRippleColor()), this.f49503N, f49480K0);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m45378f0()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f49497I, i);
        }
        if (m45379e0()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f49510U, i);
        }
        if (m45377g0()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f49503N, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m45378f0()) {
            onLevelChange |= this.f49497I.setLevel(i);
        }
        if (m45379e0()) {
            onLevelChange |= this.f49510U.setLevel(i);
        }
        if (m45377g0()) {
            onLevelChange |= this.f49503N.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public void onSizeChange() {
        Delegate delegate = (Delegate) this.f49490E0.get();
        if (delegate != null) {
            delegate.onChipDrawableSizeChange();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.f49498I0) {
            super.onStateChange(iArr);
        }
        return m45383a0(iArr, getCloseIconState());
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        onSizeChange();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f49538w0 != i) {
            this.f49538w0 = i;
            invalidateSelf();
        }
    }

    public void setCheckable(boolean z) {
        if (this.f49508S != z) {
            this.f49508S = z;
            float m45409A = m45409A();
            if (!z && this.f49536u0) {
                this.f49536u0 = false;
            }
            float m45409A2 = m45409A();
            invalidateSelf();
            if (m45409A != m45409A2) {
                onSizeChange();
            }
        }
    }

    public void setCheckableResource(@BoolRes int i) {
        setCheckable(this.f49522g0.getResources().getBoolean(i));
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        if (this.f49510U != drawable) {
            float m45409A = m45409A();
            this.f49510U = drawable;
            float m45409A2 = m45409A();
            m45376h0(this.f49510U);
            m45373y(this.f49510U);
            invalidateSelf();
            if (m45409A != m45409A2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i) {
        setCheckedIconVisible(this.f49522g0.getResources().getBoolean(i));
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        setCheckedIcon(AppCompatResources.getDrawable(this.f49522g0, i));
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f49511V != colorStateList) {
            this.f49511V = colorStateList;
            if (m45401I()) {
                DrawableCompat.setTintList(this.f49510U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i) {
        setCheckedIconTint(AppCompatResources.getColorStateList(this.f49522g0, i));
    }

    public void setCheckedIconVisible(@BoolRes int i) {
        setCheckedIconVisible(this.f49522g0.getResources().getBoolean(i));
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        if (this.f49481A != colorStateList) {
            this.f49481A = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i) {
        setChipBackgroundColor(AppCompatResources.getColorStateList(this.f49522g0, i));
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        if (this.f49485C != f) {
            this.f49485C = f;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i) {
        setChipCornerRadius(this.f49522g0.getResources().getDimension(i));
    }

    public void setChipEndPadding(float f) {
        if (this.f49521f0 != f) {
            this.f49521f0 = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i) {
        setChipEndPadding(this.f49522g0.getResources().getDimension(i));
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        Drawable drawable2;
        Drawable chipIcon = getChipIcon();
        if (chipIcon != drawable) {
            float m45409A = m45409A();
            if (drawable != null) {
                drawable2 = DrawableCompat.wrap(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f49497I = drawable2;
            float m45409A2 = m45409A();
            m45376h0(chipIcon);
            if (m45378f0()) {
                m45373y(this.f49497I);
            }
            invalidateSelf();
            if (m45409A != m45409A2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@DrawableRes int i) {
        setChipIcon(AppCompatResources.getDrawable(this.f49522g0, i));
    }

    public void setChipIconSize(float f) {
        if (this.f49500K != f) {
            float m45409A = m45409A();
            this.f49500K = f;
            float m45409A2 = m45409A();
            invalidateSelf();
            if (m45409A != m45409A2) {
                onSizeChange();
            }
        }
    }

    public void setChipIconSizeResource(@DimenRes int i) {
        setChipIconSize(this.f49522g0.getResources().getDimension(i));
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        this.f49501L = true;
        if (this.f49499J != colorStateList) {
            this.f49499J = colorStateList;
            if (m45378f0()) {
                DrawableCompat.setTintList(this.f49497I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipIconTintResource(@ColorRes int i) {
        setChipIconTint(AppCompatResources.getColorStateList(this.f49522g0, i));
    }

    public void setChipIconVisible(@BoolRes int i) {
        setChipIconVisible(this.f49522g0.getResources().getBoolean(i));
    }

    public void setChipMinHeight(float f) {
        if (this.f49483B != f) {
            this.f49483B = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipMinHeightResource(@DimenRes int i) {
        setChipMinHeight(this.f49522g0.getResources().getDimension(i));
    }

    public void setChipStartPadding(float f) {
        if (this.f49514Y != f) {
            this.f49514Y = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i) {
        setChipStartPadding(this.f49522g0.getResources().getDimension(i));
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.f49487D != colorStateList) {
            this.f49487D = colorStateList;
            if (this.f49498I0) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i) {
        setChipStrokeColor(AppCompatResources.getColorStateList(this.f49522g0, i));
    }

    public void setChipStrokeWidth(float f) {
        if (this.f49489E != f) {
            this.f49489E = f;
            this.f49523h0.setStrokeWidth(f);
            if (this.f49498I0) {
                super.setStrokeWidth(f);
            }
            invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i) {
        setChipStrokeWidth(this.f49522g0.getResources().getDimension(i));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        Drawable drawable2;
        Drawable closeIcon = getCloseIcon();
        if (closeIcon != drawable) {
            float m45405E = m45405E();
            if (drawable != null) {
                drawable2 = DrawableCompat.wrap(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f49503N = drawable2;
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                m45374j0();
            }
            float m45405E2 = m45405E();
            m45376h0(closeIcon);
            if (m45377g0()) {
                m45373y(this.f49503N);
            }
            invalidateSelf();
            if (m45405E != m45405E2) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        if (this.f49507R != charSequence) {
            this.f49507R = BidiFormatter.getInstance().unicodeWrap(charSequence);
            invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        if (this.f49520e0 != f) {
            this.f49520e0 = f;
            invalidateSelf();
            if (m45377g0()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i) {
        setCloseIconEndPadding(this.f49522g0.getResources().getDimension(i));
    }

    public void setCloseIconResource(@DrawableRes int i) {
        setCloseIcon(AppCompatResources.getDrawable(this.f49522g0, i));
    }

    public void setCloseIconSize(float f) {
        if (this.f49506Q != f) {
            this.f49506Q = f;
            invalidateSelf();
            if (m45377g0()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i) {
        setCloseIconSize(this.f49522g0.getResources().getDimension(i));
    }

    public void setCloseIconStartPadding(float f) {
        if (this.f49519d0 != f) {
            this.f49519d0 = f;
            invalidateSelf();
            if (m45377g0()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i) {
        setCloseIconStartPadding(this.f49522g0.getResources().getDimension(i));
    }

    public boolean setCloseIconState(@NonNull int[] iArr) {
        if (!Arrays.equals(this.f49484B0, iArr)) {
            this.f49484B0 = iArr;
            if (m45377g0()) {
                return m45383a0(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f49505P != colorStateList) {
            this.f49505P = colorStateList;
            if (m45377g0()) {
                DrawableCompat.setTintList(this.f49503N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCloseIconTintResource(@ColorRes int i) {
        setCloseIconTint(AppCompatResources.getColorStateList(this.f49522g0, i));
    }

    public void setCloseIconVisible(@BoolRes int i) {
        setCloseIconVisible(this.f49522g0.getResources().getBoolean(i));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.f49539x0 != colorFilter) {
            this.f49539x0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setDelegate(@Nullable Delegate delegate) {
        this.f49490E0 = new WeakReference(delegate);
    }

    public void setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
        this.f49492F0 = truncateAt;
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f49513X = motionSpec;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(MotionSpec.createFromResource(this.f49522g0, i));
    }

    public void setIconEndPadding(float f) {
        if (this.f49516a0 != f) {
            float m45409A = m45409A();
            this.f49516a0 = f;
            float m45409A2 = m45409A();
            invalidateSelf();
            if (m45409A != m45409A2) {
                onSizeChange();
            }
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i) {
        setIconEndPadding(this.f49522g0.getResources().getDimension(i));
    }

    public void setIconStartPadding(float f) {
        if (this.f49515Z != f) {
            float m45409A = m45409A();
            this.f49515Z = f;
            float m45409A2 = m45409A();
            invalidateSelf();
            if (m45409A != m45409A2) {
                onSizeChange();
            }
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i) {
        setIconStartPadding(this.f49522g0.getResources().getDimension(i));
    }

    public void setMaxWidth(@InterfaceC2055Px int i) {
        this.f49496H0 = i;
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f49491F != colorStateList) {
            this.f49491F = colorStateList;
            m45375i0();
            onStateChange(getState());
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        setRippleColor(AppCompatResources.getColorStateList(this.f49522g0, i));
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f49512W = motionSpec;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(MotionSpec.createFromResource(this.f49522g0, i));
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f49493G, charSequence)) {
            this.f49493G = charSequence;
            this.f49529n0.setTextWidthDirty(true);
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        this.f49529n0.setTextAppearance(textAppearance, this.f49522g0);
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        setTextAppearance(new TextAppearance(this.f49522g0, i));
    }

    public void setTextColor(@ColorInt int i) {
        setTextColor(ColorStateList.valueOf(i));
    }

    public void setTextEndPadding(float f) {
        if (this.f49518c0 != f) {
            this.f49518c0 = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i) {
        setTextEndPadding(this.f49522g0.getResources().getDimension(i));
    }

    public void setTextResource(@StringRes int i) {
        setText(this.f49522g0.getResources().getString(i));
    }

    public void setTextSize(@Dimension float f) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextSize(f);
            this.f49529n0.getTextPaint().setTextSize(f);
            onTextSizeChange();
        }
    }

    public void setTextStartPadding(float f) {
        if (this.f49517b0 != f) {
            this.f49517b0 = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i) {
        setTextStartPadding(this.f49522g0.getResources().getDimension(i));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.f49542z0 != colorStateList) {
            this.f49542z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f49482A0 != mode) {
            this.f49482A0 = mode;
            this.f49540y0 = DrawableUtils.updateTintFilter(this, this.f49542z0, mode);
            invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z) {
        if (this.f49486C0 != z) {
            this.f49486C0 = z;
            m45375i0();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m45378f0()) {
            visible |= this.f49497I.setVisible(z, z2);
        }
        if (m45379e0()) {
            visible |= this.f49510U.setVisible(z, z2);
        }
        if (m45377g0()) {
            visible |= this.f49503N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: y */
    public final void m45373y(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f49503N) {
            if (drawable.isStateful()) {
                drawable.setState(getCloseIconState());
            }
            DrawableCompat.setTintList(drawable, this.f49505P);
            return;
        }
        Drawable drawable2 = this.f49497I;
        if (drawable == drawable2 && this.f49501L) {
            DrawableCompat.setTintList(drawable2, this.f49499J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: z */
    public final void m45372z(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m45378f0() || m45379e0()) {
            float f = this.f49514Y + this.f49515Z;
            float m45390T = m45390T();
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + m45390T;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - m45390T;
            }
            float m45391S = m45391S();
            float exactCenterY = rect.exactCenterY() - (m45391S / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + m45391S;
        }
    }

    public void setCheckedIconVisible(boolean z) {
        if (this.f49509T != z) {
            boolean m45379e0 = m45379e0();
            this.f49509T = z;
            boolean m45379e02 = m45379e0();
            if (m45379e0 != m45379e02) {
                if (m45379e02) {
                    m45373y(this.f49510U);
                } else {
                    m45376h0(this.f49510U);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setChipIconVisible(boolean z) {
        if (this.f49495H != z) {
            boolean m45378f0 = m45378f0();
            this.f49495H = z;
            boolean m45378f02 = m45378f0();
            if (m45378f0 != m45378f02) {
                if (m45378f02) {
                    m45373y(this.f49497I);
                } else {
                    m45376h0(this.f49497I);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        if (this.f49502M != z) {
            boolean m45377g0 = m45377g0();
            this.f49502M = z;
            boolean m45377g02 = m45377g0();
            if (m45377g0 != m45377g02) {
                if (m45377g02) {
                    m45373y(this.f49503N);
                } else {
                    m45376h0(this.f49503N);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextColor(colorStateList);
            invalidateSelf();
        }
    }
}
