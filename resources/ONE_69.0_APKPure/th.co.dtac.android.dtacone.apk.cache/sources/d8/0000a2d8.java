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
    public static final int f50515m0 = R.style.Widget_Material3_SearchBar;

    /* renamed from: U */
    public final TextView f50516U;

    /* renamed from: V */
    public final boolean f50517V;

    /* renamed from: W */
    public final boolean f50518W;

    /* renamed from: a0 */
    public final C7032a f50519a0;

    /* renamed from: b0 */
    public final Drawable f50520b0;

    /* renamed from: c0 */
    public final boolean f50521c0;

    /* renamed from: d0 */
    public final boolean f50522d0;

    /* renamed from: e0 */
    public View f50523e0;

    /* renamed from: f0 */
    public Integer f50524f0;

    /* renamed from: g0 */
    public Drawable f50525g0;

    /* renamed from: h0 */
    public int f50526h0;

    /* renamed from: i0 */
    public boolean f50527i0;

    /* renamed from: j0 */
    public MaterialShapeDrawable f50528j0;

    /* renamed from: k0 */
    public final AccessibilityManager f50529k0;

    /* renamed from: l0 */
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener f50530l0;

    /* loaded from: classes4.dex */
    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    /* renamed from: com.google.android.material.search.SearchBar$a */
    /* loaded from: classes4.dex */
    public class View$OnAttachStateChangeListenerC7026a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC7026a() {
            SearchBar.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(SearchBar.this.f50529k0, SearchBar.this.f50530l0);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(SearchBar.this.f50529k0, SearchBar.this.f50530l0);
        }
    }

    /* renamed from: com.google.android.material.search.SearchBar$b */
    /* loaded from: classes4.dex */
    public static class C7027b extends AbsSavedState {
        public static final Parcelable.Creator<C7027b> CREATOR = new C7028a();

        /* renamed from: b */
        public String f50533b;

        /* renamed from: com.google.android.material.search.SearchBar$b$a */
        /* loaded from: classes4.dex */
        public class C7028a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C7027b createFromParcel(Parcel parcel) {
                return new C7027b(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C7027b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7027b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C7027b[] newArray(int i) {
                return new C7027b[i];
            }
        }

        public C7027b(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f50533b);
        }

        public C7027b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f50533b = parcel.readString();
        }

        public C7027b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: A */
    public static /* synthetic */ void m44375A(SearchBar searchBar, boolean z) {
        searchBar.m44367I(z);
    }

    /* renamed from: B */
    public static /* synthetic */ void m44374B(SearchBar searchBar) {
        searchBar.m44366J();
    }

    /* renamed from: M */
    private Drawable m44363M(Drawable drawable) {
        int i;
        int color;
        if (this.f50521c0 && drawable != null) {
            Integer num = this.f50524f0;
            if (num != null) {
                color = num.intValue();
            } else {
                if (drawable == this.f50520b0) {
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
            this.f50525g0 = background;
        }
        if (z) {
            drawable = null;
        } else {
            drawable = this.f50525g0;
        }
        navigationIconButton.setBackgroundDrawable(drawable);
    }

    /* renamed from: E */
    public final int m44371E(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    /* renamed from: F */
    public final void m44370F(ShapeAppearanceModel shapeAppearanceModel, float f, float f2, int i) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        this.f50528j0 = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.f50528j0.setElevation(f);
        if (f2 >= 0.0f) {
            this.f50528j0.setStroke(f2, i);
        }
        int color = MaterialColors.getColor(this, R.attr.colorSurface);
        int color2 = MaterialColors.getColor(this, R.attr.colorControlHighlight);
        this.f50528j0.setFillColor(ColorStateList.valueOf(color));
        ColorStateList valueOf = ColorStateList.valueOf(color2);
        MaterialShapeDrawable materialShapeDrawable2 = this.f50528j0;
        ViewCompat.setBackground(this, new RippleDrawable(valueOf, materialShapeDrawable2, materialShapeDrawable2));
    }

    /* renamed from: G */
    public final void m44369G() {
        Drawable navigationIcon;
        if (getNavigationIcon() == null) {
            navigationIcon = this.f50520b0;
        } else {
            navigationIcon = getNavigationIcon();
        }
        setNavigationIcon(navigationIcon);
        setNavigationIconDecorative(true);
    }

    /* renamed from: H */
    public final void m44368H(int i, String str, String str2) {
        if (i != -1) {
            TextViewCompat.setTextAppearance(this.f50516U, i);
        }
        setText(str);
        setHint(str2);
        if (getNavigationIcon() == null) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.f50516U.getLayoutParams(), getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    /* renamed from: I */
    public final /* synthetic */ void m44367I(boolean z) {
        setFocusableInTouchMode(z);
    }

    /* renamed from: J */
    public final /* synthetic */ void m44366J() {
        this.f50519a0.m44305J(this);
    }

    /* renamed from: K */
    public final void m44365K() {
        View view = this.f50523e0;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f50523e0.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        m44364L(this.f50523e0, measuredWidth2, measuredHeight2, i, measuredHeight2 + measuredHeight);
    }

    /* renamed from: L */
    public final void m44364L(View view, int i, int i2, int i3, int i4) {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            view.layout(getMeasuredWidth() - i3, i2, getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    /* renamed from: N */
    public final void m44362N(int i, int i2) {
        View view = this.f50523e0;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    /* renamed from: O */
    public final void m44361O() {
        if (this.f50518W && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_vertical);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = m44371E(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = m44371E(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = m44371E(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = m44371E(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    /* renamed from: P */
    public final void m44360P() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.f50527i0) {
                if (layoutParams.getScrollFlags() == 0) {
                    layoutParams.setScrollFlags(53);
                }
            } else if (layoutParams.getScrollFlags() == 53) {
                layoutParams.setScrollFlags(0);
            }
        }
    }

    /* renamed from: Q */
    public final void m44359Q() {
        AccessibilityManager accessibilityManager = this.f50529k0;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.f50529k0.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC7026a());
        }
    }

    /* renamed from: R */
    public final void m44358R(AttributeSet attributeSet) {
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
        this.f50519a0.m44296h(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f50519a0.m44295i(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback onLoadAnimationCallback) {
        this.f50519a0.m44294j(onLoadAnimationCallback);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f50517V && this.f50523e0 == null && !(view instanceof ActionMenuView)) {
            this.f50523e0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    public void clearText() {
        this.f50516U.setText("");
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
        return this.f50523e0;
    }

    public float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.f50528j0;
        if (materialShapeDrawable != null) {
            return materialShapeDrawable.getElevation();
        }
        return ViewCompat.getElevation(this);
    }

    public float getCornerSize() {
        return this.f50528j0.getTopLeftCornerResolvedSize();
    }

    @Nullable
    public CharSequence getHint() {
        return this.f50516U.getHint();
    }

    public int getMenuResId() {
        return this.f50526h0;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.f50528j0.getStrokeColor().getDefaultColor();
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f50528j0.getStrokeWidth();
    }

    @Nullable
    public CharSequence getText() {
        return this.f50516U.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.f50516U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(@MenuRes int i) {
        super.inflateMenu(i);
        this.f50526h0 = i;
    }

    public boolean isCollapsing() {
        return this.f50519a0.m44280x();
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.f50527i0;
    }

    public boolean isExpanding() {
        return this.f50519a0.m44279y();
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.f50519a0.m44278z();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.f50528j0);
        m44361O();
        m44360P();
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
        m44365K();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m44362N(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7027b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7027b c7027b = (C7027b) parcelable;
        super.onRestoreInstanceState(c7027b.getSuperState());
        setText(c7027b.f50533b);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        String charSequence;
        C7027b c7027b = new C7027b(super.onSaveInstanceState());
        CharSequence text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        c7027b.f50533b = charSequence;
        return c7027b;
    }

    public boolean removeCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f50519a0.m44311D(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f50519a0.m44310E(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.f50519a0.m44309F(onLoadAnimationCallback);
    }

    public void setCenterView(@Nullable View view) {
        View view2 = this.f50523e0;
        if (view2 != null) {
            removeView(view2);
            this.f50523e0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.f50527i0 = z;
        m44360P();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = this.f50528j0;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f50516U.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(m44363M(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        boolean z;
        if (this.f50522d0) {
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
        this.f50519a0.m44308G(z);
    }

    public void setStrokeColor(@ColorInt int i) {
        if (getStrokeColor() != i) {
            this.f50528j0.setStrokeColor(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(@Dimension float f) {
        if (getStrokeWidth() != f) {
            this.f50528j0.setStrokeWidth(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.f50516U.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void startOnLoadAnimation() {
        post(new Runnable() { // from class: HF1
            @Override // java.lang.Runnable
            public final void run() {
                SearchBar.m44374B(SearchBar.this);
            }
        });
    }

    public void stopOnLoadAnimation() {
        this.f50519a0.m44304K(this);
    }

    /* loaded from: classes4.dex */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: h */
        public boolean f50531h;

        public ScrollingViewBehavior() {
            this.f50531h = false;
        }

        /* renamed from: k */
        public final void m44357k(AppBarLayout appBarLayout) {
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
            if (!this.f50531h && (view2 instanceof AppBarLayout)) {
                this.f50531h = true;
                m44357k((AppBarLayout) view2);
            }
            return onDependentViewChanged;
        }

        @Override // p000.E70
        public boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }

        public ScrollingViewBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f50531h = false;
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
        this.f50516U.setHint(i);
    }

    public void setText(@StringRes int i) {
        this.f50516U.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchBar(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r6 = com.google.android.material.search.SearchBar.f50515m0
            android.content.Context r10 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r10, r11, r12, r6)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f50526h0 = r10
            IF1 r0 = new IF1
            r0.<init>()
            r9.f50530l0 = r0
            android.content.Context r7 = r9.getContext()
            r9.m44358R(r11)
            int r0 = com.google.android.material.R.drawable.ic_search_black_24
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r7, r0)
            r9.f50520b0 = r0
            com.google.android.material.search.a r0 = new com.google.android.material.search.a
            r0.<init>()
            r9.f50519a0 = r0
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
            r9.f50518W = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_defaultScrollFlagsEnabled
            boolean r1 = r0.getBoolean(r1, r2)
            r9.f50527i0 = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_hideNavigationIcon
            boolean r1 = r0.getBoolean(r1, r8)
            int r3 = com.google.android.material.R.styleable.SearchBar_forceDefaultNavigationOnClickListener
            boolean r3 = r0.getBoolean(r3, r8)
            r9.f50522d0 = r3
            int r3 = com.google.android.material.R.styleable.SearchBar_tintNavigationIcon
            boolean r3 = r0.getBoolean(r3, r2)
            r9.f50521c0 = r3
            int r3 = com.google.android.material.R.styleable.SearchBar_navigationIconTint
            boolean r3 = r0.hasValue(r3)
            if (r3 == 0) goto L80
            int r3 = com.google.android.material.R.styleable.SearchBar_navigationIconTint
            int r3 = r0.getColor(r3, r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.f50524f0 = r3
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
            r9.m44369G()
        La8:
            r9.setClickable(r2)
            r9.setFocusable(r2)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r7)
            int r1 = com.google.android.material.R.layout.mtrl_search_bar
            r0.inflate(r1, r9)
            r9.f50517V = r2
            int r0 = com.google.android.material.R.id.search_bar_text_view
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.f50516U = r0
            androidx.core.view.ViewCompat.setElevation(r9, r12)
            r9.m44368H(r10, r3, r4)
            r9.m44370F(r11, r12, r5, r6)
            android.content.Context r10 = r9.getContext()
            java.lang.String r11 = "accessibility"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.view.accessibility.AccessibilityManager r10 = (android.view.accessibility.AccessibilityManager) r10
            r9.f50529k0 = r10
            r9.m44359Q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z) {
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        this.f50519a0.m44307H(this, view, appBarLayout, z);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z) {
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        this.f50519a0.m44306I(this, view, appBarLayout, z);
        return true;
    }
}