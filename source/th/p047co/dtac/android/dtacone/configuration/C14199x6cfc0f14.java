package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.online_activation.repository.OneOnlineActivationRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneOnlineActivationRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14199x6cfc0f14 implements Factory<OneOnlineActivationRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83330a;

    /* renamed from: b */
    public final Provider f83331b;

    /* renamed from: c */
    public final Provider f83332c;

    /* renamed from: d */
    public final Provider f83333d;

    public C14199x6cfc0f14(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        this.f83330a = singletonRepositoryModule;
        this.f83331b = provider;
        this.f83332c = provider2;
        this.f83333d = provider3;
    }

    public static C14199x6cfc0f14 create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        return new C14199x6cfc0f14(singletonRepositoryModule, provider, provider2, provider3);
    }

    public static OneOnlineActivationRepository provideOneOnlineActivationRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository) {
        return (OneOnlineActivationRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneOnlineActivationRepository(rTRApiRx2, rtrRx2Repository, configurationRepository));
    }

    @Override // javax.inject.Provider
    public OneOnlineActivationRepository get() {
        return provideOneOnlineActivationRepository(this.f83330a, (RTRApiRx2) this.f83331b.get(), (RtrRx2Repository) this.f83332c.get(), (ConfigurationRepository) this.f83333d.get());
    }
}
