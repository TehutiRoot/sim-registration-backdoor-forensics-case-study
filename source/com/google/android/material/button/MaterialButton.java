package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;

    /* renamed from: r */
    public static final int[] f49316r = {16842911};

    /* renamed from: s */
    public static final int[] f49317s = {16842912};

    /* renamed from: t */
    public static final int f49318t = R.style.Widget_MaterialComponents_Button;

    /* renamed from: d */
    public final C19583do0 f49319d;

    /* renamed from: e */
    public final LinkedHashSet f49320e;

    /* renamed from: f */
    public InterfaceC6850a f49321f;

    /* renamed from: g */
    public PorterDuff.Mode f49322g;

    /* renamed from: h */
    public ColorStateList f49323h;

    /* renamed from: i */
    public Drawable f49324i;

    /* renamed from: j */
    public String f49325j;

    /* renamed from: k */
    public int f49326k;

    /* renamed from: l */
    public int f49327l;

    /* renamed from: m */
    public int f49328m;

    /* renamed from: n */
    public int f49329n;

    /* renamed from: o */
    public boolean f49330o;

    /* renamed from: p */
    public boolean f49331p;

    /* renamed from: q */
    public int f49332q;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface IconGravity {
    }

    /* loaded from: classes4.dex */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC6850a {
        /* renamed from: a */
        void mo45547a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    /* loaded from: classes4.dex */
    public static class C6851b extends AbsSavedState {
        public static final Parcelable.Creator<C6851b> CREATOR = new C6852a();

        /* renamed from: b */
        public boolean f49333b;

        /* renamed from: com.google.android.material.button.MaterialButton$b$a */
        /* loaded from: classes4.dex */
        public class C6852a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C6851b createFromParcel(Parcel parcel) {
                return new C6851b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C6851b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C6851b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C6851b[] newArray(int i) {
                return new C6851b[i];
            }
        }

        public C6851b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        public final void m45575a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f49333b = z;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f49333b ? 1 : 0);
        }

        public C6851b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m45575a(parcel);
        }
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    /* renamed from: a */
    public final boolean m45583a() {
        int i = this.f49332q;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public void addOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.f49320e.add(onCheckedChangeListener);
    }

    /* renamed from: b */
    public final boolean m45582b() {
        int i = this.f49332q;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m45581c() {
        int i = this.f49332q;
        if (i != 16 && i != 32) {
            return false;
        }
        return true;
    }

    public void clearOnCheckedChangeListeners() {
        this.f49320e.clear();
    }

    /* renamed from: d */
    public final boolean m45580d() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m45579e() {
        C19583do0 c19583do0 = this.f49319d;
        if (c19583do0 != null && !c19583do0.m31703o()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m45578f() {
        if (m45582b()) {
            TextViewCompat.setCompoundDrawablesRelative(this, this.f49324i, null, null, null);
        } else if (m45583a()) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, null, this.f49324i, null);
        } else if (m45581c()) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, this.f49324i, null, null);
        }
    }

    /* renamed from: g */
    public final void m45577g(boolean z) {
        Drawable drawable = this.f49324i;
        if (drawable != null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            this.f49324i = mutate;
            DrawableCompat.setTintList(mutate, this.f49323h);
            PorterDuff.Mode mode = this.f49322g;
            if (mode != null) {
                DrawableCompat.setTintMode(this.f49324i, mode);
            }
            int i = this.f49326k;
            if (i == 0) {
                i = this.f49324i.getIntrinsicWidth();
            }
            int i2 = this.f49326k;
            if (i2 == 0) {
                i2 = this.f49324i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f49324i;
            int i3 = this.f49327l;
            int i4 = this.f49328m;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f49324i.setVisible(true, z);
        }
        if (z) {
            m45578f();
            return;
        }
        Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this);
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((m45582b() && drawable3 != this.f49324i) || ((m45583a() && drawable5 != this.f49324i) || (m45581c() && drawable4 != this.f49324i))) {
            m45578f();
        }
    }

    @NonNull
    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f49325j)) {
            return this.f49325j;
        }
        if (isCheckable()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @InterfaceC2055Px
    public int getCornerRadius() {
        if (m45579e()) {
            return this.f49319d.m31716b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f49324i;
    }

    public int getIconGravity() {
        return this.f49332q;
    }

    @InterfaceC2055Px
    public int getIconPadding() {
        return this.f49329n;
    }

    @InterfaceC2055Px
    public int getIconSize() {
        return this.f49326k;
    }

    public ColorStateList getIconTint() {
        return this.f49323h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f49322g;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f49319d.m31715c();
    }

    @Dimension
    public int getInsetTop() {
        return this.f49319d.m31714d();
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (m45579e()) {
            return this.f49319d.m31710h();
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (m45579e()) {
            return this.f49319d.m31709i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m45579e()) {
            return this.f49319d.m31708j();
        }
        return null;
    }

    @InterfaceC2055Px
    public int getStrokeWidth() {
        if (m45579e()) {
            return this.f49319d.m31707k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (m45579e()) {
            return this.f49319d.m31706l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m45579e()) {
            return this.f49319d.m31705m();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public final void m45576h(int i, int i2) {
        if (this.f49324i != null && getLayout() != null) {
            if (!m45582b() && !m45583a()) {
                if (m45581c()) {
                    this.f49327l = 0;
                    if (this.f49332q == 16) {
                        this.f49328m = 0;
                        m45577g(false);
                        return;
                    }
                    int i3 = this.f49326k;
                    if (i3 == 0) {
                        i3 = this.f49324i.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.f49329n) - getPaddingBottom()) / 2);
                    if (this.f49328m != max) {
                        this.f49328m = max;
                        m45577g(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f49328m = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i4 = this.f49332q;
            boolean z = true;
            if (i4 != 1 && i4 != 3 && ((i4 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i4 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i5 = this.f49326k;
                if (i5 == 0) {
                    i5 = this.f49324i.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i - getTextLayoutWidth()) - ViewCompat.getPaddingEnd(this)) - i5) - this.f49329n) - ViewCompat.getPaddingStart(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                boolean m45580d = m45580d();
                if (this.f49332q != 4) {
                    z = false;
                }
                if (m45580d != z) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.f49327l != textLayoutWidth) {
                    this.f49327l = textLayoutWidth;
                    m45577g(false);
                    return;
                }
                return;
            }
            this.f49327l = 0;
            m45577g(false);
        }
    }

    public boolean isCheckable() {
        C19583do0 c19583do0 = this.f49319d;
        if (c19583do0 != null && c19583do0.m31702p()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f49330o;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.f49319d.m31701q();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m45579e()) {
            MaterialShapeUtils.setParentAbsoluteElevation(this, this.f49319d.m31712f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(onCreateDrawableState, f49316r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f49317s);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C19583do0 c19583do0;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (c19583do0 = this.f49319d) != null) {
            c19583do0.m31720J(i4 - i2, i3 - i);
        }
        m45576h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof C6851b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C6851b c6851b = (C6851b) parcelable;
        super.onRestoreInstanceState(c6851b.getSuperState());
        setChecked(c6851b.f49333b);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        C6851b c6851b = new C6851b(super.onSaveInstanceState());
        c6851b.f49333b = this.f49330o;
        return c6851b;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m45576h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f49319d.m31701q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f49324i != null) {
            if (this.f49324i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.f49320e.remove(onCheckedChangeListener);
    }

    public void setA11yClassName(@Nullable String str) {
        this.f49325j = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        if (m45579e()) {
            this.f49319d.m31699s(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (m45579e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f49319d.m31698t();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m45579e()) {
            this.f49319d.m31697u(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (isCheckable() && isEnabled() && this.f49330o != z) {
            this.f49330o = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m45562j(this, this.f49330o);
            }
            if (this.f49331p) {
                return;
            }
            this.f49331p = true;
            Iterator it = this.f49320e.iterator();
            while (it.hasNext()) {
                ((OnCheckedChangeListener) it.next()).onCheckedChanged(this, this.f49330o);
            }
            this.f49331p = false;
        }
    }

    public void setCornerRadius(@InterfaceC2055Px int i) {
        if (m45579e()) {
            this.f49319d.m31696v(i);
        }
    }

    public void setCornerRadiusResource(@DimenRes int i) {
        if (m45579e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (m45579e()) {
            this.f49319d.m31712f().setElevation(f);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f49324i != drawable) {
            this.f49324i = drawable;
            m45577g(true);
            m45576h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f49332q != i) {
            this.f49332q = i;
            m45576h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@InterfaceC2055Px int i) {
        if (this.f49329n != i) {
            this.f49329n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@DrawableRes int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(@InterfaceC2055Px int i) {
        if (i >= 0) {
            if (this.f49326k != i) {
                this.f49326k = i;
                m45577g(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f49323h != colorStateList) {
            this.f49323h = colorStateList;
            m45577g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f49322g != mode) {
            this.f49322g = mode;
            m45577g(false);
        }
    }

    public void setIconTintResource(@ColorRes int i) {
        setIconTint(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(@Dimension int i) {
        this.f49319d.m31695w(i);
    }

    public void setInsetTop(@Dimension int i) {
        this.f49319d.m31694x(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable InterfaceC6850a interfaceC6850a) {
        this.f49321f = interfaceC6850a;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC6850a interfaceC6850a = this.f49321f;
        if (interfaceC6850a != null) {
            interfaceC6850a.mo45547a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (m45579e()) {
            this.f49319d.m31693y(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        if (m45579e()) {
            setRippleColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (m45579e()) {
            this.f49319d.m31692z(shapeAppearanceModel);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m45579e()) {
            this.f49319d.m31729A(z);
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (m45579e()) {
            this.f49319d.m31728B(colorStateList);
        }
    }

    public void setStrokeColorResource(@ColorRes int i) {
        if (m45579e()) {
            setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(@InterfaceC2055Px int i) {
        if (m45579e()) {
            this.f49319d.m31727C(i);
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        if (m45579e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (m45579e()) {
            this.f49319d.m31726D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (m45579e()) {
            this.f49319d.m31725E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m45576h(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f49319d.m31724F(z);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f49330o);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.f49318t
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f49320e = r9
            r9 = 0
            r8.f49330o = r9
            r8.f49331p = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f49329n = r1
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.ViewUtils.parseTintMode(r1, r2)
            r8.f49322g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r1, r0, r2)
            r8.f49323h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = com.google.android.material.resources.MaterialResources.getDrawable(r1, r0, r2)
            r8.f49324i = r1
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconGravity
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f49332q = r1
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f49326k = r1
            com.google.android.material.shape.ShapeAppearanceModel$Builder r10 = com.google.android.material.shape.ShapeAppearanceModel.builder(r7, r10, r11, r6)
            com.google.android.material.shape.ShapeAppearanceModel r10 = r10.build()
            do0 r11 = new do0
            r11.<init>(r8, r10)
            r8.f49319d = r11
            r11.m31700r(r0)
            r0.recycle()
            int r10 = r8.f49329n
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f49324i
            if (r10 == 0) goto L84
            r9 = 1
        L84:
            r8.m45577g(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
