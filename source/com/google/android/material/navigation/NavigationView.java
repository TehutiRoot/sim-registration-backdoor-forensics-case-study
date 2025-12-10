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
import androidx.annotation.InterfaceC2055Px;
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
    public static final int[] f50399u = {16842912};

    /* renamed from: v */
    public static final int[] f50400v = {-16842910};

    /* renamed from: w */
    public static final int f50401w = R.style.Widget_Design_NavigationView;

    /* renamed from: h */
    public final NavigationMenu f50402h;

    /* renamed from: i */
    public final NavigationMenuPresenter f50403i;

    /* renamed from: j */
    public OnNavigationItemSelectedListener f50404j;

    /* renamed from: k */
    public final int f50405k;

    /* renamed from: l */
    public final int[] f50406l;

    /* renamed from: m */
    public MenuInflater f50407m;

    /* renamed from: n */
    public ViewTreeObserver.OnGlobalLayoutListener f50408n;

    /* renamed from: o */
    public boolean f50409o;

    /* renamed from: p */
    public boolean f50410p;

    /* renamed from: q */
    public int f50411q;

    /* renamed from: r */
    public int f50412r;

    /* renamed from: s */
    public Path f50413s;

    /* renamed from: t */
    public final RectF f50414t;

    /* loaded from: classes4.dex */
    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    /* loaded from: classes4.dex */
    public class C7020a implements MenuBuilder.Callback {
        public C7020a() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.f50404j;
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
    public class ViewTreeObserver$OnGlobalLayoutListenerC7021b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC7021b() {
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
            navigationView.getLocationOnScreen(navigationView.f50406l);
            boolean z7 = true;
            if (NavigationView.this.f50406l[1] == 0) {
                z = true;
            } else {
                z = false;
            }
            NavigationView.this.f50403i.setBehindStatusBar(z);
            NavigationView navigationView2 = NavigationView.this;
            if (z && navigationView2.isTopInsetScrimEnabled()) {
                z2 = true;
            } else {
                z2 = false;
            }
            navigationView2.setDrawTopInsetForeground(z2);
            if (NavigationView.this.f50406l[0] != 0 && NavigationView.this.f50406l[0] + NavigationView.this.getWidth() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            NavigationView.this.setDrawLeftInsetForeground(z3);
            Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
            if (activity != null) {
                Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
                if (currentWindowBounds.height() - NavigationView.this.getHeight() == NavigationView.this.f50406l[1]) {
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
                if (currentWindowBounds.width() != NavigationView.this.f50406l[0] && currentWindowBounds.width() - NavigationView.this.getWidth() != NavigationView.this.f50406l[0]) {
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
        if (this.f50407m == null) {
            this.f50407m = new SupportMenuInflater(getContext());
        }
        return this.f50407m;
    }

    public void addHeaderView(@NonNull View view) {
        this.f50403i.addHeaderView(view);
    }

    /* renamed from: c */
    public final ColorStateList m44472c(int i) {
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
        int[] iArr = f50400v;
        return new ColorStateList(new int[][]{iArr, f50399u, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: d */
    public final Drawable m44471d(TintTypedArray tintTypedArray) {
        return m44470e(tintTypedArray, MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.NavigationView_itemShapeFillColor));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        if (this.f50413s == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f50413s);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: e */
    public final Drawable m44470e(TintTypedArray tintTypedArray, ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), tintTypedArray.getResourceId(R.styleable.NavigationView_itemShapeAppearance, 0), tintTypedArray.getResourceId(R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, tintTypedArray.getDimensionPixelSize(R.styleable.NavigationView_itemShapeInsetStart, 0), tintTypedArray.getDimensionPixelSize(R.styleable.NavigationView_itemShapeInsetTop, 0), tintTypedArray.getDimensionPixelSize(R.styleable.NavigationView_itemShapeInsetEnd, 0), tintTypedArray.getDimensionPixelSize(R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    /* renamed from: f */
    public final boolean m44469f(TintTypedArray tintTypedArray) {
        if (!tintTypedArray.hasValue(R.styleable.NavigationView_itemShapeAppearance) && !tintTypedArray.hasValue(R.styleable.NavigationView_itemShapeAppearanceOverlay)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m44468g(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && this.f50412r > 0 && (getBackground() instanceof MaterialShapeDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
            ShapeAppearanceModel.Builder builder = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
            if (GravityCompat.getAbsoluteGravity(this.f50411q, ViewCompat.getLayoutDirection(this)) == 3) {
                builder.setTopRightCornerSize(this.f50412r);
                builder.setBottomRightCornerSize(this.f50412r);
            } else {
                builder.setTopLeftCornerSize(this.f50412r);
                builder.setBottomLeftCornerSize(this.f50412r);
            }
            materialShapeDrawable.setShapeAppearanceModel(builder.build());
            if (this.f50413s == null) {
                this.f50413s = new Path();
            }
            this.f50413s.reset();
            this.f50414t.set(0.0f, 0.0f, i, i2);
            ShapeAppearancePathProvider.getInstance().calculatePath(materialShapeDrawable.getShapeAppearanceModel(), materialShapeDrawable.getInterpolation(), this.f50414t, this.f50413s);
            invalidate();
            return;
        }
        this.f50413s = null;
        this.f50414t.setEmpty();
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.f50403i.getCheckedItem();
    }

    @InterfaceC2055Px
    public int getDividerInsetEnd() {
        return this.f50403i.getDividerInsetEnd();
    }

    @InterfaceC2055Px
    public int getDividerInsetStart() {
        return this.f50403i.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.f50403i.getHeaderCount();
    }

    public View getHeaderView(int i) {
        return this.f50403i.getHeaderView(i);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f50403i.getItemBackground();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.f50403i.getItemHorizontalPadding();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.f50403i.getItemIconPadding();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f50403i.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.f50403i.getItemMaxLines();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f50403i.getItemTextColor();
    }

    @InterfaceC2055Px
    public int getItemVerticalPadding() {
        return this.f50403i.getItemVerticalPadding();
    }

    @NonNull
    public Menu getMenu() {
        return this.f50402h;
    }

    @InterfaceC2055Px
    public int getSubheaderInsetEnd() {
        return this.f50403i.getSubheaderInsetEnd();
    }

    @InterfaceC2055Px
    public int getSubheaderInsetStart() {
        return this.f50403i.getSubheaderInsetStart();
    }

    /* renamed from: h */
    public final void m44467h() {
        this.f50408n = new ViewTreeObserver$OnGlobalLayoutListenerC7021b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f50408n);
    }

    public View inflateHeaderView(@LayoutRes int i) {
        return this.f50403i.inflateHeaderView(i);
    }

    public void inflateMenu(int i) {
        this.f50403i.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.f50402h);
        this.f50403i.setUpdateSuspended(false);
        this.f50403i.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.f50410p;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.f50409o;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f50408n);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onInsetsChanged(@NonNull WindowInsetsCompat windowInsetsCompat) {
        this.f50403i.dispatchApplyWindowInsets(windowInsetsCompat);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(this.f50405k, 1073741824);
            }
        } else {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f50405k), 1073741824);
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
        this.f50402h.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.f50402h.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m44468g(i, i2);
    }

    public void removeHeaderView(@NonNull View view) {
        this.f50403i.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.f50410p = z;
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem findItem = this.f50402h.findItem(i);
        if (findItem != null) {
            this.f50403i.setCheckedItem((MenuItemImpl) findItem);
        }
    }

    public void setDividerInsetEnd(@InterfaceC2055Px int i) {
        this.f50403i.setDividerInsetEnd(i);
    }

    public void setDividerInsetStart(@InterfaceC2055Px int i) {
        this.f50403i.setDividerInsetStart(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f50403i.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        this.f50403i.setItemHorizontalPadding(i);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i) {
        this.f50403i.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@Dimension int i) {
        this.f50403i.setItemIconPadding(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f50403i.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@Dimension int i) {
        this.f50403i.setItemIconSize(i);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f50403i.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f50403i.setItemMaxLines(i);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.f50403i.setItemTextAppearance(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f50403i.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(@InterfaceC2055Px int i) {
        this.f50403i.setItemVerticalPadding(i);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i) {
        this.f50403i.setItemVerticalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.f50404j = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.f50403i;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i);
        }
    }

    public void setSubheaderInsetEnd(@InterfaceC2055Px int i) {
        this.f50403i.setSubheaderInsetEnd(i);
    }

    public void setSubheaderInsetStart(@InterfaceC2055Px int i) {
        this.f50403i.setSubheaderInsetStart(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.f50409o = z;
    }

    /* loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C7019a();
        @Nullable
        public Bundle menuState;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        /* loaded from: classes4.dex */
        public class C7019a implements Parcelable.ClassLoaderCreator {
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
        MenuItem findItem = this.f50402h.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f50403i.setCheckedItem((MenuItemImpl) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
