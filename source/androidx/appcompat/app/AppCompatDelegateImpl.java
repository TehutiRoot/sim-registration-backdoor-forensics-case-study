package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.p005os.LocaleListCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.internal.ViewUtils;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.time.DurationKt;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {

    /* renamed from: j0 */
    public static final SimpleArrayMap f8886j0 = new SimpleArrayMap();

    /* renamed from: k0 */
    public static final boolean f8887k0 = false;

    /* renamed from: l0 */
    public static final int[] f8888l0 = {16842836};

    /* renamed from: m0 */
    public static final boolean f8889m0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: n0 */
    public static final boolean f8890n0 = true;

    /* renamed from: A */
    public boolean f8891A;

    /* renamed from: B */
    public ViewGroup f8892B;

    /* renamed from: C */
    public TextView f8893C;

    /* renamed from: D */
    public View f8894D;

    /* renamed from: E */
    public boolean f8895E;

    /* renamed from: F */
    public boolean f8896F;

    /* renamed from: G */
    public boolean f8897G;

    /* renamed from: H */
    public boolean f8898H;

    /* renamed from: I */
    public boolean f8899I;

    /* renamed from: J */
    public boolean f8900J;

    /* renamed from: K */
    public boolean f8901K;

    /* renamed from: L */
    public boolean f8902L;

    /* renamed from: M */
    public PanelFeatureState[] f8903M;

    /* renamed from: N */
    public PanelFeatureState f8904N;

    /* renamed from: O */
    public boolean f8905O;

    /* renamed from: P */
    public boolean f8906P;

    /* renamed from: Q */
    public boolean f8907Q;

    /* renamed from: R */
    public boolean f8908R;

    /* renamed from: S */
    public Configuration f8909S;

    /* renamed from: T */
    public int f8910T;

    /* renamed from: U */
    public int f8911U;

    /* renamed from: V */
    public int f8912V;

    /* renamed from: W */
    public boolean f8913W;

    /* renamed from: X */
    public AbstractC2102q f8914X;

    /* renamed from: Y */
    public AbstractC2102q f8915Y;

    /* renamed from: Z */
    public boolean f8916Z;

    /* renamed from: a0 */
    public int f8917a0;

    /* renamed from: b0 */
    public final Runnable f8918b0;

    /* renamed from: c0 */
    public boolean f8919c0;

    /* renamed from: d0 */
    public Rect f8920d0;

    /* renamed from: e0 */
    public Rect f8921e0;

    /* renamed from: f0 */
    public AppCompatViewInflater f8922f0;

    /* renamed from: g0 */
    public C20081gi0 f8923g0;

    /* renamed from: h0 */
    public OnBackInvokedDispatcher f8924h0;

    /* renamed from: i0 */
    public OnBackInvokedCallback f8925i0;

    /* renamed from: j */
    public final Object f8926j;

    /* renamed from: k */
    public final Context f8927k;

    /* renamed from: l */
    public Window f8928l;

    /* renamed from: m */
    public C2100o f8929m;

    /* renamed from: n */
    public final AppCompatCallback f8930n;

    /* renamed from: o */
    public ActionBar f8931o;

    /* renamed from: p */
    public MenuInflater f8932p;

    /* renamed from: q */
    public CharSequence f8933q;

    /* renamed from: r */
    public DecorContentParent f8934r;

    /* renamed from: s */
    public C2092h f8935s;

    /* renamed from: t */
    public C2107u f8936t;

    /* renamed from: u */
    public ActionMode f8937u;

    /* renamed from: v */
    public ActionBarContextView f8938v;

    /* renamed from: w */
    public PopupWindow f8939w;

    /* renamed from: x */
    public Runnable f8940x;

    /* renamed from: y */
    public ViewPropertyAnimatorCompat f8941y;

    /* renamed from: z */
    public boolean f8942z;

    /* loaded from: classes.dex */
    public static final class PanelFeatureState {

        /* renamed from: a */
        public int f8943a;

        /* renamed from: b */
        public int f8944b;

        /* renamed from: c */
        public int f8945c;

        /* renamed from: d */
        public int f8946d;

        /* renamed from: e */
        public int f8947e;

        /* renamed from: f */
        public int f8948f;

        /* renamed from: g */
        public ViewGroup f8949g;

        /* renamed from: h */
        public View f8950h;

        /* renamed from: i */
        public View f8951i;

        /* renamed from: j */
        public MenuBuilder f8952j;

        /* renamed from: k */
        public ListMenuPresenter f8953k;

        /* renamed from: l */
        public Context f8954l;

        /* renamed from: m */
        public boolean f8955m;

        /* renamed from: n */
        public boolean f8956n;

        /* renamed from: o */
        public boolean f8957o;

        /* renamed from: p */
        public boolean f8958p = false;

        /* renamed from: q */
        public boolean f8959q;
        public boolean qwertyMode;

        /* renamed from: r */
        public Bundle f8960r;

        public PanelFeatureState(int i) {
            this.f8943a = i;
        }

        /* renamed from: a */
        public MenuView m64619a(MenuPresenter.Callback callback) {
            if (this.f8952j == null) {
                return null;
            }
            if (this.f8953k == null) {
                ListMenuPresenter listMenuPresenter = new ListMenuPresenter(this.f8954l, R.layout.abc_list_menu_item_layout);
                this.f8953k = listMenuPresenter;
                listMenuPresenter.setCallback(callback);
                this.f8952j.addMenuPresenter(this.f8953k);
            }
            return this.f8953k.getMenuView(this.f8949g);
        }

        /* renamed from: b */
        public void m64618b(MenuBuilder menuBuilder) {
            ListMenuPresenter listMenuPresenter;
            MenuBuilder menuBuilder2 = this.f8952j;
            if (menuBuilder == menuBuilder2) {
                return;
            }
            if (menuBuilder2 != null) {
                menuBuilder2.removeMenuPresenter(this.f8953k);
            }
            this.f8952j = menuBuilder;
            if (menuBuilder != null && (listMenuPresenter = this.f8953k) != null) {
                menuBuilder.addMenuPresenter(listMenuPresenter);
            }
        }

        /* renamed from: c */
        public void m64617c(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
            }
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(newTheme);
            this.f8954l = contextThemeWrapper;
            TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.AppCompatTheme);
            this.f8944b = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTheme_panelBackground, 0);
            this.f8948f = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        public void clearMenuPresenters() {
            MenuBuilder menuBuilder = this.f8952j;
            if (menuBuilder != null) {
                menuBuilder.removeMenuPresenter(this.f8953k);
            }
            this.f8953k = null;
        }

        public boolean hasPanelItems() {
            if (this.f8950h == null) {
                return false;
            }
            if (this.f8951i == null && this.f8953k.getAdapter().getCount() <= 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    /* loaded from: classes.dex */
    public class RunnableC2084a implements Runnable {
        public RunnableC2084a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f8917a0 & 1) != 0) {
                appCompatDelegateImpl.m64677F(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f8917a0 & 4096) != 0) {
                appCompatDelegateImpl2.m64677F(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f8916Z = false;
            appCompatDelegateImpl3.f8917a0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    /* loaded from: classes.dex */
    public class C2085b implements OnApplyWindowInsetsListener {
        public C2085b() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int m64683A0 = AppCompatDelegateImpl.this.m64683A0(windowInsetsCompat, null);
            if (systemWindowInsetTop != m64683A0) {
                windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), m64683A0, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            }
            return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    /* loaded from: classes.dex */
    public class C2086c implements ContentFrameLayout.OnAttachListener {
        public C2086c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
        public void onAttachedFromWindow() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.m64679D();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    /* loaded from: classes.dex */
    public class RunnableC2087d implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d$a */
        /* loaded from: classes.dex */
        public class C2088a extends ViewPropertyAnimatorListenerAdapter {
            public C2088a() {
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationEnd(View view) {
                AppCompatDelegateImpl.this.f8938v.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f8941y.setListener(null);
                AppCompatDelegateImpl.this.f8941y = null;
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationStart(View view) {
                AppCompatDelegateImpl.this.f8938v.setVisibility(0);
            }
        }

        public RunnableC2087d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f8939w.showAtLocation(appCompatDelegateImpl.f8938v, 55, 0, 0);
            AppCompatDelegateImpl.this.m64676G();
            if (AppCompatDelegateImpl.this.m64638q0()) {
                AppCompatDelegateImpl.this.f8938v.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f8941y = ViewCompat.animate(appCompatDelegateImpl2.f8938v).alpha(1.0f);
                AppCompatDelegateImpl.this.f8941y.setListener(new C2088a());
                return;
            }
            AppCompatDelegateImpl.this.f8938v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f8938v.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    /* loaded from: classes.dex */
    public class C2089e extends ViewPropertyAnimatorListenerAdapter {
        public C2089e() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            AppCompatDelegateImpl.this.f8938v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f8941y.setListener(null);
            AppCompatDelegateImpl.this.f8941y = null;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
            AppCompatDelegateImpl.this.f8938v.setVisibility(0);
            if (AppCompatDelegateImpl.this.f8938v.getParent() instanceof View) {
                ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.f8938v.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    /* loaded from: classes.dex */
    public class C2090f implements ActionBarDrawerToggle.Delegate {
        public C2090f() {
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            return AppCompatDelegateImpl.this.m64671L();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), (AttributeSet) null, new int[]{R.attr.homeAsUpIndicator});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null && (supportActionBar.getDisplayOptions() & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeAsUpIndicator(drawable);
                supportActionBar.setHomeActionContentDescription(i);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    /* loaded from: classes.dex */
    public interface InterfaceC2091g {
        /* renamed from: a */
        boolean mo64559a(int i);

        View onCreatePanelView(int i);
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    /* loaded from: classes.dex */
    public final class C2092h implements MenuPresenter.Callback {
        public C2092h() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImpl.this.m64625x(menuBuilder);
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback m64664S = AppCompatDelegateImpl.this.m64664S();
            if (m64664S != null) {
                m64664S.onMenuOpened(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, menuBuilder);
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    /* loaded from: classes.dex */
    public class C2093i implements ActionMode.Callback {

        /* renamed from: a */
        public ActionMode.Callback f8969a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i$a */
        /* loaded from: classes.dex */
        public class C2094a extends ViewPropertyAnimatorListenerAdapter {
            public C2094a() {
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationEnd(View view) {
                AppCompatDelegateImpl.this.f8938v.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f8939w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f8938v.getParent() instanceof View) {
                    ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.f8938v.getParent());
                }
                AppCompatDelegateImpl.this.f8938v.killMode();
                AppCompatDelegateImpl.this.f8941y.setListener(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f8941y = null;
                ViewCompat.requestApplyInsets(appCompatDelegateImpl2.f8892B);
            }
        }

        public C2093i(ActionMode.Callback callback) {
            this.f8969a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f8969a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f8969a.onCreateActionMode(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f8969a.onDestroyActionMode(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f8939w != null) {
                appCompatDelegateImpl.f8928l.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f8940x);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f8938v != null) {
                appCompatDelegateImpl2.m64676G();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f8941y = ViewCompat.animate(appCompatDelegateImpl3.f8938v).alpha(0.0f);
                AppCompatDelegateImpl.this.f8941y.setListener(new C2094a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            AppCompatCallback appCompatCallback = appCompatDelegateImpl4.f8930n;
            if (appCompatCallback != null) {
                appCompatCallback.onSupportActionModeFinished(appCompatDelegateImpl4.f8937u);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f8937u = null;
            ViewCompat.requestApplyInsets(appCompatDelegateImpl5.f8892B);
            AppCompatDelegateImpl.this.m64622y0();
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            ViewCompat.requestApplyInsets(AppCompatDelegateImpl.this.f8892B);
            return this.f8969a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    /* loaded from: classes.dex */
    public static class C2095j {
        /* renamed from: a */
        public static Context m64616a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        public static void m64615b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }

        @DoNotInline
        /* renamed from: c */
        public static void m64614c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m64613d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    /* loaded from: classes.dex */
    public static class C2096k {
        /* renamed from: a */
        public static boolean m64612a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @DoNotInline
        /* renamed from: b */
        public static String m64611b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    /* loaded from: classes.dex */
    public static class C2097l {
        @DoNotInline
        /* renamed from: a */
        public static void m64610a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (!equals) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        @DoNotInline
        /* renamed from: b */
        public static LocaleListCompat m64609b(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return LocaleListCompat.forLanguageTags(languageTags);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m64608c(LocaleListCompat localeListCompat) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(localeListCompat.toLanguageTags());
            LocaleList.setDefault(forLanguageTags);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m64607d(Configuration configuration, LocaleListCompat localeListCompat) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(localeListCompat.toLanguageTags());
            configuration.setLocales(forLanguageTags);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    /* loaded from: classes.dex */
    public static class C2098m {
        /* renamed from: a */
        public static void m64606a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            i = configuration.colorMode;
            int i9 = i & 3;
            i2 = configuration2.colorMode;
            if (i9 != (i2 & 3)) {
                i7 = configuration3.colorMode;
                i8 = configuration2.colorMode;
                configuration3.colorMode = i7 | (i8 & 3);
            }
            i3 = configuration.colorMode;
            int i10 = i3 & 12;
            i4 = configuration2.colorMode;
            if (i10 != (i4 & 12)) {
                i5 = configuration3.colorMode;
                i6 = configuration2.colorMode;
                configuration3.colorMode = i5 | (i6 & 12);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    /* loaded from: classes.dex */
    public static class C2099n {
        @DoNotInline
        /* renamed from: a */
        public static OnBackInvokedDispatcher m64605a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        @DoNotInline
        /* renamed from: b */
        public static OnBackInvokedCallback m64604b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: I5
                public final void onBackInvoked() {
                    appCompatDelegateImpl.m64657Z();
                }
            };
            AbstractC0298E5.m68547a(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        @DoNotInline
        /* renamed from: c */
        public static void m64603c(Object obj, Object obj2) {
            AbstractC0298E5.m68547a(obj).unregisterOnBackInvokedCallback(AbstractC0227D5.m68691a(obj2));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    /* loaded from: classes.dex */
    public class C2101p extends AbstractC2102q {

        /* renamed from: c */
        public final PowerManager f8977c;

        public C2101p(Context context) {
            super();
            this.f8977c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC2102q
        /* renamed from: b */
        public IntentFilter mo64595b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC2102q
        /* renamed from: c */
        public int mo64594c() {
            if (C2096k.m64612a(this.f8977c)) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC2102q
        /* renamed from: d */
        public void mo64593d() {
            AppCompatDelegateImpl.this.applyDayNight();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q */
    /* loaded from: classes.dex */
    public abstract class AbstractC2102q {

        /* renamed from: a */
        public BroadcastReceiver f8979a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q$a */
        /* loaded from: classes.dex */
        public class C2103a extends BroadcastReceiver {
            public C2103a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC2102q.this.mo64593d();
            }
        }

        public AbstractC2102q() {
        }

        /* renamed from: a */
        public void m64597a() {
            BroadcastReceiver broadcastReceiver = this.f8979a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f8927k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f8979a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo64595b();

        /* renamed from: c */
        public abstract int mo64594c();

        /* renamed from: d */
        public abstract void mo64593d();

        /* renamed from: e */
        public void m64596e() {
            m64597a();
            IntentFilter mo64595b = mo64595b();
            if (mo64595b != null && mo64595b.countActions() != 0) {
                if (this.f8979a == null) {
                    this.f8979a = new C2103a();
                }
                AppCompatDelegateImpl.this.f8927k.registerReceiver(this.f8979a, mo64595b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$r */
    /* loaded from: classes.dex */
    public class C2104r extends AbstractC2102q {

        /* renamed from: c */
        public final NV1 f8982c;

        public C2104r(NV1 nv1) {
            super();
            this.f8982c = nv1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC2102q
        /* renamed from: b */
        public IntentFilter mo64595b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC2102q
        /* renamed from: c */
        public int mo64594c() {
            if (this.f8982c.m67213d()) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC2102q
        /* renamed from: d */
        public void mo64593d() {
            AppCompatDelegateImpl.this.applyDayNight();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$s */
    /* loaded from: classes.dex */
    public static class C2105s {
        /* renamed from: a */
        public static void m64592a(android.view.ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$t */
    /* loaded from: classes.dex */
    public class C2106t extends ContentFrameLayout {
        public C2106t(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final boolean m64591a(int i, int i2) {
            if (i >= -5 && i2 >= -5 && i <= getWidth() + 5 && i2 <= getHeight() + 5) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!AppCompatDelegateImpl.this.m64678E(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m64591a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                AppCompatDelegateImpl.this.m64621z(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$u */
    /* loaded from: classes.dex */
    public final class C2107u implements MenuPresenter.Callback {
        public C2107u() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            boolean z2;
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            if (rootMenu != menuBuilder) {
                z2 = true;
            } else {
                z2 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                menuBuilder = rootMenu;
            }
            PanelFeatureState m64673J = appCompatDelegateImpl.m64673J(menuBuilder);
            if (m64673J != null) {
                if (z2) {
                    AppCompatDelegateImpl.this.m64627w(m64673J.f8943a, m64673J, rootMenu);
                    AppCompatDelegateImpl.this.m64684A(m64673J, true);
                    return;
                }
                AppCompatDelegateImpl.this.m64684A(m64673J, z);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback m64664S;
            if (menuBuilder == menuBuilder.getRootMenu()) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (appCompatDelegateImpl.f8897G && (m64664S = appCompatDelegateImpl.m64664S()) != null && !AppCompatDelegateImpl.this.f8908R) {
                    m64664S.onMenuOpened(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, menuBuilder);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    public AppCompatDelegateImpl(Activity activity, AppCompatCallback appCompatCallback) {
        this(activity, null, appCompatCallback, activity);
    }

    /* renamed from: K */
    public static Configuration m64672K(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C2097l.m64610a(configuration, configuration2, configuration3);
            } else if (!ObjectsCompat.equals(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & CertificateHolderAuthorization.CVCA;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & CertificateHolderAuthorization.CVCA)) {
                configuration3.screenLayout |= i21 & CertificateHolderAuthorization.CVCA;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & ViewUtils.EDGE_TO_EDGE_FLAGS)) {
                configuration3.screenLayout |= i25 & ViewUtils.EDGE_TO_EDGE_FLAGS;
            }
            if (i5 >= 26) {
                C2098m.m64606a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            C2095j.m64615b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: A */
    public void m64684A(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z && panelFeatureState.f8943a == 0 && (decorContentParent = this.f8934r) != null && decorContentParent.isOverflowMenuShowing()) {
            m64625x(panelFeatureState.f8952j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f8927k.getSystemService("window");
        if (windowManager != null && panelFeatureState.f8957o && (viewGroup = panelFeatureState.f8949g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m64627w(panelFeatureState.f8943a, panelFeatureState, null);
            }
        }
        panelFeatureState.f8955m = false;
        panelFeatureState.f8956n = false;
        panelFeatureState.f8957o = false;
        panelFeatureState.f8950h = null;
        panelFeatureState.f8958p = true;
        if (this.f8904N == panelFeatureState) {
            this.f8904N = null;
        }
        if (panelFeatureState.f8943a == 0) {
            m64622y0();
        }
    }

    /* renamed from: A0 */
    public final int m64683A0(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int i;
        boolean z;
        int systemWindowInsetLeft;
        int systemWindowInsetRight;
        boolean z2;
        int i2 = 0;
        if (windowInsetsCompat != null) {
            i = windowInsetsCompat.getSystemWindowInsetTop();
        } else if (rect != null) {
            i = rect.top;
        } else {
            i = 0;
        }
        ActionBarContextView actionBarContextView = this.f8938v;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8938v.getLayoutParams();
            boolean z3 = true;
            if (this.f8938v.isShown()) {
                if (this.f8920d0 == null) {
                    this.f8920d0 = new Rect();
                    this.f8921e0 = new Rect();
                }
                Rect rect2 = this.f8920d0;
                Rect rect3 = this.f8921e0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                }
                androidx.appcompat.widget.ViewUtils.computeFitSystemWindows(this.f8892B, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.f8892B);
                if (rootWindowInsets == null) {
                    systemWindowInsetLeft = 0;
                } else {
                    systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
                }
                if (rootWindowInsets == null) {
                    systemWindowInsetRight = 0;
                } else {
                    systemWindowInsetRight = rootWindowInsets.getSystemWindowInsetRight();
                }
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 > 0 && this.f8894D == null) {
                    View view = new View(this.f8927k);
                    this.f8894D = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    this.f8892B.addView(this.f8894D, -1, layoutParams);
                } else {
                    View view2 = this.f8894D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            this.f8894D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f8894D;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m64681B0(this.f8894D);
                }
                if (!this.f8899I && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f8938v.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view4 = this.f8894D;
        if (view4 != null) {
            if (!z) {
                i2 = 8;
            }
            view4.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: B */
    public final Configuration m64682B(Context context, int i, LocaleListCompat localeListCompat, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            m64641o0(configuration2, localeListCompat);
        }
        return configuration2;
    }

    /* renamed from: B0 */
    public final void m64681B0(View view) {
        int color;
        if ((ViewCompat.getWindowSystemUiVisibility(view) & 8192) != 0) {
            color = ContextCompat.getColor(this.f8927k, R.color.abc_decor_view_status_guard_light);
        } else {
            color = ContextCompat.getColor(this.f8927k, R.color.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(color);
    }

    /* renamed from: C */
    public final ViewGroup m64680C() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f8927k.obtainStyledAttributes(R.styleable.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false)) {
                requestWindowFeature(1);
            } else if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBar, false)) {
                requestWindowFeature(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
            }
            if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                requestWindowFeature(109);
            }
            if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                requestWindowFeature(10);
            }
            this.f8900J = obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m64674I();
            this.f8928l.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f8927k);
            if (!this.f8901K) {
                if (this.f8900J) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.f8898H = false;
                    this.f8897G = false;
                } else if (this.f8897G) {
                    TypedValue typedValue = new TypedValue();
                    this.f8927k.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new ContextThemeWrapper(this.f8927k, typedValue.resourceId);
                    } else {
                        context = this.f8927k;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f8934r = decorContentParent;
                    decorContentParent.setWindowCallback(m64664S());
                    if (this.f8898H) {
                        this.f8934r.initFeature(109);
                    }
                    if (this.f8895E) {
                        this.f8934r.initFeature(2);
                    }
                    if (this.f8896F) {
                        this.f8934r.initFeature(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.f8899I ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
            }
            if (viewGroup != null) {
                ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new C2085b());
                if (this.f8934r == null) {
                    this.f8893C = (TextView) viewGroup.findViewById(R.id.title);
                }
                androidx.appcompat.widget.ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f8928l.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f8928l.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C2086c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f8897G + ", windowActionBarOverlay: " + this.f8898H + ", android:windowIsFloating: " + this.f8900J + ", windowActionModeOverlay: " + this.f8899I + ", windowNoTitle: " + this.f8901K + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: D */
    public void m64679D() {
        MenuBuilder menuBuilder;
        DecorContentParent decorContentParent = this.f8934r;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.f8939w != null) {
            this.f8928l.getDecorView().removeCallbacks(this.f8940x);
            if (this.f8939w.isShowing()) {
                try {
                    this.f8939w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f8939w = null;
        }
        m64676G();
        PanelFeatureState m64666Q = m64666Q(0, false);
        if (m64666Q != null && (menuBuilder = m64666Q.f8952j) != null) {
            menuBuilder.close();
        }
    }

    /* renamed from: E */
    public boolean m64678E(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f8926j;
        if (((obj instanceof KeyEventDispatcher.Component) || (obj instanceof AppCompatDialog)) && (decorView = this.f8928l.getDecorView()) != null && KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f8929m.m64602a(this.f8928l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            return m64656a0(keyCode, keyEvent);
        }
        return m64652d0(keyCode, keyEvent);
    }

    /* renamed from: F */
    public void m64677F(int i) {
        PanelFeatureState m64666Q;
        PanelFeatureState m64666Q2 = m64666Q(i, true);
        if (m64666Q2.f8952j != null) {
            Bundle bundle = new Bundle();
            m64666Q2.f8952j.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                m64666Q2.f8960r = bundle;
            }
            m64666Q2.f8952j.stopDispatchingItemsChanged();
            m64666Q2.f8952j.clear();
        }
        m64666Q2.f8959q = true;
        m64666Q2.f8958p = true;
        if ((i == 108 || i == 0) && this.f8934r != null && (m64666Q = m64666Q(0, false)) != null) {
            m64666Q.f8955m = false;
            m64644l0(m64666Q, null);
        }
    }

    /* renamed from: G */
    public void m64676G() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f8941y;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
    }

    /* renamed from: H */
    public final void m64675H() {
        if (!this.f8891A) {
            this.f8892B = m64680C();
            CharSequence m64665R = m64665R();
            if (!TextUtils.isEmpty(m64665R)) {
                DecorContentParent decorContentParent = this.f8934r;
                if (decorContentParent != null) {
                    decorContentParent.setWindowTitle(m64665R);
                } else if (m64646j0() != null) {
                    m64646j0().setWindowTitle(m64665R);
                } else {
                    TextView textView = this.f8893C;
                    if (textView != null) {
                        textView.setText(m64665R);
                    }
                }
            }
            m64635s();
            m64648h0(this.f8892B);
            this.f8891A = true;
            PanelFeatureState m64666Q = m64666Q(0, false);
            if (!this.f8908R) {
                if (m64666Q == null || m64666Q.f8952j == null) {
                    m64659X(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
                }
            }
        }
    }

    /* renamed from: I */
    public final void m64674I() {
        if (this.f8928l == null) {
            Object obj = this.f8926j;
            if (obj instanceof Activity) {
                m64633t(((Activity) obj).getWindow());
            }
        }
        if (this.f8928l != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    /* renamed from: J */
    public PanelFeatureState m64673J(Menu menu) {
        int i;
        PanelFeatureState[] panelFeatureStateArr = this.f8903M;
        if (panelFeatureStateArr != null) {
            i = panelFeatureStateArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.f8952j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: L */
    public final Context m64671L() {
        Context context;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            context = supportActionBar.getThemedContext();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f8927k;
        }
        return context;
    }

    /* renamed from: M */
    public final int m64670M(Context context) {
        int i;
        if (!this.f8913W && (this.f8926j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    i = 269221888;
                } else if (i2 >= 24) {
                    i = 786432;
                } else {
                    i = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f8926j.getClass()), i);
                if (activityInfo != null) {
                    this.f8912V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f8912V = 0;
            }
        }
        this.f8913W = true;
        return this.f8912V;
    }

    /* renamed from: N */
    public final AbstractC2102q m64669N(Context context) {
        if (this.f8915Y == null) {
            this.f8915Y = new C2101p(context);
        }
        return this.f8915Y;
    }

    /* renamed from: O */
    public final AbstractC2102q m64668O(Context context) {
        if (this.f8914X == null) {
            this.f8914X = new C2104r(NV1.m67216a(context));
        }
        return this.f8914X;
    }

    /* renamed from: P */
    public LocaleListCompat m64667P(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C2097l.m64609b(configuration);
        }
        return LocaleListCompat.forLanguageTags(C2096k.m64611b(configuration.locale));
    }

    /* renamed from: Q */
    public PanelFeatureState m64666Q(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f8903M;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f8903M = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
            panelFeatureStateArr[i] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    /* renamed from: R */
    public final CharSequence m64665R() {
        Object obj = this.f8926j;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f8933q;
    }

    /* renamed from: S */
    public final Window.Callback m64664S() {
        return this.f8928l.getCallback();
    }

    /* renamed from: T */
    public final void m64663T() {
        m64675H();
        if (this.f8897G && this.f8931o == null) {
            Object obj = this.f8926j;
            if (obj instanceof Activity) {
                this.f8931o = new WindowDecorActionBar((Activity) this.f8926j, this.f8898H);
            } else if (obj instanceof Dialog) {
                this.f8931o = new WindowDecorActionBar((Dialog) this.f8926j);
            }
            ActionBar actionBar = this.f8931o;
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled(this.f8919c0);
            }
        }
    }

    /* renamed from: U */
    public final boolean m64662U(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f8951i;
        if (view != null) {
            panelFeatureState.f8950h = view;
            return true;
        } else if (panelFeatureState.f8952j == null) {
            return false;
        } else {
            if (this.f8936t == null) {
                this.f8936t = new C2107u();
            }
            View view2 = (View) panelFeatureState.m64619a(this.f8936t);
            panelFeatureState.f8950h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: V */
    public final boolean m64661V(PanelFeatureState panelFeatureState) {
        panelFeatureState.m64617c(m64671L());
        panelFeatureState.f8949g = new C2106t(panelFeatureState.f8954l);
        panelFeatureState.f8945c = 81;
        return true;
    }

    /* renamed from: W */
    public final boolean m64660W(PanelFeatureState panelFeatureState) {
        Resources.Theme theme;
        Context context = this.f8927k;
        int i = panelFeatureState.f8943a;
        if ((i == 0 || i == 108) && this.f8934r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(theme);
                context = contextThemeWrapper;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.setCallback(this);
        panelFeatureState.m64618b(menuBuilder);
        return true;
    }

    /* renamed from: X */
    public final void m64659X(int i) {
        this.f8917a0 = (1 << i) | this.f8917a0;
        if (!this.f8916Z) {
            ViewCompat.postOnAnimation(this.f8928l.getDecorView(), this.f8918b0);
            this.f8916Z = true;
        }
    }

    /* renamed from: Y */
    public int m64658Y(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        return m64669N(context).mo64594c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return m64668O(context).mo64594c();
            }
        }
        return i;
    }

    /* renamed from: Z */
    public boolean m64657Z() {
        boolean z = this.f8905O;
        this.f8905O = false;
        PanelFeatureState m64666Q = m64666Q(0, false);
        if (m64666Q != null && m64666Q.f8957o) {
            if (!z) {
                m64684A(m64666Q, true);
            }
            return true;
        }
        ActionMode actionMode = this.f8937u;
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null || !supportActionBar.collapseActionView()) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public boolean m64656a0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i != 4) {
            if (i == 82) {
                m64655b0(0, keyEvent);
                return true;
            }
        } else {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f8905O = z;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m64675H();
        ((ViewGroup) this.f8892B.findViewById(16908290)).addView(view, layoutParams);
        this.f8929m.m64601b(this.f8928l.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean applyDayNight() {
        return m64639q(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context attachBaseContext2(Context context) {
        Configuration configuration;
        this.f8906P = true;
        int m64658Y = m64658Y(context, m64629v());
        if (AppCompatDelegate.m64693k(context)) {
            AppCompatDelegate.m64688p(context);
        }
        LocaleListCompat m64631u = m64631u(context);
        if (f8890n0 && (context instanceof android.view.ContextThemeWrapper)) {
            try {
                C2105s.m64592a((android.view.ContextThemeWrapper) context, m64682B(context, m64658Y, m64631u, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m64682B(context, m64658Y, m64631u, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f8889m0) {
            return super.attachBaseContext2(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = C2095j.m64616a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m64672K(configuration3, configuration4);
        } else {
            configuration = null;
        }
        Configuration m64682B = m64682B(context, m64658Y, m64631u, configuration, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_AppCompat_Empty);
        contextThemeWrapper.applyOverrideConfiguration(m64682B);
        try {
            if (context.getTheme() != null) {
                ResourcesCompat.ThemeCompat.rebase(contextThemeWrapper.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.attachBaseContext2(contextThemeWrapper);
    }

    /* renamed from: b0 */
    public final boolean m64655b0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState m64666Q = m64666Q(i, true);
            if (!m64666Q.f8957o) {
                return m64644l0(m64666Q, keyEvent);
            }
            return false;
        }
        return false;
    }

    /* renamed from: c0 */
    public boolean m64654c0(int i, KeyEvent keyEvent) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.onKeyShortcut(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f8904N;
        if (panelFeatureState != null && m64645k0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.f8904N;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f8956n = true;
            }
            return true;
        }
        if (this.f8904N == null) {
            PanelFeatureState m64666Q = m64666Q(0, true);
            m64644l0(m64666Q, keyEvent);
            boolean m64645k0 = m64645k0(m64666Q, keyEvent.getKeyCode(), keyEvent, 1);
            m64666Q.f8955m = false;
            if (m64645k0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public View createView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (this.f8922f0 == null) {
            String string = this.f8927k.obtainStyledAttributes(R.styleable.AppCompatTheme).getString(R.styleable.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f8922f0 = new AppCompatViewInflater();
            } else {
                try {
                    this.f8922f0 = (AppCompatViewInflater) this.f8927k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    this.f8922f0 = new AppCompatViewInflater();
                }
            }
        }
        boolean z2 = f8887k0;
        boolean z3 = false;
        if (z2) {
            if (this.f8923g0 == null) {
                this.f8923g0 = new C20081gi0();
            }
            if (this.f8923g0.m31062a(attributeSet)) {
                z = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                        z3 = true;
                    }
                } else {
                    z3 = m64636r0((ViewParent) view);
                }
                z = z3;
            }
        } else {
            z = false;
        }
        return this.f8922f0.createView(view, str, context, attributeSet, z, z2, true, VectorEnabledTintResources.shouldBeUsed());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: d */
    public boolean mo64653d() {
        if (AppCompatDelegate.m64693k(this.f8927k) && AppCompatDelegate.m64695i() != null && !AppCompatDelegate.m64695i().equals(AppCompatDelegate.m64694j())) {
            m64697g(this.f8927k);
        }
        return m64639q(true);
    }

    /* renamed from: d0 */
    public boolean m64652d0(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                m64651e0(0, keyEvent);
                return true;
            }
        } else if (m64657Z()) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public final boolean m64651e0(int i, KeyEvent keyEvent) {
        boolean z;
        DecorContentParent decorContentParent;
        if (this.f8937u != null) {
            return false;
        }
        boolean z2 = true;
        PanelFeatureState m64666Q = m64666Q(i, true);
        if (i == 0 && (decorContentParent = this.f8934r) != null && decorContentParent.canShowOverflowMenu() && !ViewConfiguration.get(this.f8927k).hasPermanentMenuKey()) {
            if (!this.f8934r.isOverflowMenuShowing()) {
                if (!this.f8908R && m64644l0(m64666Q, keyEvent)) {
                    z2 = this.f8934r.showOverflowMenu();
                }
                z2 = false;
            } else {
                z2 = this.f8934r.hideOverflowMenu();
            }
        } else {
            boolean z3 = m64666Q.f8957o;
            if (!z3 && !m64666Q.f8956n) {
                if (m64666Q.f8955m) {
                    if (m64666Q.f8959q) {
                        m64666Q.f8955m = false;
                        z = m64644l0(m64666Q, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        m64647i0(m64666Q, keyEvent);
                    }
                }
                z2 = false;
            } else {
                m64684A(m64666Q, true);
                z2 = z3;
            }
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f8927k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    /* renamed from: f0 */
    public void m64650f0(int i) {
        ActionBar supportActionBar;
        if (i == 108 && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.dispatchMenuVisibilityChanged(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public View findViewById(int i) {
        m64675H();
        return this.f8928l.findViewById(i);
    }

    /* renamed from: g0 */
    public void m64649g0(int i) {
        if (i == 108) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(false);
            }
        } else if (i == 0) {
            PanelFeatureState m64666Q = m64666Q(i, true);
            if (m64666Q.f8957o) {
                m64684A(m64666Q, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context getContextForDelegate() {
        return this.f8927k;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return new C2090f();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int getLocalNightMode() {
        return this.f8910T;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public MenuInflater getMenuInflater() {
        Context context;
        if (this.f8932p == null) {
            m64663T();
            ActionBar actionBar = this.f8931o;
            if (actionBar != null) {
                context = actionBar.getThemedContext();
            } else {
                context = this.f8927k;
            }
            this.f8932p = new SupportMenuInflater(context);
        }
        return this.f8932p;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionBar getSupportActionBar() {
        m64663T();
        return this.f8931o;
    }

    /* renamed from: h0 */
    public void m64648h0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean hasWindowFeature(int i) {
        boolean z;
        int m64642n0 = m64642n0(i);
        if (m64642n0 != 1) {
            if (m64642n0 != 2) {
                if (m64642n0 != 5) {
                    if (m64642n0 != 10) {
                        if (m64642n0 != 108) {
                            if (m64642n0 != 109) {
                                z = false;
                            } else {
                                z = this.f8898H;
                            }
                        } else {
                            z = this.f8897G;
                        }
                    } else {
                        z = this.f8899I;
                    }
                } else {
                    z = this.f8896F;
                }
            } else {
                z = this.f8895E;
            }
        } else {
            z = this.f8901K;
        }
        if (z || this.f8928l.hasFeature(i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m64647i0(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m64647i0(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void installViewFactory() {
        LayoutInflater from = LayoutInflater.from(this.f8927k);
        if (from.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(from, this);
        } else {
            boolean z = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void invalidateOptionsMenu() {
        if (m64646j0() != null && !getSupportActionBar().invalidateOptionsMenu()) {
            m64659X(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
        return this.f8942z;
    }

    /* renamed from: j0 */
    public final ActionBar m64646j0() {
        return this.f8931o;
    }

    /* renamed from: k0 */
    public final boolean m64645k0(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        MenuBuilder menuBuilder;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f8955m || m64644l0(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.f8952j) != null) {
            z = menuBuilder.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f8934r == null) {
            m64684A(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: l0 */
    public final boolean m64644l0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        DecorContentParent decorContentParent;
        int i;
        boolean z2;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (this.f8908R) {
            return false;
        }
        if (panelFeatureState.f8955m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f8904N;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            m64684A(panelFeatureState2, false);
        }
        Window.Callback m64664S = m64664S();
        if (m64664S != null) {
            panelFeatureState.f8951i = m64664S.onCreatePanelView(panelFeatureState.f8943a);
        }
        int i2 = panelFeatureState.f8943a;
        if (i2 != 0 && i2 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (decorContentParent3 = this.f8934r) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (panelFeatureState.f8951i == null && (!z || !(m64646j0() instanceof C2117c))) {
            MenuBuilder menuBuilder = panelFeatureState.f8952j;
            if (menuBuilder == null || panelFeatureState.f8959q) {
                if (menuBuilder == null && (!m64660W(panelFeatureState) || panelFeatureState.f8952j == null)) {
                    return false;
                }
                if (z && this.f8934r != null) {
                    if (this.f8935s == null) {
                        this.f8935s = new C2092h();
                    }
                    this.f8934r.setMenu(panelFeatureState.f8952j, this.f8935s);
                }
                panelFeatureState.f8952j.stopDispatchingItemsChanged();
                if (!m64664S.onCreatePanelMenu(panelFeatureState.f8943a, panelFeatureState.f8952j)) {
                    panelFeatureState.m64618b(null);
                    if (z && (decorContentParent = this.f8934r) != null) {
                        decorContentParent.setMenu(null, this.f8935s);
                    }
                    return false;
                }
                panelFeatureState.f8959q = false;
            }
            panelFeatureState.f8952j.stopDispatchingItemsChanged();
            Bundle bundle = panelFeatureState.f8960r;
            if (bundle != null) {
                panelFeatureState.f8952j.restoreActionViewStates(bundle);
                panelFeatureState.f8960r = null;
            }
            if (!m64664S.onPreparePanel(0, panelFeatureState.f8951i, panelFeatureState.f8952j)) {
                if (z && (decorContentParent2 = this.f8934r) != null) {
                    decorContentParent2.setMenu(null, this.f8935s);
                }
                panelFeatureState.f8952j.startDispatchingItemsChanged();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            panelFeatureState.qwertyMode = z2;
            panelFeatureState.f8952j.setQwertyMode(z2);
            panelFeatureState.f8952j.startDispatchingItemsChanged();
        }
        panelFeatureState.f8955m = true;
        panelFeatureState.f8956n = false;
        this.f8904N = panelFeatureState;
        return true;
    }

    /* renamed from: m0 */
    public final void m64643m0(boolean z) {
        DecorContentParent decorContentParent = this.f8934r;
        if (decorContentParent != null && decorContentParent.canShowOverflowMenu() && (!ViewConfiguration.get(this.f8927k).hasPermanentMenuKey() || this.f8934r.isOverflowMenuShowPending())) {
            Window.Callback m64664S = m64664S();
            if (this.f8934r.isOverflowMenuShowing() && z) {
                this.f8934r.hideOverflowMenu();
                if (!this.f8908R) {
                    m64664S.onPanelClosed(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, m64666Q(0, true).f8952j);
                    return;
                }
                return;
            } else if (m64664S != null && !this.f8908R) {
                if (this.f8916Z && (this.f8917a0 & 1) != 0) {
                    this.f8928l.getDecorView().removeCallbacks(this.f8918b0);
                    this.f8918b0.run();
                }
                PanelFeatureState m64666Q = m64666Q(0, true);
                MenuBuilder menuBuilder = m64666Q.f8952j;
                if (menuBuilder != null && !m64666Q.f8959q && m64664S.onPreparePanel(0, m64666Q.f8951i, menuBuilder)) {
                    m64664S.onMenuOpened(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, m64666Q.f8952j);
                    this.f8934r.showOverflowMenu();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        PanelFeatureState m64666Q2 = m64666Q(0, true);
        m64666Q2.f8958p = true;
        m64684A(m64666Q2, false);
        m64647i0(m64666Q2, null);
    }

    /* renamed from: n0 */
    public final int m64642n0(int i) {
        if (i == 8) {
            return AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    /* renamed from: o0 */
    public void m64641o0(Configuration configuration, LocaleListCompat localeListCompat) {
        if (Build.VERSION.SDK_INT >= 24) {
            C2097l.m64607d(configuration, localeListCompat);
            return;
        }
        C2095j.m64613d(configuration, localeListCompat.get(0));
        C2095j.m64614c(configuration, localeListCompat.get(0));
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onConfigurationChanged(Configuration configuration) {
        ActionBar supportActionBar;
        if (this.f8897G && this.f8891A && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.onConfigurationChanged(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.f8927k);
        this.f8909S = new Configuration(this.f8927k.getResources().getConfiguration());
        m64637r(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onCreate(Bundle bundle) {
        String str;
        this.f8906P = true;
        m64639q(false);
        m64674I();
        Object obj = this.f8926j;
        if (obj instanceof Activity) {
            try {
                str = NavUtils.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar m64646j0 = m64646j0();
                if (m64646j0 == null) {
                    this.f8919c0 = true;
                } else {
                    m64646j0.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            AppCompatDelegate.m64700c(this);
        }
        this.f8909S = new Configuration(this.f8927k.getResources().getConfiguration());
        this.f8907Q = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return createView(view, str, context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f8926j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AppCompatDelegate.m64690n(r3)
        L9:
            boolean r0 = r3.f8916Z
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f8928l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f8918b0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f8908R = r0
            int r0 = r3.f8910T
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f8926j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.SimpleArrayMap r0 = androidx.appcompat.app.AppCompatDelegateImpl.f8886j0
            java.lang.Object r1 = r3.f8926j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f8910T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.SimpleArrayMap r0 = androidx.appcompat.app.AppCompatDelegateImpl.f8886j0
            java.lang.Object r1 = r3.f8926j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.ActionBar r0 = r3.f8931o
            if (r0 == 0) goto L5b
            r0.mo64562a()
        L5b:
            r3.m64623y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onDestroy():void");
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState m64673J;
        Window.Callback m64664S = m64664S();
        if (m64664S != null && !this.f8908R && (m64673J = m64673J(menuBuilder.getRootMenu())) != null) {
            return m64664S.onMenuItemSelected(m64673J.f8943a, menuItem);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        m64643m0(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostCreate(Bundle bundle) {
        m64675H();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostResume() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStart() {
        m64637r(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStop() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }

    /* renamed from: p0 */
    public void m64640p0(LocaleListCompat localeListCompat) {
        if (Build.VERSION.SDK_INT >= 24) {
            C2097l.m64608c(localeListCompat);
        } else {
            Locale.setDefault(localeListCompat.get(0));
        }
    }

    /* renamed from: q */
    public final boolean m64639q(boolean z) {
        return m64637r(z, true);
    }

    /* renamed from: q0 */
    public final boolean m64638q0() {
        ViewGroup viewGroup;
        if (this.f8891A && (viewGroup = this.f8892B) != null && ViewCompat.isLaidOut(viewGroup)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m64637r(boolean z, boolean z2) {
        LocaleListCompat localeListCompat;
        if (this.f8908R) {
            return false;
        }
        int m64629v = m64629v();
        int m64658Y = m64658Y(this.f8927k, m64629v);
        if (Build.VERSION.SDK_INT < 33) {
            localeListCompat = m64631u(this.f8927k);
        } else {
            localeListCompat = null;
        }
        if (!z2 && localeListCompat != null) {
            localeListCompat = m64667P(this.f8927k.getResources().getConfiguration());
        }
        boolean m64624x0 = m64624x0(m64658Y, localeListCompat, z);
        if (m64629v == 0) {
            m64668O(this.f8927k).m64596e();
        } else {
            AbstractC2102q abstractC2102q = this.f8914X;
            if (abstractC2102q != null) {
                abstractC2102q.m64597a();
            }
        }
        if (m64629v == 3) {
            m64669N(this.f8927k).m64596e();
        } else {
            AbstractC2102q abstractC2102q2 = this.f8915Y;
            if (abstractC2102q2 != null) {
                abstractC2102q2.m64597a();
            }
        }
        return m64624x0;
    }

    /* renamed from: r0 */
    public final boolean m64636r0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f8928l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ViewCompat.isAttachedToWindow((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean requestWindowFeature(int i) {
        int m64642n0 = m64642n0(i);
        if (this.f8901K && m64642n0 == 108) {
            return false;
        }
        if (this.f8897G && m64642n0 == 1) {
            this.f8897G = false;
        }
        if (m64642n0 != 1) {
            if (m64642n0 != 2) {
                if (m64642n0 != 5) {
                    if (m64642n0 != 10) {
                        if (m64642n0 != 108) {
                            if (m64642n0 != 109) {
                                return this.f8928l.requestFeature(m64642n0);
                            }
                            m64630u0();
                            this.f8898H = true;
                            return true;
                        }
                        m64630u0();
                        this.f8897G = true;
                        return true;
                    }
                    m64630u0();
                    this.f8899I = true;
                    return true;
                }
                m64630u0();
                this.f8896F = true;
                return true;
            }
            m64630u0();
            this.f8895E = true;
            return true;
        }
        m64630u0();
        this.f8901K = true;
        return true;
    }

    /* renamed from: s */
    public final void m64635s() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f8892B.findViewById(16908290);
        View decorView = this.f8928l.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f8927k.obtainStyledAttributes(R.styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: s0 */
    public boolean m64634s0() {
        if (this.f8924h0 == null) {
            return false;
        }
        PanelFeatureState m64666Q = m64666Q(0, false);
        if ((m64666Q == null || !m64666Q.f8957o) && this.f8937u == null) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(View view) {
        m64675H();
        ViewGroup viewGroup = (ViewGroup) this.f8892B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f8929m.m64601b(this.f8928l.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean z) {
        this.f8942z = z;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setLocalNightMode(int i) {
        if (this.f8910T != i) {
            this.f8910T = i;
            if (this.f8906P) {
                applyDayNight();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f8924h0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f8925i0) != null) {
            C2099n.m64603c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f8925i0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f8926j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f8924h0 = C2099n.m64605a((Activity) this.f8926j);
                m64622y0();
            }
        }
        this.f8924h0 = onBackInvokedDispatcher;
        m64622y0();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setSupportActionBar(Toolbar toolbar) {
        if (!(this.f8926j instanceof Activity)) {
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (!(supportActionBar instanceof WindowDecorActionBar)) {
            this.f8932p = null;
            if (supportActionBar != null) {
                supportActionBar.mo64562a();
            }
            this.f8931o = null;
            if (toolbar != null) {
                C2117c c2117c = new C2117c(toolbar, m64665R(), this.f8929m);
                this.f8931o = c2117c;
                this.f8929m.m64599d(c2117c.f9056c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f8929m.m64599d(null);
            }
            invalidateOptionsMenu();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setTheme(int i) {
        this.f8911U = i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(CharSequence charSequence) {
        this.f8933q = charSequence;
        DecorContentParent decorContentParent = this.f8934r;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
        } else if (m64646j0() != null) {
            m64646j0().setWindowTitle(charSequence);
        } else {
            TextView textView = this.f8893C;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionMode startSupportActionMode(ActionMode.Callback callback) {
        AppCompatCallback appCompatCallback;
        if (callback != null) {
            ActionMode actionMode = this.f8937u;
            if (actionMode != null) {
                actionMode.finish();
            }
            C2093i c2093i = new C2093i(callback);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                ActionMode startActionMode = supportActionBar.startActionMode(c2093i);
                this.f8937u = startActionMode;
                if (startActionMode != null && (appCompatCallback = this.f8930n) != null) {
                    appCompatCallback.onSupportActionModeStarted(startActionMode);
                }
            }
            if (this.f8937u == null) {
                this.f8937u = m64632t0(c2093i);
            }
            m64622y0();
            return this.f8937u;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: t */
    public final void m64633t(Window window) {
        if (this.f8928l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C2100o)) {
                C2100o c2100o = new C2100o(callback);
                this.f8929m = c2100o;
                window.setCallback(c2100o);
                TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f8927k, (AttributeSet) null, f8888l0);
                Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
                if (drawableIfKnown != null) {
                    window.setBackgroundDrawable(drawableIfKnown);
                }
                obtainStyledAttributes.recycle();
                this.f8928l = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f8924h0 == null) {
                    setOnBackInvokedDispatcher(null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.appcompat.view.ActionMode m64632t0(androidx.appcompat.view.ActionMode.Callback r8) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m64632t0(androidx.appcompat.view.ActionMode$Callback):androidx.appcompat.view.ActionMode");
    }

    /* renamed from: u */
    public LocaleListCompat m64631u(Context context) {
        LocaleListCompat m64695i;
        LocaleListCompat forLanguageTags;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (m64695i = AppCompatDelegate.m64695i()) == null) {
            return null;
        }
        LocaleListCompat m64667P = m64667P(context.getApplicationContext().getResources().getConfiguration());
        if (i >= 24) {
            forLanguageTags = AbstractC19915fk0.m31259b(m64695i, m64667P);
        } else if (m64695i.isEmpty()) {
            forLanguageTags = LocaleListCompat.getEmptyLocaleList();
        } else {
            forLanguageTags = LocaleListCompat.forLanguageTags(m64695i.get(0).toString());
        }
        if (!forLanguageTags.isEmpty()) {
            return forLanguageTags;
        }
        return m64667P;
    }

    /* renamed from: u0 */
    public final void m64630u0() {
        if (!this.f8891A) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    /* renamed from: v */
    public final int m64629v() {
        int i = this.f8910T;
        if (i == -100) {
            return AppCompatDelegate.getDefaultNightMode();
        }
        return i;
    }

    /* renamed from: v0 */
    public final AppCompatActivity m64628v0() {
        for (Context context = this.f8927k; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: w */
    public void m64627w(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f8903M;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f8952j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f8957o) && !this.f8908R) {
            this.f8929m.m64600c(this.f8928l.getCallback(), i, menu);
        }
    }

    /* renamed from: w0 */
    public final void m64626w0(Configuration configuration) {
        Activity activity = (Activity) this.f8926j;
        if (activity instanceof LifecycleOwner) {
            if (((LifecycleOwner) activity).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.f8907Q && !this.f8908R) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* renamed from: x */
    public void m64625x(MenuBuilder menuBuilder) {
        if (this.f8902L) {
            return;
        }
        this.f8902L = true;
        this.f8934r.dismissPopups();
        Window.Callback m64664S = m64664S();
        if (m64664S != null && !this.f8908R) {
            m64664S.onPanelClosed(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, menuBuilder);
        }
        this.f8902L = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m64624x0(int r9, androidx.core.p005os.LocaleListCompat r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f8927k
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.m64682B(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f8927k
            int r1 = r8.m64670M(r1)
            android.content.res.Configuration r2 = r8.f8909S
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f8927k
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.LocaleListCompat r2 = r8.m64667P(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.LocaleListCompat r0 = r8.m64667P(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.175E-43)
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r0 == 0) goto L45
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L45
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L6f
            if (r11 == 0) goto L6f
            boolean r11 = r8.f8906P
            if (r11 == 0) goto L6f
            boolean r11 = androidx.appcompat.app.AppCompatDelegateImpl.f8889m0
            if (r11 != 0) goto L58
            boolean r11 = r8.f8907Q
            if (r11 == 0) goto L6f
        L58:
            java.lang.Object r11 = r8.f8926j
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L6f
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L6f
            java.lang.Object r11 = r8.f8926j
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.ActivityCompat.recreate(r11)
            r11 = 1
            goto L70
        L6f:
            r11 = 0
        L70:
            if (r11 != 0) goto L7d
            if (r3 == 0) goto L7d
            r11 = r3 & r1
            if (r11 != r3) goto L79
            r6 = 1
        L79:
            r8.m64620z0(r4, r0, r6, r5)
            goto L7e
        L7d:
            r7 = r11
        L7e:
            if (r7 == 0) goto L9a
            java.lang.Object r11 = r8.f8926j
            boolean r1 = r11 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L9a
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L8f
            androidx.appcompat.app.AppCompatActivity r11 = (androidx.appcompat.app.AppCompatActivity) r11
            r11.onNightModeChanged(r9)
        L8f:
            r9 = r3 & 4
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r8.f8926j
            androidx.appcompat.app.AppCompatActivity r9 = (androidx.appcompat.app.AppCompatActivity) r9
            r9.onLocalesChanged(r10)
        L9a:
            if (r7 == 0) goto Laf
            if (r0 == 0) goto Laf
            android.content.Context r9 = r8.f8927k
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.LocaleListCompat r9 = r8.m64667P(r9)
            r8.m64640p0(r9)
        Laf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m64624x0(int, androidx.core.os.LocaleListCompat, boolean):boolean");
    }

    /* renamed from: y */
    public final void m64623y() {
        AbstractC2102q abstractC2102q = this.f8914X;
        if (abstractC2102q != null) {
            abstractC2102q.m64597a();
        }
        AbstractC2102q abstractC2102q2 = this.f8915Y;
        if (abstractC2102q2 != null) {
            abstractC2102q2.m64597a();
        }
    }

    /* renamed from: y0 */
    public void m64622y0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean m64634s0 = m64634s0();
            if (m64634s0 && this.f8925i0 == null) {
                this.f8925i0 = C2099n.m64604b(this.f8924h0, this);
            } else if (!m64634s0 && (onBackInvokedCallback = this.f8925i0) != null) {
                C2099n.m64603c(this.f8924h0, onBackInvokedCallback);
            }
        }
    }

    /* renamed from: z */
    public void m64621z(int i) {
        m64684A(m64666Q(i, true), true);
    }

    /* renamed from: z0 */
    public final void m64620z0(int i, LocaleListCompat localeListCompat, boolean z, Configuration configuration) {
        Resources resources = this.f8927k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (localeListCompat != null) {
            m64641o0(configuration2, localeListCompat);
        }
        resources.updateConfiguration(configuration2, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            AbstractC17768Hx1.m68020a(resources);
        }
        int i3 = this.f8911U;
        if (i3 != 0) {
            this.f8927k.setTheme(i3);
            if (i2 >= 23) {
                this.f8927k.getTheme().applyStyle(this.f8911U, true);
            }
        }
        if (z && (this.f8926j instanceof Activity)) {
            m64626w0(configuration2);
        }
    }

    public AppCompatDelegateImpl(Dialog dialog, AppCompatCallback appCompatCallback) {
        this(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback) {
        this(context, window, appCompatCallback, context);
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o */
    /* loaded from: classes.dex */
    public class C2100o extends WindowCallbackWrapper {

        /* renamed from: b */
        public InterfaceC2091g f8972b;

        /* renamed from: c */
        public boolean f8973c;

        /* renamed from: d */
        public boolean f8974d;

        /* renamed from: e */
        public boolean f8975e;

        public C2100o(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: a */
        public boolean m64602a(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f8974d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f8974d = false;
            }
        }

        /* renamed from: b */
        public void m64601b(Window.Callback callback) {
            try {
                this.f8973c = true;
                callback.onContentChanged();
            } finally {
                this.f8973c = false;
            }
        }

        /* renamed from: c */
        public void m64600c(Window.Callback callback, int i, Menu menu) {
            try {
                this.f8975e = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.f8975e = false;
            }
        }

        /* renamed from: d */
        public void m64599d(InterfaceC2091g interfaceC2091g) {
            this.f8972b = interfaceC2091g;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f8974d) {
                return getWrapped().dispatchKeyEvent(keyEvent);
            }
            if (!AppCompatDelegateImpl.this.m64678E(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !AppCompatDelegateImpl.this.m64654c0(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public final android.view.ActionMode m64598e(ActionMode.Callback callback) {
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImpl.this.f8927k, callback);
            androidx.appcompat.view.ActionMode startSupportActionMode = AppCompatDelegateImpl.this.startSupportActionMode(callbackWrapper);
            if (startSupportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(startSupportActionMode);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f8973c) {
                getWrapped().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i == 0 && !(menu instanceof MenuBuilder)) {
                return false;
            }
            return super.onCreatePanelMenu(i, menu);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            InterfaceC2091g interfaceC2091g = this.f8972b;
            if (interfaceC2091g != null && (onCreatePanelView = interfaceC2091g.onCreatePanelView(i)) != null) {
                return onCreatePanelView;
            }
            return super.onCreatePanelView(i);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.m64650f0(i);
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.f8975e) {
                getWrapped().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.m64649g0(i);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder;
            if (menu instanceof MenuBuilder) {
                menuBuilder = (MenuBuilder) menu;
            } else {
                menuBuilder = null;
            }
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            boolean z = true;
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            InterfaceC2091g interfaceC2091g = this.f8972b;
            z = (interfaceC2091g == null || !interfaceC2091g.mo64559a(i)) ? false : false;
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return z;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
            MenuBuilder menuBuilder;
            PanelFeatureState m64666Q = AppCompatDelegateImpl.this.m64666Q(0, true);
            if (m64666Q != null && (menuBuilder = m64666Q.f8952j) != null) {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled()) {
                return m64598e(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled() && i == 0) {
                return m64598e(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    public AppCompatDelegateImpl(Context context, Activity activity, AppCompatCallback appCompatCallback) {
        this(context, null, appCompatCallback, activity);
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        AppCompatActivity m64628v0;
        this.f8941y = null;
        this.f8942z = true;
        this.f8910T = -100;
        this.f8918b0 = new RunnableC2084a();
        this.f8927k = context;
        this.f8930n = appCompatCallback;
        this.f8926j = obj;
        if (this.f8910T == -100 && (obj instanceof Dialog) && (m64628v0 = m64628v0()) != null) {
            this.f8910T = m64628v0.getDelegate().getLocalNightMode();
        }
        if (this.f8910T == -100) {
            SimpleArrayMap simpleArrayMap = f8886j0;
            Integer num = (Integer) simpleArrayMap.get(obj.getClass().getName());
            if (num != null) {
                this.f8910T = num.intValue();
                simpleArrayMap.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            m64633t(window);
        }
        AppCompatDrawableManager.preload();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(int i) {
        m64675H();
        ViewGroup viewGroup = (ViewGroup) this.f8892B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f8927k).inflate(i, viewGroup);
        this.f8929m.m64601b(this.f8928l.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m64675H();
        ViewGroup viewGroup = (ViewGroup) this.f8892B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f8929m.m64601b(this.f8928l.getCallback());
    }
}
