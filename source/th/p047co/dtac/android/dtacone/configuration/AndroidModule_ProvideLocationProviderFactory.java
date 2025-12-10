package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import pl.charmas.android.reactivelocation.ReactiveLocationProvider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideLocationProviderFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideLocationProviderFactory implements Factory<ReactiveLocationProvider> {

    /* renamed from: a */
    public final AndroidModule f83075a;

    public AndroidModule_ProvideLocationProviderFactory(AndroidModule androidModule) {
        this.f83075a = androidModule;
    }

    public static AndroidModule_ProvideLocationProviderFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideLocationProviderFactory(androidModule);
    }

    public static ReactiveLocationProvider provideLocationProvider(AndroidModule androidModule) {
        return (ReactiveLocationProvider) Preconditions.checkNotNullFromProvides(androidModule.m19631n());
    }

    @Override // javax.inject.Provider
    public ReactiveLocationProvider get() {
        return provideLocationProvider(this.f83075a);
    }
}
