package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MenuItemWrapperICS extends AbstractC1473Ua implements MenuItem {

    /* renamed from: d */
    public final SupportMenuItem f9393d;

    /* renamed from: e */
    public Method f9394e;

    /* renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$a */
    /* loaded from: classes.dex */
    public class C2152a extends ActionProvider {

        /* renamed from: d */
        public final android.view.ActionProvider f9395d;

        public C2152a(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.f9395d = actionProvider;
        }

        @Override // androidx.core.view.ActionProvider
        public boolean hasSubMenu() {
            return this.f9395d.hasSubMenu();
        }

        @Override // androidx.core.view.ActionProvider
        public View onCreateActionView() {
            return this.f9395d.onCreateActionView();
        }

        @Override // androidx.core.view.ActionProvider
        public boolean onPerformDefaultAction() {
            return this.f9395d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.ActionProvider
        public void onPrepareSubMenu(SubMenu subMenu) {
            this.f9395d.onPrepareSubMenu(MenuItemWrapperICS.this.m66022b(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$b */
    /* loaded from: classes.dex */
    public class ActionProvider$VisibilityListenerC2153b extends C2152a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        public ActionProvider.VisibilityListener f9397f;

        public ActionProvider$VisibilityListenerC2153b(Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.ActionProvider
        public boolean isVisible() {
            return this.f9395d.isVisible();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            ActionProvider.VisibilityListener visibilityListener = this.f9397f;
            if (visibilityListener != null) {
                visibilityListener.onActionProviderVisibilityChanged(z);
            }
        }

        @Override // androidx.core.view.ActionProvider
        public View onCreateActionView(MenuItem menuItem) {
            return this.f9395d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.ActionProvider
        public boolean overridesItemVisibility() {
            return this.f9395d.overridesItemVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public void refreshVisibility() {
            this.f9395d.refreshVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
            ActionProvider$VisibilityListenerC2153b actionProvider$VisibilityListenerC2153b;
            this.f9397f = visibilityListener;
            android.view.ActionProvider actionProvider = this.f9395d;
            if (visibilityListener != null) {
                actionProvider$VisibilityListenerC2153b = this;
            } else {
                actionProvider$VisibilityListenerC2153b = null;
            }
            actionProvider.setVisibilityListener(actionProvider$VisibilityListenerC2153b);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$c */
    /* loaded from: classes.dex */
    public static class C2154c extends FrameLayout implements CollapsibleActionView {

        /* renamed from: a */
        public final android.view.CollapsibleActionView f9399a;

        public C2154c(View view) {
            super(view.getContext());
            this.f9399a = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public View m64422a() {
            return (View) this.f9399a;
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewCollapsed() {
            this.f9399a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewExpanded() {
            this.f9399a.onActionViewExpanded();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$d */
    /* loaded from: classes.dex */
    public class MenuItem$OnActionExpandListenerC2155d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f9400a;

        public MenuItem$OnActionExpandListenerC2155d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f9400a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f9400a.onMenuItemActionCollapse(MenuItemWrapperICS.this.m66023a(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f9400a.onMenuItemActionExpand(MenuItemWrapperICS.this.m66023a(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$e */
    /* loaded from: classes.dex */
    public class MenuItem$OnMenuItemClickListenerC2156e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f9402a;

        public MenuItem$OnMenuItemClickListenerC2156e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f9402a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f9402a.onMenuItemClick(MenuItemWrapperICS.this.m66023a(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem != null) {
            this.f9393d = supportMenuItem;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f9393d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f9393d.expandActionView();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        androidx.core.view.ActionProvider supportActionProvider = this.f9393d.getSupportActionProvider();
        if (supportActionProvider instanceof C2152a) {
            return ((C2152a) supportActionProvider).f9395d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f9393d.getActionView();
        if (actionView instanceof C2154c) {
            return ((C2154c) actionView).m64422a();
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f9393d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f9393d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f9393d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f9393d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f9393d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f9393d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f9393d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f9393d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f9393d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f9393d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f9393d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f9393d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f9393d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m66022b(this.f9393d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f9393d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f9393d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f9393d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f9393d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f9393d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f9393d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f9393d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f9393d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f9393d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        ActionProvider$VisibilityListenerC2153b actionProvider$VisibilityListenerC2153b = new ActionProvider$VisibilityListenerC2153b(this.f6364a, actionProvider);
        SupportMenuItem supportMenuItem = this.f9393d;
        if (actionProvider == null) {
            actionProvider$VisibilityListenerC2153b = null;
        }
        supportMenuItem.setSupportActionProvider(actionProvider$VisibilityListenerC2153b);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new C2154c(view);
        }
        this.f9393d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f9393d.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f9393d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f9393d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f9393d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f9393d.setEnabled(z);
        return this;
    }

    public void setExclusiveCheckable(boolean z) {
        try {
            if (this.f9394e == null) {
                this.f9394e = this.f9393d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f9394e.invoke(this.f9393d, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f9393d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9393d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9393d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f9393d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f9393d.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        MenuItem$OnActionExpandListenerC2155d menuItem$OnActionExpandListenerC2155d;
        SupportMenuItem supportMenuItem = this.f9393d;
        if (onActionExpandListener != null) {
            menuItem$OnActionExpandListenerC2155d = new MenuItem$OnActionExpandListenerC2155d(onActionExpandListener);
        } else {
            menuItem$OnActionExpandListenerC2155d = null;
        }
        supportMenuItem.setOnActionExpandListener(menuItem$OnActionExpandListenerC2155d);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MenuItem$OnMenuItemClickListenerC2156e menuItem$OnMenuItemClickListenerC2156e;
        SupportMenuItem supportMenuItem = this.f9393d;
        if (onMenuItemClickListener != null) {
            menuItem$OnMenuItemClickListenerC2156e = new MenuItem$OnMenuItemClickListenerC2156e(onMenuItemClickListener);
        } else {
            menuItem$OnMenuItemClickListenerC2156e = null;
        }
        supportMenuItem.setOnMenuItemClickListener(menuItem$OnMenuItemClickListenerC2156e);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f9393d.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f9393d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f9393d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f9393d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9393d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f9393d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f9393d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f9393d.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f9393d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f9393d.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f9393d.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f9393d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f9393d.setActionView(i);
        View actionView = this.f9393d.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            this.f9393d.setActionView(new C2154c(actionView));
        }
        return this;
    }
}
