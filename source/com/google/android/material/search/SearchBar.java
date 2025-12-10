package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.bouncycastle.i18n.MessageBundle;

/* loaded from: classes4.dex */
public class SearchBar extends Toolbar {

    /* renamed from: m0 */
    public static final int f50503m0 = R.style.Widget_Material3_SearchBar;

    /* renamed from: U */
    public final TextView f50504U;

    /* renamed from: V */
    public final boolean f50505V;

    /* renamed from: W */
    public final boolean f50506W;

    /* renamed from: a0 */
    public final C7043a f50507a0;

    /* renamed from: b0 */
    public final Drawable f50508b0;

    /* renamed from: c0 */
    public final boolean f50509c0;

    /* renamed from: d0 */
    public final boolean f50510d0;

    /* renamed from: e0 */
    public View f50511e0;

    /* renamed from: f0 */
    public Integer f50512f0;

    /* renamed from: g0 */
    public Drawable f50513g0;

    /* renamed from: h0 */
    public int f50514h0;

    /* renamed from: i0 */
    public boolean f50515i0;

    /* renamed from: j0 */
    public MaterialShapeDrawable f50516j0;

    /* renamed from: k0 */
    public final AccessibilityManager f50517k0;

    /* renamed from: l0 */
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener f50518l0;

    /* loaded from: classes4.dex */
    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    /* renamed from: com.google.android.material.search.SearchBar$a */
    /* loaded from: classes4.dex */
    public class View$OnAttachStateChangeListenerC7037a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC7037a() {
            SearchBar.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(SearchBar.this.f50517k0, SearchBar.this.f50518l0);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(SearchBar.this.f50517k0, SearchBar.this.f50518l0);
        }
    }

    /* renamed from: com.google.android.material.search.SearchBar$b */
    /* loaded from: classes4.dex */
    public static class C7038b extends AbsSavedState {
        public static final Parcelable.Creator<C7038b> CREATOR = new C7039a();

        /* renamed from: b */
        public String f50521b;

        /* renamed from: com.google.android.material.search.SearchBar$b$a */
        /* loaded from: classes4.dex */
        public class C7039a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C7038b createFromParcel(Parcel parcel) {
                return new C7038b(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C7038b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7038b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C7038b[] newArray(int i) {
                return new C7038b[i];
            }
        }

        public C7038b(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f50521b);
        }

        public C7038b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f50521b = parcel.readString();
        }

        public C7038b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: A */
    public static /* synthetic */ void m44388A(SearchBar searchBar, boolean z) {
        searchBar.m44380I(z);
    }

    /* renamed from: B */
    public static /* synthetic */ void m44387B(SearchBar searchBar) {
        searchBar.m44379J();
    }

    /* renamed from: M */
    private Drawable m44376M(Drawable drawable) {
        int i;
        int color;
        if (this.f50509c0 && drawable != null) {
            Integer num = this.f50512f0;
            if (num != null) {
                color = num.intValue();
            } else {
                if (drawable == this.f50508b0) {
                    i = R.attr.colorOnSurfaceVariant;
                } else {
                    i = R.attr.colorOnSurface;
                }
                color = MaterialColors.getColor(this, i);
            }
            Drawable wrap = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTint(wrap, color);
            return wrap;
        }
        return drawable;
    }

    private void setNavigationIconDecorative(boolean z) {
        Drawable drawable;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null) {
            return;
        }
        navigationIconButton.setClickable(!z);
        navigationIconButton.setFocusable(!z);
        Drawable background = navigationIconButton.getBackground();
        if (background != null) {
            this.f50513g0 = background;
        }
        if (z) {
            drawable = null;
        } else {
            drawable = this.f50513g0;
        }
        navigationIconButton.setBackgroundDrawable(drawable);
    }

    /* renamed from: E */
    public final int m44384E(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    /* renamed from: F */
    public final void m44383F(ShapeAppearanceModel shapeAppearanceModel, float f, float f2, int i) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        this.f50516j0 = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.f50516j0.setElevation(f);
        if (f2 >= 0.0f) {
            this.f50516j0.setStroke(f2, i);
        }
        int color = MaterialColors.getColor(this, R.attr.colorSurface);
        int color2 = MaterialColors.getColor(this, R.attr.colorControlHighlight);
        this.f50516j0.setFillColor(ColorStateList.valueOf(color));
        ColorStateList valueOf = ColorStateList.valueOf(color2);
        MaterialShapeDrawable materialShapeDrawable2 = this.f50516j0;
        ViewCompat.setBackground(this, new RippleDrawable(valueOf, materialShapeDrawable2, materialShapeDrawable2));
    }

    /* renamed from: G */
    public final void m44382G() {
        Drawable navigationIcon;
        if (getNavigationIcon() == null) {
            navigationIcon = this.f50508b0;
        } else {
            navigationIcon = getNavigationIcon();
        }
        setNavigationIcon(navigationIcon);
        setNavigationIconDecorative(true);
    }

    /* renamed from: H */
    public final void m44381H(int i, String str, String str2) {
        if (i != -1) {
            TextViewCompat.setTextAppearance(this.f50504U, i);
        }
        setText(str);
        setHint(str2);
        if (getNavigationIcon() == null) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.f50504U.getLayoutParams(), getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    /* renamed from: I */
    public final /* synthetic */ void m44380I(boolean z) {
        setFocusableInTouchMode(z);
    }

    /* renamed from: J */
    public final /* synthetic */ void m44379J() {
        this.f50507a0.m44318J(this);
    }

    /* renamed from: K */
    public final void m44378K() {
        View view = this.f50511e0;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f50511e0.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        m44377L(this.f50511e0, measuredWidth2, measuredHeight2, i, measuredHeight2 + measuredHeight);
    }

    /* renamed from: L */
    public final void m44377L(View view, int i, int i2, int i3, int i4) {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            view.layout(getMeasuredWidth() - i3, i2, getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    /* renamed from: N */
    public final void m44375N(int i, int i2) {
        View view = this.f50511e0;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    /* renamed from: O */
    public final void m44374O() {
        if (this.f50506W && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_vertical);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = m44384E(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = m44384E(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = m44384E(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = m44384E(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    /* renamed from: P */
    public final void m44373P() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.f50515i0) {
                if (layoutParams.getScrollFlags() == 0) {
                    layoutParams.setScrollFlags(53);
                }
            } else if (layoutParams.getScrollFlags() == 53) {
                layoutParams.setScrollFlags(0);
            }
        }
    }

    /* renamed from: Q */
    public final void m44372Q() {
        AccessibilityManager accessibilityManager = this.f50517k0;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.f50517k0.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC7037a());
        }
    }

    /* renamed from: R */
    public final void m44371R(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", MessageBundle.TITLE_ENTRY) == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") == null) {
                return;
            }
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
        throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
    }

    public void addCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f50507a0.m44309h(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f50507a0.m44308i(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback onLoadAnimationCallback) {
        this.f50507a0.m44307j(onLoadAnimationCallback);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f50505V && this.f50511e0 == null && !(view instanceof ActionMenuView)) {
            this.f50511e0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    public void clearText() {
        this.f50504U.setText("");
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view) {
        return collapse(view, null);
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view) {
        return expand(view, null);
    }

    @Nullable
    public View getCenterView() {
        return this.f50511e0;
    }

    public float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.f50516j0;
        if (materialShapeDrawable != null) {
            return materialShapeDrawable.getElevation();
        }
        return ViewCompat.getElevation(this);
    }

    public float getCornerSize() {
        return this.f50516j0.getTopLeftCornerResolvedSize();
    }

    @Nullable
    public CharSequence getHint() {
        return this.f50504U.getHint();
    }

    public int getMenuResId() {
        return this.f50514h0;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.f50516j0.getStrokeColor().getDefaultColor();
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f50516j0.getStrokeWidth();
    }

    @Nullable
    public CharSequence getText() {
        return this.f50504U.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.f50504U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(@MenuRes int i) {
        super.inflateMenu(i);
        this.f50514h0 = i;
    }

    public boolean isCollapsing() {
        return this.f50507a0.m44293x();
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.f50515i0;
    }

    public boolean isExpanding() {
        return this.f50507a0.m44292y();
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.f50507a0.m44291z();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.f50516j0);
        m44374O();
        m44373P();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m44378K();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m44375N(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7038b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7038b c7038b = (C7038b) parcelable;
        super.onRestoreInstanceState(c7038b.getSuperState());
        setText(c7038b.f50521b);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        String charSequence;
        C7038b c7038b = new C7038b(super.onSaveInstanceState());
        CharSequence text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        c7038b.f50521b = charSequence;
        return c7038b;
    }

    public boolean removeCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f50507a0.m44324D(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f50507a0.m44323E(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.f50507a0.m44322F(onLoadAnimationCallback);
    }

    public void setCenterView(@Nullable View view) {
        View view2 = this.f50511e0;
        if (view2 != null) {
            removeView(view2);
            this.f50511e0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.f50515i0 = z;
        m44373P();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = this.f50516j0;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f50504U.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(m44376M(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        boolean z;
        if (this.f50510d0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        if (onClickListener == null) {
            z = true;
        } else {
            z = false;
        }
        setNavigationIconDecorative(z);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.f50507a0.m44321G(z);
    }

    public void setStrokeColor(@ColorInt int i) {
        if (getStrokeColor() != i) {
            this.f50516j0.setStrokeColor(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(@Dimension float f) {
        if (getStrokeWidth() != f) {
            this.f50516j0.setStrokeWidth(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.f50504U.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void startOnLoadAnimation() {
        post(new Runnable() { // from class: KE1
            {
                SearchBar.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchBar.m44387B(SearchBar.this);
            }
        });
    }

    public void stopOnLoadAnimation() {
        this.f50507a0.m44317K(this);
    }

    /* loaded from: classes4.dex */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: h */
        public boolean f50519h;

        public ScrollingViewBehavior() {
            this.f50519h = false;
        }

        /* renamed from: k */
        public final void m44370k(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT == 21) {
                appBarLayout.setOutlineProvider(null);
            } else {
                appBarLayout.setTargetElevation(0.0f);
            }
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            boolean onDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.f50519h && (view2 instanceof AppBarLayout)) {
                this.f50519h = true;
                m44370k((AppBarLayout) view2);
            }
            return onDependentViewChanged;
        }

        @Override // p000.AbstractC23080y70
        public boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }

        public ScrollingViewBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f50519h = false;
        }
    }

    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view, @Nullable AppBarLayout appBarLayout) {
        return collapse(view, appBarLayout, false);
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view, @Nullable AppBarLayout appBarLayout) {
        return expand(view, appBarLayout, false);
    }

    public void setHint(@StringRes int i) {
        this.f50504U.setHint(i);
    }

    public void setText(@StringRes int i) {
        this.f50504U.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchBar(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r6 = com.google.android.material.search.SearchBar.f50503m0
            android.content.Context r10 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r10, r11, r12, r6)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f50514h0 = r10
            LE1 r0 = new LE1
            r0.<init>()
            r9.f50518l0 = r0
            android.content.Context r7 = r9.getContext()
            r9.m44371R(r11)
            int r0 = com.google.android.material.R.drawable.ic_search_black_24
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r7, r0)
            r9.f50508b0 = r0
            com.google.android.material.search.a r0 = new com.google.android.material.search.a
            r0.<init>()
            r9.f50507a0 = r0
            int[] r2 = com.google.android.material.R.styleable.SearchBar
            r8 = 0
            int[] r5 = new int[r8]
            r0 = r7
            r1 = r11
            r3 = r12
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r11 = com.google.android.material.shape.ShapeAppearanceModel.builder(r7, r11, r12, r6)
            com.google.android.material.shape.ShapeAppearanceModel r11 = r11.build()
            int r12 = com.google.android.material.R.styleable.SearchBar_elevation
            r1 = 0
            float r12 = r0.getDimension(r12, r1)
            int r1 = com.google.android.material.R.styleable.SearchBar_defaultMarginsEnabled
            r2 = 1
            boolean r1 = r0.getBoolean(r1, r2)
            r9.f50506W = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_defaultScrollFlagsEnabled
            boolean r1 = r0.getBoolean(r1, r2)
            r9.f50515i0 = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_hideNavigationIcon
            boolean r1 = r0.getBoolean(r1, r8)
            int r3 = com.google.android.material.R.styleable.SearchBar_forceDefaultNavigationOnClickListener
            boolean r3 = r0.getBoolean(r3, r8)
            r9.f50510d0 = r3
            int r3 = com.google.android.material.R.styleable.SearchBar_tintNavigationIcon
            boolean r3 = r0.getBoolean(r3, r2)
            r9.f50509c0 = r3
            int r3 = com.google.android.material.R.styleable.SearchBar_navigationIconTint
            boolean r3 = r0.hasValue(r3)
            if (r3 == 0) goto L80
            int r3 = com.google.android.material.R.styleable.SearchBar_navigationIconTint
            int r3 = r0.getColor(r3, r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.f50512f0 = r3
        L80:
            int r3 = com.google.android.material.R.styleable.SearchBar_android_textAppearance
            int r10 = r0.getResourceId(r3, r10)
            int r3 = com.google.android.material.R.styleable.SearchBar_android_text
            java.lang.String r3 = r0.getString(r3)
            int r4 = com.google.android.material.R.styleable.SearchBar_android_hint
            java.lang.String r4 = r0.getString(r4)
            int r5 = com.google.android.material.R.styleable.SearchBar_strokeWidth
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r0.getDimension(r5, r6)
            int r6 = com.google.android.material.R.styleable.SearchBar_strokeColor
            int r6 = r0.getColor(r6, r8)
            r0.recycle()
            if (r1 != 0) goto La8
            r9.m44382G()
        La8:
            r9.setClickable(r2)
            r9.setFocusable(r2)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r7)
            int r1 = com.google.android.material.R.layout.mtrl_search_bar
            r0.inflate(r1, r9)
            r9.f50505V = r2
            int r0 = com.google.android.material.R.id.search_bar_text_view
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.f50504U = r0
            androidx.core.view.ViewCompat.setElevation(r9, r12)
            r9.m44381H(r10, r3, r4)
            r9.m44383F(r11, r12, r5, r6)
            android.content.Context r10 = r9.getContext()
            java.lang.String r11 = "accessibility"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.view.accessibility.AccessibilityManager r10 = (android.view.accessibility.AccessibilityManager) r10
            r9.f50517k0 = r10
            r9.m44372Q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z) {
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        this.f50507a0.m44320H(this, view, appBarLayout, z);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z) {
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        this.f50507a0.m44319I(this, view, appBarLayout, z);
        return true;
    }
}
