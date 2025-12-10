package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class MenuItemImpl implements SupportMenuItem {

    /* renamed from: A */
    public View f9361A;

    /* renamed from: B */
    public ActionProvider f9362B;

    /* renamed from: C */
    public MenuItem.OnActionExpandListener f9363C;

    /* renamed from: E */
    public ContextMenu.ContextMenuInfo f9365E;

    /* renamed from: a */
    public final int f9366a;

    /* renamed from: b */
    public final int f9367b;

    /* renamed from: c */
    public final int f9368c;

    /* renamed from: d */
    public final int f9369d;

    /* renamed from: e */
    public CharSequence f9370e;

    /* renamed from: f */
    public CharSequence f9371f;

    /* renamed from: g */
    public Intent f9372g;

    /* renamed from: h */
    public char f9373h;

    /* renamed from: j */
    public char f9375j;

    /* renamed from: l */
    public Drawable f9377l;

    /* renamed from: n */
    public MenuBuilder f9379n;

    /* renamed from: o */
    public SubMenuBuilder f9380o;

    /* renamed from: p */
    public Runnable f9381p;

    /* renamed from: q */
    public MenuItem.OnMenuItemClickListener f9382q;

    /* renamed from: r */
    public CharSequence f9383r;

    /* renamed from: s */
    public CharSequence f9384s;

    /* renamed from: z */
    public int f9391z;

    /* renamed from: i */
    public int f9374i = 4096;

    /* renamed from: k */
    public int f9376k = 4096;

    /* renamed from: m */
    public int f9378m = 0;

    /* renamed from: t */
    public ColorStateList f9385t = null;

    /* renamed from: u */
    public PorterDuff.Mode f9386u = null;

    /* renamed from: v */
    public boolean f9387v = false;

    /* renamed from: w */
    public boolean f9388w = false;

    /* renamed from: x */
    public boolean f9389x = false;

    /* renamed from: y */
    public int f9390y = 16;

    /* renamed from: D */
    public boolean f9364D = false;

    /* renamed from: androidx.appcompat.view.menu.MenuItemImpl$a */
    /* loaded from: classes.dex */
    public class C2151a implements ActionProvider.VisibilityListener {
        public C2151a() {
            MenuItemImpl.this = r1;
        }

        @Override // androidx.core.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            MenuItemImpl menuItemImpl = MenuItemImpl.this;
            menuItemImpl.f9379n.m64436n(menuItemImpl);
        }
    }

    public MenuItemImpl(MenuBuilder menuBuilder, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f9379n = menuBuilder;
        this.f9366a = i2;
        this.f9367b = i;
        this.f9368c = i3;
        this.f9369d = i4;
        this.f9370e = charSequence;
        this.f9391z = i5;
    }

    /* renamed from: a */
    public static void m64431a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public void actionFormatChanged() {
        this.f9379n.m64437m(this);
    }

    /* renamed from: b */
    public final Drawable m64430b(Drawable drawable) {
        if (drawable != null && this.f9389x && (this.f9387v || this.f9388w)) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (this.f9387v) {
                DrawableCompat.setTintList(drawable, this.f9385t);
            }
            if (this.f9388w) {
                DrawableCompat.setTintMode(drawable, this.f9386u);
            }
            this.f9389x = false;
        }
        return drawable;
    }

    /* renamed from: c */
    public char m64429c() {
        if (this.f9379n.isQwertyMode()) {
            return this.f9375j;
        }
        return this.f9373h;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f9391z & 8) == 0) {
            return false;
        }
        if (this.f9361A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9363C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f9379n.collapseItemActionView(this);
    }

    /* renamed from: d */
    public String m64428d() {
        int i;
        char m64429c = m64429c();
        if (m64429c == 0) {
            return "";
        }
        Resources resources = this.f9379n.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f9379n.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
        }
        if (this.f9379n.isQwertyMode()) {
            i = this.f9376k;
        } else {
            i = this.f9374i;
        }
        m64431a(sb, i, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
        m64431a(sb, i, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
        m64431a(sb, i, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
        m64431a(sb, i, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
        m64431a(sb, i, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
        m64431a(sb, i, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
        if (m64429c != '\b') {
            if (m64429c != '\n') {
                if (m64429c != ' ') {
                    sb.append(m64429c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
            } else {
                sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
            }
        } else {
            sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
        }
        return sb.toString();
    }

    /* renamed from: e */
    public CharSequence m64427e(MenuView.ItemView itemView) {
        if (itemView != null && itemView.prefersCondensedTitle()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        if (!hasCollapsibleActionView()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9363C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f9379n.expandItemActionView(this);
    }

    /* renamed from: f */
    public void m64426f(boolean z) {
        int i;
        int i2 = this.f9390y;
        int i3 = i2 & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = i | i3;
        this.f9390y = i4;
        if (i2 != i4) {
            this.f9379n.onItemsChanged(false);
        }
    }

    /* renamed from: g */
    public void m64425g(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f9365E = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
        View view = this.f9361A;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.f9362B;
        if (actionProvider != null) {
            View onCreateActionView = actionProvider.onCreateActionView(this);
            this.f9361A = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f9376k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f9375j;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f9383r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f9367b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f9377l;
        if (drawable != null) {
            return m64430b(drawable);
        }
        if (this.f9378m != 0) {
            Drawable drawable2 = AppCompatResources.getDrawable(this.f9379n.getContext(), this.f9378m);
            this.f9378m = 0;
            this.f9377l = drawable2;
            return m64430b(drawable2);
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f9385t;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f9386u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f9372g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f9366a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f9365E;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f9374i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f9373h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f9368c;
    }

    public int getOrdering() {
        return this.f9369d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f9380o;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public ActionProvider getSupportActionProvider() {
        return this.f9362B;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f9370e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9371f;
        if (charSequence == null) {
            return this.f9370e;
        }
        return charSequence;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f9384s;
    }

    /* renamed from: h */
    public boolean m64424h(boolean z) {
        int i;
        int i2 = this.f9390y;
        int i3 = i2 & (-9);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f9390y = i4;
        if (i2 == i4) {
            return false;
        }
        return true;
    }

    public boolean hasCollapsibleActionView() {
        ActionProvider actionProvider;
        if ((this.f9391z & 8) == 0) {
            return false;
        }
        if (this.f9361A == null && (actionProvider = this.f9362B) != null) {
            this.f9361A = actionProvider.onCreateActionView(this);
        }
        if (this.f9361A == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        if (this.f9380o != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m64423i() {
        if (this.f9379n.isShortcutsVisible() && m64429c() != 0) {
            return true;
        }
        return false;
    }

    public boolean invoke() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f9382q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        MenuBuilder menuBuilder = this.f9379n;
        if (menuBuilder.mo64418b(menuBuilder, this)) {
            return true;
        }
        Runnable runnable = this.f9381p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f9372g != null) {
            try {
                this.f9379n.getContext().startActivity(this.f9372g);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        ActionProvider actionProvider = this.f9362B;
        if (actionProvider != null && actionProvider.onPerformDefaultAction()) {
            return true;
        }
        return false;
    }

    public boolean isActionButton() {
        if ((this.f9390y & 32) == 32) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f9364D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        if ((this.f9390y & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        if ((this.f9390y & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        if ((this.f9390y & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isExclusiveCheckable() {
        if ((this.f9390y & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        ActionProvider actionProvider = this.f9362B;
        if (actionProvider != null && actionProvider.overridesItemVisibility()) {
            if ((this.f9390y & 8) != 0 || !this.f9362B.isVisible()) {
                return false;
            }
            return true;
        } else if ((this.f9390y & 8) != 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean requestsActionButton() {
        if ((this.f9391z & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
        if ((this.f9391z & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
        if (!requiresActionButton() && !requestsActionButton()) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public void setActionViewExpanded(boolean z) {
        this.f9364D = z;
        this.f9379n.onItemsChanged(false);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f9375j == c) {
            return this;
        }
        this.f9375j = Character.toLowerCase(c);
        this.f9379n.onItemsChanged(false);
        return this;
    }

    public MenuItem setCallback(Runnable runnable) {
        this.f9381p = runnable;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f9390y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f9390y = i2;
        if (i != i2) {
            this.f9379n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f9390y & 4) != 0) {
            this.f9379n.m64434p(this);
        } else {
            m64426f(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f9390y |= 16;
        } else {
            this.f9390y &= -17;
        }
        this.f9379n.onItemsChanged(false);
        return this;
    }

    public void setExclusiveCheckable(boolean z) {
        int i;
        int i2 = this.f9390y & (-5);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.f9390y = i | i2;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f9378m = 0;
        this.f9377l = drawable;
        this.f9389x = true;
        this.f9379n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f9385t = colorStateList;
        this.f9387v = true;
        this.f9389x = true;
        this.f9379n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9386u = mode;
        this.f9388w = true;
        this.f9389x = true;
        this.f9379n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f9372g = intent;
        return this;
    }

    public void setIsActionButton(boolean z) {
        if (z) {
            this.f9390y |= 32;
        } else {
            this.f9390y &= -33;
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f9373h == c) {
            return this;
        }
        this.f9373h = c;
        this.f9379n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9363C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9382q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f9373h = c;
        this.f9375j = Character.toLowerCase(c2);
        this.f9379n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f9391z = i;
        this.f9379n.m64437m(this);
    }

    public void setSubMenu(SubMenuBuilder subMenuBuilder) {
        this.f9380o = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.f9362B;
        if (actionProvider2 != null) {
            actionProvider2.reset();
        }
        this.f9361A = null;
        this.f9362B = actionProvider;
        this.f9379n.onItemsChanged(true);
        ActionProvider actionProvider3 = this.f9362B;
        if (actionProvider3 != null) {
            actionProvider3.setVisibilityListener(new C2151a());
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f9370e = charSequence;
        this.f9379n.onItemsChanged(false);
        SubMenuBuilder subMenuBuilder = this.f9380o;
        if (subMenuBuilder != null) {
            subMenuBuilder.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9371f = charSequence;
        this.f9379n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m64424h(z)) {
            this.f9379n.m64436n(this);
        }
        return this;
    }

    public boolean shouldShowIcon() {
        return this.f9379n.m64440j();
    }

    public boolean showsTextAsAction() {
        if ((this.f9391z & 4) == 4) {
            return true;
        }
        return false;
    }

    public String toString() {
        CharSequence charSequence = this.f9370e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f9383r = charSequence;
        this.f9379n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f9384s = charSequence;
        this.f9379n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setActionView(View view) {
        int i;
        this.f9361A = view;
        this.f9362B = null;
        if (view != null && view.getId() == -1 && (i = this.f9366a) > 0) {
            view.setId(i);
        }
        this.f9379n.m64437m(this);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f9375j == c && this.f9376k == i) {
            return this;
        }
        this.f9375j = Character.toLowerCase(c);
        this.f9376k = KeyEvent.normalizeMetaState(i);
        this.f9379n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f9373h == c && this.f9374i == i) {
            return this;
        }
        this.f9373h = c;
        this.f9374i = KeyEvent.normalizeMetaState(i);
        this.f9379n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f9373h = c;
        this.f9374i = KeyEvent.normalizeMetaState(i);
        this.f9375j = Character.toLowerCase(c2);
        this.f9376k = KeyEvent.normalizeMetaState(i2);
        this.f9379n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f9377l = null;
        this.f9378m = i;
        this.f9389x = true;
        this.f9379n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f9379n.getContext().getString(i));
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setActionView(int i) {
        Context context = this.f9379n.getContext();
        setActionView(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }
}
