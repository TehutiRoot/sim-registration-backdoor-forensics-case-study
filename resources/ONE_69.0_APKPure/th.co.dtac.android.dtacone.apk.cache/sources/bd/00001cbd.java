package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ToolbarWidgetWrapper implements DecorToolbar {

    /* renamed from: a */
    public Toolbar f10095a;

    /* renamed from: b */
    public int f10096b;

    /* renamed from: c */
    public View f10097c;

    /* renamed from: d */
    public Spinner f10098d;

    /* renamed from: e */
    public View f10099e;

    /* renamed from: f */
    public Drawable f10100f;

    /* renamed from: g */
    public Drawable f10101g;

    /* renamed from: h */
    public Drawable f10102h;

    /* renamed from: i */
    public boolean f10103i;

    /* renamed from: j */
    public CharSequence f10104j;

    /* renamed from: k */
    public CharSequence f10105k;

    /* renamed from: l */
    public CharSequence f10106l;

    /* renamed from: m */
    public Window.Callback f10107m;

    /* renamed from: n */
    public boolean f10108n;

    /* renamed from: o */
    public C2243a f10109o;

    /* renamed from: p */
    public int f10110p;

    /* renamed from: q */
    public int f10111q;

    /* renamed from: r */
    public Drawable f10112r;

    /* renamed from: androidx.appcompat.widget.ToolbarWidgetWrapper$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2240a implements View.OnClickListener {

        /* renamed from: a */
        public final ActionMenuItem f10113a;

        public View$OnClickListenerC2240a() {
            this.f10113a = new ActionMenuItem(ToolbarWidgetWrapper.this.f10095a.getContext(), 0, 16908332, 0, 0, ToolbarWidgetWrapper.this.f10104j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ToolbarWidgetWrapper toolbarWidgetWrapper = ToolbarWidgetWrapper.this;
            Window.Callback callback = toolbarWidgetWrapper.f10107m;
            if (callback != null && toolbarWidgetWrapper.f10108n) {
                callback.onMenuItemSelected(0, this.f10113a);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ToolbarWidgetWrapper$b */
    /* loaded from: classes.dex */
    public class C2241b extends ViewPropertyAnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f10115a = false;

        /* renamed from: b */
        public final /* synthetic */ int f10116b;

        public C2241b(int i) {
            this.f10116b = i;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(View view) {
            this.f10115a = true;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            if (!this.f10115a) {
                ToolbarWidgetWrapper.this.f10095a.setVisibility(this.f10116b);
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
            ToolbarWidgetWrapper.this.f10095a.setVisibility(0);
        }
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z) {
        this(toolbar, z, R.string.abc_action_bar_up_description, R.drawable.abc_ic_ab_back_material);
    }

    /* renamed from: a */
    public final int m64067a() {
        if (this.f10095a.getNavigationIcon() != null) {
            this.f10112r = this.f10095a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void animateToVisibility(int i) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = setupAnimatorToVisibility(i, 200L);
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.start();
        }
    }

    /* renamed from: b */
    public final void m64066b() {
        if (this.f10098d == null) {
            this.f10098d = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
            this.f10098d.setLayoutParams(new Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    /* renamed from: c */
    public final void m64065c(CharSequence charSequence) {
        this.f10104j = charSequence;
        if ((this.f10096b & 8) != 0) {
            this.f10095a.setTitle(charSequence);
            if (this.f10103i) {
                ViewCompat.setAccessibilityPaneTitle(this.f10095a.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean canShowOverflowMenu() {
        return this.f10095a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void collapseActionView() {
        this.f10095a.collapseActionView();
    }

    /* renamed from: d */
    public final void m64064d() {
        if ((this.f10096b & 4) != 0) {
            if (TextUtils.isEmpty(this.f10106l)) {
                this.f10095a.setNavigationContentDescription(this.f10111q);
            } else {
                this.f10095a.setNavigationContentDescription(this.f10106l);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void dismissPopupMenus() {
        this.f10095a.dismissPopupMenus();
    }

    /* renamed from: e */
    public final void m64063e() {
        if ((this.f10096b & 4) != 0) {
            Toolbar toolbar = this.f10095a;
            Drawable drawable = this.f10102h;
            if (drawable == null) {
                drawable = this.f10112r;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f10095a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: f */
    public final void m64062f() {
        Drawable drawable;
        int i = this.f10096b;
        if ((i & 2) != 0) {
            if ((i & 1) != 0) {
                drawable = this.f10101g;
                if (drawable == null) {
                    drawable = this.f10100f;
                }
            } else {
                drawable = this.f10100f;
            }
        } else {
            drawable = null;
        }
        this.f10095a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public Context getContext() {
        return this.f10095a.getContext();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public View getCustomView() {
        return this.f10099e;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDisplayOptions() {
        return this.f10096b;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownItemCount() {
        Spinner spinner = this.f10098d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownSelectedPosition() {
        Spinner spinner = this.f10098d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getHeight() {
        return this.f10095a.getHeight();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public Menu getMenu() {
        return this.f10095a.getMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getNavigationMode() {
        return this.f10110p;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public CharSequence getSubtitle() {
        return this.f10095a.getSubtitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public CharSequence getTitle() {
        return this.f10095a.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public ViewGroup getViewGroup() {
        return this.f10095a;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getVisibility() {
        return this.f10095a.getVisibility();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasEmbeddedTabs() {
        if (this.f10097c != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasExpandedActionView() {
        return this.f10095a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasIcon() {
        if (this.f10100f != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasLogo() {
        if (this.f10101g != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hideOverflowMenu() {
        return this.f10095a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initIndeterminateProgress() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initProgress() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowPending() {
        return this.f10095a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowing() {
        return this.f10095a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isTitleTruncated() {
        return this.f10095a.isTitleTruncated();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.f10095a.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.f10095a.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setBackgroundDrawable(Drawable drawable) {
        ViewCompat.setBackground(this.f10095a, drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCollapsible(boolean z) {
        this.f10095a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCustomView(View view) {
        View view2 = this.f10099e;
        if (view2 != null && (this.f10096b & 16) != 0) {
            this.f10095a.removeView(view2);
        }
        this.f10099e = view;
        if (view != null && (this.f10096b & 16) != 0) {
            this.f10095a.addView(view);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationContentDescription(int i) {
        if (i == this.f10111q) {
            return;
        }
        this.f10111q = i;
        if (TextUtils.isEmpty(this.f10095a.getNavigationContentDescription())) {
            setNavigationContentDescription(this.f10111q);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationIcon(Drawable drawable) {
        if (this.f10112r != drawable) {
            this.f10112r = drawable;
            m64063e();
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDisplayOptions(int i) {
        View view;
        int i2 = this.f10096b ^ i;
        this.f10096b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m64064d();
                }
                m64063e();
            }
            if ((i2 & 3) != 0) {
                m64062f();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f10095a.setTitle(this.f10104j);
                    this.f10095a.setSubtitle(this.f10105k);
                } else {
                    this.f10095a.setTitle((CharSequence) null);
                    this.f10095a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f10099e) != null) {
                if ((i & 16) != 0) {
                    this.f10095a.addView(view);
                } else {
                    this.f10095a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownParams(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        m64066b();
        this.f10098d.setAdapter(spinnerAdapter);
        this.f10098d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownSelectedPosition(int i) {
        Spinner spinner = this.f10098d;
        if (spinner != null) {
            spinner.setSelection(i);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f10097c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f10095a;
            if (parent == toolbar) {
                toolbar.removeView(this.f10097c);
            }
        }
        this.f10097c = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.f10110p == 2) {
            this.f10095a.addView(scrollingTabContainerView, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f10097c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
            layoutParams.gravity = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setHomeButtonEnabled(boolean z) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(int i) {
        setIcon(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(int i) {
        setLogo(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
        if (this.f10109o == null) {
            C2243a c2243a = new C2243a(this.f10095a.getContext());
            this.f10109o = c2243a;
            c2243a.setId(R.id.action_menu_presenter);
        }
        this.f10109o.setCallback(callback);
        this.f10095a.setMenu((MenuBuilder) menu, this.f10109o);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.f10095a.setMenuCallbacks(callback, callback2);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuPrepared() {
        this.f10108n = true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(CharSequence charSequence) {
        this.f10106l = charSequence;
        m64064d();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(Drawable drawable) {
        this.f10102h = drawable;
        m64063e();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationMode(int i) {
        View view;
        int i2 = this.f10110p;
        if (i != i2) {
            if (i2 != 1) {
                if (i2 == 2 && (view = this.f10097c) != null) {
                    ViewParent parent = view.getParent();
                    Toolbar toolbar = this.f10095a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.f10097c);
                    }
                }
            } else {
                Spinner spinner = this.f10098d;
                if (spinner != null) {
                    ViewParent parent2 = spinner.getParent();
                    Toolbar toolbar2 = this.f10095a;
                    if (parent2 == toolbar2) {
                        toolbar2.removeView(this.f10098d);
                    }
                }
            }
            this.f10110p = i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        View view2 = this.f10097c;
                        if (view2 != null) {
                            this.f10095a.addView(view2, 0);
                            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f10097c.getLayoutParams();
                            ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
                            ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                            layoutParams.gravity = 8388691;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Invalid navigation mode " + i);
                }
                m64066b();
                this.f10095a.addView(this.f10098d, 0);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setSubtitle(CharSequence charSequence) {
        this.f10105k = charSequence;
        if ((this.f10096b & 8) != 0) {
            this.f10095a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setTitle(CharSequence charSequence) {
        this.f10103i = true;
        m64065c(charSequence);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setVisibility(int i) {
        this.f10095a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowCallback(Window.Callback callback) {
        this.f10107m = callback;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f10103i) {
            m64065c(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long j) {
        float f;
        ViewPropertyAnimatorCompat animate = ViewCompat.animate(this.f10095a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return animate.alpha(f).setDuration(j).setListener(new C2241b(i));
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean showOverflowMenu() {
        return this.f10095a.showOverflowMenu();
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f10110p = 0;
        this.f10111q = 0;
        this.f10095a = toolbar;
        this.f10104j = toolbar.getTitle();
        this.f10105k = toolbar.getSubtitle();
        this.f10103i = this.f10104j != null;
        this.f10102h = toolbar.getNavigationIcon();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(toolbar.getContext(), null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        this.f10112r = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence text = obtainStyledAttributes.getText(R.styleable.ActionBar_title);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = obtainStyledAttributes.getText(R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                setSubtitle(text2);
            }
            Drawable drawable2 = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_logo);
            if (drawable2 != null) {
                setLogo(drawable2);
            }
            Drawable drawable3 = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_icon);
            if (drawable3 != null) {
                setIcon(drawable3);
            }
            if (this.f10102h == null && (drawable = this.f10112r) != null) {
                setNavigationIcon(drawable);
            }
            setDisplayOptions(obtainStyledAttributes.getInt(R.styleable.ActionBar_displayOptions, 0));
            int resourceId = obtainStyledAttributes.getResourceId(R.styleable.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                setCustomView(LayoutInflater.from(this.f10095a.getContext()).inflate(resourceId, (ViewGroup) this.f10095a, false));
                setDisplayOptions(this.f10096b | 16);
            }
            int layoutDimension = obtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.f10095a.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.f10095a.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.f10095a.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar2 = this.f10095a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), resourceId2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(R.styleable.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar3 = this.f10095a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), resourceId3);
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(R.styleable.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                this.f10095a.setPopupTheme(resourceId4);
            }
        } else {
            this.f10096b = m64067a();
        }
        obtainStyledAttributes.recycle();
        setDefaultNavigationContentDescription(i);
        this.f10106l = this.f10095a.getNavigationContentDescription();
        this.f10095a.setNavigationOnClickListener(new View$OnClickListenerC2240a());
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(Drawable drawable) {
        this.f10100f = drawable;
        m64062f();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(Drawable drawable) {
        this.f10101g = drawable;
        m64062f();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i == 0 ? null : getContext().getString(i));
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(int i) {
        setNavigationIcon(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }
}