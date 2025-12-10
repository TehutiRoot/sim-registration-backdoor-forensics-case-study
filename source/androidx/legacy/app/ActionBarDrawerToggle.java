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
    public static final int[] f35713l = {16843531};

    /* renamed from: a */
    public final Activity f35714a;

    /* renamed from: b */
    public final Delegate f35715b;

    /* renamed from: c */
    public final DrawerLayout f35716c;

    /* renamed from: d */
    public boolean f35717d;

    /* renamed from: e */
    public boolean f35718e;

    /* renamed from: f */
    public Drawable f35719f;

    /* renamed from: g */
    public Drawable f35720g;

    /* renamed from: h */
    public C4640a f35721h;

    /* renamed from: i */
    public final int f35722i;

    /* renamed from: j */
    public final int f35723j;

    /* renamed from: k */
    public final int f35724k;

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
    public class C4640a extends InsetDrawable implements Drawable.Callback {

        /* renamed from: a */
        public final boolean f35725a;

        /* renamed from: b */
        public final Rect f35726b;

        /* renamed from: c */
        public float f35727c;

        /* renamed from: d */
        public float f35728d;

        public C4640a(Drawable drawable) {
            super(drawable, 0);
            this.f35725a = true;
            this.f35726b = new Rect();
        }

        /* renamed from: a */
        public float m54154a() {
            return this.f35727c;
        }

        /* renamed from: b */
        public void m54153b(float f) {
            this.f35728d = f;
            invalidateSelf();
        }

        /* renamed from: c */
        public void m54152c(float f) {
            this.f35727c = f;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            boolean z;
            copyBounds(this.f35726b);
            canvas.save();
            int i = 1;
            if (ViewCompat.getLayoutDirection(ActionBarDrawerToggle.this.f35714a.getWindow().getDecorView()) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = -1;
            }
            float width = this.f35726b.width();
            canvas.translate((-this.f35728d) * width * this.f35727c * i, 0.0f);
            if (z && !this.f35725a) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, @DrawableRes int i, @StringRes int i2, @StringRes int i3) {
        this(activity, drawerLayout, !m54158a(activity), i, i2, i3);
    }

    /* renamed from: a */
    public static boolean m54158a(Context context) {
        if (context.getApplicationInfo().targetSdkVersion >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private Drawable m54157b() {
        Context context;
        Delegate delegate = this.f35715b;
        if (delegate != null) {
            return delegate.getThemeUpIndicator();
        }
        ActionBar actionBar = this.f35714a.getActionBar();
        if (actionBar != null) {
            context = actionBar.getThemedContext();
        } else {
            context = this.f35714a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f35713l, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: c */
    private void m54156c(int i) {
        Delegate delegate = this.f35715b;
        if (delegate != null) {
            delegate.setActionBarDescription(i);
            return;
        }
        ActionBar actionBar = this.f35714a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }

    /* renamed from: d */
    private void m54155d(Drawable drawable, int i) {
        Delegate delegate = this.f35715b;
        if (delegate != null) {
            delegate.setActionBarUpIndicator(drawable, i);
            return;
        }
        ActionBar actionBar = this.f35714a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.f35717d;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f35718e) {
            this.f35719f = m54157b();
        }
        this.f35720g = ContextCompat.getDrawable(this.f35714a, this.f35722i);
        syncState();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(View view) {
        this.f35721h.m54152c(0.0f);
        if (this.f35717d) {
            m54156c(this.f35723j);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(View view) {
        this.f35721h.m54152c(1.0f);
        if (this.f35717d) {
            m54156c(this.f35724k);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(View view, float f) {
        float min;
        float m54154a = this.f35721h.m54154a();
        if (f > 0.5f) {
            min = Math.max(m54154a, Math.max(0.0f, f - 0.5f) * 2.0f);
        } else {
            min = Math.min(m54154a, f * 2.0f);
        }
        this.f35721h.m54152c(min);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.f35717d) {
            if (this.f35716c.isDrawerVisible(GravityCompat.START)) {
                this.f35716c.closeDrawer(GravityCompat.START);
                return true;
            }
            this.f35716c.openDrawer(GravityCompat.START);
            return true;
        }
        return false;
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        int i;
        if (z != this.f35717d) {
            if (z) {
                C4640a c4640a = this.f35721h;
                if (this.f35716c.isDrawerOpen(GravityCompat.START)) {
                    i = this.f35724k;
                } else {
                    i = this.f35723j;
                }
                m54155d(c4640a, i);
            } else {
                m54155d(this.f35719f, 0);
            }
            this.f35717d = z;
        }
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        if (drawable == null) {
            this.f35719f = m54157b();
            this.f35718e = false;
        } else {
            this.f35719f = drawable;
            this.f35718e = true;
        }
        if (this.f35717d) {
            return;
        }
        m54155d(this.f35719f, 0);
    }

    public void syncState() {
        int i;
        if (this.f35716c.isDrawerOpen(GravityCompat.START)) {
            this.f35721h.m54152c(1.0f);
        } else {
            this.f35721h.m54152c(0.0f);
        }
        if (this.f35717d) {
            C4640a c4640a = this.f35721h;
            if (this.f35716c.isDrawerOpen(GravityCompat.START)) {
                i = this.f35724k;
            } else {
                i = this.f35723j;
            }
            m54155d(c4640a, i);
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, boolean z, @DrawableRes int i, @StringRes int i2, @StringRes int i3) {
        this.f35717d = true;
        this.f35714a = activity;
        if (activity instanceof DelegateProvider) {
            this.f35715b = ((DelegateProvider) activity).getDrawerToggleDelegate();
        } else {
            this.f35715b = null;
        }
        this.f35716c = drawerLayout;
        this.f35722i = i;
        this.f35723j = i2;
        this.f35724k = i3;
        this.f35719f = m54157b();
        this.f35720g = ContextCompat.getDrawable(activity, i);
        C4640a c4640a = new C4640a(this.f35720g);
        this.f35721h = c4640a;
        c4640a.m54153b(z ? 0.33333334f : 0.0f);
    }

    public void setHomeAsUpIndicator(int i) {
        setHomeAsUpIndicator(i != 0 ? ContextCompat.getDrawable(this.f35714a, i) : null);
    }
}
