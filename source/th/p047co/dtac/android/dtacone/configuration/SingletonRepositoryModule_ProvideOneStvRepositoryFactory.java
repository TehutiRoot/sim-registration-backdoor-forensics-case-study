package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneStvRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOneStvRepositoryFactory implements Factory<OneStvRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83383a;

    /* renamed from: b */
    public final Provider f83384b;

    /* renamed from: c */
    public final Provider f83385c;

    /* renamed from: d */
    public final Provider f83386d;

    /* renamed from: e */
    public final Provider f83387e;

    public SingletonRepositoryModule_ProvideOneStvRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<PreferencesViewModel> provider4) {
        this.f83383a = singletonRepositoryModule;
        this.f83384b = provider;
        this.f83385c = provider2;
        this.f83386d = provider3;
        this.f83387e = provider4;
    }

    public static SingletonRepositoryModule_ProvideOneStvRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<PreferencesViewModel> provider4) {
        return new SingletonRepositoryModule_ProvideOneStvRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4);
    }

    public static OneStvRepository provideOneStvRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel) {
        return (OneStvRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneStvRepository(rTRApiRx2, rtrRx2Repository, configurationRepository, preferencesViewModel));
    }

    @Override // javax.inject.Provider
    public OneStvRepository get() {
        return provideOneStvRepository(this.f83383a, (RTRApiRx2) this.f83384b.get(), (RtrRx2Repository) this.f83385c.get(), (ConfigurationRepository) this.f83386d.get(), (PreferencesViewModel) this.f83387e.get());
    }
}
