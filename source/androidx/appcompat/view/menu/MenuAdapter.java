package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MenuAdapter extends BaseAdapter {

    /* renamed from: a */
    public MenuBuilder f9328a;

    /* renamed from: b */
    public int f9329b = -1;

    /* renamed from: c */
    public boolean f9330c;

    /* renamed from: d */
    public final boolean f9331d;

    /* renamed from: e */
    public final LayoutInflater f9332e;

    /* renamed from: f */
    public final int f9333f;

    public MenuAdapter(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z, int i) {
        this.f9331d = z;
        this.f9332e = layoutInflater;
        this.f9328a = menuBuilder;
        this.f9333f = i;
        m64449a();
    }

    /* renamed from: a */
    public void m64449a() {
        MenuItemImpl expandedItem = this.f9328a.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<MenuItemImpl> nonActionItems = this.f9328a.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (nonActionItems.get(i) == expandedItem) {
                    this.f9329b = i;
                    return;
                }
            }
        }
        this.f9329b = -1;
    }

    public MenuBuilder getAdapterMenu() {
        return this.f9328a;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<MenuItemImpl> visibleItems;
        if (this.f9331d) {
            visibleItems = this.f9328a.getNonActionItems();
        } else {
            visibleItems = this.f9328a.getVisibleItems();
        }
        if (this.f9329b < 0) {
            return visibleItems.size();
        }
        return visibleItems.size() - 1;
    }

    public boolean getForceShowIcon() {
        return this.f9330c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        if (view == null) {
            view = this.f9332e.inflate(this.f9333f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            i2 = getItem(i3).getGroupId();
        } else {
            i2 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f9328a.isGroupDividerEnabled() && groupId != i2) {
            z = true;
        } else {
            z = false;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.f9330c) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.initialize(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m64449a();
        super.notifyDataSetChanged();
    }

    public void setForceShowIcon(boolean z) {
        this.f9330c = z;
    }

    @Override // android.widget.Adapter
    public MenuItemImpl getItem(int i) {
        ArrayList<MenuItemImpl> nonActionItems = this.f9331d ? this.f9328a.getNonActionItems() : this.f9328a.getVisibleItems();
        int i2 = this.f9329b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return nonActionItems.get(i);
    }
}
