package th.p047co.dtac.android.dtacone.presenter.campaign.list;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.campaign.list.CampaignListPresenter_Factory */
/* loaded from: classes8.dex */
public final class CampaignListPresenter_Factory implements Factory<CampaignListPresenter> {

    /* renamed from: a */
    public final Provider f85571a;

    /* renamed from: b */
    public final Provider f85572b;

    /* renamed from: c */
    public final Provider f85573c;

    public CampaignListPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85571a = provider;
        this.f85572b = provider2;
        this.f85573c = provider3;
    }

    public static CampaignListPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new CampaignListPresenter_Factory(provider, provider2, provider3);
    }

    public static CampaignListPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new CampaignListPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public CampaignListPresenter get() {
        return newInstance((RTRApiRx2) this.f85571a.get(), (Rx2ThreadService) this.f85572b.get(), (ServerErrorService) this.f85573c.get());
    }
}