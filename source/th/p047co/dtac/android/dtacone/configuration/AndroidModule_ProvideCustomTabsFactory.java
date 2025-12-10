package th.p047co.dtac.android.dtacone.configuration;

import androidx.browser.customtabs.CustomTabsIntent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.util.CustomTabsUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideCustomTabsFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideCustomTabsFactory implements Factory<CustomTabsUtil> {

    /* renamed from: a */
    public final AndroidModule f83068a;

    /* renamed from: b */
    public final Provider f83069b;

    public AndroidModule_ProvideCustomTabsFactory(AndroidModule androidModule, Provider<CustomTabsIntent.Builder> provider) {
        this.f83068a = androidModule;
        this.f83069b = provider;
    }

    public static AndroidModule_ProvideCustomTabsFactory create(AndroidModule androidModule, Provider<CustomTabsIntent.Builder> provider) {
        return new AndroidModule_ProvideCustomTabsFactory(androidModule, provider);
    }

    public static CustomTabsUtil provideCustomTabs(AndroidModule androidModule, CustomTabsIntent.Builder builder) {
        return (CustomTabsUtil) Preconditions.checkNotNullFromProvides(androidModule.m19637h(builder));
    }

    @Override // javax.inject.Provider
    public CustomTabsUtil get() {
        return provideCustomTabs(this.f83068a, (CustomTabsIntent.Builder) this.f83069b.get());
    }
}
