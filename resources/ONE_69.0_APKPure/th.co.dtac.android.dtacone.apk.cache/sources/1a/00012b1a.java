package th.p047co.dtac.android.dtacone.view.appOne.campaign.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.campaign.OneCampaignApi;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.repository.OneCampaignRepository_Factory */
/* loaded from: classes10.dex */
public final class OneCampaignRepository_Factory implements Factory<OneCampaignRepository> {

    /* renamed from: a */
    public final Provider f88966a;

    /* renamed from: b */
    public final Provider f88967b;

    /* renamed from: c */
    public final Provider f88968c;

    public OneCampaignRepository_Factory(Provider<OneCampaignApi> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        this.f88966a = provider;
        this.f88967b = provider2;
        this.f88968c = provider3;
    }

    public static OneCampaignRepository_Factory create(Provider<OneCampaignApi> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        return new OneCampaignRepository_Factory(provider, provider2, provider3);
    }

    public static OneCampaignRepository newInstance(OneCampaignApi oneCampaignApi, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository) {
        return new OneCampaignRepository(oneCampaignApi, rtrRx2Repository, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneCampaignRepository get() {
        return newInstance((OneCampaignApi) this.f88966a.get(), (RtrRx2Repository) this.f88967b.get(), (ConfigurationRepository) this.f88968c.get());
    }
}