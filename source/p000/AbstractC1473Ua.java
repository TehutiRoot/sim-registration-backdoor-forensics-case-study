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
public abstract class AbstractC1473Ua {

    /* renamed from: a */
    public final Context f6364a;

    /* renamed from: b */
    public SimpleArrayMap f6365b;

    /* renamed from: c */
    public SimpleArrayMap f6366c;

    public AbstractC1473Ua(Context context) {
        this.f6364a = context;
    }

    /* renamed from: a */
    public final MenuItem m66023a(MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
            if (this.f6365b == null) {
                this.f6365b = new SimpleArrayMap();
            }
            MenuItem menuItem2 = (MenuItem) this.f6365b.get(supportMenuItem);
            if (menuItem2 == null) {
                MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f6364a, supportMenuItem);
                this.f6365b.put(supportMenuItem, menuItemWrapperICS);
                return menuItemWrapperICS;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* renamed from: b */
    public final SubMenu m66022b(SubMenu subMenu) {
        if (subMenu instanceof SupportSubMenu) {
            SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
            if (this.f6366c == null) {
                this.f6366c = new SimpleArrayMap();
            }
            SubMenu subMenu2 = (SubMenu) this.f6366c.get(supportSubMenu);
            if (subMenu2 == null) {
                SubMenuC20722kO1 subMenuC20722kO1 = new SubMenuC20722kO1(this.f6364a, supportSubMenu);
                this.f6366c.put(supportSubMenu, subMenuC20722kO1);
                return subMenuC20722kO1;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* renamed from: c */
    public final void m66021c() {
        SimpleArrayMap simpleArrayMap = this.f6365b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap simpleArrayMap2 = this.f6366c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    /* renamed from: d */
    public final void m66020d(int i) {
        if (this.f6365b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f6365b.size()) {
            if (((SupportMenuItem) this.f6365b.keyAt(i2)).getGroupId() == i) {
                this.f6365b.removeAt(i2);
                i2--;
            }
            i2++;
        }
    }

    /* renamed from: e */
    public final void m66019e(int i) {
        if (this.f6365b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f6365b.size(); i2++) {
            if (((SupportMenuItem) this.f6365b.keyAt(i2)).getItemId() == i) {
                this.f6365b.removeAt(i2);
                return;
            }
        }
    }
}
