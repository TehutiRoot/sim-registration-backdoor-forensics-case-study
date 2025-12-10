package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.InterfaceC2037Px;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

/* loaded from: classes4.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: u */
    public static final int[] f50411u = {16842912};

    /* renamed from: v */
    public static final int[] f50412v = {-16842910};

    /* renamed from: w */
    public static final int f50413w = R.style.Widget_Design_NavigationView;

    /* renamed from: h */
    public final NavigationMenu f50414h;

    /* renamed from: i */
    public final NavigationMenuPresenter f50415i;

    /* renamed from: j */
    public OnNavigationItemSelectedListener f50416j;

    /* renamed from: k */
    public final int f50417k;

    /* renamed from: l */
    public final int[] f50418l;

    /* renamed from: m */
    public MenuInflater f50419m;

    /* renamed from: n */
    public ViewTreeObserver.OnGlobalLayoutListener f50420n;

    /* renamed from: o */
    public boolean f50421o;

    /* renamed from: p */
    public boolean f50422p;

    /* renamed from: q */
    public int f50423q;

    /* renamed from: r */
    public int f50424r;

    /* renamed from: s */
    public Path f50425s;

    /* renamed from: t */
    public final RectF f50426t;

    /* loaded from: classes4.dex */
    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    /* loaded from: classes4.dex */
    public class C7009a implements MenuBuilder.Callback {
        public C7009a() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.f50416j;
            if (onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(MenuBuilder menuBuilder) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    /* loaded from: classes4.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC7010b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC7010b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f50418l);
            boolean z7 = true;
            if (NavigationView.this.f50418l[1] == 0) {
                z = true;
            } else {
                z = false;
            }
            NavigationView.this.f50415i.setBehindStatusBar(z);
            NavigationView navigationView2 = NavigationView.this;
            if (z && navigationView2.isTopInsetScrimEnabled()) {
                z2 = true;
            } else {
                z2 = false;
            }
            navigationView2.setDrawTopInsetForeground(z2);
            if (NavigationView.this.f50418l[0] != 0 && NavigationView.this.f50418l[0] + NavigationView.this.getWidth() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            NavigationView.this.setDrawLeftInsetForeground(z3);
            Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
            if (activity != null) {
                Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
                if (currentWindowBounds.height() - NavigationView.this.getHeight() == NavigationView.this.f50418l[1]) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                NavigationView navigationView3 = NavigationView.this;
                if (z4 && z5 && navigationView3.isBottomInsetScrimEnabled()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                navigationView3.setDrawBottomInsetForeground(z6);
                if (currentWindowBounds.width() != NavigationView.this.f50418l[0] && currentWindowBounds.width() - NavigationView.this.getWidth() != NavigationView.this.f50418l[0]) {
                    z7 = false;
                }
                NavigationView.this.setDrawRightInsetForeground(z7);
            }
        }
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f50419m == null) {
            this.f50419m = new SupportMenuInflater(getContext());
        }
        return this.f50419m;
    }

    public void addHeaderView(@NonNull View view) {
        this.f50415i.addHeaderView(view);
    }

    /* renamed from: c */
    public final ColorStateList m44459c(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f50412v;
        return new ColorStateList(new int[][]{iArr, f50411u, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: d */
    public final Drawable m44458d(TintTypedArray tintTypedArray) {
        return m44457e(tintTypedArray, MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.NavigationView_itemShapeFillColor));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        if (this.f50425s == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f50425s);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: e */
    public final Drawable m44457e(TintTypedArray tintTypedArray, ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), tintTypedArray.getResourceId(R.styleable.NavigationView_itemShapeAppearance, 0), tintTypedArray.getResourceId(R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, tintTypedArray.getDimensionPixelSize(R.styleable.NavigationView_itemShapeInsetStart, 0), tintTypedArray.getDimensionPixelSize(R.styleable.NavigationView_itemShapeInsetTop, 0), tintTypedArray.getDimensionPixelSize(R.styleable.NavigationView_itemShapeInsetEnd, 0), tintTypedArray.getDimensionPixelSize(R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    /* renamed from: f */
    public final boolean m44456f(TintTypedArray tintTypedArray) {
        if (!tintTypedArray.hasValue(R.styleable.NavigationView_itemShapeAppearance) && !tintTypedArray.hasValue(R.styleable.NavigationView_itemShapeAppearanceOverlay)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m44455g(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && this.f50424r > 0 && (getBackground() instanceof MaterialShapeDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
            ShapeAppearanceModel.Builder builder = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
            if (GravityCompat.getAbsoluteGravity(this.f50423q, ViewCompat.getLayoutDirection(this)) == 3) {
                builder.setTopRightCornerSize(this.f50424r);
                builder.setBottomRightCornerSize(this.f50424r);
            } else {
                builder.setTopLeftCornerSize(this.f50424r);
                builder.setBottomLeftCornerSize(this.f50424r);
            }
            materialShapeDrawable.setShapeAppearanceModel(builder.build());
            if (this.f50425s == null) {
                this.f50425s = new Path();
            }
            this.f50425s.reset();
            this.f50426t.set(0.0f, 0.0f, i, i2);
            ShapeAppearancePathProvider.getInstance().calculatePath(materialShapeDrawable.getShapeAppearanceModel(), materialShapeDrawable.getInterpolation(), this.f50426t, this.f50425s);
            invalidate();
            return;
        }
        this.f50425s = null;
        this.f50426t.setEmpty();
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.f50415i.getCheckedItem();
    }

    @InterfaceC2037Px
    public int getDividerInsetEnd() {
        return this.f50415i.getDividerInsetEnd();
    }

    @InterfaceC2037Px
    public int getDividerInsetStart() {
        return this.f50415i.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.f50415i.getHeaderCount();
    }

    public View getHeaderView(int i) {
        return this.f50415i.getHeaderView(i);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f50415i.getItemBackground();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.f50415i.getItemHorizontalPadding();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.f50415i.getItemIconPadding();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f50415i.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.f50415i.getItemMaxLines();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f50415i.getItemTextColor();
    }

    @InterfaceC2037Px
    public int getItemVerticalPadding() {
        return this.f50415i.getItemVerticalPadding();
    }

    @NonNull
    public Menu getMenu() {
        return this.f50414h;
    }

    @InterfaceC2037Px
    public int getSubheaderInsetEnd() {
        return this.f50415i.getSubheaderInsetEnd();
    }

    @InterfaceC2037Px
    public int getSubheaderInsetStart() {
        return this.f50415i.getSubheaderInsetStart();
    }

    /* renamed from: h */
    public final void m44454h() {
        this.f50420n = new ViewTreeObserver$OnGlobalLayoutListenerC7010b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f50420n);
    }

    public View inflateHeaderView(@LayoutRes int i) {
        return this.f50415i.inflateHeaderView(i);
    }

    public void inflateMenu(int i) {
        this.f50415i.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.f50414h);
        this.f50415i.setUpdateSuspended(false);
        this.f50415i.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.f50422p;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.f50421o;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f50420n);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onInsetsChanged(@NonNull WindowInsetsCompat windowInsetsCompat) {
        this.f50415i.dispatchApplyWindowInsets(windowInsetsCompat);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(this.f50417k, 1073741824);
            }
        } else {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f50417k), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f50414h.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.f50414h.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m44455g(i, i2);
    }

    public void removeHeaderView(@NonNull View view) {
        this.f50415i.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.f50422p = z;
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem findItem = this.f50414h.findItem(i);
        if (findItem != null) {
            this.f50415i.setCheckedItem((MenuItemImpl) findItem);
        }
    }

    public void setDividerInsetEnd(@InterfaceC2037Px int i) {
        this.f50415i.setDividerInsetEnd(i);
    }

    public void setDividerInsetStart(@InterfaceC2037Px int i) {
        this.f50415i.setDividerInsetStart(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f50415i.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        this.f50415i.setItemHorizontalPadding(i);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i) {
        this.f50415i.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@Dimension int i) {
        this.f50415i.setItemIconPadding(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f50415i.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@Dimension int i) {
        this.f50415i.setItemIconSize(i);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f50415i.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f50415i.setItemMaxLines(i);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.f50415i.setItemTextAppearance(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f50415i.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(@InterfaceC2037Px int i) {
        this.f50415i.setItemVerticalPadding(i);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i) {
        this.f50415i.setItemVerticalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.f50416j = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.f50415i;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i);
        }
    }

    public void setSubheaderInsetEnd(@InterfaceC2037Px int i) {
        this.f50415i.setSubheaderInsetEnd(i);
    }

    public void setSubheaderInsetStart(@InterfaceC2037Px int i) {
        this.f50415i.setSubheaderInsetStart(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.f50421o = z;
    }

    /* loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C7008a();
        @Nullable
        public Bundle menuState;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        /* loaded from: classes4.dex */
        public class C7008a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NavigationView(@androidx.annotation.NonNull android.content.Context r17, @androidx.annotation.Nullable android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem findItem = this.f50414h.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f50415i.setCheckedItem((MenuItemImpl) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}