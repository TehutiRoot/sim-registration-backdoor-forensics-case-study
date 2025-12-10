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
import androidx.annotation.InterfaceC2037Px;
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
    public int f50213A;

    /* renamed from: a */
    public NavigationMenuView f50216a;

    /* renamed from: b */
    public LinearLayout f50217b;

    /* renamed from: c */
    public MenuPresenter.Callback f50218c;

    /* renamed from: d */
    public MenuBuilder f50219d;

    /* renamed from: e */
    public int f50220e;

    /* renamed from: f */
    public C6971c f50221f;

    /* renamed from: g */
    public LayoutInflater f50222g;

    /* renamed from: i */
    public ColorStateList f50224i;

    /* renamed from: k */
    public ColorStateList f50226k;

    /* renamed from: l */
    public ColorStateList f50227l;

    /* renamed from: m */
    public Drawable f50228m;

    /* renamed from: n */
    public RippleDrawable f50229n;

    /* renamed from: o */
    public int f50230o;

    /* renamed from: p */
    public int f50231p;

    /* renamed from: q */
    public int f50232q;

    /* renamed from: r */
    public int f50233r;

    /* renamed from: s */
    public int f50234s;

    /* renamed from: t */
    public int f50235t;

    /* renamed from: u */
    public int f50236u;

    /* renamed from: v */
    public int f50237v;

    /* renamed from: w */
    public boolean f50238w;

    /* renamed from: y */
    public int f50240y;

    /* renamed from: z */
    public int f50241z;

    /* renamed from: h */
    public int f50223h = 0;

    /* renamed from: j */
    public int f50225j = 0;

    /* renamed from: x */
    public boolean f50239x = true;

    /* renamed from: B */
    public int f50214B = -1;

    /* renamed from: C */
    public final View.OnClickListener f50215C = new View$OnClickListenerC6969a();

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$a */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6969a implements View.OnClickListener {
        public View$OnClickListenerC6969a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean performItemAction = navigationMenuPresenter.f50219d.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && performItemAction) {
                NavigationMenuPresenter.this.f50221f.m44560m(itemData);
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
    public static class C6970b extends AbstractC6981l {
        public C6970b(View view) {
            super(view);
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$c */
    /* loaded from: classes4.dex */
    public class C6971c extends RecyclerView.Adapter {

        /* renamed from: a */
        public final ArrayList f50243a = new ArrayList();

        /* renamed from: b */
        public MenuItemImpl f50244b;

        /* renamed from: c */
        public boolean f50245c;

        /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$c$a */
        /* loaded from: classes4.dex */
        public class C6972a extends AccessibilityDelegateCompat {

            /* renamed from: d */
            public final /* synthetic */ int f50247d;

            /* renamed from: e */
            public final /* synthetic */ boolean f50248e;

            public C6972a(int i, boolean z) {
                this.f50247d = i;
                this.f50248e = z;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(C6971c.this.m44571b(this.f50247d), 1, 1, 1, this.f50248e, view.isSelected()));
            }
        }

        public C6971c() {
            m44563j();
        }

        /* renamed from: b */
        public final int m44571b(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (NavigationMenuPresenter.this.f50221f.getItemViewType(i3) == 2) {
                    i2--;
                }
            }
            if (NavigationMenuPresenter.this.f50217b.getChildCount() == 0) {
                return i2 - 1;
            }
            return i2;
        }

        /* renamed from: c */
        public final void m44570c(int i, int i2) {
            while (i < i2) {
                ((C6976g) this.f50243a.get(i)).f50253b = true;
                i++;
            }
        }

        /* renamed from: d */
        public Bundle m44569d() {
            View view;
            Bundle bundle = new Bundle();
            MenuItemImpl menuItemImpl = this.f50244b;
            if (menuItemImpl != null) {
                bundle.putInt("android:menu:checked", menuItemImpl.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f50243a.size();
            for (int i = 0; i < size; i++) {
                InterfaceC6974e interfaceC6974e = (InterfaceC6974e) this.f50243a.get(i);
                if (interfaceC6974e instanceof C6976g) {
                    MenuItemImpl m44555a = ((C6976g) interfaceC6974e).m44555a();
                    if (m44555a != null) {
                        view = m44555a.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(m44555a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: e */
        public MenuItemImpl m44568e() {
            return this.f50244b;
        }

        /* renamed from: f */
        public int m44567f() {
            int i;
            if (NavigationMenuPresenter.this.f50217b.getChildCount() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            for (int i2 = 0; i2 < NavigationMenuPresenter.this.f50221f.getItemCount(); i2++) {
                int itemViewType = NavigationMenuPresenter.this.f50221f.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1) {
                    i++;
                }
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: g */
        public void onBindViewHolder(AbstractC6981l abstractC6981l, int i) {
            Drawable drawable;
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        if (itemViewType == 3) {
                            m44561l(abstractC6981l.itemView, i, true);
                            return;
                        }
                        return;
                    }
                    C6975f c6975f = (C6975f) this.f50243a.get(i);
                    abstractC6981l.itemView.setPadding(NavigationMenuPresenter.this.f50234s, c6975f.m44556b(), NavigationMenuPresenter.this.f50235t, c6975f.m44557a());
                    return;
                }
                TextView textView = (TextView) abstractC6981l.itemView;
                textView.setText(((C6976g) this.f50243a.get(i)).m44555a().getTitle());
                int i2 = NavigationMenuPresenter.this.f50223h;
                if (i2 != 0) {
                    TextViewCompat.setTextAppearance(textView, i2);
                }
                textView.setPadding(NavigationMenuPresenter.this.f50236u, textView.getPaddingTop(), NavigationMenuPresenter.this.f50237v, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.f50224i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                m44561l(textView, i, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC6981l.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.f50227l);
            int i3 = NavigationMenuPresenter.this.f50225j;
            if (i3 != 0) {
                navigationMenuItemView.setTextAppearance(i3);
            }
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.f50226k;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable2 = NavigationMenuPresenter.this.f50228m;
            if (drawable2 != null) {
                drawable = drawable2.getConstantState().newDrawable();
            } else {
                drawable = null;
            }
            ViewCompat.setBackground(navigationMenuItemView, drawable);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.f50229n;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            C6976g c6976g = (C6976g) this.f50243a.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(c6976g.f50253b);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i4 = navigationMenuPresenter.f50230o;
            int i5 = navigationMenuPresenter.f50231p;
            navigationMenuItemView.setPadding(i4, i5, i4, i5);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.f50232q);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.f50238w) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.f50233r);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.f50240y);
            navigationMenuItemView.initialize(c6976g.m44555a(), 0);
            m44561l(navigationMenuItemView, i, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f50243a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            InterfaceC6974e interfaceC6974e = (InterfaceC6974e) this.f50243a.get(i);
            if (interfaceC6974e instanceof C6975f) {
                return 2;
            }
            if (interfaceC6974e instanceof C6973d) {
                return 3;
            }
            if (interfaceC6974e instanceof C6976g) {
                if (((C6976g) interfaceC6974e).m44555a().hasSubMenu()) {
                    return 1;
                }
                return 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: h */
        public AbstractC6981l onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return new C6970b(NavigationMenuPresenter.this.f50217b);
                    }
                    return new C6979j(NavigationMenuPresenter.this.f50222g, viewGroup);
                }
                return new C6980k(NavigationMenuPresenter.this.f50222g, viewGroup);
            }
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            return new C6978i(navigationMenuPresenter.f50222g, viewGroup, navigationMenuPresenter.f50215C);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: i */
        public void onViewRecycled(AbstractC6981l abstractC6981l) {
            if (abstractC6981l instanceof C6978i) {
                ((NavigationMenuItemView) abstractC6981l.itemView).recycle();
            }
        }

        /* renamed from: j */
        public final void m44563j() {
            if (this.f50245c) {
                return;
            }
            this.f50245c = true;
            this.f50243a.clear();
            this.f50243a.add(new C6973d());
            int size = NavigationMenuPresenter.this.f50219d.getVisibleItems().size();
            int i = -1;
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = NavigationMenuPresenter.this.f50219d.getVisibleItems().get(i3);
                if (menuItemImpl.isChecked()) {
                    m44560m(menuItemImpl);
                }
                if (menuItemImpl.isCheckable()) {
                    menuItemImpl.setExclusiveCheckable(false);
                }
                if (menuItemImpl.hasSubMenu()) {
                    SubMenu subMenu = menuItemImpl.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.f50243a.add(new C6975f(NavigationMenuPresenter.this.f50213A, 0));
                        }
                        this.f50243a.add(new C6976g(menuItemImpl));
                        int size2 = this.f50243a.size();
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
                                    m44560m(menuItemImpl);
                                }
                                this.f50243a.add(new C6976g(menuItemImpl2));
                            }
                        }
                        if (z2) {
                            m44570c(size2, this.f50243a.size());
                        }
                    }
                } else {
                    int groupId = menuItemImpl.getGroupId();
                    if (groupId != i) {
                        i2 = this.f50243a.size();
                        if (menuItemImpl.getIcon() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i3 != 0) {
                            i2++;
                            ArrayList arrayList = this.f50243a;
                            int i5 = NavigationMenuPresenter.this.f50213A;
                            arrayList.add(new C6975f(i5, i5));
                        }
                    } else if (!z && menuItemImpl.getIcon() != null) {
                        m44570c(i2, this.f50243a.size());
                        z = true;
                    }
                    C6976g c6976g = new C6976g(menuItemImpl);
                    c6976g.f50253b = z;
                    this.f50243a.add(c6976g);
                    i = groupId;
                }
            }
            this.f50245c = false;
        }

        /* renamed from: k */
        public void m44562k(Bundle bundle) {
            MenuItemImpl m44555a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            MenuItemImpl m44555a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f50245c = true;
                int size = this.f50243a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    InterfaceC6974e interfaceC6974e = (InterfaceC6974e) this.f50243a.get(i2);
                    if ((interfaceC6974e instanceof C6976g) && (m44555a2 = ((C6976g) interfaceC6974e).m44555a()) != null && m44555a2.getItemId() == i) {
                        m44560m(m44555a2);
                        break;
                    }
                    i2++;
                }
                this.f50245c = false;
                m44563j();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f50243a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    InterfaceC6974e interfaceC6974e2 = (InterfaceC6974e) this.f50243a.get(i3);
                    if ((interfaceC6974e2 instanceof C6976g) && (m44555a = ((C6976g) interfaceC6974e2).m44555a()) != null && (actionView = m44555a.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(m44555a.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: l */
        public final void m44561l(View view, int i, boolean z) {
            ViewCompat.setAccessibilityDelegate(view, new C6972a(i, z));
        }

        /* renamed from: m */
        public void m44560m(MenuItemImpl menuItemImpl) {
            if (this.f50244b != menuItemImpl && menuItemImpl.isCheckable()) {
                MenuItemImpl menuItemImpl2 = this.f50244b;
                if (menuItemImpl2 != null) {
                    menuItemImpl2.setChecked(false);
                }
                this.f50244b = menuItemImpl;
                menuItemImpl.setChecked(true);
            }
        }

        /* renamed from: n */
        public void m44559n(boolean z) {
            this.f50245c = z;
        }

        /* renamed from: o */
        public void m44558o() {
            m44563j();
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$d */
    /* loaded from: classes4.dex */
    public static class C6973d implements InterfaceC6974e {
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$e */
    /* loaded from: classes4.dex */
    public interface InterfaceC6974e {
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$f */
    /* loaded from: classes4.dex */
    public static class C6975f implements InterfaceC6974e {

        /* renamed from: a */
        public final int f50250a;

        /* renamed from: b */
        public final int f50251b;

        public C6975f(int i, int i2) {
            this.f50250a = i;
            this.f50251b = i2;
        }

        /* renamed from: a */
        public int m44557a() {
            return this.f50251b;
        }

        /* renamed from: b */
        public int m44556b() {
            return this.f50250a;
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$g */
    /* loaded from: classes4.dex */
    public static class C6976g implements InterfaceC6974e {

        /* renamed from: a */
        public final MenuItemImpl f50252a;

        /* renamed from: b */
        public boolean f50253b;

        public C6976g(MenuItemImpl menuItemImpl) {
            this.f50252a = menuItemImpl;
        }

        /* renamed from: a */
        public MenuItemImpl m44555a() {
            return this.f50252a;
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$h */
    /* loaded from: classes4.dex */
    public class C6977h extends RecyclerViewAccessibilityDelegate {
        public C6977h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(NavigationMenuPresenter.this.f50221f.m44567f(), 1, false));
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$i */
    /* loaded from: classes4.dex */
    public static class C6978i extends AbstractC6981l {
        public C6978i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$j */
    /* loaded from: classes4.dex */
    public static class C6979j extends AbstractC6981l {
        public C6979j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$k */
    /* loaded from: classes4.dex */
    public static class C6980k extends AbstractC6981l {
        public C6980k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$l */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC6981l extends RecyclerView.ViewHolder {
        public AbstractC6981l(View view) {
            super(view);
        }
    }

    public void addHeaderView(@NonNull View view) {
        this.f50217b.addView(view);
        NavigationMenuView navigationMenuView = this.f50216a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: b */
    public final void m44573b() {
        int i;
        if (this.f50217b.getChildCount() == 0 && this.f50239x) {
            i = this.f50241z;
        } else {
            i = 0;
        }
        NavigationMenuView navigationMenuView = this.f50216a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public void dispatchApplyWindowInsets(@NonNull WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.f50241z != systemWindowInsetTop) {
            this.f50241z = systemWindowInsetTop;
            m44573b();
        }
        NavigationMenuView navigationMenuView = this.f50216a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.getSystemWindowInsetBottom());
        ViewCompat.dispatchApplyWindowInsets(this.f50217b, windowInsetsCompat);
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
        return this.f50221f.m44568e();
    }

    @InterfaceC2037Px
    public int getDividerInsetEnd() {
        return this.f50235t;
    }

    @InterfaceC2037Px
    public int getDividerInsetStart() {
        return this.f50234s;
    }

    public int getHeaderCount() {
        return this.f50217b.getChildCount();
    }

    public View getHeaderView(int i) {
        return this.f50217b.getChildAt(i);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f50220e;
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f50228m;
    }

    public int getItemHorizontalPadding() {
        return this.f50230o;
    }

    public int getItemIconPadding() {
        return this.f50232q;
    }

    public int getItemMaxLines() {
        return this.f50240y;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f50226k;
    }

    @Nullable
    public ColorStateList getItemTintList() {
        return this.f50227l;
    }

    @InterfaceC2037Px
    public int getItemVerticalPadding() {
        return this.f50231p;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f50216a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f50222g.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.f50216a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C6977h(this.f50216a));
            if (this.f50221f == null) {
                this.f50221f = new C6971c();
            }
            int i = this.f50214B;
            if (i != -1) {
                this.f50216a.setOverScrollMode(i);
            }
            this.f50217b = (LinearLayout) this.f50222g.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.f50216a, false);
            this.f50216a.setAdapter(this.f50221f);
        }
        return this.f50216a;
    }

    @InterfaceC2037Px
    public int getSubheaderInsetEnd() {
        return this.f50237v;
    }

    @InterfaceC2037Px
    public int getSubheaderInsetStart() {
        return this.f50236u;
    }

    public View inflateHeaderView(@LayoutRes int i) {
        View inflate = this.f50222g.inflate(i, (ViewGroup) this.f50217b, false);
        addHeaderView(inflate);
        return inflate;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.f50222g = LayoutInflater.from(context);
        this.f50219d = menuBuilder;
        this.f50213A = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.f50239x;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.f50218c;
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
                this.f50216a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f50221f.m44562k(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f50217b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.f50216a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f50216a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ListMenuPresenter.VIEWS_TAG, sparseArray);
        }
        C6971c c6971c = this.f50221f;
        if (c6971c != null) {
            bundle.putBundle("android:menu:adapter", c6971c.m44569d());
        }
        if (this.f50217b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f50217b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void removeHeaderView(@NonNull View view) {
        this.f50217b.removeView(view);
        if (this.f50217b.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.f50216a;
            navigationMenuView.setPadding(0, this.f50241z, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void setBehindStatusBar(boolean z) {
        if (this.f50239x != z) {
            this.f50239x = z;
            m44573b();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.f50218c = callback;
    }

    public void setCheckedItem(@NonNull MenuItemImpl menuItemImpl) {
        this.f50221f.m44560m(menuItemImpl);
    }

    public void setDividerInsetEnd(@InterfaceC2037Px int i) {
        this.f50235t = i;
        updateMenuView(false);
    }

    public void setDividerInsetStart(@InterfaceC2037Px int i) {
        this.f50234s = i;
        updateMenuView(false);
    }

    public void setId(int i) {
        this.f50220e = i;
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f50228m = drawable;
        updateMenuView(false);
    }

    public void setItemForeground(@Nullable RippleDrawable rippleDrawable) {
        this.f50229n = rippleDrawable;
        updateMenuView(false);
    }

    public void setItemHorizontalPadding(int i) {
        this.f50230o = i;
        updateMenuView(false);
    }

    public void setItemIconPadding(int i) {
        this.f50232q = i;
        updateMenuView(false);
    }

    public void setItemIconSize(@Dimension int i) {
        if (this.f50233r != i) {
            this.f50233r = i;
            this.f50238w = true;
            updateMenuView(false);
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f50227l = colorStateList;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i) {
        this.f50240y = i;
        updateMenuView(false);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.f50225j = i;
        updateMenuView(false);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f50226k = colorStateList;
        updateMenuView(false);
    }

    public void setItemVerticalPadding(@InterfaceC2037Px int i) {
        this.f50231p = i;
        updateMenuView(false);
    }

    public void setOverScrollMode(int i) {
        this.f50214B = i;
        NavigationMenuView navigationMenuView = this.f50216a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    public void setSubheaderColor(@Nullable ColorStateList colorStateList) {
        this.f50224i = colorStateList;
        updateMenuView(false);
    }

    public void setSubheaderInsetEnd(@InterfaceC2037Px int i) {
        this.f50237v = i;
        updateMenuView(false);
    }

    public void setSubheaderInsetStart(@InterfaceC2037Px int i) {
        this.f50236u = i;
        updateMenuView(false);
    }

    public void setSubheaderTextAppearance(@StyleRes int i) {
        this.f50223h = i;
        updateMenuView(false);
    }

    public void setUpdateSuspended(boolean z) {
        C6971c c6971c = this.f50221f;
        if (c6971c != null) {
            c6971c.m44559n(z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        C6971c c6971c = this.f50221f;
        if (c6971c != null) {
            c6971c.m44558o();
        }
    }
}