package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class CustomTabColorSchemeParams {
    @Nullable
    @ColorInt
    public final Integer navigationBarColor;
    @Nullable
    @ColorInt
    public final Integer navigationBarDividerColor;
    @Nullable
    @ColorInt
    public final Integer secondaryToolbarColor;
    @Nullable
    @ColorInt
    public final Integer toolbarColor;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a */
        public Integer f10223a;

        /* renamed from: b */
        public Integer f10224b;

        /* renamed from: c */
        public Integer f10225c;

        /* renamed from: d */
        public Integer f10226d;

        @NonNull
        public CustomTabColorSchemeParams build() {
            return new CustomTabColorSchemeParams(this.f10223a, this.f10224b, this.f10225c, this.f10226d);
        }

        @NonNull
        public Builder setNavigationBarColor(@ColorInt int i) {
            this.f10225c = Integer.valueOf(i | (-16777216));
            return this;
        }

        @NonNull
        public Builder setNavigationBarDividerColor(@ColorInt int i) {
            this.f10226d = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder setSecondaryToolbarColor(@ColorInt int i) {
            this.f10224b = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder setToolbarColor(@ColorInt int i) {
            this.f10223a = Integer.valueOf(i | (-16777216));
            return this;
        }
    }

    public CustomTabColorSchemeParams(Integer num, Integer num2, Integer num3, Integer num4) {
        this.toolbarColor = num;
        this.secondaryToolbarColor = num2;
        this.navigationBarColor = num3;
        this.navigationBarDividerColor = num4;
    }

    /* renamed from: a */
    public static CustomTabColorSchemeParams m64008a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new CustomTabColorSchemeParams((Integer) bundle.get(CustomTabsIntent.EXTRA_TOOLBAR_COLOR), (Integer) bundle.get(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_COLOR), (Integer) bundle.get(CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR), (Integer) bundle.get(CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR));
    }

    /* renamed from: b */
    public Bundle m64007b() {
        Bundle bundle = new Bundle();
        Integer num = this.toolbarColor;
        if (num != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_TOOLBAR_COLOR, num.intValue());
        }
        Integer num2 = this.secondaryToolbarColor;
        if (num2 != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_COLOR, num2.intValue());
        }
        Integer num3 = this.navigationBarColor;
        if (num3 != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR, num3.intValue());
        }
        Integer num4 = this.navigationBarDividerColor;
        if (num4 != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR, num4.intValue());
        }
        return bundle;
    }

    /* renamed from: c */
    public CustomTabColorSchemeParams m64006c(CustomTabColorSchemeParams customTabColorSchemeParams) {
        Integer num = this.toolbarColor;
        if (num == null) {
            num = customTabColorSchemeParams.toolbarColor;
        }
        Integer num2 = this.secondaryToolbarColor;
        if (num2 == null) {
            num2 = customTabColorSchemeParams.secondaryToolbarColor;
        }
        Integer num3 = this.navigationBarColor;
        if (num3 == null) {
            num3 = customTabColorSchemeParams.navigationBarColor;
        }
        Integer num4 = this.navigationBarDividerColor;
        if (num4 == null) {
            num4 = customTabColorSchemeParams.navigationBarDividerColor;
        }
        return new CustomTabColorSchemeParams(num, num2, num3, num4);
    }
}