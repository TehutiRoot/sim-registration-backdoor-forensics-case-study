package th.p047co.dtac.android.dtacone.presenter.withDevice;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.withDevice.WithDeviceSelectCampaignPresenter_Factory */
/* loaded from: classes8.dex */
public final class WithDeviceSelectCampaignPresenter_Factory implements Factory<WithDeviceSelectCampaignPresenter> {

    /* renamed from: a */
    public final Provider f86786a;

    /* renamed from: b */
    public final Provider f86787b;

    /* renamed from: c */
    public final Provider f86788c;

    public WithDeviceSelectCampaignPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86786a = provider;
        this.f86787b = provider2;
        this.f86788c = provider3;
    }

    public static WithDeviceSelectCampaignPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new WithDeviceSelectCampaignPresenter_Factory(provider, provider2, provider3);
    }

    public static WithDeviceSelectCampaignPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new WithDeviceSelectCampaignPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public WithDeviceSelectCampaignPresenter get() {
        return newInstance((RTRApiRx2) this.f86786a.get(), (Rx2ThreadService) this.f86787b.get(), (ServerErrorService) this.f86788c.get());
    }
}