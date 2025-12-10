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
import androidx.appcompat.app.AppCompatDelegateImpl;
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
    public static final SimpleArrayMap f8974j0 = new SimpleArrayMap();

    /* renamed from: k0 */
    public static final boolean f8975k0 = false;

    /* renamed from: l0 */
    public static final int[] f8976l0 = {16842836};

    /* renamed from: m0 */
    public static final boolean f8977m0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: n0 */
    public static final boolean f8978n0 = true;

    /* renamed from: A */
    public boolean f8979A;

    /* renamed from: B */
    public ViewGroup f8980B;

    /* renamed from: C */
    public TextView f8981C;

    /* renamed from: D */
    public View f8982D;

    /* renamed from: E */
    public boolean f8983E;

    /* renamed from: F */
    public boolean f8984F;

    /* renamed from: G */
    public boolean f8985G;

    /* renamed from: H */
    public boolean f8986H;

    /* renamed from: I */
    public boolean f8987I;

    /* renamed from: J */
    public boolean f8988J;

    /* renamed from: K */
    public boolean f8989K;

    /* renamed from: L */
    public boolean f8990L;

    /* renamed from: M */
    public PanelFeatureState[] f8991M;

    /* renamed from: N */
    public PanelFeatureState f8992N;

    /* renamed from: O */
    public boolean f8993O;

    /* renamed from: P */
    public boolean f8994P;

    /* renamed from: Q */
    public boolean f8995Q;

    /* renamed from: R */
    public boolean f8996R;

    /* renamed from: S */
    public Configuration f8997S;

    /* renamed from: T */
    public int f8998T;

    /* renamed from: U */
    public int f8999U;

    /* renamed from: V */
    public int f9000V;

    /* renamed from: W */
    public boolean f9001W;

    /* renamed from: X */
    public AbstractC2084q f9002X;

    /* renamed from: Y */
    public AbstractC2084q f9003Y;

    /* renamed from: Z */
    public boolean f9004Z;

    /* renamed from: a0 */
    public int f9005a0;

    /* renamed from: b0 */
    public final Runnable f9006b0;

    /* renamed from: c0 */
    public boolean f9007c0;

    /* renamed from: d0 */
    public Rect f9008d0;

    /* renamed from: e0 */
    public Rect f9009e0;

    /* renamed from: f0 */
    public AppCompatViewInflater f9010f0;

    /* renamed from: g0 */
    public C21172mi0 f9011g0;

    /* renamed from: h0 */
    public OnBackInvokedDispatcher f9012h0;

    /* renamed from: i0 */
    public OnBackInvokedCallback f9013i0;

    /* renamed from: j */
    public final Object f9014j;

    /* renamed from: k */
    public final Context f9015k;

    /* renamed from: l */
    public Window f9016l;

    /* renamed from: m */
    public C2082o f9017m;

    /* renamed from: n */
    public final AppCompatCallback f9018n;

    /* renamed from: o */
    public ActionBar f9019o;

    /* renamed from: p */
    public MenuInflater f9020p;

    /* renamed from: q */
    public CharSequence f9021q;

    /* renamed from: r */
    public DecorContentParent f9022r;

    /* renamed from: s */
    public C2074h f9023s;

    /* renamed from: t */
    public C2089u f9024t;

    /* renamed from: u */
    public ActionMode f9025u;

    /* renamed from: v */
    public ActionBarContextView f9026v;

    /* renamed from: w */
    public PopupWindow f9027w;

    /* renamed from: x */
    public Runnable f9028x;

    /* renamed from: y */
    public ViewPropertyAnimatorCompat f9029y;

    /* renamed from: z */
    public boolean f9030z;

    /* loaded from: classes.dex */
    public static final class PanelFeatureState {

        /* renamed from: a */
        public int f9031a;

        /* renamed from: b */
        public int f9032b;

        /* renamed from: c */
        public int f9033c;

        /* renamed from: d */
        public int f9034d;

        /* renamed from: e */
        public int f9035e;

        /* renamed from: f */
        public int f9036f;

        /* renamed from: g */
        public ViewGroup f9037g;

        /* renamed from: h */
        public View f9038h;

        /* renamed from: i */
        public View f9039i;

        /* renamed from: j */
        public MenuBuilder f9040j;

        /* renamed from: k */
        public ListMenuPresenter f9041k;

        /* renamed from: l */
        public Context f9042l;

        /* renamed from: m */
        public boolean f9043m;

        /* renamed from: n */
        public boolean f9044n;

        /* renamed from: o */
        public boolean f9045o;

        /* renamed from: p */
        public boolean f9046p = false;

        /* renamed from: q */
        public boolean f9047q;
        public boolean qwertyMode;

        /* renamed from: r */
        public Bundle f9048r;

        public PanelFeatureState(int i) {
            this.f9031a = i;
        }

        /* renamed from: a */
        public MenuView m64570a(MenuPresenter.Callback callback) {
            if (this.f9040j == null) {
                return null;
            }
            if (this.f9041k == null) {
                ListMenuPresenter listMenuPresenter = new ListMenuPresenter(this.f9042l, R.layout.abc_list_menu_item_layout);
                this.f9041k = listMenuPresenter;
                listMenuPresenter.setCallback(callback);
                this.f9040j.addMenuPresenter(this.f9041k);
            }
            return this.f9041k.getMenuView(this.f9037g);
        }

        /* renamed from: b */
        public void m64569b(MenuBuilder menuBuilder) {
            ListMenuPresenter listMenuPresenter;
            MenuBuilder menuBuilder2 = this.f9040j;
            if (menuBuilder == menuBuilder2) {
                return;
            }
            if (menuBuilder2 != null) {
                menuBuilder2.removeMenuPresenter(this.f9041k);
            }
            this.f9040j = menuBuilder;
            if (menuBuilder != null && (listMenuPresenter = this.f9041k) != null) {
                menuBuilder.addMenuPresenter(listMenuPresenter);
            }
        }

        /* renamed from: c */
        public void m64568c(Context context) {
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
            this.f9042l = contextThemeWrapper;
            TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.AppCompatTheme);
            this.f9032b = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTheme_panelBackground, 0);
            this.f9036f = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        public void clearMenuPresenters() {
            MenuBuilder menuBuilder = this.f9040j;
            if (menuBuilder != null) {
                menuBuilder.removeMenuPresenter(this.f9041k);
            }
            this.f9041k = null;
        }

        public boolean hasPanelItems() {
            if (this.f9038h == null) {
                return false;
            }
            if (this.f9039i == null && this.f9041k.getAdapter().getCount() <= 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    /* loaded from: classes.dex */
    public class RunnableC2066a implements Runnable {
        public RunnableC2066a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f9005a0 & 1) != 0) {
                appCompatDelegateImpl.m64628F(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f9005a0 & 4096) != 0) {
                appCompatDelegateImpl2.m64628F(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f9004Z = false;
            appCompatDelegateImpl3.f9005a0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    /* loaded from: classes.dex */
    public class C2067b implements OnApplyWindowInsetsListener {
        public C2067b() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int m64634A0 = AppCompatDelegateImpl.this.m64634A0(windowInsetsCompat, null);
            if (systemWindowInsetTop != m64634A0) {
                windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), m64634A0, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            }
            return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    /* loaded from: classes.dex */
    public class C2068c implements ContentFrameLayout.OnAttachListener {
        public C2068c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
        public void onAttachedFromWindow() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.m64630D();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    /* loaded from: classes.dex */
    public class RunnableC2069d implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d$a */
        /* loaded from: classes.dex */
        public class C2070a extends ViewPropertyAnimatorListenerAdapter {
            public C2070a() {
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationEnd(View view) {
                AppCompatDelegateImpl.this.f9026v.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f9029y.setListener(null);
                AppCompatDelegateImpl.this.f9029y = null;
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationStart(View view) {
                AppCompatDelegateImpl.this.f9026v.setVisibility(0);
            }
        }

        public RunnableC2069d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f9027w.showAtLocation(appCompatDelegateImpl.f9026v, 55, 0, 0);
            AppCompatDelegateImpl.this.m64627G();
            if (AppCompatDelegateImpl.this.m64589q0()) {
                AppCompatDelegateImpl.this.f9026v.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f9029y = ViewCompat.animate(appCompatDelegateImpl2.f9026v).alpha(1.0f);
                AppCompatDelegateImpl.this.f9029y.setListener(new C2070a());
                return;
            }
            AppCompatDelegateImpl.this.f9026v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f9026v.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    /* loaded from: classes.dex */
    public class C2071e extends ViewPropertyAnimatorListenerAdapter {
        public C2071e() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            AppCompatDelegateImpl.this.f9026v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f9029y.setListener(null);
            AppCompatDelegateImpl.this.f9029y = null;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
            AppCompatDelegateImpl.this.f9026v.setVisibility(0);
            if (AppCompatDelegateImpl.this.f9026v.getParent() instanceof View) {
                ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.f9026v.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    /* loaded from: classes.dex */
    public class C2072f implements ActionBarDrawerToggle.Delegate {
        public C2072f() {
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            return AppCompatDelegateImpl.this.m64622L();
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
    public interface InterfaceC2073g {
        /* renamed from: a */
        boolean mo64510a(int i);

        View onCreatePanelView(int i);
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    /* loaded from: classes.dex */
    public final class C2074h implements MenuPresenter.Callback {
        public C2074h() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImpl.this.m64576x(menuBuilder);
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback m64615S = AppCompatDelegateImpl.this.m64615S();
            if (m64615S != null) {
                m64615S.onMenuOpened(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, menuBuilder);
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    /* loaded from: classes.dex */
    public class C2075i implements ActionMode.Callback {

        /* renamed from: a */
        public ActionMode.Callback f9057a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i$a */
        /* loaded from: classes.dex */
        public class C2076a extends ViewPropertyAnimatorListenerAdapter {
            public C2076a() {
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationEnd(View view) {
                AppCompatDelegateImpl.this.f9026v.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f9027w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f9026v.getParent() instanceof View) {
                    ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.f9026v.getParent());
                }
                AppCompatDelegateImpl.this.f9026v.killMode();
                AppCompatDelegateImpl.this.f9029y.setListener(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f9029y = null;
                ViewCompat.requestApplyInsets(appCompatDelegateImpl2.f8980B);
            }
        }

        public C2075i(ActionMode.Callback callback) {
            this.f9057a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f9057a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f9057a.onCreateActionMode(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f9057a.onDestroyActionMode(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f9027w != null) {
                appCompatDelegateImpl.f9016l.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f9028x);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f9026v != null) {
                appCompatDelegateImpl2.m64627G();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f9029y = ViewCompat.animate(appCompatDelegateImpl3.f9026v).alpha(0.0f);
                AppCompatDelegateImpl.this.f9029y.setListener(new C2076a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            AppCompatCallback appCompatCallback = appCompatDelegateImpl4.f9018n;
            if (appCompatCallback != null) {
                appCompatCallback.onSupportActionModeFinished(appCompatDelegateImpl4.f9025u);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f9025u = null;
            ViewCompat.requestApplyInsets(appCompatDelegateImpl5.f8980B);
            AppCompatDelegateImpl.this.m64573y0();
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            ViewCompat.requestApplyInsets(AppCompatDelegateImpl.this.f8980B);
            return this.f9057a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    /* loaded from: classes.dex */
    public static class C2077j {
        /* renamed from: a */
        public static Context m64567a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        public static void m64566b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }

        @DoNotInline
        /* renamed from: c */
        public static void m64565c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m64564d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    /* loaded from: classes.dex */
    public static class C2078k {
        /* renamed from: a */
        public static boolean m64563a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @DoNotInline
        /* renamed from: b */
        public static String m64562b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    /* loaded from: classes.dex */
    public static class C2079l {
        @DoNotInline
        /* renamed from: a */
        public static void m64561a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
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
        public static LocaleListCompat m64560b(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return LocaleListCompat.forLanguageTags(languageTags);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m64559c(LocaleListCompat localeListCompat) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(localeListCompat.toLanguageTags());
            LocaleList.setDefault(forLanguageTags);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m64558d(Configuration configuration, LocaleListCompat localeListCompat) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(localeListCompat.toLanguageTags());
            configuration.setLocales(forLanguageTags);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    /* loaded from: classes.dex */
    public static class C2080m {
        /* renamed from: a */
        public static void m64557a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
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
    public static class C2081n {
        @DoNotInline
        /* renamed from: a */
        public static OnBackInvokedDispatcher m64556a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        @DoNotInline
        /* renamed from: b */
        public static OnBackInvokedCallback m64555b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: I5
                public final void onBackInvoked() {
                    AppCompatDelegateImpl.this.m64608Z();
                }
            };
            AbstractC0292E5.m68697a(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        @DoNotInline
        /* renamed from: c */
        public static void m64554c(Object obj, Object obj2) {
            AbstractC0292E5.m68697a(obj).unregisterOnBackInvokedCallback(AbstractC0222D5.m68867a(obj2));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    /* loaded from: classes.dex */
    public class C2083p extends AbstractC2084q {

        /* renamed from: c */
        public final PowerManager f9065c;

        public C2083p(Context context) {
            super();
            this.f9065c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC2084q
        /* renamed from: b */
        public IntentFilter mo64546b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC2084q
        /* renamed from: c */
        public int mo64545c() {
            if (C2078k.m64563a(this.f9065c)) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC2084q
        /* renamed from: d */
        public void mo64544d() {
            AppCompatDelegateImpl.this.applyDayNight();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q */
    /* loaded from: classes.dex */
    public abstract class AbstractC2084q {

        /* renamed from: a */
        public BroadcastReceiver f9067a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q$a */
        /* loaded from: classes.dex */
        public class C2085a extends BroadcastReceiver {
            public C2085a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC2084q.this.mo64544d();
            }
        }

        public AbstractC2084q() {
        }

        /* renamed from: a */
        public void m64548a() {
            BroadcastReceiver broadcastReceiver = this.f9067a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f9015k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f9067a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo64546b();

        /* renamed from: c */
        public abstract int mo64545c();

        /* renamed from: d */
        public abstract void mo64544d();

        /* renamed from: e */
        public void m64547e() {
            m64548a();
            IntentFilter mo64546b = mo64546b();
            if (mo64546b != null && mo64546b.countActions() != 0) {
                if (this.f9067a == null) {
                    this.f9067a = new C2085a();
                }
                AppCompatDelegateImpl.this.f9015k.registerReceiver(this.f9067a, mo64546b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$r */
    /* loaded from: classes.dex */
    public class C2086r extends AbstractC2084q {

        /* renamed from: c */
        public final KW1 f9070c;

        public C2086r(KW1 kw1) {
            super();
            this.f9070c = kw1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC2084q
        /* renamed from: b */
        public IntentFilter mo64546b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC2084q
        /* renamed from: c */
        public int mo64545c() {
            if (this.f9070c.m67710d()) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC2084q
        /* renamed from: d */
        public void mo64544d() {
            AppCompatDelegateImpl.this.applyDayNight();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$s */
    /* loaded from: classes.dex */
    public static class C2087s {
        /* renamed from: a */
        public static void m64543a(android.view.ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$t */
    /* loaded from: classes.dex */
    public class C2088t extends ContentFrameLayout {
        public C2088t(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final boolean m64542a(int i, int i2) {
            if (i >= -5 && i2 >= -5 && i <= getWidth() + 5 && i2 <= getHeight() + 5) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!AppCompatDelegateImpl.this.m64629E(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m64542a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                AppCompatDelegateImpl.this.m64572z(0);
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
    public final class C2089u implements MenuPresenter.Callback {
        public C2089u() {
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
            PanelFeatureState m64624J = appCompatDelegateImpl.m64624J(menuBuilder);
            if (m64624J != null) {
                if (z2) {
                    AppCompatDelegateImpl.this.m64578w(m64624J.f9031a, m64624J, rootMenu);
                    AppCompatDelegateImpl.this.m64635A(m64624J, true);
                    return;
                }
                AppCompatDelegateImpl.this.m64635A(m64624J, z);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback m64615S;
            if (menuBuilder == menuBuilder.getRootMenu()) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (appCompatDelegateImpl.f8985G && (m64615S = appCompatDelegateImpl.m64615S()) != null && !AppCompatDelegateImpl.this.f8996R) {
                    m64615S.onMenuOpened(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, menuBuilder);
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
    public static Configuration m64623K(Configuration configuration, Configuration configuration2) {
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
                C2079l.m64561a(configuration, configuration2, configuration3);
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
                C2080m.m64557a(configuration, configuration2, configuration3);
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
            C2077j.m64566b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: A */
    public void m64635A(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z && panelFeatureState.f9031a == 0 && (decorContentParent = this.f9022r) != null && decorContentParent.isOverflowMenuShowing()) {
            m64576x(panelFeatureState.f9040j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f9015k.getSystemService("window");
        if (windowManager != null && panelFeatureState.f9045o && (viewGroup = panelFeatureState.f9037g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m64578w(panelFeatureState.f9031a, panelFeatureState, null);
            }
        }
        panelFeatureState.f9043m = false;
        panelFeatureState.f9044n = false;
        panelFeatureState.f9045o = false;
        panelFeatureState.f9038h = null;
        panelFeatureState.f9046p = true;
        if (this.f8992N == panelFeatureState) {
            this.f8992N = null;
        }
        if (panelFeatureState.f9031a == 0) {
            m64573y0();
        }
    }

    /* renamed from: A0 */
    public final int m64634A0(WindowInsetsCompat windowInsetsCompat, Rect rect) {
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
        ActionBarContextView actionBarContextView = this.f9026v;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9026v.getLayoutParams();
            boolean z3 = true;
            if (this.f9026v.isShown()) {
                if (this.f9008d0 == null) {
                    this.f9008d0 = new Rect();
                    this.f9009e0 = new Rect();
                }
                Rect rect2 = this.f9008d0;
                Rect rect3 = this.f9009e0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                }
                androidx.appcompat.widget.ViewUtils.computeFitSystemWindows(this.f8980B, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.f8980B);
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
                if (i3 > 0 && this.f8982D == null) {
                    View view = new View(this.f9015k);
                    this.f8982D = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    this.f8980B.addView(this.f8982D, -1, layoutParams);
                } else {
                    View view2 = this.f8982D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            this.f8982D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f8982D;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m64632B0(this.f8982D);
                }
                if (!this.f8987I && z3) {
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
                this.f9026v.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view4 = this.f8982D;
        if (view4 != null) {
            if (!z) {
                i2 = 8;
            }
            view4.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: B */
    public final Configuration m64633B(Context context, int i, LocaleListCompat localeListCompat, Configuration configuration, boolean z) {
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
            m64592o0(configuration2, localeListCompat);
        }
        return configuration2;
    }

    /* renamed from: B0 */
    public final void m64632B0(View view) {
        int color;
        if ((ViewCompat.getWindowSystemUiVisibility(view) & 8192) != 0) {
            color = ContextCompat.getColor(this.f9015k, R.color.abc_decor_view_status_guard_light);
        } else {
            color = ContextCompat.getColor(this.f9015k, R.color.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(color);
    }

    /* renamed from: C */
    public final ViewGroup m64631C() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f9015k.obtainStyledAttributes(R.styleable.AppCompatTheme);
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
            this.f8988J = obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m64625I();
            this.f9016l.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f9015k);
            if (!this.f8989K) {
                if (this.f8988J) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.f8986H = false;
                    this.f8985G = false;
                } else if (this.f8985G) {
                    TypedValue typedValue = new TypedValue();
                    this.f9015k.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new ContextThemeWrapper(this.f9015k, typedValue.resourceId);
                    } else {
                        context = this.f9015k;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f9022r = decorContentParent;
                    decorContentParent.setWindowCallback(m64615S());
                    if (this.f8986H) {
                        this.f9022r.initFeature(109);
                    }
                    if (this.f8983E) {
                        this.f9022r.initFeature(2);
                    }
                    if (this.f8984F) {
                        this.f9022r.initFeature(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.f8987I ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
            }
            if (viewGroup != null) {
                ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new C2067b());
                if (this.f9022r == null) {
                    this.f8981C = (TextView) viewGroup.findViewById(R.id.title);
                }
                androidx.appcompat.widget.ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f9016l.findViewById(16908290);
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
                this.f9016l.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C2068c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f8985G + ", windowActionBarOverlay: " + this.f8986H + ", android:windowIsFloating: " + this.f8988J + ", windowActionModeOverlay: " + this.f8987I + ", windowNoTitle: " + this.f8989K + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: D */
    public void m64630D() {
        MenuBuilder menuBuilder;
        DecorContentParent decorContentParent = this.f9022r;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.f9027w != null) {
            this.f9016l.getDecorView().removeCallbacks(this.f9028x);
            if (this.f9027w.isShowing()) {
                try {
                    this.f9027w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f9027w = null;
        }
        m64627G();
        PanelFeatureState m64617Q = m64617Q(0, false);
        if (m64617Q != null && (menuBuilder = m64617Q.f9040j) != null) {
            menuBuilder.close();
        }
    }

    /* renamed from: E */
    public boolean m64629E(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f9014j;
        if (((obj instanceof KeyEventDispatcher.Component) || (obj instanceof AppCompatDialog)) && (decorView = this.f9016l.getDecorView()) != null && KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f9017m.m64553a(this.f9016l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            return m64607a0(keyCode, keyEvent);
        }
        return m64603d0(keyCode, keyEvent);
    }

    /* renamed from: F */
    public void m64628F(int i) {
        PanelFeatureState m64617Q;
        PanelFeatureState m64617Q2 = m64617Q(i, true);
        if (m64617Q2.f9040j != null) {
            Bundle bundle = new Bundle();
            m64617Q2.f9040j.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                m64617Q2.f9048r = bundle;
            }
            m64617Q2.f9040j.stopDispatchingItemsChanged();
            m64617Q2.f9040j.clear();
        }
        m64617Q2.f9047q = true;
        m64617Q2.f9046p = true;
        if ((i == 108 || i == 0) && this.f9022r != null && (m64617Q = m64617Q(0, false)) != null) {
            m64617Q.f9043m = false;
            m64595l0(m64617Q, null);
        }
    }

    /* renamed from: G */
    public void m64627G() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f9029y;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
    }

    /* renamed from: H */
    public final void m64626H() {
        if (!this.f8979A) {
            this.f8980B = m64631C();
            CharSequence m64616R = m64616R();
            if (!TextUtils.isEmpty(m64616R)) {
                DecorContentParent decorContentParent = this.f9022r;
                if (decorContentParent != null) {
                    decorContentParent.setWindowTitle(m64616R);
                } else if (m64597j0() != null) {
                    m64597j0().setWindowTitle(m64616R);
                } else {
                    TextView textView = this.f8981C;
                    if (textView != null) {
                        textView.setText(m64616R);
                    }
                }
            }
            m64586s();
            m64599h0(this.f8980B);
            this.f8979A = true;
            PanelFeatureState m64617Q = m64617Q(0, false);
            if (!this.f8996R) {
                if (m64617Q == null || m64617Q.f9040j == null) {
                    m64610X(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
                }
            }
        }
    }

    /* renamed from: I */
    public final void m64625I() {
        if (this.f9016l == null) {
            Object obj = this.f9014j;
            if (obj instanceof Activity) {
                m64584t(((Activity) obj).getWindow());
            }
        }
        if (this.f9016l != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    /* renamed from: J */
    public PanelFeatureState m64624J(Menu menu) {
        int i;
        PanelFeatureState[] panelFeatureStateArr = this.f8991M;
        if (panelFeatureStateArr != null) {
            i = panelFeatureStateArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.f9040j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: L */
    public final Context m64622L() {
        Context context;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            context = supportActionBar.getThemedContext();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f9015k;
        }
        return context;
    }

    /* renamed from: M */
    public final int m64621M(Context context) {
        int i;
        if (!this.f9001W && (this.f9014j instanceof Activity)) {
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
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f9014j.getClass()), i);
                if (activityInfo != null) {
                    this.f9000V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f9000V = 0;
            }
        }
        this.f9001W = true;
        return this.f9000V;
    }

    /* renamed from: N */
    public final AbstractC2084q m64620N(Context context) {
        if (this.f9003Y == null) {
            this.f9003Y = new C2083p(context);
        }
        return this.f9003Y;
    }

    /* renamed from: O */
    public final AbstractC2084q m64619O(Context context) {
        if (this.f9002X == null) {
            this.f9002X = new C2086r(KW1.m67713a(context));
        }
        return this.f9002X;
    }

    /* renamed from: P */
    public LocaleListCompat m64618P(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C2079l.m64560b(configuration);
        }
        return LocaleListCompat.forLanguageTags(C2078k.m64562b(configuration.locale));
    }

    /* renamed from: Q */
    public PanelFeatureState m64617Q(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f8991M;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f8991M = panelFeatureStateArr2;
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
    public final CharSequence m64616R() {
        Object obj = this.f9014j;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f9021q;
    }

    /* renamed from: S */
    public final Window.Callback m64615S() {
        return this.f9016l.getCallback();
    }

    /* renamed from: T */
    public final void m64614T() {
        m64626H();
        if (this.f8985G && this.f9019o == null) {
            Object obj = this.f9014j;
            if (obj instanceof Activity) {
                this.f9019o = new WindowDecorActionBar((Activity) this.f9014j, this.f8986H);
            } else if (obj instanceof Dialog) {
                this.f9019o = new WindowDecorActionBar((Dialog) this.f9014j);
            }
            ActionBar actionBar = this.f9019o;
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled(this.f9007c0);
            }
        }
    }

    /* renamed from: U */
    public final boolean m64613U(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f9039i;
        if (view != null) {
            panelFeatureState.f9038h = view;
            return true;
        } else if (panelFeatureState.f9040j == null) {
            return false;
        } else {
            if (this.f9024t == null) {
                this.f9024t = new C2089u();
            }
            View view2 = (View) panelFeatureState.m64570a(this.f9024t);
            panelFeatureState.f9038h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: V */
    public final boolean m64612V(PanelFeatureState panelFeatureState) {
        panelFeatureState.m64568c(m64622L());
        panelFeatureState.f9037g = new C2088t(panelFeatureState.f9042l);
        panelFeatureState.f9033c = 81;
        return true;
    }

    /* renamed from: W */
    public final boolean m64611W(PanelFeatureState panelFeatureState) {
        Resources.Theme theme;
        Context context = this.f9015k;
        int i = panelFeatureState.f9031a;
        if ((i == 0 || i == 108) && this.f9022r != null) {
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
        panelFeatureState.m64569b(menuBuilder);
        return true;
    }

    /* renamed from: X */
    public final void m64610X(int i) {
        this.f9005a0 = (1 << i) | this.f9005a0;
        if (!this.f9004Z) {
            ViewCompat.postOnAnimation(this.f9016l.getDecorView(), this.f9006b0);
            this.f9004Z = true;
        }
    }

    /* renamed from: Y */
    public int m64609Y(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        return m64620N(context).mo64545c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return m64619O(context).mo64545c();
            }
        }
        return i;
    }

    /* renamed from: Z */
    public boolean m64608Z() {
        boolean z = this.f8993O;
        this.f8993O = false;
        PanelFeatureState m64617Q = m64617Q(0, false);
        if (m64617Q != null && m64617Q.f9045o) {
            if (!z) {
                m64635A(m64617Q, true);
            }
            return true;
        }
        ActionMode actionMode = this.f9025u;
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
    public boolean m64607a0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i != 4) {
            if (i == 82) {
                m64606b0(0, keyEvent);
                return true;
            }
        } else {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f8993O = z;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m64626H();
        ((ViewGroup) this.f8980B.findViewById(16908290)).addView(view, layoutParams);
        this.f9017m.m64552b(this.f9016l.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean applyDayNight() {
        return m64590q(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context attachBaseContext2(Context context) {
        Configuration configuration;
        this.f8994P = true;
        int m64609Y = m64609Y(context, m64580v());
        if (AppCompatDelegate.m64644k(context)) {
            AppCompatDelegate.m64639p(context);
        }
        LocaleListCompat m64582u = m64582u(context);
        if (f8978n0 && (context instanceof android.view.ContextThemeWrapper)) {
            try {
                C2087s.m64543a((android.view.ContextThemeWrapper) context, m64633B(context, m64609Y, m64582u, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m64633B(context, m64609Y, m64582u, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f8977m0) {
            return super.attachBaseContext2(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = C2077j.m64567a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m64623K(configuration3, configuration4);
        } else {
            configuration = null;
        }
        Configuration m64633B = m64633B(context, m64609Y, m64582u, configuration, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_AppCompat_Empty);
        contextThemeWrapper.applyOverrideConfiguration(m64633B);
        try {
            if (context.getTheme() != null) {
                ResourcesCompat.ThemeCompat.rebase(contextThemeWrapper.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.attachBaseContext2(contextThemeWrapper);
    }

    /* renamed from: b0 */
    public final boolean m64606b0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState m64617Q = m64617Q(i, true);
            if (!m64617Q.f9045o) {
                return m64595l0(m64617Q, keyEvent);
            }
            return false;
        }
        return false;
    }

    /* renamed from: c0 */
    public boolean m64605c0(int i, KeyEvent keyEvent) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.onKeyShortcut(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f8992N;
        if (panelFeatureState != null && m64596k0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.f8992N;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f9044n = true;
            }
            return true;
        }
        if (this.f8992N == null) {
            PanelFeatureState m64617Q = m64617Q(0, true);
            m64595l0(m64617Q, keyEvent);
            boolean m64596k0 = m64596k0(m64617Q, keyEvent.getKeyCode(), keyEvent, 1);
            m64617Q.f9043m = false;
            if (m64596k0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public View createView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (this.f9010f0 == null) {
            String string = this.f9015k.obtainStyledAttributes(R.styleable.AppCompatTheme).getString(R.styleable.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f9010f0 = new AppCompatViewInflater();
            } else {
                try {
                    this.f9010f0 = (AppCompatViewInflater) this.f9015k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    this.f9010f0 = new AppCompatViewInflater();
                }
            }
        }
        boolean z2 = f8975k0;
        boolean z3 = false;
        if (z2) {
            if (this.f9011g0 == null) {
                this.f9011g0 = new C21172mi0();
            }
            if (this.f9011g0.m26593a(attributeSet)) {
                z = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                        z3 = true;
                    }
                } else {
                    z3 = m64587r0((ViewParent) view);
                }
                z = z3;
            }
        } else {
            z = false;
        }
        return this.f9010f0.createView(view, str, context, attributeSet, z, z2, true, VectorEnabledTintResources.shouldBeUsed());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: d */
    public boolean mo64604d() {
        if (AppCompatDelegate.m64644k(this.f9015k) && AppCompatDelegate.m64646i() != null && !AppCompatDelegate.m64646i().equals(AppCompatDelegate.m64645j())) {
            m64648g(this.f9015k);
        }
        return m64590q(true);
    }

    /* renamed from: d0 */
    public boolean m64603d0(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                m64602e0(0, keyEvent);
                return true;
            }
        } else if (m64608Z()) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public final boolean m64602e0(int i, KeyEvent keyEvent) {
        boolean z;
        DecorContentParent decorContentParent;
        if (this.f9025u != null) {
            return false;
        }
        boolean z2 = true;
        PanelFeatureState m64617Q = m64617Q(i, true);
        if (i == 0 && (decorContentParent = this.f9022r) != null && decorContentParent.canShowOverflowMenu() && !ViewConfiguration.get(this.f9015k).hasPermanentMenuKey()) {
            if (!this.f9022r.isOverflowMenuShowing()) {
                if (!this.f8996R && m64595l0(m64617Q, keyEvent)) {
                    z2 = this.f9022r.showOverflowMenu();
                }
                z2 = false;
            } else {
                z2 = this.f9022r.hideOverflowMenu();
            }
        } else {
            boolean z3 = m64617Q.f9045o;
            if (!z3 && !m64617Q.f9044n) {
                if (m64617Q.f9043m) {
                    if (m64617Q.f9047q) {
                        m64617Q.f9043m = false;
                        z = m64595l0(m64617Q, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        m64598i0(m64617Q, keyEvent);
                    }
                }
                z2 = false;
            } else {
                m64635A(m64617Q, true);
                z2 = z3;
            }
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f9015k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    /* renamed from: f0 */
    public void m64601f0(int i) {
        ActionBar supportActionBar;
        if (i == 108 && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.dispatchMenuVisibilityChanged(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public View findViewById(int i) {
        m64626H();
        return this.f9016l.findViewById(i);
    }

    /* renamed from: g0 */
    public void m64600g0(int i) {
        if (i == 108) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(false);
            }
        } else if (i == 0) {
            PanelFeatureState m64617Q = m64617Q(i, true);
            if (m64617Q.f9045o) {
                m64635A(m64617Q, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context getContextForDelegate() {
        return this.f9015k;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return new C2072f();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int getLocalNightMode() {
        return this.f8998T;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public MenuInflater getMenuInflater() {
        Context context;
        if (this.f9020p == null) {
            m64614T();
            ActionBar actionBar = this.f9019o;
            if (actionBar != null) {
                context = actionBar.getThemedContext();
            } else {
                context = this.f9015k;
            }
            this.f9020p = new SupportMenuInflater(context);
        }
        return this.f9020p;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionBar getSupportActionBar() {
        m64614T();
        return this.f9019o;
    }

    /* renamed from: h0 */
    public void m64599h0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean hasWindowFeature(int i) {
        boolean z;
        int m64593n0 = m64593n0(i);
        if (m64593n0 != 1) {
            if (m64593n0 != 2) {
                if (m64593n0 != 5) {
                    if (m64593n0 != 10) {
                        if (m64593n0 != 108) {
                            if (m64593n0 != 109) {
                                z = false;
                            } else {
                                z = this.f8986H;
                            }
                        } else {
                            z = this.f8985G;
                        }
                    } else {
                        z = this.f8987I;
                    }
                } else {
                    z = this.f8984F;
                }
            } else {
                z = this.f8983E;
            }
        } else {
            z = this.f8989K;
        }
        if (z || this.f9016l.hasFeature(i)) {
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
    public final void m64598i0(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m64598i0(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void installViewFactory() {
        LayoutInflater from = LayoutInflater.from(this.f9015k);
        if (from.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(from, this);
        } else {
            boolean z = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void invalidateOptionsMenu() {
        if (m64597j0() != null && !getSupportActionBar().invalidateOptionsMenu()) {
            m64610X(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
        return this.f9030z;
    }

    /* renamed from: j0 */
    public final ActionBar m64597j0() {
        return this.f9019o;
    }

    /* renamed from: k0 */
    public final boolean m64596k0(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        MenuBuilder menuBuilder;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f9043m || m64595l0(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.f9040j) != null) {
            z = menuBuilder.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f9022r == null) {
            m64635A(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: l0 */
    public final boolean m64595l0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        DecorContentParent decorContentParent;
        int i;
        boolean z2;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (this.f8996R) {
            return false;
        }
        if (panelFeatureState.f9043m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f8992N;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            m64635A(panelFeatureState2, false);
        }
        Window.Callback m64615S = m64615S();
        if (m64615S != null) {
            panelFeatureState.f9039i = m64615S.onCreatePanelView(panelFeatureState.f9031a);
        }
        int i2 = panelFeatureState.f9031a;
        if (i2 != 0 && i2 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (decorContentParent3 = this.f9022r) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (panelFeatureState.f9039i == null && (!z || !(m64597j0() instanceof C2099c))) {
            MenuBuilder menuBuilder = panelFeatureState.f9040j;
            if (menuBuilder == null || panelFeatureState.f9047q) {
                if (menuBuilder == null && (!m64611W(panelFeatureState) || panelFeatureState.f9040j == null)) {
                    return false;
                }
                if (z && this.f9022r != null) {
                    if (this.f9023s == null) {
                        this.f9023s = new C2074h();
                    }
                    this.f9022r.setMenu(panelFeatureState.f9040j, this.f9023s);
                }
                panelFeatureState.f9040j.stopDispatchingItemsChanged();
                if (!m64615S.onCreatePanelMenu(panelFeatureState.f9031a, panelFeatureState.f9040j)) {
                    panelFeatureState.m64569b(null);
                    if (z && (decorContentParent = this.f9022r) != null) {
                        decorContentParent.setMenu(null, this.f9023s);
                    }
                    return false;
                }
                panelFeatureState.f9047q = false;
            }
            panelFeatureState.f9040j.stopDispatchingItemsChanged();
            Bundle bundle = panelFeatureState.f9048r;
            if (bundle != null) {
                panelFeatureState.f9040j.restoreActionViewStates(bundle);
                panelFeatureState.f9048r = null;
            }
            if (!m64615S.onPreparePanel(0, panelFeatureState.f9039i, panelFeatureState.f9040j)) {
                if (z && (decorContentParent2 = this.f9022r) != null) {
                    decorContentParent2.setMenu(null, this.f9023s);
                }
                panelFeatureState.f9040j.startDispatchingItemsChanged();
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
            panelFeatureState.f9040j.setQwertyMode(z2);
            panelFeatureState.f9040j.startDispatchingItemsChanged();
        }
        panelFeatureState.f9043m = true;
        panelFeatureState.f9044n = false;
        this.f8992N = panelFeatureState;
        return true;
    }

    /* renamed from: m0 */
    public final void m64594m0(boolean z) {
        DecorContentParent decorContentParent = this.f9022r;
        if (decorContentParent != null && decorContentParent.canShowOverflowMenu() && (!ViewConfiguration.get(this.f9015k).hasPermanentMenuKey() || this.f9022r.isOverflowMenuShowPending())) {
            Window.Callback m64615S = m64615S();
            if (this.f9022r.isOverflowMenuShowing() && z) {
                this.f9022r.hideOverflowMenu();
                if (!this.f8996R) {
                    m64615S.onPanelClosed(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, m64617Q(0, true).f9040j);
                    return;
                }
                return;
            } else if (m64615S != null && !this.f8996R) {
                if (this.f9004Z && (this.f9005a0 & 1) != 0) {
                    this.f9016l.getDecorView().removeCallbacks(this.f9006b0);
                    this.f9006b0.run();
                }
                PanelFeatureState m64617Q = m64617Q(0, true);
                MenuBuilder menuBuilder = m64617Q.f9040j;
                if (menuBuilder != null && !m64617Q.f9047q && m64615S.onPreparePanel(0, m64617Q.f9039i, menuBuilder)) {
                    m64615S.onMenuOpened(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, m64617Q.f9040j);
                    this.f9022r.showOverflowMenu();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        PanelFeatureState m64617Q2 = m64617Q(0, true);
        m64617Q2.f9046p = true;
        m64635A(m64617Q2, false);
        m64598i0(m64617Q2, null);
    }

    /* renamed from: n0 */
    public final int m64593n0(int i) {
        if (i == 8) {
            return AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    /* renamed from: o0 */
    public void m64592o0(Configuration configuration, LocaleListCompat localeListCompat) {
        if (Build.VERSION.SDK_INT >= 24) {
            C2079l.m64558d(configuration, localeListCompat);
            return;
        }
        C2077j.m64564d(configuration, localeListCompat.get(0));
        C2077j.m64565c(configuration, localeListCompat.get(0));
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onConfigurationChanged(Configuration configuration) {
        ActionBar supportActionBar;
        if (this.f8985G && this.f8979A && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.onConfigurationChanged(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.f9015k);
        this.f8997S = new Configuration(this.f9015k.getResources().getConfiguration());
        m64588r(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onCreate(Bundle bundle) {
        String str;
        this.f8994P = true;
        m64590q(false);
        m64625I();
        Object obj = this.f9014j;
        if (obj instanceof Activity) {
            try {
                str = NavUtils.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar m64597j0 = m64597j0();
                if (m64597j0 == null) {
                    this.f9007c0 = true;
                } else {
                    m64597j0.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            AppCompatDelegate.m64651c(this);
        }
        this.f8997S = new Configuration(this.f9015k.getResources().getConfiguration());
        this.f8995Q = true;
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
            java.lang.Object r0 = r3.f9014j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AppCompatDelegate.m64641n(r3)
        L9:
            boolean r0 = r3.f9004Z
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f9016l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f9006b0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f8996R = r0
            int r0 = r3.f8998T
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f9014j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.SimpleArrayMap r0 = androidx.appcompat.app.AppCompatDelegateImpl.f8974j0
            java.lang.Object r1 = r3.f9014j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f8998T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.SimpleArrayMap r0 = androidx.appcompat.app.AppCompatDelegateImpl.f8974j0
            java.lang.Object r1 = r3.f9014j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.ActionBar r0 = r3.f9019o
            if (r0 == 0) goto L5b
            r0.mo64513a()
        L5b:
            r3.m64574y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onDestroy():void");
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState m64624J;
        Window.Callback m64615S = m64615S();
        if (m64615S != null && !this.f8996R && (m64624J = m64624J(menuBuilder.getRootMenu())) != null) {
            return m64615S.onMenuItemSelected(m64624J.f9031a, menuItem);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        m64594m0(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostCreate(Bundle bundle) {
        m64626H();
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
        m64588r(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStop() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }

    /* renamed from: p0 */
    public void m64591p0(LocaleListCompat localeListCompat) {
        if (Build.VERSION.SDK_INT >= 24) {
            C2079l.m64559c(localeListCompat);
        } else {
            Locale.setDefault(localeListCompat.get(0));
        }
    }

    /* renamed from: q */
    public final boolean m64590q(boolean z) {
        return m64588r(z, true);
    }

    /* renamed from: q0 */
    public final boolean m64589q0() {
        ViewGroup viewGroup;
        if (this.f8979A && (viewGroup = this.f8980B) != null && ViewCompat.isLaidOut(viewGroup)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m64588r(boolean z, boolean z2) {
        LocaleListCompat localeListCompat;
        if (this.f8996R) {
            return false;
        }
        int m64580v = m64580v();
        int m64609Y = m64609Y(this.f9015k, m64580v);
        if (Build.VERSION.SDK_INT < 33) {
            localeListCompat = m64582u(this.f9015k);
        } else {
            localeListCompat = null;
        }
        if (!z2 && localeListCompat != null) {
            localeListCompat = m64618P(this.f9015k.getResources().getConfiguration());
        }
        boolean m64575x0 = m64575x0(m64609Y, localeListCompat, z);
        if (m64580v == 0) {
            m64619O(this.f9015k).m64547e();
        } else {
            AbstractC2084q abstractC2084q = this.f9002X;
            if (abstractC2084q != null) {
                abstractC2084q.m64548a();
            }
        }
        if (m64580v == 3) {
            m64620N(this.f9015k).m64547e();
        } else {
            AbstractC2084q abstractC2084q2 = this.f9003Y;
            if (abstractC2084q2 != null) {
                abstractC2084q2.m64548a();
            }
        }
        return m64575x0;
    }

    /* renamed from: r0 */
    public final boolean m64587r0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f9016l.getDecorView();
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
        int m64593n0 = m64593n0(i);
        if (this.f8989K && m64593n0 == 108) {
            return false;
        }
        if (this.f8985G && m64593n0 == 1) {
            this.f8985G = false;
        }
        if (m64593n0 != 1) {
            if (m64593n0 != 2) {
                if (m64593n0 != 5) {
                    if (m64593n0 != 10) {
                        if (m64593n0 != 108) {
                            if (m64593n0 != 109) {
                                return this.f9016l.requestFeature(m64593n0);
                            }
                            m64581u0();
                            this.f8986H = true;
                            return true;
                        }
                        m64581u0();
                        this.f8985G = true;
                        return true;
                    }
                    m64581u0();
                    this.f8987I = true;
                    return true;
                }
                m64581u0();
                this.f8984F = true;
                return true;
            }
            m64581u0();
            this.f8983E = true;
            return true;
        }
        m64581u0();
        this.f8989K = true;
        return true;
    }

    /* renamed from: s */
    public final void m64586s() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f8980B.findViewById(16908290);
        View decorView = this.f9016l.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f9015k.obtainStyledAttributes(R.styleable.AppCompatTheme);
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
    public boolean m64585s0() {
        if (this.f9012h0 == null) {
            return false;
        }
        PanelFeatureState m64617Q = m64617Q(0, false);
        if ((m64617Q == null || !m64617Q.f9045o) && this.f9025u == null) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(View view) {
        m64626H();
        ViewGroup viewGroup = (ViewGroup) this.f8980B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f9017m.m64552b(this.f9016l.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean z) {
        this.f9030z = z;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setLocalNightMode(int i) {
        if (this.f8998T != i) {
            this.f8998T = i;
            if (this.f8994P) {
                applyDayNight();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f9012h0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f9013i0) != null) {
            C2081n.m64554c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f9013i0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f9014j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f9012h0 = C2081n.m64556a((Activity) this.f9014j);
                m64573y0();
            }
        }
        this.f9012h0 = onBackInvokedDispatcher;
        m64573y0();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setSupportActionBar(Toolbar toolbar) {
        if (!(this.f9014j instanceof Activity)) {
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (!(supportActionBar instanceof WindowDecorActionBar)) {
            this.f9020p = null;
            if (supportActionBar != null) {
                supportActionBar.mo64513a();
            }
            this.f9019o = null;
            if (toolbar != null) {
                C2099c c2099c = new C2099c(toolbar, m64616R(), this.f9017m);
                this.f9019o = c2099c;
                this.f9017m.m64550d(c2099c.f9144c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f9017m.m64550d(null);
            }
            invalidateOptionsMenu();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setTheme(int i) {
        this.f8999U = i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(CharSequence charSequence) {
        this.f9021q = charSequence;
        DecorContentParent decorContentParent = this.f9022r;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
        } else if (m64597j0() != null) {
            m64597j0().setWindowTitle(charSequence);
        } else {
            TextView textView = this.f8981C;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionMode startSupportActionMode(ActionMode.Callback callback) {
        AppCompatCallback appCompatCallback;
        if (callback != null) {
            ActionMode actionMode = this.f9025u;
            if (actionMode != null) {
                actionMode.finish();
            }
            C2075i c2075i = new C2075i(callback);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                ActionMode startActionMode = supportActionBar.startActionMode(c2075i);
                this.f9025u = startActionMode;
                if (startActionMode != null && (appCompatCallback = this.f9018n) != null) {
                    appCompatCallback.onSupportActionModeStarted(startActionMode);
                }
            }
            if (this.f9025u == null) {
                this.f9025u = m64583t0(c2075i);
            }
            m64573y0();
            return this.f9025u;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: t */
    public final void m64584t(Window window) {
        if (this.f9016l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C2082o)) {
                C2082o c2082o = new C2082o(callback);
                this.f9017m = c2082o;
                window.setCallback(c2082o);
                TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f9015k, (AttributeSet) null, f8976l0);
                Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
                if (drawableIfKnown != null) {
                    window.setBackgroundDrawable(drawableIfKnown);
                }
                obtainStyledAttributes.recycle();
                this.f9016l = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f9012h0 == null) {
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
    public androidx.appcompat.view.ActionMode m64583t0(androidx.appcompat.view.ActionMode.Callback r8) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m64583t0(androidx.appcompat.view.ActionMode$Callback):androidx.appcompat.view.ActionMode");
    }

    /* renamed from: u */
    public LocaleListCompat m64582u(Context context) {
        LocaleListCompat m64646i;
        LocaleListCompat forLanguageTags;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (m64646i = AppCompatDelegate.m64646i()) == null) {
            return null;
        }
        LocaleListCompat m64618P = m64618P(context.getApplicationContext().getResources().getConfiguration());
        if (i >= 24) {
            forLanguageTags = AbstractC21005lk0.m26774b(m64646i, m64618P);
        } else if (m64646i.isEmpty()) {
            forLanguageTags = LocaleListCompat.getEmptyLocaleList();
        } else {
            forLanguageTags = LocaleListCompat.forLanguageTags(m64646i.get(0).toString());
        }
        if (!forLanguageTags.isEmpty()) {
            return forLanguageTags;
        }
        return m64618P;
    }

    /* renamed from: u0 */
    public final void m64581u0() {
        if (!this.f8979A) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    /* renamed from: v */
    public final int m64580v() {
        int i = this.f8998T;
        if (i == -100) {
            return AppCompatDelegate.getDefaultNightMode();
        }
        return i;
    }

    /* renamed from: v0 */
    public final AppCompatActivity m64579v0() {
        for (Context context = this.f9015k; context != null; context = ((ContextWrapper) context).getBaseContext()) {
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
    public void m64578w(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f8991M;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f9040j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f9045o) && !this.f8996R) {
            this.f9017m.m64551c(this.f9016l.getCallback(), i, menu);
        }
    }

    /* renamed from: w0 */
    public final void m64577w0(Configuration configuration) {
        Activity activity = (Activity) this.f9014j;
        if (activity instanceof LifecycleOwner) {
            if (((LifecycleOwner) activity).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.f8995Q && !this.f8996R) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* renamed from: x */
    public void m64576x(MenuBuilder menuBuilder) {
        if (this.f8990L) {
            return;
        }
        this.f8990L = true;
        this.f9022r.dismissPopups();
        Window.Callback m64615S = m64615S();
        if (m64615S != null && !this.f8996R) {
            m64615S.onPanelClosed(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, menuBuilder);
        }
        this.f8990L = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m64575x0(int r9, androidx.core.p005os.LocaleListCompat r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f9015k
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.m64633B(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f9015k
            int r1 = r8.m64621M(r1)
            android.content.res.Configuration r2 = r8.f8997S
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f9015k
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.LocaleListCompat r2 = r8.m64618P(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.LocaleListCompat r0 = r8.m64618P(r0)
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
            boolean r11 = r8.f8994P
            if (r11 == 0) goto L6f
            boolean r11 = androidx.appcompat.app.AppCompatDelegateImpl.f8977m0
            if (r11 != 0) goto L58
            boolean r11 = r8.f8995Q
            if (r11 == 0) goto L6f
        L58:
            java.lang.Object r11 = r8.f9014j
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L6f
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L6f
            java.lang.Object r11 = r8.f9014j
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
            r8.m64571z0(r4, r0, r6, r5)
            goto L7e
        L7d:
            r7 = r11
        L7e:
            if (r7 == 0) goto L9a
            java.lang.Object r11 = r8.f9014j
            boolean r1 = r11 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L9a
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L8f
            androidx.appcompat.app.AppCompatActivity r11 = (androidx.appcompat.app.AppCompatActivity) r11
            r11.onNightModeChanged(r9)
        L8f:
            r9 = r3 & 4
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r8.f9014j
            androidx.appcompat.app.AppCompatActivity r9 = (androidx.appcompat.app.AppCompatActivity) r9
            r9.onLocalesChanged(r10)
        L9a:
            if (r7 == 0) goto Laf
            if (r0 == 0) goto Laf
            android.content.Context r9 = r8.f9015k
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.LocaleListCompat r9 = r8.m64618P(r9)
            r8.m64591p0(r9)
        Laf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m64575x0(int, androidx.core.os.LocaleListCompat, boolean):boolean");
    }

    /* renamed from: y */
    public final void m64574y() {
        AbstractC2084q abstractC2084q = this.f9002X;
        if (abstractC2084q != null) {
            abstractC2084q.m64548a();
        }
        AbstractC2084q abstractC2084q2 = this.f9003Y;
        if (abstractC2084q2 != null) {
            abstractC2084q2.m64548a();
        }
    }

    /* renamed from: y0 */
    public void m64573y0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean m64585s0 = m64585s0();
            if (m64585s0 && this.f9013i0 == null) {
                this.f9013i0 = C2081n.m64555b(this.f9012h0, this);
            } else if (!m64585s0 && (onBackInvokedCallback = this.f9013i0) != null) {
                C2081n.m64554c(this.f9012h0, onBackInvokedCallback);
            }
        }
    }

    /* renamed from: z */
    public void m64572z(int i) {
        m64635A(m64617Q(i, true), true);
    }

    /* renamed from: z0 */
    public final void m64571z0(int i, LocaleListCompat localeListCompat, boolean z, Configuration configuration) {
        Resources resources = this.f9015k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (localeListCompat != null) {
            m64592o0(configuration2, localeListCompat);
        }
        resources.updateConfiguration(configuration2, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            AbstractC17606Ey1.m68560a(resources);
        }
        int i3 = this.f8999U;
        if (i3 != 0) {
            this.f9015k.setTheme(i3);
            if (i2 >= 23) {
                this.f9015k.getTheme().applyStyle(this.f8999U, true);
            }
        }
        if (z && (this.f9014j instanceof Activity)) {
            m64577w0(configuration2);
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
    public class C2082o extends WindowCallbackWrapper {

        /* renamed from: b */
        public InterfaceC2073g f9060b;

        /* renamed from: c */
        public boolean f9061c;

        /* renamed from: d */
        public boolean f9062d;

        /* renamed from: e */
        public boolean f9063e;

        public C2082o(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: a */
        public boolean m64553a(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f9062d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f9062d = false;
            }
        }

        /* renamed from: b */
        public void m64552b(Window.Callback callback) {
            try {
                this.f9061c = true;
                callback.onContentChanged();
            } finally {
                this.f9061c = false;
            }
        }

        /* renamed from: c */
        public void m64551c(Window.Callback callback, int i, Menu menu) {
            try {
                this.f9063e = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.f9063e = false;
            }
        }

        /* renamed from: d */
        public void m64550d(InterfaceC2073g interfaceC2073g) {
            this.f9060b = interfaceC2073g;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f9062d) {
                return getWrapped().dispatchKeyEvent(keyEvent);
            }
            if (!AppCompatDelegateImpl.this.m64629E(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !AppCompatDelegateImpl.this.m64605c0(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public final android.view.ActionMode m64549e(ActionMode.Callback callback) {
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImpl.this.f9015k, callback);
            androidx.appcompat.view.ActionMode startSupportActionMode = AppCompatDelegateImpl.this.startSupportActionMode(callbackWrapper);
            if (startSupportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(startSupportActionMode);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f9061c) {
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
            InterfaceC2073g interfaceC2073g = this.f9060b;
            if (interfaceC2073g != null && (onCreatePanelView = interfaceC2073g.onCreatePanelView(i)) != null) {
                return onCreatePanelView;
            }
            return super.onCreatePanelView(i);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.m64601f0(i);
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.f9063e) {
                getWrapped().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.m64600g0(i);
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
            InterfaceC2073g interfaceC2073g = this.f9060b;
            z = (interfaceC2073g == null || !interfaceC2073g.mo64510a(i)) ? false : false;
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
            PanelFeatureState m64617Q = AppCompatDelegateImpl.this.m64617Q(0, true);
            if (m64617Q != null && (menuBuilder = m64617Q.f9040j) != null) {
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
                return m64549e(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled() && i == 0) {
                return m64549e(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    public AppCompatDelegateImpl(Context context, Activity activity, AppCompatCallback appCompatCallback) {
        this(context, null, appCompatCallback, activity);
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        AppCompatActivity m64579v0;
        this.f9029y = null;
        this.f9030z = true;
        this.f8998T = -100;
        this.f9006b0 = new RunnableC2066a();
        this.f9015k = context;
        this.f9018n = appCompatCallback;
        this.f9014j = obj;
        if (this.f8998T == -100 && (obj instanceof Dialog) && (m64579v0 = m64579v0()) != null) {
            this.f8998T = m64579v0.getDelegate().getLocalNightMode();
        }
        if (this.f8998T == -100) {
            SimpleArrayMap simpleArrayMap = f8974j0;
            Integer num = (Integer) simpleArrayMap.get(obj.getClass().getName());
            if (num != null) {
                this.f8998T = num.intValue();
                simpleArrayMap.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            m64584t(window);
        }
        AppCompatDrawableManager.preload();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(int i) {
        m64626H();
        ViewGroup viewGroup = (ViewGroup) this.f8980B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f9015k).inflate(i, viewGroup);
        this.f9017m.m64552b(this.f9016l.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m64626H();
        ViewGroup viewGroup = (ViewGroup) this.f8980B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f9017m.m64552b(this.f9016l.getCallback());
    }
}