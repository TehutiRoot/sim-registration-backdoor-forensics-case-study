package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.annotation.DoNotInline;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;

/* loaded from: classes.dex */
public class ContextThemeWrapper extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f9153f;

    /* renamed from: a */
    public int f9154a;

    /* renamed from: b */
    public Resources.Theme f9155b;

    /* renamed from: c */
    public LayoutInflater f9156c;

    /* renamed from: d */
    public Configuration f9157d;

    /* renamed from: e */
    public Resources f9158e;

    /* renamed from: androidx.appcompat.view.ContextThemeWrapper$a */
    /* loaded from: classes.dex */
    public static class C2137a {
        @DoNotInline
        /* renamed from: a */
        public static Context m64487a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            return contextThemeWrapper.createConfigurationContext(configuration);
        }
    }

    public ContextThemeWrapper() {
        super(null);
    }

    /* renamed from: c */
    public static boolean m64488c(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f9153f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f9153f = configuration2;
        }
        return configuration.equals(f9153f);
    }

    /* renamed from: a */
    public final Resources m64490a() {
        if (this.f9158e == null) {
            Configuration configuration = this.f9157d;
            if (configuration != null && (Build.VERSION.SDK_INT < 26 || !m64488c(configuration))) {
                this.f9158e = C2137a.m64487a(this, this.f9157d).getResources();
            } else {
                this.f9158e = super.getResources();
            }
        }
        return this.f9158e;
    }

    public void applyOverrideConfiguration(Configuration configuration) {
        if (this.f9158e == null) {
            if (this.f9157d == null) {
                this.f9157d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m64489b() {
        boolean z;
        if (this.f9155b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f9155b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f9155b.setTo(theme);
            }
        }
        onApplyThemeResource(this.f9155b, this.f9154a, z);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m64490a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f9156c == null) {
                this.f9156c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f9156c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f9155b;
        if (theme != null) {
            return theme;
        }
        if (this.f9154a == 0) {
            this.f9154a = R.style.Theme_AppCompat_Light;
        }
        m64489b();
        return this.f9155b;
    }

    public int getThemeResId() {
        return this.f9154a;
    }

    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f9154a != i) {
            this.f9154a = i;
            m64489b();
        }
    }

    public ContextThemeWrapper(Context context, @StyleRes int i) {
        super(context);
        this.f9154a = i;
    }

    public ContextThemeWrapper(Context context, Resources.Theme theme) {
        super(context);
        this.f9155b = theme;
    }
}
