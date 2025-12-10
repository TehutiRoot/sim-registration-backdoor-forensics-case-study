package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class RangeSlider extends AbstractC1544Va {

    /* renamed from: q0 */
    public float f50799q0;

    /* renamed from: r0 */
    public int f50800r0;

    /* loaded from: classes4.dex */
    public interface OnChangeListener extends BaseOnChangeListener<RangeSlider> {
        /* renamed from: onValueChange  reason: avoid collision after fix types in other method */
        void onValueChange2(@NonNull RangeSlider rangeSlider, float f, boolean z);

        @Override // com.google.android.material.slider.BaseOnChangeListener
        /* bridge */ /* synthetic */ void onValueChange(@NonNull RangeSlider rangeSlider, float f, boolean z);
    }

    /* loaded from: classes4.dex */
    public interface OnSliderTouchListener extends BaseOnSliderTouchListener<RangeSlider> {
        /* renamed from: onStartTrackingTouch  reason: avoid collision after fix types in other method */
        void onStartTrackingTouch2(@NonNull RangeSlider rangeSlider);

        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        /* bridge */ /* synthetic */ void onStartTrackingTouch(@NonNull RangeSlider rangeSlider);

        /* renamed from: onStopTrackingTouch  reason: avoid collision after fix types in other method */
        void onStopTrackingTouch2(@NonNull RangeSlider rangeSlider);

        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        /* bridge */ /* synthetic */ void onStopTrackingTouch(@NonNull RangeSlider rangeSlider);
    }

    /* renamed from: com.google.android.material.slider.RangeSlider$b */
    /* loaded from: classes4.dex */
    public static class C7075b extends AbsSavedState {
        public static final Parcelable.Creator<C7075b> CREATOR = new C7076a();

        /* renamed from: a */
        public float f50801a;

        /* renamed from: b */
        public int f50802b;

        /* renamed from: com.google.android.material.slider.RangeSlider$b$a */
        /* loaded from: classes4.dex */
        public class C7076a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C7075b createFromParcel(Parcel parcel) {
                return new C7075b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C7075b[] newArray(int i) {
                return new C7075b[i];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f50801a);
            parcel.writeInt(this.f50802b);
        }

        public C7075b(Parcelable parcelable) {
            super(parcelable);
        }

        public C7075b(Parcel parcel) {
            super(parcel.readParcelable(C7075b.class.getClassLoader()));
            this.f50801a = parcel.readFloat();
            this.f50802b = parcel.readInt();
        }
    }

    public RangeSlider(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: x0 */
    public static List m44051x0(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < typedArray.length(); i++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i, -1.0f)));
        }
        return arrayList;
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void addOnChangeListener(@NonNull BaseOnChangeListener baseOnChangeListener) {
        super.addOnChangeListener(baseOnChangeListener);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void addOnSliderTouchListener(@NonNull BaseOnSliderTouchListener baseOnSliderTouchListener) {
        super.addOnSliderTouchListener(baseOnSliderTouchListener);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void clearOnChangeListeners() {
        super.clearOnChangeListeners();
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void clearOnSliderTouchListeners() {
        super.clearOnSliderTouchListeners();
    }

    @Override // p000.AbstractC1544Va, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // p000.AbstractC1544Va, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p000.AbstractC1544Va, android.view.View
    @NonNull
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // p000.AbstractC1544Va
    @Dimension
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @Override // p000.AbstractC1544Va
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    @Override // p000.AbstractC1544Va
    public float getMinSeparation() {
        return this.f50799q0;
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @Override // p000.AbstractC1544Va
    @Dimension
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @Override // p000.AbstractC1544Va
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @Override // p000.AbstractC1544Va
    @Dimension
    public /* bridge */ /* synthetic */ int getTickActiveRadius() {
        return super.getTickActiveRadius();
    }

    @Override // p000.AbstractC1544Va
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @Override // p000.AbstractC1544Va
    @Dimension
    public /* bridge */ /* synthetic */ int getTickInactiveRadius() {
        return super.getTickInactiveRadius();
    }

    @Override // p000.AbstractC1544Va
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @Override // p000.AbstractC1544Va
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @Override // p000.AbstractC1544Va
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @Override // p000.AbstractC1544Va
    @Dimension
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // p000.AbstractC1544Va
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @Override // p000.AbstractC1544Va
    @Dimension
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // p000.AbstractC1544Va
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @Override // p000.AbstractC1544Va
    @Dimension
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // p000.AbstractC1544Va
    @NonNull
    public List<Float> getValues() {
        return super.getValues();
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ boolean hasLabelFormatter() {
        return super.hasLabelFormatter();
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ boolean isTickVisible() {
        return super.isTickVisible();
    }

    @Override // p000.AbstractC1544Va, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // p000.AbstractC1544Va, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p000.AbstractC1544Va, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        C7075b c7075b = (C7075b) parcelable;
        super.onRestoreInstanceState(c7075b.getSuperState());
        this.f50799q0 = c7075b.f50801a;
        int i = c7075b.f50802b;
        this.f50800r0 = i;
        setSeparationUnit(i);
    }

    @Override // p000.AbstractC1544Va, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        C7075b c7075b = new C7075b(super.onSaveInstanceState());
        c7075b.f50801a = this.f50799q0;
        c7075b.f50802b = this.f50800r0;
        return c7075b;
    }

    @Override // p000.AbstractC1544Va, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void removeOnChangeListener(@NonNull BaseOnChangeListener baseOnChangeListener) {
        super.removeOnChangeListener(baseOnChangeListener);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void removeOnSliderTouchListener(@NonNull BaseOnSliderTouchListener baseOnSliderTouchListener) {
        super.removeOnSliderTouchListener(baseOnSliderTouchListener);
    }

    @Override // p000.AbstractC1544Va
    public void setCustomThumbDrawable(@DrawableRes int i) {
        super.setCustomThumbDrawable(i);
    }

    @Override // p000.AbstractC1544Va
    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        super.setCustomThumbDrawablesForValues(iArr);
    }

    @Override // p000.AbstractC1544Va, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setHaloRadius(@IntRange(from = 0) @Dimension int i) {
        super.setHaloRadius(i);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@DimenRes int i) {
        super.setHaloRadiusResource(i);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setHaloTintList(@NonNull ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        super.setLabelBehavior(i);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        super.setLabelFormatter(labelFormatter);
    }

    public void setMinSeparation(@Dimension float f) {
        this.f50799q0 = f;
        this.f50800r0 = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.f50799q0 = f;
        this.f50800r0 = 1;
        setSeparationUnit(1);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setThumbElevationResource(@DimenRes int i) {
        super.setThumbElevationResource(i);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setThumbRadius(@IntRange(from = 0) @Dimension int i) {
        super.setThumbRadius(i);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@DimenRes int i) {
        super.setThumbRadiusResource(i);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@ColorRes int i) {
        super.setThumbStrokeColorResource(i);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(@DimenRes int i) {
        super.setThumbStrokeWidthResource(i);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setThumbTintList(@NonNull ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setTickActiveRadius(@IntRange(from = 0) @Dimension int i) {
        super.setTickActiveRadius(i);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(@IntRange(from = 0) @Dimension int i) {
        super.setTickInactiveRadius(i);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setTickTintList(@NonNull ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setTickVisible(boolean z) {
        super.setTickVisible(z);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setTrackHeight(@IntRange(from = 0) @Dimension int i) {
        super.setTrackHeight(i);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setTrackTintList(@NonNull ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    @Override // p000.AbstractC1544Va
    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        super.setValueTo(f);
    }

    @Override // p000.AbstractC1544Va
    public void setValues(@NonNull Float... fArr) {
        super.setValues(fArr);
    }

    public RangeSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    @Override // p000.AbstractC1544Va
    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // p000.AbstractC1544Va
    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        super.setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // p000.AbstractC1544Va
    public void setValues(@NonNull List<Float> list) {
        super.setValues(list);
    }

    public RangeSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.RangeSlider, i, AbstractC1544Va.f6671l0, new int[0]);
        if (obtainStyledAttributes.hasValue(R.styleable.RangeSlider_values)) {
            setValues(m44051x0(obtainStyledAttributes.getResources().obtainTypedArray(obtainStyledAttributes.getResourceId(R.styleable.RangeSlider_values, 0))));
        }
        this.f50799q0 = obtainStyledAttributes.getDimension(R.styleable.RangeSlider_minSeparation, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
