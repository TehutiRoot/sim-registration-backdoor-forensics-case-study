package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public class MaterialCardView extends CardView implements Checkable, Shapeable {
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_END = 8388693;
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_START = 8388691;
    public static final int CHECKED_ICON_GRAVITY_TOP_END = 8388661;
    public static final int CHECKED_ICON_GRAVITY_TOP_START = 8388659;

    /* renamed from: o */
    public static final int[] f49353o = {16842911};

    /* renamed from: p */
    public static final int[] f49354p = {16842912};

    /* renamed from: q */
    public static final int[] f49355q = {R.attr.state_dragged};

    /* renamed from: r */
    public static final int f49356r = R.style.Widget_MaterialComponents_CardView;

    /* renamed from: j */
    public final C20099go0 f49357j;

    /* renamed from: k */
    public boolean f49358k;

    /* renamed from: l */
    public boolean f49359l;

    /* renamed from: m */
    public boolean f49360m;

    /* renamed from: n */
    public OnCheckedChangeListener f49361n;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface CheckedIconGravity {
    }

    /* loaded from: classes4.dex */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f49357j.m30995l().getBounds());
        return rectF;
    }

    /* renamed from: c */
    public final void m45545c() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f49357j.m30997k();
        }
    }

    /* renamed from: d */
    public void m45544d(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f49357j.m30993m();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f49357j.m30992n();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f49357j.m30991o();
    }

    public int getCheckedIconGravity() {
        return this.f49357j.m30990p();
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.f49357j.m30989q();
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.f49357j.m30988r();
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f49357j.m30987s();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f49357j.m31041C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f49357j.m31041C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f49357j.m31041C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f49357j.m31041C().top;
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getProgress() {
        return this.f49357j.m30983w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f49357j.m30985u();
    }

    public ColorStateList getRippleColor() {
        return this.f49357j.m30982x();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f49357j.m30981y();
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        return this.f49357j.m30980z();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.f49357j.m31043A();
    }

    @Dimension
    public int getStrokeWidth() {
        return this.f49357j.m31042B();
    }

    public boolean isCheckable() {
        C20099go0 c20099go0 = this.f49357j;
        if (c20099go0 != null && c20099go0.m31038F()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f49359l;
    }

    public boolean isDragged() {
        return this.f49360m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.f49357j.m30995l());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (isCheckable()) {
            View.mergeDrawableStates(onCreateDrawableState, f49353o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f49354p);
        }
        if (isDragged()) {
            View.mergeDrawableStates(onCreateDrawableState, f49355q);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f49357j.m31033K(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f49358k) {
            if (!this.f49357j.m31039E()) {
                this.f49357j.m31032L(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i) {
        this.f49357j.m31031M(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f49357j.m31002h0();
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        this.f49357j.m31030N(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f49357j.m31029O(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f49359l != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.f49357j.m31026R(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.f49357j.m30990p() != i) {
            this.f49357j.m31025S(i);
        }
    }

    public void setCheckedIconMargin(@Dimension int i) {
        this.f49357j.m31024T(i);
    }

    public void setCheckedIconMarginResource(@DimenRes int i) {
        if (i != -1) {
            this.f49357j.m31024T(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        this.f49357j.m31026R(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setCheckedIconSize(@Dimension int i) {
        this.f49357j.m31023U(i);
    }

    public void setCheckedIconSizeResource(@DimenRes int i) {
        if (i != 0) {
            this.f49357j.m31023U(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        this.f49357j.m31022V(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C20099go0 c20099go0 = this.f49357j;
        if (c20099go0 != null) {
            c20099go0.m31006f0();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f49357j.m31012c0(i, i2, i3, i4);
    }

    public void setDragged(boolean z) {
        if (this.f49360m != z) {
            this.f49360m = z;
            refreshDrawableState();
            m45545c();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f49357j.m30998j0();
    }

    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener onCheckedChangeListener) {
        this.f49361n = onCheckedChangeListener;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f49357j.m30998j0();
        this.f49357j.m31004g0();
    }

    public void setProgress(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        this.f49357j.m31020X(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.f49357j.m31021W(f);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        this.f49357j.m31019Y(colorStateList);
    }

    public void setRippleColorResource(@ColorRes int i) {
        this.f49357j.m31019Y(AppCompatResources.getColorStateList(getContext(), i));
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        setClipToOutline(shapeAppearanceModel.isRoundRect(getBoundsAsRectF()));
        this.f49357j.m31018Z(shapeAppearanceModel);
    }

    public void setStrokeColor(@ColorInt int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(@Dimension int i) {
        this.f49357j.m31014b0(i);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f49357j.m30998j0();
        this.f49357j.m31004g0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (isCheckable() && isEnabled()) {
            this.f49359l = !this.f49359l;
            refreshDrawableState();
            m45545c();
            this.f49357j.m31027Q(this.f49359l, true);
            OnCheckedChangeListener onCheckedChangeListener = this.f49361n;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, this.f49359l);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.f49357j.m31031M(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f49357j.m31016a0(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.f49356r
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f49359l = r8
            r7.f49360m = r8
            r0 = 1
            r7.f49358k = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialCardView
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            go0 r0 = new go0
            r0.<init>(r7, r9, r10, r6)
            r7.f49357j = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.m31031M(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.m31012c0(r9, r10, r1, r2)
            r0.m31034J(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
