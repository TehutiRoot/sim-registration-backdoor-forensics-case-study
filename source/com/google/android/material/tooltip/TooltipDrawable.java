package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.FloatRange;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {

    /* renamed from: Q */
    public static final int f51249Q = R.style.Widget_MaterialComponents_Tooltip;

    /* renamed from: R */
    public static final int f51250R = R.attr.tooltipStyle;

    /* renamed from: A */
    public final Context f51251A;

    /* renamed from: B */
    public final Paint.FontMetrics f51252B;

    /* renamed from: C */
    public final TextDrawableHelper f51253C;

    /* renamed from: D */
    public final View.OnLayoutChangeListener f51254D;

    /* renamed from: E */
    public final Rect f51255E;

    /* renamed from: F */
    public int f51256F;

    /* renamed from: G */
    public int f51257G;

    /* renamed from: H */
    public int f51258H;

    /* renamed from: I */
    public int f51259I;

    /* renamed from: J */
    public int f51260J;

    /* renamed from: K */
    public int f51261K;

    /* renamed from: L */
    public float f51262L;

    /* renamed from: M */
    public float f51263M;

    /* renamed from: N */
    public final float f51264N;

    /* renamed from: O */
    public float f51265O;

    /* renamed from: P */
    public float f51266P;

    /* renamed from: z */
    public CharSequence f51267z;

    /* renamed from: com.google.android.material.tooltip.TooltipDrawable$a */
    /* loaded from: classes4.dex */
    public class View$OnLayoutChangeListenerC7149a implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC7149a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            TooltipDrawable.this.m43567G(view);
        }
    }

    public TooltipDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f51252B = new Paint.FontMetrics();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f51253C = textDrawableHelper;
        this.f51254D = new View$OnLayoutChangeListenerC7149a();
        this.f51255E = new Rect();
        this.f51262L = 1.0f;
        this.f51263M = 1.0f;
        this.f51264N = 0.5f;
        this.f51265O = 0.5f;
        this.f51266P = 1.0f;
        this.f51251A = context;
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: A */
    private float m43573A() {
        this.f51253C.getTextPaint().getFontMetrics(this.f51252B);
        Paint.FontMetrics fontMetrics = this.f51252B;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: F */
    private void m43568F(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.f51251A, attributeSet, R.styleable.Tooltip, i, i2, new int[0]);
        this.f51260J = this.f51251A.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(m43571C()).build());
        setText(obtainStyledAttributes.getText(R.styleable.Tooltip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.f51251A, obtainStyledAttributes, R.styleable.Tooltip_android_textAppearance);
        if (textAppearance != null && obtainStyledAttributes.hasValue(R.styleable.Tooltip_android_textColor)) {
            textAppearance.setTextColor(MaterialResources.getColorStateList(this.f51251A, obtainStyledAttributes, R.styleable.Tooltip_android_textColor));
        }
        setTextAppearance(textAppearance);
        setFillColor(ColorStateList.valueOf(obtainStyledAttributes.getColor(R.styleable.Tooltip_backgroundTint, MaterialColors.layer(ColorUtils.setAlphaComponent(MaterialColors.getColor(this.f51251A, 16842801, TooltipDrawable.class.getCanonicalName()), 229), ColorUtils.setAlphaComponent(MaterialColors.getColor(this.f51251A, R.attr.colorOnBackground, TooltipDrawable.class.getCanonicalName()), 153)))));
        setStrokeColor(ColorStateList.valueOf(MaterialColors.getColor(this.f51251A, R.attr.colorSurface, TooltipDrawable.class.getCanonicalName())));
        this.f51256F = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_padding, 0);
        this.f51257G = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minWidth, 0);
        this.f51258H = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minHeight, 0);
        this.f51259I = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_layout_margin, 0);
        obtainStyledAttributes.recycle();
    }

    @NonNull
    public static TooltipDrawable create(@NonNull Context context) {
        return createFromAttributes(context, null, f51250R, f51249Q);
    }

    @NonNull
    public static TooltipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context, attributeSet, i, i2);
        tooltipDrawable.m43568F(attributeSet, i, i2);
        return tooltipDrawable;
    }

    /* renamed from: B */
    public final float m43572B(Rect rect) {
        return rect.centerY() - m43573A();
    }

    /* renamed from: C */
    public final EdgeTreatment m43571C() {
        float width = ((float) (getBounds().width() - (this.f51260J * Math.sqrt(2.0d)))) / 2.0f;
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment(this.f51260J), Math.min(Math.max(-m43565z(), -width), width));
    }

    /* renamed from: D */
    public final void m43570D(Canvas canvas) {
        if (this.f51267z == null) {
            return;
        }
        Rect bounds = getBounds();
        int m43572B = (int) m43572B(bounds);
        if (this.f51253C.getTextAppearance() != null) {
            this.f51253C.getTextPaint().drawableState = getState();
            this.f51253C.updateTextPaintDrawState(this.f51251A);
            this.f51253C.getTextPaint().setAlpha((int) (this.f51266P * 255.0f));
        }
        CharSequence charSequence = this.f51267z;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), m43572B, this.f51253C.getTextPaint());
    }

    /* renamed from: E */
    public final float m43569E() {
        CharSequence charSequence = this.f51267z;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f51253C.getTextWidth(charSequence.toString());
    }

    /* renamed from: G */
    public final void m43567G(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f51261K = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f51255E);
    }

    public void detachView(@Nullable View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.f51254D);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        canvas.scale(this.f51262L, this.f51263M, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.f51265O));
        canvas.translate(m43565z(), (float) (-((this.f51260J * Math.sqrt(2.0d)) - this.f51260J)));
        super.draw(canvas);
        m43570D(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f51253C.getTextPaint().getTextSize(), this.f51258H);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f51256F * 2) + m43569E(), this.f51257G);
    }

    public int getLayoutMargin() {
        return this.f51259I;
    }

    public int getMinHeight() {
        return this.f51258H;
    }

    public int getMinWidth() {
        return this.f51257G;
    }

    @Nullable
    public CharSequence getText() {
        return this.f51267z;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.f51253C.getTextAppearance();
    }

    public int getTextPadding() {
        return this.f51256F;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(m43571C()).build());
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setLayoutMargin(@InterfaceC2055Px int i) {
        this.f51259I = i;
        invalidateSelf();
    }

    public void setMinHeight(@InterfaceC2055Px int i) {
        this.f51258H = i;
        invalidateSelf();
    }

    public void setMinWidth(@InterfaceC2055Px int i) {
        this.f51257G = i;
        invalidateSelf();
    }

    public void setRelativeToView(@Nullable View view) {
        if (view == null) {
            return;
        }
        m43567G(view);
        view.addOnLayoutChangeListener(this.f51254D);
    }

    public void setRevealFraction(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        this.f51265O = 1.2f;
        this.f51262L = f;
        this.f51263M = f;
        this.f51266P = AnimationUtils.lerp(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (!TextUtils.equals(this.f51267z, charSequence)) {
            this.f51267z = charSequence;
            this.f51253C.setTextWidthDirty(true);
            invalidateSelf();
        }
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        this.f51253C.setTextAppearance(textAppearance, this.f51251A);
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        setTextAppearance(new TextAppearance(this.f51251A, i));
    }

    public void setTextPadding(@InterfaceC2055Px int i) {
        this.f51256F = i;
        invalidateSelf();
    }

    public void setTextResource(@StringRes int i) {
        setText(this.f51251A.getResources().getString(i));
    }

    /* renamed from: z */
    public final float m43565z() {
        int i;
        if (((this.f51255E.right - getBounds().right) - this.f51261K) - this.f51259I < 0) {
            i = ((this.f51255E.right - getBounds().right) - this.f51261K) - this.f51259I;
        } else if (((this.f51255E.left - getBounds().left) - this.f51261K) + this.f51259I > 0) {
            i = ((this.f51255E.left - getBounds().left) - this.f51261K) + this.f51259I;
        } else {
            return 0.0f;
        }
        return i;
    }

    @NonNull
    public static TooltipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return createFromAttributes(context, attributeSet, f51250R, f51249Q);
    }
}
