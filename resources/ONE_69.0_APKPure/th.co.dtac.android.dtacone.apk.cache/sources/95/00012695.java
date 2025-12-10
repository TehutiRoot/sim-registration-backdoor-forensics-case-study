package th.p047co.dtac.android.dtacone.util;

import androidx.browser.customtabs.CustomTabsIntent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.util.CustomTabsUtil_Factory */
/* loaded from: classes8.dex */
public final class CustomTabsUtil_Factory implements Factory<CustomTabsUtil> {

    /* renamed from: a */
    public final Provider f87047a;

    public CustomTabsUtil_Factory(Provider<CustomTabsIntent.Builder> provider) {
        this.f87047a = provider;
    }

    public static CustomTabsUtil_Factory create(Provider<CustomTabsIntent.Builder> provider) {
        return new CustomTabsUtil_Factory(provider);
    }

    public static CustomTabsUtil newInstance(CustomTabsIntent.Builder builder) {
        return new CustomTabsUtil(builder);
    }

    @Override // javax.inject.Provider
    public CustomTabsUtil get() {
        return newInstance((CustomTabsIntent.Builder) this.f87047a.get());
    }
}