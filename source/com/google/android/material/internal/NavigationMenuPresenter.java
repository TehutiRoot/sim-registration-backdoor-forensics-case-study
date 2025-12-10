package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.google.android.material.R;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class NavigationMenuPresenter implements MenuPresenter {
    public static final int NO_TEXT_APPEARANCE_SET = 0;

    /* renamed from: A */
    public int f50201A;

    /* renamed from: a */
    public NavigationMenuView f50204a;

    /* renamed from: b */
    public LinearLayout f50205b;

    /* renamed from: c */
    public MenuPresenter.Callback f50206c;

    /* renamed from: d */
    public MenuBuilder f50207d;

    /* renamed from: e */
    public int f50208e;

    /* renamed from: f */
    public C6982c f50209f;

    /* renamed from: g */
    public LayoutInflater f50210g;

    /* renamed from: i */
    public ColorStateList f50212i;

    /* renamed from: k */
    public ColorStateList f50214k;

    /* renamed from: l */
    public ColorStateList f50215l;

    /* renamed from: m */
    public Drawable f50216m;

    /* renamed from: n */
    public RippleDrawable f50217n;

    /* renamed from: o */
    public int f50218o;

    /* renamed from: p */
    public int f50219p;

    /* renamed from: q */
    public int f50220q;

    /* renamed from: r */
    public int f50221r;

    /* renamed from: s */
    public int f50222s;

    /* renamed from: t */
    public int f50223t;

    /* renamed from: u */
    public int f50224u;

    /* renamed from: v */
    public int f50225v;

    /* renamed from: w */
    public boolean f50226w;

    /* renamed from: y */
    public int f50228y;

    /* renamed from: z */
    public int f50229z;

    /* renamed from: h */
    public int f50211h = 0;

    /* renamed from: j */
    public int f50213j = 0;

    /* renamed from: x */
    public boolean f50227x = true;

    /* renamed from: B */
    public int f50202B = -1;

    /* renamed from: C */
    public final View.OnClickListener f50203C = new View$OnClickListenerC6980a();

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$a */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6980a implements View.OnClickListener {
        public View$OnClickListenerC6980a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean performItemAction = navigationMenuPresenter.f50207d.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && performItemAction) {
                NavigationMenuPresenter.this.f50209f.m44573m(itemData);
            } else {
                z = false;
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$b */
    /* loaded from: classes4.dex */
    public static class C6981b extends AbstractC6992l {
        public C6981b(View view) {
            super(view);
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$c */
    /* loaded from: classes4.dex */
    public class C6982c extends RecyclerView.Adapter {

        /* renamed from: a */
        public final ArrayList f50231a = new ArrayList();

        /* renamed from: b */
        public MenuItemImpl f50232b;

        /* renamed from: c */
        public boolean f50233c;

        /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$c$a */
        /* loaded from: classes4.dex */
        public class C6983a extends AccessibilityDelegateCompat {

            /* renamed from: d */
            public final /* synthetic */ int f50235d;

            /* renamed from: e */
            public final /* synthetic */ boolean f50236e;

            public C6983a(int i, boolean z) {
                this.f50235d = i;
                this.f50236e = z;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(C6982c.this.m44584b(this.f50235d), 1, 1, 1, this.f50236e, view.isSelected()));
            }
        }

        public C6982c() {
            m44576j();
        }

        /* renamed from: b */
        public final int m44584b(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (NavigationMenuPresenter.this.f50209f.getItemViewType(i3) == 2) {
                    i2--;
                }
            }
            if (NavigationMenuPresenter.this.f50205b.getChildCount() == 0) {
                return i2 - 1;
            }
            return i2;
        }

        /* renamed from: c */
        public final void m44583c(int i, int i2) {
            while (i < i2) {
                ((C6987g) this.f50231a.get(i)).f50241b = true;
                i++;
            }
        }

        /* renamed from: d */
        public Bundle m44582d() {
            View view;
            Bundle bundle = new Bundle();
            MenuItemImpl menuItemImpl = this.f50232b;
            if (menuItemImpl != null) {
                bundle.putInt("android:menu:checked", menuItemImpl.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f50231a.size();
            for (int i = 0; i < size; i++) {
                InterfaceC6985e interfaceC6985e = (InterfaceC6985e) this.f50231a.get(i);
                if (interfaceC6985e instanceof C6987g) {
                    MenuItemImpl m44568a = ((C6987g) interfaceC6985e).m44568a();
                    if (m44568a != null) {
                        view = m44568a.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(m44568a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: e */
        public MenuItemImpl m44581e() {
            return this.f50232b;
        }

        /* renamed from: f */
        public int m44580f() {
            int i;
            if (NavigationMenuPresenter.this.f50205b.getChildCount() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            for (int i2 = 0; i2 < NavigationMenuPresenter.this.f50209f.getItemCount(); i2++) {
                int itemViewType = NavigationMenuPresenter.this.f50209f.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1) {
                    i++;
                }
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: g */
        public void onBindViewHolder(AbstractC6992l abstractC6992l, int i) {
            Drawable drawable;
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        if (itemViewType == 3) {
                            m44574l(abstractC6992l.itemView, i, true);
                            return;
                        }
                        return;
                    }
                    C6986f c6986f = (C6986f) this.f50231a.get(i);
                    abstractC6992l.itemView.setPadding(NavigationMenuPresenter.this.f50222s, c6986f.m44569b(), NavigationMenuPresenter.this.f50223t, c6986f.m44570a());
                    return;
                }
                TextView textView = (TextView) abstractC6992l.itemView;
                textView.setText(((C6987g) this.f50231a.get(i)).m44568a().getTitle());
                int i2 = NavigationMenuPresenter.this.f50211h;
                if (i2 != 0) {
                    TextViewCompat.setTextAppearance(textView, i2);
                }
                textView.setPadding(NavigationMenuPresenter.this.f50224u, textView.getPaddingTop(), NavigationMenuPresenter.this.f50225v, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.f50212i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                m44574l(textView, i, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC6992l.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.f50215l);
            int i3 = NavigationMenuPresenter.this.f50213j;
            if (i3 != 0) {
                navigationMenuItemView.setTextAppearance(i3);
            }
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.f50214k;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable2 = NavigationMenuPresenter.this.f50216m;
            if (drawable2 != null) {
                drawable = drawable2.getConstantState().newDrawable();
            } else {
                drawable = null;
            }
            ViewCompat.setBackground(navigationMenuItemView, drawable);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.f50217n;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            C6987g c6987g = (C6987g) this.f50231a.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(c6987g.f50241b);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i4 = navigationMenuPresenter.f50218o;
            int i5 = navigationMenuPresenter.f50219p;
            navigationMenuItemView.setPadding(i4, i5, i4, i5);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.f50220q);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.f50226w) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.f50221r);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.f50228y);
            navigationMenuItemView.initialize(c6987g.m44568a(), 0);
            m44574l(navigationMenuItemView, i, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f50231a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            InterfaceC6985e interfaceC6985e = (InterfaceC6985e) this.f50231a.get(i);
            if (interfaceC6985e instanceof C6986f) {
                return 2;
            }
            if (interfaceC6985e instanceof C6984d) {
                return 3;
            }
            if (interfaceC6985e instanceof C6987g) {
                if (((C6987g) interfaceC6985e).m44568a().hasSubMenu()) {
                    return 1;
                }
                return 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: h */
        public AbstractC6992l onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return new C6981b(NavigationMenuPresenter.this.f50205b);
                    }
                    return new C6990j(NavigationMenuPresenter.this.f50210g, viewGroup);
                }
                return new C6991k(NavigationMenuPresenter.this.f50210g, viewGroup);
            }
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            return new C6989i(navigationMenuPresenter.f50210g, viewGroup, navigationMenuPresenter.f50203C);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: i */
        public void onViewRecycled(AbstractC6992l abstractC6992l) {
            if (abstractC6992l instanceof C6989i) {
                ((NavigationMenuItemView) abstractC6992l.itemView).recycle();
            }
        }

        /* renamed from: j */
        public final void m44576j() {
            if (this.f50233c) {
                return;
            }
            this.f50233c = true;
            this.f50231a.clear();
            this.f50231a.add(new C6984d());
            int size = NavigationMenuPresenter.this.f50207d.getVisibleItems().size();
            int i = -1;
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = NavigationMenuPresenter.this.f50207d.getVisibleItems().get(i3);
                if (menuItemImpl.isChecked()) {
                    m44573m(menuItemImpl);
                }
                if (menuItemImpl.isCheckable()) {
                    menuItemImpl.setExclusiveCheckable(false);
                }
                if (menuItemImpl.hasSubMenu()) {
                    SubMenu subMenu = menuItemImpl.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.f50231a.add(new C6986f(NavigationMenuPresenter.this.f50201A, 0));
                        }
                        this.f50231a.add(new C6987g(menuItemImpl));
                        int size2 = this.f50231a.size();
                        int size3 = subMenu.size();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < size3; i4++) {
                            MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i4);
                            if (menuItemImpl2.isVisible()) {
                                if (!z2 && menuItemImpl2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (menuItemImpl2.isCheckable()) {
                                    menuItemImpl2.setExclusiveCheckable(false);
                                }
                                if (menuItemImpl.isChecked()) {
                                    m44573m(menuItemImpl);
                                }
                                this.f50231a.add(new C6987g(menuItemImpl2));
                            }
                        }
                        if (z2) {
                            m44583c(size2, this.f50231a.size());
                        }
                    }
                } else {
                    int groupId = menuItemImpl.getGroupId();
                    if (groupId != i) {
                        i2 = this.f50231a.size();
                        if (menuItemImpl.getIcon() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i3 != 0) {
                            i2++;
                            ArrayList arrayList = this.f50231a;
                            int i5 = NavigationMenuPresenter.this.f50201A;
                            arrayList.add(new C6986f(i5, i5));
                        }
                    } else if (!z && menuItemImpl.getIcon() != null) {
                        m44583c(i2, this.f50231a.size());
                        z = true;
                    }
                    C6987g c6987g = new C6987g(menuItemImpl);
                    c6987g.f50241b = z;
                    this.f50231a.add(c6987g);
                    i = groupId;
                }
            }
            this.f50233c = false;
        }

        /* renamed from: k */
        public void m44575k(Bundle bundle) {
            MenuItemImpl m44568a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            MenuItemImpl m44568a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f50233c = true;
                int size = this.f50231a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    InterfaceC6985e interfaceC6985e = (InterfaceC6985e) this.f50231a.get(i2);
                    if ((interfaceC6985e instanceof C6987g) && (m44568a2 = ((C6987g) interfaceC6985e).m44568a()) != null && m44568a2.getItemId() == i) {
                        m44573m(m44568a2);
                        break;
                    }
                    i2++;
                }
                this.f50233c = false;
                m44576j();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f50231a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    InterfaceC6985e interfaceC6985e2 = (InterfaceC6985e) this.f50231a.get(i3);
                    if ((interfaceC6985e2 instanceof C6987g) && (m44568a = ((C6987g) interfaceC6985e2).m44568a()) != null && (actionView = m44568a.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(m44568a.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: l */
        public final void m44574l(View view, int i, boolean z) {
            ViewCompat.setAccessibilityDelegate(view, new C6983a(i, z));
        }

        /* renamed from: m */
        public void m44573m(MenuItemImpl menuItemImpl) {
            if (this.f50232b != menuItemImpl && menuItemImpl.isCheckable()) {
                MenuItemImpl menuItemImpl2 = this.f50232b;
                if (menuItemImpl2 != null) {
                    menuItemImpl2.setChecked(false);
                }
                this.f50232b = menuItemImpl;
                menuItemImpl.setChecked(true);
            }
        }

        /* renamed from: n */
        public void m44572n(boolean z) {
            this.f50233c = z;
        }

        /* renamed from: o */
        public void m44571o() {
            m44576j();
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$d */
    /* loaded from: classes4.dex */
    public static class C6984d implements InterfaceC6985e {
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$e */
    /* loaded from: classes4.dex */
    public interface InterfaceC6985e {
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$f */
    /* loaded from: classes4.dex */
    public static class C6986f implements InterfaceC6985e {

        /* renamed from: a */
        public final int f50238a;

        /* renamed from: b */
        public final int f50239b;

        public C6986f(int i, int i2) {
            this.f50238a = i;
            this.f50239b = i2;
        }

        /* renamed from: a */
        public int m44570a() {
            return this.f50239b;
        }

        /* renamed from: b */
        public int m44569b() {
            return this.f50238a;
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$g */
    /* loaded from: classes4.dex */
    public static class C6987g implements InterfaceC6985e {

        /* renamed from: a */
        public final MenuItemImpl f50240a;

        /* renamed from: b */
        public boolean f50241b;

        public C6987g(MenuItemImpl menuItemImpl) {
            this.f50240a = menuItemImpl;
        }

        /* renamed from: a */
        public MenuItemImpl m44568a() {
            return this.f50240a;
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$h */
    /* loaded from: classes4.dex */
    public class C6988h extends RecyclerViewAccessibilityDelegate {
        public C6988h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(NavigationMenuPresenter.this.f50209f.m44580f(), 1, false));
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$i */
    /* loaded from: classes4.dex */
    public static class C6989i extends AbstractC6992l {
        public C6989i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$j */
    /* loaded from: classes4.dex */
    public static class C6990j extends AbstractC6992l {
        public C6990j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$k */
    /* loaded from: classes4.dex */
    public static class C6991k extends AbstractC6992l {
        public C6991k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$l */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC6992l extends RecyclerView.ViewHolder {
        public AbstractC6992l(View view) {
            super(view);
        }
    }

    public void addHeaderView(@NonNull View view) {
        this.f50205b.addView(view);
        NavigationMenuView navigationMenuView = this.f50204a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: b */
    public final void m44586b() {
        int i;
        if (this.f50205b.getChildCount() == 0 && this.f50227x) {
            i = this.f50229z;
        } else {
            i = 0;
        }
        NavigationMenuView navigationMenuView = this.f50204a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public void dispatchApplyWindowInsets(@NonNull WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.f50229z != systemWindowInsetTop) {
            this.f50229z = systemWindowInsetTop;
            m44586b();
        }
        NavigationMenuView navigationMenuView = this.f50204a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.getSystemWindowInsetBottom());
        ViewCompat.dispatchApplyWindowInsets(this.f50205b, windowInsetsCompat);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Nullable
    public MenuItemImpl getCheckedItem() {
        return this.f50209f.m44581e();
    }

    @InterfaceC2055Px
    public int getDividerInsetEnd() {
        return this.f50223t;
    }

    @InterfaceC2055Px
    public int getDividerInsetStart() {
        return this.f50222s;
    }

    public int getHeaderCount() {
        return this.f50205b.getChildCount();
    }

    public View getHeaderView(int i) {
        return this.f50205b.getChildAt(i);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f50208e;
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f50216m;
    }

    public int getItemHorizontalPadding() {
        return this.f50218o;
    }

    public int getItemIconPadding() {
        return this.f50220q;
    }

    public int getItemMaxLines() {
        return this.f50228y;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f50214k;
    }

    @Nullable
    public ColorStateList getItemTintList() {
        return this.f50215l;
    }

    @InterfaceC2055Px
    public int getItemVerticalPadding() {
        return this.f50219p;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f50204a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f50210g.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.f50204a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C6988h(this.f50204a));
            if (this.f50209f == null) {
                this.f50209f = new C6982c();
            }
            int i = this.f50202B;
            if (i != -1) {
                this.f50204a.setOverScrollMode(i);
            }
            this.f50205b = (LinearLayout) this.f50210g.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.f50204a, false);
            this.f50204a.setAdapter(this.f50209f);
        }
        return this.f50204a;
    }

    @InterfaceC2055Px
    public int getSubheaderInsetEnd() {
        return this.f50225v;
    }

    @InterfaceC2055Px
    public int getSubheaderInsetStart() {
        return this.f50224u;
    }

    public View inflateHeaderView(@LayoutRes int i) {
        View inflate = this.f50210g.inflate(i, (ViewGroup) this.f50205b, false);
        addHeaderView(inflate);
        return inflate;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.f50210g = LayoutInflater.from(context);
        this.f50207d = menuBuilder;
        this.f50201A = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.f50227x;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.f50206c;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(ListMenuPresenter.VIEWS_TAG);
            if (sparseParcelableArray != null) {
                this.f50204a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f50209f.m44575k(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f50205b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.f50204a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f50204a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ListMenuPresenter.VIEWS_TAG, sparseArray);
        }
        C6982c c6982c = this.f50209f;
        if (c6982c != null) {
            bundle.putBundle("android:menu:adapter", c6982c.m44582d());
        }
        if (this.f50205b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f50205b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void removeHeaderView(@NonNull View view) {
        this.f50205b.removeView(view);
        if (this.f50205b.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.f50204a;
            navigationMenuView.setPadding(0, this.f50229z, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void setBehindStatusBar(boolean z) {
        if (this.f50227x != z) {
            this.f50227x = z;
            m44586b();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.f50206c = callback;
    }

    public void setCheckedItem(@NonNull MenuItemImpl menuItemImpl) {
        this.f50209f.m44573m(menuItemImpl);
    }

    public void setDividerInsetEnd(@InterfaceC2055Px int i) {
        this.f50223t = i;
        updateMenuView(false);
    }

    public void setDividerInsetStart(@InterfaceC2055Px int i) {
        this.f50222s = i;
        updateMenuView(false);
    }

    public void setId(int i) {
        this.f50208e = i;
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f50216m = drawable;
        updateMenuView(false);
    }

    public void setItemForeground(@Nullable RippleDrawable rippleDrawable) {
        this.f50217n = rippleDrawable;
        updateMenuView(false);
    }

    public void setItemHorizontalPadding(int i) {
        this.f50218o = i;
        updateMenuView(false);
    }

    public void setItemIconPadding(int i) {
        this.f50220q = i;
        updateMenuView(false);
    }

    public void setItemIconSize(@Dimension int i) {
        if (this.f50221r != i) {
            this.f50221r = i;
            this.f50226w = true;
            updateMenuView(false);
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f50215l = colorStateList;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i) {
        this.f50228y = i;
        updateMenuView(false);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.f50213j = i;
        updateMenuView(false);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f50214k = colorStateList;
        updateMenuView(false);
    }

    public void setItemVerticalPadding(@InterfaceC2055Px int i) {
        this.f50219p = i;
        updateMenuView(false);
    }

    public void setOverScrollMode(int i) {
        this.f50202B = i;
        NavigationMenuView navigationMenuView = this.f50204a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    public void setSubheaderColor(@Nullable ColorStateList colorStateList) {
        this.f50212i = colorStateList;
        updateMenuView(false);
    }

    public void setSubheaderInsetEnd(@InterfaceC2055Px int i) {
        this.f50225v = i;
        updateMenuView(false);
    }

    public void setSubheaderInsetStart(@InterfaceC2055Px int i) {
        this.f50224u = i;
        updateMenuView(false);
    }

    public void setSubheaderTextAppearance(@StyleRes int i) {
        this.f50211h = i;
        updateMenuView(false);
    }

    public void setUpdateSuspended(boolean z) {
        C6982c c6982c = this.f50209f;
        if (c6982c != null) {
            c6982c.m44572n(z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        C6982c c6982c = this.f50209f;
        if (c6982c != null) {
            c6982c.m44571o();
        }
    }
}
