package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.oneConsentAndESign.OneConsentAndESignApi;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneConsentAndESignRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14193xd6950d5e implements Factory<OneConsentAndESignRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83293a;

    /* renamed from: b */
    public final Provider f83294b;

    public C14193xd6950d5e(SingletonRepositoryModule singletonRepositoryModule, Provider<OneConsentAndESignApi> provider) {
        this.f83293a = singletonRepositoryModule;
        this.f83294b = provider;
    }

    public static C14193xd6950d5e create(SingletonRepositoryModule singletonRepositoryModule, Provider<OneConsentAndESignApi> provider) {
        return new C14193xd6950d5e(singletonRepositoryModule, provider);
    }

    public static OneConsentAndESignRepository provideOneConsentAndESignRepository(SingletonRepositoryModule singletonRepositoryModule, OneConsentAndESignApi oneConsentAndESignApi) {
        return (OneConsentAndESignRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneConsentAndESignRepository(oneConsentAndESignApi));
    }

    @Override // javax.inject.Provider
    public OneConsentAndESignRepository get() {
        return provideOneConsentAndESignRepository(this.f83293a, (OneConsentAndESignApi) this.f83294b.get());
    }
}
