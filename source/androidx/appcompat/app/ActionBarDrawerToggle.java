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
    public final Delegate f8783a;

    /* renamed from: b */
    public final DrawerLayout f8784b;

    /* renamed from: c */
    public DrawerArrowDrawable f8785c;

    /* renamed from: d */
    public boolean f8786d;

    /* renamed from: e */
    public Drawable f8787e;

    /* renamed from: f */
    public boolean f8788f;

    /* renamed from: g */
    public boolean f8789g;

    /* renamed from: h */
    public final int f8790h;

    /* renamed from: i */
    public final int f8791i;

    /* renamed from: j */
    public View.OnClickListener f8792j;

    /* renamed from: k */
    public boolean f8793k;

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
    public class View$OnClickListenerC2065a implements View.OnClickListener {
        public View$OnClickListenerC2065a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActionBarDrawerToggle actionBarDrawerToggle = ActionBarDrawerToggle.this;
            if (actionBarDrawerToggle.f8788f) {
                actionBarDrawerToggle.m64737e();
                return;
            }
            View.OnClickListener onClickListener = actionBarDrawerToggle.f8792j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.ActionBarDrawerToggle$b */
    /* loaded from: classes.dex */
    public static class C2066b implements Delegate {

        /* renamed from: a */
        public final Activity f8795a;

        /* renamed from: androidx.appcompat.app.ActionBarDrawerToggle$b$a */
        /* loaded from: classes.dex */
        public static class C2067a {
            @DoNotInline
            /* renamed from: a */
            public static void m64736a(android.app.ActionBar actionBar, int i) {
                actionBar.setHomeActionContentDescription(i);
            }

            @DoNotInline
            /* renamed from: b */
            public static void m64735b(android.app.ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        public C2066b(Activity activity) {
            this.f8795a = activity;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            android.app.ActionBar actionBar = this.f8795a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f8795a;
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
            android.app.ActionBar actionBar = this.f8795a.getActionBar();
            if (actionBar != null && (actionBar.getDisplayOptions() & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            android.app.ActionBar actionBar = this.f8795a.getActionBar();
            if (actionBar != null) {
                C2067a.m64736a(actionBar, i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            android.app.ActionBar actionBar = this.f8795a.getActionBar();
            if (actionBar != null) {
                C2067a.m64735b(actionBar, drawable);
                C2067a.m64736a(actionBar, i);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.ActionBarDrawerToggle$c */
    /* loaded from: classes.dex */
    public static class C2068c implements Delegate {

        /* renamed from: a */
        public final Toolbar f8796a;

        /* renamed from: b */
        public final Drawable f8797b;

        /* renamed from: c */
        public final CharSequence f8798c;

        public C2068c(Toolbar toolbar) {
            this.f8796a = toolbar;
            this.f8797b = toolbar.getNavigationIcon();
            this.f8798c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            return this.f8796a.getContext();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            return this.f8797b;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            return true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            if (i == 0) {
                this.f8796a.setNavigationContentDescription(this.f8798c);
            } else {
                this.f8796a.setNavigationContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            this.f8796a.setNavigationIcon(drawable);
            setActionBarDescription(i);
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, @StringRes int i, @StringRes int i2) {
        this(activity, null, drawerLayout, null, i, i2);
    }

    /* renamed from: a */
    public Drawable m64741a() {
        return this.f8783a.getThemeUpIndicator();
    }

    /* renamed from: b */
    public void m64740b(int i) {
        this.f8783a.setActionBarDescription(i);
    }

    /* renamed from: c */
    public void m64739c(Drawable drawable, int i) {
        if (!this.f8793k && !this.f8783a.isNavigationVisible()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f8793k = true;
        }
        this.f8783a.setActionBarUpIndicator(drawable, i);
    }

    /* renamed from: d */
    public final void m64738d(float f) {
        if (f == 1.0f) {
            this.f8785c.setVerticalMirror(true);
        } else if (f == 0.0f) {
            this.f8785c.setVerticalMirror(false);
        }
        this.f8785c.setProgress(f);
    }

    /* renamed from: e */
    public void m64737e() {
        int drawerLockMode = this.f8784b.getDrawerLockMode(GravityCompat.START);
        if (this.f8784b.isDrawerVisible(GravityCompat.START) && drawerLockMode != 2) {
            this.f8784b.closeDrawer(GravityCompat.START);
        } else if (drawerLockMode != 1) {
            this.f8784b.openDrawer(GravityCompat.START);
        }
    }

    @NonNull
    public DrawerArrowDrawable getDrawerArrowDrawable() {
        return this.f8785c;
    }

    public View.OnClickListener getToolbarNavigationClickListener() {
        return this.f8792j;
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.f8788f;
    }

    public boolean isDrawerSlideAnimationEnabled() {
        return this.f8786d;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f8789g) {
            this.f8787e = m64741a();
        }
        syncState();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(View view) {
        m64738d(0.0f);
        if (this.f8788f) {
            m64740b(this.f8790h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(View view) {
        m64738d(1.0f);
        if (this.f8788f) {
            m64740b(this.f8791i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(View view, float f) {
        if (this.f8786d) {
            m64738d(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m64738d(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.f8788f) {
            m64737e();
            return true;
        }
        return false;
    }

    public void setDrawerArrowDrawable(@NonNull DrawerArrowDrawable drawerArrowDrawable) {
        this.f8785c = drawerArrowDrawable;
        syncState();
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        int i;
        if (z != this.f8788f) {
            if (z) {
                DrawerArrowDrawable drawerArrowDrawable = this.f8785c;
                if (this.f8784b.isDrawerOpen(GravityCompat.START)) {
                    i = this.f8791i;
                } else {
                    i = this.f8790h;
                }
                m64739c(drawerArrowDrawable, i);
            } else {
                m64739c(this.f8787e, 0);
            }
            this.f8788f = z;
        }
    }

    public void setDrawerSlideAnimationEnabled(boolean z) {
        this.f8786d = z;
        if (!z) {
            m64738d(0.0f);
        }
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        if (drawable == null) {
            this.f8787e = m64741a();
            this.f8789g = false;
        } else {
            this.f8787e = drawable;
            this.f8789g = true;
        }
        if (this.f8788f) {
            return;
        }
        m64739c(this.f8787e, 0);
    }

    public void setToolbarNavigationClickListener(View.OnClickListener onClickListener) {
        this.f8792j = onClickListener;
    }

    public void syncState() {
        int i;
        if (this.f8784b.isDrawerOpen(GravityCompat.START)) {
            m64738d(1.0f);
        } else {
            m64738d(0.0f);
        }
        if (this.f8788f) {
            DrawerArrowDrawable drawerArrowDrawable = this.f8785c;
            if (this.f8784b.isDrawerOpen(GravityCompat.START)) {
                i = this.f8791i;
            } else {
                i = this.f8790h;
            }
            m64739c(drawerArrowDrawable, i);
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @StringRes int i, @StringRes int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    public ActionBarDrawerToggle(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, DrawerArrowDrawable drawerArrowDrawable, int i, int i2) {
        this.f8786d = true;
        this.f8788f = true;
        this.f8793k = false;
        if (toolbar != null) {
            this.f8783a = new C2068c(toolbar);
            toolbar.setNavigationOnClickListener(new View$OnClickListenerC2065a());
        } else if (activity instanceof DelegateProvider) {
            this.f8783a = ((DelegateProvider) activity).getDrawerToggleDelegate();
        } else {
            this.f8783a = new C2066b(activity);
        }
        this.f8784b = drawerLayout;
        this.f8790h = i;
        this.f8791i = i2;
        if (drawerArrowDrawable == null) {
            this.f8785c = new DrawerArrowDrawable(this.f8783a.getActionBarThemedContext());
        } else {
            this.f8785c = drawerArrowDrawable;
        }
        this.f8787e = m64741a();
    }

    public void setHomeAsUpIndicator(int i) {
        setHomeAsUpIndicator(i != 0 ? this.f8784b.getResources().getDrawable(i) : null);
    }
}
