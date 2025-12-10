package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;

/* loaded from: classes4.dex */
public class MaterialSwitch extends SwitchCompat {

    /* renamed from: j0 */
    public static final int f50311j0 = R.style.Widget_Material3_CompoundButton_MaterialSwitch;

    /* renamed from: k0 */
    public static final int[] f50312k0 = {R.attr.state_with_icon};

    /* renamed from: U */
    public Drawable f50313U;

    /* renamed from: V */
    public Drawable f50314V;

    /* renamed from: W */
    public Drawable f50315W;

    /* renamed from: a0 */
    public Drawable f50316a0;

    /* renamed from: b0 */
    public ColorStateList f50317b0;

    /* renamed from: c0 */
    public ColorStateList f50318c0;

    /* renamed from: d0 */
    public PorterDuff.Mode f50319d0;

    /* renamed from: e0 */
    public ColorStateList f50320e0;

    /* renamed from: f0 */
    public ColorStateList f50321f0;

    /* renamed from: g0 */
    public PorterDuff.Mode f50322g0;

    /* renamed from: h0 */
    public int[] f50323h0;

    /* renamed from: i0 */
    public int[] f50324i0;

    public MaterialSwitch(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: r */
    public static void m44516r(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable != null && colorStateList != null) {
            DrawableCompat.setTint(drawable, ColorUtils.blendARGB(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.f50313U;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.f50314V;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.f50318c0;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f50319d0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f50317b0;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.f50316a0;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.f50321f0;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f50322g0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.f50315W;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f50320e0;
    }

    @Override // android.view.View
    public void invalidate() {
        m44515s();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f50314V != null) {
            View.mergeDrawableStates(onCreateDrawableState, f50312k0);
        }
        this.f50323h0 = DrawableUtils.getUncheckedState(onCreateDrawableState);
        this.f50324i0 = DrawableUtils.getCheckedState(onCreateDrawableState);
        return onCreateDrawableState;
    }

    /* renamed from: p */
    public final void m44518p() {
        this.f50313U = DrawableUtils.createTintableDrawableIfNeeded(this.f50313U, this.f50317b0, getThumbTintMode());
        this.f50314V = DrawableUtils.createTintableDrawableIfNeeded(this.f50314V, this.f50318c0, this.f50319d0);
        m44515s();
        super.setThumbDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.f50313U, this.f50314V));
        refreshDrawableState();
    }

    /* renamed from: q */
    public final void m44517q() {
        this.f50315W = DrawableUtils.createTintableDrawableIfNeeded(this.f50315W, this.f50320e0, getTrackTintMode());
        this.f50316a0 = DrawableUtils.createTintableDrawableIfNeeded(this.f50316a0, this.f50321f0, this.f50322g0);
        m44515s();
        Drawable drawable = this.f50315W;
        if (drawable != null && this.f50316a0 != null) {
            drawable = new LayerDrawable(new Drawable[]{this.f50315W, this.f50316a0});
        } else if (drawable == null) {
            drawable = this.f50316a0;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    /* renamed from: s */
    public final void m44515s() {
        if (this.f50317b0 == null && this.f50318c0 == null && this.f50320e0 == null && this.f50321f0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f50317b0;
        if (colorStateList != null) {
            m44516r(this.f50313U, colorStateList, this.f50323h0, this.f50324i0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f50318c0;
        if (colorStateList2 != null) {
            m44516r(this.f50314V, colorStateList2, this.f50323h0, this.f50324i0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f50320e0;
        if (colorStateList3 != null) {
            m44516r(this.f50315W, colorStateList3, this.f50323h0, this.f50324i0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f50321f0;
        if (colorStateList4 != null) {
            m44516r(this.f50316a0, colorStateList4, this.f50323h0, this.f50324i0, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.f50313U = drawable;
        m44518p();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.f50314V = drawable;
        m44518p();
    }

    public void setThumbIconResource(@DrawableRes int i) {
        setThumbIconDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.f50318c0 = colorStateList;
        m44518p();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f50319d0 = mode;
        m44518p();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f50317b0 = colorStateList;
        m44518p();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        m44518p();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.f50316a0 = drawable;
        m44517q();
    }

    public void setTrackDecorationResource(@DrawableRes int i) {
        setTrackDecorationDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.f50321f0 = colorStateList;
        m44517q();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f50322g0 = mode;
        m44517q();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.f50315W = drawable;
        m44517q();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f50320e0 = colorStateList;
        m44517q();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        m44517q();
    }

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialSwitch(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.materialswitch.MaterialSwitch.f50311j0
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            android.graphics.drawable.Drawable r7 = super.getThumbDrawable()
            r6.f50313U = r7
            android.content.res.ColorStateList r7 = super.getThumbTintList()
            r6.f50317b0 = r7
            r7 = 0
            super.setThumbTintList(r7)
            android.graphics.drawable.Drawable r1 = super.getTrackDrawable()
            r6.f50315W = r1
            android.content.res.ColorStateList r1 = super.getTrackTintList()
            r6.f50320e0 = r1
            super.setTrackTintList(r7)
            int[] r2 = com.google.android.material.R.styleable.MaterialSwitch
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            androidx.appcompat.widget.TintTypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_thumbIcon
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r6.f50314V = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_thumbIconTint
            android.content.res.ColorStateList r9 = r8.getColorStateList(r9)
            r6.f50318c0 = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_thumbIconTintMode
            r0 = -1
            int r9 = r8.getInt(r9, r0)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.ViewUtils.parseTintMode(r9, r1)
            r6.f50319d0 = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_trackDecoration
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r6.f50316a0 = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_trackDecorationTint
            android.content.res.ColorStateList r9 = r8.getColorStateList(r9)
            r6.f50321f0 = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_trackDecorationTintMode
            int r9 = r8.getInt(r9, r0)
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.ViewUtils.parseTintMode(r9, r1)
            r6.f50322g0 = r9
            r8.recycle()
            r6.setEnforceSwitchWidth(r7)
            r6.m44518p()
            r6.m44517q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.materialswitch.MaterialSwitch.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}