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
import th.p047co.dtac.android.dtacone.repository.change_pack.ChangePackRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideChangePackRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideChangePackRepositoryFactory implements Factory<ChangePackRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83218a;

    /* renamed from: b */
    public final Provider f83219b;

    /* renamed from: c */
    public final Provider f83220c;

    /* renamed from: d */
    public final Provider f83221d;

    public SingletonRepositoryModule_ProvideChangePackRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        this.f83218a = singletonRepositoryModule;
        this.f83219b = provider;
        this.f83220c = provider2;
        this.f83221d = provider3;
    }

    public static SingletonRepositoryModule_ProvideChangePackRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        return new SingletonRepositoryModule_ProvideChangePackRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3);
    }

    public static ChangePackRepository provideChangePackRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository) {
        return (ChangePackRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideChangePackRepository(rTRApiRx2, rtrRx2Repository, configurationRepository));
    }

    @Override // javax.inject.Provider
    public ChangePackRepository get() {
        return provideChangePackRepository(this.f83218a, (RTRApiRx2) this.f83219b.get(), (RtrRx2Repository) this.f83220c.get(), (ConfigurationRepository) this.f83221d.get());
    }
}
