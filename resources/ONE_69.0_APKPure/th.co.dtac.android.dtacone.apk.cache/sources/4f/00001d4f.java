package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.customtabs.TrustedWebUtils;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;
import androidx.browser.trusted.sharing.ShareData;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class TrustedWebActivityIntentBuilder {
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ADDITIONAL_TRUSTED_ORIGINS = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";
    public static final String EXTRA_DISPLAY_MODE = "androidx.browser.trusted.extra.DISPLAY_MODE";
    public static final String EXTRA_SCREEN_ORIENTATION = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";
    public static final String EXTRA_SHARE_DATA = "androidx.browser.trusted.extra.SHARE_DATA";
    public static final String EXTRA_SHARE_TARGET = "androidx.browser.trusted.extra.SHARE_TARGET";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SPLASH_SCREEN_PARAMS = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";

    /* renamed from: a */
    public final Uri f10313a;

    /* renamed from: c */
    public List f10315c;

    /* renamed from: d */
    public Bundle f10316d;

    /* renamed from: e */
    public ShareData f10317e;

    /* renamed from: f */
    public ShareTarget f10318f;

    /* renamed from: b */
    public final CustomTabsIntent.Builder f10314b = new CustomTabsIntent.Builder();

    /* renamed from: g */
    public TrustedWebActivityDisplayMode f10319g = new TrustedWebActivityDisplayMode.DefaultMode();

    /* renamed from: h */
    public int f10320h = 0;

    public TrustedWebActivityIntentBuilder(@NonNull Uri uri) {
        this.f10313a = uri;
    }

    @NonNull
    public TrustedWebActivityIntent build(@NonNull CustomTabsSession customTabsSession) {
        if (customTabsSession != null) {
            this.f10314b.setSession(customTabsSession);
            Intent intent = this.f10314b.build().intent;
            intent.setData(this.f10313a);
            intent.putExtra(TrustedWebUtils.EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY, true);
            if (this.f10315c != null) {
                intent.putExtra(EXTRA_ADDITIONAL_TRUSTED_ORIGINS, new ArrayList(this.f10315c));
            }
            Bundle bundle = this.f10316d;
            if (bundle != null) {
                intent.putExtra(EXTRA_SPLASH_SCREEN_PARAMS, bundle);
            }
            List<Uri> emptyList = Collections.emptyList();
            ShareTarget shareTarget = this.f10318f;
            if (shareTarget != null && this.f10317e != null) {
                intent.putExtra(EXTRA_SHARE_TARGET, shareTarget.toBundle());
                intent.putExtra(EXTRA_SHARE_DATA, this.f10317e.toBundle());
                List<Uri> list = this.f10317e.uris;
                if (list != null) {
                    emptyList = list;
                }
            }
            intent.putExtra(EXTRA_DISPLAY_MODE, this.f10319g.toBundle());
            intent.putExtra(EXTRA_SCREEN_ORIENTATION, this.f10320h);
            return new TrustedWebActivityIntent(intent, emptyList);
        }
        throw new NullPointerException("CustomTabsSession is required for launching a TWA");
    }

    @NonNull
    public CustomTabsIntent buildCustomTabsIntent() {
        return this.f10314b.build();
    }

    @NonNull
    public TrustedWebActivityDisplayMode getDisplayMode() {
        return this.f10319g;
    }

    @NonNull
    public Uri getUri() {
        return this.f10313a;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setAdditionalTrustedOrigins(@NonNull List<String> list) {
        this.f10315c = list;
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setColorScheme(int i) {
        this.f10314b.setColorScheme(i);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setColorSchemeParams(int i, @NonNull CustomTabColorSchemeParams customTabColorSchemeParams) {
        this.f10314b.setColorSchemeParams(i, customTabColorSchemeParams);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setDefaultColorSchemeParams(@NonNull CustomTabColorSchemeParams customTabColorSchemeParams) {
        this.f10314b.setDefaultColorSchemeParams(customTabColorSchemeParams);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setDisplayMode(@NonNull TrustedWebActivityDisplayMode trustedWebActivityDisplayMode) {
        this.f10319g = trustedWebActivityDisplayMode;
        return this;
    }

    @NonNull
    @Deprecated
    public TrustedWebActivityIntentBuilder setNavigationBarColor(@ColorInt int i) {
        this.f10314b.setNavigationBarColor(i);
        return this;
    }

    @NonNull
    @Deprecated
    public TrustedWebActivityIntentBuilder setNavigationBarDividerColor(@ColorInt int i) {
        this.f10314b.setNavigationBarDividerColor(i);
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setScreenOrientation(int i) {
        this.f10320h = i;
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setShareParams(@NonNull ShareTarget shareTarget, @NonNull ShareData shareData) {
        this.f10318f = shareTarget;
        this.f10317e = shareData;
        return this;
    }

    @NonNull
    public TrustedWebActivityIntentBuilder setSplashScreenParams(@NonNull Bundle bundle) {
        this.f10316d = bundle;
        return this;
    }

    @NonNull
    @Deprecated
    public TrustedWebActivityIntentBuilder setToolbarColor(@ColorInt int i) {
        this.f10314b.setToolbarColor(i);
        return this;
    }
}