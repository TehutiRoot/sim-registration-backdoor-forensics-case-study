package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.data.remote.campaign.OneCampaignApi;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.repository.home.HomeRepository;

@ScopeMetadata("th.co.dtac.android.dtacone.configuration.PerActivity")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.RepositoryModule_ProvideHomeRepositoryFactory */
/* loaded from: classes7.dex */
public final class RepositoryModule_ProvideHomeRepositoryFactory implements Factory<HomeRepository> {

    /* renamed from: a */
    public final RepositoryModule f83286a;

    /* renamed from: b */
    public final Provider f83287b;

    /* renamed from: c */
    public final Provider f83288c;

    /* renamed from: d */
    public final Provider f83289d;

    /* renamed from: e */
    public final Provider f83290e;

    /* renamed from: f */
    public final Provider f83291f;

    public RepositoryModule_ProvideHomeRepositoryFactory(RepositoryModule repositoryModule, Provider<RTRApiRx2> provider, Provider<OneCampaignApi> provider2, Provider<RtrRx2Repository> provider3, Provider<TemporaryCache> provider4, Provider<PreferencesViewModel> provider5) {
        this.f83286a = repositoryModule;
        this.f83287b = provider;
        this.f83288c = provider2;
        this.f83289d = provider3;
        this.f83290e = provider4;
        this.f83291f = provider5;
    }

    public static RepositoryModule_ProvideHomeRepositoryFactory create(RepositoryModule repositoryModule, Provider<RTRApiRx2> provider, Provider<OneCampaignApi> provider2, Provider<RtrRx2Repository> provider3, Provider<TemporaryCache> provider4, Provider<PreferencesViewModel> provider5) {
        return new RepositoryModule_ProvideHomeRepositoryFactory(repositoryModule, provider, provider2, provider3, provider4, provider5);
    }

    public static HomeRepository provideHomeRepository(RepositoryModule repositoryModule, RTRApiRx2 rTRApiRx2, OneCampaignApi oneCampaignApi, RtrRx2Repository rtrRx2Repository, TemporaryCache temporaryCache, PreferencesViewModel preferencesViewModel) {
        return (HomeRepository) Preconditions.checkNotNullFromProvides(repositoryModule.provideHomeRepository(rTRApiRx2, oneCampaignApi, rtrRx2Repository, temporaryCache, preferencesViewModel));
    }

    @Override // javax.inject.Provider
    public HomeRepository get() {
        return provideHomeRepository(this.f83286a, (RTRApiRx2) this.f83287b.get(), (OneCampaignApi) this.f83288c.get(), (RtrRx2Repository) this.f83289d.get(), (TemporaryCache) this.f83290e.get(), (PreferencesViewModel) this.f83291f.get());
    }
}