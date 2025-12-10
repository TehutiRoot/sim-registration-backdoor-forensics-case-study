package th.p047co.dtac.android.dtacone.repository.home;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.data.remote.campaign.OneCampaignApi;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.home.HomeRepository_Factory */
/* loaded from: classes8.dex */
public final class HomeRepository_Factory implements Factory<HomeRepository> {

    /* renamed from: a */
    public final Provider f86863a;

    /* renamed from: b */
    public final Provider f86864b;

    /* renamed from: c */
    public final Provider f86865c;

    /* renamed from: d */
    public final Provider f86866d;

    /* renamed from: e */
    public final Provider f86867e;

    public HomeRepository_Factory(Provider<RTRApiRx2> provider, Provider<OneCampaignApi> provider2, Provider<RtrRx2Repository> provider3, Provider<TemporaryCache> provider4, Provider<PreferencesViewModel> provider5) {
        this.f86863a = provider;
        this.f86864b = provider2;
        this.f86865c = provider3;
        this.f86866d = provider4;
        this.f86867e = provider5;
    }

    public static HomeRepository_Factory create(Provider<RTRApiRx2> provider, Provider<OneCampaignApi> provider2, Provider<RtrRx2Repository> provider3, Provider<TemporaryCache> provider4, Provider<PreferencesViewModel> provider5) {
        return new HomeRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static HomeRepository newInstance(RTRApiRx2 rTRApiRx2, OneCampaignApi oneCampaignApi, RtrRx2Repository rtrRx2Repository, TemporaryCache temporaryCache, PreferencesViewModel preferencesViewModel) {
        return new HomeRepository(rTRApiRx2, oneCampaignApi, rtrRx2Repository, temporaryCache, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public HomeRepository get() {
        return newInstance((RTRApiRx2) this.f86863a.get(), (OneCampaignApi) this.f86864b.get(), (RtrRx2Repository) this.f86865c.get(), (TemporaryCache) this.f86866d.get(), (PreferencesViewModel) this.f86867e.get());
    }
}