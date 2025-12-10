package th.p047co.dtac.android.dtacone.presenter.campaign.history;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.campaign.history.CampaignDetailHistoryPresenter_Factory */
/* loaded from: classes8.dex */
public final class CampaignDetailHistoryPresenter_Factory implements Factory<CampaignDetailHistoryPresenter> {

    /* renamed from: a */
    public final Provider f85552a;

    /* renamed from: b */
    public final Provider f85553b;

    /* renamed from: c */
    public final Provider f85554c;

    public CampaignDetailHistoryPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85552a = provider;
        this.f85553b = provider2;
        this.f85554c = provider3;
    }

    public static CampaignDetailHistoryPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new CampaignDetailHistoryPresenter_Factory(provider, provider2, provider3);
    }

    public static CampaignDetailHistoryPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new CampaignDetailHistoryPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public CampaignDetailHistoryPresenter get() {
        return newInstance((RTRApiRx2) this.f85552a.get(), (Rx2ThreadService) this.f85553b.get(), (ServerErrorService) this.f85554c.get());
    }
}