package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import java.util.List;

/* loaded from: classes4.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: K */
    public static final int f49905K = R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: L */
    public static final Property f49906L = new C6941f(Float.class, "width");

    /* renamed from: M */
    public static final Property f49907M = new C6942g(Float.class, "height");

    /* renamed from: N */
    public static final Property f49908N = new C6943h(Float.class, "paddingStart");

    /* renamed from: O */
    public static final Property f49909O = new C6944i(Float.class, "paddingEnd");

    /* renamed from: A */
    public final int f49910A;

    /* renamed from: B */
    public int f49911B;

    /* renamed from: C */
    public int f49912C;

    /* renamed from: D */
    public final CoordinatorLayout.Behavior f49913D;

    /* renamed from: E */
    public boolean f49914E;

    /* renamed from: F */
    public boolean f49915F;

    /* renamed from: G */
    public boolean f49916G;

    /* renamed from: H */
    public int f49917H;

    /* renamed from: I */
    public int f49918I;

    /* renamed from: J */
    public final int f49919J;
    @NonNull
    protected ColorStateList originalTextCsl;

    /* renamed from: u */
    public int f49920u;

    /* renamed from: v */
    public final C0844M4 f49921v;

    /* renamed from: w */
    public final InterfaceC6968c f49922w;

    /* renamed from: x */
    public final InterfaceC6968c f49923x;

    /* renamed from: y */
    public final InterfaceC6968c f49924y;

    /* renamed from: z */
    public final InterfaceC6968c f49925z;

    /* loaded from: classes4.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        public Rect f49926a;

        /* renamed from: b */
        public OnChangedCallback f49927b;

        /* renamed from: c */
        public OnChangedCallback f49928c;

        /* renamed from: d */
        public boolean f49929d;

        /* renamed from: e */
        public boolean f49930e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f49929d = false;
            this.f49930e = true;
        }

        /* renamed from: a */
        public static boolean m44776a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean m44775b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f49929d && !this.f49930e) || layoutParams.getAnchorId() != view.getId()) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final boolean m44774c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m44775b(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f49926a == null) {
                this.f49926a = new Rect();
            }
            Rect rect = this.f49926a;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: d */
        public final boolean m44773d(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m44775b(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        public void extendOrShow(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            OnChangedCallback onChangedCallback;
            int i;
            boolean z = this.f49930e;
            if (z) {
                onChangedCallback = this.f49928c;
            } else {
                onChangedCallback = this.f49927b;
            }
            if (z) {
                i = 3;
            } else {
                i = 0;
            }
            extendedFloatingActionButton.m44778y(i, onChangedCallback);
        }

        public boolean isAutoHideEnabled() {
            return this.f49929d;
        }

        public boolean isAutoShrinkEnabled() {
            return this.f49930e;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public void setAutoHideEnabled(boolean z) {
            this.f49929d = z;
        }

        public void setAutoShrinkEnabled(boolean z) {
            this.f49930e = z;
        }

        public void shrinkOrHide(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            OnChangedCallback onChangedCallback;
            int i;
            boolean z = this.f49930e;
            if (z) {
                onChangedCallback = this.f49928c;
            } else {
                onChangedCallback = this.f49927b;
            }
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            extendedFloatingActionButton.m44778y(i, onChangedCallback);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (CoordinatorLayout) extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m44774c(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (m44776a(view)) {
                m44773d(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (view instanceof AppBarLayout) {
                    if (m44774c(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m44776a(view) && m44773d(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.f49929d = obtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f49930e = obtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class OnChangedCallback {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    /* loaded from: classes4.dex */
    public class C6936a implements InterfaceC6948m {
        public C6936a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        /* renamed from: a */
        public ViewGroup.LayoutParams mo44764a() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    /* loaded from: classes4.dex */
    public class C6937b implements InterfaceC6948m {
        public C6937b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        /* renamed from: a */
        public ViewGroup.LayoutParams mo44764a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f49912C;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f49911B;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f49911B + ExtendedFloatingActionButton.this.f49912C;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    /* loaded from: classes4.dex */
    public class C6938c implements InterfaceC6948m {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC6948m f49933a;

        public C6938c(InterfaceC6948m interfaceC6948m) {
            this.f49933a = interfaceC6948m;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        /* renamed from: a */
        public ViewGroup.LayoutParams mo44764a() {
            int i;
            if (ExtendedFloatingActionButton.this.f49918I != 0) {
                i = ExtendedFloatingActionButton.this.f49918I;
            } else {
                i = -2;
            }
            return new ViewGroup.LayoutParams(-1, i);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getHeight() {
            int i;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.this.f49918I == -1) {
                if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return this.f49933a.getHeight();
                }
                View view = (View) ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.height == -2) {
                    return this.f49933a.getHeight();
                }
                int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
                if ((ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) != null) {
                    i = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    i = 0;
                }
                return (view.getHeight() - i) - paddingTop;
            } else if (ExtendedFloatingActionButton.this.f49918I != 0 && ExtendedFloatingActionButton.this.f49918I != -2) {
                return ExtendedFloatingActionButton.this.f49918I;
            } else {
                return this.f49933a.getHeight();
            }
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f49912C;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f49911B;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getWidth() {
            int i;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f49933a.getWidth();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.width == -2) {
                return this.f49933a.getWidth();
            }
            int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
            if ((ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) != null) {
                i = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            } else {
                i = 0;
            }
            return (view.getWidth() - i) - paddingLeft;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    /* loaded from: classes4.dex */
    public class C6939d implements InterfaceC6948m {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC6948m f49935a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC6948m f49936b;

        public C6939d(InterfaceC6948m interfaceC6948m, InterfaceC6948m interfaceC6948m2) {
            this.f49935a = interfaceC6948m;
            this.f49936b = interfaceC6948m2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        /* renamed from: a */
        public ViewGroup.LayoutParams mo44764a() {
            int i;
            int i2 = -2;
            if (ExtendedFloatingActionButton.this.f49917H != 0) {
                i = ExtendedFloatingActionButton.this.f49917H;
            } else {
                i = -2;
            }
            if (ExtendedFloatingActionButton.this.f49918I != 0) {
                i2 = ExtendedFloatingActionButton.this.f49918I;
            }
            return new ViewGroup.LayoutParams(i, i2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getHeight() {
            if (ExtendedFloatingActionButton.this.f49918I == -1) {
                return this.f49935a.getHeight();
            }
            if (ExtendedFloatingActionButton.this.f49918I != 0 && ExtendedFloatingActionButton.this.f49918I != -2) {
                return ExtendedFloatingActionButton.this.f49918I;
            }
            return this.f49936b.getHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f49912C;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f49911B;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6948m
        public int getWidth() {
            if (ExtendedFloatingActionButton.this.f49917H == -1) {
                return this.f49935a.getWidth();
            }
            if (ExtendedFloatingActionButton.this.f49917H != 0 && ExtendedFloatingActionButton.this.f49917H != -2) {
                return ExtendedFloatingActionButton.this.f49917H;
            }
            return this.f49936b.getWidth();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    /* loaded from: classes4.dex */
    public class C6940e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f49938a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC6968c f49939b;

        /* renamed from: c */
        public final /* synthetic */ OnChangedCallback f49940c;

        public C6940e(InterfaceC6968c interfaceC6968c, OnChangedCallback onChangedCallback) {
            this.f49939b = interfaceC6968c;
            this.f49940c = onChangedCallback;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f49938a = true;
            this.f49939b.mo44669h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f49939b.onAnimationEnd();
            if (!this.f49938a) {
                this.f49939b.mo44671f(this.f49940c);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f49939b.onAnimationStart(animator);
            this.f49938a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    /* loaded from: classes4.dex */
    public class C6941f extends Property {
        public C6941f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    /* loaded from: classes4.dex */
    public class C6942g extends Property {
        public C6942g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    /* loaded from: classes4.dex */
    public class C6943h extends Property {
        public C6943h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(ViewCompat.getPaddingStart(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            ViewCompat.setPaddingRelative(view, f.intValue(), view.getPaddingTop(), ViewCompat.getPaddingEnd(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    /* loaded from: classes4.dex */
    public class C6944i extends Property {
        public C6944i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(ViewCompat.getPaddingEnd(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    /* loaded from: classes4.dex */
    public class C6945j extends AbstractC6952a {

        /* renamed from: g */
        public final InterfaceC6948m f49942g;

        /* renamed from: h */
        public final boolean f49943h;

        public C6945j(C0844M4 c0844m4, InterfaceC6948m interfaceC6948m, boolean z) {
            super(ExtendedFloatingActionButton.this, c0844m4);
            this.f49942g = interfaceC6948m;
            this.f49943h = z;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: b */
        public boolean mo44675b() {
            if (this.f49943h != ExtendedFloatingActionButton.this.f49914E && ExtendedFloatingActionButton.this.getIcon() != null && !TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText())) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: d */
        public int mo44673d() {
            if (this.f49943h) {
                return R.animator.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6952a, com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: e */
        public AnimatorSet mo44672e() {
            float f;
            MotionSpec m44747n = m44747n();
            if (m44747n.hasPropertyValues("width")) {
                PropertyValuesHolder[] propertyValues = m44747n.getPropertyValues("width");
                propertyValues[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f49942g.getWidth());
                m44747n.setPropertyValues("width", propertyValues);
            }
            if (m44747n.hasPropertyValues("height")) {
                PropertyValuesHolder[] propertyValues2 = m44747n.getPropertyValues("height");
                propertyValues2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f49942g.getHeight());
                m44747n.setPropertyValues("height", propertyValues2);
            }
            if (m44747n.hasPropertyValues("paddingStart")) {
                PropertyValuesHolder[] propertyValues3 = m44747n.getPropertyValues("paddingStart");
                propertyValues3[0].setFloatValues(ViewCompat.getPaddingStart(ExtendedFloatingActionButton.this), this.f49942g.getPaddingStart());
                m44747n.setPropertyValues("paddingStart", propertyValues3);
            }
            if (m44747n.hasPropertyValues("paddingEnd")) {
                PropertyValuesHolder[] propertyValues4 = m44747n.getPropertyValues("paddingEnd");
                propertyValues4[0].setFloatValues(ViewCompat.getPaddingEnd(ExtendedFloatingActionButton.this), this.f49942g.getPaddingEnd());
                m44747n.setPropertyValues("paddingEnd", propertyValues4);
            }
            if (m44747n.hasPropertyValues("labelOpacity")) {
                PropertyValuesHolder[] propertyValues5 = m44747n.getPropertyValues("labelOpacity");
                boolean z = this.f49943h;
                float f2 = 1.0f;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                if (!z) {
                    f2 = 0.0f;
                }
                propertyValues5[0].setFloatValues(f, f2);
                m44747n.setPropertyValues("labelOpacity", propertyValues5);
            }
            return super.m44748m(m44747n);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: f */
        public void mo44671f(OnChangedCallback onChangedCallback) {
            if (onChangedCallback == null) {
                return;
            }
            if (this.f49943h) {
                onChangedCallback.onExtended(ExtendedFloatingActionButton.this);
            } else {
                onChangedCallback.onShrunken(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: g */
        public void mo44670g() {
            ExtendedFloatingActionButton.this.f49914E = this.f49943h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.f49943h) {
                ExtendedFloatingActionButton.this.f49917H = layoutParams.width;
                ExtendedFloatingActionButton.this.f49918I = layoutParams.height;
            }
            layoutParams.width = this.f49942g.mo44764a().width;
            layoutParams.height = this.f49942g.mo44764a().height;
            ViewCompat.setPaddingRelative(ExtendedFloatingActionButton.this, this.f49942g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f49942g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6952a, com.google.android.material.floatingactionbutton.InterfaceC6968c
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.f49915F = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f49942g.mo44764a().width;
            layoutParams.height = this.f49942g.mo44764a().height;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6952a, com.google.android.material.floatingactionbutton.InterfaceC6968c
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f49914E = this.f49943h;
            ExtendedFloatingActionButton.this.f49915F = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    /* loaded from: classes4.dex */
    public class C6946k extends AbstractC6952a {

        /* renamed from: g */
        public boolean f49945g;

        public C6946k(C0844M4 c0844m4) {
            super(ExtendedFloatingActionButton.this, c0844m4);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: b */
        public boolean mo44675b() {
            return ExtendedFloatingActionButton.this.m44780w();
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: d */
        public int mo44673d() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: f */
        public void mo44671f(OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onHidden(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: g */
        public void mo44670g() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6952a, com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: h */
        public void mo44669h() {
            super.mo44669h();
            this.f49945g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6952a, com.google.android.material.floatingactionbutton.InterfaceC6968c
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.f49920u = 0;
            if (!this.f49945g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6952a, com.google.android.material.floatingactionbutton.InterfaceC6968c
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f49945g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f49920u = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    /* loaded from: classes4.dex */
    public class C6947l extends AbstractC6952a {
        public C6947l(C0844M4 c0844m4) {
            super(ExtendedFloatingActionButton.this, c0844m4);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: b */
        public boolean mo44675b() {
            return ExtendedFloatingActionButton.this.m44779x();
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: d */
        public int mo44673d() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: f */
        public void mo44671f(OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onShown(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
        /* renamed from: g */
        public void mo44670g() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6952a, com.google.android.material.floatingactionbutton.InterfaceC6968c
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.f49920u = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6952a, com.google.android.material.floatingactionbutton.InterfaceC6968c
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f49920u = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$m */
    /* loaded from: classes4.dex */
    public interface InterfaceC6948m {
        /* renamed from: a */
        ViewGroup.LayoutParams mo44764a();

        int getHeight();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public boolean m44780w() {
        if (getVisibility() == 0) {
            if (this.f49920u != 1) {
                return false;
            }
            return true;
        } else if (this.f49920u == 2) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public boolean m44779x() {
        if (getVisibility() != 0) {
            if (this.f49920u != 2) {
                return false;
            }
            return true;
        } else if (this.f49920u == 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: A */
    public final boolean m44795A() {
        if ((ViewCompat.isLaidOut(this) || (!m44779x() && this.f49916G)) && !isInEditMode()) {
            return true;
        }
        return false;
    }

    public void addOnExtendAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f49923x.mo44668i(animatorListener);
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f49925z.mo44668i(animatorListener);
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f49924y.mo44668i(animatorListener);
    }

    public void addOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f49922w.mo44668i(animatorListener);
    }

    public void extend() {
        m44778y(3, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f49913D;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        int i = this.f49910A;
        if (i < 0) {
            return (Math.min(ViewCompat.getPaddingStart(this), ViewCompat.getPaddingEnd(this)) * 2) + getIconSize();
        }
        return i;
    }

    @Nullable
    public MotionSpec getExtendMotionSpec() {
        return this.f49923x.mo44676a();
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.f49925z.mo44676a();
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.f49924y.mo44676a();
    }

    @Nullable
    public MotionSpec getShrinkMotionSpec() {
        return this.f49922w.mo44676a();
    }

    public void hide() {
        m44778y(1, null);
    }

    public final boolean isExtended() {
        return this.f49914E;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f49914E && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f49914E = false;
            this.f49922w.mo44670g();
        }
    }

    public void removeOnExtendAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f49923x.mo44674c(animatorListener);
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f49925z.mo44674c(animatorListener);
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f49924y.mo44674c(animatorListener);
    }

    public void removeOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.f49922w.mo44674c(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f49916G = z;
    }

    public void setExtendMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f49923x.mo44667j(motionSpec);
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i) {
        setExtendMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void setExtended(boolean z) {
        InterfaceC6968c interfaceC6968c;
        if (this.f49914E == z) {
            return;
        }
        if (z) {
            interfaceC6968c = this.f49923x;
        } else {
            interfaceC6968c = this.f49922w;
        }
        if (interfaceC6968c.mo44675b()) {
            return;
        }
        interfaceC6968c.mo44670g();
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f49925z.mo44667j(motionSpec);
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f49914E && !this.f49915F) {
            this.f49911B = ViewCompat.getPaddingStart(this);
            this.f49912C = ViewCompat.getPaddingEnd(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f49914E && !this.f49915F) {
            this.f49911B = i;
            this.f49912C = i3;
        }
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f49924y.mo44667j(motionSpec);
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void setShrinkMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f49922w.mo44667j(motionSpec);
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i) {
        setShrinkMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        m44777z();
    }

    public void show() {
        m44778y(0, null);
    }

    public void shrink() {
        m44778y(2, null);
    }

    public void silentlyUpdateTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    /* renamed from: v */
    public final InterfaceC6948m m44781v(int i) {
        C6937b c6937b = new C6937b();
        C6938c c6938c = new C6938c(c6937b);
        C6939d c6939d = new C6939d(c6938c, c6937b);
        if (i != 1) {
            if (i != 2) {
                return c6939d;
            }
            return c6938c;
        }
        return c6937b;
    }

    /* renamed from: y */
    public final void m44778y(int i, OnChangedCallback onChangedCallback) {
        InterfaceC6968c interfaceC6968c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        interfaceC6968c = this.f49923x;
                    } else {
                        throw new IllegalStateException("Unknown strategy type: " + i);
                    }
                } else {
                    interfaceC6968c = this.f49922w;
                }
            } else {
                interfaceC6968c = this.f49925z;
            }
        } else {
            interfaceC6968c = this.f49924y;
        }
        if (interfaceC6968c.mo44675b()) {
            return;
        }
        if (!m44795A()) {
            interfaceC6968c.mo44670g();
            interfaceC6968c.mo44671f(onChangedCallback);
            return;
        }
        if (i == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.f49917H = layoutParams.width;
                this.f49918I = layoutParams.height;
            } else {
                this.f49917H = getWidth();
                this.f49918I = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet mo44672e = interfaceC6968c.mo44672e();
        mo44672e.addListener(new C6940e(interfaceC6968c, onChangedCallback));
        for (Animator.AnimatorListener animatorListener : interfaceC6968c.mo44666k()) {
            mo44672e.addListener(animatorListener);
        }
        mo44672e.start();
    }

    /* renamed from: z */
    public final void m44777z() {
        this.originalTextCsl = getTextColors();
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public void extend(@NonNull OnChangedCallback onChangedCallback) {
        m44778y(3, onChangedCallback);
    }

    public void hide(@NonNull OnChangedCallback onChangedCallback) {
        m44778y(1, onChangedCallback);
    }

    public void show(@NonNull OnChangedCallback onChangedCallback) {
        m44778y(0, onChangedCallback);
    }

    public void shrink(@NonNull OnChangedCallback onChangedCallback) {
        m44778y(2, onChangedCallback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExtendedFloatingActionButton(@androidx.annotation.NonNull android.content.Context r17, @androidx.annotation.Nullable android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f49905K
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f49920u = r10
            M4 r1 = new M4
            r1.<init>()
            r0.f49921v = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l
            r11.<init>(r1)
            r0.f49924y = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r12.<init>(r1)
            r0.f49925z = r12
            r13 = 1
            r0.f49914E = r13
            r0.f49915F = r10
            r0.f49916G = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f49913D = r1
            int[] r3 = com.google.android.material.R.styleable.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_showMotionSpec
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r2)
            int r3 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_hideMotionSpec
            com.google.android.material.animation.MotionSpec r3 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r3)
            int r4 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_extendMotionSpec
            com.google.android.material.animation.MotionSpec r4 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r4)
            int r5 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec
            com.google.android.material.animation.MotionSpec r5 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r5)
            int r6 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_collapsedSize
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.f49910A = r6
            int r6 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_extendStrategy
            int r6 = r1.getInt(r6, r13)
            r0.f49919J = r6
            int r15 = androidx.core.view.ViewCompat.getPaddingStart(r16)
            r0.f49911B = r15
            int r15 = androidx.core.view.ViewCompat.getPaddingEnd(r16)
            r0.f49912C = r15
            M4 r15 = new M4
            r15.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$m r6 = r0.m44781v(r6)
            r10.<init>(r15, r6, r13)
            r0.f49923x = r10
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j r6 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r13.<init>()
            r7 = 0
            r6.<init>(r15, r13, r7)
            r0.f49922w = r6
            r11.mo44667j(r2)
            r12.mo44667j(r3)
            r10.mo44667j(r4)
            r6.mo44667j(r5)
            r1.recycle()
            com.google.android.material.shape.CornerSize r1 = com.google.android.material.shape.ShapeAppearanceModel.PILL
            r2 = r18
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = com.google.android.material.shape.ShapeAppearanceModel.builder(r14, r2, r8, r9, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r1.build()
            r0.setShapeAppearanceModel(r1)
            r16.m44777z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m44777z();
    }
}
