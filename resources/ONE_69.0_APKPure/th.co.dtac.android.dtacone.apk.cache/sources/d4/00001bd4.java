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
    public static Configuration f9241f;

    /* renamed from: a */
    public int f9242a;

    /* renamed from: b */
    public Resources.Theme f9243b;

    /* renamed from: c */
    public LayoutInflater f9244c;

    /* renamed from: d */
    public Configuration f9245d;

    /* renamed from: e */
    public Resources f9246e;

    /* renamed from: androidx.appcompat.view.ContextThemeWrapper$a */
    /* loaded from: classes.dex */
    public static class C2119a {
        @DoNotInline
        /* renamed from: a */
        public static Context m64438a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            return contextThemeWrapper.createConfigurationContext(configuration);
        }
    }

    public ContextThemeWrapper() {
        super(null);
    }

    /* renamed from: c */
    public static boolean m64439c(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f9241f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f9241f = configuration2;
        }
        return configuration.equals(f9241f);
    }

    /* renamed from: a */
    public final Resources m64441a() {
        if (this.f9246e == null) {
            Configuration configuration = this.f9245d;
            if (configuration != null && (Build.VERSION.SDK_INT < 26 || !m64439c(configuration))) {
                this.f9246e = C2119a.m64438a(this, this.f9245d).getResources();
            } else {
                this.f9246e = super.getResources();
            }
        }
        return this.f9246e;
    }

    public void applyOverrideConfiguration(Configuration configuration) {
        if (this.f9246e == null) {
            if (this.f9245d == null) {
                this.f9245d = new Configuration(configuration);
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
    public final void m64440b() {
        boolean z;
        if (this.f9243b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f9243b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f9243b.setTo(theme);
            }
        }
        onApplyThemeResource(this.f9243b, this.f9242a, z);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m64441a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f9244c == null) {
                this.f9244c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f9244c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f9243b;
        if (theme != null) {
            return theme;
        }
        if (this.f9242a == 0) {
            this.f9242a = R.style.Theme_AppCompat_Light;
        }
        m64440b();
        return this.f9243b;
    }

    public int getThemeResId() {
        return this.f9242a;
    }

    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f9242a != i) {
            this.f9242a = i;
            m64440b();
        }
    }

    public ContextThemeWrapper(Context context, @StyleRes int i) {
        super(context);
        this.f9242a = i;
    }

    public ContextThemeWrapper(Context context, Resources.Theme theme) {
        super(context);
        this.f9243b = theme;
    }
}