package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    /* renamed from: a */
    public final Delegate f8871a;

    /* renamed from: b */
    public final DrawerLayout f8872b;

    /* renamed from: c */
    public DrawerArrowDrawable f8873c;

    /* renamed from: d */
    public boolean f8874d;

    /* renamed from: e */
    public Drawable f8875e;

    /* renamed from: f */
    public boolean f8876f;

    /* renamed from: g */
    public boolean f8877g;

    /* renamed from: h */
    public final int f8878h;

    /* renamed from: i */
    public final int f8879i;

    /* renamed from: j */
    public View.OnClickListener f8880j;

    /* renamed from: k */
    public boolean f8881k;

    /* loaded from: classes.dex */
    public interface Delegate {
        Context getActionBarThemedContext();

        Drawable getThemeUpIndicator();

        boolean isNavigationVisible();

        void setActionBarDescription(@StringRes int i);

        void setActionBarUpIndicator(Drawable drawable, @StringRes int i);
    }

    /* loaded from: classes.dex */
    public interface DelegateProvider {
        @Nullable
        Delegate getDrawerToggleDelegate();
    }

    /* renamed from: androidx.appcompat.app.ActionBarDrawerToggle$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2047a implements View.OnClickListener {
        public View$OnClickListenerC2047a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActionBarDrawerToggle actionBarDrawerToggle = ActionBarDrawerToggle.this;
            if (actionBarDrawerToggle.f8876f) {
                actionBarDrawerToggle.m64688e();
                return;
            }
            View.OnClickListener onClickListener = actionBarDrawerToggle.f8880j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.ActionBarDrawerToggle$b */
    /* loaded from: classes.dex */
    public static class C2048b implements Delegate {

        /* renamed from: a */
        public final Activity f8883a;

        /* renamed from: androidx.appcompat.app.ActionBarDrawerToggle$b$a */
        /* loaded from: classes.dex */
        public static class C2049a {
            @DoNotInline
            /* renamed from: a */
            public static void m64687a(android.app.ActionBar actionBar, int i) {
                actionBar.setHomeActionContentDescription(i);
            }

            @DoNotInline
            /* renamed from: b */
            public static void m64686b(android.app.ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        public C2048b(Activity activity) {
            this.f8883a = activity;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            android.app.ActionBar actionBar = this.f8883a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f8883a;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            TypedArray obtainStyledAttributes = getActionBarThemedContext().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            android.app.ActionBar actionBar = this.f8883a.getActionBar();
            if (actionBar != null && (actionBar.getDisplayOptions() & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            android.app.ActionBar actionBar = this.f8883a.getActionBar();
            if (actionBar != null) {
                C2049a.m64687a(actionBar, i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            android.app.ActionBar actionBar = this.f8883a.getActionBar();
            if (actionBar != null) {
                C2049a.m64686b(actionBar, drawable);
                C2049a.m64687a(actionBar, i);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.ActionBarDrawerToggle$c */
    /* loaded from: classes.dex */
    public static class C2050c implements Delegate {

        /* renamed from: a */
        public final Toolbar f8884a;

        /* renamed from: b */
        public final Drawable f8885b;

        /* renamed from: c */
        public final CharSequence f8886c;

        public C2050c(Toolbar toolbar) {
            this.f8884a = toolbar;
            this.f8885b = toolbar.getNavigationIcon();
            this.f8886c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            return this.f8884a.getContext();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            return this.f8885b;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            return true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            if (i == 0) {
                this.f8884a.setNavigationContentDescription(this.f8886c);
            } else {
                this.f8884a.setNavigationContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            this.f8884a.setNavigationIcon(drawable);
            setActionBarDescription(i);
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, @StringRes int i, @StringRes int i2) {
        this(activity, null, drawerLayout, null, i, i2);
    }

    /* renamed from: a */
    public Drawable m64692a() {
        return this.f8871a.getThemeUpIndicator();
    }

    /* renamed from: b */
    public void m64691b(int i) {
        this.f8871a.setActionBarDescription(i);
    }

    /* renamed from: c */
    public void m64690c(Drawable drawable, int i) {
        if (!this.f8881k && !this.f8871a.isNavigationVisible()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f8881k = true;
        }
        this.f8871a.setActionBarUpIndicator(drawable, i);
    }

    /* renamed from: d */
    public final void m64689d(float f) {
        if (f == 1.0f) {
            this.f8873c.setVerticalMirror(true);
        } else if (f == 0.0f) {
            this.f8873c.setVerticalMirror(false);
        }
        this.f8873c.setProgress(f);
    }

    /* renamed from: e */
    public void m64688e() {
        int drawerLockMode = this.f8872b.getDrawerLockMode(GravityCompat.START);
        if (this.f8872b.isDrawerVisible(GravityCompat.START) && drawerLockMode != 2) {
            this.f8872b.closeDrawer(GravityCompat.START);
        } else if (drawerLockMode != 1) {
            this.f8872b.openDrawer(GravityCompat.START);
        }
    }

    @NonNull
    public DrawerArrowDrawable getDrawerArrowDrawable() {
        return this.f8873c;
    }

    public View.OnClickListener getToolbarNavigationClickListener() {
        return this.f8880j;
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.f8876f;
    }

    public boolean isDrawerSlideAnimationEnabled() {
        return this.f8874d;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f8877g) {
            this.f8875e = m64692a();
        }
        syncState();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(View view) {
        m64689d(0.0f);
        if (this.f8876f) {
            m64691b(this.f8878h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(View view) {
        m64689d(1.0f);
        if (this.f8876f) {
            m64691b(this.f8879i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(View view, float f) {
        if (this.f8874d) {
            m64689d(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m64689d(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.f8876f) {
            m64688e();
            return true;
        }
        return false;
    }

    public void setDrawerArrowDrawable(@NonNull DrawerArrowDrawable drawerArrowDrawable) {
        this.f8873c = drawerArrowDrawable;
        syncState();
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        int i;
        if (z != this.f8876f) {
            if (z) {
                DrawerArrowDrawable drawerArrowDrawable = this.f8873c;
                if (this.f8872b.isDrawerOpen(GravityCompat.START)) {
                    i = this.f8879i;
                } else {
                    i = this.f8878h;
                }
                m64690c(drawerArrowDrawable, i);
            } else {
                m64690c(this.f8875e, 0);
            }
            this.f8876f = z;
        }
    }

    public void setDrawerSlideAnimationEnabled(boolean z) {
        this.f8874d = z;
        if (!z) {
            m64689d(0.0f);
        }
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        if (drawable == null) {
            this.f8875e = m64692a();
            this.f8877g = false;
        } else {
            this.f8875e = drawable;
            this.f8877g = true;
        }
        if (this.f8876f) {
            return;
        }
        m64690c(this.f8875e, 0);
    }

    public void setToolbarNavigationClickListener(View.OnClickListener onClickListener) {
        this.f8880j = onClickListener;
    }

    public void syncState() {
        int i;
        if (this.f8872b.isDrawerOpen(GravityCompat.START)) {
            m64689d(1.0f);
        } else {
            m64689d(0.0f);
        }
        if (this.f8876f) {
            DrawerArrowDrawable drawerArrowDrawable = this.f8873c;
            if (this.f8872b.isDrawerOpen(GravityCompat.START)) {
                i = this.f8879i;
            } else {
                i = this.f8878h;
            }
            m64690c(drawerArrowDrawable, i);
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @StringRes int i, @StringRes int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    public ActionBarDrawerToggle(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, DrawerArrowDrawable drawerArrowDrawable, int i, int i2) {
        this.f8874d = true;
        this.f8876f = true;
        this.f8881k = false;
        if (toolbar != null) {
            this.f8871a = new C2050c(toolbar);
            toolbar.setNavigationOnClickListener(new View$OnClickListenerC2047a());
        } else if (activity instanceof DelegateProvider) {
            this.f8871a = ((DelegateProvider) activity).getDrawerToggleDelegate();
        } else {
            this.f8871a = new C2048b(activity);
        }
        this.f8872b = drawerLayout;
        this.f8878h = i;
        this.f8879i = i2;
        if (drawerArrowDrawable == null) {
            this.f8873c = new DrawerArrowDrawable(this.f8871a.getActionBarThemedContext());
        } else {
            this.f8873c = drawerArrowDrawable;
        }
        this.f8875e = m64692a();
    }

    public void setHomeAsUpIndicator(int i) {
        setHomeAsUpIndicator(i != 0 ? this.f8872b.getResources().getDrawable(i) : null);
    }
}