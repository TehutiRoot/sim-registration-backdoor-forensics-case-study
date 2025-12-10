package th.p047co.dtac.android.dtacone.viewmodel.news;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.news.DynamicCampaignViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class DynamicCampaignViewModelFactory_Factory implements Factory<DynamicCampaignViewModelFactory> {

    /* renamed from: a */
    public final Provider f106919a;

    /* renamed from: b */
    public final Provider f106920b;

    /* renamed from: c */
    public final Provider f106921c;

    /* renamed from: d */
    public final Provider f106922d;

    /* renamed from: e */
    public final Provider f106923e;

    public DynamicCampaignViewModelFactory_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        this.f106919a = provider;
        this.f106920b = provider2;
        this.f106921c = provider3;
        this.f106922d = provider4;
        this.f106923e = provider5;
    }

    public static DynamicCampaignViewModelFactory_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        return new DynamicCampaignViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DynamicCampaignViewModelFactory newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new DynamicCampaignViewModelFactory(rTRApiRx2, rtrRx2Repository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public DynamicCampaignViewModelFactory get() {
        return newInstance((RTRApiRx2) this.f106919a.get(), (RtrRx2Repository) this.f106920b.get(), (ConfigurationRepository) this.f106921c.get(), (Rx2ThreadService) this.f106922d.get(), (MrtrErrorService) this.f106923e.get());
    }
}