package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionMenuItem implements SupportMenuItem {

    /* renamed from: a */
    public final int f9223a;

    /* renamed from: b */
    public final int f9224b;

    /* renamed from: c */
    public final int f9225c;

    /* renamed from: d */
    public CharSequence f9226d;

    /* renamed from: e */
    public CharSequence f9227e;

    /* renamed from: f */
    public Intent f9228f;

    /* renamed from: g */
    public char f9229g;

    /* renamed from: i */
    public char f9231i;

    /* renamed from: k */
    public Drawable f9233k;

    /* renamed from: l */
    public Context f9234l;

    /* renamed from: m */
    public MenuItem.OnMenuItemClickListener f9235m;

    /* renamed from: n */
    public CharSequence f9236n;

    /* renamed from: o */
    public CharSequence f9237o;

    /* renamed from: h */
    public int f9230h = 4096;

    /* renamed from: j */
    public int f9232j = 4096;

    /* renamed from: p */
    public ColorStateList f9238p = null;

    /* renamed from: q */
    public PorterDuff.Mode f9239q = null;

    /* renamed from: r */
    public boolean f9240r = false;

    /* renamed from: s */
    public boolean f9241s = false;

    /* renamed from: t */
    public int f9242t = 16;

    public ActionMenuItem(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f9234l = context;
        this.f9223a = i2;
        this.f9224b = i;
        this.f9225c = i4;
        this.f9226d = charSequence;
    }

    /* renamed from: a */
    public final void m64467a() {
        Drawable drawable = this.f9233k;
        if (drawable != null) {
            if (this.f9240r || this.f9241s) {
                Drawable wrap = DrawableCompat.wrap(drawable);
                this.f9233k = wrap;
                Drawable mutate = wrap.mutate();
                this.f9233k = mutate;
                if (this.f9240r) {
                    DrawableCompat.setTintList(mutate, this.f9238p);
                }
                if (this.f9241s) {
                    DrawableCompat.setTintMode(this.f9233k, this.f9239q);
                }
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f9232j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f9231i;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f9236n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f9224b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f9233k;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f9238p;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f9239q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f9228f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f9223a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f9230h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f9229g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f9225c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.view.ActionProvider getSupportActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f9226d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9227e;
        if (charSequence == null) {
            return this.f9226d;
        }
        return charSequence;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f9237o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public boolean invoke() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f9235m;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f9228f;
        if (intent != null) {
            this.f9234l.startActivity(intent);
            return true;
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        if ((this.f9242t & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        if ((this.f9242t & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        if ((this.f9242t & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        if ((this.f9242t & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
        return true;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f9231i = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f9242t = (z ? 1 : 0) | (this.f9242t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.f9242t & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f9242t = i | i2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.f9242t & (-17);
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.f9242t = i | i2;
        return this;
    }

    public ActionMenuItem setExclusiveCheckable(boolean z) {
        int i;
        int i2 = this.f9242t & (-5);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.f9242t = i | i2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f9233k = drawable;
        m64467a();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f9238p = colorStateList;
        this.f9240r = true;
        m64467a();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9239q = mode;
        this.f9241s = true;
        m64467a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f9228f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f9229g = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9235m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f9229g = c;
        this.f9231i = Character.toLowerCase(c2);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public SupportMenuItem setSupportActionProvider(androidx.core.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f9226d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9227e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f9242t & 8;
        if (z) {
            i = 0;
        }
        this.f9242t = i2 | i;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f9231i = Character.toLowerCase(c);
        this.f9232j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f9236n = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c, int i) {
        this.f9229g = c;
        this.f9230h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f9226d = this.f9234l.getResources().getString(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f9237o = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f9233k = ContextCompat.getDrawable(this.f9234l, i);
        m64467a();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f9229g = c;
        this.f9230h = KeyEvent.normalizeMetaState(i);
        this.f9231i = Character.toLowerCase(c2);
        this.f9232j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }
}
