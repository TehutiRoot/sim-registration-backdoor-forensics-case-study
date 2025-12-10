package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.Dimension;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.TextScale;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.HashSet;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {

    /* renamed from: D */
    public static final int[] f50353D = {16842912};

    /* renamed from: E */
    public static final int[] f50354E = {-16842910};

    /* renamed from: A */
    public ColorStateList f50355A;

    /* renamed from: B */
    public NavigationBarPresenter f50356B;

    /* renamed from: C */
    public MenuBuilder f50357C;

    /* renamed from: a */
    public final TransitionSet f50358a;

    /* renamed from: b */
    public final View.OnClickListener f50359b;

    /* renamed from: c */
    public final Pools.Pool f50360c;

    /* renamed from: d */
    public final SparseArray f50361d;

    /* renamed from: e */
    public int f50362e;

    /* renamed from: f */
    public NavigationBarItemView[] f50363f;

    /* renamed from: g */
    public int f50364g;

    /* renamed from: h */
    public int f50365h;

    /* renamed from: i */
    public ColorStateList f50366i;

    /* renamed from: j */
    public int f50367j;

    /* renamed from: k */
    public ColorStateList f50368k;

    /* renamed from: l */
    public final ColorStateList f50369l;

    /* renamed from: m */
    public int f50370m;

    /* renamed from: n */
    public int f50371n;

    /* renamed from: o */
    public Drawable f50372o;

    /* renamed from: p */
    public ColorStateList f50373p;

    /* renamed from: q */
    public int f50374q;

    /* renamed from: r */
    public final SparseArray f50375r;

    /* renamed from: s */
    public int f50376s;

    /* renamed from: t */
    public int f50377t;

    /* renamed from: u */
    public boolean f50378u;

    /* renamed from: v */
    public int f50379v;

    /* renamed from: w */
    public int f50380w;

    /* renamed from: x */
    public int f50381x;

    /* renamed from: y */
    public ShapeAppearanceModel f50382y;

    /* renamed from: z */
    public boolean f50383z;

    /* renamed from: com.google.android.material.navigation.NavigationBarMenuView$a */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC7013a implements View.OnClickListener {
        public View$OnClickListenerC7013a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MenuItemImpl itemData = ((NavigationBarItemView) view).getItemData();
            if (!NavigationBarMenuView.this.f50357C.performItemAction(itemData, NavigationBarMenuView.this.f50356B, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public NavigationBarMenuView(@NonNull Context context) {
        super(context);
        this.f50360c = new Pools.SynchronizedPool(5);
        this.f50361d = new SparseArray(5);
        this.f50364g = 0;
        this.f50365h = 0;
        this.f50375r = new SparseArray(5);
        this.f50376s = -1;
        this.f50377t = -1;
        this.f50383z = false;
        this.f50369l = createDefaultColorStateList(16842808);
        if (isInEditMode()) {
            this.f50358a = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f50358a = autoTransition;
            autoTransition.setOrdering(0);
            autoTransition.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationMedium4, getResources().getInteger(R.integer.material_motion_duration_long_1)));
            autoTransition.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingStandard, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            autoTransition.addTransition(new TextScale());
        }
        this.f50359b = new View$OnClickListenerC7013a();
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) this.f50360c.acquire();
        if (navigationBarItemView == null) {
            return createNavigationBarItemView(getContext());
        }
        return navigationBarItemView;
    }

    private void setBadgeIfNeeded(@NonNull NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id2 = navigationBarItemView.getId();
        if (m44489e(id2) && (badgeDrawable = (BadgeDrawable) this.f50375r.get(id2)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void buildMenuView() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f50360c.release(navigationBarItemView);
                    navigationBarItemView.m44516f();
                }
            }
        }
        if (this.f50357C.size() == 0) {
            this.f50364g = 0;
            this.f50365h = 0;
            this.f50363f = null;
            return;
        }
        m44487g();
        this.f50363f = new NavigationBarItemView[this.f50357C.size()];
        boolean isShifting = isShifting(this.f50362e, this.f50357C.getVisibleItems().size());
        for (int i = 0; i < this.f50357C.size(); i++) {
            this.f50356B.setUpdateSuspended(true);
            this.f50357C.getItem(i).setCheckable(true);
            this.f50356B.setUpdateSuspended(false);
            NavigationBarItemView newItem = getNewItem();
            this.f50363f[i] = newItem;
            newItem.setIconTintList(this.f50366i);
            newItem.setIconSize(this.f50367j);
            newItem.setTextColor(this.f50369l);
            newItem.setTextAppearanceInactive(this.f50370m);
            newItem.setTextAppearanceActive(this.f50371n);
            newItem.setTextColor(this.f50368k);
            int i2 = this.f50376s;
            if (i2 != -1) {
                newItem.setItemPaddingTop(i2);
            }
            int i3 = this.f50377t;
            if (i3 != -1) {
                newItem.setItemPaddingBottom(i3);
            }
            newItem.setActiveIndicatorWidth(this.f50379v);
            newItem.setActiveIndicatorHeight(this.f50380w);
            newItem.setActiveIndicatorMarginHorizontal(this.f50381x);
            newItem.setActiveIndicatorDrawable(m44491c());
            newItem.setActiveIndicatorResizeable(this.f50383z);
            newItem.setActiveIndicatorEnabled(this.f50378u);
            Drawable drawable = this.f50372o;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f50374q);
            }
            newItem.setItemRippleColor(this.f50373p);
            newItem.setShifting(isShifting);
            newItem.setLabelVisibilityMode(this.f50362e);
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f50357C.getItem(i);
            newItem.initialize(menuItemImpl, 0);
            newItem.setItemPosition(i);
            int itemId = menuItemImpl.getItemId();
            newItem.setOnTouchListener((View.OnTouchListener) this.f50361d.get(itemId));
            newItem.setOnClickListener(this.f50359b);
            int i4 = this.f50364g;
            if (i4 != 0 && itemId == i4) {
                this.f50365h = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f50357C.size() - 1, this.f50365h);
        this.f50365h = min;
        this.f50357C.getItem(min).setChecked(true);
    }

    /* renamed from: c */
    public final Drawable m44491c() {
        if (this.f50382y != null && this.f50355A != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f50382y);
            materialShapeDrawable.setFillColor(this.f50355A);
            return materialShapeDrawable;
        }
        return null;
    }

    @Nullable
    public ColorStateList createDefaultColorStateList(int i) {
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
        int[] iArr = f50354E;
        return new ColorStateList(new int[][]{iArr, f50353D, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @NonNull
    public abstract NavigationBarItemView createNavigationBarItemView(@NonNull Context context);

    /* renamed from: d */
    public BadgeDrawable m44490d(int i) {
        m44484j(i);
        BadgeDrawable badgeDrawable = (BadgeDrawable) this.f50375r.get(i);
        if (badgeDrawable == null) {
            badgeDrawable = BadgeDrawable.create(getContext());
            this.f50375r.put(i, badgeDrawable);
        }
        NavigationBarItemView findItemView = findItemView(i);
        if (findItemView != null) {
            findItemView.setBadge(badgeDrawable);
        }
        return badgeDrawable;
    }

    /* renamed from: e */
    public final boolean m44489e(int i) {
        return i != -1;
    }

    /* renamed from: f */
    public void m44488f(int i) {
        m44484j(i);
        BadgeDrawable badgeDrawable = (BadgeDrawable) this.f50375r.get(i);
        NavigationBarItemView findItemView = findItemView(i);
        if (findItemView != null) {
            findItemView.m44508n();
        }
        if (badgeDrawable != null) {
            this.f50375r.remove(i);
        }
    }

    @Nullable
    public NavigationBarItemView findItemView(int i) {
        m44484j(i);
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getId() == i) {
                    return navigationBarItemView;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: g */
    public final void m44487g() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f50357C.size(); i++) {
            hashSet.add(Integer.valueOf(this.f50357C.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f50375r.size(); i2++) {
            int keyAt = this.f50375r.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f50375r.delete(keyAt);
            }
        }
    }

    @Nullable
    public BadgeDrawable getBadge(int i) {
        return (BadgeDrawable) this.f50375r.get(i);
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f50375r;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.f50366i;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f50355A;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f50378u;
    }

    @InterfaceC2055Px
    public int getItemActiveIndicatorHeight() {
        return this.f50380w;
    }

    @InterfaceC2055Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f50381x;
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.f50382y;
    }

    @InterfaceC2055Px
    public int getItemActiveIndicatorWidth() {
        return this.f50379v;
    }

    @Nullable
    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null && navigationBarItemViewArr.length > 0) {
            return navigationBarItemViewArr[0].getBackground();
        }
        return this.f50372o;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f50374q;
    }

    @Dimension
    public int getItemIconSize() {
        return this.f50367j;
    }

    @InterfaceC2055Px
    public int getItemPaddingBottom() {
        return this.f50377t;
    }

    @InterfaceC2055Px
    public int getItemPaddingTop() {
        return this.f50376s;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f50373p;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f50371n;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f50370m;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f50368k;
    }

    public int getLabelVisibilityMode() {
        return this.f50362e;
    }

    @Nullable
    public MenuBuilder getMenu() {
        return this.f50357C;
    }

    public int getSelectedItemId() {
        return this.f50364g;
    }

    public int getSelectedItemPosition() {
        return this.f50365h;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public void m44486h(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (this.f50375r.indexOfKey(keyAt) < 0) {
                this.f50375r.append(keyAt, (BadgeDrawable) sparseArray.get(keyAt));
            }
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setBadge((BadgeDrawable) this.f50375r.get(navigationBarItemView.getId()));
            }
        }
    }

    /* renamed from: i */
    public void m44485i(int i) {
        int size = this.f50357C.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f50357C.getItem(i2);
            if (i == item.getItemId()) {
                this.f50364g = i;
                this.f50365h = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(@NonNull MenuBuilder menuBuilder) {
        this.f50357C = menuBuilder;
    }

    public boolean isItemActiveIndicatorResizeable() {
        return this.f50383z;
    }

    public boolean isShifting(int i, int i2) {
        if (i == -1) {
            if (i2 <= 3) {
                return false;
            }
        } else if (i != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void m44484j(int i) {
        if (m44489e(i)) {
            return;
        }
        throw new IllegalArgumentException(i + " is not a valid view id");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.f50357C.getVisibleItems().size(), false, 1));
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f50366i = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f50355A = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(m44491c());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f50378u = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@InterfaceC2055Px int i) {
        this.f50380w = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@InterfaceC2055Px int i) {
        this.f50381x = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f50383z = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f50382y = shapeAppearanceModel;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(m44491c());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@InterfaceC2055Px int i) {
        this.f50379v = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f50372o = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f50374q = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(@Dimension int i) {
        this.f50367j = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i, @Nullable View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f50361d.remove(i);
        } else {
            this.f50361d.put(i, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getItemData().getItemId() == i) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(@InterfaceC2055Px int i) {
        this.f50377t = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(@InterfaceC2055Px int i) {
        this.f50376s = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f50373p = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i) {
        this.f50371n = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f50368k;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) {
        this.f50370m = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f50368k;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f50368k = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f50363f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f50362e = i;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.f50356B = navigationBarPresenter;
    }

    public void updateMenuView() {
        TransitionSet transitionSet;
        MenuBuilder menuBuilder = this.f50357C;
        if (menuBuilder != null && this.f50363f != null) {
            int size = menuBuilder.size();
            if (size != this.f50363f.length) {
                buildMenuView();
                return;
            }
            int i = this.f50364g;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f50357C.getItem(i2);
                if (item.isChecked()) {
                    this.f50364g = item.getItemId();
                    this.f50365h = i2;
                }
            }
            if (i != this.f50364g && (transitionSet = this.f50358a) != null) {
                TransitionManager.beginDelayedTransition(this, transitionSet);
            }
            boolean isShifting = isShifting(this.f50362e, this.f50357C.getVisibleItems().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f50356B.setUpdateSuspended(true);
                this.f50363f[i3].setLabelVisibilityMode(this.f50362e);
                this.f50363f[i3].setShifting(isShifting);
                this.f50363f[i3].initialize((MenuItemImpl) this.f50357C.getItem(i3), 0);
                this.f50356B.setUpdateSuspended(false);
            }
        }
    }
}
