package th.p047co.dtac.android.dtacone.app_one.util;

import androidx.browser.customtabs.CustomTabsIntent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.app_one.util.OneCustomTabsUtil_Factory */
/* loaded from: classes7.dex */
public final class OneCustomTabsUtil_Factory implements Factory<OneCustomTabsUtil> {

    /* renamed from: a */
    public final Provider f82477a;

    public OneCustomTabsUtil_Factory(Provider<CustomTabsIntent.Builder> provider) {
        this.f82477a = provider;
    }

    public static OneCustomTabsUtil_Factory create(Provider<CustomTabsIntent.Builder> provider) {
        return new OneCustomTabsUtil_Factory(provider);
    }

    public static OneCustomTabsUtil newInstance(CustomTabsIntent.Builder builder) {
        return new OneCustomTabsUtil(builder);
    }

    @Override // javax.inject.Provider
    public OneCustomTabsUtil get() {
        return newInstance((CustomTabsIntent.Builder) this.f82477a.get());
    }
}