package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneRectifyRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOneRectifyRepositoryFactory implements Factory<OneRectifyRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83370a;

    /* renamed from: b */
    public final Provider f83371b;

    /* renamed from: c */
    public final Provider f83372c;

    /* renamed from: d */
    public final Provider f83373d;

    public SingletonRepositoryModule_ProvideOneRectifyRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<ConfigurationRepository> provider2, Provider<PreferencesViewModel> provider3) {
        this.f83370a = singletonRepositoryModule;
        this.f83371b = provider;
        this.f83372c = provider2;
        this.f83373d = provider3;
    }

    public static SingletonRepositoryModule_ProvideOneRectifyRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<ConfigurationRepository> provider2, Provider<PreferencesViewModel> provider3) {
        return new SingletonRepositoryModule_ProvideOneRectifyRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3);
    }

    public static OneRectifyRepository provideOneRectifyRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel) {
        return (OneRectifyRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneRectifyRepository(rTRApiRx2, configurationRepository, preferencesViewModel));
    }

    @Override // javax.inject.Provider
    public OneRectifyRepository get() {
        return provideOneRectifyRepository(this.f83370a, (RTRApiRx2) this.f83371b.get(), (ConfigurationRepository) this.f83372c.get(), (PreferencesViewModel) this.f83373d.get());
    }
}
