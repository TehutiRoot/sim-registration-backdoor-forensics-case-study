package androidx.legacy.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;

@Deprecated
/* loaded from: classes2.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    /* renamed from: l */
    public static final int[] f35801l = {16843531};

    /* renamed from: a */
    public final Activity f35802a;

    /* renamed from: b */
    public final Delegate f35803b;

    /* renamed from: c */
    public final DrawerLayout f35804c;

    /* renamed from: d */
    public boolean f35805d;

    /* renamed from: e */
    public boolean f35806e;

    /* renamed from: f */
    public Drawable f35807f;

    /* renamed from: g */
    public Drawable f35808g;

    /* renamed from: h */
    public C4622a f35809h;

    /* renamed from: i */
    public final int f35810i;

    /* renamed from: j */
    public final int f35811j;

    /* renamed from: k */
    public final int f35812k;

    @Deprecated
    /* loaded from: classes2.dex */
    public interface Delegate {
        @Nullable
        Drawable getThemeUpIndicator();

        void setActionBarDescription(@StringRes int i);

        void setActionBarUpIndicator(Drawable drawable, @StringRes int i);
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface DelegateProvider {
        @Nullable
        Delegate getDrawerToggleDelegate();
    }

    /* renamed from: androidx.legacy.app.ActionBarDrawerToggle$a */
    /* loaded from: classes2.dex */
    public class C4622a extends InsetDrawable implements Drawable.Callback {

        /* renamed from: a */
        public final boolean f35813a;

        /* renamed from: b */
        public final Rect f35814b;

        /* renamed from: c */
        public float f35815c;

        /* renamed from: d */
        public float f35816d;

        public C4622a(Drawable drawable) {
            super(drawable, 0);
            this.f35813a = true;
            this.f35814b = new Rect();
        }

        /* renamed from: a */
        public float m54105a() {
            return this.f35815c;
        }

        /* renamed from: b */
        public void m54104b(float f) {
            this.f35816d = f;
            invalidateSelf();
        }

        /* renamed from: c */
        public void m54103c(float f) {
            this.f35815c = f;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            boolean z;
            copyBounds(this.f35814b);
            canvas.save();
            int i = 1;
            if (ViewCompat.getLayoutDirection(ActionBarDrawerToggle.this.f35802a.getWindow().getDecorView()) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = -1;
            }
            float width = this.f35814b.width();
            canvas.translate((-this.f35816d) * width * this.f35815c * i, 0.0f);
            if (z && !this.f35813a) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, @DrawableRes int i, @StringRes int i2, @StringRes int i3) {
        this(activity, drawerLayout, !m54109a(activity), i, i2, i3);
    }

    /* renamed from: a */
    public static boolean m54109a(Context context) {
        if (context.getApplicationInfo().targetSdkVersion >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private Drawable m54108b() {
        Context context;
        Delegate delegate = this.f35803b;
        if (delegate != null) {
            return delegate.getThemeUpIndicator();
        }
        ActionBar actionBar = this.f35802a.getActionBar();
        if (actionBar != null) {
            context = actionBar.getThemedContext();
        } else {
            context = this.f35802a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f35801l, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: c */
    private void m54107c(int i) {
        Delegate delegate = this.f35803b;
        if (delegate != null) {
            delegate.setActionBarDescription(i);
            return;
        }
        ActionBar actionBar = this.f35802a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }

    /* renamed from: d */
    private void m54106d(Drawable drawable, int i) {
        Delegate delegate = this.f35803b;
        if (delegate != null) {
            delegate.setActionBarUpIndicator(drawable, i);
            return;
        }
        ActionBar actionBar = this.f35802a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.f35805d;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f35806e) {
            this.f35807f = m54108b();
        }
        this.f35808g = ContextCompat.getDrawable(this.f35802a, this.f35810i);
        syncState();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(View view) {
        this.f35809h.m54103c(0.0f);
        if (this.f35805d) {
            m54107c(this.f35811j);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(View view) {
        this.f35809h.m54103c(1.0f);
        if (this.f35805d) {
            m54107c(this.f35812k);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(View view, float f) {
        float min;
        float m54105a = this.f35809h.m54105a();
        if (f > 0.5f) {
            min = Math.max(m54105a, Math.max(0.0f, f - 0.5f) * 2.0f);
        } else {
            min = Math.min(m54105a, f * 2.0f);
        }
        this.f35809h.m54103c(min);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.f35805d) {
            if (this.f35804c.isDrawerVisible(GravityCompat.START)) {
                this.f35804c.closeDrawer(GravityCompat.START);
                return true;
            }
            this.f35804c.openDrawer(GravityCompat.START);
            return true;
        }
        return false;
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        int i;
        if (z != this.f35805d) {
            if (z) {
                C4622a c4622a = this.f35809h;
                if (this.f35804c.isDrawerOpen(GravityCompat.START)) {
                    i = this.f35812k;
                } else {
                    i = this.f35811j;
                }
                m54106d(c4622a, i);
            } else {
                m54106d(this.f35807f, 0);
            }
            this.f35805d = z;
        }
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        if (drawable == null) {
            this.f35807f = m54108b();
            this.f35806e = false;
        } else {
            this.f35807f = drawable;
            this.f35806e = true;
        }
        if (this.f35805d) {
            return;
        }
        m54106d(this.f35807f, 0);
    }

    public void syncState() {
        int i;
        if (this.f35804c.isDrawerOpen(GravityCompat.START)) {
            this.f35809h.m54103c(1.0f);
        } else {
            this.f35809h.m54103c(0.0f);
        }
        if (this.f35805d) {
            C4622a c4622a = this.f35809h;
            if (this.f35804c.isDrawerOpen(GravityCompat.START)) {
                i = this.f35812k;
            } else {
                i = this.f35811j;
            }
            m54106d(c4622a, i);
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, boolean z, @DrawableRes int i, @StringRes int i2, @StringRes int i3) {
        this.f35805d = true;
        this.f35802a = activity;
        if (activity instanceof DelegateProvider) {
            this.f35803b = ((DelegateProvider) activity).getDrawerToggleDelegate();
        } else {
            this.f35803b = null;
        }
        this.f35804c = drawerLayout;
        this.f35810i = i;
        this.f35811j = i2;
        this.f35812k = i3;
        this.f35807f = m54108b();
        this.f35808g = ContextCompat.getDrawable(activity, i);
        C4622a c4622a = new C4622a(this.f35808g);
        this.f35809h = c4622a;
        c4622a.m54104b(z ? 0.33333334f : 0.0f);
    }

    public void setHomeAsUpIndicator(int i) {
        setHomeAsUpIndicator(i != 0 ? ContextCompat.getDrawable(this.f35802a, i) : null);
    }
}