package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public abstract class NavigationBarItemView extends FrameLayout implements MenuView.ItemView {

    /* renamed from: E */
    public static final int[] f50313E = {16842912};

    /* renamed from: F */
    public static final C7011d f50314F = new C7011d(null);

    /* renamed from: G */
    public static final C7011d f50315G = new C7012e(null);

    /* renamed from: A */
    public int f50316A;

    /* renamed from: B */
    public boolean f50317B;

    /* renamed from: C */
    public int f50318C;

    /* renamed from: D */
    public BadgeDrawable f50319D;

    /* renamed from: a */
    public boolean f50320a;

    /* renamed from: b */
    public ColorStateList f50321b;

    /* renamed from: c */
    public Drawable f50322c;

    /* renamed from: d */
    public int f50323d;

    /* renamed from: e */
    public int f50324e;

    /* renamed from: f */
    public float f50325f;

    /* renamed from: g */
    public float f50326g;

    /* renamed from: h */
    public float f50327h;

    /* renamed from: i */
    public int f50328i;

    /* renamed from: j */
    public boolean f50329j;

    /* renamed from: k */
    public final FrameLayout f50330k;

    /* renamed from: l */
    public final View f50331l;

    /* renamed from: m */
    public final ImageView f50332m;

    /* renamed from: n */
    public final ViewGroup f50333n;

    /* renamed from: o */
    public final TextView f50334o;

    /* renamed from: p */
    public final TextView f50335p;

    /* renamed from: q */
    public int f50336q;

    /* renamed from: r */
    public MenuItemImpl f50337r;

    /* renamed from: s */
    public ColorStateList f50338s;

    /* renamed from: t */
    public Drawable f50339t;

    /* renamed from: u */
    public Drawable f50340u;

    /* renamed from: v */
    public ValueAnimator f50341v;

    /* renamed from: w */
    public C7011d f50342w;

    /* renamed from: x */
    public float f50343x;

    /* renamed from: y */
    public boolean f50344y;

    /* renamed from: z */
    public int f50345z;

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$a */
    /* loaded from: classes4.dex */
    public class View$OnLayoutChangeListenerC7008a implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC7008a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (NavigationBarItemView.this.f50332m.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.m44501u(navigationBarItemView.f50332m);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$b */
    /* loaded from: classes4.dex */
    public class RunnableC7009b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f50347a;

        public RunnableC7009b(int i) {
            this.f50347a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            NavigationBarItemView.this.m44500v(this.f50347a);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$c */
    /* loaded from: classes4.dex */
    public class C7010c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f50349a;

        public C7010c(float f) {
            this.f50349a = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            NavigationBarItemView.this.m44507o(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f50349a);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$d */
    /* loaded from: classes4.dex */
    public static class C7011d {
        public C7011d() {
        }

        /* renamed from: a */
        public float m44497a(float f, float f2) {
            float f3;
            float f4;
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i == 0) {
                f3 = 0.8f;
            } else {
                f3 = 0.0f;
            }
            if (i == 0) {
                f4 = 1.0f;
            } else {
                f4 = 0.2f;
            }
            return AnimationUtils.lerp(0.0f, 1.0f, f3, f4, f);
        }

        /* renamed from: b */
        public float m44496b(float f, float f2) {
            return AnimationUtils.lerp(0.4f, 1.0f, f);
        }

        /* renamed from: c */
        public float mo44494c(float f, float f2) {
            return 1.0f;
        }

        /* renamed from: d */
        public void m44495d(float f, float f2, View view) {
            view.setScaleX(m44496b(f, f2));
            view.setScaleY(mo44494c(f, f2));
            view.setAlpha(m44497a(f, f2));
        }

        public /* synthetic */ C7011d(View$OnLayoutChangeListenerC7008a view$OnLayoutChangeListenerC7008a) {
            this();
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$e */
    /* loaded from: classes4.dex */
    public static class C7012e extends C7011d {
        public C7012e() {
            super(null);
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.C7011d
        /* renamed from: c */
        public float mo44494c(float f, float f2) {
            return m44496b(f, f2);
        }

        public /* synthetic */ C7012e(View$OnLayoutChangeListenerC7008a view$OnLayoutChangeListenerC7008a) {
            this();
        }
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.f50320a = false;
        this.f50336q = -1;
        this.f50342w = f50314F;
        this.f50343x = 0.0f;
        this.f50344y = false;
        this.f50345z = 0;
        this.f50316A = 0;
        this.f50317B = false;
        this.f50318C = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f50330k = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.f50331l = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.f50332m = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.f50333n = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.f50334o = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.f50335p = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f50323d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f50324e = viewGroup.getPaddingBottom();
        ViewCompat.setImportantForAccessibility(textView, 2);
        ViewCompat.setImportantForAccessibility(textView2, 2);
        setFocusable(true);
        m44517e(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC7008a());
        }
    }

    /* renamed from: g */
    public static Drawable m44515g(ColorStateList colorStateList) {
        return new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorStateList), null, null);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f50330k;
        if (frameLayout == null) {
            return this.f50332m;
        }
        return frameLayout;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        int i;
        BadgeDrawable badgeDrawable = this.f50319D;
        if (badgeDrawable != null) {
            i = badgeDrawable.getMinimumHeight() / 2;
        } else {
            i = 0;
        }
        return Math.max(i, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.f50332m.getMeasuredWidth() + i;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        BadgeDrawable badgeDrawable = this.f50319D;
        if (badgeDrawable == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = badgeDrawable.getMinimumWidth() - this.f50319D.getHorizontalOffset();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f50332m.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    /* renamed from: p */
    public static void m44506p(TextView textView, int i) {
        TextViewCompat.setTextAppearance(textView, i);
        int unscaledTextSize = MaterialResources.getUnscaledTextSize(textView.getContext(), i, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
    }

    /* renamed from: q */
    public static void m44505q(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: r */
    public static void m44504r(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: x */
    public static void m44498x(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f50330k;
        if (frameLayout != null && this.f50344y) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void m44517e(float f, float f2) {
        this.f50325f = f - f2;
        this.f50326g = (f2 * 1.0f) / f;
        this.f50327h = (f * 1.0f) / f2;
    }

    /* renamed from: f */
    public void m44516f() {
        m44508n();
        this.f50337r = null;
        this.f50343x = 0.0f;
        this.f50320a = false;
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f50331l;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.f50319D;
    }

    @DrawableRes
    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.f50337r;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f50336q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f50333n.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f50333n.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f50333n.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f50333n.getMeasuredWidth() + layoutParams.rightMargin);
    }

    /* renamed from: h */
    public final FrameLayout m44514h(View view) {
        ImageView imageView = this.f50332m;
        if (view != imageView || !BadgeUtils.USE_COMPAT_PARENT) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    /* renamed from: i */
    public final boolean m44513i() {
        if (this.f50319D != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i) {
        CharSequence title;
        int i2;
        this.f50337r = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        if (!TextUtils.isEmpty(menuItemImpl.getTooltipText())) {
            title = menuItemImpl.getTooltipText();
        } else {
            title = menuItemImpl.getTitle();
        }
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, title);
        }
        if (menuItemImpl.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        this.f50320a = true;
    }

    /* renamed from: j */
    public final boolean m44512j() {
        if (this.f50317B && this.f50328i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void m44511k(float f) {
        if (this.f50344y && this.f50320a && ViewCompat.isAttachedToWindow(this)) {
            ValueAnimator valueAnimator = this.f50341v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f50341v = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f50343x, f);
            this.f50341v = ofFloat;
            ofFloat.addUpdateListener(new C7010c(f));
            this.f50341v.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.f50341v.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationLong2, getResources().getInteger(R.integer.material_motion_duration_long_1)));
            this.f50341v.start();
            return;
        }
        m44507o(f, f);
    }

    /* renamed from: l */
    public final void m44510l() {
        MenuItemImpl menuItemImpl = this.f50337r;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    /* renamed from: m */
    public final void m44509m() {
        Drawable drawable = this.f50322c;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.f50321b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f50344y && getActiveIndicatorDrawable() != null && this.f50330k != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.f50321b), null, activeIndicatorDrawable);
                z = false;
            } else if (drawable == null) {
                drawable = m44515g(this.f50321b);
            }
        }
        FrameLayout frameLayout = this.f50330k;
        if (frameLayout != null) {
            ViewCompat.setBackground(frameLayout, rippleDrawable);
        }
        ViewCompat.setBackground(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    /* renamed from: n */
    public void m44508n() {
        m44502t(this.f50332m);
    }

    /* renamed from: o */
    public final void m44507o(float f, float f2) {
        View view = this.f50331l;
        if (view != null) {
            this.f50342w.m44495d(f, f2, view);
        }
        this.f50343x = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.f50337r;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f50337r.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f50313E);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f50319D;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f50337r.getTitle();
            if (!TextUtils.isEmpty(this.f50337r.getContentDescription())) {
                title = this.f50337r.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f50319D.getContentDescription()));
        }
        AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            wrap.setClickable(false);
            wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        wrap.setRoleDescription(getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new RunnableC7009b(i));
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    /* renamed from: s */
    public final void m44503s(View view) {
        if (m44513i() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.f50319D, view, m44514h(view));
        }
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.f50331l;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        m44509m();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        int i;
        this.f50344y = z;
        m44509m();
        View view = this.f50331l;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f50316A = i;
        m44500v(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@InterfaceC2055Px int i) {
        this.f50318C = i;
        m44500v(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f50317B = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f50345z = i;
        m44500v(getWidth());
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        if (this.f50319D == badgeDrawable) {
            return;
        }
        if (m44513i() && this.f50332m != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            m44502t(this.f50332m);
        }
        this.f50319D = badgeDrawable;
        ImageView imageView = this.f50332m;
        if (imageView != null) {
            m44503s(imageView);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
        float f;
        TextView textView = this.f50335p;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.f50335p;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.f50334o;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.f50334o;
        textView4.setPivotY(textView4.getBaseline());
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        m44511k(f);
        int i = this.f50328i;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m44504r(getIconOrContainer(), this.f50323d, 17);
                        this.f50335p.setVisibility(8);
                        this.f50334o.setVisibility(8);
                    }
                } else {
                    m44498x(this.f50333n, this.f50324e);
                    if (z) {
                        m44504r(getIconOrContainer(), (int) (this.f50323d + this.f50325f), 49);
                        m44505q(this.f50335p, 1.0f, 1.0f, 0);
                        TextView textView5 = this.f50334o;
                        float f2 = this.f50326g;
                        m44505q(textView5, f2, f2, 4);
                    } else {
                        m44504r(getIconOrContainer(), this.f50323d, 49);
                        TextView textView6 = this.f50335p;
                        float f3 = this.f50327h;
                        m44505q(textView6, f3, f3, 4);
                        m44505q(this.f50334o, 1.0f, 1.0f, 0);
                    }
                }
            } else {
                if (z) {
                    m44504r(getIconOrContainer(), this.f50323d, 49);
                    m44498x(this.f50333n, this.f50324e);
                    this.f50335p.setVisibility(0);
                } else {
                    m44504r(getIconOrContainer(), this.f50323d, 17);
                    m44498x(this.f50333n, 0);
                    this.f50335p.setVisibility(4);
                }
                this.f50334o.setVisibility(4);
            }
        } else if (this.f50329j) {
            if (z) {
                m44504r(getIconOrContainer(), this.f50323d, 49);
                m44498x(this.f50333n, this.f50324e);
                this.f50335p.setVisibility(0);
            } else {
                m44504r(getIconOrContainer(), this.f50323d, 17);
                m44498x(this.f50333n, 0);
                this.f50335p.setVisibility(4);
            }
            this.f50334o.setVisibility(4);
        } else {
            m44498x(this.f50333n, this.f50324e);
            if (z) {
                m44504r(getIconOrContainer(), (int) (this.f50323d + this.f50325f), 49);
                m44505q(this.f50335p, 1.0f, 1.0f, 0);
                TextView textView7 = this.f50334o;
                float f4 = this.f50326g;
                m44505q(textView7, f4, f4, 4);
            } else {
                m44504r(getIconOrContainer(), this.f50323d, 49);
                TextView textView8 = this.f50335p;
                float f5 = this.f50327h;
                m44505q(textView8, f5, f5, 4);
                m44505q(this.f50334o, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f50334o.setEnabled(z);
        this.f50335p.setEnabled(z);
        this.f50332m.setEnabled(z);
        if (z) {
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        } else {
            ViewCompat.setPointerIcon(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.f50339t) {
            return;
        }
        this.f50339t = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.wrap(drawable).mutate();
            this.f50340u = drawable;
            ColorStateList colorStateList = this.f50338s;
            if (colorStateList != null) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
        }
        this.f50332m.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f50332m.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f50332m.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.f50338s = colorStateList;
        if (this.f50337r != null && (drawable = this.f50340u) != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
            this.f50340u.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f50324e != i) {
            this.f50324e = i;
            m44510l();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f50323d != i) {
            this.f50323d = i;
            m44510l();
        }
    }

    public void setItemPosition(int i) {
        this.f50336q = i;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f50321b = colorStateList;
        m44509m();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f50328i != i) {
            this.f50328i = i;
            m44499w();
            m44500v(getWidth());
            m44510l();
        }
    }

    public void setShifting(boolean z) {
        if (this.f50329j != z) {
            this.f50329j = z;
            m44510l();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(@StyleRes int i) {
        m44506p(this.f50335p, i);
        m44517e(this.f50334o.getTextSize(), this.f50335p.getTextSize());
        TextView textView = this.f50335p;
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(@StyleRes int i) {
        m44506p(this.f50334o, i);
        m44517e(this.f50334o.getTextSize(), this.f50335p.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f50334o.setTextColor(colorStateList);
            this.f50335p.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
        this.f50334o.setText(charSequence);
        this.f50335p.setText(charSequence);
        MenuItemImpl menuItemImpl = this.f50337r;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.f50337r;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.f50337r.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, charSequence);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    /* renamed from: t */
    public final void m44502t(View view) {
        if (!m44513i()) {
            return;
        }
        if (view != null) {
            setClipChildren(true);
            setClipToPadding(true);
            BadgeUtils.detachBadgeDrawable(this.f50319D, view);
        }
        this.f50319D = null;
    }

    /* renamed from: u */
    public final void m44501u(View view) {
        if (!m44513i()) {
            return;
        }
        BadgeUtils.setBadgeDrawableBounds(this.f50319D, view, m44514h(view));
    }

    /* renamed from: v */
    public final void m44500v(int i) {
        int i2;
        if (this.f50331l == null) {
            return;
        }
        int min = Math.min(this.f50345z, i - (this.f50318C * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f50331l.getLayoutParams();
        if (m44512j()) {
            i2 = min;
        } else {
            i2 = this.f50316A;
        }
        layoutParams.height = i2;
        layoutParams.width = min;
        this.f50331l.setLayoutParams(layoutParams);
    }

    /* renamed from: w */
    public final void m44499w() {
        if (m44512j()) {
            this.f50342w = f50315G;
        } else {
            this.f50342w = f50314F;
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f50322c = drawable;
        m44509m();
    }
}
