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
/* renamed from: th.co.dtac.android.dtacone.presenter.campaign.detail.MyCampaignDetailPresenter_Factory */
/* loaded from: classes8.dex */
public final class MyCampaignDetailPresenter_Factory implements Factory<MyCampaignDetailPresenter> {

    /* renamed from: a */
    public final Provider f85543a;

    /* renamed from: b */
    public final Provider f85544b;

    /* renamed from: c */
    public final Provider f85545c;

    public MyCampaignDetailPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85543a = provider;
        this.f85544b = provider2;
        this.f85545c = provider3;
    }

    public static MyCampaignDetailPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new MyCampaignDetailPresenter_Factory(provider, provider2, provider3);
    }

    public static MyCampaignDetailPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new MyCampaignDetailPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public MyCampaignDetailPresenter get() {
        return newInstance((RTRApiRx2) this.f85543a.get(), (Rx2ThreadService) this.f85544b.get(), (ServerErrorService) this.f85545c.get());
    }
}