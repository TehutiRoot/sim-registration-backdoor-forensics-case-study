package th.p047co.dtac.android.dtacone.configuration;

import androidx.browser.customtabs.CustomTabsIntent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideCustomTabsIntentFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideCustomTabsIntentFactory implements Factory<CustomTabsIntent.Builder> {

    /* renamed from: a */
    public final AndroidModule f83070a;

    public AndroidModule_ProvideCustomTabsIntentFactory(AndroidModule androidModule) {
        this.f83070a = androidModule;
    }

    public static AndroidModule_ProvideCustomTabsIntentFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideCustomTabsIntentFactory(androidModule);
    }

    public static CustomTabsIntent.Builder provideCustomTabsIntent(AndroidModule androidModule) {
        return (CustomTabsIntent.Builder) Preconditions.checkNotNullFromProvides(androidModule.m19636i());
    }

    @Override // javax.inject.Provider
    public CustomTabsIntent.Builder get() {
        return provideCustomTabsIntent(this.f83070a);
    }
}
