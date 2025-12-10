package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* renamed from: Ua */
/* loaded from: classes.dex */
public abstract class AbstractC1453Ua {

    /* renamed from: a */
    public final Context f6660a;

    /* renamed from: b */
    public SimpleArrayMap f6661b;

    /* renamed from: c */
    public SimpleArrayMap f6662c;

    public AbstractC1453Ua(Context context) {
        this.f6660a = context;
    }

    /* renamed from: a */
    public final MenuItem m66145a(MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
            if (this.f6661b == null) {
                this.f6661b = new SimpleArrayMap();
            }
            MenuItem menuItem2 = (MenuItem) this.f6661b.get(supportMenuItem);
            if (menuItem2 == null) {
                MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f6660a, supportMenuItem);
                this.f6661b.put(supportMenuItem, menuItemWrapperICS);
                return menuItemWrapperICS;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* renamed from: b */
    public final SubMenu m66144b(SubMenu subMenu) {
        if (subMenu instanceof SupportSubMenu) {
            SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
            if (this.f6662c == null) {
                this.f6662c = new SimpleArrayMap();
            }
            SubMenu subMenu2 = (SubMenu) this.f6662c.get(supportSubMenu);
            if (subMenu2 == null) {
                SubMenuC20262hP1 subMenuC20262hP1 = new SubMenuC20262hP1(this.f6660a, supportSubMenu);
                this.f6662c.put(supportSubMenu, subMenuC20262hP1);
                return subMenuC20262hP1;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* renamed from: c */
    public final void m66143c() {
        SimpleArrayMap simpleArrayMap = this.f6661b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap simpleArrayMap2 = this.f6662c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    /* renamed from: d */
    public final void m66142d(int i) {
        if (this.f6661b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f6661b.size()) {
            if (((SupportMenuItem) this.f6661b.keyAt(i2)).getGroupId() == i) {
                this.f6661b.removeAt(i2);
                i2--;
            }
            i2++;
        }
    }

    /* renamed from: e */
    public final void m66141e(int i) {
        if (this.f6661b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f6661b.size(); i2++) {
            if (((SupportMenuItem) this.f6661b.keyAt(i2)).getItemId() == i) {
                this.f6661b.removeAt(i2);
                return;
            }
        }
    }
}