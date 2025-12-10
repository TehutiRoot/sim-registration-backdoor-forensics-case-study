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
import androidx.annotation.InterfaceC2037Px;
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
    public static final int[] f49328r = {16842911};

    /* renamed from: s */
    public static final int[] f49329s = {16842912};

    /* renamed from: t */
    public static final int f49330t = R.style.Widget_MaterialComponents_Button;

    /* renamed from: d */
    public final C20671jo0 f49331d;

    /* renamed from: e */
    public final LinkedHashSet f49332e;

    /* renamed from: f */
    public InterfaceC6839a f49333f;

    /* renamed from: g */
    public PorterDuff.Mode f49334g;

    /* renamed from: h */
    public ColorStateList f49335h;

    /* renamed from: i */
    public Drawable f49336i;

    /* renamed from: j */
    public String f49337j;

    /* renamed from: k */
    public int f49338k;

    /* renamed from: l */
    public int f49339l;

    /* renamed from: m */
    public int f49340m;

    /* renamed from: n */
    public int f49341n;

    /* renamed from: o */
    public boolean f49342o;

    /* renamed from: p */
    public boolean f49343p;

    /* renamed from: q */
    public int f49344q;

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
    public interface InterfaceC6839a {
        /* renamed from: a */
        void mo45523a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    /* loaded from: classes4.dex */
    public static class C6840b extends AbsSavedState {
        public static final Parcelable.Creator<C6840b> CREATOR = new C6841a();

        /* renamed from: b */
        public boolean f49345b;

        /* renamed from: com.google.android.material.button.MaterialButton$b$a */
        /* loaded from: classes4.dex */
        public class C6841a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C6840b createFromParcel(Parcel parcel) {
                return new C6840b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C6840b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C6840b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C6840b[] newArray(int i) {
                return new C6840b[i];
            }
        }

        public C6840b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        public final void m45551a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f49345b = z;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f49345b ? 1 : 0);
        }

        public C6840b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m45551a(parcel);
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
    public final boolean m45559a() {
        int i = this.f49344q;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public void addOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.f49332e.add(onCheckedChangeListener);
    }

    /* renamed from: b */
    public final boolean m45558b() {
        int i = this.f49344q;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m45557c() {
        int i = this.f49344q;
        if (i != 16 && i != 32) {
            return false;
        }
        return true;
    }

    public void clearOnCheckedChangeListeners() {
        this.f49332e.clear();
    }

    /* renamed from: d */
    public final boolean m45556d() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m45555e() {
        C20671jo0 c20671jo0 = this.f49331d;
        if (c20671jo0 != null && !c20671jo0.m29439o()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m45554f() {
        if (m45558b()) {
            TextViewCompat.setCompoundDrawablesRelative(this, this.f49336i, null, null, null);
        } else if (m45559a()) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, null, this.f49336i, null);
        } else if (m45557c()) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, this.f49336i, null, null);
        }
    }

    /* renamed from: g */
    public final void m45553g(boolean z) {
        Drawable drawable = this.f49336i;
        if (drawable != null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            this.f49336i = mutate;
            DrawableCompat.setTintList(mutate, this.f49335h);
            PorterDuff.Mode mode = this.f49334g;
            if (mode != null) {
                DrawableCompat.setTintMode(this.f49336i, mode);
            }
            int i = this.f49338k;
            if (i == 0) {
                i = this.f49336i.getIntrinsicWidth();
            }
            int i2 = this.f49338k;
            if (i2 == 0) {
                i2 = this.f49336i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f49336i;
            int i3 = this.f49339l;
            int i4 = this.f49340m;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f49336i.setVisible(true, z);
        }
        if (z) {
            m45554f();
            return;
        }
        Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this);
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((m45558b() && drawable3 != this.f49336i) || ((m45559a() && drawable5 != this.f49336i) || (m45557c() && drawable4 != this.f49336i))) {
            m45554f();
        }
    }

    @NonNull
    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f49337j)) {
            return this.f49337j;
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

    @InterfaceC2037Px
    public int getCornerRadius() {
        if (m45555e()) {
            return this.f49331d.m29452b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f49336i;
    }

    public int getIconGravity() {
        return this.f49344q;
    }

    @InterfaceC2037Px
    public int getIconPadding() {
        return this.f49341n;
    }

    @InterfaceC2037Px
    public int getIconSize() {
        return this.f49338k;
    }

    public ColorStateList getIconTint() {
        return this.f49335h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f49334g;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f49331d.m29451c();
    }

    @Dimension
    public int getInsetTop() {
        return this.f49331d.m29450d();
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (m45555e()) {
            return this.f49331d.m29446h();
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (m45555e()) {
            return this.f49331d.m29445i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m45555e()) {
            return this.f49331d.m29444j();
        }
        return null;
    }

    @InterfaceC2037Px
    public int getStrokeWidth() {
        if (m45555e()) {
            return this.f49331d.m29443k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (m45555e()) {
            return this.f49331d.m29442l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m45555e()) {
            return this.f49331d.m29441m();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public final void m45552h(int i, int i2) {
        if (this.f49336i != null && getLayout() != null) {
            if (!m45558b() && !m45559a()) {
                if (m45557c()) {
                    this.f49339l = 0;
                    if (this.f49344q == 16) {
                        this.f49340m = 0;
                        m45553g(false);
                        return;
                    }
                    int i3 = this.f49338k;
                    if (i3 == 0) {
                        i3 = this.f49336i.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.f49341n) - getPaddingBottom()) / 2);
                    if (this.f49340m != max) {
                        this.f49340m = max;
                        m45553g(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f49340m = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i4 = this.f49344q;
            boolean z = true;
            if (i4 != 1 && i4 != 3 && ((i4 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i4 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i5 = this.f49338k;
                if (i5 == 0) {
                    i5 = this.f49336i.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i - getTextLayoutWidth()) - ViewCompat.getPaddingEnd(this)) - i5) - this.f49341n) - ViewCompat.getPaddingStart(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                boolean m45556d = m45556d();
                if (this.f49344q != 4) {
                    z = false;
                }
                if (m45556d != z) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.f49339l != textLayoutWidth) {
                    this.f49339l = textLayoutWidth;
                    m45553g(false);
                    return;
                }
                return;
            }
            this.f49339l = 0;
            m45553g(false);
        }
    }

    public boolean isCheckable() {
        C20671jo0 c20671jo0 = this.f49331d;
        if (c20671jo0 != null && c20671jo0.m29438p()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f49342o;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.f49331d.m29437q();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m45555e()) {
            MaterialShapeUtils.setParentAbsoluteElevation(this, this.f49331d.m29448f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(onCreateDrawableState, f49328r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f49329s);
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
        C20671jo0 c20671jo0;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (c20671jo0 = this.f49331d) != null) {
            c20671jo0.m29456J(i4 - i2, i3 - i);
        }
        m45552h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof C6840b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C6840b c6840b = (C6840b) parcelable;
        super.onRestoreInstanceState(c6840b.getSuperState());
        setChecked(c6840b.f49345b);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        C6840b c6840b = new C6840b(super.onSaveInstanceState());
        c6840b.f49345b = this.f49342o;
        return c6840b;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m45552h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f49331d.m29437q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f49336i != null) {
            if (this.f49336i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.f49332e.remove(onCheckedChangeListener);
    }

    public void setA11yClassName(@Nullable String str) {
        this.f49337j = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        if (m45555e()) {
            this.f49331d.m29435s(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (m45555e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f49331d.m29434t();
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
        if (m45555e()) {
            this.f49331d.m29433u(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (isCheckable() && isEnabled() && this.f49342o != z) {
            this.f49342o = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m45538j(this, this.f49342o);
            }
            if (this.f49343p) {
                return;
            }
            this.f49343p = true;
            Iterator it = this.f49332e.iterator();
            while (it.hasNext()) {
                ((OnCheckedChangeListener) it.next()).onCheckedChanged(this, this.f49342o);
            }
            this.f49343p = false;
        }
    }

    public void setCornerRadius(@InterfaceC2037Px int i) {
        if (m45555e()) {
            this.f49331d.m29432v(i);
        }
    }

    public void setCornerRadiusResource(@DimenRes int i) {
        if (m45555e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (m45555e()) {
            this.f49331d.m29448f().setElevation(f);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f49336i != drawable) {
            this.f49336i = drawable;
            m45553g(true);
            m45552h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f49344q != i) {
            this.f49344q = i;
            m45552h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@InterfaceC2037Px int i) {
        if (this.f49341n != i) {
            this.f49341n = i;
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

    public void setIconSize(@InterfaceC2037Px int i) {
        if (i >= 0) {
            if (this.f49338k != i) {
                this.f49338k = i;
                m45553g(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f49335h != colorStateList) {
            this.f49335h = colorStateList;
            m45553g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f49334g != mode) {
            this.f49334g = mode;
            m45553g(false);
        }
    }

    public void setIconTintResource(@ColorRes int i) {
        setIconTint(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(@Dimension int i) {
        this.f49331d.m29431w(i);
    }

    public void setInsetTop(@Dimension int i) {
        this.f49331d.m29430x(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable InterfaceC6839a interfaceC6839a) {
        this.f49333f = interfaceC6839a;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC6839a interfaceC6839a = this.f49333f;
        if (interfaceC6839a != null) {
            interfaceC6839a.mo45523a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (m45555e()) {
            this.f49331d.m29429y(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        if (m45555e()) {
            setRippleColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (m45555e()) {
            this.f49331d.m29428z(shapeAppearanceModel);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m45555e()) {
            this.f49331d.m29465A(z);
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (m45555e()) {
            this.f49331d.m29464B(colorStateList);
        }
    }

    public void setStrokeColorResource(@ColorRes int i) {
        if (m45555e()) {
            setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(@InterfaceC2037Px int i) {
        if (m45555e()) {
            this.f49331d.m29463C(i);
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        if (m45555e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (m45555e()) {
            this.f49331d.m29462D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (m45555e()) {
            this.f49331d.m29461E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m45552h(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f49331d.m29460F(z);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f49342o);
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
            int r6 = com.google.android.material.button.MaterialButton.f49330t
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f49332e = r9
            r9 = 0
            r8.f49342o = r9
            r8.f49343p = r9
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
            r8.f49341n = r1
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.ViewUtils.parseTintMode(r1, r2)
            r8.f49334g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r1, r0, r2)
            r8.f49335h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = com.google.android.material.resources.MaterialResources.getDrawable(r1, r0, r2)
            r8.f49336i = r1
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconGravity
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f49344q = r1
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f49338k = r1
            com.google.android.material.shape.ShapeAppearanceModel$Builder r10 = com.google.android.material.shape.ShapeAppearanceModel.builder(r7, r10, r11, r6)
            com.google.android.material.shape.ShapeAppearanceModel r10 = r10.build()
            jo0 r11 = new jo0
            r11.<init>(r8, r10)
            r8.f49331d = r11
            r11.m29436r(r0)
            r0.recycle()
            int r10 = r8.f49341n
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f49336i
            if (r10 == 0) goto L84
            r9 = 1
        L84:
            r8.m45553g(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}