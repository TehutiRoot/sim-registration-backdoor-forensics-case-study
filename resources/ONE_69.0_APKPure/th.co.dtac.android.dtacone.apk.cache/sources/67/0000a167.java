package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ViewUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: A */
    public static final int[] f49438A;

    /* renamed from: B */
    public static final int[][] f49439B;

    /* renamed from: C */
    public static final int f49440C;
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;

    /* renamed from: y */
    public static final int f49441y = R.style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: z */
    public static final int[] f49442z = {R.attr.state_indeterminate};

    /* renamed from: e */
    public final LinkedHashSet f49443e;

    /* renamed from: f */
    public final LinkedHashSet f49444f;

    /* renamed from: g */
    public ColorStateList f49445g;

    /* renamed from: h */
    public boolean f49446h;

    /* renamed from: i */
    public boolean f49447i;

    /* renamed from: j */
    public boolean f49448j;

    /* renamed from: k */
    public CharSequence f49449k;

    /* renamed from: l */
    public Drawable f49450l;

    /* renamed from: m */
    public Drawable f49451m;

    /* renamed from: n */
    public boolean f49452n;

    /* renamed from: o */
    public ColorStateList f49453o;

    /* renamed from: p */
    public ColorStateList f49454p;

    /* renamed from: q */
    public PorterDuff.Mode f49455q;

    /* renamed from: r */
    public int f49456r;

    /* renamed from: s */
    public int[] f49457s;

    /* renamed from: t */
    public boolean f49458t;

    /* renamed from: u */
    public CharSequence f49459u;

    /* renamed from: v */
    public CompoundButton.OnCheckedChangeListener f49460v;

    /* renamed from: w */
    public final AnimatedVectorDrawableCompat f49461w;

    /* renamed from: x */
    public final Animatable2Compat.AnimationCallback f49462x;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface CheckedState {
    }

    /* loaded from: classes4.dex */
    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(@NonNull MaterialCheckBox materialCheckBox, int i);
    }

    /* loaded from: classes4.dex */
    public interface OnErrorChangedListener {
        void onErrorChanged(@NonNull MaterialCheckBox materialCheckBox, boolean z);
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$a */
    /* loaded from: classes4.dex */
    public class C6863a extends Animatable2Compat.AnimationCallback {
        public C6863a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f49453o;
            if (colorStateList != null) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            super.onAnimationStart(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f49453o;
            if (colorStateList != null) {
                DrawableCompat.setTint(drawable, colorStateList.getColorForState(materialCheckBox.f49457s, MaterialCheckBox.this.f49453o.getDefaultColor()));
            }
        }
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$b */
    /* loaded from: classes4.dex */
    public static class C6864b extends View.BaseSavedState {
        @NonNull
        public static final Parcelable.Creator<C6864b> CREATOR = new C6865a();

        /* renamed from: a */
        public int f49464a;

        /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$b$a */
        /* loaded from: classes4.dex */
        public class C6865a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C6864b createFromParcel(Parcel parcel) {
                return new C6864b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C6864b[] newArray(int i) {
                return new C6864b[i];
            }
        }

        public /* synthetic */ C6864b(Parcel parcel, C6863a c6863a) {
            this(parcel);
        }

        /* renamed from: a */
        public final String m45412a() {
            int i = this.f49464a;
            if (i != 1) {
                if (i != 2) {
                    return "unchecked";
                }
                return "indeterminate";
            }
            return "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + m45412a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f49464a));
        }

        public C6864b(Parcelable parcelable) {
            super(parcelable);
        }

        public C6864b(Parcel parcel) {
            super(parcel);
            this.f49464a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i = R.attr.state_error;
        f49438A = new int[]{i};
        f49439B = new int[][]{new int[]{16842910, i}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
        f49440C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i = this.f49456r;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f49445g == null) {
            int[][] iArr = f49439B;
            int[] iArr2 = new int[iArr.length];
            int color = MaterialColors.getColor(this, R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, R.attr.colorError);
            int color3 = MaterialColors.getColor(this, R.attr.colorSurface);
            int color4 = MaterialColors.getColor(this, R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.layer(color3, color2, 1.0f);
            iArr2[1] = MaterialColors.layer(color3, color, 1.0f);
            iArr2[2] = MaterialColors.layer(color3, color4, 0.54f);
            iArr2[3] = MaterialColors.layer(color3, color4, 0.38f);
            iArr2[4] = MaterialColors.layer(color3, color4, 0.38f);
            this.f49445g = new ColorStateList(iArr, iArr2);
        }
        return this.f49445g;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f49453o;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public void addOnCheckedStateChangedListener(@NonNull OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.f49444f.add(onCheckedStateChangedListener);
    }

    public void addOnErrorChangedListener(@NonNull OnErrorChangedListener onErrorChangedListener) {
        this.f49443e.add(onErrorChangedListener);
    }

    /* renamed from: b */
    public final boolean m45418b(TintTypedArray tintTypedArray) {
        int resourceId = tintTypedArray.getResourceId(R.styleable.MaterialCheckBox_android_button, 0);
        int resourceId2 = tintTypedArray.getResourceId(R.styleable.MaterialCheckBox_buttonCompat, 0);
        if (resourceId != f49440C || resourceId2 != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void m45417c() {
        this.f49450l = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.f49450l, this.f49453o, CompoundButtonCompat.getButtonTintMode(this));
        this.f49451m = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.f49451m, this.f49454p, this.f49455q);
        m45415e();
        m45414f();
        super.setButtonDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.f49450l, this.f49451m));
        refreshDrawableState();
    }

    public void clearOnCheckedStateChangedListeners() {
        this.f49444f.clear();
    }

    public void clearOnErrorChangedListeners() {
        this.f49443e.clear();
    }

    /* renamed from: d */
    public final void m45416d() {
        if (Build.VERSION.SDK_INT >= 30 && this.f49459u == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    /* renamed from: e */
    public final void m45415e() {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat;
        if (!this.f49452n) {
            return;
        }
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f49461w;
        if (animatedVectorDrawableCompat2 != null) {
            animatedVectorDrawableCompat2.unregisterAnimationCallback(this.f49462x);
            this.f49461w.registerAnimationCallback(this.f49462x);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Drawable drawable = this.f49450l;
            if ((drawable instanceof AnimatedStateListDrawable) && (animatedVectorDrawableCompat = this.f49461w) != null) {
                ((AnimatedStateListDrawable) drawable).addTransition(R.id.checked, R.id.unchecked, animatedVectorDrawableCompat, false);
                ((AnimatedStateListDrawable) this.f49450l).addTransition(R.id.indeterminate, R.id.unchecked, this.f49461w, false);
            }
        }
    }

    /* renamed from: f */
    public final void m45414f() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f49450l;
        if (drawable != null && (colorStateList2 = this.f49453o) != null) {
            DrawableCompat.setTintList(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f49451m;
        if (drawable2 != null && (colorStateList = this.f49454p) != null) {
            DrawableCompat.setTintList(drawable2, colorStateList);
        }
    }

    /* renamed from: g */
    public final void m45413g() {
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.f49450l;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f49451m;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f49454p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f49455q;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.f49453o;
    }

    public int getCheckedState() {
        return this.f49456r;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.f49449k;
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.f49447i;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        if (this.f49456r == 1) {
            return true;
        }
        return false;
    }

    public boolean isErrorShown() {
        return this.f49448j;
    }

    public boolean isUseMaterialThemeColors() {
        return this.f49446h;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f49446h && this.f49453o == null && this.f49454p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f49442z);
        }
        if (isErrorShown()) {
            View.mergeDrawableStates(onCreateDrawableState, f49438A);
        }
        this.f49457s = DrawableUtils.getCheckedState(onCreateDrawableState);
        m45413g();
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        int i;
        if (this.f49447i && TextUtils.isEmpty(getText()) && (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this)) != null) {
            if (ViewUtils.isLayoutRtl(this)) {
                i = -1;
            } else {
                i = 1;
            }
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * i;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = buttonDrawable.getBounds();
                DrawableCompat.setHotspotBounds(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@Nullable AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && isErrorShown()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f49449k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof C6864b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C6864b c6864b = (C6864b) parcelable;
        super.onRestoreInstanceState(c6864b.getSuperState());
        setCheckedState(c6864b.f49464a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        C6864b c6864b = new C6864b(super.onSaveInstanceState());
        c6864b.f49464a = getCheckedState();
        return c6864b;
    }

    public void removeOnCheckedStateChangedListener(@NonNull OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.f49444f.remove(onCheckedStateChangedListener);
    }

    public void removeOnErrorChangedListener(@NonNull OnErrorChangedListener onErrorChangedListener) {
        this.f49443e.remove(onErrorChangedListener);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f49451m = drawable;
        m45417c();
    }

    public void setButtonIconDrawableResource(@DrawableRes int i) {
        setButtonIconDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f49454p == colorStateList) {
            return;
        }
        this.f49454p = colorStateList;
        m45417c();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f49455q == mode) {
            return;
        }
        this.f49455q = mode;
        m45417c();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.f49453o == colorStateList) {
            return;
        }
        this.f49453o = colorStateList;
        m45417c();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m45417c();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f49447i = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        boolean z;
        Object systemService;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f49456r != i) {
            this.f49456r = i;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            m45416d();
            if (this.f49458t) {
                return;
            }
            this.f49458t = true;
            LinkedHashSet linkedHashSet = this.f49444f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((OnCheckedStateChangedListener) it.next()).onCheckedStateChangedListener(this, this.f49456r);
                }
            }
            if (this.f49456r != 2 && (onCheckedChangeListener = this.f49460v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                systemService = getContext().getSystemService(AbstractC1777Z2.m65268a());
                AutofillManager m51996a = AbstractC5327b3.m51996a(systemService);
                if (m51996a != null) {
                    m51996a.notifyValueChanged(this);
                }
            }
            this.f49458t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        m45413g();
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.f49449k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z) {
        if (this.f49448j == z) {
            return;
        }
        this.f49448j = z;
        refreshDrawableState();
        Iterator it = this.f49443e.iterator();
        while (it.hasNext()) {
            ((OnErrorChangedListener) it.next()).onErrorChanged(this, this.f49448j);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f49460v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi(30)
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.f49459u = charSequence;
        if (charSequence == null) {
            m45416d();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f49446h = z;
        if (z) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f49450l = drawable;
        this.f49452n = false;
        m45417c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCheckBox(android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.f49441y
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f49443e = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f49444f = r9
            android.content.Context r9 = r8.getContext()
            int r0 = com.google.android.material.R.drawable.mtrl_checkbox_button_checked_unchecked
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r9 = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.create(r9, r0)
            r8.f49461w = r9
            com.google.android.material.checkbox.MaterialCheckBox$a r9 = new com.google.android.material.checkbox.MaterialCheckBox$a
            r9.<init>()
            r8.f49462x = r9
            android.content.Context r9 = r8.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(r8)
            r8.f49450l = r0
            android.content.res.ColorStateList r0 = r8.getSuperButtonTintList()
            r8.f49453o = r0
            r6 = 0
            r8.setSupportButtonTintList(r6)
            int[] r2 = com.google.android.material.R.styleable.MaterialCheckBox
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            androidx.appcompat.widget.TintTypedArray r10 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r11 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIcon
            android.graphics.drawable.Drawable r11 = r10.getDrawable(r11)
            r8.f49451m = r11
            android.graphics.drawable.Drawable r11 = r8.f49450l
            r0 = 1
            if (r11 == 0) goto L7c
            boolean r11 = com.google.android.material.internal.ThemeEnforcement.isMaterial3Theme(r9)
            if (r11 == 0) goto L7c
            boolean r11 = r8.m45418b(r10)
            if (r11 == 0) goto L7c
            super.setButtonDrawable(r6)
            int r11 = com.google.android.material.R.drawable.mtrl_checkbox_button
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r9, r11)
            r8.f49450l = r11
            r8.f49452n = r0
            android.graphics.drawable.Drawable r11 = r8.f49451m
            if (r11 != 0) goto L7c
            int r11 = com.google.android.material.R.drawable.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r9, r11)
            r8.f49451m = r11
        L7c:
            int r11 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIconTint
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r9, r10, r11)
            r8.f49454p = r9
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIconTintMode
            r11 = -1
            int r9 = r10.getInt(r9, r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.ViewUtils.parseTintMode(r9, r11)
            r8.f49455q = r9
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_useMaterialThemeColors
            boolean r9 = r10.getBoolean(r9, r7)
            r8.f49446h = r9
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_centerIfNoTextEnabled
            boolean r9 = r10.getBoolean(r9, r0)
            r8.f49447i = r9
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_errorShown
            boolean r9 = r10.getBoolean(r9, r7)
            r8.f49448j = r9
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_errorAccessibilityLabel
            java.lang.CharSequence r9 = r10.getText(r9)
            r8.f49449k = r9
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_checkedState
            boolean r9 = r10.hasValue(r9)
            if (r9 == 0) goto Lc4
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_checkedState
            int r9 = r10.getInt(r9, r7)
            r8.setCheckedState(r9)
        Lc4:
            r10.recycle()
            r8.m45417c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}