package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.campaign.OneCampaignApi;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.repository.OneCampaignRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneCampaignRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOneCampaignRepositoryFactory implements Factory<OneCampaignRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83280a;

    /* renamed from: b */
    public final Provider f83281b;

    /* renamed from: c */
    public final Provider f83282c;

    /* renamed from: d */
    public final Provider f83283d;

    public SingletonRepositoryModule_ProvideOneCampaignRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<OneCampaignApi> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        this.f83280a = singletonRepositoryModule;
        this.f83281b = provider;
        this.f83282c = provider2;
        this.f83283d = provider3;
    }

    public static SingletonRepositoryModule_ProvideOneCampaignRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<OneCampaignApi> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        return new SingletonRepositoryModule_ProvideOneCampaignRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3);
    }

    public static OneCampaignRepository provideOneCampaignRepository(SingletonRepositoryModule singletonRepositoryModule, OneCampaignApi oneCampaignApi, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository) {
        return (OneCampaignRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneCampaignRepository(oneCampaignApi, rtrRx2Repository, configurationRepository));
    }

    @Override // javax.inject.Provider
    public OneCampaignRepository get() {
        return provideOneCampaignRepository(this.f83280a, (OneCampaignApi) this.f83281b.get(), (RtrRx2Repository) this.f83282c.get(), (ConfigurationRepository) this.f83283d.get());
    }
}
