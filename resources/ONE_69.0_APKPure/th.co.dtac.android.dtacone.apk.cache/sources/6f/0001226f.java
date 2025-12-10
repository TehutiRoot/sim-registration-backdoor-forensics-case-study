package th.p047co.dtac.android.dtacone.presenter.campaign.detail;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.campaign.detail.CampaignDetailPresenter_Factory */
/* loaded from: classes8.dex */
public final class CampaignDetailPresenter_Factory implements Factory<CampaignDetailPresenter> {

    /* renamed from: a */
    public final Provider f85533a;

    /* renamed from: b */
    public final Provider f85534b;

    /* renamed from: c */
    public final Provider f85535c;

    public CampaignDetailPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85533a = provider;
        this.f85534b = provider2;
        this.f85535c = provider3;
    }

    public static CampaignDetailPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new CampaignDetailPresenter_Factory(provider, provider2, provider3);
    }

    public static CampaignDetailPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new CampaignDetailPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public CampaignDetailPresenter get() {
        return newInstance((RTRApiRx2) this.f85533a.get(), (Rx2ThreadService) this.f85534b.get(), (ServerErrorService) this.f85535c.get());
    }
}