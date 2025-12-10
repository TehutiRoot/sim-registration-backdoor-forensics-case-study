package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.core.internal.view.SupportSubMenu;

/* renamed from: kO1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class SubMenuC20722kO1 extends MenuWrapperICS implements SubMenu {

    /* renamed from: e */
    public final SupportSubMenu f67907e;

    public SubMenuC20722kO1(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.f67907e = supportSubMenu;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f67907e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m66023a(this.f67907e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f67907e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f67907e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f67907e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f67907e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f67907e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f67907e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f67907e.setIcon(drawable);
        return this;
    }
}
