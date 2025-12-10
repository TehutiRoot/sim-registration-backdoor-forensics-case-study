package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ListMenuPresenter implements MenuPresenter, AdapterView.OnItemClickListener {
    public static final String VIEWS_TAG = "android:menu:list";

    /* renamed from: a */
    public Context f9316a;

    /* renamed from: b */
    public LayoutInflater f9317b;

    /* renamed from: c */
    public MenuBuilder f9318c;

    /* renamed from: d */
    public ExpandedMenuView f9319d;

    /* renamed from: e */
    public int f9320e;

    /* renamed from: f */
    public int f9321f;

    /* renamed from: g */
    public int f9322g;

    /* renamed from: h */
    public MenuPresenter.Callback f9323h;

    /* renamed from: i */
    public C2150a f9324i;

    /* renamed from: j */
    public int f9325j;

    /* renamed from: androidx.appcompat.view.menu.ListMenuPresenter$a */
    /* loaded from: classes.dex */
    public class C2150a extends BaseAdapter {

        /* renamed from: a */
        public int f9326a = -1;

        public C2150a() {
            m64451a();
        }

        /* renamed from: a */
        public void m64451a() {
            MenuItemImpl expandedItem = ListMenuPresenter.this.f9318c.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<MenuItemImpl> nonActionItems = ListMenuPresenter.this.f9318c.getNonActionItems();
                int size = nonActionItems.size();
                for (int i = 0; i < size; i++) {
                    if (nonActionItems.get(i) == expandedItem) {
                        this.f9326a = i;
                        return;
                    }
                }
            }
            this.f9326a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public MenuItemImpl getItem(int i) {
            ArrayList<MenuItemImpl> nonActionItems = ListMenuPresenter.this.f9318c.getNonActionItems();
            int i2 = i + ListMenuPresenter.this.f9320e;
            int i3 = this.f9326a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return nonActionItems.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = ListMenuPresenter.this.f9318c.getNonActionItems().size() - ListMenuPresenter.this.f9320e;
            if (this.f9326a < 0) {
                return size;
            }
            return size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
                view = listMenuPresenter.f9317b.inflate(listMenuPresenter.f9322g, viewGroup, false);
            }
            ((MenuView.ItemView) view).initialize(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m64451a();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(Context context, int i) {
        this(i, 0);
        this.f9316a = context;
        this.f9317b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    public ListAdapter getAdapter() {
        if (this.f9324i == null) {
            this.f9324i = new C2150a();
        }
        return this.f9324i;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f9325j;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f9319d == null) {
            this.f9319d = (ExpandedMenuView) this.f9317b.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f9324i == null) {
                this.f9324i = new C2150a();
            }
            this.f9319d.setAdapter((ListAdapter) this.f9324i);
            this.f9319d.setOnItemClickListener(this);
        }
        return this.f9319d;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        if (this.f9321f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f9321f);
            this.f9316a = contextThemeWrapper;
            this.f9317b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f9316a != null) {
            this.f9316a = context;
            if (this.f9317b == null) {
                this.f9317b = LayoutInflater.from(context);
            }
        }
        this.f9318c = menuBuilder;
        C2150a c2150a = this.f9324i;
        if (c2150a != null) {
            c2150a.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.f9323h;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f9318c.performItemAction(this.f9324i.getItem(i), this, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        restoreHierarchyState((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable onSaveInstanceState() {
        if (this.f9319d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        saveHierarchyState(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        new DialogInterface$OnKeyListenerC2159a(subMenuBuilder).m64416b(null);
        MenuPresenter.Callback callback = this.f9323h;
        if (callback != null) {
            callback.onOpenSubMenu(subMenuBuilder);
            return true;
        }
        return true;
    }

    public void restoreHierarchyState(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(VIEWS_TAG);
        if (sparseParcelableArray != null) {
            this.f9319d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void saveHierarchyState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f9319d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(VIEWS_TAG, sparseArray);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.f9323h = callback;
    }

    public void setId(int i) {
        this.f9325j = i;
    }

    public void setItemIndexOffset(int i) {
        this.f9320e = i;
        if (this.f9319d != null) {
            updateMenuView(false);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        C2150a c2150a = this.f9324i;
        if (c2150a != null) {
            c2150a.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(int i, int i2) {
        this.f9322g = i;
        this.f9321f = i2;
    }
}
