package th.p047co.dtac.android.dtacone.presenter.campaign.count;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.campaign.count.CampaignCountPresenter_Factory */
/* loaded from: classes8.dex */
public final class CampaignCountPresenter_Factory implements Factory<CampaignCountPresenter> {

    /* renamed from: a */
    public final Provider f85519a;

    /* renamed from: b */
    public final Provider f85520b;

    /* renamed from: c */
    public final Provider f85521c;

    /* renamed from: d */
    public final Provider f85522d;

    /* renamed from: e */
    public final Provider f85523e;

    public CampaignCountPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<PreferencesRepository> provider4, Provider<RtrRx2Repository> provider5) {
        this.f85519a = provider;
        this.f85520b = provider2;
        this.f85521c = provider3;
        this.f85522d = provider4;
        this.f85523e = provider5;
    }

    public static CampaignCountPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<PreferencesRepository> provider4, Provider<RtrRx2Repository> provider5) {
        return new CampaignCountPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static CampaignCountPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, PreferencesRepository preferencesRepository, RtrRx2Repository rtrRx2Repository) {
        return new CampaignCountPresenter(rTRApiRx2, rx2ThreadService, serverErrorService, preferencesRepository, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public CampaignCountPresenter get() {
        return newInstance((RTRApiRx2) this.f85519a.get(), (Rx2ThreadService) this.f85520b.get(), (ServerErrorService) this.f85521c.get(), (PreferencesRepository) this.f85522d.get(), (RtrRx2Repository) this.f85523e.get());
    }
}