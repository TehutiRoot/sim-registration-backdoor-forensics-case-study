package th.p047co.dtac.android.dtacone.presenter.sim_r;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.sim_r.SimRListPresenter_Factory */
/* loaded from: classes8.dex */
public final class SimRListPresenter_Factory implements Factory<SimRListPresenter> {

    /* renamed from: a */
    public final Provider f86543a;

    /* renamed from: b */
    public final Provider f86544b;

    /* renamed from: c */
    public final Provider f86545c;

    public SimRListPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86543a = provider;
        this.f86544b = provider2;
        this.f86545c = provider3;
    }

    public static SimRListPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new SimRListPresenter_Factory(provider, provider2, provider3);
    }

    public static SimRListPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new SimRListPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public SimRListPresenter get() {
        return newInstance((RTRApi) this.f86543a.get(), (RxThreadService) this.f86544b.get(), (ServerErrorService) this.f86545c.get());
    }
}