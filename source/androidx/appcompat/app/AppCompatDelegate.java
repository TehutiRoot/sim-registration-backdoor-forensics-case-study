package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.AnyThread;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AbstractC2113a;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.collection.ArraySet;
import androidx.core.p005os.BuildCompat;
import androidx.core.p005os.LocaleListCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class AppCompatDelegate {
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;
    @Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;
    @Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;

    /* renamed from: a */
    public static AbstractC2113a.ExecutorC2114a f8877a = new AbstractC2113a.ExecutorC2114a(new AbstractC2113a.ExecutorC2115b());

    /* renamed from: b */
    public static int f8878b = -100;

    /* renamed from: c */
    public static LocaleListCompat f8879c = null;

    /* renamed from: d */
    public static LocaleListCompat f8880d = null;

    /* renamed from: e */
    public static Boolean f8881e = null;

    /* renamed from: f */
    public static boolean f8882f = false;

    /* renamed from: g */
    public static final ArraySet f8883g = new ArraySet();

    /* renamed from: h */
    public static final Object f8884h = new Object();

    /* renamed from: i */
    public static final Object f8885i = new Object();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface NightMode {
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegate$a */
    /* loaded from: classes.dex */
    public static class C2082a {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m64687a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegate$b */
    /* loaded from: classes.dex */
    public static class C2083b {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m64686a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m64685b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m64702a(Context context) {
        m64691m(context);
    }

    /* renamed from: b */
    public static /* synthetic */ void m64701b(Context context) {
        m64688p(context);
    }

    /* renamed from: c */
    public static void m64700c(AppCompatDelegate appCompatDelegate) {
        synchronized (f8884h) {
            m64689o(appCompatDelegate);
            f8883g.add(new WeakReference(appCompatDelegate));
        }
    }

    @NonNull
    public static AppCompatDelegate create(@NonNull Activity activity, @Nullable AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(activity, appCompatCallback);
    }

    /* renamed from: e */
    public static void m64699e() {
        synchronized (f8884h) {
            try {
                Iterator it = f8883g.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) it.next()).get();
                    if (appCompatDelegate != null) {
                        appCompatDelegate.applyDayNight();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public static void m64698f() {
        Iterator it = f8883g.iterator();
        while (it.hasNext()) {
            AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) it.next()).get();
            if (appCompatDelegate != null) {
                appCompatDelegate.mo64653d();
            }
        }
    }

    @NonNull
    @AnyThread
    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public static LocaleListCompat getApplicationLocales() {
        if (BuildCompat.isAtLeastT()) {
            Object m64696h = m64696h();
            if (m64696h != null) {
                return LocaleListCompat.wrap(C2083b.m64686a(m64696h));
            }
        } else {
            LocaleListCompat localeListCompat = f8879c;
            if (localeListCompat != null) {
                return localeListCompat;
            }
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    public static int getDefaultNightMode() {
        return f8878b;
    }

    /* renamed from: h */
    public static Object m64696h() {
        Context contextForDelegate;
        Iterator it = f8883g.iterator();
        while (it.hasNext()) {
            AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) it.next()).get();
            if (appCompatDelegate != null && (contextForDelegate = appCompatDelegate.getContextForDelegate()) != null) {
                return contextForDelegate.getSystemService("locale");
            }
        }
        return null;
    }

    /* renamed from: i */
    public static LocaleListCompat m64695i() {
        return f8879c;
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }

    /* renamed from: j */
    public static LocaleListCompat m64694j() {
        return f8880d;
    }

    /* renamed from: k */
    public static boolean m64693k(Context context) {
        if (f8881e == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.getServiceInfo(context).metaData;
                if (bundle != null) {
                    f8881e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f8881e = Boolean.FALSE;
            }
        }
        return f8881e.booleanValue();
    }

    /* renamed from: m */
    public static /* synthetic */ void m64691m(Context context) {
        AbstractC2113a.m64566c(context);
        f8882f = true;
    }

    /* renamed from: n */
    public static void m64690n(AppCompatDelegate appCompatDelegate) {
        synchronized (f8884h) {
            m64689o(appCompatDelegate);
        }
    }

    /* renamed from: o */
    public static void m64689o(AppCompatDelegate appCompatDelegate) {
        synchronized (f8884h) {
            try {
                Iterator it = f8883g.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) ((WeakReference) it.next()).get();
                    if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public static void m64688p(final Context context) {
        if (!m64693k(context)) {
            return;
        }
        if (BuildCompat.isAtLeastT()) {
            if (!f8882f) {
                f8877a.execute(new Runnable() { // from class: t5
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppCompatDelegate.m64702a(context);
                    }
                });
                return;
            }
            return;
        }
        synchronized (f8885i) {
            try {
                LocaleListCompat localeListCompat = f8879c;
                if (localeListCompat == null) {
                    if (f8880d == null) {
                        f8880d = LocaleListCompat.forLanguageTags(AbstractC2113a.m64567b(context));
                    }
                    if (f8880d.isEmpty()) {
                        return;
                    }
                    f8879c = f8880d;
                } else if (!localeListCompat.equals(f8880d)) {
                    LocaleListCompat localeListCompat2 = f8879c;
                    f8880d = localeListCompat2;
                    AbstractC2113a.m64568a(context, localeListCompat2.toLanguageTags());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public static void setApplicationLocales(@NonNull LocaleListCompat localeListCompat) {
        Objects.requireNonNull(localeListCompat);
        if (BuildCompat.isAtLeastT()) {
            Object m64696h = m64696h();
            if (m64696h != null) {
                C2083b.m64685b(m64696h, C2082a.m64687a(localeListCompat.toLanguageTags()));
            }
        } else if (!localeListCompat.equals(f8879c)) {
            synchronized (f8884h) {
                f8879c = localeListCompat;
                m64698f();
            }
        }
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(z);
    }

    public static void setDefaultNightMode(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f8878b != i) {
            f8878b = i;
            m64699e();
        }
    }

    public abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean applyDayNight();

    @Deprecated
    public void attachBaseContext(Context context) {
    }

    @NonNull
    @CallSuper
    public Context attachBaseContext2(@NonNull Context context) {
        attachBaseContext(context);
        return context;
    }

    public abstract View createView(@Nullable View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet);

    /* renamed from: d */
    public boolean mo64653d() {
        return false;
    }

    @Nullable
    public abstract <T extends View> T findViewById(@IdRes int i);

    /* renamed from: g */
    public void m64697g(final Context context) {
        f8877a.execute(new Runnable() { // from class: u5
            @Override // java.lang.Runnable
            public final void run() {
                AppCompatDelegate.m64701b(context);
            }
        });
    }

    @Nullable
    public Context getContextForDelegate() {
        return null;
    }

    @Nullable
    public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    public int getLocalNightMode() {
        return -100;
    }

    public abstract MenuInflater getMenuInflater();

    @Nullable
    public abstract ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int i);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i);

    public abstract void setContentView(@LayoutRes int i);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled(boolean z);

    @RequiresApi(17)
    public abstract void setLocalNightMode(int i);

    @RequiresApi(33)
    @CallSuper
    public void setOnBackInvokedDispatcher(@Nullable OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void setSupportActionBar(@Nullable Toolbar toolbar);

    public void setTheme(@StyleRes int i) {
    }

    public abstract void setTitle(@Nullable CharSequence charSequence);

    @Nullable
    public abstract ActionMode startSupportActionMode(@NonNull ActionMode.Callback callback);

    @NonNull
    public static AppCompatDelegate create(@NonNull Dialog dialog, @Nullable AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(dialog, appCompatCallback);
    }

    @NonNull
    public static AppCompatDelegate create(@NonNull Context context, @NonNull Window window, @Nullable AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(context, window, appCompatCallback);
    }

    @NonNull
    public static AppCompatDelegate create(@NonNull Context context, @NonNull Activity activity, @Nullable AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(context, activity, appCompatCallback);
    }
}
